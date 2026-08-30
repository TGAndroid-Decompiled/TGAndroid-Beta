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
public class ProfileActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, iy, org.telegram.ui.Components.ru0, org.telegram.ui.Components.v40, org.telegram.ui.Components.jt0, ug0 {
    public int A0;
    public boolean A1;
    public TLRPC.EncryptedChat A2;
    public int A3;
    public int A4;
    public AnimatorSet A5;
    public final Drawable[] B;
    public int B0;
    public long B1;
    public TLRPC.Chat B2;
    public int B3;
    public int B4;
    public float B5;
    public Long C;
    public boolean C0;
    public float C1;
    public TL_bots.BotInfo C2;
    public int C3;
    public int C4;
    public boolean C5;
    public final org.telegram.ui.Components.j5[] D;
    public boolean D0;
    public boolean D1;
    public TLRPC.ChannelParticipant D2;
    public int D3;
    public int D4;
    public final iz0 D5;
    public final org.telegram.ui.Components.j5[] E;
    public boolean E0;
    public boolean E1;
    public TL_account.TL_password E2;
    public int E3;
    public int E4;
    public boolean E5;
    public final Drawable[] F;
    public boolean F0;
    public boolean F1;
    public TLRPC.FileLocation F2;
    public int F3;
    public boolean F4;
    public final jz0 F5;
    public final org.telegram.ui.Components.mr[] G;
    public final boolean[] G0;
    public int G1;
    public TLRPC.FileLocation G2;
    public int G3;
    public int G4;
    public float[] G5;
    public final org.telegram.ui.Components.mr[] H;
    public boolean H0;
    public boolean H1;
    public ImageLocation H2;
    public int H3;
    public int H4;
    public float H5;
    public org.telegram.ui.Components.fm0 I;
    public boolean I0;
    public boolean I1;
    public final Rect I2;
    public int I3;
    public int I4;
    public float I5;
    public UndoView J;
    public boolean J0;
    public boolean J1;
    public org.telegram.ui.Cells.o8 J2;
    public int J3;
    public int J4;
    public boolean J5;
    public h01 K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public int K3;
    public boolean K4;
    public b01 K5;
    public sz0 L;
    public ImageView L0;
    public boolean L1;
    public int L2;
    public int L3;
    public boolean L4;
    public float L5;
    public org.telegram.ui.Components.zw0 M;
    public org.telegram.ui.ActionBar.w0 M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public float M5;
    public boolean N;
    public org.telegram.ui.ActionBar.w0 N0;
    public float N1;
    public int N2;
    public int N3;
    public final ArrayList N4;
    public MessagesController.PeerColor N5;
    public org.telegram.ui.Components.qu0 O;
    public org.telegram.ui.ActionBar.w0 O0;
    public float O1;
    public int O2;
    public int O3;
    public final ArrayList O4;
    public final SparseIntArray O5;
    public boolean P;
    public org.telegram.ui.ActionBar.w0 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public int P5;
    public org.telegram.ui.Components.jw0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public int Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public AnimatorSet Q5;
    public gw0 R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public int R5;
    public org.telegram.ui.Components.gj0 S;
    public org.telegram.ui.ActionBar.g1 S0;
    public ValueAnimator S1;
    public int S2;
    public int S3;
    public bz0 S4;
    public int S5;
    public org.telegram.ui.Components.gj0 T;
    public org.telegram.ui.ActionBar.g1 T0;
    public boolean T1;
    public int T2;
    public int T3;
    public View T4;
    public boolean T5;
    public org.telegram.ui.Components.k40 U;
    public org.telegram.ui.ActionBar.g1 U0;
    public FlagSecureReason U1;
    public int U2;
    public int U3;
    public int U4;
    public boolean U5;
    public l0 V;
    public ImageView V0;
    public final HashMap V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public ah.d W;
    public org.telegram.ui.ActionBar.g1 W0;
    public float W1;
    public int W2;
    public int W3;
    public int W4;
    public float W5;
    public org.telegram.ui.Components.jh0 X;
    public org.telegram.ui.Components.h8 X0;
    public float X1;
    public int X2;
    public int X3;
    public long X4;
    public float X5;
    public MessagesController.SavedMusicList Y;
    public float Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public s01 Y5;
    public org.telegram.ui.Components.ci0 Z;
    public int Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public boolean Z4;
    public y01 Z5;
    public my0 f32028a;
    public org.telegram.ui.Cells.o f32029a0;
    public u01 f32030a1;
    public float a2;
    public int f32031a3;
    public int f32032a4;
    public String f32033a5;
    public ph.f3 f32034a6;
    public org.telegram.ui.Components.sl0 f32035b;
    public wy0 f32036b0;
    public long f32037b1;
    public float f32038b2;
    public int f32039b3;
    public int f32040b4;
    public String f32041b5;
    public int f32042b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public oy0 f32043c;
    public AnimatorSet f32044c0;
    public long f32045c1;
    public float f32046c2;
    public int c3;
    public int f32047c4;
    public String f32048c5;
    public Boolean f32049c6;
    public g01 d;
    public org.telegram.ui.Cells.y3 f32050d0;
    public long f32051d1;
    public float f32052d2;
    public int f32053d3;
    public int f32054d4;
    public org.telegram.ui.Components.rg f32055d5;
    public TLRPC.TL_emojiStatusCollectible f32056d6;
    public r01 e;
    public ImageView f32057e0;
    public boolean f32058e1;
    public float f32059e2;
    public int f32060e3;
    public int f32061e4;
    public final HashSet f32062e5;
    public int e6;
    public final org.telegram.ui.ActionBar.k5[] f32063f;
    public ImageView f32064f0;
    public long f32065f1;
    public float f32066f2;
    public int f32067f3;
    public int f32068f4;
    public CharacterStyle f32069f5;
    public boolean f32070f6;
    public ImageView f32071g0;
    public boolean f32072g1;
    public ValueAnimator f32073g2;
    public int f32074g3;
    public int f32075g4;
    public final org.telegram.ui.Cells.c2 f32076g5;
    public int f32077g6;
    public String h;
    public ImageView f32078h0;
    public boolean f32079h1;
    public float f32080h2;
    public int f32081h3;
    public int f32082h4;
    public final hz0 f32083h5;
    public int f32084h6;
    public org.telegram.ui.Components.x11 f32085i0;
    public boolean f32086i1;
    public float f32087i2;
    public int f32088i3;
    public int f32089i4;
    public boolean f32090i5;
    public int f32091i6;
    public org.telegram.ui.Components.mh0 f32092j0;
    public long f32093j1;
    public final float[] f32094j2;
    public int f32095j3;
    public int f32096j4;
    public qz0 f32097j5;
    public final ng.e f32098j6;
    public xy0 f32099k0;
    public boolean f32100k1;
    public boolean f32101k2;
    public int f32102k3;
    public int f32103k4;
    public float f32104k5;
    public final sg.d f32105k6;
    public j01 f32106l0;
    public boolean l1;
    public boolean f32107l2;
    public int f32108l3;
    public int f32109l4;
    public float f32110l5;
    public final ng.a f32111l6;
    public org.telegram.ui.Components.z8 m0;
    public boolean f32112m1;
    public boolean f32113m2;
    public int f32114m3;
    public int f32115m4;
    public boolean f32116m5;
    public final sg.b f32117m6;
    public String f32118n;
    public org.telegram.ui.Components.w40 f32119n0;
    public boolean f32120n1;
    public final Paint f32121n2;
    public int f32122n3;
    public int f32123n4;
    public boolean f32124n5;
    public final ng.a f32125n6;
    public int f32126o0;
    public boolean f32127o1;
    public boolean f32128o2;
    public int f32129o3;
    public int f32130o4;
    public ImageReceiver f32131o5;
    public ug.i f32132o6;
    public org.telegram.ui.Components.x11 f32133p0;
    public boolean f32134p1;
    public rh.r0 f32135p2;
    public int f32136p3;
    public int f32137p4;
    public FrameLayout f32138p5;
    public ay0 f32139p6;
    public org.telegram.ui.Components.zh0 f32140q0;
    public boolean f32141q1;
    public rh.q f32142q2;
    public int f32143q3;
    public int f32144q4;
    public FrameLayout[] f32145q5;
    public final ArrayList f32146q6;
    public final org.telegram.ui.ActionBar.k5[] f32147r;
    public zy0 f32148r0;
    public int f32149r1;
    public TLRPC.ChatFull f32150r2;
    public int f32151r3;
    public int f32152r4;
    public SpannableStringBuilder f32153r5;
    public final RectF f32154r6;
    public org.telegram.ui.Components.io0 f32155s;
    public lh.u0 f32156s0;
    public boolean f32157s1;
    public TLRPC.UserFull f32158s2;
    public int f32159s3;
    public int f32160s4;
    public SpannableStringBuilder f32161s5;
    public final RectF s6;
    public View f32162t0;
    public boolean f32163t1;
    public org.telegram.ui.Cells.f6 f32164t2;
    public int f32165t3;
    public int f32166t4;
    public ph.d[] f32167t5;
    public final org.telegram.ui.Components.i50 f32168u0;
    public boolean f32169u1;
    public boolean f32170u2;
    public int f32171u3;
    public int f32172u4;
    public org.telegram.messenger.w8 f32173u5;
    public org.telegram.ui.Components.jj0 v;
    public final Paint f32174v0;
    public int f32175v1;
    public v01 f32176v2;
    public int f32177v3;
    public int f32178v4;
    public FrameLayout f32179v5;
    public AnimatorSet f32180w;
    public org.telegram.ui.ActionBar.f6 f32181w0;
    public boolean f32182w1;
    public CharSequence f32183w2;
    public int f32184w3;
    public int f32185w4;
    public ph.d f32186w5;
    public Drawable f32187x;
    public int f32188x0;
    public boolean f32189x1;
    public long f32190x2;
    public int f32191x3;
    public int f32192x4;
    public final xd.a f32193x5;
    public final Drawable[] f32194y;
    public ImageLocation f32195y0;
    public boolean f32196y1;
    public int f32197y2;
    public int f32198y3;
    public int f32199y4;
    public dz0 f32200y5;
    public int f32201z0;
    public a0.h f32202z1;
    public ArrayList f32203z2;
    public int f32204z3;
    public int z4;
    public AnimatorSet f32205z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f10;
        RectF rectF = profileActivity.s6;
        ng.e eVar = profileActivity.f32098j6;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f32091i6) - AndroidUtilities.dp(8.0f);
            profileActivity.f32154r6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(2, profileActivity.f32146q6);
            eVar.e(profileActivity.f32139p6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.yu0.w0(profileActivity.L.getClosestTab());
        if (i10 == profileActivity.e6 && w02 == profileActivity.f32070f6) {
            return;
        }
        profileActivity.e6 = i10;
        profileActivity.f32070f6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f32167t5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f32167t5[0].g(profileActivity.f32161s5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f32167t5[0].g(profileActivity.f32153r5, true, true);
        } else {
            profileActivity.f32167t5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        z00 z00Var = new z00(9);
        z00Var.f40624n = str;
        if (z00Var.f40622c != null) {
            z00Var.f40622c = null;
            z00Var.a();
        }
        z00Var.f40623f = i10;
        spannableStringBuilder.setSpan(z00Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z4) {
        float f10;
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32147r;
        if (z4) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.S1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.S1.cancel();
        }
        lh.u0 u0Var = profileActivity.f32156s0;
        if (u0Var != null) {
            u0Var.setActive(!z4);
        }
        float f11 = profileActivity.R1;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.N1;
        profileActivity.f32035b.setTranslationY(f12);
        profileActivity.f32035b.setVisibility(0);
        profileActivity.R0.setVisibility(0);
        profileActivity.f32028a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.V.setVisibility(0);
        profileActivity.f32063f[1].setVisibility(0);
        k5VarArr[1].setVisibility(0);
        k5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.R1 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.v(z10);
        int i11 = 8;
        if (profileActivity.R1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        if (w0Var != null) {
            w0Var.setVisibility(i10);
        }
        profileActivity.R0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.R0.getSearchContainer();
        if (profileActivity.R1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f32035b.setEmptyView(profileActivity.M);
        profileActivity.V.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f12, z4);
            }
        });
        ofFloat.addListener(new kz0(profileActivity, z4, 0));
        if (!z4) {
            profileActivity.R4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.M.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        profileActivity.S1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z4) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        d2Var.f19590d0 = false;
        d2Var.show();
        Utilities.globalQueue.postRunnable(new vq0(d2Var, z4, activity, 2));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb) {
        String[] supportedTypes;
        ArrayList arrayList;
        if (Build.VERSION.SDK_INT >= 23) {
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
                    sb.append("\n");
                    sb.append(arrayList2.size());
                    sb.append("+");
                    sb.append(arrayList3.size());
                    sb.append(" ");
                    sb.append(str.substring(6));
                    sb.append(" codecs:\n");
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            sb.append("\n");
                        }
                        MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
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
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        if (i13 > 0 || !arrayList2.isEmpty()) {
                            sb.append("\n");
                        }
                        MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
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
    }

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            af.g.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        eg.e2 e2Var = new eg.e2(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f32181w0);
        k5Var.getLocationOnScreen(new int[2]);
        e2Var.f5275s0 = k5Var.f20389e0;
        e2Var.f5276t0 = k5Var.f20391f0;
        e2Var.f5279w0 = k5Var.getScaleX();
        e2Var.f5277u0 = k5Var.getLeft();
        e2Var.f5278v0 = k5Var.getTop();
        e2Var.f5280x0 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
        if (rightDrawable == j5Var && j5Var != null) {
            Drawable drawable = j5Var.f25875f[0];
            if (drawable instanceof org.telegram.ui.Components.l5) {
                e2Var.f5279w0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.l5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f);
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
                    p9Var.setLayerNum(7);
                    p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    p9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.l5) j5VarArr[1].f25875f[0]).c()) {
                        p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, profileActivity.f32181w0), PorterDuff.Mode.SRC_IN));
                        e2Var.f5282z0 = MessageObject.getInputStickerSet(document);
                    } else {
                        e2Var.f5282z0 = MessageObject.getInputStickerSet(document);
                    }
                    e2Var.f5281y0 = p9Var;
                    e2Var.B0 = true;
                }
            }
        }
        profileActivity.showDialog(e2Var);
    }

    public static void V(ProfileActivity profileActivity) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32147r;
        my0 my0Var = profileActivity.f32028a;
        if (my0Var != null) {
            int childCount = my0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f32028a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                }
            }
            profileActivity.f32028a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, profileActivity.f32181w0));
        }
        if (!profileActivity.f32113m2) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
            if (k5Var != null) {
                Object tag = k5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        k5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(((Integer) tag).intValue(), profileActivity.f32181w0), Boolean.valueOf(profileActivity.G0[0])));
                    } else {
                        k5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, profileActivity.f32181w0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f32187x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.N5 != null) {
                    v03 = -1;
                } else {
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20127pc, profileActivity.f32181w0);
                }
                drawable.setColorFilter(v03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.fm0 fm0Var = profileActivity.I;
            if (fm0Var != null) {
                fm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19980h8, profileActivity.f32181w0));
            }
            org.telegram.ui.ActionBar.k5 k5Var2 = profileActivity.f32063f[1];
            if (k5Var2 != null) {
                k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20236vh, profileActivity.f32181w0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                if (profileActivity.N5 == null) {
                    i12 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, profileActivity.f32181w0);
                }
                kVar.C(i12, false);
                org.telegram.ui.ActionBar.k kVar2 = profileActivity.actionBar;
                if (profileActivity.N5 != null) {
                    v02 = 553648127;
                } else {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19944f8, profileActivity.f32181w0);
                }
                kVar2.B(v02, false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z4;
        float f10;
        float min = Math.min(profileActivity.Z1, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f32120n1) {
            profileActivity.f32140q0.setAlpha(1.0f - min);
            profileActivity.f32140q0.setBlurIntensity(0.0f);
            profileActivity.f32140q0.setGooeyEnabled(false);
        } else {
            profileActivity.f32140q0.setPullProgress(profileActivity.Z1);
            profileActivity.f32140q0.setBlurIntensity(Math.min((k7.n.a(profileActivity.Z1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.zh0 zh0Var = profileActivity.f32140q0;
            float f11 = profileActivity.Z1;
            if (f11 > 0.0f && f11 < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            zh0Var.setGooeyEnabled(z4);
        }
        zy0 zy0Var = profileActivity.f32148r0;
        if (zy0Var != null && profileActivity.G1 != 2) {
            float f12 = profileActivity.Z1;
            if (f12 > 0.0f) {
                f10 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f12, 0.0f, 0.5f));
            } else {
                f10 = 1.0f;
            }
            zy0Var.setAlpha(f10);
        }
        org.telegram.ui.Components.zh0 zh0Var2 = profileActivity.f32140q0;
        if (profileActivity.Z1 >= 1.0f) {
            i10 = 8;
        }
        zh0Var2.setVisibility(i10);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.S.K(0);
        profileActivity.T.K(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ic Q = org.telegram.ui.Components.qc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f25672j = 5000;
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
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f19503a);
                return;
            }
            return;
        }
        kh.a2.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f10, float f11) {
        switch (i10) {
            case 0:
                boolean z4 = profileActivity.f32120n1;
                if (z4) {
                    if (z4) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f32037b1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f32045c1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f32045c1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f32045c1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new xn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f32045c1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new xn(bundle2), false);
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
                profileActivity.r4(profileActivity.X, f10, f11, true);
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
                k31.K(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(profileActivity.getParentActivity(), 3, profileActivity.f32181w0);
                d2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new nh.z1(7, profileActivity, d2Var), true, profileActivity.f32181w0);
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
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(profileActivity, profileActivity.X);
                    H.f27492w = false;
                    H.f27471i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new ob0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new el0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ob0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f10 - AndroidUtilities.dp(8.0f), profileActivity.X.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new o81(null));
                return;
            default:
                return;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_error tL_error) {
        boolean z10;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + profileActivity.f32065f1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.B2) && !profileActivity.B2.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = org.telegram.ui.Components.h80.f25349r;
        org.telegram.ui.Components.h80.w(parentActivity, profileActivity, org.telegram.ui.Components.qc.a0(profileActivity), z10);
        if (!z4 || profileActivity.I4 != -1) {
            profileActivity.j5();
            g01 g01Var = profileActivity.d;
            if (g01Var != null) {
                g01Var.l();
            }
        }
        if (p2Var instanceof xn) {
            ((xn) p2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f10;
        org.telegram.ui.Components.ic h;
        if (profileActivity.G2 == null) {
            if (profileActivity.f32120n1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f32045c1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f19236id == profileActivity.f32051d1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f10 = org.telegram.ui.Components.l5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.qc.a0(profileActivity).h(f10, 1, new hy0(profileActivity, 0))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.K3()) {
                profileActivity.w4(false);
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f10, float f11) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        g01 g01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f32028a.B0();
        if (i10 == profileActivity.P3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1));
            TLRPC.UserFull userFull = profileActivity.f32158s2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                lh.b0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f32037b1, new iu(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new rh.k(profileActivity.f32037b1));
            }
        } else if (i10 == profileActivity.N3) {
            boolean z4 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f32051d1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f32051d1, z4);
            org.telegram.ui.Components.qc.A(profileActivity, z4, null).j();
            profileActivity.a5();
            int i11 = profileActivity.N3;
            if (i11 < 0 || (g01Var = profileActivity.d) == null) {
                return;
            }
            g01Var.m(i11);
        } else if (i10 == profileActivity.W3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f19331id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f32033a5);
            bundle.putString("first_name_card", profileActivity.f32041b5);
            bundle.putString("last_name_card", profileActivity.f32048c5);
            ns nsVar = new ns(bundle, profileActivity.f32181w0);
            nsVar.L = new qx0(profileActivity, user3);
            profileActivity.presentFragment(nsVar);
        } else if (i10 == profileActivity.T3) {
            TextView textView = (TextView) org.telegram.ui.Components.z4.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new hy0(profileActivity, 1), profileActivity.f32181w0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
        } else if (i10 == profileActivity.U3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32181w0);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.X4));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.f32181w0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], k7.b6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new q20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new tl0(13, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new al0(5));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
        } else if (i10 == profileActivity.f32130o4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f32065f1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.p2(bundle2));
        } else if (i10 == profileActivity.f32123n4) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.V(profileActivity.getParentActivity(), profileActivity.A2, profileActivity.f32181w0).f19503a);
        } else if (i10 == profileActivity.K3) {
            profileActivity.r4(view, f10, f11, false);
        } else if (i10 == profileActivity.H4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f32037b1);
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.X3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.R3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.S3) {
            k31.K(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f32152r4 && i10 < profileActivity.f32160s4) {
            if (!profileActivity.f32203z2.isEmpty()) {
                chatParticipant = profileActivity.f32150r2.participants.participants.get(((Integer) profileActivity.f32203z2.get(i10 - profileActivity.f32152r4)).intValue());
            } else {
                chatParticipant = profileActivity.f32150r2.participants.participants.get(i10 - profileActivity.f32152r4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f32166t4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.I3) {
            profileActivity.C4(f10, f11, i10, view);
        } else if (i10 == profileActivity.f32089i4) {
            if (profileActivity.B2 != null) {
                profileActivity.showDialog(new sh.i0(profileActivity, profileActivity.B2.linked_community_id, null, null));
            } else if (profileActivity.f32037b1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1))) == null) {
            } else {
                profileActivity.showDialog(new sh.i0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.F3) {
            if (profileActivity.f32150r2.location instanceof TLRPC.TL_channelLocation) {
                ad0 ad0Var = new ad0(5);
                ad0Var.f32524b0 = -profileActivity.f32045c1;
                ad0Var.f32550w0 = (TLRPC.TL_channelLocation) profileActivity.f32150r2.location;
                profileActivity.presentFragment(ad0Var);
            }
        } else if (i10 == profileActivity.I4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f32172u4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f32045c1);
            bundle3.putInt("type", 2);
            pr prVar = new pr(bundle3);
            prVar.x0(profileActivity.f32150r2);
            profileActivity.presentFragment(prVar);
        } else if (i10 == profileActivity.f32178v4) {
            profileActivity.presentFragment(new qh0(profileActivity.f32045c1));
        } else if (i10 == profileActivity.f32185w4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f32045c1);
            bundle4.putInt("type", 1);
            pr prVar2 = new pr(bundle4);
            prVar2.x0(profileActivity.f32150r2);
            profileActivity.presentFragment(prVar2);
        } else if (i10 == profileActivity.f32192x4) {
            profileActivity.P0.performClick();
        } else if (i10 == profileActivity.f32199y4) {
            profileActivity.presentFragment(new lh.q(0, profileActivity.f32037b1));
        } else if (i10 == profileActivity.z4) {
            profileActivity.presentFragment(new lh.q(1, profileActivity.f32037b1));
        } else if (i10 == profileActivity.A4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f32045c1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new ga1(bundle5));
        } else if (i10 == profileActivity.D4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f32045c1);
            bundle6.putInt("type", 0);
            pr prVar3 = new pr(bundle6);
            prVar3.x0(profileActivity.f32150r2);
            profileActivity.presentFragment(prVar3);
        } else if (i10 == profileActivity.c3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f32060e3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.E2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f32067f3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f32074g3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f32081h3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f32095j3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f32088i3) {
            profileActivity.presentFragment(new ec0());
        } else if (i10 == profileActivity.f32102k3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f32122n3) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.U(profileActivity, profileActivity.f32181w0));
        } else if (i10 == profileActivity.f32129o3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f32136p3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f32159s3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f32165t3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f32171u3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.f32177v3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32181w0);
            alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new px0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f19503a);
        } else if (i10 == profileActivity.f32053d3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new pa(null));
        } else if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.Q2) {
            profileActivity.presentFragment(new i(3));
        } else if (i10 == profileActivity.L2) {
            profileActivity.u4();
        } else if (i10 == profileActivity.Z3) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f32032a4) {
            profileActivity.presentFragment(new lh.ja());
        } else if (i10 == profileActivity.f32040b4) {
            profileActivity.presentFragment(new qh.g());
        } else if (i10 == profileActivity.f32047c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f32054d4) {
            gg.v2.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            rh.r0 r0Var = profileActivity.f32135p2;
            if (r0Var != null) {
                r0Var.m(!r0Var.g(), new zq0(23, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            rh.q qVar = profileActivity.f32142q2;
            if (qVar != null) {
                qVar.f43668f = true;
                qVar.e = !qVar.e;
                qVar.k();
                ((org.telegram.ui.Cells.o8) view).setChecked(profileActivity.f32142q2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.setChecked(!o8Var.b());
            if (profileActivity.f32109l4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f32109l4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f32037b1);
            boolean b10 = o8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f32158s2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new sb0(15, profileActivity, r0));
            profileActivity.f32109l4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.L3) {
            profileActivity.K4 = !profileActivity.K4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.L3);
            int i12 = profileActivity.R5;
            if (i12 >= 0) {
                profileActivity.f32043c.h1(i12, profileActivity.S5 - profileActivity.f32028a.getPaddingTop());
            }
        } else if (i10 == profileActivity.M3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.N2) {
            if (profileActivity.f32158s2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f32158s2.personal_channel_id);
            profileActivity.presentFragment(new xn(bundle7));
        } else if (i10 == profileActivity.R2) {
            y01 y01Var = profileActivity.Z5;
            if ((y01Var == null || !y01Var.a()) && !profileActivity.J3(i10, view)) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (y8Var.d.getDrawable() != null) {
                    profileActivity.t4(y8Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.E3) {
            profileActivity.I3(i10, view);
        } else {
            profileActivity.C4(f10, f11, i10, view);
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f32037b1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.X4);
        tL_messages_reportReaction.f19290id = profileActivity.W4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new nh.p5(4));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.X4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1)));
        }
        profileActivity.W4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.qc.a0(profileActivity).E(profileActivity.f32181w0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.F2 = fileLocation;
            profileActivity.G2 = photoSize2.location;
            profileActivity.f32036b0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.m0, null);
            if (profileActivity.L2 != -1) {
                profileActivity.j5();
                g01 g01Var = profileActivity.d;
                if (g01Var != null) {
                    g01Var.l();
                }
                profileActivity.k4(true);
            }
            xy0 xy0Var = profileActivity.f32099k0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.G2);
            profileActivity.H2 = forLocal;
            xy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.F2));
            profileActivity.P4(true, false);
        } else if (profileActivity.F2 == null) {
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
            profileActivity.P5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new sb0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f32037b1;
        if (j10 == 0) {
            long j11 = profileActivity.f32045c1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f32065f1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.X4, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.X4, j12, profileActivity.W4);
        }
        profileActivity.W4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(profileActivity.getParentActivity(), profileActivity.f32181w0);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.f28100b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.qc.a0(profileActivity).b(qbVar, 1500).j();
    }

    public static void f0(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z4;
        TLRPC.Document document;
        if (profileActivity.Y == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.Y = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.Y = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f32158s2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.Y.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.Y && MediaController.getInstance().isPlayingMessage(profileActivity.Y.list.get(0))) {
                z4 = true;
            } else {
                MediaController.getInstance().cleanup();
                z4 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.Y;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.Y.list);
            if (!z4) {
                MediaController.getInstance().playMessage(profileActivity.Y.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.c8(profileActivity.getParentActivity(), profileActivity.f32181w0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ac0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new ob0(profileActivity, 18), profileActivity.f32181w0);
    }

    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z4;
        LinearLayout linearLayout;
        int i10;
        int v02;
        boolean z10;
        long j10;
        char c3;
        final LimitPreviewView limitPreviewView;
        float f10;
        float f11;
        float f12;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f32158s2;
        if (userFull != null && userFull.stars_rating != null) {
            ?? r52 = 0;
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(profileActivity.getParentActivity(), null, false, false);
            g3Var.fixNavigationBar();
            runnable = g3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f32181w0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z4 = true;
            } else {
                z4 = false;
            }
            limitPreviewView2.setHideNegativeValues(z4);
            limitPreviewView2.setStarRating(userFull.stars_rating);
            limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView2, k7.b6.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, k7.b6.t(-1, -2, 17, 40, -12, 40, 20));
                TextView[] textViewArr = new org.telegram.ui.Components.e90[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    eg.b2 b2Var = new eg.b2(parentActivity, 5, r52);
                    textViewArr[i11] = b2Var;
                    b2Var.setGravity(17);
                    textViewArr[i11].setTextSize(1, 12.0f);
                    textViewArr[i11].setTextColor(org.telegram.ui.ActionBar.j6.w0(r52, org.telegram.ui.ActionBar.j6.f20281y6, false));
                    textViewArr[i11].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(r52, org.telegram.ui.ActionBar.j6.f19966gc, false));
                    frameLayout.addView(textViewArr[i11], k7.b6.e(-1, -1, 119));
                    TextView textView = textViewArr[i11];
                    if (i11 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    textView.setAlpha(f10);
                    TextView textView2 = textViewArr[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView2.setScaleX(f11);
                    TextView textView3 = textViewArr[i11];
                    if (i11 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.8f;
                    }
                    textView3.setScaleY(f12);
                    i11++;
                    r52 = 0;
                }
                final w3 w3Var = new w3(textViewArr, 17);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                linearLayout = linearLayout2;
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
                if ((j14 < 0 && !z10) || (z10 && j12 > 0)) {
                    boolean z11 = z10;
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                    if (z11) {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                    }
                    limitPreviewView = limitPreviewView2;
                    c3 = 0;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    c3 = 0;
                    spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", max), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j15)));
                    spannableStringBuilder.append((CharSequence) " ");
                    limitPreviewView = limitPreviewView2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    w3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    w3Var.run(Boolean.FALSE);
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
                                    w3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    w3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
                String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[c3] = formatPluralStringComma;
                charSequenceArr[1] = "\n";
                charSequenceArr[2] = formatPluralStringComma2;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                w3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                w3Var.run(Boolean.FALSE);
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
                                w3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                w3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            } else {
                linearLayout = linearLayout2;
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            textView4.setText(LocaleController.getString(R.string.StarRatingTitle));
            textView4.setTextSize(1, 20.0f);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f32181w0));
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView4, k7.b6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f19332id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.y3.q(R.string.StarRatingSelfDescription, textView5);
                i10 = 1;
            } else {
                i10 = 1;
                b.o(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i10, 14.0f);
            textView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f32181w0));
            linearLayout3.addView(textView5, k7.b6.t(-1, -2, 17, 20, 0, 20, 12));
            zv0 zv0Var = new zv0(parentActivity, profileActivity.f32181w0);
            zv0Var.f40867a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i14 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i15 = org.telegram.ui.ActionBar.j6.Oh;
            zv0Var.f40868b.setText(LocaleController.formatSpannable(i14, G3(org.telegram.ui.ActionBar.j6.v0(i15, profileActivity.f32181w0), string)));
            zv0Var.d.setVisibility(8);
            int i16 = R.drawable.menu_gift;
            ImageView imageView = zv0Var.f40869c;
            imageView.setImageResource(i16);
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f32181w0));
            linearLayout3.addView(zv0Var, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            zv0 zv0Var2 = new zv0(parentActivity, profileActivity.f32181w0);
            zv0Var2.f40867a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            zv0Var2.f40868b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.j6.v0(i15, profileActivity.f32181w0), LocaleController.getString(R.string.StarRatingAdded))));
            zv0Var2.d.setVisibility(8);
            int i17 = R.drawable.menu_stars_gift;
            ImageView imageView2 = zv0Var2.f40869c;
            imageView2.setImageResource(i17);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f32181w0));
            linearLayout3.addView(zv0Var2, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            zv0 zv0Var3 = new zv0(parentActivity, profileActivity.f32181w0);
            zv0Var3.f40867a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i18 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                v02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20067m6, profileActivity.f32181w0), -16777216);
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, profileActivity.f32181w0);
            }
            zv0Var3.f40868b.setText(LocaleController.formatSpannable(i18, G3(v02, string2)));
            zv0Var3.d.setVisibility(8);
            int i19 = R.drawable.menu_refund;
            ImageView imageView3 = zv0Var3.f40869c;
            imageView3.setImageResource(i19);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f32181w0));
            linearLayout3.addView(zv0Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ph.d dVar = new ph.d(parentActivity, profileActivity.f32181w0, true);
            dVar.setOnClickListener(new gy0(0, runnable));
            dVar.g(lh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, k7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            g3Var.customView = linearLayout3;
            g3Var.show();
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.W3 >= 0) {
            if (profileActivity.G4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.G4 == -1) {
            if (!profileActivity.f32101k2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f32028a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f32028a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    g01 g01Var = profileActivity.d;
                    if (i12 >= g01Var.e.K2) {
                        break;
                    }
                    f2.l1 g10 = g01Var.g(null, g01Var.j(i12));
                    View view = g10.f5785a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                my0 my0Var = profileActivity.f32028a;
                my0Var.setPadding(0, my0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f32028a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f32073g2.cancel();
                float[] fArr = profileActivity.f32094j2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.N1 = profileActivity.T3();
            }
        }
        profileActivity.J.m(profileActivity.f32065f1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            rh.e3.G0(context, profileActivity.currentAccount, profileActivity.f32158s2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f32181w0, false);
        } else {
            rh.e3.H0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f32181w0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32147r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.R1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.Q1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.f32035b.setTranslationY(floatValue * f10);
        profileActivity.M.setTranslationY(f10 * profileActivity.R1);
        profileActivity.f32028a.setTranslationY((1.0f - profileActivity.R1) * f13);
        profileActivity.f32028a.setScaleX(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.f32028a.setScaleY(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.f32028a.setAlpha(profileActivity.R1);
        boolean z10 = true;
        profileActivity.k4(true);
        profileActivity.f32028a.setAlpha(f11);
        profileActivity.f32035b.setAlpha(1.0f - profileActivity.R1);
        profileActivity.f32035b.setScaleX((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.f32035b.setScaleY((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.M.setAlpha(1.0f - f11);
        profileActivity.V.setAlpha(f11);
        profileActivity.f32036b0.setAlpha(f11);
        zy0 zy0Var = profileActivity.f32148r0;
        if (zy0Var != null) {
            zy0Var.setAlpha(f11);
        }
        profileActivity.f32063f[1].setAlpha(f11);
        k5VarArr[1].setAlpha(f11);
        k5VarArr[3].setAlpha(f11);
        profileActivity.R0.getSearchField().setAlpha(f12);
        if (z4 && profileActivity.R1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
            if (w0Var.C.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
            }
        }
        FrameLayout searchContainer = profileActivity.R0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.R1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.R1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.Q0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i11);
            profileActivity.Q0.setAlpha(f11);
        }
        profileActivity.R0.setVisibility(i11);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.R1 >= 0.5f) {
            z10 = false;
        }
        kVar.v(z10);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.Q0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f11);
        }
        profileActivity.R0.setAlpha(f11);
        profileActivity.f32030a1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        org.telegram.ui.Components.f01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z4, z10, profileActivity.f32181w0);
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
        boolean z4;
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19208id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.F2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.F2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(profileActivity.F2.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(profileActivity.F2.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.G2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.G2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f19331id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f32037b1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f32101k2 && profileActivity.f32036b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z4 = true;
        } else {
            z4 = false;
        }
        profileActivity.f32107l2 = z4;
        profileActivity.F2 = null;
        profileActivity.G2 = null;
        xy0 xy0Var = profileActivity.f32099k0;
        xy0Var.E0 = true;
        xy0Var.H0 = profileActivity.H2;
        xy0Var.f29483n1 = null;
        xy0Var.f29484o1 = null;
        xy0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z4) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32063f;
        org.telegram.ui.ActionBar.k5[] k5VarArr2 = profileActivity.f32147r;
        int i12 = 0;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f32028a.setVisibility(i10);
        org.telegram.ui.Components.sl0 sl0Var = profileActivity.f32035b;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        sl0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.R0.getSearchContainer();
        if (!z4) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        lh.u0 u0Var = profileActivity.f32156s0;
        if (u0Var != null) {
            u0Var.setActive(!z4);
        }
        profileActivity.actionBar.v(z4);
        profileActivity.V.setVisibility(i10);
        zy0 zy0Var = profileActivity.f32148r0;
        if (zy0Var != null) {
            zy0Var.setVisibility(i10);
        }
        k5VarArr[1].setVisibility(i10);
        k5VarArr2[1].setVisibility(i10);
        k5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.Q0.setVisibility(i10);
        }
        profileActivity.R0.setVisibility(i10);
        profileActivity.f32036b0.setAlpha(1.0f);
        profileActivity.V.setAlpha(1.0f);
        zy0 zy0Var2 = profileActivity.f32148r0;
        if (zy0Var2 != null) {
            zy0Var2.setAlpha(1.0f);
        }
        lh.u0 u0Var2 = profileActivity.f32156s0;
        if (u0Var2 != null) {
            u0Var2.setAlpha(1.0f);
        }
        k5VarArr[1].setAlpha(1.0f);
        k5VarArr2[1].setAlpha(1.0f);
        profileActivity.R0.setAlpha(1.0f);
        profileActivity.f32028a.setAlpha(1.0f);
        profileActivity.f32035b.setAlpha(1.0f);
        profileActivity.M.setAlpha(1.0f);
        if (z4) {
            profileActivity.f32035b.setEmptyView(profileActivity.M);
        } else {
            profileActivity.M.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z4) {
        Drawable drawable = profileActivity.f32036b0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.s61) {
            profileActivity.f32036b0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.y5) {
            org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
            profileActivity.f32036b0.u(null, null, y5Var);
            if (z4) {
                y5Var.f(profileActivity.f32036b0);
            }
        } else {
            ImageLocation D = profileActivity.f32099k0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f32036b0.u(D, str, drawable);
        }
    }

    public final void A3() {
        f2.l1 l1Var;
        View view;
        int top;
        int i10;
        boolean z4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float dp;
        float f19;
        float dp2;
        float f20;
        float f21;
        float f22;
        if (this.f32028a.getVisibility() == 0) {
            if (this.N) {
                this.L.setVisibleHeight(this.f32028a.getMeasuredHeight() - this.L.getTop());
            }
            if (this.f32028a.getChildCount() > 0 && !this.D1) {
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    l1Var = null;
                    if (i11 < this.f32028a.getChildCount()) {
                        if (RecyclerView.R(this.f32028a.getChildAt(i11)) == 0) {
                            view = this.f32028a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    my0 my0Var = this.f32028a;
                    View F = my0Var.F(view);
                    if (F != null) {
                        l1Var = my0Var.T(F);
                    }
                    l1Var = (org.telegram.ui.Components.el0) l1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (l1Var != null) {
                    i10 = l1Var.b();
                } else {
                    i10 = -1;
                }
                top = (top < 0 || i10 != 0) ? 0 : 0;
                if (this.f32119n0 == null && this.actionBar.f20330k0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i12 = this.G4;
                if (i12 != -1 && !z4) {
                    org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.f32028a.K(i12);
                    if (el0Var != null && el0Var.f5785a.getTop() <= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (this.C5 != z4) {
                    this.C5 = z4;
                    AnimatorSet animatorSet = this.f32205z5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.A5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    org.telegram.ui.ActionBar.w0 searchItem = this.L.getSearchItem();
                    org.telegram.ui.Components.jj0 searchOptionsItem = this.L.getSearchOptionsItem();
                    TextView saveItem = this.L.getSaveItem();
                    if (!this.C5) {
                        if (this.I0) {
                            this.N0.setVisibility(0);
                        }
                        if (this.J0) {
                            this.O0.setVisibility(0);
                        }
                        if (this.K0) {
                            this.P0.setVisibility(0);
                        }
                        this.Q0.setVisibility(0);
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(8);
                        }
                        if (saveItem != null) {
                            saveItem.setVisibility(8);
                        }
                    } else {
                        sz0 sz0Var = this.L;
                        if (sz0Var.s0(sz0Var.f31120h0[0].C)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        sz0 sz0Var2 = this.L;
                        int i13 = sz0Var2.f31120h0[0].C;
                        if (i13 != 0 && !org.telegram.ui.Components.yu0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || sz0Var2.S == null)) {
                            this.L.f31133o0.setVisibility(4);
                            this.L.A(false, false);
                        } else {
                            this.L.f31133o0.setVisibility(0);
                            this.L.A(true, false);
                        }
                    }
                    l5(false);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null) {
                        kVar.n().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.w0 w0Var = this.N0;
                    Property property = View.ALPHA;
                    float f23 = 1.0f;
                    if (z4) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f10));
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.O0;
                    if (z4) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f11));
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.Q0;
                    if (z4) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var3, property, f12));
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.P0;
                    if (z4) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f13));
                    org.telegram.ui.ActionBar.w0 w0Var5 = this.N0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z4) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var5, property2, f14));
                    org.telegram.ui.ActionBar.w0 w0Var6 = this.O0;
                    if (z4) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var6, property2, f15));
                    org.telegram.ui.ActionBar.w0 w0Var7 = this.Q0;
                    if (z4) {
                        f16 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var7, property2, f16));
                    org.telegram.ui.ActionBar.w0 w0Var8 = this.P0;
                    if (z4) {
                        f17 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var8, property2, f17));
                    if (z4) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(searchItem, property, f18));
                    if (z4) {
                        dp = 0.0f;
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(searchItem, property2, dp));
                    ImageView imageView = this.L.f31133o0;
                    if (z4) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f19));
                    ImageView imageView2 = this.L.f31133o0;
                    if (z4) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(10.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, dp2));
                    org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                    if (z4) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar2, this.D5, f20));
                    org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32147r;
                    org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
                    if (z4) {
                        f21 = 0.0f;
                    } else {
                        f21 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, property, f21));
                    this.L.F0.setOpen(z4);
                    if (this.f32134p1) {
                        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[3];
                        if (z4) {
                            f22 = 0.0f;
                        } else {
                            f22 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(k5Var2, property, f22));
                    }
                    org.telegram.ui.Components.io0 io0Var = this.f32155s;
                    if (!z4) {
                        f23 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(io0Var, property, f23));
                    if (z4) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f32076g5, 0.0f));
                    }
                    if (this.f32148r0 != null || this.f32156s0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ux0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.f32205z5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.f32205z5.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    this.f32205z5.addListener(new org.telegram.ui.Components.ex0(8, this, searchItem));
                    this.f32205z5.setDuration(150L);
                    this.f32205z5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f24 = top;
                if (this.N1 != f24 && !this.E1) {
                    this.N1 = f24;
                    this.f32030a1.invalidate();
                    if (this.G1 != 0) {
                        if (this.N1 > O3()) {
                            z10 = true;
                        }
                        this.J1 = z10;
                    }
                    k4(true);
                }
            }
        }
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        boolean[] zArr = new boolean[1];
        ez0 ez0Var = new ez0(this, user.f19331id, this.f32045c1, tL_chatAdminRights, this.B2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        ez0Var.U0 = new fz0(this, i10, chatParticipant, z4, zArr);
        presentFragment(ez0Var);
    }

    public final void B3() {
        float alpha;
        int i10 = this.G1;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32147r;
        if (i10 == 1 && (!this.f32090i5 || this.D1)) {
            this.V5 = 0.0f;
        } else if (i10 == 2 && (!this.f32090i5 || this.D1)) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
            if (k5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = k5Var.getAlpha();
            }
            this.V5 = alpha;
        } else if (this.f32037b1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.V5 = (1.0f - this.f32104k5) * this.f32080h2;
        } else {
            this.V5 = this.f32080h2 * this.f32104k5;
        }
        if (this.f32037b1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.f32116m5) {
                this.f32110l5 = AndroidUtilities.dp(28.0f) * this.V5;
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[2];
                if (k5Var2 != null) {
                    k5Var2.setAlpha(this.f32080h2);
                    k5VarArr[3].setAlpha(1.0f - this.f32080h2);
                    k5VarArr[1].setTranslationX(W3(this.W5));
                    this.W.invalidate();
                    s01 s01Var = this.Y5;
                    if (s01Var != null) {
                        s01Var.e = 1.0f - this.f32080h2;
                        s01Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[2];
            if (k5Var3 != null) {
                k5Var3.setAlpha(0.0f);
                k5VarArr[3].setAlpha(0.0f);
            }
            s01 s01Var2 = this.Y5;
            if (s01Var2 != null) {
                s01Var2.e = 1.0f;
                s01Var2.invalidateSelf();
            }
        } else if (this.f32124n5) {
            org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[2];
            if (k5Var4 != null) {
                k5Var4.setAlpha(this.V5);
            }
            s01 s01Var3 = this.Y5;
            if (s01Var3 != null) {
                s01Var3.e = 1.0f - this.V5;
                s01Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[2];
            if (k5Var5 != null) {
                k5Var5.setAlpha(0.0f);
            }
            s01 s01Var4 = this.Y5;
            if (s01Var4 != null) {
                s01Var4.e = 1.0f;
                s01Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (p2Var instanceof xn) {
                    finishFragment();
                    ((xn) p2Var).V.a1(null, str, false, false);
                }
            }
        } else {
            oy oyVar = new oy(null);
            oyVar.f37057k2 = str;
            presentFragment(oyVar);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C3() {
        boolean z4;
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            if (!this.C5 && this.E5) {
                z4 = true;
            } else {
                z4 = false;
            }
            jw0Var.setVisibility(z4);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Cells.y3 y3Var = this.f32050d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f10);
        this.f32099k0.O(this.H2, f10);
    }

    public final void D3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f32113m2 && (valueAnimator = this.f32073g2) != null && valueAnimator.isRunning()) {
            this.f32038b2 = this.H5;
            this.f32052d2 = this.I5;
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
    public final void E() {
        G4(false);
    }

    public final void E3(Context context) {
        int i10;
        this.X0 = new org.telegram.ui.Components.h8(context, this.Q0.getPopupLayout().getSwipeBack(), new ly0(this), false, 0, this.f32181w0);
        if (this.f32065f1 > 0 || this.f32037b1 > 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, this.f32181w0);
            org.telegram.ui.Components.h8 h8Var = this.X0;
            org.telegram.ui.Components.e90 e90Var = h8Var.e;
            if (e90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.fg(h8Var, 10)));
                e90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f32158s2;
        if (userFull == null && this.f32150r2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f32150r2.ttl_period;
        }
        org.telegram.ui.Components.x11 a2 = org.telegram.ui.Components.x11.a(i10);
        this.f32133p0 = a2;
        this.W0 = this.Q0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.X0.f25346a);
        this.Q0.a(-1);
        T4();
    }

    public final void E4(float f10, float f11) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.N1 - T3()) / ((this.f32028a.getMeasuredWidth() - f11) - U3())));
        if (this.N1 < T3() && max < 0.33f) {
            lerp = e2.c.v(f10, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = (1.0f + f10) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (AndroidUtilities.density * 21.0f))));
        this.f32038b2 = (AndroidUtilities.dp(7.0f) * f10) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f32052d2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f10) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView != null && this.U5 && this.f32176v2 != null && getParentActivity() != null) {
            y01 y01Var = this.Z5;
            if (y01Var != null) {
                y01Var.b(this.f32176v2);
                this.Z5.invalidate();
                return;
            }
            y01 y01Var2 = new y01(this, this.f32176v2);
            this.Z5 = y01Var2;
            ((FrameLayout) this.fragmentView).addView(y01Var2, k7.b6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        my0 my0Var = this.f32028a;
        if (my0Var != null && this.f32043c != null && my0Var.getChildCount() > 0 && !this.T5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f32028a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f32028a.getChildAt(i12));
                View childAt = this.f32028a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.R5 = i11;
                int top = view.getTop();
                this.S5 = top;
                if (this.R5 == 0 && !this.f32107l2 && top > T3()) {
                    this.S5 = T3();
                }
                this.f32043c.h1(i11, view.getTop() - this.f32028a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z4) {
        int i10 = this.G4;
        if (i10 >= 0) {
            if (z4) {
                wh.o oVar = new wh.o(getParentActivity(), 2, 0.6f);
                oVar.f5723a = this.G4;
                oVar.f46638p = -this.f32028a.getPaddingTop();
                this.f32043c.w0(oVar);
                return;
            }
            this.f32043c.h1(i10, -this.f32028a.getPaddingTop());
        }
    }

    public final void H3(float f10) {
        boolean z4;
        ValueAnimator ofFloat;
        long j10;
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.Q5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Q5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z4) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f32168u0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ux0(this, 1));
        this.Q5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.Q5;
        if (z4) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z4) {
            this.Q5.addListener(new jz0(this, 4));
        }
        this.Q5.start();
    }

    @Override
    public final void I(boolean z4, boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.f32050d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final void I3(int i10, View view) {
        boolean z4;
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
        H.W(this.f32028a.V0(view, false));
        H.f27492w = false;
        if (this.f32158s2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ob0(this, 25), z4);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new ob0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.hm(this, i10, 21), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var != null) {
            if (this.f32134p1) {
                jh0Var.E = 6;
            } else if (this.f32120n1) {
                jh0Var.E = 5;
            } else if (this.f32128o2) {
                jh0Var.E = 2;
            } else if (this.f32037b1 != 0) {
                jh0Var.E = 0;
            } else if (this.f32045c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f32045c1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.X.E = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.X.E = 4;
                        return;
                    } else {
                        this.X.E = 1;
                        return;
                    }
                }
                this.X.E = 3;
            }
        }
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f32134p1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f32158s2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f19331id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.H3 && i10 != this.G3 && i10 != this.T2) {
                    if (i10 == this.L3) {
                        str = uf.x0.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                        string = LocaleController.getString(R.string.ProfileHoursCopy);
                    } else if (i10 == this.M3) {
                        str = userFull.business_location.address;
                        string = LocaleController.getString(R.string.ProfileLocationCopy);
                    } else if (i10 == this.I3) {
                        str = UserObject.getPublicUsername(currentUser);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        string = LocaleController.getString(R.string.ProfileCopyUsername);
                    } else if (i10 == this.D3) {
                        str = currentUser.phone;
                    } else if (i10 == this.R2) {
                        str = UserInfoActivity.Z(this.f32158s2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
                H.W(this.f32028a.V0(view, false));
                H.f27492w = false;
                H.f27471i = 3;
                if (i10 == this.M3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new ob0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new ob0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new el0(str, 26), false);
                }
                if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new ob0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f38774b;

                        {
                            this.f38774b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f38774b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f19503a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f38774b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f19503a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.M3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new ob0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f38774b;

                        {
                            this.f38774b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f38774b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f19503a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f38774b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f19503a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.I3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ob0(this, 10), false);
                } else if (i10 != this.H3 && i10 != this.G3 && i10 != this.T2) {
                    if (i10 == this.D3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new ob0(this, 12), false);
                    } else if (i10 == this.R2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f38452b;

                            {
                                this.f38452b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f38452b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.f32181w0).f19525a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity3, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19503a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19503a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f38452b;

                            {
                                this.f38452b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f38452b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.f32181w0).f19525a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19503a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19503a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.N2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new zq0(19, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new ob0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f38452b;

                            {
                                this.f38452b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f38452b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.f32181w0).f19525a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19503a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f38452b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19503a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new ob0(this, 11), false);
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
    public final boolean K(oy oyVar) {
        return false;
    }

    public final boolean K3() {
        f2.l1 l1Var;
        View view;
        if ((this.F0 || (!AndroidUtilities.isTablet() && !this.f32101k2)) && this.f32036b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.C0 = true;
            this.f32107l2 = true;
            int i10 = 0;
            while (true) {
                l1Var = null;
                if (i10 < this.f32028a.getChildCount()) {
                    if (RecyclerView.R(this.f32028a.getChildAt(i10)) == 0) {
                        view = this.f32028a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                my0 my0Var = this.f32028a;
                View F = my0Var.F(view);
                if (F != null) {
                    l1Var = my0Var.T(F);
                }
                if (l1Var != null) {
                    Integer num = (Integer) this.V1.get(Integer.valueOf(l1Var.b()));
                    if (num != null) {
                        this.M1 = true;
                        this.f32028a.v0(0, -(((this.f32028a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.nr.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K4(TLRPC.ChatFull chatFull) {
        boolean z4;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f32150r2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f32093j1 == 0) {
                this.f32093j1 = -j10;
                getMediaDataController().getMediaCounts(this.f32093j1, this.f32051d1, this.classGuid);
            }
        }
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.setChatInfo(this.f32150r2);
        }
        xy0 xy0Var = this.f32099k0;
        if (xy0Var != null && !this.f32120n1) {
            xy0Var.setChatInfo(this.f32150r2);
        }
        zy0 zy0Var = this.f32148r0;
        if (zy0Var != null && (chatFull3 = this.f32150r2) != null) {
            zy0Var.setStories(chatFull3.stories);
        }
        lh.u0 u0Var = this.f32156s0;
        if (u0Var != null) {
            u0Var.a();
        }
        wy0 wy0Var = this.f32036b0;
        if (wy0Var != null) {
            wy0Var.setHasStories(j4());
        }
        L3();
        if (this.f32045c1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f32150r2) != null && chatFull2.stargifts_available) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Q0.I(38, z4);
            org.telegram.ui.Components.jh0 jh0Var = this.X;
            if (jh0Var != null) {
                jh0Var.o(3, z4);
            }
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.B2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f32150r2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f32150r2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f32150r2.participants.participants.get(i10);
                    this.f32202z1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.W != null && (tL_emojiStatusCollectible2 = this.f32056d6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f32056d6 = tL_emojiStatusCollectible;
                ph.f3 f3Var = this.f32034a6;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f32049c6 = null;
                    this.f32034a6 = new ph.f3(getParentActivity(), 3);
                    this.f32042b6 = org.telegram.ui.ActionBar.j6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f32034a6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    ph.f3 f3Var2 = this.f32034a6;
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    f3Var2.f41636x0 = true;
                    f3Var2.F0 = System.currentTimeMillis();
                    f3Var2.f41638y0 = new Path();
                    f3Var2.f41639z0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    f3Var2.A0 = new Paint(1);
                    f3Var2.B0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(1.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    f3Var2.E0 = linearGradient;
                    f3Var2.B0.setShader(linearGradient);
                    f3Var2.C0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.5f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    f3Var2.D0 = new Matrix();
                    f3Var2.A0.setShader(f3Var2.C0);
                    f3Var2.B0.setStyle(Paint.Style.STROKE);
                    f3Var2.B0.setStrokeJoin(Paint.Join.ROUND);
                    f3Var2.B0.setStrokeCap(Paint.Cap.ROUND);
                    f3Var2.B0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.W.addView(this.f32034a6, k7.b6.c(24.0f, -1));
                    this.f32034a6.u(9.33f);
                    ph.f3 f3Var3 = this.f32034a6;
                    Typeface bold = AndroidUtilities.bold();
                    f3Var3.E.u(bold);
                    f3Var3.G.setTypeface(bold);
                    this.f32034a6.t(tL_emojiStatusCollectible.title);
                    ph.f3 f3Var4 = this.f32034a6;
                    f3Var4.d = -1L;
                    f3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
                    ph.f3 f3Var5 = this.f32034a6;
                    f3Var5.getClass();
                    f3Var5.f41637y = AndroidUtilities.dpf2(4.0f);
                    f3Var5.B = AndroidUtilities.dpf2(2.66f);
                    this.f32034a6.s();
                    this.f32034a6.r(16.0f);
                    this.f32034a6.v();
                    this.f32034a6.setOnClickListener(new dy0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.N1 < AndroidUtilities.dp(82.0f)) {
                        this.f32049c6 = Boolean.FALSE;
                        this.f32034a6.setAlpha(0.0f);
                    }
                    V4();
                    ph.f3 f3Var6 = this.f32034a6;
                    Objects.requireNonNull(f3Var6);
                    AndroidUtilities.runOnUIThread(new el0(f3Var6, 27), 6000L);
                }
            }
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.qu0 qu0Var;
        sz0 sz0Var = this.L;
        if (sz0Var != null && (qu0Var = this.O) != null) {
            sz0Var.setNewMediaCounts(qu0Var.f28259c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f32158s2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.e5 e5Var;
        if (this.G1 != 0 && (e5Var = this.parentLayout) != null && e5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof xn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(zz0 zz0Var) {
        if (this.f32069f5 == zz0Var) {
            return;
        }
        this.f32069f5 = zz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f32028a, (h5.d) new yx0(this, 0));
    }

    public final void N3() {
        if (this.f32028a == null) {
            return;
        }
        float measuredWidth = (this.f32028a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.V.getLayoutParams()).width * this.Y1) * 0.5f);
        this.W1 = measuredWidth;
        if (this.D1) {
            this.W1 = AndroidUtilities.lerp(this.L5, measuredWidth, this.P1);
        }
        this.V.setTranslationX(this.W1);
    }

    public final void N4(int i10) {
        boolean z4;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!AndroidUtilities.isTablet()) {
            boolean z10 = false;
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.H1 = z4;
            if (i10 != 0) {
                z10 = true;
            }
            this.I1 = z10;
            k5();
            if (globalMainSettings.getBoolean("view_animations", true)) {
                this.G1 = i10;
            } else if (i10 == 2) {
                this.f32100k1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f32037b1 != 0 && this.f32119n0 != null && !this.f32134p1) {
            return 0;
        }
        if (this.F4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, v01 v01Var) {
        boolean z4;
        this.f32158s2 = userFull;
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            jw0Var.set(userFull.stars_rating);
        }
        zy0 zy0Var = this.f32148r0;
        if (zy0Var != null) {
            zy0Var.setStories(this.f32158s2.stories);
        }
        lh.u0 u0Var = this.f32156s0;
        if (u0Var != null) {
            u0Var.a();
        }
        wy0 wy0Var = this.f32036b0;
        if (wy0Var != null) {
            wy0Var.setHasStories(j4());
        }
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.setUserInfo(this.f32158s2);
        }
        if (this.f32164t2 == null) {
            this.f32164t2 = f6Var;
        }
        if (this.f32164t2 == null) {
            this.f32164t2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.f32164t2;
        ob0 ob0Var = new ob0(this, 20);
        if (f6Var2.f21061c) {
            ob0Var.run();
        } else {
            f6Var2.h.add(ob0Var);
        }
        this.f32164t2.d(this.f32158s2);
        if (this.f32176v2 == null) {
            this.f32176v2 = v01Var;
        }
        v01 v01Var2 = this.f32176v2;
        if (v01Var2 == null) {
            v01 c3 = v01.c(this.currentAccount, this.f32158s2, v01Var2);
            this.f32176v2 = c3;
            if (c3 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f32170u2 = z4;
        }
        v01 v01Var3 = this.f32176v2;
        if (v01Var3 != null) {
            ob0 ob0Var2 = new ob0(this, 16);
            if (v01Var3.f39035b) {
                ob0Var2.run();
            } else {
                v01Var3.h.add(ob0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f32037b1)));
            if (e4()) {
                this.Q0.K(44);
            } else {
                this.Q0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.s61) {
            return ((org.telegram.ui.Components.s61) imageReceiver.getDrawable()).f28655a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f32036b0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z4, boolean z10) {
        if (this.f32050d0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f32044c0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32044c0 = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32044c0 = animatorSet2;
            if (z4) {
                this.f32050d0.setVisibility(0);
                this.f32044c0.playTogether(ObjectAnimator.ofFloat(this.f32050d0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f32050d0, View.ALPHA, 0.0f));
            }
            this.f32044c0.setDuration(180L);
            this.f32044c0.addListener(new kz0(this, z4, 1));
            this.f32044c0.start();
        } else if (z4) {
            this.f32050d0.setAlpha(1.0f);
            this.f32050d0.setVisibility(0);
        } else {
            this.f32050d0.setAlpha(0.0f);
            this.f32050d0.setVisibility(4);
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final org.telegram.ui.Components.j5 Q3(int i10, long j10) {
        int i11;
        org.telegram.ui.Components.j5[] j5VarArr = this.E;
        if (j5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.k5 k5Var = this.f32063f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(dp, i11, k5Var, false);
            j5VarArr[i10] = j5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            j5Var.F = 0;
            j5Var.G = dp2;
            if (this.D0) {
                j5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            j5VarArr[i10].j(j10, false);
        } else {
            j5VarArr[i10].g(null, false);
        }
        X4();
        return j5VarArr[i10];
    }

    public final void Q4() {
        int i10;
        int i11;
        Long l10;
        if (this.f32200y5 != null) {
            return;
        }
        g61[] g61VarArr = new g61[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            if (k5Var.getRightDrawable() == null) {
                rect.set(k5VarArr[1].getWidth() - 1, (k5VarArr[1].getHeight() / 2) - 1, k5VarArr[1].getWidth() + 1, (k5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(k5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((k5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) k5VarArr[1].getX(), (int) k5VarArr[1].getY());
            }
        }
        if (k5VarArr[1].getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int dp = (-(this.W.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = k7.n.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.B2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        cz0 cz0Var = new cz0(this, this, parentActivity, valueOf, i11, this.f32181w0, i10, g61VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32037b1));
        if (user != null) {
            cz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l11 = this.C;
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (l11 != null) {
            cz0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                Drawable drawable = j5Var.f25875f[0];
                if (drawable instanceof org.telegram.ui.Components.l5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.l5) drawable).i());
                    cz0Var.setSelected(l10);
                }
            }
            l10 = null;
            cz0Var.setSelected(l10);
        }
        cz0Var.setSaveState(3);
        cz0Var.y(j5VarArr[1], k5VarArr[1]);
        dz0 dz0Var = new dz0(this, cz0Var);
        this.f32200y5 = dz0Var;
        g61VarArr[0] = dz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.getLocationOnScreen(iArr);
        }
        g61VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        g61VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        sz0 sz0Var = this.L;
        if (sz0Var != null && this.f32155s != null) {
            int closestTab = sz0Var.getClosestTab();
            int[] iArr = this.O.f28259c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f32155s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f32155s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.L.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.L.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f32155s.setText(android.support.v4.media.a.z(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f32155s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f32155s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f32155s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f32155s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f32155s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f32155s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f32155s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f32155s.setText(LocaleController.formatPluralString("CommonGroups", this.f32158s2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f32155s.setText(this.f32147r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.yu0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f32155s.setText(this.L.V(true));
                } else if (closestTab == 9) {
                    this.f32155s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.L.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.io0 io0Var = this.f32155s;
                    if (this.f32128o2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    io0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f32155s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.io0 io0Var2 = this.f32155s;
                    org.telegram.ui.Components.or0 or0Var = this.L.S;
                    if (or0Var != null) {
                        i11 = or0Var.getGiftsCount();
                    }
                    io0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f32155s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f32155s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f32128o2) {
                this.f32155s.setText(this.L.V(false));
            } else if (this.L.c0(closestTab) > 0) {
                this.f32155s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.L.c0(closestTab), new Object[0]));
            } else {
                this.f32155s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z4) {
        a0.h hVar;
        int i10;
        if (!this.f32196y1 && (hVar = this.f32202z1) != null && this.f32150r2 != null) {
            this.f32196y1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z4) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f32045c1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z4) {
                i11 = this.f32202z1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new gg.l0(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.L.F0.setReordering(false);
        sz0 sz0Var = this.L;
        org.telegram.ui.Components.ns0 ns0Var = sz0Var.F0;
        if (sz0Var.f31144s1 != null && ns0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ns0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.yu0.d0(num.intValue(), sz0Var.f31104a1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.L.v1(true);
        this.f32179v5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new ob0(this, 21)).start();
        org.telegram.ui.Components.qc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.j5 S3(TLRPC.EmojiStatus emojiStatus, boolean z4, int i10) {
        int i11;
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (j5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.k5 k5Var = this.f32063f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(dp, i11, k5Var, false);
            j5VarArr[i10] = j5Var;
            if (this.D0) {
                j5Var.a();
            }
        }
        if (i10 == 1) {
            this.C = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                j5VarArr[i10].g(Y3(i10), z4);
                j5VarArr[i10].m(false, z4);
            } else {
                j5VarArr[i10].j(tL_emojiStatus.document_id, z4);
                j5VarArr[i10].m(false, z4);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                j5VarArr[i10].g(Y3(i10), z4);
                j5VarArr[i10].m(false, z4);
            } else {
                if (i10 == 1) {
                    this.C = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                j5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z4);
                j5VarArr[i10].m(true, z4);
            }
        } else {
            j5VarArr[i10].g(Y3(i10), z4);
            j5VarArr[i10].m(false, z4);
        }
        X4();
        return j5VarArr[i10];
    }

    public final void S4() {
        int i10;
        float f10;
        l0 l0Var;
        if (this.X != null && this.f32147r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.jh0 jh0Var = this.X;
            boolean z4 = this.D1;
            jh0Var.e = z4;
            if (z4 && this.G1 == 2 && (l0Var = this.V) != null) {
                this.X.f25985f = this.V.getY() + (this.V.getScaleY() * l0Var.getHeight());
                this.X.setAlpha(this.P1);
                org.telegram.ui.Components.jh0 jh0Var2 = this.X;
                jh0Var2.B = AndroidUtilities.dp(74.0f);
                jh0Var2.setTranslationY(this.f32028a.getMeasuredWidth());
                jh0Var2.invalidate();
            } else {
                jh0Var.f25985f = -1.0f;
                float f11 = i11;
                float f12 = this.N1 + f11;
                if (this.F4) {
                    f10 = 25.0f;
                } else {
                    f10 = 0.0f;
                }
                float dp = f12 - AndroidUtilities.dp(f10);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f11);
                org.telegram.ui.Components.jh0 jh0Var3 = this.X;
                jh0Var3.B = min;
                jh0Var3.setTranslationY(dp - min);
                jh0Var3.invalidate();
            }
            ImageView imageView = this.L0;
            if (imageView != null && imageView.getTag() != null) {
                this.X.getClass();
                if (this.L0.getVisibility() == 0) {
                    this.L0.setVisibility(8);
                }
                if (this.L0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
                    ((org.telegram.ui.ActionBar.w0) this.L0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final boolean T() {
        return this.f32189x1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        int i10;
        if (this.W0 != null && this.X0 != null) {
            TLRPC.UserFull userFull = this.f32158s2;
            if (userFull == null && this.f32150r2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f32150r2.ttl_period;
            }
            this.f32133p0.b(i10);
            this.X0.b(i10);
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
        boolean z4;
        if (this.f32138p5 != null) {
            sz0 sz0Var = this.L;
            if (sz0Var != null && sz0Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f32028a.getMeasuredHeight() - this.L.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            xd.a aVar = this.f32193x5;
            aVar.a(z4, true);
            float f10 = aVar.e;
            this.f32138p5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f10));
            this.f32138p5.setAlpha(f10);
            FrameLayout frameLayout = this.f32138p5;
            if (f10 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
            if (icVar != null) {
                icVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f32187x == null) {
            this.f32187x = org.telegram.ui.ActionBar.j6.f20047l4.getConstantState().newDrawable().mutate();
        }
        return this.f32187x;
    }

    public final void V4() {
        ph.f3 f3Var = this.f32034a6;
        if (f3Var != null) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
            boolean z4 = true;
            float x10 = k5VarArr[1].getX() + (-f3Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f32080h2);
            float f10 = 0.0f;
            f3Var.n(0.0f, (k5VarArr[1].getScaleX() * (k5VarArr[1].getRightDrawableX() - (lerp * k5VarArr[1].getRightDrawableWidth()))) + x10);
            float lerp2 = AndroidUtilities.lerp(this.f32094j2, this.f32087i2);
            ph.f3 f3Var2 = this.f32034a6;
            f3Var2.setTranslationY(((k5VarArr[1].getY() + (-f3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.f32034a6.h(i0.a.d(lerp2, this.f32042b6, 1342177280));
            if (this.N1 < AndroidUtilities.dp(82.0f)) {
                z4 = false;
            }
            Boolean bool = this.f32049c6;
            if (bool != null && bool.booleanValue() == z4) {
                return;
            }
            ViewPropertyAnimator animate = this.f32034a6.animate();
            this.f32049c6 = Boolean.valueOf(z4);
            if (z4) {
                f10 = 1.0f;
            }
            b.p(animate.alpha(f10), org.telegram.ui.Components.nr.f27347g, 200L);
        }
    }

    public final float W3(float f10) {
        this.W5 = f10;
        int i10 = this.G1;
        float f11 = 1.0f;
        if (i10 != 2) {
            if (this.P1 < 1.0f && i10 != 0) {
                f11 = 0.0f;
            } else {
                f11 = this.f32080h2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f32110l5) * Utilities.clamp01(f11)) + f10;
    }

    public final void W4() {
        if (getParentActivity() != null && this.S0 != null) {
            if (getUserConfig().isPremium()) {
                this.S0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, this.f32181w0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.S0.setIcon(new nh.i2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    public final float X3(float f10) {
        float f11;
        this.X5 = f10;
        int i10 = this.G1;
        float f12 = 0.0f;
        if (i10 == 2) {
            f11 = 1.0f;
        } else if (this.P1 < 1.0f && i10 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f32080h2;
        }
        float clamp01 = Utilities.clamp01(f11);
        if (this.Q != null) {
            f12 = this.Q.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return e2.c.w(1.0f, clamp01, f12, f10);
    }

    public final void X4() {
        Y4(this.M5);
    }

    public final org.telegram.ui.Components.mr Y3(int i10) {
        org.telegram.ui.Components.mr[] mrVarArr = this.H;
        if (mrVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.B;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f32181w0), PorterDuff.Mode.MULTIPLY);
            mrVarArr[i10] = new org.telegram.ui.Components.mr(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return mrVarArr[i10];
    }

    public final void Y4(float f10) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.N5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f32181w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f32181w0), this.B5, 1.0f);
            }
            int d = i0.a.d(f10, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.j6.Oi;
            int d10 = i0.a.d(this.B5, d, org.telegram.ui.ActionBar.j6.v0(i11, this.f32181w0));
            org.telegram.ui.Components.j5 j5Var = this.D[i10];
            if (j5Var != null) {
                j5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.j5 j5Var2 = this.E[i10];
            if (j5Var2 != null) {
                j5Var2.k(Integer.valueOf(i0.a.d(this.B5, i0.a.d(f10, offsetColor, -1711276033), org.telegram.ui.ActionBar.j6.v0(i11, this.f32181w0))));
            }
            if (i10 == 1) {
                this.f32029a0.setColor(d10);
            }
        }
        this.M5 = f10;
    }

    public final float Z3() {
        if (this.Q != null) {
            return this.Q.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
        }
        return 0.0f;
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.f32029a0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
        oVar.setScaleX(k5VarArr[1].getScaleX());
        this.f32029a0.setScaleY(k5VarArr[1].getScaleY());
        this.f32029a0.b((k5VarArr[1].getScaleX() * k5VarArr[1].getRightDrawableX()) + k5VarArr[1].getX(), (k5VarArr[1].getHeight() - (k5VarArr[1].getScaleY() * (k5VarArr[1].getHeight() - k5VarArr[1].getRightDrawableY()))) + k5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f32065f1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f32037b1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f32045c1;
    }

    public final org.telegram.ui.Components.fm0 a4(int i10) {
        if (this.I == null) {
            org.telegram.ui.Components.fm0 fm0Var = new org.telegram.ui.Components.fm0(i10);
            this.I = fm0Var;
            fm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19980h8, this.f32181w0));
        }
        return this.I;
    }

    public final void a5() {
        if (!this.f32120n1 && ChatObject.isForum(this.B2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f32045c1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f32062e5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f32045c1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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

    public final s01 b4() {
        if (this.Y5 == null) {
            s01 s01Var = new s01(LocaleController.getString(R.string.StatusHiddenShow));
            this.Y5 = s01Var;
            s01Var.setAlpha((int) (Math.min(1.0f, this.N1 / T3()) * 255.0f));
            this.Y5.a(i0.a.d(this.f32080h2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        return this.Y5;
    }

    public final void b5(float f10) {
        h01 h01Var;
        ValueAnimator valueAnimator;
        if (this.f32113m2 || ((h01Var = this.K) != null && (valueAnimator = h01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.K.getLayoutParams();
            layoutParams.width = this.f32028a.getMeasuredWidth();
            layoutParams.height = (int) (this.N1 + f10);
            this.K.requestLayout();
        }
        u01 u01Var = this.f32030a1;
        if (u01Var != null) {
            u01Var.B.setTranslate(0.0f, this.X1 - u01Var.f38807x);
            u01 u01Var2 = this.f32030a1;
            RadialGradient radialGradient = u01Var2.f38808y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(u01Var2.B);
            }
            this.f32030a1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        float f10;
        if (this.f32120n1) {
            return 0;
        }
        if (this.f32045c1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f32045c1)))) {
            if (j4()) {
                f10 = 24.0f;
            } else {
                f10 = 38.0f;
            }
            return AndroidUtilities.dp(f10);
        }
        return AndroidUtilities.dp(50.0f);
    }

    public final void c5() {
        TLRPC.User user;
        boolean z4;
        int i10;
        int i11;
        if (this.f32134p1 && this.U0 != null && this.T0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f32037b1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.U0;
            if (z4) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            g1Var.setIcon(i10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.U0;
            if (z4) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            g1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.g1 g1Var3 = this.T0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            g1Var3.setVisibility(i12);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.L.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.N5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final org.telegram.ui.Components.mr d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f10;
        org.telegram.ui.Components.mr[] mrVarArr = this.G;
        if (mrVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f32194y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.F;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.N5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
                    color3 = this.N5.getColor5();
                } else {
                    color3 = this.N5.getColor3();
                }
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, f10, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f32181w0), this.B5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.f32181w0), this.B5, 1.0f), mode);
            }
            mrVarArr[i10] = new org.telegram.ui.Components.mr(new org.telegram.ui.Components.nq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return mrVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        g01 g01Var;
        boolean z4;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        my0 my0Var;
        my0 my0Var2;
        org.telegram.ui.Components.el0 el0Var;
        if (i10 != NotificationCenter.uploadStoryEnd && i10 != NotificationCenter.chatWasBoostedByUser) {
            boolean z13 = true;
            int i12 = 0;
            r3 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (this.f32037b1 != 0) {
                    if (z12) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (my0Var2 = this.f32028a) != null && (el0Var = (org.telegram.ui.Components.el0) my0Var2.L(this.D3, false)) != null) {
                        this.d.v(el0Var, this.D3);
                    }
                } else if (this.f32045c1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (z12 && (my0Var = this.f32028a) != null) {
                        int childCount = my0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f32028a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (this.f32150r2 != null && (chat = this.B2) != null && chat.f19184id == l10.longValue()) {
                    this.f32150r2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f32072g1) {
                        AndroidUtilities.runOnUIThread(new zq0(17, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.A2;
                    if (encryptedChat2 != null && encryptedChat.f19192id == encryptedChat2.f19192id) {
                        this.A2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.U1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z15 = this.f32079h1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f32037b1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f32079h1 = z11;
                    if (z15 != z11) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l11 = (Long) objArr[0];
                    if (this.B2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.B2;
                        if (longValue == chat2.f19184id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f32150r2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f32150r2 = chatFull4;
                            }
                            sz0 sz0Var = this.L;
                            if (sz0Var != null) {
                                sz0Var.setChatInfo(this.f32150r2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f32150r2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f32112m1) || (inputGroupCall != null && this.f32112m1))) {
                                D3(false);
                            }
                            zy0 zy0Var = this.f32148r0;
                            if (zy0Var != null && (chatFull3 = this.f32150r2) != null) {
                                zy0Var.setStories(chatFull3.stories);
                            }
                            lh.u0 u0Var = this.f32156s0;
                            if (u0Var != null) {
                                u0Var.a();
                            }
                            wy0 wy0Var = this.f32036b0;
                            if (wy0Var != null) {
                                wy0Var.setHasStories(j4());
                            }
                            if (l11.longValue() != 0) {
                                z13 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f32150r2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.Q0.I(38, z13);
                                org.telegram.ui.Components.jh0 jh0Var = this.X;
                                if (jh0Var != null) {
                                    jh0Var.o(3, z13);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f32037b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f32037b1))) != null && chatFull7.f19185id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.B2;
                    if (chat3 != null && chatFull7.f19185id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f19185id == this.f32045c1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f32150r2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f32150r2 = chatFull7;
                        if (this.f32093j1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f32093j1 = -j10;
                                getMediaDataController().getMediaCount(this.f32093j1, this.f32051d1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        xy0 xy0Var = this.f32099k0;
                        if (xy0Var != null && !this.f32120n1) {
                            xy0Var.setChatInfo(this.f32150r2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f32045c1));
                        if (chat4 != null) {
                            this.B2 = chat4;
                            D3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.U1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.B2.megagroup && (z10 || !booleanValue)) {
                            R3(true);
                        }
                        T4();
                        m5();
                        zy0 zy0Var2 = this.f32148r0;
                        if (zy0Var2 != null && (chatFull = this.f32150r2) != null) {
                            zy0Var2.setStories(chatFull.stories);
                        }
                        lh.u0 u0Var2 = this.f32156s0;
                        if (u0Var2 != null) {
                            u0Var2.a();
                        }
                        wy0 wy0Var2 = this.f32036b0;
                        if (wy0Var2 != null) {
                            wy0Var2.setHasStories(j4());
                        }
                        sz0 sz0Var2 = this.L;
                        if (sz0Var2 != null) {
                            sz0Var2.setChatInfo(this.f32150r2);
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
                    if (botInfo.user_id == this.f32037b1) {
                        this.C2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f32037b1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f32158s2 = userFull;
                        org.telegram.ui.Components.jw0 jw0Var = this.Q;
                        if (jw0Var != null) {
                            jw0Var.set(userFull.stars_rating);
                        }
                        zy0 zy0Var3 = this.f32148r0;
                        if (zy0Var3 != null) {
                            zy0Var3.setStories(this.f32158s2.stories);
                        }
                        lh.u0 u0Var3 = this.f32156s0;
                        if (u0Var3 != null) {
                            u0Var3.a();
                        }
                        wy0 wy0Var3 = this.f32036b0;
                        if (wy0Var3 != null) {
                            wy0Var3.setHasStories(j4());
                        }
                        sz0 sz0Var3 = this.L;
                        if (sz0Var3 != null) {
                            sz0Var3.setUserInfo(this.f32158s2);
                        }
                        if (this.f32119n0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f32158s2.about, this.f32183w2)) {
                                this.d.m(this.T2);
                            }
                        } else {
                            if (!this.D1 && !this.H0) {
                                D3(true);
                            } else {
                                this.F1 = true;
                            }
                            e5(false, false);
                            sz0 sz0Var4 = this.L;
                            if (sz0Var4 != null) {
                                sz0Var4.setCommonGroupsCount(this.f32158s2.common_chats_count);
                                R();
                                org.telegram.ui.Components.qu0 qu0Var = this.O;
                                if (qu0Var == null || qu0Var.f28266y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f32164t2 == null && !h4()) {
                            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                            this.f32164t2 = f6Var;
                            ob0 ob0Var = new ob0(this, 15);
                            if (f6Var.f21061c) {
                                ob0Var.run();
                            } else {
                                f6Var.h.add(ob0Var);
                            }
                            this.f32164t2.d(this.f32158s2);
                        }
                        if (!h4()) {
                            v01 v01Var = this.f32176v2;
                            v01 c3 = v01.c(this.currentAccount, this.f32158s2, v01Var);
                            this.f32176v2 = c3;
                            if (c3 != v01Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f32170u2 = z4;
                            if (c3 != null) {
                                ob0 ob0Var2 = new ob0(this, 16);
                                if (c3.f39035b) {
                                    ob0Var2.run();
                                } else {
                                    c3.h.add(ob0Var2);
                                }
                            }
                        }
                        if (this.Q0 != null) {
                            if (e4()) {
                                this.Q0.K(44);
                            } else {
                                this.Q0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f32158s2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z14 = true;
                            }
                            this.Q0.I(46, z14);
                            this.Q0.I(47, !z14);
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
                                    if (this.A2 != null) {
                                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (g01Var = this.d) != null) {
                                            g01Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        my0 my0Var3 = this.f32028a;
                        if (my0Var3 != null) {
                            my0Var3.f1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.Z2;
                        int i16 = this.X2;
                        int i17 = this.V2;
                        j5();
                        g01 g01Var2 = this.d;
                        if (g01Var2 != null) {
                            if (i15 != this.Z2 || i16 != this.X2 || i17 != this.V2) {
                                g01Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f32120n1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        r01 r01Var = this.e;
                        if (r01Var != null) {
                            r01Var.f37893c = r01.H(this);
                            this.e.v.clear();
                            this.e.J();
                            r01 r01Var2 = this.e;
                            r01Var2.I(r01Var2.f37900y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                            if (w0Var != null) {
                                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f32037b1)));
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
                                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                                if (e5Var != null && e5Var.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == NotificationCenter.channelRecommendationsLoaded) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.G4 < 0 && longValue3 == a()) {
                                j5();
                                R();
                                g01 g01Var3 = this.d;
                                if (g01Var3 != null) {
                                    g01Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !h4()) {
                                if (this.G4 < 0) {
                                    j5();
                                    R();
                                    g01 g01Var4 = this.d;
                                    if (g01Var4 != null) {
                                        g01Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new ob0(this, 17));
                                    return;
                                }
                                sz0 sz0Var5 = this.L;
                                if (sz0Var5 != null) {
                                    sz0Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f32037b1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f32037b1);
                                if (userFull3 != null) {
                                    this.f32158s2 = userFull3;
                                }
                                j5();
                                R();
                                my0 my0Var4 = this.f32028a;
                                if (my0Var4 != null && my0Var4.b0()) {
                                    this.f32028a.post(new ob0(this, 19));
                                    return;
                                }
                                g01 g01Var5 = this.d;
                                if (g01Var5 != null) {
                                    g01Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.B2;
                            if (chat5 != null && chat5.f19184id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.f32202z1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.D2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.N4;
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        AndroidUtilities.updateVisibleRows(this.f32028a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        wy0 wy0Var4 = this.f32036b0;
                        if (wy0Var4 != null) {
                            wy0Var4.setHasStories(j4());
                            this.f32036b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f32080h2));
                        }
                        zy0 zy0Var4 = this.f32148r0;
                        if (zy0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f32158s2;
                            if (userFull4 != null) {
                                zy0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f32150r2;
                            if (chatFull9 != null) {
                                zy0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f32045c1)))) {
            getMessagesController().getStoriesController().k(a(), new nh.e(13), false, this.f32181w0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null && w40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if ((w40Var == null || dialog != w40Var.f30192c) && super.dismissDialogOnPause(dialog)) {
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
        if (!this.f32128o2 || (userFull = this.f32158s2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void e5(boolean z4, boolean z10) {
        if (this.d == null) {
            if (z4) {
                h5(false);
            }
            j5();
        } else if (!z10 && this.f32028a.isInLayout()) {
            my0 my0Var = this.f32028a;
            if (!my0Var.D) {
                return;
            }
            my0Var.post(new org.telegram.ui.Components.kv0(7, this, z4));
        } else {
            uz0 uz0Var = new uz0(this);
            uz0Var.f39025b = this.K2;
            uz0Var.f(uz0Var.f39026c);
            uz0Var.e.clear();
            uz0Var.f39027f.clear();
            uz0Var.e.addAll(this.N4);
            uz0Var.f39027f.addAll(this.O4);
            uz0Var.f39028g = this.f32152r4;
            uz0Var.h = this.f32160s4;
            if (z4) {
                h5(false);
            }
            F4();
            j5();
            uz0Var.f(uz0Var.d);
            try {
                f2.q.c(uz0Var, true).b(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.R5;
            if (i10 >= 0) {
                this.f32043c.h1(i10, this.S5 - this.f32028a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f32028a);
        }
    }

    @Override
    public final org.telegram.ui.Components.sl0 f() {
        return this.f32028a;
    }

    public final void f4() {
        boolean z4;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f32101k2 = z4;
    }

    public final void f5() {
        int i10;
        if (this.Z != null && this.f32147r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z4 = this.D1;
            if (z4 && this.G1 == 2 && this.V != null) {
                this.Z.setAlpha(this.P1);
                org.telegram.ui.Components.ci0 ci0Var = this.Z;
                float dp = AndroidUtilities.dp(74.0f) + this.f32028a.getMeasuredWidth();
                ci0Var.I = O3() - AndroidUtilities.dp(74.0f);
                ci0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                ci0Var.invalidate();
                return;
            }
            if (z4) {
                this.Z.setAlpha(this.P1);
            }
            float f10 = i11;
            float dp2 = this.N1 + f10 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f10);
            org.telegram.ui.Components.ci0 ci0Var2 = this.Z;
            ci0Var2.I = min - AndroidUtilities.dp(74.0f);
            ci0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            ci0Var2.invalidate();
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.B2;
    }

    public final boolean g4() {
        if (this.B2 != null) {
            return getMessagesController().isChatNoForwards(this.B2);
        }
        return getMessagesController().isUserNoForwards(this.f32158s2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.P1;
    }

    @Override
    public final ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f32181w0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f32181w0 != null) {
            return null;
        }
        cy0 cy0Var = new cy0(0, this);
        ArrayList arrayList = new ArrayList();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            arrayList.addAll(sz0Var.getThemeDescriptions());
        }
        my0 my0Var = this.f32028a;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(my0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, null, null, null, null, i10));
        my0 my0Var2 = this.f32028a;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(my0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f19944f8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20127pc));
        int i12 = org.telegram.ui.ActionBar.j6.f19980h8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20236vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i12));
        org.telegram.ui.Components.io0 io0Var = this.f32155s;
        if (io0Var != null) {
            TextView textView = io0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.j6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, cy0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32155s.getNextTextView(), 4, null, null, null, cy0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32030a1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        wy0 wy0Var = this.f32036b0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20152r0;
        int i14 = org.telegram.ui.ActionBar.j6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(wy0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32036b0, 0, null, null, new Drawable[]{this.m0}, null, org.telegram.ui.ActionBar.j6.f19908d8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.f20255wh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.yh));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20263x6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20103o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i16 = org.telegram.ui.ActionBar.j6.f20067m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.j6.f20298z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.j6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 2, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20218uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i23 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32028a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32035b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z4 = this.C5;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
        if (z4) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.j6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.f32194y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.j6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.f32194y, null, org.telegram.ui.ActionBar.j6.zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f32181w0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32181w0;
        if (f6Var != null) {
            drawable = f6Var.getDrawable(str);
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
        if (this.f32119n0 != null && !this.f32134p1) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z4) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i11 = 0;
        this.f32197y2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.f32203z2.clear();
        TLRPC.ChatFull chatFull = this.f32150r2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z10 && chatFull.participants_count > 200) {
                this.f32197y2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f32150r2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32150r2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f19331id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.f32197y2++;
            }
            this.f32203z2.add(Integer.valueOf(i11));
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
                i11 = yh.e(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = yh.e(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.f32203z2, Comparator$EL.reversed(Comparator$CC.comparingInt(new cf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z4 && this.d != null && this.f32152r4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f32028a);
        }
        if (this.L != null && this.G4 != -1) {
            if ((this.f32203z2.size() > 5 || this.P4 == 2) && this.P4 != 1) {
                this.L.a1(this.f32203z2, this.f32150r2);
            }
        }
    }

    public final void i4(boolean z4) {
        boolean z10;
        boolean isForum = ChatObject.isForum(this.B2);
        TLRPC.Chat chat = this.B2;
        if (!isForum && !z4 && (chat == null || !chat.creator)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.ui.Components.z4.s(this, false, chat, null, false, z10, z4, !isForum, new px0(this, 1));
    }

    public final void i5(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f32113m2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v02;
        if (!this.f32113m2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.s()) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20246w8, this.f32181w0);
            } else if (this.C5) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.f32181w0);
            } else {
                MessagesController.PeerColor peerColor = this.N5;
                if (peerColor != null) {
                    v02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                } else {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, this.f32181w0);
                }
            }
            if (i0.a.f(v02) > 0.699999988079071d) {
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
        if (getMessagesController().getStoriesController().I(a()) && !this.f32120n1) {
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
        if (this.f32071g0 != null && (imageView = this.f32078h0) != null) {
            if (this.I1 && (chat = this.B2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f32078h0.setVisibility(0);
                this.f32071g0.setTag(1);
                this.f32071g0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f32078h0.setVisibility(8);
            this.f32071g0.setTag(null);
            this.f32071g0.setVisibility(8);
        }
    }

    public final void l4(int r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.l4(int, float, boolean):void");
    }

    public final void l5(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        float f11;
        boolean z10;
        if ((this.f32148r0 != null || this.f32156s0 != null) && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                f10 = AndroidUtilities.statusBarHeight;
            } else {
                f10 = 0.0f;
            }
            float width = this.actionBar.getWidth();
            if (this.actionBar.getBackButton() != null) {
                f11 = Math.max(0.0f, this.actionBar.getBackButton().getRight());
            } else {
                f11 = 0.0f;
            }
            boolean z11 = false;
            if (this.actionBar.B != null) {
                for (int i10 = 0; i10 < this.actionBar.B.getChildCount(); i10++) {
                    View childAt = this.actionBar.B.getChildAt(i10);
                    if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                        float left = this.actionBar.B.getLeft() + ((int) childAt.getX());
                        if (left < width) {
                            width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                        }
                    }
                }
            }
            zy0 zy0Var = this.f32148r0;
            if (zy0Var != null) {
                float x10 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(f11 - zy0Var.f32309c0) <= 0.1f && Math.abs(width - zy0Var.f32310d0) <= 0.1f && Math.abs(x10 - zy0Var.f32311e0) <= 0.1f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zy0Var.f32309c0 = f11;
                zy0Var.f32310d0 = width;
                if (z4) {
                    zy0Var.f32317j0.d(width, true);
                }
                zy0Var.f32311e0 = x10;
                if (z10) {
                    zy0Var.invalidate();
                }
            }
            lh.u0 u0Var = this.f32156s0;
            if (u0Var != null) {
                float x11 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
                int U3 = U3();
                z11 = (Math.abs(f11 - u0Var.f13183r) > 0.1f || Math.abs(width - u0Var.f13184s) > 0.1f || Math.abs(x11 - u0Var.v) > 0.1f) ? true : true;
                u0Var.f13183r = f11;
                u0Var.f13184s = width;
                if (z4) {
                    u0Var.f13187y.d(width, true);
                }
                u0Var.v = x11;
                u0Var.f13186x = U3 + x11;
                if (z11) {
                    u0Var.invalidate();
                }
            }
        }
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5():void");
    }

    public final void n4(boolean z4) {
        boolean z10;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32037b1));
        if (user != null) {
            if (this.f32128o2 && !MessagesController.isSupportUser(user)) {
                if (this.f32079h1 && !z4) {
                    getMessagesController().unblockPeer(this.f32037b1, new ob0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.B2;
                if (this.A2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.z4.s(this, false, chat, user, z10, true, false, true, new qx0(this, user));
            } else if (this.f32079h1) {
                getMessagesController().unblockPeer(this.f32037b1);
                if (org.telegram.ui.Components.qc.a(this)) {
                    org.telegram.ui.Components.qc.d(this, false).j();
                }
            } else if (this.f32086i1) {
                org.telegram.ui.Components.z4.j0(this, this.f32037b1, user, null, this.A2, false, null, new ta(this, 4), this.f32181w0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32181w0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new px0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20141q7, this.f32181w0));
                }
            }
        }
    }

    public final void n5(boolean z4) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        float f10;
        TLRPC.ChatFull chatFull;
        int i12 = 0;
        float f11 = 0.2f;
        int i13 = (y3() > 0.2f ? 1 : (y3() == 0.2f ? 0 : -1));
        if (i13 > 0 && !this.T1 && (this.f32119n0 == null || this.L2 == -1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E5 = z10;
        C3();
        org.telegram.ui.Components.jj0 jj0Var = this.v;
        if (jj0Var != null && jj0Var.getVisibility() != 8) {
            org.telegram.ui.Components.jj0 jj0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            jj0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.N1) + this.Q1) - AndroidUtilities.dp(29.5f));
            if (i13 > 0 && !this.T1 && !this.f32134p1 && (this.f32119n0 == null || this.L2 == -1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f32045c1 != 0) {
                if (ChatObject.isChannel(this.B2) && !this.B2.megagroup && (chatFull = this.f32150r2) != null && chatFull.linked_chat_id != 0 && (this.A3 != -1 || this.B3 != -1)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (!this.D1) {
                if (this.v.getTag() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    if (z11) {
                        this.v.setTag(null);
                    } else {
                        this.v.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f32180w;
                    if (animatorSet != null) {
                        this.f32180w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z4) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f32180w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f32180w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f32180w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f32180w.setDuration(150L);
                        this.f32180w.addListener(new jz0(this, 1));
                        this.f32180w.start();
                    } else {
                        org.telegram.ui.Components.jj0 jj0Var3 = this.v;
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        jj0Var3.setScaleX(f10);
                        org.telegram.ui.Components.jj0 jj0Var4 = this.v;
                        if (z11) {
                            f11 = 1.0f;
                        }
                        jj0Var4.setScaleY(f11);
                        org.telegram.ui.Components.jj0 jj0Var5 = this.v;
                        if (z11) {
                            f12 = 1.0f;
                        }
                        jj0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z11 = false;
        }
        zy0 zy0Var = this.f32148r0;
        if (zy0Var != null) {
            float measuredWidth = this.W.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            zy0Var.f32313f0 = measuredWidth;
            zy0Var.f32315h0 = z11;
            zy0Var.f32314g0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            zy0Var.invalidate();
        }
        lh.u0 u0Var = this.f32156s0;
        if (u0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            u0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.N1 + this.Q1);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.G1 == 0) {
            return true;
        }
        return false;
    }

    public final void o4(boolean z4) {
        boolean z10;
        if (this.f32037b1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32037b1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f32158s2;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.f2.n(user, z4, z10, getParentActivity(), this.f32158s2, getAccountInstance());
            }
        } else if (this.f32045c1 != 0) {
            if (getMessagesController().getGroupCall(this.f32045c1, false) == null) {
                TLRPC.Chat chat = this.B2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.y70.t(getParentActivity(), -chat.f19184id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.f2.m(this.B2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.or0 or0Var;
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.e90 e90Var;
        int v02;
        int v03;
        int v04;
        int color3;
        int v05;
        int v06;
        int v07;
        this.O5.clear();
        u01 u01Var = this.f32030a1;
        if (u01Var != null) {
            u01Var.a(this.N5, true);
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32147r;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            if (k5Var.getTag() instanceof Integer) {
                v07 = org.telegram.ui.ActionBar.j6.v0(((Integer) k5VarArr[1].getTag()).intValue(), this.f32181w0);
            } else {
                v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.f32181w0);
            }
            k5VarArr[1].setTextColor(i0.a.d(this.f32080h2, w3(v07, Boolean.valueOf(this.G0[0])), -1275068417));
        }
        s01 s01Var = this.Y5;
        float f10 = -0.1f;
        if (s01Var != null) {
            s01Var.a(i0.a.d(this.f32080h2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.N5 != null) {
                v05 = -1;
            } else {
                v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, this.f32181w0);
            }
            kVar.C(i0.a.d(this.B5, v05, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20283y8, this.f32181w0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.N5;
            if (peerColor != null) {
                v06 = 1090519039;
            } else if (peerColor != null) {
                v06 = 553648127;
            } else {
                v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19944f8, this.f32181w0);
            }
            kVar2.B(i0.a.d(this.B5, v06, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20300z8, this.f32181w0)), false);
        }
        Drawable[] drawableArr = this.f32194y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.N5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.N5.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
                    color3 = this.N5.getColor5();
                } else {
                    color3 = this.N5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.08f;
                }
                v04 = org.telegram.ui.ActionBar.j6.b(0.1f, f10, d);
            } else {
                v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f32181w0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v04, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f32181w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.F;
        if (drawableArr2[1] != null) {
            if (this.N5 != null) {
                v03 = -1;
            } else {
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.f32181w0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(v03, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.f32181w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f32063f[1];
        if (k5Var2 != null) {
            if (this.N5 != null) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20236vh, this.f32181w0);
            }
            k5Var2.setTextColor(i0.a.d(this.f32080h2, i0.a.d(this.B5, v02, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f32181w0)), -1));
        }
        org.telegram.ui.Components.h8 h8Var = this.X0;
        if (h8Var != null && (e90Var = h8Var.e) != null) {
            e90Var.invalidate();
        }
        Drawable drawable = this.f32187x;
        if (drawable != null) {
            if (this.N5 == null) {
                i10 = i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20127pc, this.f32181w0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ci0 ci0Var = this.Z;
        if (ci0Var != null) {
            ci0Var.setColor(this.N5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f32028a, (h5.d) new yx0(this, 1));
        sz0 sz0Var = this.L;
        if (sz0Var != null && (ns0Var = sz0Var.F0) != null) {
            ns0Var.e();
        }
        sz0 sz0Var2 = this.L;
        if (sz0Var2 != null && (or0Var = sz0Var2.S) != null) {
            or0Var.m();
        }
        p5();
        X4();
        zy0 zy0Var = this.f32148r0;
        if (zy0Var != null) {
            zy0Var.f(true, true);
        }
        lh.u0 u0Var = this.f32156s0;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.J;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.U5 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.U5 = true;
        F3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m9;
        org.telegram.ui.Components.ci0 ci0Var;
        org.telegram.ui.Components.jh0 jh0Var;
        super.onConfigurationChanged(configuration);
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f32101k2 && (jh0Var = this.X) != null) {
            jh0Var.i();
        }
        if (this.f32101k2 && (ci0Var = this.Z) != null) {
            ci0Var.b();
        }
        if (this.f32101k2 && this.f32113m2 && (m9 = this.f32043c.m(0)) != null) {
            this.f32028a.scrollBy(0, m9.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ai(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        my0 my0Var = this.f32028a;
        if (my0Var != null) {
            my0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.F0();
        }
        org.telegram.ui.Components.qu0 qu0Var = this.O;
        if (qu0Var != null) {
            qu0Var.b(this);
        }
        org.telegram.ui.Components.qu0 qu0Var2 = this.O;
        if (qu0Var2 != null) {
            qu0Var2.f28265x.remove(this);
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
        xy0 xy0Var = this.f32099k0;
        if (xy0Var != null) {
            xy0Var.K();
        }
        org.telegram.ui.Components.mh0 mh0Var = this.f32092j0;
        if (mh0Var != null) {
            mh0Var.e();
        }
        this.G5 = null;
        if (this.f32037b1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f32037b1);
        } else if (this.f32045c1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        wy0 wy0Var = this.f32036b0;
        if (wy0Var != null) {
            wy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.e();
        }
        bz0 bz0Var = this.S4;
        if (bz0Var != null) {
            bz0Var.b();
        }
        v01 v01Var = this.f32176v2;
        if (v01Var != null && this.f32170u2) {
            v01Var.b(true);
            this.f32176v2 = null;
        }
        org.telegram.messenger.w8 w8Var = this.f32173u5;
        if (w8Var != null) {
            this.f32173u5 = null;
            AndroidUtilities.runOnUIThread(w8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.dt0 dt0Var;
        super.onPause();
        UndoView undoView = this.J;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.j();
        }
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        sz0 sz0Var = this.L;
        if (sz0Var != null && (dt0Var = sz0Var.Q) != null) {
            dt0Var.e = false;
            if (dt0Var.f40839c != null) {
                dt0Var.f40837a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.k(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.B2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] != 0) {
                            z12 = false;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z12) {
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f32045c1, false);
                    TLRPC.Chat chat = this.B2;
                    if (groupCall == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.f2.m(chat, null, z13, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32037b1));
        if (user == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 < iArr.length) {
                if (iArr[i12] != 0) {
                    z4 = false;
                    break;
                }
                i12++;
            } else {
                z4 = true;
                break;
            }
        }
        if (iArr.length > 0 && z4) {
            if (i10 == 102) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.UserFull userFull = this.f32158s2;
            if (userFull != null && userFull.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.voip.f2.n(user, z10, z11, getParentActivity(), this.f32158s2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        gw0 gw0Var;
        super.onResume();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.Y0 = true;
            org.telegram.ui.Components.ct0 ct0Var = sz0Var.E;
            if (ct0Var != null) {
                ct0Var.l();
            }
            org.telegram.ui.Components.lu0 lu0Var = sz0Var.H;
            if (lu0Var != null) {
                lu0Var.l();
            }
            org.telegram.ui.Components.mu0 mu0Var = sz0Var.G;
            if (mu0Var != null) {
                mu0Var.X(false);
            }
            for (int i10 = 0; i10 < sz0Var.f31120h0.length; i10++) {
                sz0Var.U(i10);
            }
            org.telegram.ui.Components.dt0 dt0Var = sz0Var.Q;
            if (dt0Var != null) {
                dt0Var.e = true;
                if (dt0Var.f40839c != null) {
                    dt0Var.f40837a.onResume();
                }
            }
        }
        f4();
        g01 g01Var = this.d;
        if (g01Var != null) {
            this.Q4 = true;
            g01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (gw0Var = this.R) != null && gw0Var.getVisibility() == 0) {
            this.R.setVisibility(8);
            this.R.setBackground(null);
        }
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ai(this, 5));
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f32063f[1];
        if (k5Var != null) {
            setParentActivityTitle(k5Var.getText());
        }
        if (this.f32037b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f32037b1))) != null && user.photo == null && this.N1 >= T3()) {
            this.f32073g2.cancel();
            float[] fArr = this.f32094j2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f32099k0.setVisibility(8);
            this.N1 = T3();
            this.f32107l2 = false;
            this.f32043c.h1(0, T3() - this.f32028a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        c5();
        k4(false);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            if (!z10) {
                int i10 = this.G1;
                if (i10 != 0 && this.J1) {
                    if (i10 == 1) {
                        this.f32080h2 = 0.0f;
                        org.telegram.ui.Components.jw0 jw0Var = this.Q;
                        if (jw0Var != null) {
                            jw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.jh0 jh0Var = this.X;
                        if (jh0Var != null) {
                            jh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ci0 ci0Var = this.Z;
                        if (ci0Var != null) {
                            ci0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.D1 = false;
                    A3();
                    if (this.F1) {
                        D3(true);
                    }
                }
                if (!this.f32090i5) {
                    this.f32090i5 = true;
                    this.R4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.M4);
            gw0 gw0Var = this.R;
            if (gw0Var != null && gw0Var.getVisibility() == 0) {
                this.R.setVisibility(8);
                this.R.setBackground(null);
            }
        }
        this.E1 = false;
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        gw0 gw0Var = this.R;
        if (gw0Var != null && gw0Var.getVisibility() == 0) {
            if (z4) {
                this.R.setAlpha(1.0f - f10);
            } else {
                this.R.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        ImageView imageView;
        org.telegram.ui.Components.jh0 jh0Var;
        super.onTransitionAnimationStart(z4, z10);
        this.J5 = z4;
        if (z4 && (jh0Var = this.X) != null) {
            ArrayList arrayList = jh0Var.f25981a;
            if (jh0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.gh0 gh0Var = (org.telegram.ui.Components.gh0) arrayList.get(i10);
                    org.telegram.ui.Components.gj0 gj0Var = gh0Var.f25129k;
                    if (gj0Var != null) {
                        if (gh0Var.f25122a == 15) {
                            gj0Var.K(14);
                        } else {
                            gj0Var.K(0);
                        }
                        gh0Var.f25129k.start();
                    }
                }
            }
        }
        if (!z4 && (imageView = this.L0) != null && imageView.getTag() != null && (this.L0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.L0.getTag()).setAlpha(1.0f);
        }
        if (((!z4 && z10) || (z4 && !z10)) && this.G1 != 0 && this.J1 && !this.f32113m2) {
            this.D1 = true;
            if (!z4) {
                if (this.G5 == null) {
                    this.G5 = new float[16];
                }
                this.C1 = this.N1;
                this.G5[0] = this.V.getScaleX();
                this.G5[1] = this.V.getTranslationX();
                this.G5[2] = this.V.getTranslationY();
                org.telegram.ui.Components.jh0 jh0Var2 = this.X;
                if (jh0Var2 != null) {
                    this.G5[3] = jh0Var2.getAlpha();
                }
                lh.u0 u0Var = this.f32156s0;
                if (u0Var != null) {
                    float[] fArr = this.G5;
                    fArr[4] = u0Var.e;
                    fArr[5] = u0Var.f13181f;
                }
                s01 s01Var = this.Y5;
                if (s01Var != null) {
                    this.G5[6] = s01Var.getAlpha();
                }
                float[] fArr2 = this.G5;
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
                fArr2[7] = k5VarArr[1].getScaleX();
                this.G5[8] = k5VarArr[1].getTranslationY();
                float[] fArr3 = this.G5;
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.f32147r;
                fArr3[9] = k5VarArr2[1].getTranslationY();
                this.G5[10] = k5VarArr[1].getLayoutParams().width;
                this.G5[11] = this.Z1;
                for (int i11 = 0; i11 < k5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i11];
                    if (k5Var != null) {
                        int i12 = i11 * 2;
                        this.G5[i12 + 12] = k5Var.getTranslationX();
                        this.G5[i12 + 13] = k5VarArr2[i11].getTranslationX();
                    }
                }
                ph.f3 f3Var = this.f32034a6;
                if (f3Var != null) {
                    f3Var.e(true);
                }
            }
        }
        if (z4) {
            if (this.f32119n0 != null) {
                this.M4 = getNotificationCenter().setAnimationInProgress(this.M4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.M4 = getNotificationCenter().setAnimationInProgress(this.M4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z10 && getParentActivity() != null) {
                this.V4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.E1 = true;
        B3();
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.f32158s2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.B2 != null) {
            org.telegram.ui.Components.l40.h.a();
        }
        showDialog(new kh.h2(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xh, this.f32181w0);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yh, this.f32181w0);
                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20255wh, this.f32181w0);
                if (this.N5 != null && org.telegram.ui.ActionBar.j6.b1(v02)) {
                    v02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.N5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.N5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                        v03 = org.telegram.ui.ActionBar.j6.C(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, this.f32181w0), bgColor2, v03, bgColor2);
                    }
                    v04 = -1;
                }
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(mutate, org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                nqVar.e = dp;
                nqVar.f27338f = dp2;
                this.v.setBackground(nqVar);
                this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean q() {
        return this.J5;
    }

    public final void q4(boolean z4) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.B2.f19184id, getUserConfig().getCurrentUser(), 0, null, this, true, new vq0(this, z4, zArr, 1), new o9.b(this, zArr, z4, this.parentLayout.getLastFragment(), 4));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void r4(View view, float f10, float f11, boolean z4) {
        float f12;
        float f13;
        long j10;
        long j11 = this.f32065f1;
        if (j11 == 0) {
            j11 = this.f32037b1;
            if (j11 == 0) {
                j11 = -this.f32045c1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f32051d1);
        if (z4 && (this.f32120n1 || isDialogMuted)) {
            boolean z10 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f32051d1, z10);
            org.telegram.ui.Components.qc.A(this, z10, null).j();
            a5();
            this.X.setNotifications(isDialogMuted);
        } else if ((!z4 && LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z11 = j5Var.e.h;
            boolean z12 = !z11;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f32051d1);
            if (!z11) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f32051d1 == 0) {
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
                if (this.f32051d1 == 0) {
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
            getNotificationsController().updateServerNotificationsSettings(j12, this.f32051d1);
            j5Var.setChecked(z12);
            org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.f32028a.L(this.K3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(getParentActivity(), this.currentAccount, null, true, new f2.c(this, j12, 6), this.f32181w0);
            loVar.d(j12, this.f32051d1, this.f32062e5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z4) {
                f13 += this.X.getHeight() - AndroidUtilities.dp(12.0f);
            }
            loVar.c(this, view, f12, f13, z4);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null) {
            w40Var.f30193f = bundle.getString("path");
        }
    }

    @Override
    public final void s() {
        this.f32028a.x0(0);
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f32037b1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32037b1));
                if (user != null) {
                    if (this.C2 != null && (userFull = this.f32158s2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f32158s2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f32045c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f32045c1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f32150r2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f32150r2.about, ChatObject.getPublicUsername(chat));
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
        org.telegram.ui.Components.w40 w40Var = this.f32119n0;
        if (w40Var != null && (str = w40Var.f30193f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f10) {
        int v02;
        int v03;
        int v04;
        int i10;
        int w32;
        int w33;
        this.f32080h2 = f10;
        this.P1 = f10;
        B3();
        if (this.G1 == 2) {
            this.f32036b0.setProgressToExpand(f10);
            org.telegram.ui.Components.jh0 jh0Var = this.X;
            if (jh0Var != null) {
                jh0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            if (ci0Var != null) {
                ci0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.jw0 jw0Var = this.Q;
            if (jw0Var != null) {
                jw0Var.setParentExpanded(f10);
            }
            S4();
            f5();
        }
        this.f32028a.setAlpha(f10);
        this.f32028a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f10));
        if (this.G1 != 2 || (v02 = this.f32126o0) == 0) {
            if (this.f32037b1 == 0 && ChatObject.isChannel(this.f32045c1, this.currentAccount)) {
                boolean z4 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f32181w0;
            int[][] iArr = org.telegram.ui.Components.z8.C;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, f6Var);
        }
        int i11 = this.U4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, this.f32181w0);
        }
        this.f32030a1.setBackgroundColor(i0.a.d(f10, i0.a.k(i11, 0), v02));
        org.telegram.ui.Components.x11 x11Var = this.f32085i0;
        int d = i0.a.d(f10, i11, v02);
        x11Var.f30515k = true;
        x11Var.f30509b.setColor(d);
        int i12 = -1;
        if (this.N5 != null) {
            v03 = -1;
        } else {
            if (this.f32037b1 == 0 && ChatObject.isChannel(this.f32045c1, this.currentAccount)) {
                boolean z10 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.f32181w0;
            int[][] iArr2 = org.telegram.ui.Components.z8.C;
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19962g8, f6Var2);
        }
        this.actionBar.C(i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, this.f32181w0), v03), false);
        if (this.N5 == null) {
            i12 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20236vh, this.f32181w0);
        }
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.f32181w0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.k5 k5Var = this.f32063f[i13];
            if (k5Var != null && (i13 != 1 || this.G1 != 2)) {
                k5Var.setTextColor(i0.a.d(f10, v05, i12));
            }
        }
        boolean[] zArr = this.G0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bh, this.f32181w0);
        } else {
            if (this.f32037b1 == 0 && ChatObject.isChannel(this.f32045c1, this.currentAccount)) {
                boolean z11 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.f32181w0;
            int[][] iArr3 = org.telegram.ui.Components.z8.C;
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19980h8, f6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.j6.f20125pa;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.B8;
        }
        int v06 = org.telegram.ui.ActionBar.j6.v0(i10, this.f32181w0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.k5 k5Var2 = this.f32147r[i14];
            if (k5Var2 != null && i14 != 1 && (i14 != 2 || this.G1 != 2)) {
                if (i14 == 0) {
                    w32 = v06;
                } else {
                    w32 = w3(v06, Boolean.valueOf(zArr[0]));
                }
                if (i14 == 0) {
                    w33 = v04;
                } else {
                    w33 = w3(v04, Boolean.valueOf(zArr[0]));
                }
                k5Var2.setTextColor(i0.a.d(f10, w32, w33));
            }
        }
        this.N1 = this.O1 * f10;
        long j10 = this.f32037b1;
        if (j10 == 0) {
            j10 = this.f32045c1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.f32181w0;
        int[][] iArr4 = org.telegram.ui.Components.z8.C;
        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.e(j10)], f6Var4);
        long j11 = this.f32037b1;
        if (j11 == 0) {
            j11 = this.f32045c1;
        }
        int d10 = org.telegram.ui.Components.z8.d(j11);
        if (v07 != d10) {
            this.m0.h(i0.a.d(f10, d10, v07));
            this.f32036b0.invalidate();
        }
        int i15 = this.V4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f10, i15, getNavigationBarColor()));
        }
        this.f32030a1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        b01 b01Var = this.K5;
        if (b01Var != null) {
            b01Var.invalidate();
        }
        if (a() > 0) {
            wy0 wy0Var = this.f32036b0;
            if (wy0Var != null) {
                wy0Var.setProgressToStoriesInsets(this.P1);
            }
            zy0 zy0Var = this.f32148r0;
            if (zy0Var != null) {
                zy0Var.setProgressToStoriesInsets(this.P1);
            }
            lh.u0 u0Var = this.f32156s0;
            if (u0Var != null) {
                u0Var.setProgressToStoriesInsets(this.P1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.e5 e5Var) {
        super.setParentLayout(e5Var);
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.U1 = null;
        }
        if (e5Var != null && e5Var.getParentActivity() != null) {
            this.U1 = new FlagSecureReason(e5Var.getParentActivity().getWindow(), new px0(this, 6));
        }
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.I3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f32045c1);
            bundle.putLong("user_id", this.f32037b1);
            presentFragment(new m21(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.R2) {
            if (this.f32037b1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f32158s2)) {
                org.telegram.ui.Components.qc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f32037b1)))).j();
            } else {
                showDialog(new kh.h2(getParentActivity(), this.currentAccount, this.f32037b1, null, null));
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u4() {
        boolean z4;
        org.telegram.ui.Components.gj0 gj0Var;
        if (this.f32037b1 != 0) {
            if (this.f32119n0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.w40 w40Var = this.f32119n0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    w40Var.o(z4, new ob0(this, 24), new v5(this, 14), 0);
                    this.S.K(0);
                    this.S.N(43);
                    this.T.K(0);
                    this.T.N(43);
                    org.telegram.ui.Components.jh0 jh0Var = this.X;
                    if (jh0Var != null) {
                        org.telegram.ui.Components.gh0 j10 = org.telegram.ui.Components.jh0.j(14, jh0Var.f25981a);
                        if (j10 != null && (gj0Var = j10.f25129k) != null) {
                            gj0Var.start();
                        }
                    } else {
                        this.v.d();
                    }
                    org.telegram.ui.Cells.o8 o8Var = this.J2;
                    if (o8Var != null) {
                        o8Var.getImageView().d();
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

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f32065f1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zs(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = android.support.v4.media.a.i("addToGroup", true);
        i10.putLong("chatId", this.B2.f19184id);
        y60 y60Var = new y60(i10);
        TLRPC.ChatFull chatFull = this.f32150r2;
        y60Var.F = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.f32150r2.participants.participants.size(); i11++) {
                hVar.k(null, this.f32150r2.participants.participants.get(i11).user_id);
            }
            y60Var.G = hVar;
        }
        y60Var.f40436x = new px0(this, 9);
        presentFragment(y60Var);
    }

    @Override
    public final boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, oyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new xn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f32037b1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z10, i10, i11, 0L);
        }
        return true;
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.N5 != null) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, this.f32181w0);
            int d = i0.a.d(0.5f, this.N5.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), this.N5.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()));
            if (!org.telegram.ui.ActionBar.j6.b1(v02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.j6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.j6.l1(0.7f, d));
                }
                return d;
            }
            boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.j6.l1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.j6.C(q10, v02, d, i10, i11);
        }
        return i10;
    }

    public final void w4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.w4(boolean):void");
    }

    public final void x3() {
        int i10;
        int i11;
        if (this.G5 != null) {
            ValueAnimator valueAnimator = this.f32073g2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f32073g2.cancel();
            }
            float clamp01 = Utilities.clamp01(this.N1 / this.C1);
            if (clamp01 > 0.0f) {
                float f10 = (clamp01 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.Y1 = AndroidUtilities.lerp(0.42f, this.G5[0], clamp01);
                this.W1 = AndroidUtilities.lerp(this.L5, this.G5[1], clamp01);
                this.X1 = AndroidUtilities.lerp(translationY, this.G5[2], clamp01);
                this.Z1 = AndroidUtilities.lerp(this.G5[11], 0.0f, clamp01);
                this.V.setScaleX(this.Y1);
                this.V.setScaleY(this.Y1);
                this.V.setTranslationX(this.W1);
                this.V.setTranslationY(this.X1);
                org.telegram.ui.Components.jw0 jw0Var = this.Q;
                if (jw0Var != null) {
                    jw0Var.setAlpha(clamp01);
                }
                this.f32036b0.setAlpha(1.0f);
                this.V.setAlpha(1.0f);
                zy0 zy0Var = this.f32148r0;
                if (zy0Var != null) {
                    zy0Var.invalidate();
                }
                lh.u0 u0Var = this.f32156s0;
                if (u0Var != null) {
                    u0Var.e = AndroidUtilities.lerp(0.0f, this.G5[4], f10);
                    this.f32156s0.f13181f = AndroidUtilities.lerp(0.0f, this.G5[5], clamp01);
                    lh.u0 u0Var2 = this.f32156s0;
                    u0Var2.h = true;
                    u0Var2.invalidate();
                }
                s01 s01Var = this.Y5;
                if (s01Var != null) {
                    s01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.G5[6], clamp01));
                }
                float dp = (((this.Y1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f32057e0.setTranslationX(this.V.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f32057e0.setTranslationY(this.V.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f32064f0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32064f0.setTranslationY(this.V.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f32071g0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32071g0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f32078h0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32078h0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.G5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f32038b2 = AndroidUtilities.lerp(floor, this.G5[8], clamp01);
                this.f32052d2 = AndroidUtilities.lerp(dpf2, this.G5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
                    if (i13 >= k5VarArr.length) {
                        break;
                    }
                    if (k5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i14 + 13], clamp01);
                        k5VarArr[i13].setTranslationX(lerp2);
                        k5VarArr[i13].setTranslationY(this.f32038b2);
                        org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.f32147r;
                        k5VarArr2[i13].setTranslationX(this.f32110l5 + lerp3);
                        k5VarArr2[i13].setTranslationY(this.f32052d2);
                        if (i13 == 1) {
                            this.a2 = lerp2;
                            this.f32046c2 = lerp3;
                            this.f32155s.setTranslationX(lerp3);
                            this.f32155s.setTranslationY(this.f32052d2);
                        }
                        k5VarArr[i13].setScaleX(lerp);
                        k5VarArr[i13].setScaleY(lerp);
                    }
                    i13++;
                }
                V4();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                l4((int) this.G5[10], clamp01, true);
                org.telegram.ui.Components.jh0 jh0Var = this.X;
                if (jh0Var != null) {
                    jh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.G5[3], f10));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f32037b1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f32037b1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f32037b1);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                boolean z4 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!AndroidUtilities.isTablet() && z4) {
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i10 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(this, i10);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
                }
                int i11 = getArguments().getInt("nearby_distance", -1);
                if (i11 >= 0) {
                    bundle.putInt("nearby_distance", i11);
                }
                xn xnVar = new xn(bundle);
                xnVar.f40257y9 = getMediaDataController().getGreetingsSticker();
                xnVar.f40269z9 = false;
                presentFragment(xnVar, z4);
                if (AndroidUtilities.isTablet() && !this.F0) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final sg.d y() {
        return this.f32105k6;
    }

    public final float y3() {
        return Utilities.clamp01((this.N1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.f32150r2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f32150r2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new xn(bundle));
            }
        }
    }

    public final void z3() {
        int i10;
        int i11 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        this.X1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.Y1 = 1.38f;
        this.Z1 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f32063f;
            if (i11 >= k5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i11];
            if (k5Var != null) {
                float measuredWidth = (this.f32028a.getMeasuredWidth() / 2.0f) - (((k5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) k5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.f32147r;
                float measuredWidth2 = (this.f32028a.getMeasuredWidth() / 2.0f) - ((k5VarArr2[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) k5VarArr2[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.a2 = measuredWidth;
                    this.f32046c2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.G1 != 2) {
            this.f32148r0.setAlpha(1.0f);
        }
        this.V.setAlpha(1.0f);
        this.f32036b0.setAlpha(1.0f);
    }

    public final void z4(boolean z4) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f32158s2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z4) {
                nh.i8 i8Var = new nh.i8(3, 1);
                i8Var.setResourceProvider(this.f32181w0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f32158s2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                i8Var.L0 = false;
                i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(i8Var);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f32158s2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.qu0 qu0Var) {
        super(bundle);
        this.f32063f = new org.telegram.ui.ActionBar.k5[2];
        this.h = null;
        this.f32118n = null;
        this.f32147r = new org.telegram.ui.ActionBar.k5[4];
        this.f32194y = new Drawable[2];
        this.B = new Drawable[2];
        this.D = new org.telegram.ui.Components.j5[2];
        this.E = new org.telegram.ui.Components.j5[2];
        this.F = new Drawable[2];
        this.G = new org.telegram.ui.Components.mr[2];
        this.H = new org.telegram.ui.Components.mr[2];
        this.f32162t0 = null;
        this.f32168u0 = new org.telegram.ui.Components.i50(this, 1);
        this.f32174v0 = new Paint(1);
        this.G0 = new boolean[1];
        this.Y0 = 1.0f;
        this.f32202z1 = new a0.h();
        this.J1 = true;
        this.K1 = false;
        this.L1 = false;
        this.M1 = false;
        this.V1 = new HashMap();
        this.f32094j2 = new float[]{0.0f, 1.0f};
        this.f32121n2 = new Paint();
        this.f32197y2 = -1;
        this.I2 = new Rect();
        this.N4 = new ArrayList();
        this.O4 = new ArrayList();
        this.P4 = 0;
        this.Q4 = true;
        this.R4 = true;
        this.U4 = 0;
        this.V4 = 0;
        this.W4 = 0;
        this.X4 = 0L;
        this.f32062e5 = new HashSet();
        this.f32076g5 = new org.telegram.ui.Cells.c2(this);
        this.f32083h5 = new hz0(this);
        this.f32193x5 = new xd.a(0, new px0(this, 8), org.telegram.ui.Components.nr.h, 380L, true);
        this.D5 = new iz0(this);
        this.F5 = new jz0(this, 0);
        this.G5 = null;
        this.O5 = new SparseIntArray();
        this.Q5 = null;
        this.R5 = -1;
        this.V5 = -1.0f;
        sg.b bVar = new sg.b();
        this.f32117m6 = bVar;
        ng.a aVar = new ng.a(bVar);
        this.f32125n6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.f32146q6 = arrayList;
        RectF rectF = new RectF();
        this.f32154r6 = rectF;
        RectF rectF2 = new RectF();
        this.s6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.O = qu0Var;
        sg.c cVar = new sg.c();
        cVar.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.f32181w0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f32098j6 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.f32105k6 = dVar;
            ng.a aVar2 = new ng.a(dVar);
            this.f32111l6 = aVar2;
            aVar2.f14972f = LiteMode.isEnabled(262144);
        } else {
            this.f32098j6 = null;
            this.f32105k6 = null;
            this.f32111l6 = new ng.a(cVar);
        }
        aVar.f14971c = new be.b(true);
    }

    @Override
    public final void P() {
    }
}

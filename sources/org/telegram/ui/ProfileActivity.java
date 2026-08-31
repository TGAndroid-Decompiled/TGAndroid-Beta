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
public class ProfileActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, jy, org.telegram.ui.Components.su0, org.telegram.ui.Components.x40, org.telegram.ui.Components.kt0, vg0 {
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
    public final kz0 D5;
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
    public final lz0 F5;
    public final org.telegram.ui.Components.or[] G;
    public final boolean[] G0;
    public int G1;
    public TLRPC.FileLocation G2;
    public int G3;
    public int G4;
    public float[] G5;
    public final org.telegram.ui.Components.or[] H;
    public boolean H0;
    public boolean H1;
    public ImageLocation H2;
    public int H3;
    public int H4;
    public float H5;
    public org.telegram.ui.Components.gm0 I;
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
    public j01 K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public int K3;
    public boolean K4;
    public d01 K5;
    public uz0 L;
    public ImageView L0;
    public boolean L1;
    public int L2;
    public int L3;
    public boolean L4;
    public float L5;
    public org.telegram.ui.Components.ax0 M;
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
    public org.telegram.ui.Components.ru0 O;
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
    public org.telegram.ui.Components.kw0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public int Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public AnimatorSet Q5;
    public iw0 R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public int R5;
    public org.telegram.ui.Components.ij0 S;
    public org.telegram.ui.ActionBar.g1 S0;
    public ValueAnimator S1;
    public int S2;
    public int S3;
    public dz0 S4;
    public int S5;
    public org.telegram.ui.Components.ij0 T;
    public org.telegram.ui.ActionBar.g1 T0;
    public boolean T1;
    public int T2;
    public int T3;
    public View T4;
    public boolean T5;
    public org.telegram.ui.Components.m40 U;
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
    public ag.l W;
    public org.telegram.ui.ActionBar.g1 W0;
    public float W1;
    public int W2;
    public int W3;
    public int W4;
    public float W5;
    public org.telegram.ui.Components.lh0 X;
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
    public t01 Y5;
    public org.telegram.ui.Components.ei0 Z;
    public int Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public boolean Z4;
    public a11 Z5;
    public oy0 f34560a;
    public org.telegram.ui.Cells.o f34561a0;
    public v01 f34562a1;
    public float a2;
    public int f34563a3;
    public int f34564a4;
    public String f34565a5;
    public qh.f3 f34566a6;
    public org.telegram.ui.Components.tl0 f34567b;
    public yy0 f34568b0;
    public long f34569b1;
    public float f34570b2;
    public int f34571b3;
    public int f34572b4;
    public String f34573b5;
    public int f34574b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public qy0 f34575c;
    public AnimatorSet f34576c0;
    public long f34577c1;
    public float f34578c2;
    public int c3;
    public int f34579c4;
    public String f34580c5;
    public Boolean f34581c6;
    public i01 d;
    public org.telegram.ui.Cells.y3 f34582d0;
    public long f34583d1;
    public float f34584d2;
    public int f34585d3;
    public int f34586d4;
    public org.telegram.ui.Components.rg f34587d5;
    public TLRPC.TL_emojiStatusCollectible f34588d6;
    public s01 f34589e;
    public ImageView f34590e0;
    public boolean f34591e1;
    public float f34592e2;
    public int f34593e3;
    public int f34594e4;
    public final HashSet f34595e5;
    public int e6;
    public final org.telegram.ui.ActionBar.l5[] f34596f;
    public ImageView f34597f0;
    public long f34598f1;
    public float f34599f2;
    public int f34600f3;
    public int f34601f4;
    public CharacterStyle f34602f5;
    public boolean f34603f6;
    public ImageView f34604g0;
    public boolean f34605g1;
    public ValueAnimator f34606g2;
    public int f34607g3;
    public int f34608g4;
    public final org.telegram.ui.Cells.c2 f34609g5;
    public int f34610g6;
    public String h;
    public ImageView f34611h0;
    public boolean f34612h1;
    public float f34613h2;
    public int f34614h3;
    public int f34615h4;
    public final jz0 f34616h5;
    public int f34617h6;
    public org.telegram.ui.Components.y11 f34618i0;
    public boolean f34619i1;
    public float f34620i2;
    public int f34621i3;
    public int f34622i4;
    public boolean f34623i5;
    public int f34624i6;
    public org.telegram.ui.Components.oh0 f34625j0;
    public long f34626j1;
    public final float[] f34627j2;
    public int f34628j3;
    public int f34629j4;
    public sz0 f34630j5;
    public final og.e f34631j6;
    public zy0 f34632k0;
    public boolean f34633k1;
    public boolean f34634k2;
    public int f34635k3;
    public int f34636k4;
    public float f34637k5;
    public final tg.d f34638k6;
    public l01 f34639l0;
    public boolean l1;
    public boolean f34640l2;
    public int f34641l3;
    public int f34642l4;
    public float f34643l5;
    public final og.a f34644l6;
    public org.telegram.ui.Components.z8 m0;
    public boolean f34645m1;
    public boolean f34646m2;
    public int f34647m3;
    public int f34648m4;
    public boolean f34649m5;
    public final tg.b f34650m6;
    public String f34651n;
    public org.telegram.ui.Components.y40 f34652n0;
    public boolean f34653n1;
    public final Paint f34654n2;
    public int f34655n3;
    public int f34656n4;
    public boolean f34657n5;
    public final og.a f34658n6;
    public int f34659o0;
    public boolean f34660o1;
    public boolean f34661o2;
    public int f34662o3;
    public int f34663o4;
    public ImageReceiver f34664o5;
    public vg.i f34665o6;
    public org.telegram.ui.Components.y11 f34666p0;
    public boolean f34667p1;
    public sh.q0 f34668p2;
    public int f34669p3;
    public int f34670p4;
    public FrameLayout f34671p5;
    public cy0 f34672p6;
    public org.telegram.ui.Components.bi0 f34673q0;
    public boolean f34674q1;
    public sh.p f34675q2;
    public int f34676q3;
    public int f34677q4;
    public FrameLayout[] f34678q5;
    public final ArrayList f34679q6;
    public final org.telegram.ui.ActionBar.l5[] f34680r;
    public bz0 f34681r0;
    public int f34682r1;
    public TLRPC.ChatFull f34683r2;
    public int f34684r3;
    public int f34685r4;
    public SpannableStringBuilder f34686r5;
    public final RectF f34687r6;
    public org.telegram.ui.Components.jo0 f34688s;
    public mh.t0 f34689s0;
    public boolean f34690s1;
    public TLRPC.UserFull f34691s2;
    public int f34692s3;
    public int f34693s4;
    public SpannableStringBuilder f34694s5;
    public final RectF s6;
    public View f34695t0;
    public boolean f34696t1;
    public org.telegram.ui.Cells.f6 f34697t2;
    public int f34698t3;
    public int f34699t4;
    public qh.d[] f34700t5;
    public final org.telegram.ui.Components.k50 f34701u0;
    public boolean f34702u1;
    public boolean f34703u2;
    public int f34704u3;
    public int f34705u4;
    public org.telegram.messenger.w8 f34706u5;
    public org.telegram.ui.Components.lj0 v;
    public final Paint f34707v0;
    public int f34708v1;
    public x01 f34709v2;
    public int f34710v3;
    public int f34711v4;
    public FrameLayout f34712v5;
    public AnimatorSet f34713w;
    public org.telegram.ui.ActionBar.g6 f34714w0;
    public boolean f34715w1;
    public CharSequence f34716w2;
    public int f34717w3;
    public int f34718w4;
    public qh.d f34719w5;
    public Drawable f34720x;
    public int f34721x0;
    public boolean f34722x1;
    public long f34723x2;
    public int f34724x3;
    public int f34725x4;
    public final xd.a f34726x5;
    public final Drawable[] f34727y;
    public ImageLocation f34728y0;
    public boolean f34729y1;
    public int f34730y2;
    public int f34731y3;
    public int f34732y4;
    public fz0 f34733y5;
    public int f34734z0;
    public a0.h f34735z1;
    public ArrayList f34736z2;
    public int f34737z3;
    public int z4;
    public AnimatorSet f34738z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f10;
        RectF rectF = profileActivity.s6;
        og.e eVar = profileActivity.f34631j6;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f34624i6) - AndroidUtilities.dp(8.0f);
            profileActivity.f34687r6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(2, profileActivity.f34679q6);
            eVar.e(profileActivity.f34672p6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.zu0.w0(profileActivity.L.getClosestTab());
        if (i10 == profileActivity.e6 && w02 == profileActivity.f34603f6) {
            return;
        }
        profileActivity.e6 = i10;
        profileActivity.f34603f6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f34700t5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f34700t5[0].g(profileActivity.f34694s5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f34700t5[0].g(profileActivity.f34686r5, true, true);
        } else {
            profileActivity.f34700t5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        z00 z00Var = new z00(9);
        z00Var.f43757n = str;
        if (z00Var.f43754c != null) {
            z00Var.f43754c = null;
            z00Var.a();
        }
        z00Var.f43756f = i10;
        spannableStringBuilder.setSpan(z00Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z4) {
        float f10;
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
        if (z4) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.S1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.S1.cancel();
        }
        mh.t0 t0Var = profileActivity.f34689s0;
        if (t0Var != null) {
            t0Var.setActive(!z4);
        }
        float f11 = profileActivity.R1;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        final float f12 = profileActivity.N1;
        profileActivity.f34567b.setTranslationY(f12);
        profileActivity.f34567b.setVisibility(0);
        profileActivity.R0.setVisibility(0);
        profileActivity.f34560a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.V.setVisibility(0);
        profileActivity.f34596f[1].setVisibility(0);
        l5VarArr[1].setVisibility(0);
        l5VarArr[3].setVisibility(0);
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
        profileActivity.f34567b.setEmptyView(profileActivity.M);
        profileActivity.V.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f12, z4);
            }
        });
        ofFloat.addListener(new mz0(profileActivity, z4, 0));
        if (!z4) {
            profileActivity.R4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.M.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f30183f);
        profileActivity.S1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z4) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        d2Var.f21241d0 = false;
        d2Var.show();
        Utilities.globalQueue.postRunnable(new xq0(d2Var, z4, activity, 2));
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

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.l5 l5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            af.g.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        fg.d2 d2Var = new fg.d2(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f34714w0);
        l5Var.getLocationOnScreen(new int[2]);
        d2Var.f6291s0 = l5Var.f22096e0;
        d2Var.f6292t0 = l5Var.f22098f0;
        d2Var.f6295w0 = l5Var.getScaleX();
        d2Var.f6293u0 = l5Var.getLeft();
        d2Var.f6294v0 = l5Var.getTop();
        d2Var.f6296x0 = l5Var;
        Drawable rightDrawable = l5Var.getRightDrawable();
        org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
        if (rightDrawable == j5Var && j5Var != null) {
            Drawable drawable = j5Var.f27998f[0];
            if (drawable instanceof org.telegram.ui.Components.l5) {
                d2Var.f6295w0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.l5) drawable).f28599e;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f);
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
                    if (((org.telegram.ui.Components.l5) j5VarArr[1].f27998f[0]).c()) {
                        p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21979v6, profileActivity.f34714w0), PorterDuff.Mode.SRC_IN));
                        d2Var.f6298z0 = MessageObject.getInputStickerSet(document);
                    } else {
                        d2Var.f6298z0 = MessageObject.getInputStickerSet(document);
                    }
                    d2Var.f6297y0 = p9Var;
                    d2Var.B0 = true;
                }
            }
        }
        profileActivity.showDialog(d2Var);
    }

    public static void V(ProfileActivity profileActivity) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
        oy0 oy0Var = profileActivity.f34560a;
        if (oy0Var != null) {
            int childCount = oy0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f34560a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                }
            }
            profileActivity.f34560a.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, profileActivity.f34714w0));
        }
        if (!profileActivity.f34646m2) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
            if (l5Var != null) {
                Object tag = l5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        l5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.k6.v0(((Integer) tag).intValue(), profileActivity.f34714w0), Boolean.valueOf(profileActivity.G0[0])));
                    } else {
                        l5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B8, profileActivity.f34714w0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f34720x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.N5 != null) {
                    v03 = -1;
                } else {
                    v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21881pc, profileActivity.f34714w0);
                }
                drawable.setColorFilter(v03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.gm0 gm0Var = profileActivity.I;
            if (gm0Var != null) {
                gm0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21734h8, profileActivity.f34714w0));
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = profileActivity.f34596f[1];
            if (l5Var2 != null) {
                l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21990vh, profileActivity.f34714w0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                if (profileActivity.N5 == null) {
                    i12 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
                }
                kVar.C(i12, false);
                org.telegram.ui.ActionBar.k kVar2 = profileActivity.actionBar;
                if (profileActivity.N5 != null) {
                    v02 = 553648127;
                } else {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21698f8, profileActivity.f34714w0);
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
        if (profileActivity.f34653n1) {
            profileActivity.f34673q0.setAlpha(1.0f - min);
            profileActivity.f34673q0.setBlurIntensity(0.0f);
            profileActivity.f34673q0.setGooeyEnabled(false);
        } else {
            profileActivity.f34673q0.setPullProgress(profileActivity.Z1);
            profileActivity.f34673q0.setBlurIntensity(Math.min((k7.o.a(profileActivity.Z1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.bi0 bi0Var = profileActivity.f34673q0;
            float f11 = profileActivity.Z1;
            if (f11 > 0.0f && f11 < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            bi0Var.setGooeyEnabled(z4);
        }
        bz0 bz0Var = profileActivity.f34681r0;
        if (bz0Var != null && profileActivity.G1 != 2) {
            float f12 = profileActivity.Z1;
            if (f12 > 0.0f) {
                f10 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f12, 0.0f, 0.5f));
            } else {
                f10 = 1.0f;
            }
            bz0Var.setAlpha(f10);
        }
        org.telegram.ui.Components.bi0 bi0Var2 = profileActivity.f34673q0;
        if (profileActivity.Z1 >= 1.0f) {
            i10 = 8;
        }
        bi0Var2.setVisibility(i10);
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
            Q.f27745j = 5000;
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
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f21166a);
                return;
            }
            return;
        }
        l.d.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f10, float f11) {
        switch (i10) {
            case 0:
                boolean z4 = profileActivity.f34653n1;
                if (z4) {
                    if (z4) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f34569b1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f34577c1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f34577c1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f34577c1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new xn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f34577c1);
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
                m31.K(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(profileActivity.getParentActivity(), 3, profileActivity.f34714w0);
                d2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new oh.a2(7, profileActivity, d2Var), true, profileActivity.f34714w0);
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
                    org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(profileActivity, profileActivity.X);
                    H.f30332w = false;
                    H.f30311i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new pb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new gl0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new pb0(profileActivity, 23), false);
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
                profileActivity.presentFragment(new p81(null));
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
        edit.putLong("dialog_join_requested_time_" + profileActivity.f34598f1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.B2) && !profileActivity.B2.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = org.telegram.ui.Components.j80.f28068r;
        org.telegram.ui.Components.j80.w(parentActivity, profileActivity, org.telegram.ui.Components.qc.a0(profileActivity), z10);
        if (!z4 || profileActivity.I4 != -1) {
            profileActivity.j5();
            i01 i01Var = profileActivity.d;
            if (i01Var != null) {
                i01Var.l();
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
            if (profileActivity.f34653n1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f34577c1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f20895id == profileActivity.f34583d1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f10 = org.telegram.ui.Components.l5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.qc.a0(profileActivity).h(f10, 1, new jy0(profileActivity, 0))) != null) {
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
        i01 i01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f34560a.B0();
        if (i10 == profileActivity.P3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
            TLRPC.UserFull userFull = profileActivity.f34691s2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                mh.a0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f34569b1, new ju(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new sh.j(profileActivity.f34569b1));
            }
        } else if (i10 == profileActivity.N3) {
            boolean z4 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f34583d1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f34583d1, z4);
            org.telegram.ui.Components.qc.A(profileActivity, z4, null).j();
            profileActivity.a5();
            int i11 = profileActivity.N3;
            if (i11 < 0 || (i01Var = profileActivity.d) == null) {
                return;
            }
            i01Var.m(i11);
        } else if (i10 == profileActivity.W3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f20990id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f34565a5);
            bundle.putString("first_name_card", profileActivity.f34573b5);
            bundle.putString("last_name_card", profileActivity.f34580c5);
            os osVar = new os(bundle, profileActivity.f34714w0);
            osVar.L = new sx0(profileActivity, user3);
            profileActivity.presentFragment(osVar);
        } else if (i10 == profileActivity.T3) {
            TextView textView = (TextView) org.telegram.ui.Components.z4.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new jy0(profileActivity, 1), profileActivity.f34714w0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            }
        } else if (i10 == profileActivity.U3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34714w0);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.X4));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.f34714w0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], k7.c6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new r20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new vl0(13, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(5));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            }
        } else if (i10 == profileActivity.f34663o4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f34598f1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.p2(bundle2));
        } else if (i10 == profileActivity.f34656n4) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.V(profileActivity.getParentActivity(), profileActivity.A2, profileActivity.f34714w0).f21166a);
        } else if (i10 == profileActivity.K3) {
            profileActivity.r4(view, f10, f11, false);
        } else if (i10 == profileActivity.H4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f34569b1);
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.X3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        } else if (i10 == profileActivity.R3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.S3) {
            m31.K(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f34685r4 && i10 < profileActivity.f34693s4) {
            if (!profileActivity.f34736z2.isEmpty()) {
                chatParticipant = profileActivity.f34683r2.participants.participants.get(((Integer) profileActivity.f34736z2.get(i10 - profileActivity.f34685r4)).intValue());
            } else {
                chatParticipant = profileActivity.f34683r2.participants.participants.get(i10 - profileActivity.f34685r4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f34699t4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.I3) {
            profileActivity.C4(f10, f11, i10, view);
        } else if (i10 == profileActivity.f34622i4) {
            if (profileActivity.B2 != null) {
                profileActivity.showDialog(new th.i0(profileActivity, profileActivity.B2.linked_community_id, null, null));
            } else if (profileActivity.f34569b1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1))) == null) {
            } else {
                profileActivity.showDialog(new th.i0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.F3) {
            if (profileActivity.f34683r2.location instanceof TLRPC.TL_channelLocation) {
                bd0 bd0Var = new bd0(5);
                bd0Var.f35455b0 = -profileActivity.f34577c1;
                bd0Var.f35482w0 = (TLRPC.TL_channelLocation) profileActivity.f34683r2.location;
                profileActivity.presentFragment(bd0Var);
            }
        } else if (i10 == profileActivity.I4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f34705u4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f34577c1);
            bundle3.putInt("type", 2);
            qr qrVar = new qr(bundle3);
            qrVar.x0(profileActivity.f34683r2);
            profileActivity.presentFragment(qrVar);
        } else if (i10 == profileActivity.f34711v4) {
            profileActivity.presentFragment(new rh0(profileActivity.f34577c1));
        } else if (i10 == profileActivity.f34718w4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f34577c1);
            bundle4.putInt("type", 1);
            qr qrVar2 = new qr(bundle4);
            qrVar2.x0(profileActivity.f34683r2);
            profileActivity.presentFragment(qrVar2);
        } else if (i10 == profileActivity.f34725x4) {
            profileActivity.P0.performClick();
        } else if (i10 == profileActivity.f34732y4) {
            profileActivity.presentFragment(new mh.p(0, profileActivity.f34569b1));
        } else if (i10 == profileActivity.z4) {
            profileActivity.presentFragment(new mh.p(1, profileActivity.f34569b1));
        } else if (i10 == profileActivity.A4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f34577c1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new ha1(bundle5));
        } else if (i10 == profileActivity.D4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f34577c1);
            bundle6.putInt("type", 0);
            qr qrVar3 = new qr(bundle6);
            qrVar3.x0(profileActivity.f34683r2);
            profileActivity.presentFragment(qrVar3);
        } else if (i10 == profileActivity.c3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f34593e3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.E2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f34600f3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f34607g3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f34614h3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f34628j3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f34621i3) {
            profileActivity.presentFragment(new fc0());
        } else if (i10 == profileActivity.f34635k3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f34655n3) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.U(profileActivity, profileActivity.f34714w0));
        } else if (i10 == profileActivity.f34662o3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f34669p3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f34692s3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f34698t3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f34704u3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.f34710v3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34714w0);
            alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new rx0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f21166a);
        } else if (i10 == profileActivity.f34585d3) {
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
        } else if (i10 == profileActivity.f34564a4) {
            profileActivity.presentFragment(new mh.ja());
        } else if (i10 == profileActivity.f34572b4) {
            profileActivity.presentFragment(new rh.g());
        } else if (i10 == profileActivity.f34579c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f34586d4) {
            hg.v2.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            sh.q0 q0Var = profileActivity.f34668p2;
            if (q0Var != null) {
                q0Var.m(!q0Var.g(), new br0(22, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            sh.p pVar = profileActivity.f34675q2;
            if (pVar != null) {
                pVar.f47570f = true;
                pVar.f47569e = !pVar.f47569e;
                pVar.k();
                ((org.telegram.ui.Cells.o8) view).setChecked(profileActivity.f34675q2.f47569e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.setChecked(!o8Var.b());
            if (profileActivity.f34642l4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f34642l4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f34569b1);
            boolean b10 = o8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f34691s2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new tb0(15, profileActivity, r0));
            profileActivity.f34642l4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.L3) {
            profileActivity.K4 = !profileActivity.K4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.L3);
            int i12 = profileActivity.R5;
            if (i12 >= 0) {
                profileActivity.f34575c.h1(i12, profileActivity.S5 - profileActivity.f34560a.getPaddingTop());
            }
        } else if (i10 == profileActivity.M3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.N2) {
            if (profileActivity.f34691s2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f34691s2.personal_channel_id);
            profileActivity.presentFragment(new xn(bundle7));
        } else if (i10 == profileActivity.R2) {
            a11 a11Var = profileActivity.Z5;
            if ((a11Var == null || !a11Var.a()) && !profileActivity.J3(i10, view)) {
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
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f34569b1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.X4);
        tL_messages_reportReaction.f20949id = profileActivity.W4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new oh.p5(4));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.X4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1)));
        }
        profileActivity.W4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.qc.a0(profileActivity).E(profileActivity.f34714w0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.F2 = fileLocation;
            profileActivity.G2 = photoSize2.location;
            profileActivity.f34568b0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.m0, null);
            if (profileActivity.L2 != -1) {
                profileActivity.j5();
                i01 i01Var = profileActivity.d;
                if (i01Var != null) {
                    i01Var.l();
                }
                profileActivity.k4(true);
            }
            zy0 zy0Var = profileActivity.f34632k0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.G2);
            profileActivity.H2 = forLocal;
            zy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.F2));
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
            profileActivity.P5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new tb0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f34569b1;
        if (j10 == 0) {
            long j11 = profileActivity.f34577c1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f34598f1;
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
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(profileActivity.getParentActivity(), profileActivity.f34714w0);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.f30359b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
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
                TLRPC.UserFull userFull = profileActivity.f34691s2;
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
            profileActivity.showDialog(new org.telegram.ui.Components.c8(profileActivity.getParentActivity(), profileActivity.f34714w0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.cc0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new pb0(profileActivity, 18), profileActivity.f34714w0);
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
        final TLRPC.UserFull userFull = profileActivity.f34691s2;
        if (userFull != null && userFull.stars_rating != null) {
            ?? r52 = 0;
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(profileActivity.getParentActivity(), null, false, false);
            h3Var.fixNavigationBar();
            runnable = h3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f34714w0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z4 = true;
            } else {
                z4 = false;
            }
            limitPreviewView2.setHideNegativeValues(z4);
            limitPreviewView2.setStarRating(userFull.stars_rating);
            limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView2, k7.c6.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, k7.c6.t(-1, -2, 17, 40, -12, 40, 20));
                TextView[] textViewArr = new org.telegram.ui.Components.g90[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    fg.a2 a2Var = new fg.a2(parentActivity, 5, r52);
                    textViewArr[i11] = a2Var;
                    a2Var.setGravity(17);
                    textViewArr[i11].setTextSize(1, 12.0f);
                    textViewArr[i11].setTextColor(org.telegram.ui.ActionBar.k6.w0(r52, org.telegram.ui.ActionBar.k6.f22036y6, false));
                    textViewArr[i11].setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(r52, org.telegram.ui.ActionBar.k6.f21720gc, false));
                    frameLayout.addView(textViewArr[i11], k7.c6.e(-1, -1, 119));
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
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
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
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, profileActivity.f34714w0));
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView4, k7.c6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f20991id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.y3.q(R.string.StarRatingSelfDescription, textView5);
                i10 = 1;
            } else {
                i10 = 1;
                b.o(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i10, 14.0f);
            textView5.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, profileActivity.f34714w0));
            linearLayout3.addView(textView5, k7.c6.t(-1, -2, 17, 20, 0, 20, 12));
            bw0 bw0Var = new bw0(parentActivity, profileActivity.f34714w0);
            bw0Var.f35604a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i14 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i15 = org.telegram.ui.ActionBar.k6.Oh;
            bw0Var.f35605b.setText(LocaleController.formatSpannable(i14, G3(org.telegram.ui.ActionBar.k6.v0(i15, profileActivity.f34714w0), string)));
            bw0Var.d.setVisibility(8);
            int i16 = R.drawable.menu_gift;
            ImageView imageView = bw0Var.f35606c;
            imageView.setImageResource(i16);
            imageView.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i13, profileActivity.f34714w0));
            linearLayout3.addView(bw0Var, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            bw0 bw0Var2 = new bw0(parentActivity, profileActivity.f34714w0);
            bw0Var2.f35604a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            bw0Var2.f35605b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.k6.v0(i15, profileActivity.f34714w0), LocaleController.getString(R.string.StarRatingAdded))));
            bw0Var2.d.setVisibility(8);
            int i17 = R.drawable.menu_stars_gift;
            ImageView imageView2 = bw0Var2.f35606c;
            imageView2.setImageResource(i17);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i13, profileActivity.f34714w0));
            linearLayout3.addView(bw0Var2, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            bw0 bw0Var3 = new bw0(parentActivity, profileActivity.f34714w0);
            bw0Var3.f35604a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i18 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                v02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21821m6, profileActivity.f34714w0), -16777216);
            } else {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, profileActivity.f34714w0);
            }
            bw0Var3.f35605b.setText(LocaleController.formatSpannable(i18, G3(v02, string2)));
            bw0Var3.d.setVisibility(8);
            int i19 = R.drawable.menu_refund;
            ImageView imageView3 = bw0Var3.f35606c;
            imageView3.setImageResource(i19);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i13, profileActivity.f34714w0));
            linearLayout3.addView(bw0Var3, k7.c6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            qh.d dVar = new qh.d(parentActivity, profileActivity.f34714w0, true);
            dVar.setOnClickListener(new iy0(0, runnable));
            dVar.g(mh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, k7.c6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h3Var.customView = linearLayout3;
            h3Var.show();
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
            if (!profileActivity.f34634k2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f34560a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f34560a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i01 i01Var = profileActivity.d;
                    if (i12 >= i01Var.f37715e.K2) {
                        break;
                    }
                    f2.m1 g10 = i01Var.g(null, i01Var.j(i12));
                    View view = g10.f5875a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                oy0 oy0Var = profileActivity.f34560a;
                oy0Var.setPadding(0, oy0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f34560a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f34606g2.cancel();
                float[] fArr = profileActivity.f34627j2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.N1 = profileActivity.T3();
            }
        }
        profileActivity.J.m(profileActivity.f34598f1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            sh.d3.G0(context, profileActivity.currentAccount, profileActivity.f34691s2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f34714w0, false);
        } else {
            sh.d3.H0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f34714w0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
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
        profileActivity.f34567b.setTranslationY(floatValue * f10);
        profileActivity.M.setTranslationY(f10 * profileActivity.R1);
        profileActivity.f34560a.setTranslationY((1.0f - profileActivity.R1) * f13);
        profileActivity.f34560a.setScaleX(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.f34560a.setScaleY(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.f34560a.setAlpha(profileActivity.R1);
        boolean z10 = true;
        profileActivity.k4(true);
        profileActivity.f34560a.setAlpha(f11);
        profileActivity.f34567b.setAlpha(1.0f - profileActivity.R1);
        profileActivity.f34567b.setScaleX((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.f34567b.setScaleY((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.M.setAlpha(1.0f - f11);
        profileActivity.V.setAlpha(f11);
        profileActivity.f34568b0.setAlpha(f11);
        bz0 bz0Var = profileActivity.f34681r0;
        if (bz0Var != null) {
            bz0Var.setAlpha(f11);
        }
        profileActivity.f34596f[1].setAlpha(f11);
        l5VarArr[1].setAlpha(f11);
        l5VarArr[3].setAlpha(f11);
        profileActivity.R0.getSearchField().setAlpha(f12);
        if (z4 && profileActivity.R1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
            if (w0Var.C.getWidth() != 0 && !w0Var.f22349e.isFocused()) {
                w0Var.f22349e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.f22349e);
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
        profileActivity.f34562a1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        org.telegram.ui.Components.g01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z4, z10, profileActivity.f34714w0);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20867id;
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
            profileActivity.getMessagesController().getDialogPhotos(user.f20990id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f34569b1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f34634k2 && profileActivity.f34568b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z4 = true;
        } else {
            z4 = false;
        }
        profileActivity.f34640l2 = z4;
        profileActivity.F2 = null;
        profileActivity.G2 = null;
        zy0 zy0Var = profileActivity.f34632k0;
        zy0Var.E0 = true;
        zy0Var.H0 = profileActivity.H2;
        zy0Var.f33095n1 = null;
        zy0Var.f33096o1 = null;
        zy0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z4) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34596f;
        org.telegram.ui.ActionBar.l5[] l5VarArr2 = profileActivity.f34680r;
        int i12 = 0;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f34560a.setVisibility(i10);
        org.telegram.ui.Components.tl0 tl0Var = profileActivity.f34567b;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tl0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.R0.getSearchContainer();
        if (!z4) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        mh.t0 t0Var = profileActivity.f34689s0;
        if (t0Var != null) {
            t0Var.setActive(!z4);
        }
        profileActivity.actionBar.v(z4);
        profileActivity.V.setVisibility(i10);
        bz0 bz0Var = profileActivity.f34681r0;
        if (bz0Var != null) {
            bz0Var.setVisibility(i10);
        }
        l5VarArr[1].setVisibility(i10);
        l5VarArr2[1].setVisibility(i10);
        l5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.Q0.setVisibility(i10);
        }
        profileActivity.R0.setVisibility(i10);
        profileActivity.f34568b0.setAlpha(1.0f);
        profileActivity.V.setAlpha(1.0f);
        bz0 bz0Var2 = profileActivity.f34681r0;
        if (bz0Var2 != null) {
            bz0Var2.setAlpha(1.0f);
        }
        mh.t0 t0Var2 = profileActivity.f34689s0;
        if (t0Var2 != null) {
            t0Var2.setAlpha(1.0f);
        }
        l5VarArr[1].setAlpha(1.0f);
        l5VarArr2[1].setAlpha(1.0f);
        profileActivity.R0.setAlpha(1.0f);
        profileActivity.f34560a.setAlpha(1.0f);
        profileActivity.f34567b.setAlpha(1.0f);
        profileActivity.M.setAlpha(1.0f);
        if (z4) {
            profileActivity.f34567b.setEmptyView(profileActivity.M);
        } else {
            profileActivity.M.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z4) {
        Drawable drawable = profileActivity.f34568b0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.u61) {
            profileActivity.f34568b0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.y5) {
            org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
            profileActivity.f34568b0.u(null, null, y5Var);
            if (z4) {
                y5Var.f(profileActivity.f34568b0);
            }
        } else {
            ImageLocation D = profileActivity.f34632k0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f34568b0.u(D, str, drawable);
        }
    }

    public final void A3() {
        f2.m1 m1Var;
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
        if (this.f34560a.getVisibility() == 0) {
            if (this.N) {
                this.L.setVisibleHeight(this.f34560a.getMeasuredHeight() - this.L.getTop());
            }
            if (this.f34560a.getChildCount() > 0 && !this.D1) {
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    m1Var = null;
                    if (i11 < this.f34560a.getChildCount()) {
                        if (RecyclerView.R(this.f34560a.getChildAt(i11)) == 0) {
                            view = this.f34560a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    oy0 oy0Var = this.f34560a;
                    View F = oy0Var.F(view);
                    if (F != null) {
                        m1Var = oy0Var.T(F);
                    }
                    m1Var = (org.telegram.ui.Components.fl0) m1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (m1Var != null) {
                    i10 = m1Var.b();
                } else {
                    i10 = -1;
                }
                top = (top < 0 || i10 != 0) ? 0 : 0;
                if (this.f34652n0 == null && this.actionBar.f21546k0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i12 = this.G4;
                if (i12 != -1 && !z4) {
                    org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) this.f34560a.K(i12);
                    if (fl0Var != null && fl0Var.f5875a.getTop() <= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (this.C5 != z4) {
                    this.C5 = z4;
                    AnimatorSet animatorSet = this.f34738z5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.A5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    org.telegram.ui.ActionBar.w0 searchItem = this.L.getSearchItem();
                    org.telegram.ui.Components.lj0 searchOptionsItem = this.L.getSearchOptionsItem();
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
                        uz0 uz0Var = this.L;
                        if (uz0Var.s0(uz0Var.f33980h0[0].C)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        uz0 uz0Var2 = this.L;
                        int i13 = uz0Var2.f33980h0[0].C;
                        if (i13 != 0 && !org.telegram.ui.Components.zu0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || uz0Var2.S == null)) {
                            this.L.f33993o0.setVisibility(4);
                            this.L.A(false, false);
                        } else {
                            this.L.f33993o0.setVisibility(0);
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
                    ImageView imageView = this.L.f33993o0;
                    if (z4) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f19));
                    ImageView imageView2 = this.L.f33993o0;
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
                    org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34680r;
                    org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
                    if (z4) {
                        f21 = 0.0f;
                    } else {
                        f21 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, property, f21));
                    this.L.F0.setOpen(z4);
                    if (this.f34667p1) {
                        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[3];
                        if (z4) {
                            f22 = 0.0f;
                        } else {
                            f22 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(l5Var2, property, f22));
                    }
                    org.telegram.ui.Components.jo0 jo0Var = this.f34688s;
                    if (!z4) {
                        f23 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(jo0Var, property, f23));
                    if (z4) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f34609g5, 0.0f));
                    }
                    if (this.f34681r0 != null || this.f34689s0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new wx0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.f34738z5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.f34738z5.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                    this.f34738z5.addListener(new org.telegram.ui.Components.fx0(8, this, searchItem));
                    this.f34738z5.setDuration(150L);
                    this.f34738z5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f24 = top;
                if (this.N1 != f24 && !this.E1) {
                    this.N1 = f24;
                    this.f34562a1.invalidate();
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
        gz0 gz0Var = new gz0(this, user.f20990id, this.f34577c1, tL_chatAdminRights, this.B2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        gz0Var.U0 = new hz0(this, i10, chatParticipant, z4, zArr);
        presentFragment(gz0Var);
    }

    public final void B3() {
        float alpha;
        int i10 = this.G1;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34680r;
        if (i10 == 1 && (!this.f34623i5 || this.D1)) {
            this.V5 = 0.0f;
        } else if (i10 == 2 && (!this.f34623i5 || this.D1)) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
            if (l5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = l5Var.getAlpha();
            }
            this.V5 = alpha;
        } else if (this.f34569b1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.V5 = (1.0f - this.f34637k5) * this.f34613h2;
        } else {
            this.V5 = this.f34613h2 * this.f34637k5;
        }
        if (this.f34569b1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.f34649m5) {
                this.f34643l5 = AndroidUtilities.dp(28.0f) * this.V5;
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[2];
                if (l5Var2 != null) {
                    l5Var2.setAlpha(this.f34613h2);
                    l5VarArr[3].setAlpha(1.0f - this.f34613h2);
                    l5VarArr[1].setTranslationX(W3(this.W5));
                    this.W.invalidate();
                    t01 t01Var = this.Y5;
                    if (t01Var != null) {
                        t01Var.f41421e = 1.0f - this.f34613h2;
                        t01Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[2];
            if (l5Var3 != null) {
                l5Var3.setAlpha(0.0f);
                l5VarArr[3].setAlpha(0.0f);
            }
            t01 t01Var2 = this.Y5;
            if (t01Var2 != null) {
                t01Var2.f41421e = 1.0f;
                t01Var2.invalidateSelf();
            }
        } else if (this.f34657n5) {
            org.telegram.ui.ActionBar.l5 l5Var4 = l5VarArr[2];
            if (l5Var4 != null) {
                l5Var4.setAlpha(this.V5);
            }
            t01 t01Var3 = this.Y5;
            if (t01Var3 != null) {
                t01Var3.f41421e = 1.0f - this.V5;
                t01Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.l5 l5Var5 = l5VarArr[2];
            if (l5Var5 != null) {
                l5Var5.setAlpha(0.0f);
            }
            t01 t01Var4 = this.Y5;
            if (t01Var4 != null) {
                t01Var4.f41421e = 1.0f;
                t01Var4.invalidateSelf();
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
            py pyVar = new py(null);
            pyVar.f40234k2 = str;
            presentFragment(pyVar);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C3() {
        boolean z4;
        org.telegram.ui.Components.kw0 kw0Var = this.Q;
        if (kw0Var != null) {
            if (!this.C5 && this.E5) {
                z4 = true;
            } else {
                z4 = false;
            }
            kw0Var.setVisibility(z4);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Cells.y3 y3Var = this.f34582d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f10);
        this.f34632k0.O(this.H2, f10);
    }

    public final void D3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f34646m2 && (valueAnimator = this.f34606g2) != null && valueAnimator.isRunning()) {
            this.f34570b2 = this.H5;
            this.f34584d2 = this.I5;
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
        this.X0 = new org.telegram.ui.Components.h8(context, this.Q0.getPopupLayout().getSwipeBack(), new ny0(this), false, 0, this.f34714w0);
        if (this.f34598f1 > 0 || this.f34569b1 > 0) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21839n6, this.f34714w0);
            org.telegram.ui.Components.h8 h8Var = this.X0;
            org.telegram.ui.Components.g90 g90Var = h8Var.f27407e;
            if (g90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.fg(h8Var, 10)));
                g90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f34691s2;
        if (userFull == null && this.f34683r2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f34683r2.ttl_period;
        }
        org.telegram.ui.Components.y11 a2 = org.telegram.ui.Components.y11.a(i10);
        this.f34666p0 = a2;
        this.W0 = this.Q0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.X0.f27404a);
        this.Q0.a(-1);
        T4();
    }

    public final void E4(float f10, float f11) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.N1 - T3()) / ((this.f34560a.getMeasuredWidth() - f11) - U3())));
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
        this.f34570b2 = (AndroidUtilities.dp(7.0f) * f10) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f34584d2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f10) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView != null && this.U5 && this.f34709v2 != null && getParentActivity() != null) {
            a11 a11Var = this.Z5;
            if (a11Var != null) {
                a11Var.b(this.f34709v2);
                this.Z5.invalidate();
                return;
            }
            a11 a11Var2 = new a11(this, this.f34709v2);
            this.Z5 = a11Var2;
            ((FrameLayout) this.fragmentView).addView(a11Var2, k7.c6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        oy0 oy0Var = this.f34560a;
        if (oy0Var != null && this.f34575c != null && oy0Var.getChildCount() > 0 && !this.T5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f34560a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f34560a.getChildAt(i12));
                View childAt = this.f34560a.getChildAt(i12);
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
                if (this.R5 == 0 && !this.f34640l2 && top > T3()) {
                    this.S5 = T3();
                }
                this.f34575c.h1(i11, view.getTop() - this.f34560a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z4) {
        int i10 = this.G4;
        if (i10 >= 0) {
            if (z4) {
                xh.o oVar = new xh.o(getParentActivity(), 2, 0.6f);
                oVar.f5805a = this.G4;
                oVar.f50658p = -this.f34560a.getPaddingTop();
                this.f34575c.w0(oVar);
                return;
            }
            this.f34575c.h1(i10, -this.f34560a.getPaddingTop());
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
            ofFloat = ValueAnimator.ofFloat(this.f34701u0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new wx0(this, 1));
        this.Q5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.Q5;
        if (z4) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z4) {
            this.Q5.addListener(new lz0(this, 4));
        }
        this.Q5.start();
    }

    public final void I3(int i10, View view) {
        boolean z4;
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
        H.W(this.f34560a.V0(view, false));
        H.f30332w = false;
        if (this.f34691s2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new pb0(this, 25), z4);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new pb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.jm(this, i10, 21), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.lh0 lh0Var = this.X;
        if (lh0Var != null) {
            if (this.f34667p1) {
                lh0Var.E = 6;
            } else if (this.f34653n1) {
                lh0Var.E = 5;
            } else if (this.f34661o2) {
                lh0Var.E = 2;
            } else if (this.f34569b1 != 0) {
                lh0Var.E = 0;
            } else if (this.f34577c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f34577c1));
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

    @Override
    public final boolean J(py pyVar) {
        return false;
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f34667p1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f34691s2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f20990id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.H3 && i10 != this.G3 && i10 != this.T2) {
                    if (i10 == this.L3) {
                        str = vf.x0.f0(this.currentAccount, currentUser, userFull.business_work_hours);
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
                        str = UserInfoActivity.Z(this.f34691s2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
                H.W(this.f34560a.V0(view, false));
                H.f30332w = false;
                H.f30311i = 3;
                if (i10 == this.M3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new pb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new pb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new gl0(str, 26), false);
                }
                if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new pb0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f42316b;

                        {
                            this.f42316b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f42316b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new by0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new by0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f21166a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f42316b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new by0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new by0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f21166a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.M3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new pb0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f42316b;

                        {
                            this.f42316b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f42316b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new by0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new by0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f21166a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f42316b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new by0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new by0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f21166a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.I3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new pb0(this, 10), false);
                } else if (i10 != this.H3 && i10 != this.G3 && i10 != this.T2) {
                    if (i10 == this.D3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new pb0(this, 12), false);
                    } else if (i10 == this.R2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f42061b;

                            {
                                this.f42061b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f42061b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.xk(23, profileActivity, userFull2), new pb0(profileActivity, 13), false, false, profileActivity.f34714w0).f21207a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity3, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f21166a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f21166a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f42061b;

                            {
                                this.f42061b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f42061b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.xk(23, profileActivity, userFull2), new pb0(profileActivity, 13), false, false, profileActivity.f34714w0).f21207a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f21166a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f21166a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.N2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new br0(18, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new pb0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f42061b;

                            {
                                this.f42061b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f42061b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.xk(23, profileActivity, userFull2), new pb0(profileActivity, 13), false, false, profileActivity.f34714w0).f21207a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f21166a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f42061b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new by0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new by0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f21166a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new pb0(this, 11), false);
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
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.f34582d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final boolean K3() {
        f2.m1 m1Var;
        View view;
        if ((this.F0 || (!AndroidUtilities.isTablet() && !this.f34634k2)) && this.f34568b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.C0 = true;
            this.f34640l2 = true;
            int i10 = 0;
            while (true) {
                m1Var = null;
                if (i10 < this.f34560a.getChildCount()) {
                    if (RecyclerView.R(this.f34560a.getChildAt(i10)) == 0) {
                        view = this.f34560a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                oy0 oy0Var = this.f34560a;
                View F = oy0Var.F(view);
                if (F != null) {
                    m1Var = oy0Var.T(F);
                }
                if (m1Var != null) {
                    Integer num = (Integer) this.V1.get(Integer.valueOf(m1Var.b()));
                    if (num != null) {
                        this.M1 = true;
                        this.f34560a.v0(0, -(((this.f34560a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.pr.h);
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
        this.f34683r2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f34626j1 == 0) {
                this.f34626j1 = -j10;
                getMediaDataController().getMediaCounts(this.f34626j1, this.f34583d1, this.classGuid);
            }
        }
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            uz0Var.setChatInfo(this.f34683r2);
        }
        zy0 zy0Var = this.f34632k0;
        if (zy0Var != null && !this.f34653n1) {
            zy0Var.setChatInfo(this.f34683r2);
        }
        bz0 bz0Var = this.f34681r0;
        if (bz0Var != null && (chatFull3 = this.f34683r2) != null) {
            bz0Var.setStories(chatFull3.stories);
        }
        mh.t0 t0Var = this.f34689s0;
        if (t0Var != null) {
            t0Var.a();
        }
        yy0 yy0Var = this.f34568b0;
        if (yy0Var != null) {
            yy0Var.setHasStories(j4());
        }
        L3();
        if (this.f34577c1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f34683r2) != null && chatFull2.stargifts_available) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Q0.I(38, z4);
            org.telegram.ui.Components.lh0 lh0Var = this.X;
            if (lh0Var != null) {
                lh0Var.o(3, z4);
            }
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.B2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f34683r2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f34683r2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f34683r2.participants.participants.get(i10);
                    this.f34735z1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.W != null && (tL_emojiStatusCollectible2 = this.f34588d6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f34588d6 = tL_emojiStatusCollectible;
                qh.f3 f3Var = this.f34566a6;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f34581c6 = null;
                    this.f34566a6 = new qh.f3(getParentActivity(), 3);
                    this.f34574b6 = org.telegram.ui.ActionBar.k6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f34566a6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    qh.f3 f3Var2 = this.f34566a6;
                    int l1 = org.telegram.ui.ActionBar.k6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    f3Var2.f45317x0 = true;
                    f3Var2.F0 = System.currentTimeMillis();
                    f3Var2.f45319y0 = new Path();
                    f3Var2.f45320z0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    f3Var2.A0 = new Paint(1);
                    f3Var2.B0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, l1), org.telegram.ui.ActionBar.k6.l1(1.0f, l1), org.telegram.ui.ActionBar.k6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    f3Var2.E0 = linearGradient;
                    f3Var2.B0.setShader(linearGradient);
                    f3Var2.C0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, l1), org.telegram.ui.ActionBar.k6.l1(0.5f, l1), org.telegram.ui.ActionBar.k6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    f3Var2.D0 = new Matrix();
                    f3Var2.A0.setShader(f3Var2.C0);
                    f3Var2.B0.setStyle(Paint.Style.STROKE);
                    f3Var2.B0.setStrokeJoin(Paint.Join.ROUND);
                    f3Var2.B0.setStrokeCap(Paint.Cap.ROUND);
                    f3Var2.B0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.W.addView(this.f34566a6, k7.c6.c(24.0f, -1));
                    this.f34566a6.u(9.33f);
                    qh.f3 f3Var3 = this.f34566a6;
                    Typeface bold = AndroidUtilities.bold();
                    f3Var3.E.u(bold);
                    f3Var3.G.setTypeface(bold);
                    this.f34566a6.t(tL_emojiStatusCollectible.title);
                    qh.f3 f3Var4 = this.f34566a6;
                    f3Var4.d = -1L;
                    f3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
                    qh.f3 f3Var5 = this.f34566a6;
                    f3Var5.getClass();
                    f3Var5.f45318y = AndroidUtilities.dpf2(4.0f);
                    f3Var5.B = AndroidUtilities.dpf2(2.66f);
                    this.f34566a6.s();
                    this.f34566a6.r(16.0f);
                    this.f34566a6.v();
                    this.f34566a6.setOnClickListener(new fy0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.N1 < AndroidUtilities.dp(82.0f)) {
                        this.f34581c6 = Boolean.FALSE;
                        this.f34566a6.setAlpha(0.0f);
                    }
                    V4();
                    qh.f3 f3Var6 = this.f34566a6;
                    Objects.requireNonNull(f3Var6);
                    AndroidUtilities.runOnUIThread(new gl0(f3Var6, 27), 6000L);
                }
            }
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.ru0 ru0Var;
        uz0 uz0Var = this.L;
        if (uz0Var != null && (ru0Var = this.O) != null) {
            uz0Var.setNewMediaCounts(ru0Var.f30867c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f34691s2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.f5 f5Var;
        if (this.G1 != 0 && (f5Var = this.parentLayout) != null && f5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof xn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(b01 b01Var) {
        if (this.f34602f5 == b01Var) {
            return;
        }
        this.f34602f5 = b01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f34560a, (h5.d) new ay0(this, 0));
    }

    public final void N3() {
        if (this.f34560a == null) {
            return;
        }
        float measuredWidth = (this.f34560a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.V.getLayoutParams()).width * this.Y1) * 0.5f);
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
                this.f34633k1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f34569b1 != 0 && this.f34652n0 != null && !this.f34667p1) {
            return 0;
        }
        if (this.F4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, x01 x01Var) {
        boolean z4;
        this.f34691s2 = userFull;
        org.telegram.ui.Components.kw0 kw0Var = this.Q;
        if (kw0Var != null) {
            kw0Var.set(userFull.stars_rating);
        }
        bz0 bz0Var = this.f34681r0;
        if (bz0Var != null) {
            bz0Var.setStories(this.f34691s2.stories);
        }
        mh.t0 t0Var = this.f34689s0;
        if (t0Var != null) {
            t0Var.a();
        }
        yy0 yy0Var = this.f34568b0;
        if (yy0Var != null) {
            yy0Var.setHasStories(j4());
        }
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            uz0Var.setUserInfo(this.f34691s2);
        }
        if (this.f34697t2 == null) {
            this.f34697t2 = f6Var;
        }
        if (this.f34697t2 == null) {
            this.f34697t2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.f34697t2;
        pb0 pb0Var = new pb0(this, 20);
        if (f6Var2.f22805c) {
            pb0Var.run();
        } else {
            f6Var2.h.add(pb0Var);
        }
        this.f34697t2.d(this.f34691s2);
        if (this.f34709v2 == null) {
            this.f34709v2 = x01Var;
        }
        x01 x01Var2 = this.f34709v2;
        if (x01Var2 == null) {
            x01 c3 = x01.c(this.currentAccount, this.f34691s2, x01Var2);
            this.f34709v2 = c3;
            if (c3 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f34703u2 = z4;
        }
        x01 x01Var3 = this.f34709v2;
        if (x01Var3 != null) {
            pb0 pb0Var2 = new pb0(this, 16);
            if (x01Var3.f42922b) {
                pb0Var2.run();
            } else {
                x01Var3.h.add(pb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f34569b1)));
            if (e4()) {
                this.Q0.K(44);
            } else {
                this.Q0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.u61) {
            return ((org.telegram.ui.Components.u61) imageReceiver.getDrawable()).f31576a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f34568b0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z4, boolean z10) {
        if (this.f34582d0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f34576c0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34576c0 = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34576c0 = animatorSet2;
            if (z4) {
                this.f34582d0.setVisibility(0);
                this.f34576c0.playTogether(ObjectAnimator.ofFloat(this.f34582d0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f34582d0, View.ALPHA, 0.0f));
            }
            this.f34576c0.setDuration(180L);
            this.f34576c0.addListener(new mz0(this, z4, 1));
            this.f34576c0.start();
        } else if (z4) {
            this.f34582d0.setAlpha(1.0f);
            this.f34582d0.setVisibility(0);
        } else {
            this.f34582d0.setAlpha(0.0f);
            this.f34582d0.setVisibility(4);
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
            org.telegram.ui.ActionBar.l5 l5Var = this.f34596f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(dp, i11, l5Var, false);
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
        if (this.f34733y5 != null) {
            return;
        }
        i61[] i61VarArr = new i61[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            if (l5Var.getRightDrawable() == null) {
                rect.set(l5VarArr[1].getWidth() - 1, (l5VarArr[1].getHeight() / 2) - 1, l5VarArr[1].getWidth() + 1, (l5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(l5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((l5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) l5VarArr[1].getX(), (int) l5VarArr[1].getY());
            }
        }
        if (l5VarArr[1].getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int dp = (-(this.W.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = k7.o.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.B2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        ez0 ez0Var = new ez0(this, this, parentActivity, valueOf, i11, this.f34714w0, i10, i61VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34569b1));
        if (user != null) {
            ez0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l11 = this.C;
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (l11 != null) {
            ez0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                Drawable drawable = j5Var.f27998f[0];
                if (drawable instanceof org.telegram.ui.Components.l5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.l5) drawable).i());
                    ez0Var.setSelected(l10);
                }
            }
            l10 = null;
            ez0Var.setSelected(l10);
        }
        ez0Var.setSaveState(3);
        ez0Var.y(j5VarArr[1], l5VarArr[1]);
        fz0 fz0Var = new fz0(this, ez0Var);
        this.f34733y5 = fz0Var;
        i61VarArr[0] = fz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.getLocationOnScreen(iArr);
        }
        i61VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        i61VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        uz0 uz0Var = this.L;
        if (uz0Var != null && this.f34688s != null) {
            int closestTab = uz0Var.getClosestTab();
            int[] iArr = this.O.f30867c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f34688s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f34688s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.L.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.L.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f34688s.setText(android.support.v4.media.a.z(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f34688s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f34688s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f34688s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f34688s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f34688s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f34688s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f34688s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f34688s.setText(LocaleController.formatPluralString("CommonGroups", this.f34691s2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f34688s.setText(this.f34680r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.zu0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f34688s.setText(this.L.V(true));
                } else if (closestTab == 9) {
                    this.f34688s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.L.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.jo0 jo0Var = this.f34688s;
                    if (this.f34661o2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    jo0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f34688s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.jo0 jo0Var2 = this.f34688s;
                    org.telegram.ui.Components.pr0 pr0Var = this.L.S;
                    if (pr0Var != null) {
                        i11 = pr0Var.getGiftsCount();
                    }
                    jo0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f34688s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f34688s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f34661o2) {
                this.f34688s.setText(this.L.V(false));
            } else if (this.L.c0(closestTab) > 0) {
                this.f34688s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.L.c0(closestTab), new Object[0]));
            } else {
                this.f34688s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z4) {
        a0.h hVar;
        int i10;
        if (!this.f34729y1 && (hVar = this.f34735z1) != null && this.f34683r2 != null) {
            this.f34729y1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z4) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f34577c1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z4) {
                i11 = this.f34735z1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new hg.l0(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.L.F0.setReordering(false);
        uz0 uz0Var = this.L;
        org.telegram.ui.Components.os0 os0Var = uz0Var.F0;
        if (uz0Var.f34004s1 != null && os0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = os0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.zu0.d0(num.intValue(), uz0Var.f33963a1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.L.v1(true);
        this.f34712v5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new pb0(this, 21)).start();
        org.telegram.ui.Components.qc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.j5 S3(TLRPC.EmojiStatus emojiStatus, boolean z4, int i10) {
        int i11;
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (j5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f34596f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(dp, i11, l5Var, false);
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
        if (this.X != null && this.f34680r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.lh0 lh0Var = this.X;
            boolean z4 = this.D1;
            lh0Var.f28739e = z4;
            if (z4 && this.G1 == 2 && (l0Var = this.V) != null) {
                this.X.f28740f = this.V.getY() + (this.V.getScaleY() * l0Var.getHeight());
                this.X.setAlpha(this.P1);
                org.telegram.ui.Components.lh0 lh0Var2 = this.X;
                lh0Var2.B = AndroidUtilities.dp(74.0f);
                lh0Var2.setTranslationY(this.f34560a.getMeasuredWidth());
                lh0Var2.invalidate();
            } else {
                lh0Var.f28740f = -1.0f;
                float f11 = i11;
                float f12 = this.N1 + f11;
                if (this.F4) {
                    f10 = 25.0f;
                } else {
                    f10 = 0.0f;
                }
                float dp = f12 - AndroidUtilities.dp(f10);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f11);
                org.telegram.ui.Components.lh0 lh0Var3 = this.X;
                lh0Var3.B = min;
                lh0Var3.setTranslationY(dp - min);
                lh0Var3.invalidate();
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
        return this.f34722x1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        int i10;
        if (this.W0 != null && this.X0 != null) {
            TLRPC.UserFull userFull = this.f34691s2;
            if (userFull == null && this.f34683r2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f34683r2.ttl_period;
            }
            this.f34666p0.b(i10);
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
        if (this.f34671p5 != null) {
            uz0 uz0Var = this.L;
            if (uz0Var != null && uz0Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f34560a.getMeasuredHeight() - this.L.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            xd.a aVar = this.f34726x5;
            aVar.a(z4, true);
            float f10 = aVar.f50504e;
            this.f34671p5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f10));
            this.f34671p5.setAlpha(f10);
            FrameLayout frameLayout = this.f34671p5;
            if (f10 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27737w;
            if (icVar != null) {
                icVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f34720x == null) {
            this.f34720x = org.telegram.ui.ActionBar.k6.f21801l4.getConstantState().newDrawable().mutate();
        }
        return this.f34720x;
    }

    public final void V4() {
        qh.f3 f3Var = this.f34566a6;
        if (f3Var != null) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
            boolean z4 = true;
            float x10 = l5VarArr[1].getX() + (-f3Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f34613h2);
            float f10 = 0.0f;
            f3Var.n(0.0f, (l5VarArr[1].getScaleX() * (l5VarArr[1].getRightDrawableX() - (lerp * l5VarArr[1].getRightDrawableWidth()))) + x10);
            float lerp2 = AndroidUtilities.lerp(this.f34627j2, this.f34620i2);
            qh.f3 f3Var2 = this.f34566a6;
            f3Var2.setTranslationY(((l5VarArr[1].getY() + (-f3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.f34566a6.h(i0.a.d(lerp2, this.f34574b6, 1342177280));
            if (this.N1 < AndroidUtilities.dp(82.0f)) {
                z4 = false;
            }
            Boolean bool = this.f34581c6;
            if (bool != null && bool.booleanValue() == z4) {
                return;
            }
            ViewPropertyAnimator animate = this.f34566a6.animate();
            this.f34581c6 = Boolean.valueOf(z4);
            if (z4) {
                f10 = 1.0f;
            }
            b.p(animate.alpha(f10), org.telegram.ui.Components.pr.f30184g, 200L);
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
                f11 = this.f34613h2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f34643l5) * Utilities.clamp01(f11)) + f10;
    }

    public final void W4() {
        if (getParentActivity() != null && this.S0 != null) {
            if (getUserConfig().isPremium()) {
                this.S0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, this.f34714w0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.S0.setIcon(new oh.j2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
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
            f11 = this.f34613h2;
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

    public final org.telegram.ui.Components.or Y3(int i10) {
        org.telegram.ui.Components.or[] orVarArr = this.H;
        if (orVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.B;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.f34714w0), PorterDuff.Mode.MULTIPLY);
            orVarArr[i10] = new org.telegram.ui.Components.or(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return orVarArr[i10];
    }

    public final void Y4(float f10) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.N5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.f34714w0), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oi, this.f34714w0), this.B5, 1.0f);
            }
            int d = i0.a.d(f10, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.k6.Oi;
            int d10 = i0.a.d(this.B5, d, org.telegram.ui.ActionBar.k6.v0(i11, this.f34714w0));
            org.telegram.ui.Components.j5 j5Var = this.D[i10];
            if (j5Var != null) {
                j5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.j5 j5Var2 = this.E[i10];
            if (j5Var2 != null) {
                j5Var2.k(Integer.valueOf(i0.a.d(this.B5, i0.a.d(f10, offsetColor, -1711276033), org.telegram.ui.ActionBar.k6.v0(i11, this.f34714w0))));
            }
            if (i10 == 1) {
                this.f34561a0.setColor(d10);
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
        org.telegram.ui.Cells.o oVar = this.f34561a0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
        oVar.setScaleX(l5VarArr[1].getScaleX());
        this.f34561a0.setScaleY(l5VarArr[1].getScaleY());
        this.f34561a0.b((l5VarArr[1].getScaleX() * l5VarArr[1].getRightDrawableX()) + l5VarArr[1].getX(), (l5VarArr[1].getHeight() - (l5VarArr[1].getScaleY() * (l5VarArr[1].getHeight() - l5VarArr[1].getRightDrawableY()))) + l5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f34598f1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f34569b1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f34577c1;
    }

    public final org.telegram.ui.Components.gm0 a4(int i10) {
        if (this.I == null) {
            org.telegram.ui.Components.gm0 gm0Var = new org.telegram.ui.Components.gm0(i10);
            this.I = gm0Var;
            gm0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21734h8, this.f34714w0));
        }
        return this.I;
    }

    public final void a5() {
        if (!this.f34653n1 && ChatObject.isForum(this.B2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f34577c1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f34595e5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f34577c1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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

    public final t01 b4() {
        if (this.Y5 == null) {
            t01 t01Var = new t01(LocaleController.getString(R.string.StatusHiddenShow));
            this.Y5 = t01Var;
            t01Var.setAlpha((int) (Math.min(1.0f, this.N1 / T3()) * 255.0f));
            this.Y5.a(i0.a.d(this.f34613h2, org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        return this.Y5;
    }

    public final void b5(float f10) {
        j01 j01Var;
        ValueAnimator valueAnimator;
        if (this.f34646m2 || ((j01Var = this.K) != null && (valueAnimator = j01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.K.getLayoutParams();
            layoutParams.width = this.f34560a.getMeasuredWidth();
            layoutParams.height = (int) (this.N1 + f10);
            this.K.requestLayout();
        }
        v01 v01Var = this.f34562a1;
        if (v01Var != null) {
            v01Var.B.setTranslate(0.0f, this.X1 - v01Var.f42085x);
            v01 v01Var2 = this.f34562a1;
            RadialGradient radialGradient = v01Var2.f42086y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(v01Var2.B);
            }
            this.f34562a1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        float f10;
        if (this.f34653n1) {
            return 0;
        }
        if (this.f34577c1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f34577c1)))) {
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
        if (this.f34667p1 && this.U0 != null && this.T0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f34569b1))) != null) {
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

    public final org.telegram.ui.Components.or d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f10;
        org.telegram.ui.Components.or[] orVarArr = this.G;
        if (orVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f34727y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.F;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.N5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
                    color3 = this.N5.getColor5();
                } else {
                    color3 = this.N5.getColor3();
                }
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oi, this.f34714w0), this.B5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f34714w0), this.B5, 1.0f), mode);
            }
            orVarArr[i10] = new org.telegram.ui.Components.or(new org.telegram.ui.Components.pq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return orVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        i01 i01Var;
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
        oy0 oy0Var;
        oy0 oy0Var2;
        org.telegram.ui.Components.fl0 fl0Var;
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
                if (this.f34569b1 != 0) {
                    if (z12) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (oy0Var2 = this.f34560a) != null && (fl0Var = (org.telegram.ui.Components.fl0) oy0Var2.L(this.D3, false)) != null) {
                        this.d.v(fl0Var, this.D3);
                    }
                } else if (this.f34577c1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (z12 && (oy0Var = this.f34560a) != null) {
                        int childCount = oy0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f34560a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (this.f34683r2 != null && (chat = this.B2) != null && chat.f20843id == l10.longValue()) {
                    this.f34683r2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f34605g1) {
                        AndroidUtilities.runOnUIThread(new br0(16, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.A2;
                    if (encryptedChat2 != null && encryptedChat.f20851id == encryptedChat2.f20851id) {
                        this.A2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.U1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z15 = this.f34612h1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f34569b1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f34612h1 = z11;
                    if (z15 != z11) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l11 = (Long) objArr[0];
                    if (this.B2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.B2;
                        if (longValue == chat2.f20843id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f34683r2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f34683r2 = chatFull4;
                            }
                            uz0 uz0Var = this.L;
                            if (uz0Var != null) {
                                uz0Var.setChatInfo(this.f34683r2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f34683r2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f34645m1) || (inputGroupCall != null && this.f34645m1))) {
                                D3(false);
                            }
                            bz0 bz0Var = this.f34681r0;
                            if (bz0Var != null && (chatFull3 = this.f34683r2) != null) {
                                bz0Var.setStories(chatFull3.stories);
                            }
                            mh.t0 t0Var = this.f34689s0;
                            if (t0Var != null) {
                                t0Var.a();
                            }
                            yy0 yy0Var = this.f34568b0;
                            if (yy0Var != null) {
                                yy0Var.setHasStories(j4());
                            }
                            if (l11.longValue() != 0) {
                                z13 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f34683r2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.Q0.I(38, z13);
                                org.telegram.ui.Components.lh0 lh0Var = this.X;
                                if (lh0Var != null) {
                                    lh0Var.o(3, z13);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f34569b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f34569b1))) != null && chatFull7.f20844id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.B2;
                    if (chat3 != null && chatFull7.f20844id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f20844id == this.f34577c1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f34683r2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f34683r2 = chatFull7;
                        if (this.f34626j1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f34626j1 = -j10;
                                getMediaDataController().getMediaCount(this.f34626j1, this.f34583d1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        zy0 zy0Var = this.f34632k0;
                        if (zy0Var != null && !this.f34653n1) {
                            zy0Var.setChatInfo(this.f34683r2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f34577c1));
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
                        bz0 bz0Var2 = this.f34681r0;
                        if (bz0Var2 != null && (chatFull = this.f34683r2) != null) {
                            bz0Var2.setStories(chatFull.stories);
                        }
                        mh.t0 t0Var2 = this.f34689s0;
                        if (t0Var2 != null) {
                            t0Var2.a();
                        }
                        yy0 yy0Var2 = this.f34568b0;
                        if (yy0Var2 != null) {
                            yy0Var2.setHasStories(j4());
                        }
                        uz0 uz0Var2 = this.L;
                        if (uz0Var2 != null) {
                            uz0Var2.setChatInfo(this.f34683r2);
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
                    if (botInfo.user_id == this.f34569b1) {
                        this.C2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f34569b1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f34691s2 = userFull;
                        org.telegram.ui.Components.kw0 kw0Var = this.Q;
                        if (kw0Var != null) {
                            kw0Var.set(userFull.stars_rating);
                        }
                        bz0 bz0Var3 = this.f34681r0;
                        if (bz0Var3 != null) {
                            bz0Var3.setStories(this.f34691s2.stories);
                        }
                        mh.t0 t0Var3 = this.f34689s0;
                        if (t0Var3 != null) {
                            t0Var3.a();
                        }
                        yy0 yy0Var3 = this.f34568b0;
                        if (yy0Var3 != null) {
                            yy0Var3.setHasStories(j4());
                        }
                        uz0 uz0Var3 = this.L;
                        if (uz0Var3 != null) {
                            uz0Var3.setUserInfo(this.f34691s2);
                        }
                        if (this.f34652n0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f34691s2.about, this.f34716w2)) {
                                this.d.m(this.T2);
                            }
                        } else {
                            if (!this.D1 && !this.H0) {
                                D3(true);
                            } else {
                                this.F1 = true;
                            }
                            e5(false, false);
                            uz0 uz0Var4 = this.L;
                            if (uz0Var4 != null) {
                                uz0Var4.setCommonGroupsCount(this.f34691s2.common_chats_count);
                                R();
                                org.telegram.ui.Components.ru0 ru0Var = this.O;
                                if (ru0Var == null || ru0Var.f30875y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f34697t2 == null && !h4()) {
                            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                            this.f34697t2 = f6Var;
                            pb0 pb0Var = new pb0(this, 15);
                            if (f6Var.f22805c) {
                                pb0Var.run();
                            } else {
                                f6Var.h.add(pb0Var);
                            }
                            this.f34697t2.d(this.f34691s2);
                        }
                        if (!h4()) {
                            x01 x01Var = this.f34709v2;
                            x01 c3 = x01.c(this.currentAccount, this.f34691s2, x01Var);
                            this.f34709v2 = c3;
                            if (c3 != x01Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f34703u2 = z4;
                            if (c3 != null) {
                                pb0 pb0Var2 = new pb0(this, 16);
                                if (c3.f42922b) {
                                    pb0Var2.run();
                                } else {
                                    c3.h.add(pb0Var2);
                                }
                            }
                        }
                        if (this.Q0 != null) {
                            if (e4()) {
                                this.Q0.K(44);
                            } else {
                                this.Q0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f34691s2;
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
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (i01Var = this.d) != null) {
                                            i01Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        oy0 oy0Var3 = this.f34560a;
                        if (oy0Var3 != null) {
                            oy0Var3.f1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.Z2;
                        int i16 = this.X2;
                        int i17 = this.V2;
                        j5();
                        i01 i01Var2 = this.d;
                        if (i01Var2 != null) {
                            if (i15 != this.Z2 || i16 != this.X2 || i17 != this.V2) {
                                i01Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f34653n1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        s01 s01Var = this.f34589e;
                        if (s01Var != null) {
                            s01Var.f41094c = s01.H(this);
                            this.f34589e.v.clear();
                            this.f34589e.J();
                            s01 s01Var2 = this.f34589e;
                            s01Var2.I(s01Var2.f41102y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                            if (w0Var != null) {
                                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f34569b1)));
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
                                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                                if (f5Var != null && f5Var.getLastFragment() == this) {
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
                                i01 i01Var3 = this.d;
                                if (i01Var3 != null) {
                                    i01Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !h4()) {
                                if (this.G4 < 0) {
                                    j5();
                                    R();
                                    i01 i01Var4 = this.d;
                                    if (i01Var4 != null) {
                                        i01Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new pb0(this, 17));
                                    return;
                                }
                                uz0 uz0Var5 = this.L;
                                if (uz0Var5 != null) {
                                    uz0Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f34569b1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f34569b1);
                                if (userFull3 != null) {
                                    this.f34691s2 = userFull3;
                                }
                                j5();
                                R();
                                oy0 oy0Var4 = this.f34560a;
                                if (oy0Var4 != null && oy0Var4.b0()) {
                                    this.f34560a.post(new pb0(this, 19));
                                    return;
                                }
                                i01 i01Var5 = this.d;
                                if (i01Var5 != null) {
                                    i01Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.B2;
                            if (chat5 != null && chat5.f20843id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.f34735z1;
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
                                        AndroidUtilities.updateVisibleRows(this.f34560a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        yy0 yy0Var4 = this.f34568b0;
                        if (yy0Var4 != null) {
                            yy0Var4.setHasStories(j4());
                            this.f34568b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f34613h2));
                        }
                        bz0 bz0Var4 = this.f34681r0;
                        if (bz0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f34691s2;
                            if (userFull4 != null) {
                                bz0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f34683r2;
                            if (chatFull9 != null) {
                                bz0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f34577c1)))) {
            getMessagesController().getStoriesController().k(a(), new ag.d(14), false, this.f34714w0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null && y40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if ((y40Var == null || dialog != y40Var.f33296c) && super.dismissDialogOnPause(dialog)) {
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
        if (!this.f34661o2 || (userFull = this.f34691s2) == null || (botInfo = userFull.bot_info) == null) {
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
        } else if (!z10 && this.f34560a.isInLayout()) {
            oy0 oy0Var = this.f34560a;
            if (!oy0Var.D) {
                return;
            }
            oy0Var.post(new org.telegram.ui.Components.rv0(6, this, z4));
        } else {
            wz0 wz0Var = new wz0(this);
            wz0Var.f42912b = this.K2;
            wz0Var.f(wz0Var.f42913c);
            wz0Var.f42914e.clear();
            wz0Var.f42915f.clear();
            wz0Var.f42914e.addAll(this.N4);
            wz0Var.f42915f.addAll(this.O4);
            wz0Var.f42916g = this.f34685r4;
            wz0Var.h = this.f34693s4;
            if (z4) {
                h5(false);
            }
            F4();
            j5();
            wz0Var.f(wz0Var.d);
            try {
                f2.q.c(wz0Var, true).b(this.d);
            } catch (Exception e6) {
                FileLog.e(e6);
                this.d.l();
            }
            int i10 = this.R5;
            if (i10 >= 0) {
                this.f34575c.h1(i10, this.S5 - this.f34560a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f34560a);
        }
    }

    @Override
    public final org.telegram.ui.Components.tl0 f() {
        return this.f34560a;
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
        this.f34634k2 = z4;
    }

    public final void f5() {
        int i10;
        if (this.Z != null && this.f34680r[1] != null) {
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
                org.telegram.ui.Components.ei0 ei0Var = this.Z;
                float dp = AndroidUtilities.dp(74.0f) + this.f34560a.getMeasuredWidth();
                ei0Var.I = O3() - AndroidUtilities.dp(74.0f);
                ei0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                ei0Var.invalidate();
                return;
            }
            if (z4) {
                this.Z.setAlpha(this.P1);
            }
            float f10 = i11;
            float dp2 = this.N1 + f10 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f10);
            org.telegram.ui.Components.ei0 ei0Var2 = this.Z;
            ei0Var2.I = min - AndroidUtilities.dp(74.0f);
            ei0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            ei0Var2.invalidate();
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
        return getMessagesController().isUserNoForwards(this.f34691s2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.P1;
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f34714w0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f34714w0 != null) {
            return null;
        }
        ey0 ey0Var = new ey0(0, this);
        ArrayList arrayList = new ArrayList();
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            arrayList.addAll(uz0Var.getThemeDescriptions());
        }
        oy0 oy0Var = this.f34560a;
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(oy0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, null, null, null, null, i10));
        oy0 oy0Var2 = this.f34560a;
        int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(oy0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21698f8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21881pc));
        int i12 = org.telegram.ui.ActionBar.k6.f21734h8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21990vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, i12));
        org.telegram.ui.Components.jo0 jo0Var = this.f34688s;
        if (jo0Var != null) {
            TextView textView = jo0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.k6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, ey0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34688s.getNextTextView(), 4, null, null, null, ey0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34562a1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        yy0 yy0Var = this.f34568b0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21906r0;
        int i14 = org.telegram.ui.ActionBar.k6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(yy0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34568b0, 0, null, null, new Drawable[]{this.m0}, null, org.telegram.ui.ActionBar.k6.f21661d8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.f22009wh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f22028xh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.yh));
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22017x6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21876p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21857o6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21961u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        int i16 = org.telegram.ui.ActionBar.k6.f21821m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21979v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.k6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 2, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.k6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.k6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21972uh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i23 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.k6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.k6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34560a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.k6.m0, null, null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21697f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21678e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34567b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z4 = this.C5;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
        if (z4) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(l5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.k6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.m6(l5VarArr[1], 0, null, null, this.f34727y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.k6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5VarArr[1], 0, null, null, this.f34727y, null, org.telegram.ui.ActionBar.k6.zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.f34714w0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34714w0;
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

    public final boolean h4() {
        if (this.f34652n0 != null && !this.f34667p1) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z4) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i11 = 0;
        this.f34730y2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.f34736z2.clear();
        TLRPC.ChatFull chatFull = this.f34683r2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z10 && chatFull.participants_count > 200) {
                this.f34730y2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f34683r2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34683r2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f20990id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.f34730y2++;
            }
            this.f34736z2.add(Integer.valueOf(i11));
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
                i11 = yh.d(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = yh.d(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.f34736z2, Comparator$EL.reversed(Comparator$CC.comparingInt(new cf(arrayList, 1))));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (z4 && this.d != null && this.f34685r4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f34560a);
        }
        if (this.L != null && this.G4 != -1) {
            if ((this.f34736z2.size() > 5 || this.P4 == 2) && this.P4 != 1) {
                this.L.a1(this.f34736z2, this.f34683r2);
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
        org.telegram.ui.Components.z4.s(this, false, chat, null, false, z10, z4, !isForum, new rx0(this, 1));
    }

    public final void i5(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f34646m2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v02;
        if (!this.f34646m2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.s()) {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22000w8, this.f34714w0);
            } else if (this.C5) {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f34714w0);
            } else {
                MessagesController.PeerColor peerColor = this.N5;
                if (peerColor != null) {
                    v02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
                } else {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, this.f34714w0);
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
        if (getMessagesController().getStoriesController().I(a()) && !this.f34653n1) {
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
        if (this.f34604g0 != null && (imageView = this.f34611h0) != null) {
            if (this.I1 && (chat = this.B2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f34611h0.setVisibility(0);
                this.f34604g0.setTag(1);
                this.f34604g0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f34611h0.setVisibility(8);
            this.f34604g0.setTag(null);
            this.f34604g0.setVisibility(8);
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
        if ((this.f34681r0 != null || this.f34689s0 != null) && (kVar = this.actionBar) != null) {
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
            bz0 bz0Var = this.f34681r0;
            if (bz0Var != null) {
                float x10 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
                if (Math.abs(f11 - bz0Var.f34847c0) <= 0.1f && Math.abs(width - bz0Var.f34848d0) <= 0.1f && Math.abs(x10 - bz0Var.f34850e0) <= 0.1f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                bz0Var.f34847c0 = f11;
                bz0Var.f34848d0 = width;
                if (z4) {
                    bz0Var.f34856j0.d(width, true);
                }
                bz0Var.f34850e0 = x10;
                if (z10) {
                    bz0Var.invalidate();
                }
            }
            mh.t0 t0Var = this.f34689s0;
            if (t0Var != null) {
                float x11 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
                int U3 = U3();
                z11 = (Math.abs(f11 - t0Var.f14781r) > 0.1f || Math.abs(width - t0Var.f14782s) > 0.1f || Math.abs(x11 - t0Var.v) > 0.1f) ? true : true;
                t0Var.f14781r = f11;
                t0Var.f14782s = width;
                if (z4) {
                    t0Var.f14785y.d(width, true);
                }
                t0Var.v = x11;
                t0Var.f14784x = U3 + x11;
                if (z11) {
                    t0Var.invalidate();
                }
            }
        }
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5():void");
    }

    public final void n4(boolean z4) {
        boolean z10;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34569b1));
        if (user != null) {
            if (this.f34661o2 && !MessagesController.isSupportUser(user)) {
                if (this.f34612h1 && !z4) {
                    getMessagesController().unblockPeer(this.f34569b1, new pb0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.B2;
                if (this.A2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.z4.s(this, false, chat, user, z10, true, false, true, new sx0(this, user));
            } else if (this.f34612h1) {
                getMessagesController().unblockPeer(this.f34569b1);
                if (org.telegram.ui.Components.qc.a(this)) {
                    org.telegram.ui.Components.qc.d(this, false).j();
                }
            } else if (this.f34619i1) {
                org.telegram.ui.Components.z4.j0(this, this.f34569b1, user, null, this.A2, false, null, new ta(this, 4), this.f34714w0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f34714w0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new rx0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q7, this.f34714w0));
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
        if (i13 > 0 && !this.T1 && (this.f34652n0 == null || this.L2 == -1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E5 = z10;
        C3();
        org.telegram.ui.Components.lj0 lj0Var = this.v;
        if (lj0Var != null && lj0Var.getVisibility() != 8) {
            org.telegram.ui.Components.lj0 lj0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            lj0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.N1) + this.Q1) - AndroidUtilities.dp(29.5f));
            if (i13 > 0 && !this.T1 && !this.f34667p1 && (this.f34652n0 == null || this.L2 == -1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f34577c1 != 0) {
                if (ChatObject.isChannel(this.B2) && !this.B2.megagroup && (chatFull = this.f34683r2) != null && chatFull.linked_chat_id != 0 && (this.A3 != -1 || this.B3 != -1)) {
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
                    AnimatorSet animatorSet = this.f34713w;
                    if (animatorSet != null) {
                        this.f34713w = null;
                        animatorSet.cancel();
                    }
                    float f12 = 0.0f;
                    if (z4) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f34713w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f34713w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f34713w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f34713w.setDuration(150L);
                        this.f34713w.addListener(new lz0(this, 1));
                        this.f34713w.start();
                    } else {
                        org.telegram.ui.Components.lj0 lj0Var3 = this.v;
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        lj0Var3.setScaleX(f10);
                        org.telegram.ui.Components.lj0 lj0Var4 = this.v;
                        if (z11) {
                            f11 = 1.0f;
                        }
                        lj0Var4.setScaleY(f11);
                        org.telegram.ui.Components.lj0 lj0Var5 = this.v;
                        if (z11) {
                            f12 = 1.0f;
                        }
                        lj0Var5.setAlpha(f12);
                    }
                }
            }
        } else {
            z11 = false;
        }
        bz0 bz0Var = this.f34681r0;
        if (bz0Var != null) {
            float measuredWidth = this.W.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            bz0Var.f34852f0 = measuredWidth;
            bz0Var.f34854h0 = z11;
            bz0Var.f34853g0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            bz0Var.invalidate();
        }
        mh.t0 t0Var = this.f34689s0;
        if (t0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            t0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.N1 + this.Q1);
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
        if (this.f34569b1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34569b1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f34691s2;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.g2.n(user, z4, z10, getParentActivity(), this.f34691s2, getAccountInstance());
            }
        } else if (this.f34577c1 != 0) {
            if (getMessagesController().getGroupCall(this.f34577c1, false) == null) {
                TLRPC.Chat chat = this.B2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.a80.t(getParentActivity(), -chat.f20843id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.g2.m(this.B2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.pr0 pr0Var;
        org.telegram.ui.Components.os0 os0Var;
        org.telegram.ui.Components.g90 g90Var;
        int v02;
        int v03;
        int v04;
        int color3;
        int v05;
        int v06;
        int v07;
        this.O5.clear();
        v01 v01Var = this.f34562a1;
        if (v01Var != null) {
            v01Var.a(this.N5, true);
        }
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34680r;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            if (l5Var.getTag() instanceof Integer) {
                v07 = org.telegram.ui.ActionBar.k6.v0(((Integer) l5VarArr[1].getTag()).intValue(), this.f34714w0);
            } else {
                v07 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B8, this.f34714w0);
            }
            l5VarArr[1].setTextColor(i0.a.d(this.f34613h2, w3(v07, Boolean.valueOf(this.G0[0])), -1275068417));
        }
        t01 t01Var = this.Y5;
        float f10 = -0.1f;
        if (t01Var != null) {
            t01Var.a(i0.a.d(this.f34613h2, org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.N5 != null) {
                v05 = -1;
            } else {
                v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, this.f34714w0);
            }
            kVar.C(i0.a.d(this.B5, v05, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y8, this.f34714w0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.N5;
            if (peerColor != null) {
                v06 = 1090519039;
            } else if (peerColor != null) {
                v06 = 553648127;
            } else {
                v06 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21698f8, this.f34714w0);
            }
            kVar2.B(i0.a.d(this.B5, v06, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z8, this.f34714w0)), false);
        }
        Drawable[] drawableArr = this.f34727y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.N5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.N5.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
                    color3 = this.N5.getColor5();
                } else {
                    color3 = this.N5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.08f;
                }
                v04 = org.telegram.ui.ActionBar.k6.b(0.1f, f10, d);
            } else {
                v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.f34714w0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v04, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oi, this.f34714w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.F;
        if (drawableArr2[1] != null) {
            if (this.N5 != null) {
                v03 = -1;
            } else {
                v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, this.f34714w0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(v03, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f34714w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f34596f[1];
        if (l5Var2 != null) {
            if (this.N5 != null) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21990vh, this.f34714w0);
            }
            l5Var2.setTextColor(i0.a.d(this.f34613h2, i0.a.d(this.B5, v02, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oi, this.f34714w0)), -1));
        }
        org.telegram.ui.Components.h8 h8Var = this.X0;
        if (h8Var != null && (g90Var = h8Var.f27407e) != null) {
            g90Var.invalidate();
        }
        Drawable drawable = this.f34720x;
        if (drawable != null) {
            if (this.N5 == null) {
                i10 = i0.a.d(this.P1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21881pc, this.f34714w0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ei0 ei0Var = this.Z;
        if (ei0Var != null) {
            ei0Var.setColor(this.N5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f34560a, (h5.d) new ay0(this, 1));
        uz0 uz0Var = this.L;
        if (uz0Var != null && (os0Var = uz0Var.F0) != null) {
            os0Var.e();
        }
        uz0 uz0Var2 = this.L;
        if (uz0Var2 != null && (pr0Var = uz0Var2.S) != null) {
            pr0Var.m();
        }
        p5();
        X4();
        bz0 bz0Var = this.f34681r0;
        if (bz0Var != null) {
            bz0Var.f(true, true);
        }
        mh.t0 t0Var = this.f34689s0;
        if (t0Var != null) {
            t0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.i(i10, i11, intent);
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
        org.telegram.ui.Components.ei0 ei0Var;
        org.telegram.ui.Components.lh0 lh0Var;
        super.onConfigurationChanged(configuration);
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            uz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f34634k2 && (lh0Var = this.X) != null) {
            lh0Var.i();
        }
        if (this.f34634k2 && (ei0Var = this.Z) != null) {
            ei0Var.b();
        }
        if (this.f34634k2 && this.f34646m2 && (m9 = this.f34575c.m(0)) != null) {
            this.f34560a.scrollBy(0, m9.getTop() - T3());
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
        oy0 oy0Var = this.f34560a;
        if (oy0Var != null) {
            oy0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            uz0Var.F0();
        }
        org.telegram.ui.Components.ru0 ru0Var = this.O;
        if (ru0Var != null) {
            ru0Var.b(this);
        }
        org.telegram.ui.Components.ru0 ru0Var2 = this.O;
        if (ru0Var2 != null) {
            ru0Var2.f30874x.remove(this);
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
        zy0 zy0Var = this.f34632k0;
        if (zy0Var != null) {
            zy0Var.K();
        }
        org.telegram.ui.Components.oh0 oh0Var = this.f34625j0;
        if (oh0Var != null) {
            oh0Var.e();
        }
        this.G5 = null;
        if (this.f34569b1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f34569b1);
        } else if (this.f34577c1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        yy0 yy0Var = this.f34568b0;
        if (yy0Var != null) {
            yy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.e();
        }
        dz0 dz0Var = this.S4;
        if (dz0Var != null) {
            dz0Var.b();
        }
        x01 x01Var = this.f34709v2;
        if (x01Var != null && this.f34703u2) {
            x01Var.b(true);
            this.f34709v2 = null;
        }
        org.telegram.messenger.w8 w8Var = this.f34706u5;
        if (w8Var != null) {
            this.f34706u5 = null;
            AndroidUtilities.runOnUIThread(w8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.et0 et0Var;
        super.onPause();
        UndoView undoView = this.J;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.j();
        }
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        uz0 uz0Var = this.L;
        if (uz0Var != null && (et0Var = uz0Var.Q) != null) {
            et0Var.f43961e = false;
            if (et0Var.f43960c != null) {
                et0Var.f43958a.onPause();
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
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.k(i10, strArr, iArr);
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
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f34577c1, false);
                    TLRPC.Chat chat = this.B2;
                    if (groupCall == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.g2.m(chat, null, z13, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.g2.i(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34569b1));
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
            TLRPC.UserFull userFull = this.f34691s2;
            if (userFull != null && userFull.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.voip.g2.n(user, z10, z11, getParentActivity(), this.f34691s2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.g2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        iw0 iw0Var;
        super.onResume();
        uz0 uz0Var = this.L;
        if (uz0Var != null) {
            uz0Var.Y0 = true;
            org.telegram.ui.Components.dt0 dt0Var = uz0Var.E;
            if (dt0Var != null) {
                dt0Var.l();
            }
            org.telegram.ui.Components.mu0 mu0Var = uz0Var.H;
            if (mu0Var != null) {
                mu0Var.l();
            }
            org.telegram.ui.Components.nu0 nu0Var = uz0Var.G;
            if (nu0Var != null) {
                nu0Var.X(false);
            }
            for (int i10 = 0; i10 < uz0Var.f33980h0.length; i10++) {
                uz0Var.U(i10);
            }
            org.telegram.ui.Components.et0 et0Var = uz0Var.Q;
            if (et0Var != null) {
                et0Var.f43961e = true;
                if (et0Var.f43960c != null) {
                    et0Var.f43958a.onResume();
                }
            }
        }
        f4();
        i01 i01Var = this.d;
        if (i01Var != null) {
            this.Q4 = true;
            i01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (iw0Var = this.R) != null && iw0Var.getVisibility() == 0) {
            this.R.setVisibility(8);
            this.R.setBackground(null);
        }
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ai(this, 5));
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f34596f[1];
        if (l5Var != null) {
            setParentActivityTitle(l5Var.getText());
        }
        if (this.f34569b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f34569b1))) != null && user.photo == null && this.N1 >= T3()) {
            this.f34606g2.cancel();
            float[] fArr = this.f34627j2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f34632k0.setVisibility(8);
            this.N1 = T3();
            this.f34640l2 = false;
            this.f34575c.h1(0, T3() - this.f34560a.getPaddingTop());
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
                        this.f34613h2 = 0.0f;
                        org.telegram.ui.Components.kw0 kw0Var = this.Q;
                        if (kw0Var != null) {
                            kw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.lh0 lh0Var = this.X;
                        if (lh0Var != null) {
                            lh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ei0 ei0Var = this.Z;
                        if (ei0Var != null) {
                            ei0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.D1 = false;
                    A3();
                    if (this.F1) {
                        D3(true);
                    }
                }
                if (!this.f34623i5) {
                    this.f34623i5 = true;
                    this.R4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.M4);
            iw0 iw0Var = this.R;
            if (iw0Var != null && iw0Var.getVisibility() == 0) {
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
        iw0 iw0Var = this.R;
        if (iw0Var != null && iw0Var.getVisibility() == 0) {
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
        org.telegram.ui.Components.lh0 lh0Var;
        super.onTransitionAnimationStart(z4, z10);
        this.J5 = z4;
        if (z4 && (lh0Var = this.X) != null) {
            ArrayList arrayList = lh0Var.f28735a;
            if (lh0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.ih0 ih0Var = (org.telegram.ui.Components.ih0) arrayList.get(i10);
                    org.telegram.ui.Components.ij0 ij0Var = ih0Var.f27794k;
                    if (ij0Var != null) {
                        if (ih0Var.f27786a == 15) {
                            ij0Var.K(14);
                        } else {
                            ij0Var.K(0);
                        }
                        ih0Var.f27794k.start();
                    }
                }
            }
        }
        if (!z4 && (imageView = this.L0) != null && imageView.getTag() != null && (this.L0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.L0.getTag()).setAlpha(1.0f);
        }
        if (((!z4 && z10) || (z4 && !z10)) && this.G1 != 0 && this.J1 && !this.f34646m2) {
            this.D1 = true;
            if (!z4) {
                if (this.G5 == null) {
                    this.G5 = new float[16];
                }
                this.C1 = this.N1;
                this.G5[0] = this.V.getScaleX();
                this.G5[1] = this.V.getTranslationX();
                this.G5[2] = this.V.getTranslationY();
                org.telegram.ui.Components.lh0 lh0Var2 = this.X;
                if (lh0Var2 != null) {
                    this.G5[3] = lh0Var2.getAlpha();
                }
                mh.t0 t0Var = this.f34689s0;
                if (t0Var != null) {
                    float[] fArr = this.G5;
                    fArr[4] = t0Var.f14778e;
                    fArr[5] = t0Var.f14779f;
                }
                t01 t01Var = this.Y5;
                if (t01Var != null) {
                    this.G5[6] = t01Var.getAlpha();
                }
                float[] fArr2 = this.G5;
                org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
                fArr2[7] = l5VarArr[1].getScaleX();
                this.G5[8] = l5VarArr[1].getTranslationY();
                float[] fArr3 = this.G5;
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f34680r;
                fArr3[9] = l5VarArr2[1].getTranslationY();
                this.G5[10] = l5VarArr[1].getLayoutParams().width;
                this.G5[11] = this.Z1;
                for (int i11 = 0; i11 < l5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i11];
                    if (l5Var != null) {
                        int i12 = i11 * 2;
                        this.G5[i12 + 12] = l5Var.getTranslationX();
                        this.G5[i12 + 13] = l5VarArr2[i11].getTranslationX();
                    }
                }
                qh.f3 f3Var = this.f34566a6;
                if (f3Var != null) {
                    f3Var.e(true);
                }
            }
        }
        if (z4) {
            if (this.f34652n0 != null) {
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
        TLRPC.UserFull userFull = this.f34691s2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.B2 != null) {
            org.telegram.ui.Components.n40.h.a();
        }
        showDialog(new lh.g2(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22028xh, this.f34714w0);
                int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.yh, this.f34714w0);
                int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22009wh, this.f34714w0);
                if (this.N5 != null && org.telegram.ui.ActionBar.k6.b1(v02)) {
                    v02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.N5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.N5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
                        v03 = org.telegram.ui.ActionBar.k6.C(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21979v6, this.f34714w0), bgColor2, v03, bgColor2);
                    }
                    v04 = -1;
                }
                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(mutate, org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                pqVar.f30168e = dp;
                pqVar.f30169f = dp2;
                this.v.setBackground(pqVar);
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
        getMessagesController().addUserToChat(this.B2.f20843id, getUserConfig().getCurrentUser(), 0, null, this, true, new xq0(this, z4, zArr, 1), new o9.b(this, zArr, z4, this.parentLayout.getLastFragment(), 4));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void r4(View view, float f10, float f11, boolean z4) {
        float f12;
        float f13;
        long j10;
        long j11 = this.f34598f1;
        if (j11 == 0) {
            j11 = this.f34569b1;
            if (j11 == 0) {
                j11 = -this.f34577c1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f34583d1);
        if (z4 && (this.f34653n1 || isDialogMuted)) {
            boolean z10 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f34583d1, z10);
            org.telegram.ui.Components.qc.A(this, z10, null).j();
            a5();
            this.X.setNotifications(isDialogMuted);
        } else if ((!z4 && LocaleController.isRTL && f10 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z11 = j5Var.f23019e.h;
            boolean z12 = !z11;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f34583d1);
            if (!z11) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f34583d1 == 0) {
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
                if (this.f34583d1 == 0) {
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
            getNotificationsController().updateServerNotificationsSettings(j12, this.f34583d1);
            j5Var.setChecked(z12);
            org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) this.f34560a.L(this.K3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.no noVar = new org.telegram.ui.Components.no(getParentActivity(), this.currentAccount, null, true, new f2.c(this, j12, 6), this.f34714w0);
            noVar.d(j12, this.f34583d1, this.f34595e5);
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
            noVar.c(this, view, f12, f13, z4);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null) {
            y40Var.f33298f = bundle.getString("path");
        }
    }

    @Override
    public final void s() {
        this.f34560a.x0(0);
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f34569b1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34569b1));
                if (user != null) {
                    if (this.C2 != null && (userFull = this.f34691s2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f34691s2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f34577c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f34577c1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f34683r2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f34683r2.about, ChatObject.getPublicUsername(chat));
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.f34652n0;
        if (y40Var != null && (str = y40Var.f33298f) != null) {
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
        this.f34613h2 = f10;
        this.P1 = f10;
        B3();
        if (this.G1 == 2) {
            this.f34568b0.setProgressToExpand(f10);
            org.telegram.ui.Components.lh0 lh0Var = this.X;
            if (lh0Var != null) {
                lh0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.ei0 ei0Var = this.Z;
            if (ei0Var != null) {
                ei0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.kw0 kw0Var = this.Q;
            if (kw0Var != null) {
                kw0Var.setParentExpanded(f10);
            }
            S4();
            f5();
        }
        this.f34560a.setAlpha(f10);
        this.f34560a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f10));
        if (this.G1 != 2 || (v02 = this.f34659o0) == 0) {
            if (this.f34569b1 == 0 && ChatObject.isChannel(this.f34577c1, this.currentAccount)) {
                boolean z4 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f34714w0;
            int[][] iArr = org.telegram.ui.Components.z8.C;
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, g6Var);
        }
        int i11 = this.U4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, this.f34714w0);
        }
        this.f34562a1.setBackgroundColor(i0.a.d(f10, i0.a.k(i11, 0), v02));
        org.telegram.ui.Components.y11 y11Var = this.f34618i0;
        int d = i0.a.d(f10, i11, v02);
        y11Var.f33281k = true;
        y11Var.f33274b.setColor(d);
        int i12 = -1;
        if (this.N5 != null) {
            v03 = -1;
        } else {
            if (this.f34569b1 == 0 && ChatObject.isChannel(this.f34577c1, this.currentAccount)) {
                boolean z10 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = this.f34714w0;
            int[][] iArr2 = org.telegram.ui.Components.z8.C;
            v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21716g8, g6Var2);
        }
        this.actionBar.C(i0.a.d(this.P1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, this.f34714w0), v03), false);
        if (this.N5 == null) {
            i12 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21990vh, this.f34714w0);
        }
        int v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, this.f34714w0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f34596f[i13];
            if (l5Var != null && (i13 != 1 || this.G1 != 2)) {
                l5Var.setTextColor(i0.a.d(f10, v05, i12));
            }
        }
        boolean[] zArr = this.G0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Bh, this.f34714w0);
        } else {
            if (this.f34569b1 == 0 && ChatObject.isChannel(this.f34577c1, this.currentAccount)) {
                boolean z11 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var3 = this.f34714w0;
            int[][] iArr3 = org.telegram.ui.Components.z8.C;
            v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21734h8, g6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.k6.f21879pa;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.B8;
        }
        int v06 = org.telegram.ui.ActionBar.k6.v0(i10, this.f34714w0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.l5 l5Var2 = this.f34680r[i14];
            if (l5Var2 != null && i14 != 1 && (i14 != 2 || this.G1 != 2)) {
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
                l5Var2.setTextColor(i0.a.d(f10, w32, w33));
            }
        }
        this.N1 = this.O1 * f10;
        long j10 = this.f34569b1;
        if (j10 == 0) {
            j10 = this.f34577c1;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = this.f34714w0;
        int[][] iArr4 = org.telegram.ui.Components.z8.C;
        int v07 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[org.telegram.ui.Components.z8.e(j10)], g6Var4);
        long j11 = this.f34569b1;
        if (j11 == 0) {
            j11 = this.f34577c1;
        }
        int d10 = org.telegram.ui.Components.z8.d(j11);
        if (v07 != d10) {
            this.m0.h(i0.a.d(f10, d10, v07));
            this.f34568b0.invalidate();
        }
        int i15 = this.V4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f10, i15, getNavigationBarColor()));
        }
        this.f34562a1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        d01 d01Var = this.K5;
        if (d01Var != null) {
            d01Var.invalidate();
        }
        if (a() > 0) {
            yy0 yy0Var = this.f34568b0;
            if (yy0Var != null) {
                yy0Var.setProgressToStoriesInsets(this.P1);
            }
            bz0 bz0Var = this.f34681r0;
            if (bz0Var != null) {
                bz0Var.setProgressToStoriesInsets(this.P1);
            }
            mh.t0 t0Var = this.f34689s0;
            if (t0Var != null) {
                t0Var.setProgressToStoriesInsets(this.P1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.f5 f5Var) {
        super.setParentLayout(f5Var);
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.U1 = null;
        }
        if (f5Var != null && f5Var.getParentActivity() != null) {
            this.U1 = new FlagSecureReason(f5Var.getParentActivity().getWindow(), new rx0(this, 6));
        }
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.I3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f34577c1);
            bundle.putLong("user_id", this.f34569b1);
            presentFragment(new o21(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.R2) {
            if (this.f34569b1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f34691s2)) {
                org.telegram.ui.Components.qc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f34569b1)))).j();
            } else {
                showDialog(new lh.g2(getParentActivity(), this.currentAccount, this.f34569b1, null, null));
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u4() {
        boolean z4;
        org.telegram.ui.Components.ij0 ij0Var;
        if (this.f34569b1 != 0) {
            if (this.f34652n0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.y40 y40Var = this.f34652n0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    y40Var.o(z4, new pb0(this, 24), new v5(this, 14), 0);
                    this.S.K(0);
                    this.S.N(43);
                    this.T.K(0);
                    this.T.N(43);
                    org.telegram.ui.Components.lh0 lh0Var = this.X;
                    if (lh0Var != null) {
                        org.telegram.ui.Components.ih0 j10 = org.telegram.ui.Components.lh0.j(14, lh0Var.f28735a);
                        if (j10 != null && (ij0Var = j10.f27794k) != null) {
                            ij0Var.start();
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

    @Override
    public final boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, pyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new xn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f34569b1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z10, i10, i11, 0L);
        }
        return true;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f34598f1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.bt(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = android.support.v4.media.a.i("addToGroup", true);
        i10.putLong("chatId", this.B2.f20843id);
        z60 z60Var = new z60(i10);
        TLRPC.ChatFull chatFull = this.f34683r2;
        z60Var.F = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.f34683r2.participants.participants.size(); i11++) {
                hVar.k(null, this.f34683r2.participants.participants.get(i11).user_id);
            }
            z60Var.G = hVar;
        }
        z60Var.f43850x = new rx0(this, 9);
        presentFragment(z60Var);
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.N5 != null) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, this.f34714w0);
            int d = i0.a.d(0.5f, this.N5.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), this.N5.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()));
            if (!org.telegram.ui.ActionBar.k6.b1(v02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.l1(0.7f, d));
                }
                return d;
            }
            boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.k6.l1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.k6.C(q10, v02, d, i10, i11);
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
            ValueAnimator valueAnimator = this.f34606g2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f34606g2.cancel();
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
                org.telegram.ui.Components.kw0 kw0Var = this.Q;
                if (kw0Var != null) {
                    kw0Var.setAlpha(clamp01);
                }
                this.f34568b0.setAlpha(1.0f);
                this.V.setAlpha(1.0f);
                bz0 bz0Var = this.f34681r0;
                if (bz0Var != null) {
                    bz0Var.invalidate();
                }
                mh.t0 t0Var = this.f34689s0;
                if (t0Var != null) {
                    t0Var.f14778e = AndroidUtilities.lerp(0.0f, this.G5[4], f10);
                    this.f34689s0.f14779f = AndroidUtilities.lerp(0.0f, this.G5[5], clamp01);
                    mh.t0 t0Var2 = this.f34689s0;
                    t0Var2.h = true;
                    t0Var2.invalidate();
                }
                t01 t01Var = this.Y5;
                if (t01Var != null) {
                    t01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.G5[6], clamp01));
                }
                float dp = (((this.Y1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f34590e0.setTranslationX(this.V.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f34590e0.setTranslationY(this.V.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f34597f0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f34597f0.setTranslationY(this.V.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f34604g0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f34604g0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f34611h0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f34611h0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.G5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f34570b2 = AndroidUtilities.lerp(floor, this.G5[8], clamp01);
                this.f34584d2 = AndroidUtilities.lerp(dpf2, this.G5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
                    if (i13 >= l5VarArr.length) {
                        break;
                    }
                    if (l5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i14 + 13], clamp01);
                        l5VarArr[i13].setTranslationX(lerp2);
                        l5VarArr[i13].setTranslationY(this.f34570b2);
                        org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f34680r;
                        l5VarArr2[i13].setTranslationX(this.f34643l5 + lerp3);
                        l5VarArr2[i13].setTranslationY(this.f34584d2);
                        if (i13 == 1) {
                            this.a2 = lerp2;
                            this.f34578c2 = lerp3;
                            this.f34688s.setTranslationX(lerp3);
                            this.f34688s.setTranslationY(this.f34584d2);
                        }
                        l5VarArr[i13].setScaleX(lerp);
                        l5VarArr[i13].setScaleY(lerp);
                    }
                    i13++;
                }
                V4();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                l4((int) this.G5[10], clamp01, true);
                org.telegram.ui.Components.lh0 lh0Var = this.X;
                if (lh0Var != null) {
                    lh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.G5[3], f10));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f34569b1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f34569b1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f34569b1);
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
                xnVar.f43426y9 = getMediaDataController().getGreetingsSticker();
                xnVar.f43438z9 = false;
                presentFragment(xnVar, z4);
                if (AndroidUtilities.isTablet() && !this.F0) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final tg.d y() {
        return this.f34638k6;
    }

    public final float y3() {
        return Utilities.clamp01((this.N1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.f34683r2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f34683r2.linked_chat_id);
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
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.f34596f;
            if (i11 >= l5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i11];
            if (l5Var != null) {
                float measuredWidth = (this.f34560a.getMeasuredWidth() / 2.0f) - (((l5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f34680r;
                float measuredWidth2 = (this.f34560a.getMeasuredWidth() / 2.0f) - ((l5VarArr2[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) l5VarArr2[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.a2 = measuredWidth;
                    this.f34578c2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.G1 != 2) {
            this.f34681r0.setAlpha(1.0f);
        }
        this.V.setAlpha(1.0f);
        this.f34568b0.setAlpha(1.0f);
    }

    public final void z4(boolean z4) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f34691s2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z4) {
                oh.i8 i8Var = new oh.i8(3, 1);
                i8Var.setResourceProvider(this.f34714w0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f34691s2.business_location;
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
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f34691s2.business_location.address, new Object[0]))));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.ru0 ru0Var) {
        super(bundle);
        this.f34596f = new org.telegram.ui.ActionBar.l5[2];
        this.h = null;
        this.f34651n = null;
        this.f34680r = new org.telegram.ui.ActionBar.l5[4];
        this.f34727y = new Drawable[2];
        this.B = new Drawable[2];
        this.D = new org.telegram.ui.Components.j5[2];
        this.E = new org.telegram.ui.Components.j5[2];
        this.F = new Drawable[2];
        this.G = new org.telegram.ui.Components.or[2];
        this.H = new org.telegram.ui.Components.or[2];
        this.f34695t0 = null;
        this.f34701u0 = new org.telegram.ui.Components.k50(this, 1);
        this.f34707v0 = new Paint(1);
        this.G0 = new boolean[1];
        this.Y0 = 1.0f;
        this.f34735z1 = new a0.h();
        this.J1 = true;
        this.K1 = false;
        this.L1 = false;
        this.M1 = false;
        this.V1 = new HashMap();
        this.f34627j2 = new float[]{0.0f, 1.0f};
        this.f34654n2 = new Paint();
        this.f34730y2 = -1;
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
        this.f34595e5 = new HashSet();
        this.f34609g5 = new org.telegram.ui.Cells.c2(this);
        this.f34616h5 = new jz0(this);
        this.f34726x5 = new xd.a(0, new rx0(this, 8), org.telegram.ui.Components.pr.h, 380L, true);
        this.D5 = new kz0(this);
        this.F5 = new lz0(this, 0);
        this.G5 = null;
        this.O5 = new SparseIntArray();
        this.Q5 = null;
        this.R5 = -1;
        this.V5 = -1.0f;
        tg.b bVar = new tg.b();
        this.f34650m6 = bVar;
        og.a aVar = new og.a(bVar);
        this.f34658n6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.f34679q6 = arrayList;
        RectF rectF = new RectF();
        this.f34687r6 = rectF;
        RectF rectF2 = new RectF();
        this.s6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.O = ru0Var;
        tg.c cVar = new tg.c();
        cVar.a(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f34714w0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34631j6 = new og.e(false);
            tg.d dVar = new tg.d(null);
            this.f34638k6 = dVar;
            og.a aVar2 = new og.a(dVar);
            this.f34644l6 = aVar2;
            aVar2.f16755f = LiteMode.isEnabled(262144);
        } else {
            this.f34631j6 = null;
            this.f34638k6 = null;
            this.f34644l6 = new og.a(cVar);
        }
        aVar.f16753c = new be.b(true);
    }

    @Override
    public final void P() {
    }
}

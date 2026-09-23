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
public class ProfileActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, ly, org.telegram.ui.Components.ru0, org.telegram.ui.Components.u40, org.telegram.ui.Components.kt0, yg0 {
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public final le.c A5;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public oz0 B5;
    public int C0;
    public a0.i C1;
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
    public final org.telegram.ui.Components.o5[] G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final tz0 G5;
    public final org.telegram.ui.Components.o5[] H;
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
    public final uz0 I5;
    public final org.telegram.ui.Components.qr[] J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public float[] J5;
    public final org.telegram.ui.Components.qr[] K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public org.telegram.ui.Components.yl0 L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public float L5;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.s8 M2;
    public int M3;
    public int M4;
    public boolean M5;
    public t01 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public n01 N5;
    public e01 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public float O5;
    public org.telegram.ui.Components.xw0 P;
    public org.telegram.ui.ActionBar.v0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.v0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public MessagesController.PeerColor Q5;
    public org.telegram.ui.Components.qu0 R;
    public org.telegram.ui.ActionBar.v0 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final SparseIntArray R5;
    public boolean S;
    public org.telegram.ui.ActionBar.v0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public int S5;
    public org.telegram.ui.Components.iw0 T;
    public org.telegram.ui.ActionBar.v0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public AnimatorSet T5;
    public p50 U;
    public org.telegram.ui.ActionBar.v0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.yi0 V;
    public org.telegram.ui.ActionBar.f1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public mz0 V4;
    public int V5;
    public org.telegram.ui.Components.yi0 W;
    public org.telegram.ui.ActionBar.f1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public org.telegram.ui.Components.j40 X;
    public org.telegram.ui.ActionBar.f1 X0;
    public FlagSecureReason X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public k0 Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public float Y5;
    public ci.m6 Z;
    public org.telegram.ui.ActionBar.f1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public yy0 f31209a;
    public org.telegram.ui.Components.eh0 f31210a0;
    public org.telegram.ui.Components.o8 f31211a1;
    public float a2;
    public int f31212a3;
    public int f31213a4;
    public long f31214a5;
    public float f31215a6;
    public org.telegram.ui.Components.ml0 f31216b;
    public MessagesController.SavedMusicList f31217b0;
    public float f31218b1;
    public float f31219b2;
    public int f31220b3;
    public int f31221b4;
    public boolean f31222b5;
    public d11 f31223b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public az0 f31224c;
    public org.telegram.ui.Components.wh0 f31225c0;
    public int f31226c1;
    public float f31227c2;
    public int f31228c3;
    public int f31229c4;
    public boolean f31230c5;
    public j11 f31231c6;
    public s01 d;
    public org.telegram.ui.Cells.o f31232d0;
    public f11 f31233d1;
    public float f31234d2;
    public int f31235d3;
    public int f31236d4;
    public String f31237d5;
    public ci.e4 f31238d6;
    public c11 e;
    public hz0 f31239e0;
    public long f31240e1;
    public float f31241e2;
    public int f31242e3;
    public int f31243e4;
    public String f31244e5;
    public int f31245e6;
    public final org.telegram.ui.ActionBar.i5[] f31246f;
    public AnimatorSet f31247f0;
    public long f31248f1;
    public float f31249f2;
    public int f31250f3;
    public int f31251f4;
    public String f31252f5;
    public Boolean f31253f6;
    public org.telegram.ui.Cells.z3 f31254g0;
    public long f31255g1;
    public float f31256g2;
    public int f31257g3;
    public int f31258g4;
    public org.telegram.ui.Components.bh f31259g5;
    public TLRPC.TL_emojiStatusCollectible f31260g6;
    public String h;
    public ImageView f31261h0;
    public boolean f31262h1;
    public float f31263h2;
    public int f31264h3;
    public int f31265h4;
    public final HashSet f31266h5;
    public int f31267h6;
    public ImageView f31268i0;
    public long f31269i1;
    public float f31270i2;
    public int f31271i3;
    public int f31272i4;
    public CharacterStyle f31273i5;
    public boolean f31274i6;
    public ImageView f31275j0;
    public boolean f31276j1;
    public ValueAnimator f31277j2;
    public int j3;
    public int f31278j4;
    public final org.telegram.ui.Cells.c2 f31279j5;
    public int f31280j6;
    public ImageView f31281k0;
    public boolean f31282k1;
    public float f31283k2;
    public int f31284k3;
    public int f31285k4;
    public final sz0 f31286k5;
    public int f31287k6;
    public org.telegram.ui.Components.u11 f31288l0;
    public boolean l1;
    public float f31289l2;
    public int f31290l3;
    public int l4;
    public boolean f31291l5;
    public int f31292l6;
    public org.telegram.ui.Components.gh0 m0;
    public long f31293m1;
    public final float[] f31294m2;
    public int f31295m3;
    public int f31296m4;
    public c01 f31297m5;
    public final ah.h f31298m6;
    public String f31299n;
    public iz0 f31300n0;
    public boolean f31301n1;
    public boolean f31302n2;
    public int f31303n3;
    public int f31304n4;
    public float f31305n5;
    public final fh.d f31306n6;
    public v01 f31307o0;
    public boolean f31308o1;
    public boolean f31309o2;
    public int f31310o3;
    public int f31311o4;
    public float f31312o5;
    public final ah.c f31313o6;
    public org.telegram.ui.Components.h9 f31314p0;
    public boolean f31315p1;
    public boolean f31316p2;
    public int f31317p3;
    public int f31318p4;
    public boolean p5;
    public final fh.b f31319p6;
    public org.telegram.ui.Components.v40 f31320q0;
    public boolean f31321q1;
    public final Paint f31322q2;
    public int f31323q3;
    public int f31324q4;
    public boolean f31325q5;
    public final ah.c q6;
    public final org.telegram.ui.ActionBar.i5[] f31326r;
    public int f31327r0;
    public boolean f31328r1;
    public boolean f31329r2;
    public int f31330r3;
    public int f31331r4;
    public ImageReceiver f31332r5;
    public hh.k f31333r6;
    public org.telegram.ui.Components.do0 f31334s;
    public org.telegram.ui.Components.u11 f31335s0;
    public boolean f31336s1;
    public ei.w0 f31337s2;
    public int f31338s3;
    public int f31339s4;
    public FrameLayout f31340s5;
    public ny0 f31341s6;
    public org.telegram.ui.Components.th0 f31342t0;
    public boolean f31343t1;
    public ei.r f31344t2;
    public int f31345t3;
    public int f31346t4;
    public FrameLayout[] f31347t5;
    public final ArrayList f31348t6;
    public kz0 f31349u0;
    public int f31350u1;
    public TLRPC.ChatFull f31351u2;
    public int f31352u3;
    public int f31353u4;
    public SpannableStringBuilder f31354u5;
    public final RectF f31355u6;
    public org.telegram.ui.Components.bj0 v;
    public yh.g0 f31356v0;
    public boolean f31357v1;
    public TLRPC.UserFull f31358v2;
    public int f31359v3;
    public int f31360v4;
    public SpannableStringBuilder f31361v5;
    public final RectF f31362v6;
    public AnimatorSet f31363w;
    public View f31364w0;
    public boolean f31365w1;
    public org.telegram.ui.Cells.g6 f31366w2;
    public int f31367w3;
    public int f31368w4;
    public ci.d[] f31369w5;
    public Drawable f31370x;
    public final org.telegram.ui.Components.g50 f31371x0;
    public boolean f31372x1;
    public boolean f31373x2;
    public int f31374x3;
    public int f31375x4;
    public org.telegram.messenger.u8 f31376x5;
    public final Drawable[] f31377y;
    public final Paint f31378y0;
    public int f31379y1;
    public g11 f31380y2;
    public int y3;
    public int f31381y4;
    public FrameLayout f31382y5;
    public org.telegram.ui.ActionBar.d6 f31383z0;
    public boolean f31384z1;
    public CharSequence f31385z2;
    public int f31386z3;
    public int f31387z4;
    public ci.d f31388z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f7;
        RectF rectF = profileActivity.f31362v6;
        ah.h hVar = profileActivity.f31298m6;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f31292l6) - AndroidUtilities.dp(8.0f);
            profileActivity.f31355u6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(2, profileActivity.f31348t6);
            hVar.e(profileActivity.f31341s6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.yu0.w0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.f31267h6 && w02 == profileActivity.f31274i6) {
            return;
        }
        profileActivity.f31267h6 = i10;
        profileActivity.f31274i6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f31369w5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f31369w5[0].g(profileActivity.f31361v5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f31369w5[0].g(profileActivity.f31354u5, true, true);
        } else {
            profileActivity.f31369w5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        a10 a10Var = new a10(9);
        a10Var.f31636n = str;
        if (a10Var.f31634c != null) {
            a10Var.f31634c = null;
            a10Var.a();
        }
        a10Var.f31635f = i10;
        spannableStringBuilder.setSpan(a10Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        yh.g0 g0Var = profileActivity.f31356v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        float f10 = profileActivity.U1;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        final float f11 = profileActivity.Q1;
        profileActivity.f31216b.setTranslationY(f11);
        profileActivity.f31216b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f31209a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f31246f[1].setVisibility(0);
        i5VarArr[1].setVisibility(0);
        i5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.v(z11);
        int i11 = 8;
        if (profileActivity.U1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.v0 v0Var = profileActivity.T0;
        if (v0Var != null) {
            v0Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.U1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f31216b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new vz0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.f27701f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        b2Var.f18459g0 = false;
        b2Var.show();
        Utilities.globalQueue.postRunnable(new vl0(b2Var, z10, activity, 6));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
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
    }

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.i5 i5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            nf.f.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        rg.k1 k1Var = new rg.k1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f31383z0);
        i5Var.getLocationOnScreen(new int[2]);
        k1Var.f42315v0 = i5Var.f19220h0;
        k1Var.f42316w0 = i5Var.f19221i0;
        k1Var.f42319z0 = i5Var.getScaleX();
        k1Var.f42317x0 = i5Var.getLeft();
        k1Var.f42318y0 = i5Var.getTop();
        k1Var.A0 = i5Var;
        Drawable rightDrawable = i5Var.getRightDrawable();
        org.telegram.ui.Components.o5 o5Var = o5VarArr[1];
        if (rightDrawable == o5Var && o5Var != null) {
            Drawable drawable = o5Var.f26595f[0];
            if (drawable instanceof org.telegram.ui.Components.q5) {
                k1Var.f42319z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.q5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f18953m6, 0.2f);
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
                    if (((org.telegram.ui.Components.q5) o5VarArr[1].f26595f[0]).c()) {
                        w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19118v6, profileActivity.f31383z0), PorterDuff.Mode.SRC_IN));
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        k1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    k1Var.B0 = w9Var;
                    k1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(k1Var);
    }

    public static void V(ProfileActivity profileActivity) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
        yy0 yy0Var = profileActivity.f31209a;
        if (yy0Var != null) {
            int childCount = yy0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f31209a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.bb) {
                    ((org.telegram.ui.Cells.bb) childAt).j(0);
                }
            }
            profileActivity.f31209a.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, profileActivity.f31383z0));
        }
        if (!profileActivity.f31316p2) {
            org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[1];
            if (i5Var != null) {
                Object tag = i5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        i5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.h6.v0(((Integer) tag).intValue(), profileActivity.f31383z0), Boolean.valueOf(profileActivity.J0[0])));
                    } else {
                        i5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B8, profileActivity.f31383z0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f31370x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.Q5 != null) {
                    v03 = -1;
                } else {
                    v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19013pc, profileActivity.f31383z0);
                }
                drawable.setColorFilter(v03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.yl0 yl0Var = profileActivity.L;
            if (yl0Var != null) {
                yl0Var.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18862h8, profileActivity.f31383z0));
            }
            org.telegram.ui.ActionBar.i5 i5Var2 = profileActivity.f31246f[1];
            if (i5Var2 != null) {
                i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19128vh, profileActivity.f31383z0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                if (profileActivity.Q5 == null) {
                    i12 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, profileActivity.f31383z0);
                }
                kVar.B(i12, false);
                org.telegram.ui.ActionBar.k kVar2 = profileActivity.actionBar;
                if (profileActivity.Q5 != null) {
                    v02 = 553648127;
                } else {
                    v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18826f8, profileActivity.f31383z0);
                }
                kVar2.A(v02, false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z10;
        float f7;
        float min = Math.min(profileActivity.f31227c2, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f31321q1) {
            profileActivity.f31342t0.setAlpha(1.0f - min);
            profileActivity.f31342t0.setBlurIntensity(0.0f);
            profileActivity.f31342t0.setGooeyEnabled(false);
        } else {
            profileActivity.f31342t0.setPullProgress(profileActivity.f31227c2);
            profileActivity.f31342t0.setBlurIntensity(Math.min((w7.p.a(profileActivity.f31227c2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.th0 th0Var = profileActivity.f31342t0;
            float f10 = profileActivity.f31227c2;
            if (f10 > 0.0f && f10 < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            th0Var.setGooeyEnabled(z10);
        }
        kz0 kz0Var = profileActivity.f31349u0;
        if (kz0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.f31227c2;
            if (f11 > 0.0f) {
                f7 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f));
            } else {
                f7 = 1.0f;
            }
            kz0Var.setAlpha(f7);
        }
        org.telegram.ui.Components.th0 th0Var2 = profileActivity.f31342t0;
        if (profileActivity.f31227c2 >= 1.0f) {
            i10 = 8;
        }
        th0Var2.setVisibility(i10);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f27306j = 5000;
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
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f18409a);
                return;
            }
            return;
        }
        org.telegram.messenger.z0.o(R.string.UnknownError, org.telegram.ui.Components.xc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f31321q1;
                if (z10) {
                    if (z10) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f31240e1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f31248f1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f31248f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f31248f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new xn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f31248f1);
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
                profileActivity.r4(profileActivity.f31210a0, f7, f10, true);
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
                u31.L(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(profileActivity.getParentActivity(), 3, profileActivity.f31383z0);
                b2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new dt(13, profileActivity, b2Var), true, profileActivity.f31383z0);
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
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(profileActivity, profileActivity.f31210a0);
                    H.f26672w = false;
                    H.f26651i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new tb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new jl0(currentUser, 27), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new tb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.f31210a0.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new x81(null));
                return;
            default:
                return;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + profileActivity.f31269i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.h80.f24563r;
        org.telegram.ui.Components.h80.w(parentActivity, profileActivity, org.telegram.ui.Components.xc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.j5();
            s01 s01Var = profileActivity.d;
            if (s01Var != null) {
                s01Var.l();
            }
        }
        if (n2Var instanceof xn) {
            ((xn) n2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.J2 == null) {
            if (profileActivity.f31321q1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f31248f1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f18135id == profileActivity.f31255g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (f7 = org.telegram.ui.Components.q5.f(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.xc.a0(profileActivity).h(f7, 1, new ly0(profileActivity, 1))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.K3()) {
                profileActivity.w4(false);
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j3, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        s01 s01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f31209a.B0();
        if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1));
            TLRPC.UserFull userFull = profileActivity.f31358v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                yh.o.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f31240e1, new hu(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new ei.l(profileActivity.f31240e1));
            }
        } else if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j3, profileActivity.f31255g1);
            profileActivity.getNotificationsController().muteDialog(j3, profileActivity.f31255g1, z10);
            org.telegram.ui.Components.xc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.Q3;
            if (i11 < 0 || (s01Var = profileActivity.d) == null) {
                return;
            }
            s01Var.m(i11);
        } else if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f18230id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f31237d5);
            bundle.putString("first_name_card", profileActivity.f31244e5);
            bundle.putString("last_name_card", profileActivity.f31252f5);
            ns nsVar = new ns(bundle, profileActivity.f31383z0);
            nsVar.O = new ey0(profileActivity, user3);
            profileActivity.presentFragment(nsVar);
        } else if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.e5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new ly0(profileActivity, 3), profileActivity.f31383z0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
        } else if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31383z0);
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.f31214a5));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.f31383z0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], w7.x5.n(-1, -2));
                z1VarArr[0].setOnClickListener(new t20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new kv0(5, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rs(17));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
        } else if (i10 == profileActivity.f31331r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f31269i1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.n2(bundle2));
        } else if (i10 == profileActivity.f31324q4) {
            profileActivity.showDialog(org.telegram.ui.Components.e5.V(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.f31383z0).f18409a);
        } else if (i10 == profileActivity.N3) {
            profileActivity.r4(view, f7, f10, false);
        } else if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f31240e1);
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.f31213a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.U3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.V3) {
            u31.L(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f31353u4 && i10 < profileActivity.f31360v4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = profileActivity.f31351u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.f31353u4)).intValue());
            } else {
                chatParticipant = profileActivity.f31351u2.participants.participants.get(i10 - profileActivity.f31353u4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f31368w4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.L3) {
            profileActivity.C4(f7, f10, i10, view);
        } else if (i10 == profileActivity.l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new fi.k0(profileActivity, profileActivity.E2.linked_community_id, null, null));
            } else if (profileActivity.f31240e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1))) == null) {
            } else {
                profileActivity.showDialog(new fi.k0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.I3) {
            if (profileActivity.f31351u2.location instanceof TLRPC.TL_channelLocation) {
                dd0 dd0Var = new dd0(5);
                dd0Var.f32587e0 = -profileActivity.f31248f1;
                dd0Var.f32614z0 = (TLRPC.TL_channelLocation) profileActivity.f31351u2.location;
                profileActivity.presentFragment(dd0Var);
            }
        } else if (i10 == profileActivity.L4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f31375x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f31248f1);
            bundle3.putInt("type", 2);
            qr qrVar = new qr(bundle3);
            qrVar.x0(profileActivity.f31351u2);
            profileActivity.presentFragment(qrVar);
        } else if (i10 == profileActivity.f31381y4) {
            profileActivity.presentFragment(new uh0(profileActivity.f31248f1));
        } else if (i10 == profileActivity.f31387z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f31248f1);
            bundle4.putInt("type", 1);
            qr qrVar2 = new qr(bundle4);
            qrVar2.x0(profileActivity.f31351u2);
            profileActivity.presentFragment(qrVar2);
        } else if (i10 == profileActivity.A4) {
            profileActivity.S0.performClick();
        } else if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new yh.g(0, profileActivity.f31240e1));
        } else if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new yh.g(1, profileActivity.f31240e1));
        } else if (i10 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f31248f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new ra1(bundle5));
        } else if (i10 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f31248f1);
            bundle6.putInt("type", 0);
            qr qrVar3 = new qr(bundle6);
            qrVar3.x0(profileActivity.f31351u2);
            profileActivity.presentFragment(qrVar3);
        } else if (i10 == profileActivity.f31250f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f31264h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f31271i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f31284k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f31295m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f31290l3) {
            profileActivity.presentFragment(new ic0());
        } else if (i10 == profileActivity.f31303n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f31323q3) {
            profileActivity.showDialog(org.telegram.ui.Components.e5.U(profileActivity, profileActivity.f31383z0));
        } else if (i10 == profileActivity.f31330r3) {
            nf.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f31338s3) {
            nf.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f31359v3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f31367w3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f31374x3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31383z0);
            alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new dy0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f18409a);
        } else if (i10 == profileActivity.f31257g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new qa(null));
        } else if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new h(3));
        } else if (i10 == profileActivity.O2) {
            profileActivity.u4();
        } else if (i10 == profileActivity.f31229c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f31236d4) {
            profileActivity.presentFragment(new yh.w7());
        } else if (i10 == profileActivity.f31243e4) {
            profileActivity.presentFragment(new di.i());
        } else if (i10 == profileActivity.f31251f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f31258g4) {
            tg.n1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            ei.w0 w0Var = profileActivity.f31337s2;
            if (w0Var != null) {
                w0Var.m(!w0Var.g(), new by0(5, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            ei.r rVar = profileActivity.f31344t2;
            if (rVar != null) {
                rVar.f8564f = true;
                rVar.e = !rVar.e;
                rVar.k();
                ((org.telegram.ui.Cells.s8) view).setChecked(profileActivity.f31344t2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setChecked(!s8Var.b());
            if (profileActivity.f31311o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f31311o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f31240e1);
            boolean b10 = s8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f31358v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new wb0(15, profileActivity, r0));
            profileActivity.f31311o4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.O3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i12 = profileActivity.U5;
            if (i12 >= 0) {
                profileActivity.f31224c.h1(i12, profileActivity.V5 - profileActivity.f31209a.getPaddingTop());
            }
        } else if (i10 == profileActivity.P3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.Q2) {
            if (profileActivity.f31358v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f31358v2.personal_channel_id);
            profileActivity.presentFragment(new xn(bundle7));
        } else if (i10 == profileActivity.U2) {
            j11 j11Var = profileActivity.f31231c6;
            if ((j11Var == null || !j11Var.a()) && !profileActivity.J3(i10, view)) {
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (d9Var.d.getDrawable() != null) {
                    profileActivity.t4(d9Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.H3) {
            profileActivity.I3(i10, view);
        } else {
            profileActivity.C4(f7, f10, i10, view);
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f31240e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.f31214a5);
        tL_messages_reportReaction.f18189id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ai.u7(8));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.f31214a5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.xc.a0(profileActivity).E(profileActivity.f31383z0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f31239e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f31314p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.j5();
                s01 s01Var = profileActivity.d;
                if (s01Var != null) {
                    s01Var.l();
                }
                profileActivity.k4(true);
            }
            iz0 iz0Var = profileActivity.f31300n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            iz0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
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
            profileActivity.S5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new wb0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f31240e1;
        if (j3 == 0) {
            long j10 = profileActivity.f31248f1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f31269i1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.f31214a5, j11);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.f31214a5, j11, profileActivity.Z4);
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.f31383z0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f30192b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.xc.a0(profileActivity).b(ybVar, 1500).j();
    }

    public static void f0(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f31217b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.f31217b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f31217b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f31358v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.f31217b0.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.f31217b0 && MediaController.getInstance().isPlayingMessage(profileActivity.f31217b0.list.get(0))) {
                z10 = true;
            } else {
                MediaController.getInstance().cleanup();
                z10 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.f31217b0;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.f31217b0.list);
            if (!z10) {
                MediaController.getInstance().playMessage(profileActivity.f31217b0.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.j8(profileActivity.getParentActivity(), profileActivity.f31383z0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.yb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new tb0(profileActivity, 18), profileActivity.f31383z0);
    }

    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        int i10;
        int v02;
        boolean z11;
        long j3;
        int i11;
        char c10;
        final t3 t3Var;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f31358v2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            runnable = f3Var.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f31383z0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout.addView(limitPreviewView, w7.x5.t(-1, -2, 17, 0, 20, 0, 10));
            int i12 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, w7.x5.t(-1, -2, 17, 40, -12, 40, 20));
                TextView[] textViewArr = new org.telegram.ui.Components.d90[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, 3, null);
                    textViewArr[i13] = xbVar;
                    xbVar.setGravity(i12);
                    textViewArr[i13].setTextSize(1, 12.0f);
                    textViewArr[i13].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false));
                    textViewArr[i13].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
                    frameLayout.addView(textViewArr[i13], w7.x5.e(-1, -1, 119));
                    TextView textView = textViewArr[i13];
                    if (i13 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    textView.setAlpha(f7);
                    TextView textView2 = textViewArr[i13];
                    if (i13 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    textView2.setScaleX(f10);
                    TextView textView3 = textViewArr[i13];
                    if (i13 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView3.setScaleY(f11);
                    i13++;
                    i12 = 17;
                }
                t3 t3Var2 = new t3(textViewArr, 20);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                if (tl_starsRating != null) {
                    j3 = tl_starsRating.stars - j10;
                } else {
                    j3 = 0;
                }
                long j11 = (-j10) - j3;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j12 = userFull.stars_my_pending_rating.stars;
                long j13 = userFull.stars_rating.stars;
                long j14 = j12 - j13;
                if ((j13 < 0 && !z11) || (z11 && j11 > 0)) {
                    boolean z12 = z11;
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                    if (z12) {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                    } else {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                    }
                    t3Var = t3Var2;
                    i11 = max;
                    c10 = 0;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    i11 = max;
                    c10 = 0;
                    spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", i11), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14)));
                    spannableStringBuilder.append((CharSequence) " ");
                    t3Var = t3Var2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    t3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    t3Var.run(Boolean.FALSE);
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
                                    t3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    t3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", i11);
                String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j14);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[c10] = formatPluralStringComma;
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
                                t3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                t3Var.run(Boolean.FALSE);
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
                                t3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                t3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            textView4.setText(LocaleController.getString(R.string.StarRatingTitle));
            textView4.setTextSize(1, 20.0f);
            int i15 = org.telegram.ui.ActionBar.h6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, profileActivity.f31383z0));
            linearLayout.addView(textView4, w7.x5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f18231id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.z0.m(R.string.StarRatingSelfDescription, textView5);
                i10 = 1;
            } else {
                i10 = 1;
                org.telegram.messenger.ul.q(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i10, 14.0f);
            textView5.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, profileActivity.f31383z0));
            linearLayout.addView(textView5, w7.x5.t(-1, -2, 17, 20, 0, 20, 12));
            nw0 nw0Var = new nw0(parentActivity, profileActivity.f31383z0);
            nw0Var.f35615a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i16 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i17 = org.telegram.ui.ActionBar.h6.Oh;
            nw0Var.f35616b.setText(LocaleController.formatSpannable(i16, G3(org.telegram.ui.ActionBar.h6.v0(i17, profileActivity.f31383z0), string)));
            nw0Var.d.setVisibility(8);
            int i18 = R.drawable.menu_gift;
            ImageView imageView = nw0Var.f35617c;
            imageView.setImageResource(i18);
            imageView.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, profileActivity.f31383z0));
            linearLayout.addView(nw0Var, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            nw0 nw0Var2 = new nw0(parentActivity, profileActivity.f31383z0);
            nw0Var2.f35615a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            nw0Var2.f35616b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.h6.v0(i17, profileActivity.f31383z0), LocaleController.getString(R.string.StarRatingAdded))));
            nw0Var2.d.setVisibility(8);
            int i19 = R.drawable.menu_stars_gift;
            ImageView imageView2 = nw0Var2.f35617c;
            imageView2.setImageResource(i19);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, profileActivity.f31383z0));
            linearLayout.addView(nw0Var2, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            nw0 nw0Var3 = new nw0(parentActivity, profileActivity.f31383z0);
            nw0Var3.f35615a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i20 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.h6.I.q()) {
                v02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18953m6, profileActivity.f31383z0), -16777216);
            } else {
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19170y6, profileActivity.f31383z0);
            }
            nw0Var3.f35616b.setText(LocaleController.formatSpannable(i20, G3(v02, string2)));
            nw0Var3.d.setVisibility(8);
            int i21 = R.drawable.menu_refund;
            ImageView imageView3 = nw0Var3.f35617c;
            imageView3.setImageResource(i21);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, profileActivity.f31383z0));
            linearLayout.addView(nw0Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ci.d dVar = new ci.d(parentActivity, profileActivity.f31383z0, true);
            dVar.setOnClickListener(new uy0(0, runnable));
            dVar.g(yh.y3.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, w7.x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            f3Var.customView = linearLayout;
            f3Var.show();
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
            if (!profileActivity.f31302n2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f31209a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f31209a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    s01 s01Var = profileActivity.d;
                    if (i12 >= s01Var.e.N2) {
                        break;
                    }
                    s4.c1 g10 = s01Var.g(null, s01Var.j(i12));
                    View view = g10.f42627a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                yy0 yy0Var = profileActivity.f31209a;
                yy0Var.setPadding(0, yy0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f31209a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f31277j2.cancel();
                float[] fArr = profileActivity.f31294m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.Q1 = profileActivity.T3();
            }
        }
        profileActivity.M.m(profileActivity.f31269i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ei.e4.G0(context, profileActivity.currentAccount, profileActivity.f31358v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f31383z0, false);
        } else {
            ei.e4.H0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.f31383z0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
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
        profileActivity.f31216b.setTranslationY(floatValue * f7);
        profileActivity.P.setTranslationY(f7 * profileActivity.U1);
        profileActivity.f31209a.setTranslationY((1.0f - profileActivity.U1) * f12);
        profileActivity.f31209a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f31209a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f31209a.setAlpha(profileActivity.U1);
        boolean z11 = true;
        profileActivity.k4(true);
        profileActivity.f31209a.setAlpha(f10);
        profileActivity.f31216b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.f31216b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.f31216b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.f31239e0.setAlpha(f10);
        kz0 kz0Var = profileActivity.f31349u0;
        if (kz0Var != null) {
            kz0Var.setAlpha(f10);
        }
        profileActivity.f31246f[1].setAlpha(f10);
        i5VarArr[1].setAlpha(f10);
        i5VarArr[3].setAlpha(f10);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
            if (v0Var.F.getWidth() != 0 && !v0Var.e.isFocused()) {
                v0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(v0Var.e);
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
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.T0;
        if (v0Var2 != null) {
            v0Var2.setVisibility(i11);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i11);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 >= 0.5f) {
            z11 = false;
        }
        kVar.v(z11);
        org.telegram.ui.ActionBar.v0 v0Var3 = profileActivity.T0;
        if (v0Var3 != null) {
            v0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.f31233d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.a01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f31383z0);
    }

    public static ProfileActivity m4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f18107id;
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
                String o9 = a4.a.o(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f18230id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f31240e1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f31302n2 && profileActivity.f31239e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f31309o2 = z10;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        iz0 iz0Var = profileActivity.f31300n0;
        iz0Var.H0 = true;
        iz0Var.K0 = profileActivity.K2;
        iz0Var.f27046q1 = null;
        iz0Var.f27047r1 = null;
        iz0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31246f;
        org.telegram.ui.ActionBar.i5[] i5VarArr2 = profileActivity.f31326r;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f31209a.setVisibility(i10);
        org.telegram.ui.Components.ml0 ml0Var = profileActivity.f31216b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ml0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        yh.g0 g0Var = profileActivity.f31356v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.Y.setVisibility(i10);
        kz0 kz0Var = profileActivity.f31349u0;
        if (kz0Var != null) {
            kz0Var.setVisibility(i10);
        }
        i5VarArr[1].setVisibility(i10);
        i5VarArr2[1].setVisibility(i10);
        i5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.v0 v0Var = profileActivity.T0;
        if (v0Var != null) {
            v0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.f31239e0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        kz0 kz0Var2 = profileActivity.f31349u0;
        if (kz0Var2 != null) {
            kz0Var2.setAlpha(1.0f);
        }
        yh.g0 g0Var2 = profileActivity.f31356v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        i5VarArr[1].setAlpha(1.0f);
        i5VarArr2[1].setAlpha(1.0f);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f31209a.setAlpha(1.0f);
        profileActivity.f31216b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f31216b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f31239e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.p61) {
            profileActivity.f31239e0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.d6) {
            org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) drawable;
            profileActivity.f31239e0.u(null, null, d6Var);
            if (z10) {
                d6Var.f(profileActivity.f31239e0);
            }
        } else {
            ImageLocation D = profileActivity.f31300n0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f31239e0.u(D, str, drawable);
        }
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final void A3() {
        s4.c1 c1Var;
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
        if (this.f31209a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f31209a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f31209a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    c1Var = null;
                    if (i11 < this.f31209a.getChildCount()) {
                        if (RecyclerView.R(this.f31209a.getChildAt(i11)) == 0) {
                            view = this.f31209a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    yy0 yy0Var = this.f31209a;
                    View F = yy0Var.F(view);
                    if (F != null) {
                        c1Var = yy0Var.T(F);
                    }
                    c1Var = (org.telegram.ui.Components.wk0) c1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (c1Var != null) {
                    i10 = c1Var.b();
                } else {
                    i10 = -1;
                }
                top = (top < 0 || i10 != 0) ? 0 : 0;
                if (this.f31320q0 == null && this.actionBar.f19296n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) this.f31209a.K(i12);
                    if (wk0Var != null && wk0Var.f42627a.getTop() <= 0) {
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
                    org.telegram.ui.ActionBar.v0 searchItem = this.O.getSearchItem();
                    org.telegram.ui.Components.bj0 searchOptionsItem = this.O.getSearchOptionsItem();
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
                        e01 e01Var = this.O;
                        if (e01Var.s0(e01Var.f30426k0[0].F)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        e01 e01Var2 = this.O;
                        int i13 = e01Var2.f30426k0[0].F;
                        if (i13 != 0 && !org.telegram.ui.Components.yu0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || e01Var2.V == null)) {
                            this.O.f30440r0.setVisibility(4);
                            this.O.A(false, false);
                        } else {
                            this.O.f30440r0.setVisibility(0);
                            this.O.A(true, false);
                        }
                    }
                    l5(false);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null) {
                        kVar.n().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.v0 v0Var = this.Q0;
                    Property property = View.ALPHA;
                    float f22 = 1.0f;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var, property, f7));
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.R0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var2, property, f10));
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.T0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var3, property, f11));
                    org.telegram.ui.ActionBar.v0 v0Var4 = this.S0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var4, property, f12));
                    org.telegram.ui.ActionBar.v0 v0Var5 = this.Q0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var5, property2, f13));
                    org.telegram.ui.ActionBar.v0 v0Var6 = this.R0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var6, property2, f14));
                    org.telegram.ui.ActionBar.v0 v0Var7 = this.T0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var7, property2, f15));
                    org.telegram.ui.ActionBar.v0 v0Var8 = this.S0;
                    if (z10) {
                        f16 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(v0Var8, property2, f16));
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
                    ImageView imageView = this.O.f30440r0;
                    if (z10) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f18));
                    ImageView imageView2 = this.O.f30440r0;
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
                    org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31326r;
                    org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[1];
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(i5Var, property, f20));
                    this.O.I0.setOpen(z10);
                    if (this.f31336s1) {
                        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[3];
                        if (z10) {
                            f21 = 0.0f;
                        } else {
                            f21 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(i5Var2, property, f21));
                    }
                    org.telegram.ui.Components.do0 do0Var = this.f31334s;
                    if (!z10) {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(do0Var, property, f22));
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f31279j5, 0.0f));
                    }
                    if (this.f31349u0 != null || this.f31356v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new iy0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.C5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.C5.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    this.C5.addListener(new org.telegram.ui.Components.qk0(11, this, searchItem));
                    this.C5.setDuration(150L);
                    this.C5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f23 = top;
                if (this.Q1 != f23 && !this.H1) {
                    this.Q1 = f23;
                    this.f31233d1.invalidate();
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
        pz0 pz0Var = new pz0(this, user.f18230id, this.f31248f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        pz0Var.X0 = new qz0(this, i10, chatParticipant, z10, zArr);
        presentFragment(pz0Var);
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Cells.z3 z3Var = this.f31254g0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f7);
        this.f31300n0.O(this.K2, f7);
    }

    public final void B3() {
        float alpha;
        int i10 = this.J1;
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31326r;
        if (i10 == 1 && (!this.f31291l5 || this.G1)) {
            this.Y5 = 0.0f;
        } else if (i10 == 2 && (!this.f31291l5 || this.G1)) {
            org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[1];
            if (i5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = i5Var.getAlpha();
            }
            this.Y5 = alpha;
        } else if (this.f31240e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.Y5 = (1.0f - this.f31305n5) * this.f31283k2;
        } else {
            this.Y5 = this.f31283k2 * this.f31305n5;
        }
        if (this.f31240e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.p5) {
                this.f31312o5 = AndroidUtilities.dp(28.0f) * this.Y5;
                org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[2];
                if (i5Var2 != null) {
                    i5Var2.setAlpha(this.f31283k2);
                    i5VarArr[3].setAlpha(1.0f - this.f31283k2);
                    i5VarArr[1].setTranslationX(W3(this.Z5));
                    this.Z.invalidate();
                    d11 d11Var = this.f31223b6;
                    if (d11Var != null) {
                        d11Var.e = 1.0f - this.f31283k2;
                        d11Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.i5 i5Var3 = i5VarArr[2];
            if (i5Var3 != null) {
                i5Var3.setAlpha(0.0f);
                i5VarArr[3].setAlpha(0.0f);
            }
            d11 d11Var2 = this.f31223b6;
            if (d11Var2 != null) {
                d11Var2.e = 1.0f;
                d11Var2.invalidateSelf();
            }
        } else if (this.f31325q5) {
            org.telegram.ui.ActionBar.i5 i5Var4 = i5VarArr[2];
            if (i5Var4 != null) {
                i5Var4.setAlpha(this.Y5);
            }
            d11 d11Var3 = this.f31223b6;
            if (d11Var3 != null) {
                d11Var3.e = 1.0f - this.Y5;
                d11Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.i5 i5Var5 = i5VarArr[2];
            if (i5Var5 != null) {
                i5Var5.setAlpha(0.0f);
            }
            d11 d11Var4 = this.f31223b6;
            if (d11Var4 != null) {
                d11Var4.e = 1.0f;
                d11Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (n2Var instanceof xn) {
                    finishFragment();
                    ((xn) n2Var).Y.b1(null, str, false, false);
                }
            }
        } else {
            ry ryVar = new ry(null);
            ryVar.f37023n2 = str;
            presentFragment(ryVar);
        }
    }

    public final void C3() {
        boolean z10;
        org.telegram.ui.Components.iw0 iw0Var = this.T;
        if (iw0Var != null) {
            if (!this.F5 && this.H5) {
                z10 = true;
            } else {
                z10 = false;
            }
            iw0Var.setVisibility(z10);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    public final void D3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f31316p2 && (valueAnimator = this.f31277j2) != null && valueAnimator.isRunning()) {
            this.f31241e2 = this.K5;
            this.f31256g2 = this.L5;
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
        this.f31211a1 = new org.telegram.ui.Components.o8(context, this.T0.getPopupLayout().getSwipeBack(), new xy0(this), false, 0, this.f31383z0);
        if (this.f31269i1 > 0 || this.f31240e1 > 0) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18973n6, this.f31383z0);
            org.telegram.ui.Components.o8 o8Var = this.f31211a1;
            org.telegram.ui.Components.d90 d90Var = o8Var.e;
            if (d90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.og(o8Var, 10)));
                d90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f31358v2;
        if (userFull == null && this.f31351u2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f31351u2.ttl_period;
        }
        org.telegram.ui.Components.u11 a2 = org.telegram.ui.Components.u11.a(i10);
        this.f31335s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.f31211a1.f26678a);
        this.T0.a(-1);
        T4();
    }

    public final void E4(float f7, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - T3()) / ((this.f31209a.getMeasuredWidth() - f10) - U3())));
        if (this.Q1 < T3() && max < 0.33f) {
            lerp = com.google.android.gms.internal.vision.e2.y(f7, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = (1.0f + f7) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (AndroidUtilities.density * 21.0f))));
        this.f31241e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f31256g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView != null && this.X5 && this.f31380y2 != null && getParentActivity() != null) {
            j11 j11Var = this.f31231c6;
            if (j11Var != null) {
                j11Var.b(this.f31380y2);
                this.f31231c6.invalidate();
                return;
            }
            j11 j11Var2 = new j11(this, this.f31380y2);
            this.f31231c6 = j11Var2;
            ((FrameLayout) this.fragmentView).addView(j11Var2, w7.x5.e(-1, -1, 55));
        }
    }

    public final void F4() {
        yy0 yy0Var = this.f31209a;
        if (yy0Var != null && this.f31224c != null && yy0Var.getChildCount() > 0 && !this.W5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f31209a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f31209a.getChildAt(i12));
                View childAt = this.f31209a.getChildAt(i12);
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
                if (this.U5 == 0 && !this.f31309o2 && top > T3()) {
                    this.V5 = T3();
                }
                this.f31224c.h1(i11, view.getTop() - this.f31209a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (z10) {
                ji.o oVar = new ji.o(getParentActivity(), 2, 0.6f);
                oVar.f42777a = this.J4;
                oVar.f13094p = -this.f31209a.getPaddingTop();
                this.f31224c.w0(oVar);
                return;
            }
            this.f31224c.h1(i10, -this.f31209a.getPaddingTop());
        }
    }

    public final void H3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j3;
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
            ofFloat = ValueAnimator.ofFloat(this.f31371x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new iy0(this, 1));
        this.T5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.T5;
        if (z10) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z10) {
            this.T5.addListener(new uz0(this, 4));
        }
        this.T5.start();
    }

    public final void I3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
        H.W(this.f31209a.V0(view, false));
        H.f26672w = false;
        if (this.f31358v2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new tb0(this, 25), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new tb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.kd(this, i10, 23), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
        if (eh0Var != null) {
            if (this.f31336s1) {
                eh0Var.H = 6;
            } else if (this.f31321q1) {
                eh0Var.H = 5;
            } else if (this.f31329r2) {
                eh0Var.H = 2;
            } else if (this.f31240e1 != 0) {
                eh0Var.H = 0;
            } else if (this.f31248f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f31248f1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.f31210a0.H = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.f31210a0.H = 4;
                        return;
                    } else {
                        this.f31210a0.H = 1;
                        return;
                    }
                }
                this.f31210a0.H = 3;
            }
        }
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f31336s1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f31358v2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f18230id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.O3) {
                        str = hg.h1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
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
                        str = UserInfoActivity.Z(this.f31358v2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
                H.W(this.f31209a.V0(view, false));
                H.f26672w = false;
                H.f26651i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new tb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new tb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new jl0(str, 25), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new tb0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f33948b;

                        {
                            this.f33948b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f33948b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new my0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new my0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f18409a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f33948b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new my0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new my0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f18409a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new tb0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f33948b;

                        {
                            this.f33948b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f33948b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new my0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new my0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f18409a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f33948b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new my0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new my0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f18409a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new tb0(this, 10), false);
                } else if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.G3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new tb0(this, 12), false);
                    } else if (i10 == this.U2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f33679b;

                            {
                                this.f33679b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f33679b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new dt(12, profileActivity, userFull2), new tb0(profileActivity, 13), false, false, profileActivity.f31383z0).f18414a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity3, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f18409a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f18409a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f33679b;

                            {
                                this.f33679b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f33679b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new dt(12, profileActivity, userFull2), new tb0(profileActivity, 13), false, false, profileActivity.f31383z0).f18414a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f18409a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f18409a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.Q2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new by0(1, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new tb0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f33679b;

                            {
                                this.f33679b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f33679b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new dt(12, profileActivity, userFull2), new tb0(profileActivity, 13), false, false, profileActivity.f31383z0).f18414a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f18409a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f33679b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new my0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new my0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f18409a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new tb0(this, 11), false);
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
    public final boolean K(ry ryVar) {
        return false;
    }

    public final boolean K3() {
        s4.c1 c1Var;
        View view;
        if ((this.I0 || (!AndroidUtilities.isTablet() && !this.f31302n2)) && this.f31239e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.F0 = true;
            this.f31309o2 = true;
            int i10 = 0;
            while (true) {
                c1Var = null;
                if (i10 < this.f31209a.getChildCount()) {
                    if (RecyclerView.R(this.f31209a.getChildAt(i10)) == 0) {
                        view = this.f31209a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                yy0 yy0Var = this.f31209a;
                View F = yy0Var.F(view);
                if (F != null) {
                    c1Var = yy0Var.T(F);
                }
                if (c1Var != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(c1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f31209a.v0(0, -(((this.f31209a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.rr.h);
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
        this.f31351u2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f31293m1 == 0) {
                this.f31293m1 = -j3;
                getMediaDataController().getMediaCounts(this.f31293m1, this.f31255g1, this.classGuid);
            }
        }
        e01 e01Var = this.O;
        if (e01Var != null) {
            e01Var.setChatInfo(this.f31351u2);
        }
        iz0 iz0Var = this.f31300n0;
        if (iz0Var != null && !this.f31321q1) {
            iz0Var.setChatInfo(this.f31351u2);
        }
        kz0 kz0Var = this.f31349u0;
        if (kz0Var != null && (chatFull3 = this.f31351u2) != null) {
            kz0Var.setStories(chatFull3.stories);
        }
        yh.g0 g0Var = this.f31356v0;
        if (g0Var != null) {
            g0Var.a();
        }
        hz0 hz0Var = this.f31239e0;
        if (hz0Var != null) {
            hz0Var.setHasStories(j4());
        }
        L3();
        if (this.f31248f1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f31351u2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.I(38, z10);
            org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
            if (eh0Var != null) {
                eh0Var.o(3, z10);
            }
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.f31254g0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    public final void L3() {
        TLRPC.Chat chat = this.E2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f31351u2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f31351u2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f31351u2.participants.participants.get(i10);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.f31260g6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f31260g6 = tL_emojiStatusCollectible;
                ci.e4 e4Var = this.f31238d6;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f31253f6 = null;
                    this.f31238d6 = new ci.e4(getParentActivity(), 3);
                    this.f31245e6 = org.telegram.ui.ActionBar.h6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.h6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f31238d6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    ci.e4 e4Var2 = this.f31238d6;
                    int l1 = org.telegram.ui.ActionBar.h6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    e4Var2.A0 = true;
                    e4Var2.I0 = System.currentTimeMillis();
                    e4Var2.B0 = new Path();
                    e4Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    e4Var2.D0 = new Paint(1);
                    e4Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.h6.l1(0.0f, l1), org.telegram.ui.ActionBar.h6.l1(1.0f, l1), org.telegram.ui.ActionBar.h6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    e4Var2.H0 = linearGradient;
                    e4Var2.E0.setShader(linearGradient);
                    e4Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.h6.l1(0.0f, l1), org.telegram.ui.ActionBar.h6.l1(0.5f, l1), org.telegram.ui.ActionBar.h6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    e4Var2.G0 = new Matrix();
                    e4Var2.D0.setShader(e4Var2.F0);
                    e4Var2.E0.setStyle(Paint.Style.STROKE);
                    e4Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    e4Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    e4Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.Z.addView(this.f31238d6, w7.x5.c(24.0f, -1));
                    this.f31238d6.t(9.33f);
                    ci.e4 e4Var3 = this.f31238d6;
                    Typeface bold = AndroidUtilities.bold();
                    e4Var3.H.u(bold);
                    e4Var3.J.setTypeface(bold);
                    this.f31238d6.s(tL_emojiStatusCollectible.title);
                    ci.e4 e4Var4 = this.f31238d6;
                    e4Var4.d = -1L;
                    e4Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    ci.e4 e4Var5 = this.f31238d6;
                    e4Var5.getClass();
                    e4Var5.f4632y = AndroidUtilities.dpf2(4.0f);
                    e4Var5.E = AndroidUtilities.dpf2(2.66f);
                    this.f31238d6.r();
                    this.f31238d6.q(16.0f);
                    this.f31238d6.u();
                    this.f31238d6.setOnClickListener(new ry0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                        this.f31253f6 = Boolean.FALSE;
                        this.f31238d6.setAlpha(0.0f);
                    }
                    V4();
                    ci.e4 e4Var6 = this.f31238d6;
                    Objects.requireNonNull(e4Var6);
                    AndroidUtilities.runOnUIThread(new jl0(e4Var6, 26), 6000L);
                }
            }
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.qu0 qu0Var;
        e01 e01Var = this.O;
        if (e01Var != null && (qu0Var = this.R) != null) {
            e01Var.setNewMediaCounts(qu0Var.f27455c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f31358v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.c5 c5Var;
        if (this.J1 != 0 && (c5Var = this.parentLayout) != null && c5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof xn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(l01 l01Var) {
        if (this.f31273i5 == l01Var) {
            return;
        }
        this.f31273i5 = l01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f31209a, (Utilities.Callback<View>) new ly0(this, 0));
    }

    public final void N3() {
        if (this.f31209a == null) {
            return;
        }
        float measuredWidth = (this.f31209a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width * this.f31219b2) * 0.5f);
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
                this.f31301n1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f31240e1 != 0 && this.f31320q0 != null && !this.f31336s1) {
            return 0;
        }
        if (this.I4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.g6 g6Var, g11 g11Var) {
        boolean z10;
        this.f31358v2 = userFull;
        org.telegram.ui.Components.iw0 iw0Var = this.T;
        if (iw0Var != null) {
            iw0Var.set(userFull.stars_rating);
        }
        kz0 kz0Var = this.f31349u0;
        if (kz0Var != null) {
            kz0Var.setStories(this.f31358v2.stories);
        }
        yh.g0 g0Var = this.f31356v0;
        if (g0Var != null) {
            g0Var.a();
        }
        hz0 hz0Var = this.f31239e0;
        if (hz0Var != null) {
            hz0Var.setHasStories(j4());
        }
        e01 e01Var = this.O;
        if (e01Var != null) {
            e01Var.setUserInfo(this.f31358v2);
        }
        if (this.f31366w2 == null) {
            this.f31366w2 = g6Var;
        }
        if (this.f31366w2 == null) {
            this.f31366w2 = new org.telegram.ui.Cells.g6(this.currentAccount);
        }
        org.telegram.ui.Cells.g6 g6Var2 = this.f31366w2;
        tb0 tb0Var = new tb0(this, 20);
        if (g6Var2.f20102c) {
            tb0Var.run();
        } else {
            g6Var2.h.add(tb0Var);
        }
        this.f31366w2.d(this.f31358v2);
        if (this.f31380y2 == null) {
            this.f31380y2 = g11Var;
        }
        g11 g11Var2 = this.f31380y2;
        if (g11Var2 == null) {
            g11 c10 = g11.c(this.currentAccount, this.f31358v2, g11Var2);
            this.f31380y2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31373x2 = z10;
        }
        g11 g11Var3 = this.f31380y2;
        if (g11Var3 != null) {
            tb0 tb0Var2 = new tb0(this, 16);
            if (g11Var3.f33432b) {
                tb0Var2.run();
            } else {
                g11Var3.h.add(tb0Var2);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.T0;
        if (v0Var != null) {
            v0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f31240e1)));
            if (e4()) {
                this.T0.K(44);
            } else {
                this.T0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.p61) {
            return ((org.telegram.ui.Components.p61) imageReceiver.getDrawable()).f26947a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f31239e0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.f31254g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f31247f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31247f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31247f0 = animatorSet2;
            if (z10) {
                this.f31254g0.setVisibility(0);
                this.f31247f0.playTogether(ObjectAnimator.ofFloat(this.f31254g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f31254g0, View.ALPHA, 0.0f));
            }
            this.f31247f0.setDuration(180L);
            this.f31247f0.addListener(new vz0(this, z10, 1));
            this.f31247f0.start();
        } else if (z10) {
            this.f31254g0.setAlpha(1.0f);
            this.f31254g0.setVisibility(0);
        } else {
            this.f31254g0.setAlpha(0.0f);
            this.f31254g0.setVisibility(4);
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final org.telegram.ui.Components.o5 Q3(int i10, long j3) {
        int i11;
        org.telegram.ui.Components.o5[] o5VarArr = this.H;
        if (o5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.i5 i5Var = this.f31246f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(dp, i11, i5Var, false);
            o5VarArr[i10] = o5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            o5Var.I = 0;
            o5Var.J = dp2;
            if (this.G0) {
                o5VarArr[i10].a();
            }
        }
        if (j3 != 0) {
            o5VarArr[i10].j(j3, false);
        } else {
            o5VarArr[i10].g(null, false);
        }
        X4();
        return o5VarArr[i10];
    }

    public final void Q4() {
        int i10;
        int i11;
        Long l4;
        if (this.B5 != null) {
            return;
        }
        q61[] q61VarArr = new q61[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            if (i5Var.getRightDrawable() == null) {
                rect.set(i5VarArr[1].getWidth() - 1, (i5VarArr[1].getHeight() / 2) - 1, i5VarArr[1].getWidth() + 1, (i5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(i5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((i5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) i5VarArr[1].getX(), (int) i5VarArr[1].getY());
            }
        }
        if (i5VarArr[1].getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.p.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.E2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        nz0 nz0Var = new nz0(this, this, parentActivity, valueOf, i11, this.f31383z0, i10, q61VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31240e1));
        if (user != null) {
            nz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.o5[] o5VarArr = this.G;
        if (l10 != null) {
            nz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.o5 o5Var = o5VarArr[1];
            if (o5Var != null) {
                Drawable drawable = o5Var.f26595f[0];
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.q5) drawable).i());
                    nz0Var.setSelected(l4);
                }
            }
            l4 = null;
            nz0Var.setSelected(l4);
        }
        nz0Var.setSaveState(3);
        nz0Var.y(o5VarArr[1], i5VarArr[1]);
        oz0 oz0Var = new oz0(this, nz0Var);
        this.B5 = oz0Var;
        q61VarArr[0] = oz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.getLocationOnScreen(iArr);
        }
        q61VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        q61VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        e01 e01Var = this.O;
        if (e01Var != null && this.f31334s != null) {
            int closestTab = e01Var.getClosestTab();
            int[] iArr = this.R.f27455c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f31334s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f31334s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f31334s.setText(a4.a.D(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f31334s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f31334s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f31334s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f31334s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f31334s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f31334s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f31334s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f31334s.setText(LocaleController.formatPluralString("CommonGroups", this.f31358v2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f31334s.setText(this.f31326r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.yu0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f31334s.setText(this.O.V(true));
                } else if (closestTab == 9) {
                    this.f31334s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.do0 do0Var = this.f31334s;
                    if (this.f31329r2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    do0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f31334s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.do0 do0Var2 = this.f31334s;
                    org.telegram.ui.Components.nr0 nr0Var = this.O.V;
                    if (nr0Var != null) {
                        i11 = nr0Var.getGiftsCount();
                    }
                    do0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f31334s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f31334s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f31329r2) {
                this.f31334s.setText(this.O.V(false));
            } else if (this.O.c0(closestTab) > 0) {
                this.f31334s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.c0(closestTab), new Object[0]));
            } else {
                this.f31334s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.i iVar;
        int i10;
        if (!this.B1 && (iVar = this.C1) != null && this.f31351u2 != null) {
            this.B1 = true;
            int i11 = 0;
            if (iVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f31248f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new gg.u(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        e01 e01Var = this.O;
        org.telegram.ui.Components.os0 os0Var = e01Var.I0;
        if (e01Var.f30450v1 != null && os0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = os0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.yu0.d0(num.intValue(), e01Var.f30412d1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.O.v1(true);
        this.f31382y5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.rr.h).withEndAction(new tb0(this, 21)).start();
        org.telegram.ui.Components.xc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.o5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        int i11;
        org.telegram.ui.Components.o5[] o5VarArr = this.G;
        if (o5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.i5 i5Var = this.f31246f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(dp, i11, i5Var, false);
            o5VarArr[i10] = o5Var;
            if (this.G0) {
                o5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                o5VarArr[i10].g(Y3(i10), z10);
                o5VarArr[i10].m(false, z10);
            } else {
                o5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                o5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                o5VarArr[i10].g(Y3(i10), z10);
                o5VarArr[i10].m(false, z10);
            } else {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                o5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                o5VarArr[i10].m(true, z10);
            }
        } else {
            o5VarArr[i10].g(Y3(i10), z10);
            o5VarArr[i10].m(false, z10);
        }
        X4();
        return o5VarArr[i10];
    }

    public final void S4() {
        int i10;
        float f7;
        k0 k0Var;
        if (this.f31210a0 != null && this.f31326r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
            boolean z10 = this.G1;
            eh0Var.e = z10;
            if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
                this.f31210a0.f23693f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
                this.f31210a0.setAlpha(this.S1);
                org.telegram.ui.Components.eh0 eh0Var2 = this.f31210a0;
                eh0Var2.E = AndroidUtilities.dp(74.0f);
                eh0Var2.setTranslationY(this.f31209a.getMeasuredWidth());
                eh0Var2.invalidate();
            } else {
                eh0Var.f23693f = -1.0f;
                float f10 = i11;
                float f11 = this.Q1 + f10;
                if (this.I4) {
                    f7 = 25.0f;
                } else {
                    f7 = 0.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f7);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.eh0 eh0Var3 = this.f31210a0;
                eh0Var3.E = min;
                eh0Var3.setTranslationY(dp - min);
                eh0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.f31210a0.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.v0) {
                    ((org.telegram.ui.ActionBar.v0) this.O0.getTag()).setAlpha(1.0f);
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
        if (this.Z0 != null && this.f31211a1 != null) {
            TLRPC.UserFull userFull = this.f31358v2;
            if (userFull == null && this.f31351u2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f31351u2.ttl_period;
            }
            this.f31335s0.b(i10);
            this.f31211a1.b(i10);
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
        if (this.f31340s5 != null) {
            e01 e01Var = this.O;
            if (e01Var != null && e01Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f31209a.getMeasuredHeight() - this.O.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.c cVar = this.A5;
            cVar.a(z10, true);
            float f7 = cVar.e;
            this.f31340s5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
            this.f31340s5.setAlpha(f7);
            FrameLayout frameLayout = this.f31340s5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
            if (qcVar != null) {
                qcVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f31370x == null) {
            this.f31370x = org.telegram.ui.ActionBar.h6.l4.getConstantState().newDrawable().mutate();
        }
        return this.f31370x;
    }

    public final void V4() {
        ci.e4 e4Var = this.f31238d6;
        if (e4Var != null) {
            org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
            boolean z10 = true;
            float x10 = i5VarArr[1].getX() + (-e4Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f31283k2);
            float f7 = 0.0f;
            e4Var.m(0.0f, (i5VarArr[1].getScaleX() * (i5VarArr[1].getRightDrawableX() - (lerp * i5VarArr[1].getRightDrawableWidth()))) + x10);
            float lerp2 = AndroidUtilities.lerp(this.f31294m2, this.f31289l2);
            ci.e4 e4Var2 = this.f31238d6;
            e4Var2.setTranslationY(((i5VarArr[1].getY() + (-e4Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.f31238d6.h(i0.a.d(lerp2, this.f31245e6, 1342177280));
            if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                z10 = false;
            }
            Boolean bool = this.f31253f6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.f31238d6.animate();
            this.f31253f6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.ul.r(animate.alpha(f7), org.telegram.ui.Components.rr.f27702g, 200L);
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
                f10 = this.f31283k2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f31312o5) * Utilities.clamp01(f10)) + f7;
    }

    public final void W4() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().isPremium()) {
                this.V0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, this.f31383z0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new ai.t3(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    public final float X3(float f7) {
        float f10;
        this.f31215a6 = f7;
        int i10 = this.J1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.S1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f31283k2;
        }
        float clamp01 = Utilities.clamp01(f10);
        if (this.T != null) {
            f11 = this.T.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, clamp01, f11, f7);
    }

    public final void X4() {
        Y4(this.P5);
    }

    public final org.telegram.ui.Components.qr Y3(int i10) {
        org.telegram.ui.Components.qr[] qrVarArr = this.K;
        if (qrVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, this.f31383z0), PorterDuff.Mode.MULTIPLY);
            qrVarArr[i10] = new org.telegram.ui.Components.qr(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return qrVarArr[i10];
    }

    public final void Y4(float f7) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, this.f31383z0), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oi, this.f31383z0), this.E5, 1.0f);
            }
            int d = i0.a.d(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.h6.Oi;
            int d10 = i0.a.d(this.E5, d, org.telegram.ui.ActionBar.h6.v0(i11, this.f31383z0));
            org.telegram.ui.Components.o5 o5Var = this.G[i10];
            if (o5Var != null) {
                o5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.o5 o5Var2 = this.H[i10];
            if (o5Var2 != null) {
                o5Var2.k(Integer.valueOf(i0.a.d(this.E5, i0.a.d(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.h6.v0(i11, this.f31383z0))));
            }
            if (i10 == 1) {
                this.f31232d0.setColor(d10);
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
        org.telegram.ui.Cells.o oVar = this.f31232d0;
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
        oVar.setScaleX(i5VarArr[1].getScaleX());
        this.f31232d0.setScaleY(i5VarArr[1].getScaleY());
        this.f31232d0.b((i5VarArr[1].getScaleX() * i5VarArr[1].getRightDrawableX()) + i5VarArr[1].getX(), (i5VarArr[1].getHeight() - (i5VarArr[1].getScaleY() * (i5VarArr[1].getHeight() - i5VarArr[1].getRightDrawableY()))) + i5VarArr[1].getY());
    }

    public final long a() {
        long j3 = this.f31269i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f31240e1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f31248f1;
    }

    public final org.telegram.ui.Components.yl0 a4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(i10);
            this.L = yl0Var;
            yl0Var.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18862h8, this.f31383z0));
        }
        return this.L;
    }

    public final void a5() {
        if (!this.f31321q1 && ChatObject.isForum(this.E2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f31248f1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f31266h5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f31248f1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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

    public final d11 b4() {
        if (this.f31223b6 == null) {
            d11 d11Var = new d11(LocaleController.getString(R.string.StatusHiddenShow));
            this.f31223b6 = d11Var;
            d11Var.setAlpha((int) (Math.min(1.0f, this.Q1 / T3()) * 255.0f));
            this.f31223b6.a(i0.a.d(this.f31283k2, org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.b(0.18f, -0.1f, this.f31226c1)), 603979775));
        }
        return this.f31223b6;
    }

    public final void b5(float f7) {
        t01 t01Var;
        ValueAnimator valueAnimator;
        if (this.f31316p2 || ((t01Var = this.N) != null && (valueAnimator = t01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f31209a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.N.requestLayout();
        }
        f11 f11Var = this.f31233d1;
        if (f11Var != null) {
            f11Var.E.setTranslate(0.0f, this.a2 - f11Var.f33076x);
            f11 f11Var2 = this.f31233d1;
            RadialGradient radialGradient = f11Var2.f33077y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(f11Var2.E);
            }
            this.f31233d1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        float f7;
        if (this.f31321q1) {
            return 0;
        }
        if (this.f31248f1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f31248f1)))) {
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
        if (this.f31336s1 && this.X0 != null && this.W0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f31240e1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.f1 f1Var = this.X0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            f1Var.setIcon(i10);
            org.telegram.ui.ActionBar.f1 f1Var2 = this.X0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            f1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.f1 f1Var3 = this.W0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            f1Var3.setVisibility(i12);
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

    public final org.telegram.ui.Components.qr d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f7;
        org.telegram.ui.Components.qr[] qrVarArr = this.J;
        if (qrVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.h6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f31377y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.h6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.Q5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.h6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.h6.b(0.1f, f7, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oi, this.f31383z0), this.E5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.f31383z0), this.E5, 1.0f), mode);
            }
            qrVarArr[i10] = new org.telegram.ui.Components.qr(new org.telegram.ui.Components.qq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return qrVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        s01 s01Var;
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        yy0 yy0Var;
        yy0 yy0Var2;
        org.telegram.ui.Components.wk0 wk0Var;
        if (i10 != NotificationCenter.uploadStoryEnd && i10 != NotificationCenter.chatWasBoostedByUser) {
            boolean z14 = true;
            int i12 = 0;
            r3 = false;
            boolean z15 = false;
            if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (this.f31240e1 != 0) {
                    if (z13) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (yy0Var2 = this.f31209a) != null && (wk0Var = (org.telegram.ui.Components.wk0) yy0Var2.L(this.G3, false)) != null) {
                        this.d.v(wk0Var, this.G3);
                    }
                } else if (this.f31248f1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (z13 && (yy0Var = this.f31209a) != null) {
                        int childCount = yy0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f31209a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.bb) {
                                ((org.telegram.ui.Cells.bb) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (this.f31351u2 != null && (chat = this.E2) != null && chat.f18083id == l4.longValue()) {
                    this.f31351u2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f31276j1) {
                        AndroidUtilities.runOnUIThread(new gl0(29, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.D2;
                    if (encryptedChat2 != null && encryptedChat.f18091id == encryptedChat2.f18091id) {
                        this.D2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.X1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z16 = this.f31282k1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f31240e1) >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f31282k1 = z12;
                    if (z16 != z12) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l10 = (Long) objArr[0];
                    if (this.E2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.E2;
                        if (longValue == chat2.f18083id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f31351u2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f31351u2 = chatFull4;
                            }
                            e01 e01Var = this.O;
                            if (e01Var != null) {
                                e01Var.setChatInfo(this.f31351u2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f31351u2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f31315p1) || (inputGroupCall != null && this.f31315p1))) {
                                D3(false);
                            }
                            kz0 kz0Var = this.f31349u0;
                            if (kz0Var != null && (chatFull3 = this.f31351u2) != null) {
                                kz0Var.setStories(chatFull3.stories);
                            }
                            yh.g0 g0Var = this.f31356v0;
                            if (g0Var != null) {
                                g0Var.a();
                            }
                            hz0 hz0Var = this.f31239e0;
                            if (hz0Var != null) {
                                hz0Var.setHasStories(j4());
                            }
                            if (l10.longValue() != 0) {
                                z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f31351u2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.I(38, z14);
                                org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
                                if (eh0Var != null) {
                                    eh0Var.o(3, z14);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f31240e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f31240e1))) != null && chatFull7.f18084id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.E2;
                    if (chat3 != null && chatFull7.f18084id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f18084id == this.f31248f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f31351u2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f31351u2 = chatFull7;
                        if (this.f31293m1 == 0) {
                            long j3 = chatFull7.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.f31293m1 = -j3;
                                getMediaDataController().getMediaCount(this.f31293m1, this.f31255g1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        iz0 iz0Var = this.f31300n0;
                        if (iz0Var != null && !this.f31321q1) {
                            iz0Var.setChatInfo(this.f31351u2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f31248f1));
                        if (chat4 != null) {
                            this.E2 = chat4;
                            D3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.X1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.E2.megagroup && (z11 || !booleanValue)) {
                            R3(true);
                        }
                        T4();
                        m5();
                        kz0 kz0Var2 = this.f31349u0;
                        if (kz0Var2 != null && (chatFull = this.f31351u2) != null) {
                            kz0Var2.setStories(chatFull.stories);
                        }
                        yh.g0 g0Var2 = this.f31356v0;
                        if (g0Var2 != null) {
                            g0Var2.a();
                        }
                        hz0 hz0Var2 = this.f31239e0;
                        if (hz0Var2 != null) {
                            hz0Var2.setHasStories(j4());
                        }
                        e01 e01Var2 = this.O;
                        if (e01Var2 != null) {
                            e01Var2.setChatInfo(this.f31351u2);
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
                    if (botInfo.user_id == this.f31240e1) {
                        this.F2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f31240e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f31358v2 = userFull;
                        org.telegram.ui.Components.iw0 iw0Var = this.T;
                        if (iw0Var != null) {
                            iw0Var.set(userFull.stars_rating);
                        }
                        kz0 kz0Var3 = this.f31349u0;
                        if (kz0Var3 != null) {
                            kz0Var3.setStories(this.f31358v2.stories);
                        }
                        yh.g0 g0Var3 = this.f31356v0;
                        if (g0Var3 != null) {
                            g0Var3.a();
                        }
                        hz0 hz0Var3 = this.f31239e0;
                        if (hz0Var3 != null) {
                            hz0Var3.setHasStories(j4());
                        }
                        e01 e01Var3 = this.O;
                        if (e01Var3 != null) {
                            e01Var3.setUserInfo(this.f31358v2);
                        }
                        if (this.f31320q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f31358v2.about, this.f31385z2)) {
                                this.d.m(this.W2);
                            }
                        } else {
                            if (!this.G1 && !this.K0) {
                                D3(true);
                            } else {
                                this.I1 = true;
                            }
                            e5(false, false);
                            e01 e01Var4 = this.O;
                            if (e01Var4 != null) {
                                e01Var4.setCommonGroupsCount(this.f31358v2.common_chats_count);
                                R();
                                org.telegram.ui.Components.qu0 qu0Var = this.R;
                                if (qu0Var == null || qu0Var.f27462y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f31366w2 == null && !h4()) {
                            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(this.currentAccount);
                            this.f31366w2 = g6Var;
                            tb0 tb0Var = new tb0(this, 15);
                            if (g6Var.f20102c) {
                                tb0Var.run();
                            } else {
                                g6Var.h.add(tb0Var);
                            }
                            this.f31366w2.d(this.f31358v2);
                        }
                        if (!h4()) {
                            g11 g11Var = this.f31380y2;
                            g11 c10 = g11.c(this.currentAccount, this.f31358v2, g11Var);
                            this.f31380y2 = c10;
                            if (c10 != g11Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f31373x2 = z10;
                            if (c10 != null) {
                                tb0 tb0Var2 = new tb0(this, 16);
                                if (c10.f33432b) {
                                    tb0Var2.run();
                                } else {
                                    c10.h.add(tb0Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (e4()) {
                                this.T0.K(44);
                            } else {
                                this.T0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f31358v2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z15 = true;
                            }
                            this.T0.I(46, z15);
                            this.T0.I(47, !z15);
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
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (s01Var = this.d) != null) {
                                            s01Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        yy0 yy0Var3 = this.f31209a;
                        if (yy0Var3 != null) {
                            yy0Var3.f1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.f31228c3;
                        int i16 = this.f31212a3;
                        int i17 = this.Y2;
                        j5();
                        s01 s01Var2 = this.d;
                        if (s01Var2 != null) {
                            if (i15 != this.f31228c3 || i16 != this.f31212a3 || i17 != this.Y2) {
                                s01Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f31321q1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        c11 c11Var = this.e;
                        if (c11Var != null) {
                            c11Var.f32229c = c11.H(this);
                            this.e.v.clear();
                            this.e.J();
                            c11 c11Var2 = this.e;
                            c11Var2.I(c11Var2.f32236y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.v0 v0Var = this.T0;
                            if (v0Var != null) {
                                v0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f31240e1)));
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
                                org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                                if (c5Var != null && c5Var.getLastFragment() == this) {
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
                                s01 s01Var3 = this.d;
                                if (s01Var3 != null) {
                                    s01Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !h4()) {
                                if (this.J4 < 0) {
                                    j5();
                                    R();
                                    s01 s01Var4 = this.d;
                                    if (s01Var4 != null) {
                                        s01Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new tb0(this, 17));
                                    return;
                                }
                                e01 e01Var5 = this.O;
                                if (e01Var5 != null) {
                                    e01Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f31240e1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f31240e1);
                                if (userFull3 != null) {
                                    this.f31358v2 = userFull3;
                                }
                                j5();
                                R();
                                yy0 yy0Var4 = this.f31209a;
                                if (yy0Var4 != null && yy0Var4.b0()) {
                                    this.f31209a.post(new tb0(this, 19));
                                    return;
                                }
                                s01 s01Var5 = this.d;
                                if (s01Var5 != null) {
                                    s01Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.E2;
                            if (chat5 != null && chat5.f18083id == longValue4) {
                                String str = (String) objArr[2];
                                a0.i iVar = this.C1;
                                if (iVar != null && (chatParticipant = (TLRPC.ChatParticipant) iVar.f(longValue5)) != null) {
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
                                        AndroidUtilities.updateVisibleRows(this.f31209a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        hz0 hz0Var4 = this.f31239e0;
                        if (hz0Var4 != null) {
                            hz0Var4.setHasStories(j4());
                            this.f31239e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f31283k2));
                        }
                        kz0 kz0Var4 = this.f31349u0;
                        if (kz0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f31358v2;
                            if (userFull4 != null) {
                                kz0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f31351u2;
                            if (chatFull9 != null) {
                                kz0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f31248f1)))) {
            getMessagesController().getStoriesController().k(a(), new ai.i(19), false, this.f31383z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null && v40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if ((v40Var == null || dialog != v40Var.f28647c) && super.dismissDialogOnPause(dialog)) {
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
        if (!this.f31329r2 || (userFull = this.f31358v2) == null || (botInfo = userFull.bot_info) == null) {
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
        } else if (!z11 && this.f31209a.isInLayout()) {
            yy0 yy0Var = this.f31209a;
            if (!yy0Var.G) {
                return;
            }
            yy0Var.post(new org.telegram.ui.Components.sr0(8, this, z10));
        } else {
            g01 g01Var = new g01(this);
            g01Var.f33416b = this.N2;
            g01Var.f(g01Var.f33417c);
            g01Var.e.clear();
            g01Var.f33418f.clear();
            g01Var.e.addAll(this.Q4);
            g01Var.f33418f.addAll(this.R4);
            g01Var.f33419g = this.f31353u4;
            g01Var.h = this.f31360v4;
            if (z10) {
                h5(false);
            }
            F4();
            j5();
            g01Var.f(g01Var.d);
            try {
                s4.o.c(g01Var, true).b(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.U5;
            if (i10 >= 0) {
                this.f31224c.h1(i10, this.V5 - this.f31209a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f31209a);
        }
    }

    @Override
    public final org.telegram.ui.Components.ml0 f() {
        return this.f31209a;
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
        this.f31302n2 = z10;
    }

    public final void f5() {
        int i10;
        if (this.f31225c0 != null && this.f31326r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f31225c0.setAlpha(this.S1);
                org.telegram.ui.Components.wh0 wh0Var = this.f31225c0;
                float dp = AndroidUtilities.dp(74.0f) + this.f31209a.getMeasuredWidth();
                wh0Var.L = O3() - AndroidUtilities.dp(74.0f);
                wh0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                wh0Var.invalidate();
                return;
            }
            if (z10) {
                this.f31225c0.setAlpha(this.S1);
            }
            float f7 = i11;
            float dp2 = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f7);
            org.telegram.ui.Components.wh0 wh0Var2 = this.f31225c0;
            wh0Var2.L = min - AndroidUtilities.dp(74.0f);
            wh0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            wh0Var2.invalidate();
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
        return getMessagesController().isUserNoForwards(this.f31358v2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override
    public final wu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f31383z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f31383z0 != null) {
            return null;
        }
        qy0 qy0Var = new qy0(0, this);
        ArrayList arrayList = new ArrayList();
        e01 e01Var = this.O;
        if (e01Var != null) {
            arrayList.addAll(e01Var.getThemeDescriptions());
        }
        yy0 yy0Var = this.f31209a;
        int i10 = org.telegram.ui.ActionBar.h6.f18789d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(yy0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, null, null, null, null, i10));
        yy0 yy0Var2 = this.f31209a;
        int i11 = org.telegram.ui.ActionBar.h6.f18733a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(yy0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f18826f8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f19013pc));
        int i12 = org.telegram.ui.ActionBar.h6.f18862h8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f19128vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i12));
        org.telegram.ui.Components.do0 do0Var = this.f31334s;
        if (do0Var != null) {
            TextView textView = do0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.h6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, qy0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31334s.getNextTextView(), 4, null, null, null, qy0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31233d1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        hz0 hz0Var = this.f31239e0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f19038r0;
        int i14 = org.telegram.ui.ActionBar.h6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hz0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31239e0, 0, null, null, new Drawable[]{this.f31314p0}, null, org.telegram.ui.ActionBar.h6.f18791d8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.f19145wh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19163xh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19181yh));
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19153x6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19008p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18990o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19100u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        int i16 = org.telegram.ui.ActionBar.h6.f18953m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19118v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.h6.f19189z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.h6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 2, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 131072, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.h6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 196608, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 131072, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 196608, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19111uh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i23 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.h6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.h6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31209a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31216b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.F5;
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(i5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.h6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.j6(i5VarArr[1], 0, null, null, this.f31377y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(i5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.h6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.j6(i5VarArr[1], 0, null, null, this.f31377y, null, org.telegram.ui.ActionBar.h6.f19200zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.f31383z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31383z0;
        if (d6Var != null) {
            drawable = d6Var.getDrawable(str);
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
        if (this.f31320q0 != null && !this.f31336s1) {
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
        TLRPC.ChatFull chatFull = this.f31351u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.B2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f31351u2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31351u2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f18230id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
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
                i11 = com.google.android.gms.internal.vision.e2.e(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = com.google.android.gms.internal.vision.e2.e(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$EL.reversed(Comparator$CC.comparingInt(new gf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.f31353u4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f31209a);
        }
        if (this.O != null && this.J4 != -1) {
            if ((this.C2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.O.a1(this.C2, this.f31351u2);
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
        org.telegram.ui.Components.e5.s(this, false, chat, null, false, z11, z10, !isForum, new dy0(this, 1));
    }

    public final void i5(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f31316p2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v02;
        if (!this.f31316p2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.s()) {
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19138w8, this.f31383z0);
            } else if (this.F5) {
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.f31383z0);
            } else {
                MessagesController.PeerColor peerColor = this.Q5;
                if (peerColor != null) {
                    v02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
                } else {
                    v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, this.f31383z0);
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
        if (getMessagesController().getStoriesController().I(a()) && !this.f31321q1) {
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
        if (this.f31275j0 != null && (imageView = this.f31281k0) != null) {
            if (this.L1 && (chat = this.E2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f31281k0.setVisibility(0);
                this.f31275j0.setTag(1);
                this.f31275j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f31281k0.setVisibility(8);
            this.f31275j0.setTag(null);
            this.f31275j0.setVisibility(8);
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
        if ((this.f31349u0 != null || this.f31356v0 != null) && (kVar = this.actionBar) != null) {
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
            kz0 kz0Var = this.f31349u0;
            if (kz0Var != null) {
                float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(f10 - kz0Var.f31499f0) <= 0.1f && Math.abs(width - kz0Var.f31500g0) <= 0.1f && Math.abs(A - kz0Var.f31501h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                kz0Var.f31499f0 = f10;
                kz0Var.f31500g0 = width;
                if (z10) {
                    kz0Var.m0.d(width, true);
                }
                kz0Var.f31501h0 = A;
                if (z11) {
                    kz0Var.invalidate();
                }
            }
            yh.g0 g0Var = this.f31356v0;
            if (g0Var != null) {
                float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
                int U3 = U3();
                z12 = (Math.abs(f10 - g0Var.f47103r) > 0.1f || Math.abs(width - g0Var.f47104s) > 0.1f || Math.abs(A2 - g0Var.v) > 0.1f) ? true : true;
                g0Var.f47103r = f10;
                g0Var.f47104s = width;
                if (z10) {
                    g0Var.f47107y.d(width, true);
                }
                g0Var.v = A2;
                g0Var.f47106x = U3 + A2;
                if (z12) {
                    g0Var.invalidate();
                }
            }
        }
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5():void");
    }

    public final void n4(boolean z10) {
        boolean z11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31240e1));
        if (user != null) {
            if (this.f31329r2 && !MessagesController.isSupportUser(user)) {
                if (this.f31282k1 && !z10) {
                    getMessagesController().unblockPeer(this.f31240e1, new tb0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.E2;
                if (this.D2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.e5.s(this, false, chat, user, z11, true, false, true, new ey0(this, user));
            } else if (this.f31282k1) {
                getMessagesController().unblockPeer(this.f31240e1);
                if (org.telegram.ui.Components.xc.a(this)) {
                    org.telegram.ui.Components.xc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.e5.j0(this, this.f31240e1, user, null, this.D2, false, null, new ua(this, 4), this.f31383z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f31383z0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new dy0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, this.f31383z0));
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
        int i12 = 0;
        float f10 = 0.2f;
        int i13 = (y3() > 0.2f ? 1 : (y3() == 0.2f ? 0 : -1));
        if (i13 > 0 && !this.W1 && (this.f31320q0 == null || this.O2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.H5 = z11;
        C3();
        org.telegram.ui.Components.bj0 bj0Var = this.v;
        if (bj0Var != null && bj0Var.getVisibility() != 8) {
            org.telegram.ui.Components.bj0 bj0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            bj0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            if (i13 > 0 && !this.W1 && !this.f31336s1 && (this.f31320q0 == null || this.O2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f31248f1 != 0) {
                if (ChatObject.isChannel(this.E2) && !this.E2.megagroup && (chatFull = this.f31351u2) != null && chatFull.linked_chat_id != 0 && (this.D3 != -1 || this.E3 != -1)) {
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
                    AnimatorSet animatorSet = this.f31363w;
                    if (animatorSet != null) {
                        this.f31363w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f31363w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f31363w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f31363w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f31363w.setDuration(150L);
                        this.f31363w.addListener(new uz0(this, 1));
                        this.f31363w.start();
                    } else {
                        org.telegram.ui.Components.bj0 bj0Var3 = this.v;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        bj0Var3.setScaleX(f7);
                        org.telegram.ui.Components.bj0 bj0Var4 = this.v;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        bj0Var4.setScaleY(f10);
                        org.telegram.ui.Components.bj0 bj0Var5 = this.v;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        bj0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        kz0 kz0Var = this.f31349u0;
        if (kz0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            kz0Var.f31502i0 = measuredWidth;
            kz0Var.f31504k0 = z12;
            kz0Var.f31503j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            kz0Var.invalidate();
        }
        yh.g0 g0Var = this.f31356v0;
        if (g0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.Q1 + this.T1);
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
        boolean z11;
        if (this.f31240e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31240e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f31358v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.f2.m(user, z10, z11, getParentActivity(), this.f31358v2, getAccountInstance());
            }
        } else if (this.f31248f1 != 0) {
            if (getMessagesController().getGroupCall(this.f31248f1, false) == null) {
                TLRPC.Chat chat = this.E2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.x70.t(getParentActivity(), -chat.f18083id, accountInstance, new org.telegram.ui.Components.t50(chat, this, accountInstance, 3));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.f2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.nr0 nr0Var;
        org.telegram.ui.Components.os0 os0Var;
        org.telegram.ui.Components.d90 d90Var;
        int v02;
        int v03;
        int v04;
        int color3;
        int v05;
        int v06;
        int v07;
        this.R5.clear();
        f11 f11Var = this.f31233d1;
        if (f11Var != null) {
            f11Var.a(this.Q5, true);
        }
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31326r;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[1];
        if (i5Var != null) {
            if (i5Var.getTag() instanceof Integer) {
                v07 = org.telegram.ui.ActionBar.h6.v0(((Integer) i5VarArr[1].getTag()).intValue(), this.f31383z0);
            } else {
                v07 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B8, this.f31383z0);
            }
            i5VarArr[1].setTextColor(i0.a.d(this.f31283k2, w3(v07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        d11 d11Var = this.f31223b6;
        float f7 = -0.1f;
        if (d11Var != null) {
            d11Var.a(i0.a.d(this.f31283k2, org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.b(0.18f, -0.1f, this.f31226c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.Q5 != null) {
                v05 = -1;
            } else {
                v05 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, this.f31383z0);
            }
            kVar.B(i0.a.d(this.E5, v05, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19172y8, this.f31383z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null) {
                v06 = 1090519039;
            } else if (peerColor != null) {
                v06 = 553648127;
            } else {
                v06 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18826f8, this.f31383z0);
            }
            kVar2.A(i0.a.d(this.E5, v06, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19191z8, this.f31383z0)), false);
        }
        Drawable[] drawableArr = this.f31377y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.Q5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.Q5.hasColor6(org.telegram.ui.ActionBar.h6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.08f;
                }
                v04 = org.telegram.ui.ActionBar.h6.b(0.1f, f7, d);
            } else {
                v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, this.f31383z0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v04, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oi, this.f31383z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            if (this.Q5 != null) {
                v03 = -1;
            } else {
                v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ah, this.f31383z0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(v03, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.f31383z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.i5 i5Var2 = this.f31246f[1];
        if (i5Var2 != null) {
            if (this.Q5 != null) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19128vh, this.f31383z0);
            }
            i5Var2.setTextColor(i0.a.d(this.f31283k2, i0.a.d(this.E5, v02, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oi, this.f31383z0)), -1));
        }
        org.telegram.ui.Components.o8 o8Var = this.f31211a1;
        if (o8Var != null && (d90Var = o8Var.e) != null) {
            d90Var.invalidate();
        }
        Drawable drawable = this.f31370x;
        if (drawable != null) {
            if (this.Q5 == null) {
                i10 = i0.a.d(this.S1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19013pc, this.f31383z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.wh0 wh0Var = this.f31225c0;
        if (wh0Var != null) {
            wh0Var.setColor(this.Q5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f31209a, (Utilities.Callback<View>) new ly0(this, 2));
        e01 e01Var = this.O;
        if (e01Var != null && (os0Var = e01Var.I0) != null) {
            os0Var.e();
        }
        e01 e01Var2 = this.O;
        if (e01Var2 != null && (nr0Var = e01Var2.V) != null) {
            nr0Var.m();
        }
        p5();
        X4();
        kz0 kz0Var = this.f31349u0;
        if (kz0Var != null) {
            kz0Var.f(true, true);
        }
        yh.g0 g0Var = this.f31356v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.i(i10, i11, intent);
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
        org.telegram.ui.Components.wh0 wh0Var;
        org.telegram.ui.Components.eh0 eh0Var;
        super.onConfigurationChanged(configuration);
        e01 e01Var = this.O;
        if (e01Var != null) {
            e01Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f31302n2 && (eh0Var = this.f31210a0) != null) {
            eh0Var.i();
        }
        if (this.f31302n2 && (wh0Var = this.f31225c0) != null) {
            wh0Var.b();
        }
        if (this.f31302n2 && this.f31316p2 && (m10 = this.f31224c.m(0)) != null) {
            this.f31209a.scrollBy(0, m10.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new bi(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        yy0 yy0Var = this.f31209a;
        if (yy0Var != null) {
            yy0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        e01 e01Var = this.O;
        if (e01Var != null) {
            e01Var.F0();
        }
        org.telegram.ui.Components.qu0 qu0Var = this.R;
        if (qu0Var != null) {
            qu0Var.b(this);
        }
        org.telegram.ui.Components.qu0 qu0Var2 = this.R;
        if (qu0Var2 != null) {
            qu0Var2.f27461x.remove(this);
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
        iz0 iz0Var = this.f31300n0;
        if (iz0Var != null) {
            iz0Var.K();
        }
        org.telegram.ui.Components.gh0 gh0Var = this.m0;
        if (gh0Var != null) {
            gh0Var.e();
        }
        this.J5 = null;
        if (this.f31240e1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f31240e1);
        } else if (this.f31248f1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        hz0 hz0Var = this.f31239e0;
        if (hz0Var != null) {
            hz0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.e();
        }
        mz0 mz0Var = this.V4;
        if (mz0Var != null) {
            mz0Var.b();
        }
        g11 g11Var = this.f31380y2;
        if (g11Var != null && this.f31373x2) {
            g11Var.b(true);
            this.f31380y2 = null;
        }
        org.telegram.messenger.u8 u8Var = this.f31376x5;
        if (u8Var != null) {
            this.f31376x5 = null;
            AndroidUtilities.runOnUIThread(u8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.et0 et0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.j();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        e01 e01Var = this.O;
        if (e01Var != null && (et0Var = e01Var.T) != null) {
            et0Var.e = false;
            if (et0Var.f40198c != null) {
                et0Var.f40196a.onPause();
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
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.k(i10, strArr, iArr);
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
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f31248f1, false);
                    TLRPC.Chat chat = this.E2;
                    if (groupCall == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.f2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.f2.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31240e1));
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
            TLRPC.UserFull userFull = this.f31358v2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.f2.m(user, z11, z12, getParentActivity(), this.f31358v2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.f2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        p50 p50Var;
        super.onResume();
        e01 e01Var = this.O;
        if (e01Var != null) {
            e01Var.f30405b1 = true;
            org.telegram.ui.Components.dt0 dt0Var = e01Var.H;
            if (dt0Var != null) {
                dt0Var.l();
            }
            org.telegram.ui.Components.lu0 lu0Var = e01Var.K;
            if (lu0Var != null) {
                lu0Var.l();
            }
            org.telegram.ui.Components.mu0 mu0Var = e01Var.J;
            if (mu0Var != null) {
                mu0Var.X(false);
            }
            for (int i10 = 0; i10 < e01Var.f30426k0.length; i10++) {
                e01Var.U(i10);
            }
            org.telegram.ui.Components.et0 et0Var = e01Var.T;
            if (et0Var != null) {
                et0Var.e = true;
                if (et0Var.f40198c != null) {
                    et0Var.f40196a.onResume();
                }
            }
        }
        f4();
        s01 s01Var = this.d;
        if (s01Var != null) {
            this.T4 = true;
            s01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (p50Var = this.U) != null && p50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new bi(this, 5));
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.f31246f[1];
        if (i5Var != null) {
            setParentActivityTitle(i5Var.getText());
        }
        if (this.f31240e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f31240e1))) != null && user.photo == null && this.Q1 >= T3()) {
            this.f31277j2.cancel();
            float[] fArr = this.f31294m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f31300n0.setVisibility(8);
            this.Q1 = T3();
            this.f31309o2 = false;
            this.f31224c.h1(0, T3() - this.f31209a.getPaddingTop());
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
                        this.f31283k2 = 0.0f;
                        org.telegram.ui.Components.iw0 iw0Var = this.T;
                        if (iw0Var != null) {
                            iw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
                        if (eh0Var != null) {
                            eh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.wh0 wh0Var = this.f31225c0;
                        if (wh0Var != null) {
                            wh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    A3();
                    if (this.I1) {
                        D3(true);
                    }
                }
                if (!this.f31291l5) {
                    this.f31291l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.P4);
            p50 p50Var = this.U;
            if (p50Var != null && p50Var.getVisibility() == 0) {
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
        p50 p50Var = this.U;
        if (p50Var != null && p50Var.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f7);
            } else {
                this.U.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.eh0 eh0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.M5 = z10;
        if (z10 && (eh0Var = this.f31210a0) != null) {
            ArrayList arrayList = eh0Var.f23686a;
            if (eh0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.bh0 bh0Var = (org.telegram.ui.Components.bh0) arrayList.get(i10);
                    org.telegram.ui.Components.yi0 yi0Var = bh0Var.f22747k;
                    if (yi0Var != null) {
                        if (bh0Var.f22740a == 15) {
                            yi0Var.M(14);
                        } else {
                            yi0Var.M(0);
                        }
                        bh0Var.f22747k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.v0)) {
            ((org.telegram.ui.ActionBar.v0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f31316p2) {
            this.G1 = true;
            if (!z10) {
                if (this.J5 == null) {
                    this.J5 = new float[16];
                }
                this.F1 = this.Q1;
                this.J5[0] = this.Y.getScaleX();
                this.J5[1] = this.Y.getTranslationX();
                this.J5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.eh0 eh0Var2 = this.f31210a0;
                if (eh0Var2 != null) {
                    this.J5[3] = eh0Var2.getAlpha();
                }
                yh.g0 g0Var = this.f31356v0;
                if (g0Var != null) {
                    float[] fArr = this.J5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f47101f;
                }
                d11 d11Var = this.f31223b6;
                if (d11Var != null) {
                    this.J5[6] = d11Var.getAlpha();
                }
                float[] fArr2 = this.J5;
                org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
                fArr2[7] = i5VarArr[1].getScaleX();
                this.J5[8] = i5VarArr[1].getTranslationY();
                float[] fArr3 = this.J5;
                org.telegram.ui.ActionBar.i5[] i5VarArr2 = this.f31326r;
                fArr3[9] = i5VarArr2[1].getTranslationY();
                this.J5[10] = i5VarArr[1].getLayoutParams().width;
                this.J5[11] = this.f31227c2;
                for (int i11 = 0; i11 < i5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[i11];
                    if (i5Var != null) {
                        int i12 = i11 * 2;
                        this.J5[i12 + 12] = i5Var.getTranslationX();
                        this.J5[i12 + 13] = i5VarArr2[i11].getTranslationX();
                    }
                }
                ci.e4 e4Var = this.f31238d6;
                if (e4Var != null) {
                    e4Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f31320q0 != null) {
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

    @Override
    public final boolean p() {
        return this.M5;
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.f31358v2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.E2 != null) {
            org.telegram.ui.Components.k40.h.a();
        }
        showDialog(new xh.r1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19163xh, this.f31383z0);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19181yh, this.f31383z0);
                int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19145wh, this.f31383z0);
                if (this.Q5 != null && org.telegram.ui.ActionBar.h6.b1(v02)) {
                    v02 = org.telegram.ui.ActionBar.h6.b(0.05f, -0.04f, this.Q5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.Q5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
                        v03 = org.telegram.ui.ActionBar.h6.C(org.telegram.ui.ActionBar.h6.I.q(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19118v6, this.f31383z0), bgColor2, v03, bgColor2);
                    }
                    v04 = -1;
                }
                org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(mutate, org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                qqVar.e = dp;
                qqVar.f27427f = dp2;
                this.v.setBackground(qqVar);
                this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
            } catch (Exception unused) {
            }
        }
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.f18083id, getUserConfig().getCurrentUser(), 0, null, this, true, new vl0(this, z10, zArr, 5), new ca.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    @Override
    public final void r() {
        this.f31209a.x0(0);
    }

    public final void r4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j3;
        long j10 = this.f31269i1;
        if (j10 == 0) {
            j10 = this.f31240e1;
            if (j10 == 0) {
                j10 = -this.f31248f1;
            }
        }
        long j11 = j10;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j11, this.f31255g1);
        if (z10 && (this.f31321q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j11, this.f31255g1, z11);
            org.telegram.ui.Components.xc.A(this, z11, null).j();
            a5();
            this.f31210a0.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j11, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, this.f31255g1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f31255g1 == 0) {
                    getMessagesStorage().setDialogFlags(j11, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j11);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (!isGlobalNotificationsEnabled) {
                    edit2.remove("notify2_" + sharedPrefKey);
                    j3 = 0L;
                } else {
                    edit2.putInt("notify2_" + sharedPrefKey, 2);
                    j3 = 1;
                }
                getNotificationsController().removeNotificationsForDialog(j11);
                if (this.f31255g1 == 0) {
                    getMessagesStorage().setDialogFlags(j11, j3);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j11);
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
            getNotificationsController().updateServerNotificationsSettings(j11, this.f31255g1);
            j5Var.setChecked(z13);
            org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) this.f31209a.L(this.N3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.qo qoVar = new org.telegram.ui.Components.qo(getParentActivity(), this.currentAccount, null, true, new e6.n(this, j11, 5), this.f31383z0);
            qoVar.d(j11, this.f31255g1, this.f31266h5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.f31210a0.getHeight() - AndroidUtilities.dp(12.0f);
            }
            qoVar.c(this, view, f11, f12, z10);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null) {
            v40Var.f28648f = bundle.getString("path");
        }
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f31240e1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f31240e1));
                if (user != null) {
                    if (this.F2 != null && (userFull = this.f31358v2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f31358v2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f31248f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f31248f1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f31351u2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f31351u2.about, ChatObject.getPublicUsername(chat));
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
        org.telegram.ui.Components.v40 v40Var = this.f31320q0;
        if (v40Var != null && (str = v40Var.f28648f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int v02;
        int v03;
        int v04;
        int i10;
        int w32;
        int w33;
        this.f31283k2 = f7;
        this.S1 = f7;
        B3();
        if (this.J1 == 2) {
            this.f31239e0.setProgressToExpand(f7);
            org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
            if (eh0Var != null) {
                eh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.wh0 wh0Var = this.f31225c0;
            if (wh0Var != null) {
                wh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.iw0 iw0Var = this.T;
            if (iw0Var != null) {
                iw0Var.setParentExpanded(f7);
            }
            S4();
            f5();
        }
        this.f31209a.setAlpha(f7);
        this.f31209a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (v02 = this.f31327r0) == 0) {
            if (this.f31240e1 == 0 && ChatObject.isChannel(this.f31248f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.f31383z0;
            int[][] iArr = org.telegram.ui.Components.h9.C;
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, d6Var);
        }
        int i11 = this.X4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, this.f31383z0);
        }
        this.f31233d1.setBackgroundColor(i0.a.d(f7, i0.a.k(i11, 0), v02));
        org.telegram.ui.Components.u11 u11Var = this.f31288l0;
        int d = i0.a.d(f7, i11, v02);
        u11Var.f28380k = true;
        u11Var.f28374b.setColor(d);
        int i12 = -1;
        if (this.Q5 != null) {
            v03 = -1;
        } else {
            if (this.f31240e1 == 0 && ChatObject.isChannel(this.f31248f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.d6 d6Var2 = this.f31383z0;
            int[][] iArr2 = org.telegram.ui.Components.h9.C;
            v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18845g8, d6Var2);
        }
        this.actionBar.B(i0.a.d(this.S1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, this.f31383z0), v03), false);
        if (this.Q5 == null) {
            i12 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19128vh, this.f31383z0);
        }
        int v05 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, this.f31383z0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.i5 i5Var = this.f31246f[i13];
            if (i5Var != null && (i13 != 1 || this.J1 != 2)) {
                i5Var.setTextColor(i0.a.d(f7, v05, i12));
            }
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Bh, this.f31383z0);
        } else {
            if (this.f31240e1 == 0 && ChatObject.isChannel(this.f31248f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.d6 d6Var3 = this.f31383z0;
            int[][] iArr3 = org.telegram.ui.Components.h9.C;
            v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18862h8, d6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.h6.f19011pa;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.B8;
        }
        int v06 = org.telegram.ui.ActionBar.h6.v0(i10, this.f31383z0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.i5 i5Var2 = this.f31326r[i14];
            if (i5Var2 != null && i14 != 1 && (i14 != 2 || this.J1 != 2)) {
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
                i5Var2.setTextColor(i0.a.d(f7, w32, w33));
            }
        }
        this.Q1 = this.R1 * f7;
        long j3 = this.f31240e1;
        if (j3 == 0) {
            j3 = this.f31248f1;
        }
        org.telegram.ui.ActionBar.d6 d6Var4 = this.f31383z0;
        int[][] iArr4 = org.telegram.ui.Components.h9.C;
        int v07 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19009p8[org.telegram.ui.Components.h9.e(j3)], d6Var4);
        long j10 = this.f31240e1;
        if (j10 == 0) {
            j10 = this.f31248f1;
        }
        int d10 = org.telegram.ui.Components.h9.d(j10);
        if (v07 != d10) {
            this.f31314p0.h(i0.a.d(f7, d10, v07));
            this.f31239e0.invalidate();
        }
        int i15 = this.Y4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f7, i15, getNavigationBarColor()));
        }
        this.f31233d1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        n01 n01Var = this.N5;
        if (n01Var != null) {
            n01Var.invalidate();
        }
        if (a() > 0) {
            hz0 hz0Var = this.f31239e0;
            if (hz0Var != null) {
                hz0Var.setProgressToStoriesInsets(this.S1);
            }
            kz0 kz0Var = this.f31349u0;
            if (kz0Var != null) {
                kz0Var.setProgressToStoriesInsets(this.S1);
            }
            yh.g0 g0Var = this.f31356v0;
            if (g0Var != null) {
                g0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.c5 c5Var) {
        super.setParentLayout(c5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (c5Var != null && c5Var.getParentActivity() != null) {
            this.X1 = new FlagSecureReason(c5Var.getParentActivity().getWindow(), new dy0(this, 6));
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f31248f1);
            bundle.putLong("user_id", this.f31240e1);
            presentFragment(new x21(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.U2) {
            if (this.f31240e1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f31358v2)) {
                org.telegram.ui.Components.xc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f31240e1)))).j();
            } else {
                showDialog(new xh.r1(getParentActivity(), this.currentAccount, this.f31240e1, null, null));
            }
        }
    }

    @Override
    public final boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a4.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j3)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
        } else if (DialogObject.isUserDialog(j3)) {
            i12.putLong("user_id", j3);
        } else if (DialogObject.isChatDialog(j3)) {
            i12.putLong("chat_id", -j3);
        }
        if (!getMessagesController().checkCanOpenChat(i12, ryVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new xn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f31240e1)), j3, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j3, z11, i10, i11, 0L);
        }
        return true;
    }

    public final void u4() {
        boolean z10;
        org.telegram.ui.Components.yi0 yi0Var;
        if (this.f31240e1 != 0) {
            if (this.f31320q0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.v40 v40Var = this.f31320q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v40Var.o(z10, new tb0(this, 24), new s5(this, 14), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
                    if (eh0Var != null) {
                        org.telegram.ui.Components.bh0 j3 = org.telegram.ui.Components.eh0.j(14, eh0Var.f23686a);
                        if (j3 != null && (yi0Var = j3.f22747k) != null) {
                            yi0Var.start();
                        }
                    } else {
                        this.v.d();
                    }
                    org.telegram.ui.Cells.s8 s8Var = this.M2;
                    if (s8Var != null) {
                        s8Var.getImageView().d();
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
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f31269i1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.ct(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = a4.a.i("addToGroup", true);
        i10.putLong("chatId", this.E2.f18083id);
        b70 b70Var = new b70(i10);
        TLRPC.ChatFull chatFull = this.f31351u2;
        b70Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.i iVar = new a0.i();
            for (int i11 = 0; i11 < this.f31351u2.participants.participants.size(); i11++) {
                iVar.k(null, this.f31351u2.participants.participants.get(i11).user_id);
            }
            b70Var.J = iVar;
        }
        b70Var.f32011x = new dy0(this, 9);
        presentFragment(b70Var);
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.Q5 != null) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19065s8, this.f31383z0);
            int d = i0.a.d(0.5f, this.Q5.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), this.Q5.getStoryColor2(org.telegram.ui.ActionBar.h6.I.q()));
            if (!org.telegram.ui.ActionBar.h6.b1(v02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.h6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.h6.l1(0.7f, d));
                }
                return d;
            }
            boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.h6.l1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.h6.C(q6, v02, d, i10, i11);
        }
        return i10;
    }

    public final void w4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.w4(boolean):void");
    }

    @Override
    public final fh.d x() {
        return this.f31306n6;
    }

    public final void x3() {
        int i10;
        int i11;
        if (this.J5 != null) {
            ValueAnimator valueAnimator = this.f31277j2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f31277j2.cancel();
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
                this.f31219b2 = AndroidUtilities.lerp(0.42f, this.J5[0], clamp01);
                this.Z1 = AndroidUtilities.lerp(this.O5, this.J5[1], clamp01);
                this.a2 = AndroidUtilities.lerp(translationY, this.J5[2], clamp01);
                this.f31227c2 = AndroidUtilities.lerp(this.J5[11], 0.0f, clamp01);
                this.Y.setScaleX(this.f31219b2);
                this.Y.setScaleY(this.f31219b2);
                this.Y.setTranslationX(this.Z1);
                this.Y.setTranslationY(this.a2);
                org.telegram.ui.Components.iw0 iw0Var = this.T;
                if (iw0Var != null) {
                    iw0Var.setAlpha(clamp01);
                }
                this.f31239e0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                kz0 kz0Var = this.f31349u0;
                if (kz0Var != null) {
                    kz0Var.invalidate();
                }
                yh.g0 g0Var = this.f31356v0;
                if (g0Var != null) {
                    g0Var.e = AndroidUtilities.lerp(0.0f, this.J5[4], f7);
                    this.f31356v0.f47101f = AndroidUtilities.lerp(0.0f, this.J5[5], clamp01);
                    yh.g0 g0Var2 = this.f31356v0;
                    g0Var2.h = true;
                    g0Var2.invalidate();
                }
                d11 d11Var = this.f31223b6;
                if (d11Var != null) {
                    d11Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.J5[6], clamp01));
                }
                float dp = (((this.f31219b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f31261h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f31261h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f31268i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f31268i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f31275j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f31275j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f31281k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f31281k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.J5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f31241e2 = AndroidUtilities.lerp(floor, this.J5[8], clamp01);
                this.f31256g2 = AndroidUtilities.lerp(dpf2, this.J5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
                    if (i13 >= i5VarArr.length) {
                        break;
                    }
                    if (i5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 13], clamp01);
                        i5VarArr[i13].setTranslationX(lerp2);
                        i5VarArr[i13].setTranslationY(this.f31241e2);
                        org.telegram.ui.ActionBar.i5[] i5VarArr2 = this.f31326r;
                        i5VarArr2[i13].setTranslationX(this.f31312o5 + lerp3);
                        i5VarArr2[i13].setTranslationY(this.f31256g2);
                        if (i13 == 1) {
                            this.f31234d2 = lerp2;
                            this.f31249f2 = lerp3;
                            this.f31334s.setTranslationX(lerp3);
                            this.f31334s.setTranslationY(this.f31256g2);
                        }
                        i5VarArr[i13].setScaleX(lerp);
                        i5VarArr[i13].setScaleY(lerp);
                    }
                    i13++;
                }
                V4();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                l4((int) this.J5[10], clamp01, true);
                org.telegram.ui.Components.eh0 eh0Var = this.f31210a0;
                if (eh0Var != null) {
                    eh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.J5[3], f7));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f31240e1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f31240e1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f31240e1);
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
                xn xnVar = new xn(bundle);
                xnVar.B9 = getMediaDataController().getGreetingsSticker();
                xnVar.C9 = false;
                presentFragment(xnVar, z10);
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
        TLRPC.ChatFull chatFull = this.f31351u2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f31351u2.linked_chat_id);
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
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.f31219b2 = 1.38f;
        this.f31227c2 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.i5[] i5VarArr = this.f31246f;
            if (i11 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[i11];
            if (i5Var != null) {
                float measuredWidth = (this.f31209a.getMeasuredWidth() / 2.0f) - (((i5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) i5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.i5[] i5VarArr2 = this.f31326r;
                float measuredWidth2 = (this.f31209a.getMeasuredWidth() / 2.0f) - ((i5VarArr2[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) i5VarArr2[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.f31234d2 = measuredWidth;
                    this.f31249f2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.J1 != 2) {
            this.f31349u0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f31239e0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f31358v2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                ai.ib ibVar = new ai.ib(3, 1);
                ibVar.setResourceProvider(this.f31383z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f31358v2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                ibVar.O0 = false;
                ibVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(ibVar);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f31358v2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.qu0 qu0Var) {
        super(bundle);
        this.f31246f = new org.telegram.ui.ActionBar.i5[2];
        this.h = null;
        this.f31299n = null;
        this.f31326r = new org.telegram.ui.ActionBar.i5[4];
        this.f31377y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.o5[2];
        this.H = new org.telegram.ui.Components.o5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.qr[2];
        this.K = new org.telegram.ui.Components.qr[2];
        this.f31364w0 = null;
        this.f31371x0 = new org.telegram.ui.Components.g50(this, 1);
        this.f31378y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f31218b1 = 1.0f;
        this.C1 = new a0.i();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.f31294m2 = new float[]{0.0f, 1.0f};
        this.f31322q2 = new Paint();
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
        this.f31214a5 = 0L;
        this.f31266h5 = new HashSet();
        this.f31279j5 = new org.telegram.ui.Cells.c2(this);
        this.f31286k5 = new sz0(this);
        this.A5 = new le.c(0, new dy0(this, 8), org.telegram.ui.Components.rr.h, 380L, true);
        this.G5 = new tz0(this);
        this.I5 = new uz0(this, 0);
        this.J5 = null;
        this.R5 = new SparseIntArray();
        this.T5 = null;
        this.U5 = -1;
        this.Y5 = -1.0f;
        fh.b bVar = new fh.b();
        this.f31319p6 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.q6 = cVar;
        ArrayList arrayList = new ArrayList();
        this.f31348t6 = arrayList;
        RectF rectF = new RectF();
        this.f31355u6 = rectF;
        RectF rectF2 = new RectF();
        this.f31362v6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.R = qu0Var;
        fh.c cVar2 = new fh.c();
        cVar2.a(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.f31383z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f31298m6 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.f31306n6 = dVar;
            ah.c cVar3 = new ah.c(dVar);
            this.f31313o6 = cVar3;
            cVar3.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f31298m6 = null;
            this.f31306n6 = null;
            this.f31313o6 = new ah.c(cVar2);
        }
        cVar.e = new pe.b(true);
    }

    @Override
    public final void P() {
    }
}

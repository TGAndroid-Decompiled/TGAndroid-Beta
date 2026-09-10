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
public class ProfileActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, qy, org.telegram.ui.Components.bv0, org.telegram.ui.Components.d50, org.telegram.ui.Components.tt0, eh0 {
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public final le.b A5;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public zz0 B5;
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
    public final org.telegram.ui.Components.n5[] G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final e01 G5;
    public final org.telegram.ui.Components.n5[] H;
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
    public final f01 I5;
    public final org.telegram.ui.Components.vr[] J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public float[] J5;
    public final org.telegram.ui.Components.vr[] K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public org.telegram.ui.Components.hm0 L;
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
    public org.telegram.ui.Components.jx0 P;
    public org.telegram.ui.ActionBar.w0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public MessagesController.PeerColor Q5;
    public org.telegram.ui.Components.av0 R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final SparseIntArray R5;
    public boolean S;
    public org.telegram.ui.ActionBar.w0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public int S5;
    public org.telegram.ui.Components.tw0 T;
    public org.telegram.ui.ActionBar.w0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public AnimatorSet T5;
    public t50 U;
    public org.telegram.ui.ActionBar.w0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.hj0 V;
    public org.telegram.ui.ActionBar.g1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public xz0 V4;
    public int V5;
    public org.telegram.ui.Components.hj0 W;
    public org.telegram.ui.ActionBar.g1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public org.telegram.ui.Components.s40 X;
    public org.telegram.ui.ActionBar.g1 X0;
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
    public bi.n7 Z;
    public org.telegram.ui.ActionBar.g1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public jz0 f30350a;
    public org.telegram.ui.Components.nh0 f30351a0;
    public org.telegram.ui.Components.o8 f30352a1;
    public float a2;
    public int f30353a3;
    public int f30354a4;
    public long f30355a5;
    public float f30356a6;
    public org.telegram.ui.Components.vl0 f30357b;
    public MessagesController.SavedMusicList f30358b0;
    public float f30359b1;
    public float f30360b2;
    public int f30361b3;
    public int f30362b4;
    public boolean f30363b5;
    public q11 f30364b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public lz0 f30365c;
    public org.telegram.ui.Components.fi0 f30366c0;
    public int f30367c1;
    public float f30368c2;
    public int f30369c3;
    public int f30370c4;
    public boolean f30371c5;
    public w11 f30372c6;
    public f11 d;
    public org.telegram.ui.Cells.o f30373d0;
    public s11 f30374d1;
    public float f30375d2;
    public int f30376d3;
    public int f30377d4;
    public String f30378d5;
    public bi.x4 f30379d6;
    public p11 e;
    public sz0 f30380e0;
    public long f30381e1;
    public float f30382e2;
    public int f30383e3;
    public int f30384e4;
    public String f30385e5;
    public int f30386e6;
    public final org.telegram.ui.ActionBar.l5[] f30387f;
    public AnimatorSet f30388f0;
    public long f30389f1;
    public float f30390f2;
    public int f30391f3;
    public int f30392f4;
    public String f30393f5;
    public Boolean f30394f6;
    public org.telegram.ui.Cells.y3 f30395g0;
    public long f30396g1;
    public float f30397g2;
    public int f30398g3;
    public int f30399g4;
    public org.telegram.ui.Components.eh f30400g5;
    public TLRPC.TL_emojiStatusCollectible f30401g6;
    public String h;
    public ImageView f30402h0;
    public boolean f30403h1;
    public float f30404h2;
    public int f30405h3;
    public int f30406h4;
    public final HashSet f30407h5;
    public int f30408h6;
    public ImageView f30409i0;
    public long f30410i1;
    public float f30411i2;
    public int f30412i3;
    public int f30413i4;
    public CharacterStyle f30414i5;
    public boolean f30415i6;
    public ImageView f30416j0;
    public boolean f30417j1;
    public ValueAnimator f30418j2;
    public int j3;
    public int f30419j4;
    public final org.telegram.ui.Cells.c2 f30420j5;
    public int f30421j6;
    public ImageView f30422k0;
    public boolean f30423k1;
    public float f30424k2;
    public int f30425k3;
    public int f30426k4;
    public final d01 f30427k5;
    public int f30428k6;
    public org.telegram.ui.Components.j21 f30429l0;
    public boolean l1;
    public float f30430l2;
    public int f30431l3;
    public int l4;
    public boolean f30432l5;
    public int f30433l6;
    public org.telegram.ui.Components.ph0 m0;
    public long f30434m1;
    public final float[] f30435m2;
    public int f30436m3;
    public int f30437m4;
    public p01 f30438m5;
    public final zg.e f30439m6;
    public String f30440n;
    public tz0 f30441n0;
    public boolean f30442n1;
    public boolean f30443n2;
    public int f30444n3;
    public int f30445n4;
    public float f30446n5;
    public final eh.d f30447n6;
    public i11 f30448o0;
    public boolean f30449o1;
    public boolean f30450o2;
    public int f30451o3;
    public int f30452o4;
    public float f30453o5;
    public final zg.a f30454o6;
    public org.telegram.ui.Components.g9 f30455p0;
    public boolean f30456p1;
    public boolean f30457p2;
    public int f30458p3;
    public int f30459p4;
    public boolean p5;
    public final eh.b f30460p6;
    public org.telegram.ui.Components.e50 f30461q0;
    public boolean f30462q1;
    public final Paint f30463q2;
    public int f30464q3;
    public int f30465q4;
    public boolean f30466q5;
    public final zg.a q6;
    public final org.telegram.ui.ActionBar.l5[] f30467r;
    public int f30468r0;
    public boolean f30469r1;
    public boolean f30470r2;
    public int f30471r3;
    public int f30472r4;
    public ImageReceiver f30473r5;
    public gh.k f30474r6;
    public org.telegram.ui.Components.mo0 f30475s;
    public org.telegram.ui.Components.j21 f30476s0;
    public boolean f30477s1;
    public di.z0 f30478s2;
    public int f30479s3;
    public int f30480s4;
    public FrameLayout f30481s5;
    public xy0 f30482s6;
    public org.telegram.ui.Components.ci0 f30483t0;
    public boolean f30484t1;
    public di.u f30485t2;
    public int f30486t3;
    public int f30487t4;
    public FrameLayout[] f30488t5;
    public final ArrayList f30489t6;
    public vz0 f30490u0;
    public int f30491u1;
    public TLRPC.ChatFull f30492u2;
    public int f30493u3;
    public int f30494u4;
    public SpannableStringBuilder f30495u5;
    public final RectF f30496u6;
    public org.telegram.ui.Components.kj0 v;
    public xh.g0 f30497v0;
    public boolean f30498v1;
    public TLRPC.UserFull f30499v2;
    public int f30500v3;
    public int f30501v4;
    public SpannableStringBuilder f30502v5;
    public final RectF f30503v6;
    public AnimatorSet f30504w;
    public View f30505w0;
    public boolean f30506w1;
    public org.telegram.ui.Cells.h6 f30507w2;
    public int f30508w3;
    public int f30509w4;
    public bi.d[] f30510w5;
    public Drawable f30511x;
    public final org.telegram.ui.Components.p50 f30512x0;
    public boolean f30513x1;
    public boolean f30514x2;
    public int f30515x3;
    public int f30516x4;
    public org.telegram.messenger.a9 f30517x5;
    public final Drawable[] f30518y;
    public final Paint f30519y0;
    public int f30520y1;
    public t11 f30521y2;
    public int y3;
    public int f30522y4;
    public FrameLayout f30523y5;
    public org.telegram.ui.ActionBar.f6 f30524z0;
    public boolean f30525z1;
    public CharSequence f30526z2;
    public int f30527z3;
    public int f30528z4;
    public bi.d f30529z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f7;
        RectF rectF = profileActivity.f30503v6;
        zg.e eVar = profileActivity.f30439m6;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f30433l6) - AndroidUtilities.dp(8.0f);
            profileActivity.f30496u6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            eVar.g(2, profileActivity.f30489t6);
            eVar.e(profileActivity.f30482s6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.iv0.w0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.f30408h6 && w02 == profileActivity.f30415i6) {
            return;
        }
        profileActivity.f30408h6 = i10;
        profileActivity.f30415i6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f30510w5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f30510w5[0].g(profileActivity.f30502v5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f30510w5[0].g(profileActivity.f30495u5, true, true);
        } else {
            profileActivity.f30510w5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        f10 f10Var = new f10(9);
        f10Var.f32668n = str;
        if (f10Var.f32666c != null) {
            f10Var.f32666c = null;
            f10Var.a();
        }
        f10Var.f32667f = i10;
        spannableStringBuilder.setSpan(f10Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        xh.g0 g0Var = profileActivity.f30497v0;
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
        profileActivity.f30357b.setTranslationY(f11);
        profileActivity.f30357b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f30350a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f30387f[1].setVisibility(0);
        l5VarArr[1].setVisibility(0);
        l5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.U1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        lVar.v(z11);
        int i11 = 8;
        if (profileActivity.U1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.U1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f30357b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new g01(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        d2Var.f17621g0 = false;
        d2Var.show();
        Utilities.globalQueue.postRunnable(new cm0(d2Var, z10, activity, 6));
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

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.l5 l5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.n5[] n5VarArr = profileActivity.G;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            nf.f.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        qg.m1 m1Var = new qg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f30524z0);
        l5Var.getLocationOnScreen(new int[2]);
        m1Var.f40832v0 = l5Var.f18430h0;
        m1Var.f40833w0 = l5Var.f18431i0;
        m1Var.f40836z0 = l5Var.getScaleX();
        m1Var.f40834x0 = l5Var.getLeft();
        m1Var.f40835y0 = l5Var.getTop();
        m1Var.A0 = l5Var;
        Drawable rightDrawable = l5Var.getRightDrawable();
        org.telegram.ui.Components.n5 n5Var = n5VarArr[1];
        if (rightDrawable == n5Var && n5Var != null) {
            Drawable drawable = n5Var.f25412f[0];
            if (drawable instanceof org.telegram.ui.Components.p5) {
                m1Var.f40836z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.p5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
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
                    if (((org.telegram.ui.Components.p5) n5VarArr[1].f25412f[0]).c()) {
                        w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, profileActivity.f30524z0), PorterDuff.Mode.SRC_IN));
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

    public static void V(ProfileActivity profileActivity) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
        jz0 jz0Var = profileActivity.f30350a;
        if (jz0Var != null) {
            int childCount = jz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f30350a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.bb) {
                    ((org.telegram.ui.Cells.bb) childAt).j(0);
                }
            }
            profileActivity.f30350a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, profileActivity.f30524z0));
        }
        if (!profileActivity.f30457p2) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
            if (l5Var != null) {
                Object tag = l5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        l5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(((Integer) tag).intValue(), profileActivity.f30524z0), Boolean.valueOf(profileActivity.J0[0])));
                    } else {
                        l5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, profileActivity.f30524z0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f30511x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.Q5 != null) {
                    v03 = -1;
                } else {
                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18149pc, profileActivity.f30524z0);
                }
                drawable.setColorFilter(v03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.hm0 hm0Var = profileActivity.L;
            if (hm0Var != null) {
                hm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18001h8, profileActivity.f30524z0));
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = profileActivity.f30387f[1];
            if (l5Var2 != null) {
                l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18263vh, profileActivity.f30524z0));
            }
            org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
            if (lVar != null) {
                if (profileActivity.Q5 == null) {
                    i12 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, profileActivity.f30524z0);
                }
                lVar.C(i12, false);
                org.telegram.ui.ActionBar.l lVar2 = profileActivity.actionBar;
                if (profileActivity.Q5 != null) {
                    v02 = 553648127;
                } else {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17965f8, profileActivity.f30524z0);
                }
                lVar2.A(v02, false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z10;
        float f7;
        float min = Math.min(profileActivity.f30368c2, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f30462q1) {
            profileActivity.f30483t0.setAlpha(1.0f - min);
            profileActivity.f30483t0.setBlurIntensity(0.0f);
            profileActivity.f30483t0.setGooeyEnabled(false);
        } else {
            profileActivity.f30483t0.setPullProgress(profileActivity.f30368c2);
            profileActivity.f30483t0.setBlurIntensity(Math.min((w7.q.a(profileActivity.f30368c2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.ci0 ci0Var = profileActivity.f30483t0;
            float f10 = profileActivity.f30368c2;
            if (f10 > 0.0f && f10 < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ci0Var.setGooeyEnabled(z10);
        }
        vz0 vz0Var = profileActivity.f30490u0;
        if (vz0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.f30368c2;
            if (f11 > 0.0f) {
                f7 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f));
            } else {
                f7 = 1.0f;
            }
            vz0Var.setAlpha(f7);
        }
        org.telegram.ui.Components.ci0 ci0Var2 = profileActivity.f30483t0;
        if (profileActivity.f30368c2 >= 1.0f) {
            i10 = 8;
        }
        ci0Var2.setVisibility(i10);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f26081j = 5000;
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
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f17528a);
                return;
            }
            return;
        }
        org.telegram.messenger.a2.o(R.string.UnknownError, org.telegram.ui.Components.wc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f30462q1;
                if (z10) {
                    if (z10) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f30381e1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f30389f1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f30389f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f30389f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new eo(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f30389f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new eo(bundle2), false);
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
                profileActivity.r4(profileActivity.f30351a0, f7, f10, true);
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
                h41.L(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(profileActivity.getParentActivity(), 3, profileActivity.f30524z0);
                d2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new m4.q0(8, profileActivity, d2Var), true, profileActivity.f30524z0);
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
                    org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(profileActivity, profileActivity.f30351a0);
                    H.f28704w = false;
                    H.f28683i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new yb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ql0(currentUser, 27), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new yb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.f30351a0.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new k91(null));
                return;
            default:
                return;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + profileActivity.f30410i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.q80.f26337r;
        org.telegram.ui.Components.q80.w(parentActivity, profileActivity, org.telegram.ui.Components.wc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.j5();
            f11 f11Var = profileActivity.d;
            if (f11Var != null) {
                f11Var.l();
            }
        }
        if (p2Var instanceof eo) {
            ((eo) p2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.pc h;
        if (profileActivity.J2 == null) {
            if (profileActivity.f30462q1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f30389f1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f17247id == profileActivity.f30396g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j3 = tL_forumTopic.icon_emoji_id;
                        if (j3 != 0 && (f7 = org.telegram.ui.Components.p5.f(profileActivity.currentAccount, j3)) != null && (h = org.telegram.ui.Components.wc.a0(profileActivity).h(f7, 1, new ez0(profileActivity, 0))) != null) {
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
        f11 f11Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f30350a.B0();
        if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f30381e1));
            TLRPC.UserFull userFull = profileActivity.f30499v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                xh.p.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f30381e1, new lu(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new di.m(profileActivity.f30381e1));
            }
        } else if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j3, profileActivity.f30396g1);
            profileActivity.getNotificationsController().muteDialog(j3, profileActivity.f30396g1, z10);
            org.telegram.ui.Components.wc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.Q3;
            if (i11 < 0 || (f11Var = profileActivity.d) == null) {
                return;
            }
            f11Var.m(i11);
        } else if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f30381e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f17342id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f30378d5);
            bundle.putString("first_name_card", profileActivity.f30385e5);
            bundle.putString("last_name_card", profileActivity.f30393f5);
            ts tsVar = new ts(bundle, profileActivity.f30524z0);
            tsVar.O = new oy0(profileActivity, user3);
            profileActivity.presentFragment(tsVar);
        } else if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.d5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new ez0(profileActivity, 1), profileActivity.f30524z0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        } else if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f30524z0);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.f30355a5));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.f30524z0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], w7.a6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new x20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new fz0(0, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(2));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        } else if (i10 == profileActivity.f30472r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f30410i1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.p2(bundle2));
        } else if (i10 == profileActivity.f30465q4) {
            profileActivity.showDialog(org.telegram.ui.Components.d5.V(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.f30524z0).f17528a);
        } else if (i10 == profileActivity.N3) {
            profileActivity.r4(view, f7, f10, false);
        } else if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f30381e1);
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.f30354a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.U3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.V3) {
            h41.L(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f30494u4 && i10 < profileActivity.f30501v4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = profileActivity.f30492u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.f30494u4)).intValue());
            } else {
                chatParticipant = profileActivity.f30492u2.participants.participants.get(i10 - profileActivity.f30494u4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f30509w4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.L3) {
            profileActivity.C4(f7, f10, i10, view);
        } else if (i10 == profileActivity.l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new ei.k0(profileActivity, profileActivity.E2.linked_community_id, null, null));
            } else if (profileActivity.f30381e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f30381e1))) == null) {
            } else {
                profileActivity.showDialog(new ei.k0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.I3) {
            if (profileActivity.f30492u2.location instanceof TLRPC.TL_channelLocation) {
                id0 id0Var = new id0(5);
                id0Var.f33621e0 = -profileActivity.f30389f1;
                id0Var.f33648z0 = (TLRPC.TL_channelLocation) profileActivity.f30492u2.location;
                profileActivity.presentFragment(id0Var);
            }
        } else if (i10 == profileActivity.L4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f30516x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f30389f1);
            bundle3.putInt("type", 2);
            wr wrVar = new wr(bundle3);
            wrVar.x0(profileActivity.f30492u2);
            profileActivity.presentFragment(wrVar);
        } else if (i10 == profileActivity.f30522y4) {
            profileActivity.presentFragment(new ai0(profileActivity.f30389f1));
        } else if (i10 == profileActivity.f30528z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f30389f1);
            bundle4.putInt("type", 1);
            wr wrVar2 = new wr(bundle4);
            wrVar2.x0(profileActivity.f30492u2);
            profileActivity.presentFragment(wrVar2);
        } else if (i10 == profileActivity.A4) {
            profileActivity.S0.performClick();
        } else if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new xh.h(0, profileActivity.f30381e1));
        } else if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new xh.h(1, profileActivity.f30381e1));
        } else if (i10 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f30389f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new fb1(bundle5));
        } else if (i10 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f30389f1);
            bundle6.putInt("type", 0);
            wr wrVar3 = new wr(bundle6);
            wrVar3.x0(profileActivity.f30492u2);
            profileActivity.presentFragment(wrVar3);
        } else if (i10 == profileActivity.f30391f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f30405h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f30412i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f30425k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f30436m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f30431l3) {
            profileActivity.presentFragment(new nc0());
        } else if (i10 == profileActivity.f30444n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f30464q3) {
            profileActivity.showDialog(org.telegram.ui.Components.d5.U(profileActivity, profileActivity.f30524z0));
        } else if (i10 == profileActivity.f30471r3) {
            nf.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f30479s3) {
            nf.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f30500v3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f30508w3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f30515x3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f30524z0);
            alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new ny0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f17528a);
        } else if (i10 == profileActivity.f30398g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new ra(null));
        } else if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new h(3));
        } else if (i10 == profileActivity.O2) {
            profileActivity.u4();
        } else if (i10 == profileActivity.f30370c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f30377d4) {
            profileActivity.presentFragment(new xh.z7());
        } else if (i10 == profileActivity.f30384e4) {
            profileActivity.presentFragment(new ci.j());
        } else if (i10 == profileActivity.f30392f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f30399g4) {
            sg.p1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            di.z0 z0Var = profileActivity.f30478s2;
            if (z0Var != null) {
                z0Var.m(!z0Var.g(), new ey0(8, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            di.u uVar = profileActivity.f30485t2;
            if (uVar != null) {
                uVar.f6931f = true;
                uVar.e = !uVar.e;
                uVar.k();
                ((org.telegram.ui.Cells.s8) view).setChecked(profileActivity.f30485t2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setChecked(!s8Var.b());
            if (profileActivity.f30452o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f30452o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f30381e1);
            boolean b10 = s8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f30499v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new rg0(10, profileActivity, r0));
            profileActivity.f30452o4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.O3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i12 = profileActivity.U5;
            if (i12 >= 0) {
                profileActivity.f30365c.h1(i12, profileActivity.V5 - profileActivity.f30350a.getPaddingTop());
            }
        } else if (i10 == profileActivity.P3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.Q2) {
            if (profileActivity.f30499v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f30499v2.personal_channel_id);
            profileActivity.presentFragment(new eo(bundle7));
        } else if (i10 == profileActivity.U2) {
            w11 w11Var = profileActivity.f30372c6;
            if ((w11Var == null || !w11Var.a()) && !profileActivity.J3(i10, view)) {
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
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f30381e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.f30355a5);
        tL_messages_reportReaction.f17301id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new bi.g1(4));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.f30355a5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f30381e1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.wc.a0(profileActivity).E(profileActivity.f30524z0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f30380e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f30455p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.j5();
                f11 f11Var = profileActivity.d;
                if (f11Var != null) {
                    f11Var.l();
                }
                profileActivity.k4(true);
            }
            tz0 tz0Var = profileActivity.f30441n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            tz0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
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
            profileActivity.S5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new rg0(12, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.f30381e1;
        if (j3 == 0) {
            long j10 = profileActivity.f30389f1;
            if (j10 != 0) {
                j3 = -j10;
            } else {
                j3 = profileActivity.f30410i1;
            }
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.f30355a5, j11);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.f30355a5, j11, profileActivity.Z4);
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(profileActivity.getParentActivity(), profileActivity.f30524z0);
        xbVar.d(R.raw.chats_infotip, new String[0]);
        xbVar.f29000b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.wc.a0(profileActivity).b(xbVar, 1500).j();
    }

    public static void f0(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f30358b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.f30358b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f30358b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f30499v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.f30358b0.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.f30358b0 && MediaController.getInstance().isPlayingMessage(profileActivity.f30358b0.list.get(0))) {
                z10 = true;
            } else {
                MediaController.getInstance().cleanup();
                z10 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.f30358b0;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.f30358b0.list);
            if (!z10) {
                MediaController.getInstance().playMessage(profileActivity.f30358b0.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.j8(profileActivity.getParentActivity(), profileActivity.f30524z0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ic0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new yb0(profileActivity, 18), profileActivity.f30524z0);
    }

    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        LinearLayout linearLayout;
        int i10;
        int v02;
        boolean z11;
        long j3;
        Object[] objArr;
        char c10;
        final u3 u3Var;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f30499v2;
        if (userFull != null && userFull.stars_rating != null) {
            ?? r62 = 0;
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
            h3Var.fixNavigationBar();
            runnable = h3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f30524z0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView, w7.a6.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, w7.a6.t(-1, -2, 17, 40, -12, 40, 20));
                org.telegram.ui.Components.m90[] m90VarArr = new org.telegram.ui.Components.m90[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(parentActivity, 3, r62);
                    m90VarArr[i11] = wbVar;
                    wbVar.setGravity(17);
                    m90VarArr[i11].setTextSize(1, 12.0f);
                    m90VarArr[i11].setTextColor(org.telegram.ui.ActionBar.j6.w0(r62, org.telegram.ui.ActionBar.j6.f18306y6, false));
                    m90VarArr[i11].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(r62, org.telegram.ui.ActionBar.j6.gc, false));
                    frameLayout.addView(m90VarArr[i11], w7.a6.e(-1, -1, 119));
                    org.telegram.ui.Components.m90 m90Var = m90VarArr[i11];
                    if (i11 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    m90Var.setAlpha(f7);
                    org.telegram.ui.Components.m90 m90Var2 = m90VarArr[i11];
                    if (i11 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    m90Var2.setScaleX(f10);
                    org.telegram.ui.Components.m90 m90Var3 = m90VarArr[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    m90Var3.setScaleY(f11);
                    i11++;
                    r62 = 0;
                }
                u3 u3Var2 = new u3(m90VarArr, 17);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j10 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                boolean z12 = z11;
                if (tl_starsRating != null) {
                    j3 = tl_starsRating.stars - j10;
                } else {
                    j3 = 0;
                }
                long j11 = (-j10) - j3;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j12 = userFull.stars_my_pending_rating.stars;
                linearLayout = linearLayout2;
                long j13 = userFull.stars_rating.stars;
                long j14 = j12 - j13;
                if ((j13 < 0 && !z12) || (z12 && j11 > 0)) {
                    objArr = m90VarArr;
                    c10 = 0;
                    m90VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                    if (z12) {
                        objArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                        u3Var = u3Var2;
                    } else {
                        objArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                        u3Var = u3Var2;
                        c10 = 0;
                    }
                } else {
                    objArr = m90VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    c10 = 0;
                    spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", max), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14)));
                    spannableStringBuilder.append((CharSequence) " ");
                    u3Var = u3Var2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    u3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    u3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    objArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    u3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    u3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
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
                                u3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                u3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                linearLayout = linearLayout2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.StarRatingTitle));
            textView.setTextSize(1, 20.0f);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f30524z0));
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.f17343id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.a2.n(R.string.StarRatingSelfDescription, textView2);
                i10 = 1;
            } else {
                i10 = 1;
                org.telegram.messenger.em.p(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
            }
            textView2.setTextSize(i10, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f30524z0));
            linearLayout3.addView(textView2, w7.a6.t(-1, -2, 17, 20, 0, 20, 12));
            ww0 ww0Var = new ww0(parentActivity, profileActivity.f30524z0);
            ww0Var.f38396a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i14 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i15 = org.telegram.ui.ActionBar.j6.Oh;
            ww0Var.f38397b.setText(LocaleController.formatSpannable(i14, G3(org.telegram.ui.ActionBar.j6.v0(i15, profileActivity.f30524z0), string)));
            ww0Var.d.setVisibility(8);
            int i16 = R.drawable.menu_gift;
            ImageView imageView = ww0Var.f38398c;
            imageView.setImageResource(i16);
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f30524z0));
            linearLayout3.addView(ww0Var, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var2 = new ww0(parentActivity, profileActivity.f30524z0);
            ww0Var2.f38396a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            ww0Var2.f38397b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.j6.v0(i15, profileActivity.f30524z0), LocaleController.getString(R.string.StarRatingAdded))));
            ww0Var2.d.setVisibility(8);
            int i17 = R.drawable.menu_stars_gift;
            ImageView imageView2 = ww0Var2.f38398c;
            imageView2.setImageResource(i17);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f30524z0));
            linearLayout3.addView(ww0Var2, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var3 = new ww0(parentActivity, profileActivity.f30524z0);
            ww0Var3.f38396a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i18 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                v02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18091m6, profileActivity.f30524z0), -16777216);
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, profileActivity.f30524z0);
            }
            ww0Var3.f38397b.setText(LocaleController.formatSpannable(i18, G3(v02, string2)));
            ww0Var3.d.setVisibility(8);
            int i19 = R.drawable.menu_refund;
            ImageView imageView3 = ww0Var3.f38398c;
            imageView3.setImageResource(i19);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, profileActivity.f30524z0));
            linearLayout3.addView(ww0Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            bi.d dVar = new bi.d(parentActivity, profileActivity.f30524z0, true);
            dVar.setOnClickListener(new dz0(0, runnable));
            dVar.g(xh.x3.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, w7.a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h3Var.customView = linearLayout3;
            h3Var.show();
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
            if (!profileActivity.f30443n2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f30350a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f30350a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    f11 f11Var = profileActivity.d;
                    if (i12 >= f11Var.e.N2) {
                        break;
                    }
                    s4.c1 g10 = f11Var.g(null, f11Var.j(i12));
                    View view = g10.f41610a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                jz0 jz0Var = profileActivity.f30350a;
                jz0Var.setPadding(0, jz0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f30350a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f30418j2.cancel();
                float[] fArr = profileActivity.f30435m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.Q1 = profileActivity.T3();
            }
        }
        profileActivity.M.m(profileActivity.f30410i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            di.h4.G0(context, profileActivity.currentAccount, profileActivity.f30499v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f30524z0, false);
        } else {
            di.h4.H0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.f30524z0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
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
        profileActivity.f30357b.setTranslationY(floatValue * f7);
        profileActivity.P.setTranslationY(f7 * profileActivity.U1);
        profileActivity.f30350a.setTranslationY((1.0f - profileActivity.U1) * f12);
        profileActivity.f30350a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f30350a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f30350a.setAlpha(profileActivity.U1);
        boolean z11 = true;
        profileActivity.k4(true);
        profileActivity.f30350a.setAlpha(f10);
        profileActivity.f30357b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.f30357b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.f30357b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.f30380e0.setAlpha(f10);
        vz0 vz0Var = profileActivity.f30490u0;
        if (vz0Var != null) {
            vz0Var.setAlpha(f10);
        }
        profileActivity.f30387f[1].setAlpha(f10);
        l5VarArr[1].setAlpha(f10);
        l5VarArr[3].setAlpha(f10);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
            if (w0Var.F.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
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
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.T0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i11);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i11);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.U1 >= 0.5f) {
            z11 = false;
        }
        lVar.v(z11);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.T0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.f30374d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.n01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f30524z0);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f17219id;
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
                String n10 = a4.a.n(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f17342id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f30381e1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f30443n2 && profileActivity.f30380e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f30450o2 = z10;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        tz0 tz0Var = profileActivity.f30441n0;
        tz0Var.H0 = true;
        tz0Var.K0 = profileActivity.K2;
        tz0Var.f29344q1 = null;
        tz0Var.f29345r1 = null;
        tz0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30387f;
        org.telegram.ui.ActionBar.l5[] l5VarArr2 = profileActivity.f30467r;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f30350a.setVisibility(i10);
        org.telegram.ui.Components.vl0 vl0Var = profileActivity.f30357b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        vl0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        xh.g0 g0Var = profileActivity.f30497v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.Y.setVisibility(i10);
        vz0 vz0Var = profileActivity.f30490u0;
        if (vz0Var != null) {
            vz0Var.setVisibility(i10);
        }
        l5VarArr[1].setVisibility(i10);
        l5VarArr2[1].setVisibility(i10);
        l5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.f30380e0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        vz0 vz0Var2 = profileActivity.f30490u0;
        if (vz0Var2 != null) {
            vz0Var2.setAlpha(1.0f);
        }
        xh.g0 g0Var2 = profileActivity.f30497v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        l5VarArr[1].setAlpha(1.0f);
        l5VarArr2[1].setAlpha(1.0f);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f30350a.setAlpha(1.0f);
        profileActivity.f30357b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f30357b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f30380e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.d71) {
            profileActivity.f30380e0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
            profileActivity.f30380e0.u(null, null, c6Var);
            if (z10) {
                c6Var.f(profileActivity.f30380e0);
            }
        } else {
            ImageLocation D = profileActivity.f30441n0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f30380e0.u(D, str, drawable);
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
        if (this.f30350a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f30350a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f30350a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    c1Var = null;
                    if (i11 < this.f30350a.getChildCount()) {
                        if (RecyclerView.R(this.f30350a.getChildAt(i11)) == 0) {
                            view = this.f30350a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    jz0 jz0Var = this.f30350a;
                    View F = jz0Var.F(view);
                    if (F != null) {
                        c1Var = jz0Var.T(F);
                    }
                    c1Var = (org.telegram.ui.Components.fl0) c1Var;
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
                if (this.f30461q0 == null && this.actionBar.f18389n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) this.f30350a.K(i12);
                    if (fl0Var != null && fl0Var.f41610a.getTop() <= 0) {
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
                    org.telegram.ui.ActionBar.w0 searchItem = this.O.getSearchItem();
                    org.telegram.ui.Components.kj0 searchOptionsItem = this.O.getSearchOptionsItem();
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
                        if (r01Var.s0(r01Var.f24107k0[0].F)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        r01 r01Var2 = this.O;
                        int i13 = r01Var2.f24107k0[0].F;
                        if (i13 != 0 && !org.telegram.ui.Components.iv0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || r01Var2.V == null)) {
                            this.O.f24121r0.setVisibility(4);
                            this.O.A(false, false);
                        } else {
                            this.O.f24121r0.setVisibility(0);
                            this.O.A(true, false);
                        }
                    }
                    l5(false);
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null) {
                        lVar.n().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                    Property property = View.ALPHA;
                    float f22 = 1.0f;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f7));
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.R0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f10));
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.T0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var3, property, f11));
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.S0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f12));
                    org.telegram.ui.ActionBar.w0 w0Var5 = this.Q0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var5, property2, f13));
                    org.telegram.ui.ActionBar.w0 w0Var6 = this.R0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var6, property2, f14));
                    org.telegram.ui.ActionBar.w0 w0Var7 = this.T0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var7, property2, f15));
                    org.telegram.ui.ActionBar.w0 w0Var8 = this.S0;
                    if (z10) {
                        f16 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var8, property2, f16));
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
                    ImageView imageView = this.O.f24121r0;
                    if (z10) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f18));
                    ImageView imageView2 = this.O.f24121r0;
                    if (z10) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(10.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, dp2));
                    org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                    if (z10) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(lVar2, this.G5, f19));
                    org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30467r;
                    org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, property, f20));
                    this.O.I0.setOpen(z10);
                    if (this.f30477s1) {
                        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[3];
                        if (z10) {
                            f21 = 0.0f;
                        } else {
                            f21 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(l5Var2, property, f21));
                    }
                    org.telegram.ui.Components.mo0 mo0Var = this.f30475s;
                    if (!z10) {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(mo0Var, property, f22));
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f30420j5, 0.0f));
                    }
                    if (this.f30490u0 != null || this.f30497v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new sy0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.C5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.C5.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    this.C5.addListener(new org.telegram.ui.Components.vv0(9, this, searchItem));
                    this.C5.setDuration(150L);
                    this.C5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f23 = top;
                if (this.Q1 != f23 && !this.H1) {
                    this.Q1 = f23;
                    this.f30374d1.invalidate();
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
        a01 a01Var = new a01(this, user.f17342id, this.f30389f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        a01Var.X0 = new b01(this, i10, chatParticipant, z10, zArr);
        presentFragment(a01Var);
    }

    public final void B3() {
        float alpha;
        int i10 = this.J1;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30467r;
        if (i10 == 1 && (!this.f30432l5 || this.G1)) {
            this.Y5 = 0.0f;
        } else if (i10 == 2 && (!this.f30432l5 || this.G1)) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
            if (l5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = l5Var.getAlpha();
            }
            this.Y5 = alpha;
        } else if (this.f30381e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.Y5 = (1.0f - this.f30446n5) * this.f30424k2;
        } else {
            this.Y5 = this.f30424k2 * this.f30446n5;
        }
        if (this.f30381e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.p5) {
                this.f30453o5 = AndroidUtilities.dp(28.0f) * this.Y5;
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[2];
                if (l5Var2 != null) {
                    l5Var2.setAlpha(this.f30424k2);
                    l5VarArr[3].setAlpha(1.0f - this.f30424k2);
                    l5VarArr[1].setTranslationX(W3(this.Z5));
                    this.Z.invalidate();
                    q11 q11Var = this.f30364b6;
                    if (q11Var != null) {
                        q11Var.e = 1.0f - this.f30424k2;
                        q11Var.invalidateSelf();
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
            q11 q11Var2 = this.f30364b6;
            if (q11Var2 != null) {
                q11Var2.e = 1.0f;
                q11Var2.invalidateSelf();
            }
        } else if (this.f30466q5) {
            org.telegram.ui.ActionBar.l5 l5Var4 = l5VarArr[2];
            if (l5Var4 != null) {
                l5Var4.setAlpha(this.Y5);
            }
            q11 q11Var3 = this.f30364b6;
            if (q11Var3 != null) {
                q11Var3.e = 1.0f - this.Y5;
                q11Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.l5 l5Var5 = l5VarArr[2];
            if (l5Var5 != null) {
                l5Var5.setAlpha(0.0f);
            }
            q11 q11Var4 = this.f30364b6;
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (p2Var instanceof eo) {
                    finishFragment();
                    ((eo) p2Var).Y.a1(null, str, false, false);
                }
            }
        } else {
            wy wyVar = new wy(null);
            wyVar.f38476n2 = str;
            presentFragment(wyVar);
        }
    }

    @Override
    public final void C(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.f30395g0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
        this.f30441n0.O(this.K2, f7);
    }

    public final void C3() {
        boolean z10;
        org.telegram.ui.Components.tw0 tw0Var = this.T;
        if (tw0Var != null) {
            if (!this.F5 && this.H5) {
                z10 = true;
            } else {
                z10 = false;
            }
            tw0Var.setVisibility(z10);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void D() {
        G4(false);
    }

    public final void D3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f30457p2 && (valueAnimator = this.f30418j2) != null && valueAnimator.isRunning()) {
            this.f30382e2 = this.K5;
            this.f30397g2 = this.L5;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        E4(y3(), currentActionBarHeight + i10);
    }

    public final void E3(Context context) {
        int i10;
        this.f30352a1 = new org.telegram.ui.Components.o8(context, this.T0.getPopupLayout().getSwipeBack(), new iz0(this), false, 0, this.f30524z0);
        if (this.f30410i1 > 0 || this.f30381e1 > 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, this.f30524z0);
            org.telegram.ui.Components.o8 o8Var = this.f30352a1;
            org.telegram.ui.Components.m90 m90Var = o8Var.e;
            if (m90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.rg(o8Var, 10)));
                m90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f30499v2;
        if (userFull == null && this.f30492u2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f30492u2.ttl_period;
        }
        org.telegram.ui.Components.j21 a2 = org.telegram.ui.Components.j21.a(i10);
        this.f30476s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.f30352a1.f25692a);
        this.T0.a(-1);
        T4();
    }

    public final void E4(float f7, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - T3()) / ((this.f30350a.getMeasuredWidth() - f10) - U3())));
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
        float currentActionBarHeight = (1.0f + f7) * (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f);
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (AndroidUtilities.density * 21.0f))));
        this.f30382e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f30397g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView != null && this.X5 && this.f30521y2 != null && getParentActivity() != null) {
            w11 w11Var = this.f30372c6;
            if (w11Var != null) {
                w11Var.b(this.f30521y2);
                this.f30372c6.invalidate();
                return;
            }
            w11 w11Var2 = new w11(this, this.f30521y2);
            this.f30372c6 = w11Var2;
            ((FrameLayout) this.fragmentView).addView(w11Var2, w7.a6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        jz0 jz0Var = this.f30350a;
        if (jz0Var != null && this.f30365c != null && jz0Var.getChildCount() > 0 && !this.W5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f30350a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f30350a.getChildAt(i12));
                View childAt = this.f30350a.getChildAt(i12);
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
                if (this.U5 == 0 && !this.f30450o2 && top > T3()) {
                    this.V5 = T3();
                }
                this.f30365c.h1(i11, view.getTop() - this.f30350a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (z10) {
                ii.o oVar = new ii.o(getParentActivity(), 2, 0.6f);
                oVar.f41760a = this.J4;
                oVar.f10694p = -this.f30350a.getPaddingTop();
                this.f30365c.w0(oVar);
                return;
            }
            this.f30365c.h1(i10, -this.f30350a.getPaddingTop());
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
            ofFloat = ValueAnimator.ofFloat(this.f30512x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new sy0(this, 1));
        this.T5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.T5;
        if (z10) {
            j3 = 150;
        } else {
            j3 = 220;
        }
        animatorSet2.setDuration(j3);
        if (!z10) {
            this.T5.addListener(new f01(this, 4));
        }
        this.T5.start();
    }

    public final void I3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
        H.W(this.f30350a.U0(view, false));
        H.f28704w = false;
        if (this.f30499v2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yb0(this, 25), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new yb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.zd(this, i10, 22), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
        if (nh0Var != null) {
            if (this.f30477s1) {
                nh0Var.H = 6;
            } else if (this.f30462q1) {
                nh0Var.H = 5;
            } else if (this.f30470r2) {
                nh0Var.H = 2;
            } else if (this.f30381e1 != 0) {
                nh0Var.H = 0;
            } else if (this.f30389f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f30389f1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.f30351a0.H = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.f30351a0.H = 4;
                        return;
                    } else {
                        this.f30351a0.H = 1;
                        return;
                    }
                }
                this.f30351a0.H = 3;
            }
        }
    }

    @Override
    public final boolean J(wy wyVar) {
        return false;
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f30477s1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f30499v2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f17342id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.O3) {
                        str = gg.m1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
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
                        str = UserInfoActivity.Z(this.f30499v2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
                H.W(this.f30350a.U0(view, false));
                H.f28704w = false;
                H.f28683i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new yb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new yb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new ql0(str, 25), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new yb0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f36490b;

                        {
                            this.f36490b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f36490b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wy0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new wy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f17528a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f36490b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new wy0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new wy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f17528a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new yb0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f36490b;

                        {
                            this.f36490b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f36490b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new wy0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new wy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f17528a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f36490b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new wy0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new wy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f17528a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new yb0(this, 10), false);
                } else if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.G3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new yb0(this, 12), false);
                    } else if (i10 == this.U2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f36154b;

                            {
                                this.f36154b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f36154b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.d5.m(parentActivity, string2, string3, userFull2.birthday, new nj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.f30524z0).f17571a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity3, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f17528a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f17528a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f36154b;

                            {
                                this.f36154b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f36154b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.d5.m(parentActivity, string2, string3, userFull2.birthday, new nj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.f30524z0).f17571a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f17528a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f17528a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.Q2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new ey0(4, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new yb0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f36154b;

                            {
                                this.f36154b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f36154b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.d5.m(parentActivity, string2, string3, userFull2.birthday, new nj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.f30524z0).f17571a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f17528a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f36154b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() {
                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new wy0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new wy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f17528a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new yb0(this, 11), false);
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
        org.telegram.ui.Cells.y3 y3Var = this.f30395g0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final boolean K3() {
        s4.c1 c1Var;
        View view;
        if ((this.I0 || (!AndroidUtilities.isTablet() && !this.f30443n2)) && this.f30380e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.F0 = true;
            this.f30450o2 = true;
            int i10 = 0;
            while (true) {
                c1Var = null;
                if (i10 < this.f30350a.getChildCount()) {
                    if (RecyclerView.R(this.f30350a.getChildAt(i10)) == 0) {
                        view = this.f30350a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                jz0 jz0Var = this.f30350a;
                View F = jz0Var.F(view);
                if (F != null) {
                    c1Var = jz0Var.T(F);
                }
                if (c1Var != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(c1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f30350a.v0(0, -(((this.f30350a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.wr.h);
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
        this.f30492u2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f30434m1 == 0) {
                this.f30434m1 = -j3;
                getMediaDataController().getMediaCounts(this.f30434m1, this.f30396g1, this.classGuid);
            }
        }
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.setChatInfo(this.f30492u2);
        }
        tz0 tz0Var = this.f30441n0;
        if (tz0Var != null && !this.f30462q1) {
            tz0Var.setChatInfo(this.f30492u2);
        }
        vz0 vz0Var = this.f30490u0;
        if (vz0Var != null && (chatFull3 = this.f30492u2) != null) {
            vz0Var.setStories(chatFull3.stories);
        }
        xh.g0 g0Var = this.f30497v0;
        if (g0Var != null) {
            g0Var.a();
        }
        sz0 sz0Var = this.f30380e0;
        if (sz0Var != null) {
            sz0Var.setHasStories(j4());
        }
        L3();
        if (this.f30389f1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f30492u2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.I(38, z10);
            org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
            if (nh0Var != null) {
                nh0Var.o(3, z10);
            }
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.E2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f30492u2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f30492u2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f30492u2.participants.participants.get(i10);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.f30401g6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f30401g6 = tL_emojiStatusCollectible;
                bi.x4 x4Var = this.f30379d6;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f30394f6 = null;
                    this.f30379d6 = new bi.x4(getParentActivity(), 3);
                    this.f30386e6 = org.telegram.ui.ActionBar.j6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f30379d6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    bi.x4 x4Var2 = this.f30379d6;
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    x4Var2.A0 = true;
                    x4Var2.I0 = System.currentTimeMillis();
                    x4Var2.B0 = new Path();
                    x4Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    x4Var2.D0 = new Paint(1);
                    x4Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(1.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    x4Var2.H0 = linearGradient;
                    x4Var2.E0.setShader(linearGradient);
                    x4Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.5f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    x4Var2.G0 = new Matrix();
                    x4Var2.D0.setShader(x4Var2.F0);
                    x4Var2.E0.setStyle(Paint.Style.STROKE);
                    x4Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    x4Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    x4Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.Z.addView(this.f30379d6, w7.a6.c(24.0f, -1));
                    this.f30379d6.t(9.33f);
                    bi.x4 x4Var3 = this.f30379d6;
                    Typeface bold = AndroidUtilities.bold();
                    x4Var3.H.u(bold);
                    x4Var3.J.setTypeface(bold);
                    this.f30379d6.s(tL_emojiStatusCollectible.title);
                    bi.x4 x4Var4 = this.f30379d6;
                    x4Var4.d = -1L;
                    x4Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    bi.x4 x4Var5 = this.f30379d6;
                    x4Var5.getClass();
                    x4Var5.f3907y = AndroidUtilities.dpf2(4.0f);
                    x4Var5.E = AndroidUtilities.dpf2(2.66f);
                    this.f30379d6.r();
                    this.f30379d6.q(16.0f);
                    this.f30379d6.u();
                    this.f30379d6.setOnClickListener(new az0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                        this.f30394f6 = Boolean.FALSE;
                        this.f30379d6.setAlpha(0.0f);
                    }
                    V4();
                    bi.x4 x4Var6 = this.f30379d6;
                    Objects.requireNonNull(x4Var6);
                    AndroidUtilities.runOnUIThread(new ql0(x4Var6, 26), 6000L);
                }
            }
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.av0 av0Var;
        r01 r01Var = this.O;
        if (r01Var != null && (av0Var = this.R) != null) {
            r01Var.setNewMediaCounts(av0Var.f21612c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f30499v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.f5 f5Var;
        if (this.J1 != 0 && (f5Var = this.parentLayout) != null && f5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof eo)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(y01 y01Var) {
        if (this.f30414i5 == y01Var) {
            return;
        }
        this.f30414i5 = y01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f30350a, (e2.h) new vy0(this, 0));
    }

    public final void N3() {
        if (this.f30350a == null) {
            return;
        }
        float measuredWidth = (this.f30350a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width * this.f30360b2) * 0.5f);
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
                this.f30442n1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f30381e1 != 0 && this.f30461q0 != null && !this.f30477s1) {
            return 0;
        }
        if (this.I4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.h6 h6Var, t11 t11Var) {
        boolean z10;
        this.f30499v2 = userFull;
        org.telegram.ui.Components.tw0 tw0Var = this.T;
        if (tw0Var != null) {
            tw0Var.set(userFull.stars_rating);
        }
        vz0 vz0Var = this.f30490u0;
        if (vz0Var != null) {
            vz0Var.setStories(this.f30499v2.stories);
        }
        xh.g0 g0Var = this.f30497v0;
        if (g0Var != null) {
            g0Var.a();
        }
        sz0 sz0Var = this.f30380e0;
        if (sz0Var != null) {
            sz0Var.setHasStories(j4());
        }
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.setUserInfo(this.f30499v2);
        }
        if (this.f30507w2 == null) {
            this.f30507w2 = h6Var;
        }
        if (this.f30507w2 == null) {
            this.f30507w2 = new org.telegram.ui.Cells.h6(this.currentAccount);
        }
        org.telegram.ui.Cells.h6 h6Var2 = this.f30507w2;
        yb0 yb0Var = new yb0(this, 20);
        if (h6Var2.f19263c) {
            yb0Var.run();
        } else {
            h6Var2.h.add(yb0Var);
        }
        this.f30507w2.d(this.f30499v2);
        if (this.f30521y2 == null) {
            this.f30521y2 = t11Var;
        }
        t11 t11Var2 = this.f30521y2;
        if (t11Var2 == null) {
            t11 c10 = t11.c(this.currentAccount, this.f30499v2, t11Var2);
            this.f30521y2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30514x2 = z10;
        }
        t11 t11Var3 = this.f30521y2;
        if (t11Var3 != null) {
            yb0 yb0Var2 = new yb0(this, 16);
            if (t11Var3.f36814b) {
                yb0Var2.run();
            } else {
                t11Var3.h.add(yb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.T0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f30381e1)));
            if (e4()) {
                this.T0.K(44);
            } else {
                this.T0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.d71) {
            return ((org.telegram.ui.Components.d71) imageReceiver.getDrawable()).f22306a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f30380e0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.f30395g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f30388f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30388f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30388f0 = animatorSet2;
            if (z10) {
                this.f30395g0.setVisibility(0);
                this.f30388f0.playTogether(ObjectAnimator.ofFloat(this.f30395g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f30395g0, View.ALPHA, 0.0f));
            }
            this.f30388f0.setDuration(180L);
            this.f30388f0.addListener(new g01(this, z10, 1));
            this.f30388f0.start();
        } else if (z10) {
            this.f30395g0.setAlpha(1.0f);
            this.f30395g0.setVisibility(0);
        } else {
            this.f30395g0.setAlpha(0.0f);
            this.f30395g0.setVisibility(4);
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final org.telegram.ui.Components.n5 Q3(int i10, long j3) {
        int i11;
        org.telegram.ui.Components.n5[] n5VarArr = this.H;
        if (n5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f30387f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(dp, i11, l5Var, false);
            n5VarArr[i10] = n5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            n5Var.I = 0;
            n5Var.J = dp2;
            if (this.G0) {
                n5VarArr[i10].a();
            }
        }
        if (j3 != 0) {
            n5VarArr[i10].j(j3, false);
        } else {
            n5VarArr[i10].g(null, false);
        }
        X4();
        return n5VarArr[i10];
    }

    public final void Q4() {
        int i10;
        int i11;
        Long l4;
        if (this.B5 != null) {
            return;
        }
        c71[] c71VarArr = new c71[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
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
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.q.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.E2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        yz0 yz0Var = new yz0(this, this, parentActivity, valueOf, i11, this.f30524z0, i10, c71VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30381e1));
        if (user != null) {
            yz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.n5[] n5VarArr = this.G;
        if (l10 != null) {
            yz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                Drawable drawable = n5Var.f25412f[0];
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.p5) drawable).i());
                    yz0Var.setSelected(l4);
                }
            }
            l4 = null;
            yz0Var.setSelected(l4);
        }
        yz0Var.setSaveState(3);
        yz0Var.y(n5VarArr[1], l5VarArr[1]);
        zz0 zz0Var = new zz0(this, yz0Var);
        this.B5 = zz0Var;
        c71VarArr[0] = zz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.getLocationOnScreen(iArr);
        }
        c71VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        c71VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        r01 r01Var = this.O;
        if (r01Var != null && this.f30475s != null) {
            int closestTab = r01Var.getClosestTab();
            int[] iArr = this.R.f21612c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f30475s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f30475s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f30475s.setText(a4.a.C(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f30475s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f30475s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f30475s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f30475s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f30475s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f30475s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f30475s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f30475s.setText(LocaleController.formatPluralString("CommonGroups", this.f30499v2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f30475s.setText(this.f30467r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.iv0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f30475s.setText(this.O.V(true));
                } else if (closestTab == 9) {
                    this.f30475s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.mo0 mo0Var = this.f30475s;
                    if (this.f30470r2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    mo0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f30475s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.mo0 mo0Var2 = this.f30475s;
                    org.telegram.ui.Components.wr0 wr0Var = this.O.V;
                    if (wr0Var != null) {
                        i11 = wr0Var.getGiftsCount();
                    }
                    mo0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f30475s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f30475s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f30470r2) {
                this.f30475s.setText(this.O.V(false));
            } else if (this.O.c0(closestTab) > 0) {
                this.f30475s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.c0(closestTab), new Object[0]));
            } else {
                this.f30475s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.i iVar;
        int i10;
        if (!this.B1 && (iVar = this.C1) != null && this.f30492u2 != null) {
            this.B1 = true;
            int i11 = 0;
            if (iVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f30389f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new fg.t(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        r01 r01Var = this.O;
        org.telegram.ui.Components.xs0 xs0Var = r01Var.I0;
        if (r01Var.f24131v1 != null && xs0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = xs0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.iv0.d0(num.intValue(), r01Var.f24093d1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.O.v1(true);
        this.f30523y5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.wr.h).withEndAction(new yb0(this, 21)).start();
        org.telegram.ui.Components.wc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.n5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        int i11;
        org.telegram.ui.Components.n5[] n5VarArr = this.G;
        if (n5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f30387f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(dp, i11, l5Var, false);
            n5VarArr[i10] = n5Var;
            if (this.G0) {
                n5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                n5VarArr[i10].g(Y3(i10), z10);
                n5VarArr[i10].m(false, z10);
            } else {
                n5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                n5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                n5VarArr[i10].g(Y3(i10), z10);
                n5VarArr[i10].m(false, z10);
            } else {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                n5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                n5VarArr[i10].m(true, z10);
            }
        } else {
            n5VarArr[i10].g(Y3(i10), z10);
            n5VarArr[i10].m(false, z10);
        }
        X4();
        return n5VarArr[i10];
    }

    public final void S4() {
        int i10;
        float f7;
        k0 k0Var;
        if (this.f30351a0 != null && this.f30467r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
            boolean z10 = this.G1;
            nh0Var.e = z10;
            if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
                this.f30351a0.f25521f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
                this.f30351a0.setAlpha(this.S1);
                org.telegram.ui.Components.nh0 nh0Var2 = this.f30351a0;
                nh0Var2.E = AndroidUtilities.dp(74.0f);
                nh0Var2.setTranslationY(this.f30350a.getMeasuredWidth());
                nh0Var2.invalidate();
            } else {
                nh0Var.f25521f = -1.0f;
                float f10 = i11;
                float f11 = this.Q1 + f10;
                if (this.I4) {
                    f7 = 25.0f;
                } else {
                    f7 = 0.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f7);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.nh0 nh0Var3 = this.f30351a0;
                nh0Var3.E = min;
                nh0Var3.setTranslationY(dp - min);
                nh0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.f30351a0.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
                    ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
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
        if (this.Z0 != null && this.f30352a1 != null) {
            TLRPC.UserFull userFull = this.f30499v2;
            if (userFull == null && this.f30492u2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f30492u2.ttl_period;
            }
            this.f30476s0.b(i10);
            this.f30352a1.b(i10);
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
        if (this.f30481s5 != null) {
            r01 r01Var = this.O;
            if (r01Var != null && r01Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f30350a.getMeasuredHeight() - this.O.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            le.b bVar = this.A5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f30481s5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
            this.f30481s5.setAlpha(f7);
            FrameLayout frameLayout = this.f30481s5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            if (pcVar != null) {
                pcVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f30511x == null) {
            this.f30511x = org.telegram.ui.ActionBar.j6.l4.getConstantState().newDrawable().mutate();
        }
        return this.f30511x;
    }

    public final void V4() {
        bi.x4 x4Var = this.f30379d6;
        if (x4Var != null) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
            boolean z10 = true;
            float x10 = l5VarArr[1].getX() + (-x4Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f30424k2);
            float f7 = 0.0f;
            x4Var.m(0.0f, (l5VarArr[1].getScaleX() * (l5VarArr[1].getRightDrawableX() - (lerp * l5VarArr[1].getRightDrawableWidth()))) + x10);
            float lerp2 = AndroidUtilities.lerp(this.f30435m2, this.f30430l2);
            bi.x4 x4Var2 = this.f30379d6;
            x4Var2.setTranslationY(((l5VarArr[1].getY() + (-x4Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.f30379d6.h(i0.a.d(lerp2, this.f30386e6, 1342177280));
            if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                z10 = false;
            }
            Boolean bool = this.f30394f6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.f30379d6.animate();
            this.f30394f6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.em.q(animate.alpha(f7), org.telegram.ui.Components.wr.f28820g, 200L);
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
                f10 = this.f30424k2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f30453o5) * Utilities.clamp01(f10)) + f7;
    }

    public final void W4() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().isPremium()) {
                this.V0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, this.f30524z0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new i01(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    public final float X3(float f7) {
        float f10;
        this.f30356a6 = f7;
        int i10 = this.J1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.S1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f30424k2;
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

    public final org.telegram.ui.Components.vr Y3(int i10) {
        org.telegram.ui.Components.vr[] vrVarArr = this.K;
        if (vrVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f30524z0), PorterDuff.Mode.MULTIPLY);
            vrVarArr[i10] = new org.telegram.ui.Components.vr(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return vrVarArr[i10];
    }

    public final void Y4(float f7) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f30524z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f30524z0), this.E5, 1.0f);
            }
            int d = i0.a.d(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.j6.Oi;
            int d10 = i0.a.d(this.E5, d, org.telegram.ui.ActionBar.j6.v0(i11, this.f30524z0));
            org.telegram.ui.Components.n5 n5Var = this.G[i10];
            if (n5Var != null) {
                n5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.n5 n5Var2 = this.H[i10];
            if (n5Var2 != null) {
                n5Var2.k(Integer.valueOf(i0.a.d(this.E5, i0.a.d(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.j6.v0(i11, this.f30524z0))));
            }
            if (i10 == 1) {
                this.f30373d0.setColor(d10);
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
        org.telegram.ui.Cells.o oVar = this.f30373d0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
        oVar.setScaleX(l5VarArr[1].getScaleX());
        this.f30373d0.setScaleY(l5VarArr[1].getScaleY());
        this.f30373d0.b((l5VarArr[1].getScaleX() * l5VarArr[1].getRightDrawableX()) + l5VarArr[1].getX(), (l5VarArr[1].getHeight() - (l5VarArr[1].getScaleY() * (l5VarArr[1].getHeight() - l5VarArr[1].getRightDrawableY()))) + l5VarArr[1].getY());
    }

    public final long a() {
        long j3 = this.f30410i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.f30381e1;
        if (j10 != 0) {
            return j10;
        }
        return -this.f30389f1;
    }

    public final org.telegram.ui.Components.hm0 a4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(i10);
            this.L = hm0Var;
            hm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18001h8, this.f30524z0));
        }
        return this.L;
    }

    public final void a5() {
        if (!this.f30462q1 && ChatObject.isForum(this.E2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f30389f1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f30407h5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f30389f1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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
        if (this.f30364b6 == null) {
            q11 q11Var = new q11(LocaleController.getString(R.string.StatusHiddenShow));
            this.f30364b6 = q11Var;
            q11Var.setAlpha((int) (Math.min(1.0f, this.Q1 / T3()) * 255.0f));
            this.f30364b6.a(i0.a.d(this.f30424k2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.f30367c1)), 603979775));
        }
        return this.f30364b6;
    }

    public final void b5(float f7) {
        g11 g11Var;
        ValueAnimator valueAnimator;
        if (this.f30457p2 || ((g11Var = this.N) != null && (valueAnimator = g11Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f30350a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.N.requestLayout();
        }
        s11 s11Var = this.f30374d1;
        if (s11Var != null) {
            s11Var.E.setTranslate(0.0f, this.a2 - s11Var.f36519x);
            s11 s11Var2 = this.f30374d1;
            RadialGradient radialGradient = s11Var2.f36520y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(s11Var2.E);
            }
            this.f30374d1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        float f7;
        if (this.f30462q1) {
            return 0;
        }
        if (this.f30389f1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f30389f1)))) {
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
        if (this.f30477s1 && this.X0 != null && this.W0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f30381e1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.X0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            g1Var.setIcon(i10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.X0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            g1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.g1 g1Var3 = this.W0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            g1Var3.setVisibility(i12);
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
    public final org.telegram.ui.ActionBar.l createActionBar(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.l");
    }

    @Override
    public final android.view.View createView(android.content.Context r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final org.telegram.ui.Components.vr d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f7;
        org.telegram.ui.Components.vr[] vrVarArr = this.J;
        if (vrVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f30518y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.Q5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, f7, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f30524z0), this.E5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.f30524z0), this.E5, 1.0f), mode);
            }
            vrVarArr[i10] = new org.telegram.ui.Components.vr(new org.telegram.ui.Components.vq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return vrVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        f11 f11Var;
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
        jz0 jz0Var;
        jz0 jz0Var2;
        org.telegram.ui.Components.fl0 fl0Var;
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
                if (this.f30381e1 != 0) {
                    if (z13) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (jz0Var2 = this.f30350a) != null && (fl0Var = (org.telegram.ui.Components.fl0) jz0Var2.L(this.G3, false)) != null) {
                        this.d.v(fl0Var, this.G3);
                    }
                } else if (this.f30389f1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (z13 && (jz0Var = this.f30350a) != null) {
                        int childCount = jz0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f30350a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.bb) {
                                ((org.telegram.ui.Cells.bb) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (this.f30492u2 != null && (chat = this.E2) != null && chat.f17195id == l4.longValue()) {
                    this.f30492u2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f30417j1) {
                        AndroidUtilities.runOnUIThread(new ey0(2, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.D2;
                    if (encryptedChat2 != null && encryptedChat.f17203id == encryptedChat2.f17203id) {
                        this.D2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.X1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z16 = this.f30423k1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f30381e1) >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f30423k1 = z12;
                    if (z16 != z12) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l10 = (Long) objArr[0];
                    if (this.E2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.E2;
                        if (longValue == chat2.f17195id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f30492u2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f30492u2 = chatFull4;
                            }
                            r01 r01Var = this.O;
                            if (r01Var != null) {
                                r01Var.setChatInfo(this.f30492u2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f30492u2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f30456p1) || (inputGroupCall != null && this.f30456p1))) {
                                D3(false);
                            }
                            vz0 vz0Var = this.f30490u0;
                            if (vz0Var != null && (chatFull3 = this.f30492u2) != null) {
                                vz0Var.setStories(chatFull3.stories);
                            }
                            xh.g0 g0Var = this.f30497v0;
                            if (g0Var != null) {
                                g0Var.a();
                            }
                            sz0 sz0Var = this.f30380e0;
                            if (sz0Var != null) {
                                sz0Var.setHasStories(j4());
                            }
                            if (l10.longValue() != 0) {
                                z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f30492u2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.I(38, z14);
                                org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
                                if (nh0Var != null) {
                                    nh0Var.o(3, z14);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f30381e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f30381e1))) != null && chatFull7.f17196id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.E2;
                    if (chat3 != null && chatFull7.f17196id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f17196id == this.f30389f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f30492u2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f30492u2 = chatFull7;
                        if (this.f30434m1 == 0) {
                            long j3 = chatFull7.migrated_from_chat_id;
                            if (j3 != 0) {
                                this.f30434m1 = -j3;
                                getMediaDataController().getMediaCount(this.f30434m1, this.f30396g1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        tz0 tz0Var = this.f30441n0;
                        if (tz0Var != null && !this.f30462q1) {
                            tz0Var.setChatInfo(this.f30492u2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f30389f1));
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
                        vz0 vz0Var2 = this.f30490u0;
                        if (vz0Var2 != null && (chatFull = this.f30492u2) != null) {
                            vz0Var2.setStories(chatFull.stories);
                        }
                        xh.g0 g0Var2 = this.f30497v0;
                        if (g0Var2 != null) {
                            g0Var2.a();
                        }
                        sz0 sz0Var2 = this.f30380e0;
                        if (sz0Var2 != null) {
                            sz0Var2.setHasStories(j4());
                        }
                        r01 r01Var2 = this.O;
                        if (r01Var2 != null) {
                            r01Var2.setChatInfo(this.f30492u2);
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
                    if (botInfo.user_id == this.f30381e1) {
                        this.F2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f30381e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f30499v2 = userFull;
                        org.telegram.ui.Components.tw0 tw0Var = this.T;
                        if (tw0Var != null) {
                            tw0Var.set(userFull.stars_rating);
                        }
                        vz0 vz0Var3 = this.f30490u0;
                        if (vz0Var3 != null) {
                            vz0Var3.setStories(this.f30499v2.stories);
                        }
                        xh.g0 g0Var3 = this.f30497v0;
                        if (g0Var3 != null) {
                            g0Var3.a();
                        }
                        sz0 sz0Var3 = this.f30380e0;
                        if (sz0Var3 != null) {
                            sz0Var3.setHasStories(j4());
                        }
                        r01 r01Var3 = this.O;
                        if (r01Var3 != null) {
                            r01Var3.setUserInfo(this.f30499v2);
                        }
                        if (this.f30461q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f30499v2.about, this.f30526z2)) {
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
                                r01Var4.setCommonGroupsCount(this.f30499v2.common_chats_count);
                                R();
                                org.telegram.ui.Components.av0 av0Var = this.R;
                                if (av0Var == null || av0Var.f21619y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f30507w2 == null && !h4()) {
                            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(this.currentAccount);
                            this.f30507w2 = h6Var;
                            yb0 yb0Var = new yb0(this, 15);
                            if (h6Var.f19263c) {
                                yb0Var.run();
                            } else {
                                h6Var.h.add(yb0Var);
                            }
                            this.f30507w2.d(this.f30499v2);
                        }
                        if (!h4()) {
                            t11 t11Var = this.f30521y2;
                            t11 c10 = t11.c(this.currentAccount, this.f30499v2, t11Var);
                            this.f30521y2 = c10;
                            if (c10 != t11Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f30514x2 = z10;
                            if (c10 != null) {
                                yb0 yb0Var2 = new yb0(this, 16);
                                if (c10.f36814b) {
                                    yb0Var2.run();
                                } else {
                                    c10.h.add(yb0Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (e4()) {
                                this.T0.K(44);
                            } else {
                                this.T0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f30499v2;
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
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (f11Var = this.d) != null) {
                                            f11Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        jz0 jz0Var3 = this.f30350a;
                        if (jz0Var3 != null) {
                            jz0Var3.e1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.f30369c3;
                        int i16 = this.f30353a3;
                        int i17 = this.Y2;
                        j5();
                        f11 f11Var2 = this.d;
                        if (f11Var2 != null) {
                            if (i15 != this.f30369c3 || i16 != this.f30353a3 || i17 != this.Y2) {
                                f11Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f30462q1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        p11 p11Var = this.e;
                        if (p11Var != null) {
                            p11Var.f35662c = p11.H(this);
                            this.e.v.clear();
                            this.e.J();
                            p11 p11Var2 = this.e;
                            p11Var2.I(p11Var2.f35669y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.w0 w0Var = this.T0;
                            if (w0Var != null) {
                                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f30381e1)));
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
                                    AndroidUtilities.runOnUIThread(new yb0(this, 17));
                                    return;
                                }
                                r01 r01Var5 = this.O;
                                if (r01Var5 != null) {
                                    r01Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f30381e1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f30381e1);
                                if (userFull3 != null) {
                                    this.f30499v2 = userFull3;
                                }
                                j5();
                                R();
                                jz0 jz0Var4 = this.f30350a;
                                if (jz0Var4 != null && jz0Var4.b0()) {
                                    this.f30350a.post(new yb0(this, 19));
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
                            if (chat5 != null && chat5.f17195id == longValue4) {
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
                                        AndroidUtilities.updateVisibleRows(this.f30350a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        sz0 sz0Var4 = this.f30380e0;
                        if (sz0Var4 != null) {
                            sz0Var4.setHasStories(j4());
                            this.f30380e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f30424k2));
                        }
                        vz0 vz0Var4 = this.f30490u0;
                        if (vz0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f30499v2;
                            if (userFull4 != null) {
                                vz0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f30492u2;
                            if (chatFull9 != null) {
                                vz0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f30389f1)))) {
            getMessagesController().getStoriesController().k(a(), new gg.g0(25), false, this.f30524z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null && e50Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if ((e50Var == null || dialog != e50Var.f22554c) && super.dismissDialogOnPause(dialog)) {
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
        if (!this.f30470r2 || (userFull = this.f30499v2) == null || (botInfo = userFull.bot_info) == null) {
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
        } else if (!z11 && this.f30350a.isInLayout()) {
            jz0 jz0Var = this.f30350a;
            if (!jz0Var.G) {
                return;
            }
            jz0Var.post(new org.telegram.ui.Components.bs0(8, this, z10));
        } else {
            t01 t01Var = new t01(this);
            t01Var.f36806b = this.N2;
            t01Var.f(t01Var.f36807c);
            t01Var.e.clear();
            t01Var.f36808f.clear();
            t01Var.e.addAll(this.Q4);
            t01Var.f36808f.addAll(this.R4);
            t01Var.f36809g = this.f30494u4;
            t01Var.h = this.f30501v4;
            if (z10) {
                h5(false);
            }
            F4();
            j5();
            t01Var.f(t01Var.d);
            try {
                s4.o.c(t01Var, true).b(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.U5;
            if (i10 >= 0) {
                this.f30365c.h1(i10, this.V5 - this.f30350a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f30350a);
        }
    }

    @Override
    public final org.telegram.ui.Components.vl0 f() {
        return this.f30350a;
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
        this.f30443n2 = z10;
    }

    public final void f5() {
        int i10;
        if (this.f30366c0 != null && this.f30467r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f30366c0.setAlpha(this.S1);
                org.telegram.ui.Components.fi0 fi0Var = this.f30366c0;
                float dp = AndroidUtilities.dp(74.0f) + this.f30350a.getMeasuredWidth();
                fi0Var.L = O3() - AndroidUtilities.dp(74.0f);
                fi0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                fi0Var.invalidate();
                return;
            }
            if (z10) {
                this.f30366c0.setAlpha(this.S1);
            }
            float f7 = i11;
            float dp2 = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f7);
            org.telegram.ui.Components.fi0 fi0Var2 = this.f30366c0;
            fi0Var2.L = min - AndroidUtilities.dp(74.0f);
            fi0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            fi0Var2.invalidate();
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
        return getMessagesController().isUserNoForwards(this.f30499v2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f30524z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f30524z0 != null) {
            return null;
        }
        zy0 zy0Var = new zy0(0, this);
        ArrayList arrayList = new ArrayList();
        r01 r01Var = this.O;
        if (r01Var != null) {
            arrayList.addAll(r01Var.getThemeDescriptions());
        }
        jz0 jz0Var = this.f30350a;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jz0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, null, null, null, null, i10));
        jz0 jz0Var2 = this.f30350a;
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jz0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f17965f8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f18149pc));
        int i12 = org.telegram.ui.ActionBar.j6.f18001h8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.f18263vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i12));
        org.telegram.ui.Components.mo0 mo0Var = this.f30475s;
        if (mo0Var != null) {
            TextView textView = mo0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.j6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, zy0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30475s.getNextTextView(), 4, null, null, null, zy0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30374d1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        sz0 sz0Var = this.f30380e0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f18174r0;
        int i14 = org.telegram.ui.ActionBar.j6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sz0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30380e0, 0, null, null, new Drawable[]{this.f30455p0}, null, org.telegram.ui.ActionBar.j6.f17930d8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.f18281wh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f18299xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f18317yh));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18289x6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18126o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i16 = org.telegram.ui.ActionBar.j6.f18091m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.j6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 2, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18247uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i23 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30350a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30357b, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.F5;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(l5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.j6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(l5VarArr[1], 0, null, null, this.f30518y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.j6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5VarArr[1], 0, null, null, this.f30518y, null, org.telegram.ui.ActionBar.j6.f18336zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.f30524z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30524z0;
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
        if (this.f30461q0 != null && !this.f30477s1) {
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
        TLRPC.ChatFull chatFull = this.f30492u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.B2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f30492u2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30492u2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f17342id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
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
                i11 = com.google.android.gms.internal.vision.e2.d(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = com.google.android.gms.internal.vision.e2.d(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$EL.reversed(Comparator$CC.comparingInt(new jf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.f30494u4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f30350a);
        }
        if (this.O != null && this.J4 != -1) {
            if ((this.C2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.O.a1(this.C2, this.f30492u2);
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
        org.telegram.ui.Components.d5.s(this, false, chat, null, false, z11, z10, !isForum, new ny0(this, 1));
    }

    public final void i5(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f30457p2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v02;
        if (!this.f30457p2) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null && lVar.s()) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18273w8, this.f30524z0);
            } else if (this.F5) {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.f30524z0);
            } else {
                MessagesController.PeerColor peerColor = this.Q5;
                if (peerColor != null) {
                    v02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                } else {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, this.f30524z0);
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
        if (getMessagesController().getStoriesController().I(a()) && !this.f30462q1) {
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
        if (this.f30416j0 != null && (imageView = this.f30422k0) != null) {
            if (this.L1 && (chat = this.E2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f30422k0.setVisibility(0);
                this.f30416j0.setTag(1);
                this.f30416j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f30422k0.setVisibility(8);
            this.f30416j0.setTag(null);
            this.f30416j0.setVisibility(8);
        }
    }

    public final void l4(int r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.l4(int, float, boolean):void");
    }

    public final void l5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        float f10;
        boolean z11;
        if ((this.f30490u0 != null || this.f30497v0 != null) && (lVar = this.actionBar) != null) {
            if (lVar.getOccupyStatusBar()) {
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
            vz0 vz0Var = this.f30490u0;
            if (vz0Var != null) {
                float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(f10 - vz0Var.f30640f0) <= 0.1f && Math.abs(width - vz0Var.f30641g0) <= 0.1f && Math.abs(A - vz0Var.f30642h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                vz0Var.f30640f0 = f10;
                vz0Var.f30641g0 = width;
                if (z10) {
                    vz0Var.m0.d(width, true);
                }
                vz0Var.f30642h0 = A;
                if (z11) {
                    vz0Var.invalidate();
                }
            }
            xh.g0 g0Var = this.f30497v0;
            if (g0Var != null) {
                float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
                int U3 = U3();
                z12 = (Math.abs(f10 - g0Var.f45434r) > 0.1f || Math.abs(width - g0Var.f45435s) > 0.1f || Math.abs(A2 - g0Var.v) > 0.1f) ? true : true;
                g0Var.f45434r = f10;
                g0Var.f45435s = width;
                if (z10) {
                    g0Var.f45438y.d(width, true);
                }
                g0Var.v = A2;
                g0Var.f45437x = U3 + A2;
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30381e1));
        if (user != null) {
            if (this.f30470r2 && !MessagesController.isSupportUser(user)) {
                if (this.f30423k1 && !z10) {
                    getMessagesController().unblockPeer(this.f30381e1, new yb0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.E2;
                if (this.D2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.d5.s(this, false, chat, user, z11, true, false, true, new oy0(this, user));
            } else if (this.f30423k1) {
                getMessagesController().unblockPeer(this.f30381e1);
                if (org.telegram.ui.Components.wc.a(this)) {
                    org.telegram.ui.Components.wc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.d5.j0(this, this.f30381e1, user, null, this.D2, false, null, new wa(this, 4), this.f30524z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f30524z0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new ny0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, this.f30524z0));
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
        if (i13 > 0 && !this.W1 && (this.f30461q0 == null || this.O2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.H5 = z11;
        C3();
        org.telegram.ui.Components.kj0 kj0Var = this.v;
        if (kj0Var != null && kj0Var.getVisibility() != 8) {
            org.telegram.ui.Components.kj0 kj0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            kj0Var2.setTranslationY((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            if (i13 > 0 && !this.W1 && !this.f30477s1 && (this.f30461q0 == null || this.O2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f30389f1 != 0) {
                if (ChatObject.isChannel(this.E2) && !this.E2.megagroup && (chatFull = this.f30492u2) != null && chatFull.linked_chat_id != 0 && (this.D3 != -1 || this.E3 != -1)) {
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
                    AnimatorSet animatorSet = this.f30504w;
                    if (animatorSet != null) {
                        this.f30504w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f30504w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f30504w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f30504w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f30504w.setDuration(150L);
                        this.f30504w.addListener(new f01(this, 1));
                        this.f30504w.start();
                    } else {
                        org.telegram.ui.Components.kj0 kj0Var3 = this.v;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        kj0Var3.setScaleX(f7);
                        org.telegram.ui.Components.kj0 kj0Var4 = this.v;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        kj0Var4.setScaleY(f10);
                        org.telegram.ui.Components.kj0 kj0Var5 = this.v;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        kj0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        vz0 vz0Var = this.f30490u0;
        if (vz0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            vz0Var.f30643i0 = measuredWidth;
            vz0Var.f30645k0 = z12;
            vz0Var.f30644j0 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10;
            vz0Var.invalidate();
        }
        xh.g0 g0Var = this.f30497v0;
        if (g0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + this.Q1 + this.T1);
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
        if (this.f30381e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30381e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f30499v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.e2.m(user, z10, z11, getParentActivity(), this.f30499v2, getAccountInstance());
            }
        } else if (this.f30389f1 != 0) {
            if (getMessagesController().getGroupCall(this.f30389f1, false) == null) {
                TLRPC.Chat chat = this.E2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.f80.t(getParentActivity(), -chat.f17195id, accountInstance, new org.telegram.ui.Components.f21(chat, this, accountInstance, 1));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.e2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.wr0 wr0Var;
        org.telegram.ui.Components.xs0 xs0Var;
        org.telegram.ui.Components.m90 m90Var;
        int v02;
        int v03;
        int v04;
        int color3;
        int v05;
        int v06;
        int v07;
        this.R5.clear();
        s11 s11Var = this.f30374d1;
        if (s11Var != null) {
            s11Var.a(this.Q5, true);
        }
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30467r;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            if (l5Var.getTag() instanceof Integer) {
                v07 = org.telegram.ui.ActionBar.j6.v0(((Integer) l5VarArr[1].getTag()).intValue(), this.f30524z0);
            } else {
                v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.f30524z0);
            }
            l5VarArr[1].setTextColor(i0.a.d(this.f30424k2, w3(v07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        q11 q11Var = this.f30364b6;
        float f7 = -0.1f;
        if (q11Var != null) {
            q11Var.a(i0.a.d(this.f30424k2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.f30367c1)), 603979775));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = -1;
        if (lVar != null) {
            if (this.Q5 != null) {
                v05 = -1;
            } else {
                v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, this.f30524z0);
            }
            lVar.C(i0.a.d(this.E5, v05, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18308y8, this.f30524z0)), false);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null) {
                v06 = 1090519039;
            } else if (peerColor != null) {
                v06 = 553648127;
            } else {
                v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17965f8, this.f30524z0);
            }
            lVar2.A(i0.a.d(this.E5, v06, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18327z8, this.f30524z0)), false);
        }
        Drawable[] drawableArr = this.f30518y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.Q5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.Q5.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = -0.08f;
                }
                v04 = org.telegram.ui.ActionBar.j6.b(0.1f, f7, d);
            } else {
                v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f30524z0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v04, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f30524z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            if (this.Q5 != null) {
                v03 = -1;
            } else {
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.f30524z0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(v03, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.f30524z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f30387f[1];
        if (l5Var2 != null) {
            if (this.Q5 != null) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18263vh, this.f30524z0);
            }
            l5Var2.setTextColor(i0.a.d(this.f30424k2, i0.a.d(this.E5, v02, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.f30524z0)), -1));
        }
        org.telegram.ui.Components.o8 o8Var = this.f30352a1;
        if (o8Var != null && (m90Var = o8Var.e) != null) {
            m90Var.invalidate();
        }
        Drawable drawable = this.f30511x;
        if (drawable != null) {
            if (this.Q5 == null) {
                i10 = i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18149pc, this.f30524z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.fi0 fi0Var = this.f30366c0;
        if (fi0Var != null) {
            fi0Var.setColor(this.Q5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30350a, (e2.h) new vy0(this, 1));
        r01 r01Var = this.O;
        if (r01Var != null && (xs0Var = r01Var.I0) != null) {
            xs0Var.e();
        }
        r01 r01Var2 = this.O;
        if (r01Var2 != null && (wr0Var = r01Var2.V) != null) {
            wr0Var.m();
        }
        p5();
        X4();
        vz0 vz0Var = this.f30490u0;
        if (vz0Var != null) {
            vz0Var.f(true, true);
        }
        xh.g0 g0Var = this.f30497v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.i(i10, i11, intent);
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
        org.telegram.ui.Components.fi0 fi0Var;
        org.telegram.ui.Components.nh0 nh0Var;
        super.onConfigurationChanged(configuration);
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f30443n2 && (nh0Var = this.f30351a0) != null) {
            nh0Var.i();
        }
        if (this.f30443n2 && (fi0Var = this.f30366c0) != null) {
            fi0Var.b();
        }
        if (this.f30443n2 && this.f30457p2 && (m10 = this.f30365c.m(0)) != null) {
            this.f30350a.scrollBy(0, m10.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new gi(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        jz0 jz0Var = this.f30350a;
        if (jz0Var != null) {
            jz0Var.e1();
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
        org.telegram.ui.Components.av0 av0Var = this.R;
        if (av0Var != null) {
            av0Var.b(this);
        }
        org.telegram.ui.Components.av0 av0Var2 = this.R;
        if (av0Var2 != null) {
            av0Var2.f21618x.remove(this);
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
        tz0 tz0Var = this.f30441n0;
        if (tz0Var != null) {
            tz0Var.K();
        }
        org.telegram.ui.Components.ph0 ph0Var = this.m0;
        if (ph0Var != null) {
            ph0Var.e();
        }
        this.J5 = null;
        if (this.f30381e1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f30381e1);
        } else if (this.f30389f1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        sz0 sz0Var = this.f30380e0;
        if (sz0Var != null) {
            sz0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.e();
        }
        xz0 xz0Var = this.V4;
        if (xz0Var != null) {
            xz0Var.b();
        }
        t11 t11Var = this.f30521y2;
        if (t11Var != null && this.f30514x2) {
            t11Var.b(true);
            this.f30521y2 = null;
        }
        org.telegram.messenger.a9 a9Var = this.f30517x5;
        if (a9Var != null) {
            this.f30517x5 = null;
            AndroidUtilities.runOnUIThread(a9Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.nt0 nt0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.j();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        r01 r01Var = this.O;
        if (r01Var != null && (nt0Var = r01Var.T) != null) {
            nt0Var.e = false;
            if (nt0Var.f33144c != null) {
                nt0Var.f33142a.onPause();
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
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.k(i10, strArr, iArr);
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
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f30389f1, false);
                    TLRPC.Chat chat = this.E2;
                    if (groupCall == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.e2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.e2.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30381e1));
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
            TLRPC.UserFull userFull = this.f30499v2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.e2.m(user, z11, z12, getParentActivity(), this.f30499v2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.e2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        t50 t50Var;
        super.onResume();
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.f24086b1 = true;
            org.telegram.ui.Components.mt0 mt0Var = r01Var.H;
            if (mt0Var != null) {
                mt0Var.l();
            }
            org.telegram.ui.Components.vu0 vu0Var = r01Var.K;
            if (vu0Var != null) {
                vu0Var.l();
            }
            org.telegram.ui.Components.wu0 wu0Var = r01Var.J;
            if (wu0Var != null) {
                wu0Var.X(false);
            }
            for (int i10 = 0; i10 < r01Var.f24107k0.length; i10++) {
                r01Var.U(i10);
            }
            org.telegram.ui.Components.nt0 nt0Var = r01Var.T;
            if (nt0Var != null) {
                nt0Var.e = true;
                if (nt0Var.f33144c != null) {
                    nt0Var.f33142a.onResume();
                }
            }
        }
        f4();
        f11 f11Var = this.d;
        if (f11Var != null) {
            this.T4 = true;
            f11Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (t50Var = this.U) != null && t50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new gi(this, 5));
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f30387f[1];
        if (l5Var != null) {
            setParentActivityTitle(l5Var.getText());
        }
        if (this.f30381e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f30381e1))) != null && user.photo == null && this.Q1 >= T3()) {
            this.f30418j2.cancel();
            float[] fArr = this.f30435m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f30441n0.setVisibility(8);
            this.Q1 = T3();
            this.f30450o2 = false;
            this.f30365c.h1(0, T3() - this.f30350a.getPaddingTop());
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
                        this.f30424k2 = 0.0f;
                        org.telegram.ui.Components.tw0 tw0Var = this.T;
                        if (tw0Var != null) {
                            tw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
                        if (nh0Var != null) {
                            nh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.fi0 fi0Var = this.f30366c0;
                        if (fi0Var != null) {
                            fi0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    A3();
                    if (this.I1) {
                        D3(true);
                    }
                }
                if (!this.f30432l5) {
                    this.f30432l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.P4);
            t50 t50Var = this.U;
            if (t50Var != null && t50Var.getVisibility() == 0) {
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
        t50 t50Var = this.U;
        if (t50Var != null && t50Var.getVisibility() == 0) {
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
        org.telegram.ui.Components.nh0 nh0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.M5 = z10;
        if (z10 && (nh0Var = this.f30351a0) != null) {
            ArrayList arrayList = nh0Var.f25514a;
            if (nh0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.kh0 kh0Var = (org.telegram.ui.Components.kh0) arrayList.get(i10);
                    org.telegram.ui.Components.hj0 hj0Var = kh0Var.f24722k;
                    if (hj0Var != null) {
                        if (kh0Var.f24715a == 15) {
                            hj0Var.M(14);
                        } else {
                            hj0Var.M(0);
                        }
                        kh0Var.f24722k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f30457p2) {
            this.G1 = true;
            if (!z10) {
                if (this.J5 == null) {
                    this.J5 = new float[16];
                }
                this.F1 = this.Q1;
                this.J5[0] = this.Y.getScaleX();
                this.J5[1] = this.Y.getTranslationX();
                this.J5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.nh0 nh0Var2 = this.f30351a0;
                if (nh0Var2 != null) {
                    this.J5[3] = nh0Var2.getAlpha();
                }
                xh.g0 g0Var = this.f30497v0;
                if (g0Var != null) {
                    float[] fArr = this.J5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f45432f;
                }
                q11 q11Var = this.f30364b6;
                if (q11Var != null) {
                    this.J5[6] = q11Var.getAlpha();
                }
                float[] fArr2 = this.J5;
                org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
                fArr2[7] = l5VarArr[1].getScaleX();
                this.J5[8] = l5VarArr[1].getTranslationY();
                float[] fArr3 = this.J5;
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f30467r;
                fArr3[9] = l5VarArr2[1].getTranslationY();
                this.J5[10] = l5VarArr[1].getLayoutParams().width;
                this.J5[11] = this.f30368c2;
                for (int i11 = 0; i11 < l5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i11];
                    if (l5Var != null) {
                        int i12 = i11 * 2;
                        this.J5[i12 + 12] = l5Var.getTranslationX();
                        this.J5[i12 + 13] = l5VarArr2[i11].getTranslationX();
                    }
                }
                bi.x4 x4Var = this.f30379d6;
                if (x4Var != null) {
                    x4Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f30461q0 != null) {
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
        TLRPC.UserFull userFull = this.f30499v2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.wc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.E2 != null) {
            org.telegram.ui.Components.t40.h.a();
        }
        showDialog(new wh.p1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18299xh, this.f30524z0);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18317yh, this.f30524z0);
                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18281wh, this.f30524z0);
                if (this.Q5 != null && org.telegram.ui.ActionBar.j6.b1(v02)) {
                    v02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.Q5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.Q5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                        v03 = org.telegram.ui.ActionBar.j6.C(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, this.f30524z0), bgColor2, v03, bgColor2);
                    }
                    v04 = -1;
                }
                org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(mutate, org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                vqVar.e = dp;
                vqVar.f28576f = dp2;
                this.v.setBackground(vqVar);
                this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
            } catch (Exception unused) {
            }
        }
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.f17195id, getUserConfig().getCurrentUser(), 0, null, this, true, new cm0(this, z10, zArr, 5), new ca.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    @Override
    public final void r() {
        this.f30350a.x0(0);
    }

    public final void r4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j3;
        long j10 = this.f30410i1;
        if (j10 == 0) {
            j10 = this.f30381e1;
            if (j10 == 0) {
                j10 = -this.f30389f1;
            }
        }
        long j11 = j10;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j11, this.f30396g1);
        if (z10 && (this.f30462q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j11, this.f30396g1, z11);
            org.telegram.ui.Components.wc.A(this, z11, null).j();
            a5();
            this.f30351a0.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j11, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, this.f30396g1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f30396g1 == 0) {
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
                if (this.f30396g1 == 0) {
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
            getNotificationsController().updateServerNotificationsSettings(j11, this.f30396g1);
            j5Var.setChecked(z13);
            org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) this.f30350a.L(this.N3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(getParentActivity(), this.currentAccount, null, true, new e6.n(this, j11, 5), this.f30524z0);
            uoVar.d(j11, this.f30396g1, this.f30407h5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.f30351a0.getHeight() - AndroidUtilities.dp(12.0f);
            }
            uoVar.c(this, view, f11, f12, z10);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null) {
            e50Var.f22555f = bundle.getString("path");
        }
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f30381e1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30381e1));
                if (user != null) {
                    if (this.F2 != null && (userFull = this.f30499v2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f30499v2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f30389f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f30389f1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f30492u2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f30492u2.about, ChatObject.getPublicUsername(chat));
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
        org.telegram.ui.Components.e50 e50Var = this.f30461q0;
        if (e50Var != null && (str = e50Var.f22555f) != null) {
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
        this.f30424k2 = f7;
        this.S1 = f7;
        B3();
        if (this.J1 == 2) {
            this.f30380e0.setProgressToExpand(f7);
            org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
            if (nh0Var != null) {
                nh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.fi0 fi0Var = this.f30366c0;
            if (fi0Var != null) {
                fi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.tw0 tw0Var = this.T;
            if (tw0Var != null) {
                tw0Var.setParentExpanded(f7);
            }
            S4();
            f5();
        }
        this.f30350a.setAlpha(f7);
        this.f30350a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (v02 = this.f30468r0) == 0) {
            if (this.f30381e1 == 0 && ChatObject.isChannel(this.f30389f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f30524z0;
            int[][] iArr = org.telegram.ui.Components.g9.C;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var);
        }
        int i11 = this.X4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, this.f30524z0);
        }
        this.f30374d1.setBackgroundColor(i0.a.d(f7, i0.a.k(i11, 0), v02));
        org.telegram.ui.Components.j21 j21Var = this.f30429l0;
        int d = i0.a.d(f7, i11, v02);
        j21Var.f24202k = true;
        j21Var.f24196b.setColor(d);
        int i12 = -1;
        if (this.Q5 != null) {
            v03 = -1;
        } else {
            if (this.f30381e1 == 0 && ChatObject.isChannel(this.f30389f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.f30524z0;
            int[][] iArr2 = org.telegram.ui.Components.g9.C;
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17984g8, f6Var2);
        }
        this.actionBar.C(i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, this.f30524z0), v03), false);
        if (this.Q5 == null) {
            i12 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18263vh, this.f30524z0);
        }
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.f30524z0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f30387f[i13];
            if (l5Var != null && (i13 != 1 || this.J1 != 2)) {
                l5Var.setTextColor(i0.a.d(f7, v05, i12));
            }
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bh, this.f30524z0);
        } else {
            if (this.f30381e1 == 0 && ChatObject.isChannel(this.f30389f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.f30524z0;
            int[][] iArr3 = org.telegram.ui.Components.g9.C;
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18001h8, f6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.j6.f18147pa;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.B8;
        }
        int v06 = org.telegram.ui.ActionBar.j6.v0(i10, this.f30524z0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.l5 l5Var2 = this.f30467r[i14];
            if (l5Var2 != null && i14 != 1 && (i14 != 2 || this.J1 != 2)) {
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
                l5Var2.setTextColor(i0.a.d(f7, w32, w33));
            }
        }
        this.Q1 = this.R1 * f7;
        long j3 = this.f30381e1;
        if (j3 == 0) {
            j3 = this.f30389f1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.f30524z0;
        int[][] iArr4 = org.telegram.ui.Components.g9.C;
        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18145p8[org.telegram.ui.Components.g9.e(j3)], f6Var4);
        long j10 = this.f30381e1;
        if (j10 == 0) {
            j10 = this.f30389f1;
        }
        int d10 = org.telegram.ui.Components.g9.d(j10);
        if (v07 != d10) {
            this.f30455p0.h(i0.a.d(f7, d10, v07));
            this.f30380e0.invalidate();
        }
        int i15 = this.Y4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f7, i15, getNavigationBarColor()));
        }
        this.f30374d1.invalidate();
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
            sz0 sz0Var = this.f30380e0;
            if (sz0Var != null) {
                sz0Var.setProgressToStoriesInsets(this.S1);
            }
            vz0 vz0Var = this.f30490u0;
            if (vz0Var != null) {
                vz0Var.setProgressToStoriesInsets(this.S1);
            }
            xh.g0 g0Var = this.f30497v0;
            if (g0Var != null) {
                g0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.f5 f5Var) {
        super.setParentLayout(f5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (f5Var != null && f5Var.getParentActivity() != null) {
            this.X1 = new FlagSecureReason(f5Var.getParentActivity().getWindow(), new ny0(this, 6));
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
            bundle.putLong("chat_id", this.f30389f1);
            bundle.putLong("user_id", this.f30381e1);
            presentFragment(new k31(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.U2) {
            if (this.f30381e1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f30499v2)) {
                org.telegram.ui.Components.wc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f30381e1)))).j();
            } else {
                showDialog(new wh.p1(getParentActivity(), this.currentAccount, this.f30381e1, null, null));
            }
        }
    }

    public final void u4() {
        boolean z10;
        org.telegram.ui.Components.hj0 hj0Var;
        if (this.f30381e1 != 0) {
            if (this.f30461q0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.e50 e50Var = this.f30461q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e50Var.o(z10, new yb0(this, 24), new s5(this, 14), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
                    if (nh0Var != null) {
                        org.telegram.ui.Components.kh0 j3 = org.telegram.ui.Components.nh0.j(14, nh0Var.f25514a);
                        if (j3 != null && (hj0Var = j3.f24722k) != null) {
                            hj0Var.start();
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

    @Override
    public final boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a4.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j3)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
        } else if (DialogObject.isUserDialog(j3)) {
            i12.putLong("user_id", j3);
        } else if (DialogObject.isChatDialog(j3)) {
            i12.putLong("chat_id", -j3);
        }
        if (!getMessagesController().checkCanOpenChat(i12, wyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new eo(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f30381e1)), j3, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j3, z11, i10, i11, 0L);
        }
        return true;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f30410i1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.uq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.ht(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = a4.a.i("addToGroup", true);
        i10.putLong("chatId", this.E2.f17195id);
        e70 e70Var = new e70(i10);
        TLRPC.ChatFull chatFull = this.f30492u2;
        e70Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.i iVar = new a0.i();
            for (int i11 = 0; i11 < this.f30492u2.participants.participants.size(); i11++) {
                iVar.k(null, this.f30492u2.participants.participants.get(i11).user_id);
            }
            e70Var.J = iVar;
        }
        e70Var.f32105x = new ny0(this, 9);
        presentFragment(e70Var);
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.Q5 != null) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18201s8, this.f30524z0);
            int d = i0.a.d(0.5f, this.Q5.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), this.Q5.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()));
            if (!org.telegram.ui.ActionBar.j6.b1(v02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.j6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.j6.l1(0.7f, d));
                }
                return d;
            }
            boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.j6.l1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.j6.C(q6, v02, d, i10, i11);
        }
        return i10;
    }

    public final void w4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.w4(boolean):void");
    }

    @Override
    public final eh.d x() {
        return this.f30447n6;
    }

    public final void x3() {
        int i10;
        int i11;
        if (this.J5 != null) {
            ValueAnimator valueAnimator = this.f30418j2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f30418j2.cancel();
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
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.f30360b2 = AndroidUtilities.lerp(0.42f, this.J5[0], clamp01);
                this.Z1 = AndroidUtilities.lerp(this.O5, this.J5[1], clamp01);
                this.a2 = AndroidUtilities.lerp(translationY, this.J5[2], clamp01);
                this.f30368c2 = AndroidUtilities.lerp(this.J5[11], 0.0f, clamp01);
                this.Y.setScaleX(this.f30360b2);
                this.Y.setScaleY(this.f30360b2);
                this.Y.setTranslationX(this.Z1);
                this.Y.setTranslationY(this.a2);
                org.telegram.ui.Components.tw0 tw0Var = this.T;
                if (tw0Var != null) {
                    tw0Var.setAlpha(clamp01);
                }
                this.f30380e0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                vz0 vz0Var = this.f30490u0;
                if (vz0Var != null) {
                    vz0Var.invalidate();
                }
                xh.g0 g0Var = this.f30497v0;
                if (g0Var != null) {
                    g0Var.e = AndroidUtilities.lerp(0.0f, this.J5[4], f7);
                    this.f30497v0.f45432f = AndroidUtilities.lerp(0.0f, this.J5[5], clamp01);
                    xh.g0 g0Var2 = this.f30497v0;
                    g0Var2.h = true;
                    g0Var2.invalidate();
                }
                q11 q11Var = this.f30364b6;
                if (q11Var != null) {
                    q11Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.J5[6], clamp01));
                }
                float dp = (((this.f30360b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f30402h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f30402h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f30409i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f30409i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f30416j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f30416j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f30422k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f30422k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.J5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f30382e2 = AndroidUtilities.lerp(floor, this.J5[8], clamp01);
                this.f30397g2 = AndroidUtilities.lerp(dpf2, this.J5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
                    if (i13 >= l5VarArr.length) {
                        break;
                    }
                    if (l5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 13], clamp01);
                        l5VarArr[i13].setTranslationX(lerp2);
                        l5VarArr[i13].setTranslationY(this.f30382e2);
                        org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f30467r;
                        l5VarArr2[i13].setTranslationX(this.f30453o5 + lerp3);
                        l5VarArr2[i13].setTranslationY(this.f30397g2);
                        if (i13 == 1) {
                            this.f30375d2 = lerp2;
                            this.f30390f2 = lerp3;
                            this.f30475s.setTranslationX(lerp3);
                            this.f30475s.setTranslationY(this.f30397g2);
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
                b5(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12);
                l4((int) this.J5[10], clamp01, true);
                org.telegram.ui.Components.nh0 nh0Var = this.f30351a0;
                if (nh0Var != null) {
                    nh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.J5[3], f7));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f30381e1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f30381e1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f30381e1);
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
                eo eoVar = new eo(bundle);
                eoVar.B9 = getMediaDataController().getGreetingsSticker();
                eoVar.C9 = false;
                presentFragment(eoVar, z10);
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
        TLRPC.ChatFull chatFull = this.f30492u2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f30492u2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new eo(bundle));
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
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.f30360b2 = 1.38f;
        this.f30368c2 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.f30387f;
            if (i11 >= l5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i11];
            if (l5Var != null) {
                float measuredWidth = (this.f30350a.getMeasuredWidth() / 2.0f) - (((l5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = this.f30467r;
                float measuredWidth2 = (this.f30350a.getMeasuredWidth() / 2.0f) - ((l5VarArr2[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) l5VarArr2[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.f30375d2 = measuredWidth;
                    this.f30390f2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.J1 != 2) {
            this.f30490u0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f30380e0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f30499v2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                h01 h01Var = new h01(3, 0);
                h01Var.setResourceProvider(this.f30524z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f30499v2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                h01Var.O0 = false;
                h01Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(h01Var);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f30499v2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.av0 av0Var) {
        super(bundle);
        this.f30387f = new org.telegram.ui.ActionBar.l5[2];
        this.h = null;
        this.f30440n = null;
        this.f30467r = new org.telegram.ui.ActionBar.l5[4];
        this.f30518y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.n5[2];
        this.H = new org.telegram.ui.Components.n5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.vr[2];
        this.K = new org.telegram.ui.Components.vr[2];
        this.f30505w0 = null;
        this.f30512x0 = new org.telegram.ui.Components.p50(this, 1);
        this.f30519y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f30359b1 = 1.0f;
        this.C1 = new a0.i();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.f30435m2 = new float[]{0.0f, 1.0f};
        this.f30463q2 = new Paint();
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
        this.f30355a5 = 0L;
        this.f30407h5 = new HashSet();
        this.f30420j5 = new org.telegram.ui.Cells.c2(this);
        this.f30427k5 = new d01(this);
        this.A5 = new le.b(0, new ny0(this, 8), org.telegram.ui.Components.wr.h, 380L, true);
        this.G5 = new e01(this);
        this.I5 = new f01(this, 0);
        this.J5 = null;
        this.R5 = new SparseIntArray();
        this.T5 = null;
        this.U5 = -1;
        this.Y5 = -1.0f;
        eh.b bVar = new eh.b();
        this.f30460p6 = bVar;
        zg.a aVar = new zg.a(bVar);
        this.q6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.f30489t6 = arrayList;
        RectF rectF = new RectF();
        this.f30496u6 = rectF;
        RectF rectF2 = new RectF();
        this.f30503v6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.R = av0Var;
        eh.c cVar = new eh.c();
        cVar.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.f30524z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f30439m6 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.f30447n6 = dVar;
            zg.a aVar2 = new zg.a(dVar);
            this.f30454o6 = aVar2;
            aVar2.f48083f = LiteMode.isEnabled(262144);
        } else {
            this.f30439m6 = null;
            this.f30447n6 = null;
            this.f30454o6 = new zg.a(cVar);
        }
        aVar.f48082c = new pe.b(true);
    }

    @Override
    public final void P() {
    }
}

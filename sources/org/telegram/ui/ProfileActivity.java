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
public class ProfileActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, yx, org.telegram.ui.Components.ju0, org.telegram.ui.Components.r40, org.telegram.ui.Components.bt0, mg0 {
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
    public final org.telegram.ui.Components.n5[] C;
    public boolean C0;
    public boolean C1;
    public TLRPC.ChannelParticipant C2;
    public int C3;
    public int C4;
    public final xy0 C5;
    public final org.telegram.ui.Components.n5[] D;
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
    public final org.telegram.ui.Components.ir[] F;
    public final boolean[] F0;
    public int F1;
    public TLRPC.FileLocation F2;
    public int F3;
    public int F4;
    public float[] F5;
    public final org.telegram.ui.Components.ir[] G;
    public boolean G0;
    public boolean G1;
    public ImageLocation G2;
    public int G3;
    public int G4;
    public float G5;
    public org.telegram.ui.Components.vl0 H;
    public boolean H0;
    public boolean H1;
    public final Rect H2;
    public int H3;
    public int H4;
    public float H5;
    public UndoView I;
    public boolean I0;
    public boolean I1;
    public org.telegram.ui.Cells.m8 I2;
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
    public org.telegram.ui.Components.qw0 L;
    public org.telegram.ui.ActionBar.w0 L0;
    public boolean L1;
    public int L2;
    public int L3;
    public int L4;
    public float L5;
    public boolean M;
    public org.telegram.ui.ActionBar.w0 M0;
    public float M1;
    public int M2;
    public int M3;
    public final ArrayList M4;
    public MessagesController.PeerColor M5;
    public org.telegram.ui.Components.iu0 N;
    public org.telegram.ui.ActionBar.w0 N0;
    public float N1;
    public int N2;
    public int N3;
    public final ArrayList N4;
    public final SparseIntArray N5;
    public boolean O;
    public org.telegram.ui.ActionBar.w0 O0;
    public float O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public org.telegram.ui.Components.aw0 P;
    public org.telegram.ui.ActionBar.w0 P0;
    public int P1;
    public int P2;
    public int P3;
    public boolean P4;
    public AnimatorSet P5;
    public op0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public org.telegram.ui.Components.xi0 R;
    public org.telegram.ui.ActionBar.g1 R0;
    public ValueAnimator R1;
    public int R2;
    public int R3;
    public qy0 R4;
    public int R5;
    public org.telegram.ui.Components.xi0 S;
    public org.telegram.ui.ActionBar.g1 S0;
    public boolean S1;
    public int S2;
    public int S3;
    public View S4;
    public boolean S5;
    public org.telegram.ui.Components.g40 T;
    public org.telegram.ui.ActionBar.g1 T0;
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
    public bg.d1 V;
    public org.telegram.ui.ActionBar.g1 V0;
    public float V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public org.telegram.ui.Components.zg0 W;
    public org.telegram.ui.Components.m8 W0;
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
    public org.telegram.ui.Components.rh0 Y;
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
    public nh.t3 Z5;
    public by0 f35984a;
    public ly0 f35985a0;
    public long f35986a1;
    public float a2;
    public int f35987a3;
    public int f35988a4;
    public String f35989a5;
    public int f35990a6;
    public org.telegram.ui.Components.jl0 f35991b;
    public AnimatorSet f35992b0;
    public long f35993b1;
    public float f35994b2;
    public int f35995b3;
    public int f35996b4;
    public String f35997b5;
    public Boolean f35998b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public dy0 f35999c;
    public org.telegram.ui.Cells.w3 f36000c0;
    public long f36001c1;
    public float f36002c2;
    public int c3;
    public int f36003c4;
    public org.telegram.ui.Components.ug f36004c5;
    public TLRPC.TL_emojiStatusCollectible c6;
    public vz0 d;
    public ImageView f36005d0;
    public boolean f36006d1;
    public float f36007d2;
    public int f36008d3;
    public int f36009d4;
    public final HashSet f36010d5;
    public int f36011d6;
    public g01 f36012e;
    public ImageView f36013e0;
    public long f36014e1;
    public float f36015e2;
    public int f36016e3;
    public int f36017e4;
    public CharacterStyle f36018e5;
    public boolean f36019e6;
    public final org.telegram.ui.ActionBar.h5[] f36020f;
    public ImageView f36021f0;
    public boolean f36022f1;
    public ValueAnimator f36023f2;
    public int f36024f3;
    public int f36025f4;
    public final org.telegram.ui.Cells.b2 f36026f5;
    public int f36027f6;
    public ImageView f36028g0;
    public boolean f36029g1;
    public float f36030g2;
    public int f36031g3;
    public int f36032g4;
    public final wy0 f36033g5;
    public int f36034g6;
    public String h;
    public org.telegram.ui.Components.m11 f36035h0;
    public boolean f36036h1;
    public float f36037h2;
    public int f36038h3;
    public int f36039h4;
    public boolean f36040h5;
    public int f36041h6;
    public org.telegram.ui.Components.bh0 f36042i0;
    public long f36043i1;
    public final float[] f36044i2;
    public int f36045i3;
    public int f36046i4;
    public fz0 f36047i5;
    public final lg.e f36048i6;
    public my0 f36049j0;
    public boolean f36050j1;
    public boolean f36051j2;
    public int f36052j3;
    public int f36053j4;
    public float f36054j5;
    public final qg.d f36055j6;
    public yz0 f36056k0;
    public boolean f36057k1;
    public boolean f36058k2;
    public int f36059k3;
    public int f36060k4;
    public float f36061k5;
    public final lg.a f36062k6;
    public org.telegram.ui.Components.e9 f36063l0;
    public boolean l1;
    public boolean f36064l2;
    public int f36065l3;
    public int f36066l4;
    public boolean f36067l5;
    public final qg.b f36068l6;
    public org.telegram.ui.Components.s40 m0;
    public boolean f36069m1;
    public final Paint f36070m2;
    public int f36071m3;
    public int f36072m4;
    public boolean f36073m5;
    public final lg.a f36074m6;
    public String f36075n;
    public int f36076n0;
    public boolean f36077n1;
    public boolean f36078n2;
    public int f36079n3;
    public int f36080n4;
    public ImageReceiver f36081n5;
    public sg.i f36082n6;
    public org.telegram.ui.Components.m11 f36083o0;
    public boolean f36084o1;
    public ph.q0 f36085o2;
    public int f36086o3;
    public int f36087o4;
    public FrameLayout f36088o5;
    public px0 f36089o6;
    public org.telegram.ui.Components.oh0 f36090p0;
    public boolean f36091p1;
    public ph.p f36092p2;
    public int f36093p3;
    public int f36094p4;
    public FrameLayout[] f36095p5;
    public final ArrayList f36096p6;
    public oy0 f36097q0;
    public int f36098q1;
    public TLRPC.ChatFull f36099q2;
    public int f36100q3;
    public int f36101q4;
    public SpannableStringBuilder f36102q5;
    public final RectF q6;
    public final org.telegram.ui.ActionBar.h5[] f36103r;
    public jh.u0 f36104r0;
    public boolean f36105r1;
    public TLRPC.UserFull f36106r2;
    public int f36107r3;
    public int f36108r4;
    public SpannableStringBuilder f36109r5;
    public final RectF r6;
    public org.telegram.ui.Components.yn0 f36110s;
    public View f36111s0;
    public boolean f36112s1;
    public org.telegram.ui.Cells.d6 f36113s2;
    public int f36114s3;
    public int f36115s4;
    public nh.d[] f36116s5;
    public final org.telegram.ui.Components.d50 f36117t0;
    public boolean f36118t1;
    public boolean f36119t2;
    public int f36120t3;
    public int f36121t4;
    public org.telegram.messenger.v8 f36122t5;
    public final Paint f36123u0;
    public int f36124u1;
    public k01 f36125u2;
    public int f36126u3;
    public int f36127u4;
    public FrameLayout f36128u5;
    public org.telegram.ui.Components.aj0 v;
    public org.telegram.ui.ActionBar.c6 f36129v0;
    public boolean f36130v1;
    public CharSequence f36131v2;
    public int f36132v3;
    public int f36133v4;
    public nh.d f36134v5;
    public AnimatorSet f36135w;
    public int f36136w0;
    public boolean f36137w1;
    public long f36138w2;
    public int f36139w3;
    public int f36140w4;
    public final vd.a f36141w5;
    public Drawable f36142x;
    public ImageLocation f36143x0;
    public boolean f36144x1;
    public int f36145x2;
    public int f36146x3;
    public int x4;
    public sy0 f36147x5;
    public final Drawable[] f36148y;
    public int f36149y0;
    public a0.h f36150y1;
    public ArrayList f36151y2;
    public int f36152y3;
    public int f36153y4;
    public AnimatorSet f36154y5;
    public int f36155z0;
    public boolean f36156z1;
    public TLRPC.EncryptedChat f36157z2;
    public int f36158z3;
    public int f36159z4;
    public AnimatorSet f36160z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f9;
        RectF rectF = profileActivity.r6;
        lg.e eVar = profileActivity.f36048i6;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f36041h6) - AndroidUtilities.dp(8.0f);
            profileActivity.q6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            eVar.g(2, profileActivity.f36096p6);
            eVar.e(profileActivity.f36089o6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.qu0.w0(profileActivity.K.getClosestTab());
        if (i10 == profileActivity.f36011d6 && w02 == profileActivity.f36019e6) {
            return;
        }
        profileActivity.f36011d6 = i10;
        profileActivity.f36019e6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f36116s5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f36116s5[0].g(profileActivity.f36109r5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f36116s5[0].g(profileActivity.f36102q5, true, true);
        } else {
            profileActivity.f36116s5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        n00 n00Var = new n00(9);
        n00Var.f40666n = str;
        if (n00Var.f40663c != null) {
            n00Var.f40663c = null;
            n00Var.a();
        }
        n00Var.f40665f = i10;
        spannableStringBuilder.setSpan(n00Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z10) {
        float f9;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.R1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.R1.cancel();
        }
        jh.u0 u0Var = profileActivity.f36104r0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        float f10 = profileActivity.Q1;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        final float f11 = profileActivity.M1;
        profileActivity.f35991b.setTranslationY(f11);
        profileActivity.f35991b.setVisibility(0);
        profileActivity.Q0.setVisibility(0);
        profileActivity.f35984a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.U.setVisibility(0);
        profileActivity.f36020f[1].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        h5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.Q1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        lVar.v(z11);
        int i11 = 8;
        if (profileActivity.Q1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.P0;
        if (w0Var != null) {
            w0Var.setVisibility(i10);
        }
        profileActivity.Q0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.Q0.getSearchContainer();
        if (profileActivity.Q1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f35991b.setEmptyView(profileActivity.L);
        profileActivity.U.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new zy0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.Q4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.L.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        profileActivity.R1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        c2Var.f22783c0 = false;
        c2Var.show();
        Utilities.globalQueue.postRunnable(new mp0(c2Var, z10, activity, 4));
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

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.h5 h5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            ye.d.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        cg.f2 f2Var = new cg.f2(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f36129v0);
        h5Var.getLocationOnScreen(new int[2]);
        f2Var.f3138r0 = h5Var.f23485d0;
        f2Var.f3139s0 = h5Var.f23487e0;
        f2Var.f3142v0 = h5Var.getScaleX();
        f2Var.f3140t0 = h5Var.getLeft();
        f2Var.f3141u0 = h5Var.getTop();
        f2Var.f3143w0 = h5Var;
        Drawable rightDrawable = h5Var.getRightDrawable();
        org.telegram.ui.Components.n5 n5Var = n5VarArr[1];
        if (rightDrawable == n5Var && n5Var != null) {
            Drawable drawable = n5Var.f30849f[0];
            if (drawable instanceof org.telegram.ui.Components.p5) {
                f2Var.f3142v0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.p5) drawable).f31588e;
                if (document != null) {
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
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
                    t9Var.setLayerNum(7);
                    t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    t9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.p5) n5VarArr[1].f30849f[0]).c()) {
                        t9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, profileActivity.f36129v0), PorterDuff.Mode.SRC_IN));
                        f2Var.f3145y0 = MessageObject.getInputStickerSet(document);
                    } else {
                        f2Var.f3145y0 = MessageObject.getInputStickerSet(document);
                    }
                    f2Var.f3144x0 = t9Var;
                    f2Var.A0 = true;
                }
            }
        }
        profileActivity.showDialog(f2Var);
    }

    public static void V(ProfileActivity profileActivity) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
        by0 by0Var = profileActivity.f35984a;
        if (by0Var != null) {
            int childCount = by0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f35984a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    ((org.telegram.ui.Cells.sa) childAt).j(0);
                }
            }
            profileActivity.f35984a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, profileActivity.f36129v0));
        }
        if (!profileActivity.f36064l2) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var != null) {
                Object tag = h5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.v0(((Integer) tag).intValue(), profileActivity.f36129v0), Boolean.valueOf(profileActivity.F0[0])));
                    } else {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, profileActivity.f36129v0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f36142x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.M5 != null) {
                    v03 = -1;
                } else {
                    v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284pc, profileActivity.f36129v0);
                }
                drawable.setColorFilter(v03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.vl0 vl0Var = profileActivity.H;
            if (vl0Var != null) {
                vl0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23136h8, profileActivity.f36129v0));
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = profileActivity.f36020f[1];
            if (h5Var2 != null) {
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, profileActivity.f36129v0));
            }
            org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
            if (lVar != null) {
                if (profileActivity.M5 == null) {
                    i12 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
                }
                lVar.C(i12, false);
                org.telegram.ui.ActionBar.l lVar2 = profileActivity.actionBar;
                if (profileActivity.M5 != null) {
                    v02 = 553648127;
                } else {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23101f8, profileActivity.f36129v0);
                }
                lVar2.B(v02, false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z10;
        float f9;
        float min = Math.min(profileActivity.Y1, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f36069m1) {
            profileActivity.f36090p0.setAlpha(1.0f - min);
            profileActivity.f36090p0.setBlurIntensity(0.0f);
            profileActivity.f36090p0.setGooeyEnabled(false);
        } else {
            profileActivity.f36090p0.setPullProgress(profileActivity.Y1);
            profileActivity.f36090p0.setBlurIntensity(Math.min((i7.w.a(profileActivity.Y1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.oh0 oh0Var = profileActivity.f36090p0;
            float f10 = profileActivity.Y1;
            if (f10 > 0.0f && f10 < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            oh0Var.setGooeyEnabled(z10);
        }
        oy0 oy0Var = profileActivity.f36097q0;
        if (oy0Var != null && profileActivity.F1 != 2) {
            float f11 = profileActivity.Y1;
            if (f11 > 0.0f) {
                f9 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f));
            } else {
                f9 = 1.0f;
            }
            oy0Var.setAlpha(f9);
        }
        org.telegram.ui.Components.oh0 oh0Var2 = profileActivity.f36090p0;
        if (profileActivity.Y1 >= 1.0f) {
            i10 = 8;
        }
        oh0Var2.setVisibility(i10);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.R.K(0);
        profileActivity.S.K(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.mc Q = org.telegram.ui.Components.tc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f30652j = 5000;
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
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f22714a);
                return;
            }
            return;
        }
        j7.l1.v(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f9, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f36069m1;
                if (z10) {
                    if (z10) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f35986a1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f35993b1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f35993b1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f35993b1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new tn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f35993b1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new tn(bundle2), false);
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
                profileActivity.r4(profileActivity.W, f9, f10, true);
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
                y21.K(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(profileActivity.getParentActivity(), 3, profileActivity.f36129v0);
                c2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new lh.y1(7, profileActivity, c2Var), true, profileActivity.f36129v0);
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
                    org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(profileActivity, profileActivity.W);
                    H.f29603w = false;
                    H.f29582i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new fb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new vk0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new fb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f9 - AndroidUtilities.dp(8.0f), profileActivity.W.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new b81(null));
                return;
            default:
                return;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + profileActivity.f36014e1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.A2) && !profileActivity.A2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.c80.f27367r;
        org.telegram.ui.Components.c80.w(parentActivity, profileActivity, org.telegram.ui.Components.tc.a0(profileActivity), z11);
        if (!z10 || profileActivity.H4 != -1) {
            profileActivity.j5();
            vz0 vz0Var = profileActivity.d;
            if (vz0Var != null) {
                vz0Var.l();
            }
        }
        if (o2Var instanceof tn) {
            ((tn) o2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f9;
        org.telegram.ui.Components.mc h;
        if (profileActivity.F2 == null) {
            if (profileActivity.f36069m1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f35993b1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f22444id == profileActivity.f36001c1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f9 = org.telegram.ui.Components.p5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.tc.a0(profileActivity).h(f9, 1, new wx0(profileActivity, 0))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.K3()) {
                profileActivity.w4(false);
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f9, float f10) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        vz0 vz0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f35984a.B0();
        if (i10 == profileActivity.O3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1));
            TLRPC.UserFull userFull = profileActivity.f36106r2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                jh.b0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f35986a1, new au(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new ph.j(profileActivity.f35986a1));
            }
        } else if (i10 == profileActivity.M3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f36001c1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f36001c1, z10);
            org.telegram.ui.Components.tc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.M3;
            if (i11 < 0 || (vz0Var = profileActivity.d) == null) {
                return;
            }
            vz0Var.m(i11);
        } else if (i10 == profileActivity.V3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f22539id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.Z4);
            bundle.putString("first_name_card", profileActivity.f35989a5);
            bundle.putString("last_name_card", profileActivity.f35997b5);
            hs hsVar = new hs(bundle, profileActivity.f36129v0);
            hsVar.K = new fx0(profileActivity, user3);
            profileActivity.presentFragment(hsVar);
        } else if (i10 == profileActivity.S3) {
            TextView textView = (TextView) org.telegram.ui.Components.c5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new wx0(profileActivity, 1), profileActivity.f36129v0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        } else if (i10 == profileActivity.T3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36129v0);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.W4));
            org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(profileActivity.getParentActivity(), 1, profileActivity.f36129v0);
                y1VarArr[0] = y1Var;
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                y1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(y1VarArr[0], i7.f6.n(-1, -2));
                y1VarArr[0].setOnClickListener(new e20(y1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new kl0(14, profileActivity, y1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xx0(0));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        } else if (i10 == profileActivity.f36080n4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f36014e1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.o2(bundle2));
        } else if (i10 == profileActivity.f36072m4) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.V(profileActivity.getParentActivity(), profileActivity.f36157z2, profileActivity.f36129v0).f22714a);
        } else if (i10 == profileActivity.J3) {
            profileActivity.r4(view, f9, f10, false);
        } else if (i10 == profileActivity.G4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f35986a1);
            if (org.telegram.ui.Components.tc.a(profileActivity)) {
                org.telegram.ui.Components.tc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.W3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (i10 == profileActivity.Q3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.R3) {
            y21.K(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f36101q4 && i10 < profileActivity.f36108r4) {
            if (!profileActivity.f36151y2.isEmpty()) {
                chatParticipant = profileActivity.f36099q2.participants.participants.get(((Integer) profileActivity.f36151y2.get(i10 - profileActivity.f36101q4)).intValue());
            } else {
                chatParticipant = profileActivity.f36099q2.participants.participants.get(i10 - profileActivity.f36101q4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f36115s4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.H3) {
            profileActivity.C4(f9, f10, i10, view);
        } else if (i10 == profileActivity.f36039h4) {
            if (profileActivity.A2 != null) {
                profileActivity.showDialog(new qh.i0(profileActivity, profileActivity.A2.linked_community_id, null, null));
            } else if (profileActivity.f35986a1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1))) == null) {
            } else {
                profileActivity.showDialog(new qh.i0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.E3) {
            if (profileActivity.f36099q2.location instanceof TLRPC.TL_channelLocation) {
                rc0 rc0Var = new rc0(5);
                rc0Var.f42033a0 = -profileActivity.f35993b1;
                rc0Var.f42060v0 = (TLRPC.TL_channelLocation) profileActivity.f36099q2.location;
                profileActivity.presentFragment(rc0Var);
            }
        } else if (i10 == profileActivity.H4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f36121t4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f35993b1);
            bundle3.putInt("type", 2);
            jr jrVar = new jr(bundle3);
            jrVar.x0(profileActivity.f36099q2);
            profileActivity.presentFragment(jrVar);
        } else if (i10 == profileActivity.f36127u4) {
            profileActivity.presentFragment(new ih0(profileActivity.f35993b1));
        } else if (i10 == profileActivity.f36133v4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f35993b1);
            bundle4.putInt("type", 1);
            jr jrVar2 = new jr(bundle4);
            jrVar2.x0(profileActivity.f36099q2);
            profileActivity.presentFragment(jrVar2);
        } else if (i10 == profileActivity.f36140w4) {
            profileActivity.O0.performClick();
        } else if (i10 == profileActivity.x4) {
            profileActivity.presentFragment(new jh.q(0, profileActivity.f35986a1));
        } else if (i10 == profileActivity.f36153y4) {
            profileActivity.presentFragment(new jh.q(1, profileActivity.f35986a1));
        } else if (i10 == profileActivity.f36159z4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f35993b1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new t91(bundle5));
        } else if (i10 == profileActivity.C4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f35993b1);
            bundle6.putInt("type", 0);
            jr jrVar3 = new jr(bundle6);
            jrVar3.x0(profileActivity.f36099q2);
            profileActivity.presentFragment(jrVar3);
        } else if (i10 == profileActivity.f35995b3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f36008d3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.D2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f36016e3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f36024f3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f36031g3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f36045i3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f36038h3) {
            profileActivity.presentFragment(new ub0());
        } else if (i10 == profileActivity.f36052j3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f36071m3) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.U(profileActivity, profileActivity.f36129v0));
        } else if (i10 == profileActivity.f36079n3) {
            ye.d.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f36086o3) {
            ye.d.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f36107r3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f36114s3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f36120t3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.f36126u3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36129v0);
            alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new ex0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f22714a);
        } else if (i10 == profileActivity.c3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.R2) {
            profileActivity.presentFragment(new la(null));
        } else if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.P2) {
            profileActivity.presentFragment(new i(3));
        } else if (i10 == profileActivity.K2) {
            profileActivity.u4();
        } else if (i10 == profileActivity.Y3) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.Z3) {
            profileActivity.presentFragment(new jh.ia());
        } else if (i10 == profileActivity.f35988a4) {
            profileActivity.presentFragment(new oh.g());
        } else if (i10 == profileActivity.f35996b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f36003c4) {
            eg.w2.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            ph.q0 q0Var = profileActivity.f36085o2;
            if (q0Var != null) {
                q0Var.m(!q0Var.g(), new av0(14, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            ph.p pVar = profileActivity.f36092p2;
            if (pVar != null) {
                pVar.f45945f = true;
                pVar.f45944e = !pVar.f45944e;
                pVar.k();
                ((org.telegram.ui.Cells.m8) view).setChecked(profileActivity.f36092p2.f45944e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.setChecked(!m8Var.b());
            if (profileActivity.f36060k4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f36060k4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f35986a1);
            boolean b10 = m8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f36106r2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new u80(18, profileActivity, r0));
            profileActivity.f36060k4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.K3) {
            profileActivity.J4 = !profileActivity.J4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.K3);
            int i12 = profileActivity.Q5;
            if (i12 >= 0) {
                profileActivity.f35999c.h1(i12, profileActivity.R5 - profileActivity.f35984a.getPaddingTop());
            }
        } else if (i10 == profileActivity.L3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.M2) {
            if (profileActivity.f36106r2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f36106r2.personal_channel_id);
            profileActivity.presentFragment(new tn(bundle7));
        } else if (i10 == profileActivity.Q2) {
            n01 n01Var = profileActivity.Y5;
            if ((n01Var == null || !n01Var.a()) && !profileActivity.J3(i10, view)) {
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (w8Var.d.getDrawable() != null) {
                    profileActivity.t4(w8Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.D3) {
            profileActivity.I3(i10, view);
        } else {
            profileActivity.C4(f9, f10, i10, view);
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.y1[] y1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f35986a1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.W4);
        tL_messages_reportReaction.f22498id = profileActivity.V4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new lh.o5(5));
        org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
        if (y1Var != null && y1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.W4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1)));
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.tc.a0(profileActivity).E(profileActivity.f36129v0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.E2 = fileLocation;
            profileActivity.F2 = photoSize2.location;
            profileActivity.f35985a0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f36063l0, null);
            if (profileActivity.K2 != -1) {
                profileActivity.j5();
                vz0 vz0Var = profileActivity.d;
                if (vz0Var != null) {
                    vz0Var.l();
                }
                profileActivity.k4(true);
            }
            my0 my0Var = profileActivity.f36049j0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.F2);
            profileActivity.G2 = forLocal;
            my0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.E2));
            profileActivity.P4(true, false);
        } else if (profileActivity.E2 == null) {
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
            profileActivity.O5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new u80(20, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f35986a1;
        if (j10 == 0) {
            long j11 = profileActivity.f35993b1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f36014e1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.W4, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.W4, j12, profileActivity.V4);
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(profileActivity.getParentActivity(), profileActivity.f36129v0);
        ubVar.d(R.raw.chats_infotip, new String[0]);
        ubVar.f33185b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.tc.a0(profileActivity).b(ubVar, 1500).j();
    }

    public static void f0(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f0(org.telegram.ui.ProfileActivity, int):void");
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
                TLRPC.UserFull userFull = profileActivity.f36106r2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.X.list.isEmpty()) {
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
            profileActivity.showDialog(new org.telegram.ui.Components.g8(profileActivity.getParentActivity(), profileActivity.f36129v0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.vb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new fb0(profileActivity, 18), profileActivity.f36129v0);
    }

    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        LinearLayout linearLayout;
        int i10;
        int v02;
        boolean z11;
        long j10;
        char c3;
        final LimitPreviewView limitPreviewView;
        float f9;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f36106r2;
        if (userFull != null && userFull.stars_rating != null) {
            ?? r52 = 0;
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(profileActivity.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            runnable = f3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f36129v0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView2.setHideNegativeValues(z10);
            limitPreviewView2.setStarRating(userFull.stars_rating);
            limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView2, i7.f6.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, i7.f6.t(-1, -2, 17, 40, -12, 40, 20));
                TextView[] textViewArr = new org.telegram.ui.Components.y80[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    cg.c2 c2Var = new cg.c2(parentActivity, 5, r52);
                    textViewArr[i11] = c2Var;
                    c2Var.setGravity(17);
                    textViewArr[i11].setTextSize(1, 12.0f);
                    textViewArr[i11].setTextColor(org.telegram.ui.ActionBar.g6.w0(r52, org.telegram.ui.ActionBar.g6.f23433y6, false));
                    textViewArr[i11].setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(r52, org.telegram.ui.ActionBar.g6.gc, false));
                    frameLayout.addView(textViewArr[i11], i7.f6.e(-1, -1, 119));
                    TextView textView = textViewArr[i11];
                    if (i11 == 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    textView.setAlpha(f9);
                    TextView textView2 = textViewArr[i11];
                    if (i11 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    textView2.setScaleX(f10);
                    TextView textView3 = textViewArr[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView3.setScaleY(f11);
                    i11++;
                    r52 = 0;
                }
                final x3 x3Var = new x3(textViewArr, 17);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
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
                if ((j14 < 0 && !z11) || (z11 && j12 > 0)) {
                    boolean z12 = z11;
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    if (z12) {
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
                                    x3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    x3Var.run(Boolean.FALSE);
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
                                    x3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    x3Var.run(Boolean.FALSE);
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
                                x3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                x3Var.run(Boolean.FALSE);
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
                                x3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                x3Var.run(Boolean.FALSE);
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
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, profileActivity.f36129v0));
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView4, i7.f6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f22540id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.x3.r(R.string.StarRatingSelfDescription, textView5);
                i10 = 1;
            } else {
                i10 = 1;
                b.p(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i10, 14.0f);
            textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, profileActivity.f36129v0));
            linearLayout3.addView(textView5, i7.f6.t(-1, -2, 17, 20, 0, 20, 12));
            qv0 qv0Var = new qv0(parentActivity, profileActivity.f36129v0);
            qv0Var.f41784a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i14 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i15 = org.telegram.ui.ActionBar.g6.Oh;
            qv0Var.f41785b.setText(LocaleController.formatSpannable(i14, G3(org.telegram.ui.ActionBar.g6.v0(i15, profileActivity.f36129v0), string)));
            qv0Var.d.setVisibility(8);
            int i16 = R.drawable.menu_gift;
            ImageView imageView = qv0Var.f41786c;
            imageView.setImageResource(i16);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, profileActivity.f36129v0));
            linearLayout3.addView(qv0Var, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var2 = new qv0(parentActivity, profileActivity.f36129v0);
            qv0Var2.f41784a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            qv0Var2.f41785b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.g6.v0(i15, profileActivity.f36129v0), LocaleController.getString(R.string.StarRatingAdded))));
            qv0Var2.d.setVisibility(8);
            int i17 = R.drawable.menu_stars_gift;
            ImageView imageView2 = qv0Var2.f41786c;
            imageView2.setImageResource(i17);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, profileActivity.f36129v0));
            linearLayout3.addView(qv0Var2, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var3 = new qv0(parentActivity, profileActivity.f36129v0);
            qv0Var3.f41784a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i18 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.g6.I.q()) {
                v02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, profileActivity.f36129v0), -16777216);
            } else {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, profileActivity.f36129v0);
            }
            qv0Var3.f41785b.setText(LocaleController.formatSpannable(i18, G3(v02, string2)));
            qv0Var3.d.setVisibility(8);
            int i19 = R.drawable.menu_refund;
            ImageView imageView3 = qv0Var3.f41786c;
            imageView3.setImageResource(i19);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, profileActivity.f36129v0));
            linearLayout3.addView(qv0Var3, i7.f6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            nh.d dVar = new nh.d(parentActivity, profileActivity.f36129v0, true);
            dVar.setOnClickListener(new vx0(0, runnable));
            dVar.g(jh.h5.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, i7.f6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            f3Var.customView = linearLayout3;
            f3Var.show();
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.V3 >= 0) {
            if (profileActivity.F4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.F4 == -1) {
            if (!profileActivity.f36051j2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f35984a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f35984a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    vz0 vz0Var = profileActivity.d;
                    if (i12 >= vz0Var.f43803e.J2) {
                        break;
                    }
                    f2.n1 g10 = vz0Var.g(null, vz0Var.j(i12));
                    View view = g10.f6432a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                by0 by0Var = profileActivity.f35984a;
                by0Var.setPadding(0, by0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f35984a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f36023f2.cancel();
                float[] fArr = profileActivity.f36044i2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.M1 = profileActivity.T3();
            }
        }
        profileActivity.I.m(profileActivity.f36014e1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ph.d3.G0(context, profileActivity.currentAccount, profileActivity.f36106r2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f36129v0, false);
        } else {
            ph.d3.H0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f36129v0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f9, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.Q1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f9;
        profileActivity.P1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.f35991b.setTranslationY(floatValue * f9);
        profileActivity.L.setTranslationY(f9 * profileActivity.Q1);
        profileActivity.f35984a.setTranslationY((1.0f - profileActivity.Q1) * f12);
        profileActivity.f35984a.setScaleX(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.f35984a.setScaleY(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.f35984a.setAlpha(profileActivity.Q1);
        boolean z11 = true;
        profileActivity.k4(true);
        profileActivity.f35984a.setAlpha(f10);
        profileActivity.f35991b.setAlpha(1.0f - profileActivity.Q1);
        profileActivity.f35991b.setScaleX((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.f35991b.setScaleY((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.L.setAlpha(1.0f - f10);
        profileActivity.U.setAlpha(f10);
        profileActivity.f35985a0.setAlpha(f10);
        oy0 oy0Var = profileActivity.f36097q0;
        if (oy0Var != null) {
            oy0Var.setAlpha(f10);
        }
        profileActivity.f36020f[1].setAlpha(f10);
        h5VarArr[1].setAlpha(f10);
        h5VarArr[3].setAlpha(f10);
        profileActivity.Q0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.Q1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
            if (w0Var.B.getWidth() != 0 && !w0Var.f23920e.isFocused()) {
                w0Var.f23920e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.f23920e);
            }
        }
        FrameLayout searchContainer = profileActivity.Q0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.Q1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.Q1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.P0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i11);
            profileActivity.P0.setAlpha(f10);
        }
        profileActivity.Q0.setVisibility(i11);
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (profileActivity.Q1 >= 0.5f) {
            z11 = false;
        }
        lVar.v(z11);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.P0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f10);
        }
        profileActivity.Q0.setAlpha(f10);
        profileActivity.Z0.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.uz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f36129v0);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22416id;
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
                String l10 = a4.w.l(profileActivity.E2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.F2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.F2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f22539id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35986a1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f36051j2 && profileActivity.f35985a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f36058k2 = z10;
        profileActivity.E2 = null;
        profileActivity.F2 = null;
        my0 my0Var = profileActivity.f36049j0;
        my0Var.D0 = true;
        my0Var.G0 = profileActivity.G2;
        my0Var.f30057m1 = null;
        my0Var.f30058n1 = null;
        my0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36020f;
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f36103r;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f35984a.setVisibility(i10);
        org.telegram.ui.Components.jl0 jl0Var = profileActivity.f35991b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        jl0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.Q0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        jh.u0 u0Var = profileActivity.f36104r0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.U.setVisibility(i10);
        oy0 oy0Var = profileActivity.f36097q0;
        if (oy0Var != null) {
            oy0Var.setVisibility(i10);
        }
        h5VarArr[1].setVisibility(i10);
        h5VarArr2[1].setVisibility(i10);
        h5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.P0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.P0.setVisibility(i10);
        }
        profileActivity.Q0.setVisibility(i10);
        profileActivity.f35985a0.setAlpha(1.0f);
        profileActivity.U.setAlpha(1.0f);
        oy0 oy0Var2 = profileActivity.f36097q0;
        if (oy0Var2 != null) {
            oy0Var2.setAlpha(1.0f);
        }
        jh.u0 u0Var2 = profileActivity.f36104r0;
        if (u0Var2 != null) {
            u0Var2.setAlpha(1.0f);
        }
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr2[1].setAlpha(1.0f);
        profileActivity.Q0.setAlpha(1.0f);
        profileActivity.f35984a.setAlpha(1.0f);
        profileActivity.f35991b.setAlpha(1.0f);
        profileActivity.L.setAlpha(1.0f);
        if (z10) {
            profileActivity.f35991b.setEmptyView(profileActivity.L);
        } else {
            profileActivity.L.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f35985a0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.h61) {
            profileActivity.f35985a0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
            profileActivity.f35985a0.u(null, null, c6Var);
            if (z10) {
                c6Var.f(profileActivity.f35985a0);
            }
        } else {
            ImageLocation D = profileActivity.f36049j0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f35985a0.u(D, str, drawable);
        }
    }

    public final void A3() {
        f2.n1 n1Var;
        View view;
        int top;
        int i10;
        boolean z10;
        float f9;
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
        if (this.f35984a.getVisibility() == 0) {
            if (this.M) {
                this.K.setVisibleHeight(this.f35984a.getMeasuredHeight() - this.K.getTop());
            }
            if (this.f35984a.getChildCount() > 0 && !this.C1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    n1Var = null;
                    if (i11 < this.f35984a.getChildCount()) {
                        if (RecyclerView.R(this.f35984a.getChildAt(i11)) == 0) {
                            view = this.f35984a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    by0 by0Var = this.f35984a;
                    View F = by0Var.F(view);
                    if (F != null) {
                        n1Var = by0Var.T(F);
                    }
                    n1Var = (org.telegram.ui.Components.vk0) n1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (n1Var != null) {
                    i10 = n1Var.b();
                } else {
                    i10 = -1;
                }
                top = (top < 0 || i10 != 0) ? 0 : 0;
                if (this.m0 == null && this.actionBar.f23612j0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.F4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f35984a.K(i12);
                    if (vk0Var != null && vk0Var.f6432a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.B5 != z10) {
                    this.B5 = z10;
                    AnimatorSet animatorSet = this.f36154y5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.f36160z5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    org.telegram.ui.ActionBar.w0 searchItem = this.K.getSearchItem();
                    org.telegram.ui.Components.aj0 searchOptionsItem = this.K.getSearchOptionsItem();
                    TextView saveItem = this.K.getSaveItem();
                    if (!this.B5) {
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
                    } else {
                        hz0 hz0Var = this.K;
                        if (hz0Var.s0(hz0Var.f32070g0[0].B)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        hz0 hz0Var2 = this.K;
                        int i13 = hz0Var2.f32070g0[0].B;
                        if (i13 != 0 && !org.telegram.ui.Components.qu0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || hz0Var2.R == null)) {
                            this.K.f32083n0.setVisibility(4);
                            this.K.A(false, false);
                        } else {
                            this.K.f32083n0.setVisibility(0);
                            this.K.A(true, false);
                        }
                    }
                    l5(false);
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null) {
                        lVar.n().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.w0 w0Var = this.M0;
                    Property property = View.ALPHA;
                    float f22 = 1.0f;
                    if (z10) {
                        f9 = 0.0f;
                    } else {
                        f9 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f9));
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.N0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f10));
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.P0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var3, property, f11));
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.O0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f12));
                    org.telegram.ui.ActionBar.w0 w0Var5 = this.M0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var5, property2, f13));
                    org.telegram.ui.ActionBar.w0 w0Var6 = this.N0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var6, property2, f14));
                    org.telegram.ui.ActionBar.w0 w0Var7 = this.P0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(w0Var7, property2, f15));
                    org.telegram.ui.ActionBar.w0 w0Var8 = this.O0;
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
                    ImageView imageView = this.K.f32083n0;
                    if (z10) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f18));
                    ImageView imageView2 = this.K.f32083n0;
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
                    arrayList.add(ObjectAnimator.ofFloat(lVar2, this.C5, f19));
                    org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36103r;
                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, f20));
                    this.K.E0.setOpen(z10);
                    if (this.f36084o1) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[3];
                        if (z10) {
                            f21 = 0.0f;
                        } else {
                            f21 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(h5Var2, property, f21));
                    }
                    org.telegram.ui.Components.yn0 yn0Var = this.f36110s;
                    if (!z10) {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(yn0Var, property, f22));
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f36026f5, 0.0f));
                    }
                    if (this.f36097q0 != null || this.f36104r0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new jx0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.f36154y5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.f36154y5.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    this.f36154y5.addListener(new org.telegram.ui.Components.ok0(12, this, searchItem));
                    this.f36154y5.setDuration(150L);
                    this.f36154y5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f23 = top;
                if (this.M1 != f23 && !this.D1) {
                    this.M1 = f23;
                    this.Z0.invalidate();
                    if (this.F1 != 0) {
                        if (this.M1 > O3()) {
                            z11 = true;
                        }
                        this.I1 = z11;
                    }
                    k4(true);
                }
            }
        }
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        ty0 ty0Var = new ty0(this, user.f22539id, this.f35993b1, tL_chatAdminRights, this.A2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        ty0Var.T0 = new uy0(this, i10, chatParticipant, z10, zArr);
        presentFragment(ty0Var);
    }

    public final void B3() {
        float alpha;
        int i10 = this.F1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36103r;
        if (i10 == 1 && (!this.f36040h5 || this.C1)) {
            this.U5 = 0.0f;
        } else if (i10 == 2 && (!this.f36040h5 || this.C1)) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = h5Var.getAlpha();
            }
            this.U5 = alpha;
        } else if (this.f35986a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.U5 = (1.0f - this.f36054j5) * this.f36030g2;
        } else {
            this.U5 = this.f36030g2 * this.f36054j5;
        }
        if (this.f35986a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.f36067l5) {
                this.f36061k5 = AndroidUtilities.dp(28.0f) * this.U5;
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[2];
                if (h5Var2 != null) {
                    h5Var2.setAlpha(this.f36030g2);
                    h5VarArr[3].setAlpha(1.0f - this.f36030g2);
                    h5VarArr[1].setTranslationX(W3(this.V5));
                    this.V.invalidate();
                    h01 h01Var = this.X5;
                    if (h01Var != null) {
                        h01Var.f38714e = 1.0f - this.f36030g2;
                        h01Var.invalidateSelf();
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
            h01 h01Var2 = this.X5;
            if (h01Var2 != null) {
                h01Var2.f38714e = 1.0f;
                h01Var2.invalidateSelf();
            }
        } else if (this.f36073m5) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[2];
            if (h5Var4 != null) {
                h5Var4.setAlpha(this.U5);
            }
            h01 h01Var3 = this.X5;
            if (h01Var3 != null) {
                h01Var3.f38714e = 1.0f - this.U5;
                h01Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[2];
            if (h5Var5 != null) {
                h5Var5.setAlpha(0.0f);
            }
            h01 h01Var4 = this.X5;
            if (h01Var4 != null) {
                h01Var4.f38714e = 1.0f;
                h01Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (o2Var instanceof tn) {
                    finishFragment();
                    ((tn) o2Var).U.a1(null, str, false, false);
                }
            }
        } else {
            fy fyVar = new fy(null);
            fyVar.f38305j2 = str;
            presentFragment(fyVar);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C3() {
        boolean z10;
        org.telegram.ui.Components.aw0 aw0Var = this.P;
        if (aw0Var != null) {
            if (!this.B5 && this.D5) {
                z10 = true;
            } else {
                z10 = false;
            }
            aw0Var.setVisibility(z10);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void D(float f9) {
        org.telegram.ui.Cells.w3 w3Var = this.f36000c0;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(f9);
        this.f36049j0.O(this.G2, f9);
    }

    public final void D3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f36064l2 && (valueAnimator = this.f36023f2) != null && valueAnimator.isRunning()) {
            this.a2 = this.G5;
            this.f36002c2 = this.H5;
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

    @Override
    public final void E() {
        G4(false);
    }

    public final void E3(Context context) {
        int i10;
        this.W0 = new org.telegram.ui.Components.m8(context, this.P0.getPopupLayout().getSwipeBack(), new ay0(this), false, 0, this.f36129v0);
        if (this.f36014e1 > 0 || this.f35986a1 > 0) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, this.f36129v0);
            org.telegram.ui.Components.m8 m8Var = this.W0;
            org.telegram.ui.Components.y80 y80Var = m8Var.f30597e;
            if (y80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.ig(m8Var, 10)));
                y80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f36106r2;
        if (userFull == null && this.f36099q2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f36099q2.ttl_period;
        }
        org.telegram.ui.Components.m11 a2 = org.telegram.ui.Components.m11.a(i10);
        this.f36083o0 = a2;
        this.V0 = this.P0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.W0.f30594a);
        this.P0.a(-1);
        T4();
    }

    public final void E4(float f9, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.M1 - T3()) / ((this.f35984a.getMeasuredWidth() - f10) - U3())));
        if (this.M1 < T3() && max < 0.33f) {
            lerp = com.google.android.recaptcha.internal.a.y(f9, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = (1.0f + f9) * (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f);
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f9) + ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i10) - (AndroidUtilities.density * 21.0f))));
        this.a2 = (AndroidUtilities.dp(7.0f) * f9) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f36002c2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f9) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView != null && this.T5 && this.f36125u2 != null && getParentActivity() != null) {
            n01 n01Var = this.Y5;
            if (n01Var != null) {
                n01Var.b(this.f36125u2);
                this.Y5.invalidate();
                return;
            }
            n01 n01Var2 = new n01(this, this.f36125u2);
            this.Y5 = n01Var2;
            ((FrameLayout) this.fragmentView).addView(n01Var2, i7.f6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        by0 by0Var = this.f35984a;
        if (by0Var != null && this.f35999c != null && by0Var.getChildCount() > 0 && !this.S5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f35984a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f35984a.getChildAt(i12));
                View childAt = this.f35984a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.Q5 = i11;
                int top = view.getTop();
                this.R5 = top;
                if (this.Q5 == 0 && !this.f36058k2 && top > T3()) {
                    this.R5 = T3();
                }
                this.f35999c.h1(i11, view.getTop() - this.f35984a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.F4;
        if (i10 >= 0) {
            if (z10) {
                uh.n nVar = new uh.n(getParentActivity(), 2, 0.6f);
                nVar.f6373a = this.F4;
                nVar.f49306p = -this.f35984a.getPaddingTop();
                this.f35999c.w0(nVar);
                return;
            }
            this.f35999c.h1(i10, -this.f35984a.getPaddingTop());
        }
    }

    public final void H3(float f9) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f9 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.P5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.P5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f9);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f36117t0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new jx0(this, 1));
        this.P5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.P5;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.P5.addListener(new yy0(this, 4));
        }
        this.P5.start();
    }

    public final void I3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
        H.W(this.f35984a.V0(view, false));
        H.f29603w = false;
        if (this.f36106r2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new fb0(this, 25), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new fb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.i8(this, i10, 24), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.zg0 zg0Var = this.W;
        if (zg0Var != null) {
            if (this.f36084o1) {
                zg0Var.D = 6;
            } else if (this.f36069m1) {
                zg0Var.D = 5;
            } else if (this.f36078n2) {
                zg0Var.D = 2;
            } else if (this.f35986a1 != 0) {
                zg0Var.D = 0;
            } else if (this.f35993b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35993b1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.W.D = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.W.D = 4;
                        return;
                    } else {
                        this.W.D = 1;
                        return;
                    }
                }
                this.W.D = 3;
            }
        }
    }

    @Override
    public final boolean J(fy fyVar) {
        return false;
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f36084o1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f36106r2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f22539id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.G3 && i10 != this.F3 && i10 != this.S2) {
                    if (i10 == this.K3) {
                        str = sf.x0.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                        string = LocaleController.getString(R.string.ProfileHoursCopy);
                    } else if (i10 == this.L3) {
                        str = userFull.business_location.address;
                        string = LocaleController.getString(R.string.ProfileLocationCopy);
                    } else if (i10 == this.H3) {
                        str = UserObject.getPublicUsername(currentUser);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        string = LocaleController.getString(R.string.ProfileCopyUsername);
                    } else if (i10 == this.C3) {
                        str = currentUser.phone;
                    } else if (i10 == this.Q2) {
                        str = UserInfoActivity.Z(this.f36106r2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
                H.W(this.f35984a.V0(view, false));
                H.f29603w = false;
                H.f29582i = 3;
                if (i10 == this.L3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new fb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new fb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new vk0(str, 26), false);
                }
                if (i10 == this.K3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new fb0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f39364b;

                        {
                            this.f39364b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f39364b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f22714a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f39364b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f22714a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new fb0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f39364b;

                        {
                            this.f39364b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f39364b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f22714a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f39364b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f22714a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.H3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new fb0(this, 10), false);
                } else if (i10 != this.G3 && i10 != this.F3 && i10 != this.S2) {
                    if (i10 == this.C3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new fb0(this, 12), false);
                    } else if (i10 == this.Q2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f39057b;

                            {
                                this.f39057b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f39057b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.c5.m(parentActivity, string2, string3, userFull2.birthday, new yu0(1, profileActivity, userFull2), new fb0(profileActivity, 13), false, false, profileActivity.f36129v0).f22729a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity3, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f22714a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f22714a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f39057b;

                            {
                                this.f39057b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f39057b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.c5.m(parentActivity, string2, string3, userFull2.birthday, new yu0(1, profileActivity, userFull2), new fb0(profileActivity, 13), false, false, profileActivity.f36129v0).f22729a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f22714a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f22714a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.M2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new av0(10, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new fb0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f39057b;

                            {
                                this.f39057b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f39057b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.c5.m(parentActivity, string2, string3, userFull2.birthday, new yu0(1, profileActivity, userFull2), new fb0(profileActivity, 13), false, false, profileActivity.f36129v0).f22729a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f22714a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f39057b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() {
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
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f22714a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new fb0(this, 11), false);
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
        org.telegram.ui.Cells.w3 w3Var = this.f36000c0;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(0.0f);
    }

    public final boolean K3() {
        f2.n1 n1Var;
        View view;
        if ((this.E0 || (!AndroidUtilities.isTablet() && !this.f36051j2)) && this.f35985a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.B0 = true;
            this.f36058k2 = true;
            int i10 = 0;
            while (true) {
                n1Var = null;
                if (i10 < this.f35984a.getChildCount()) {
                    if (RecyclerView.R(this.f35984a.getChildAt(i10)) == 0) {
                        view = this.f35984a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                by0 by0Var = this.f35984a;
                View F = by0Var.F(view);
                if (F != null) {
                    n1Var = by0Var.T(F);
                }
                if (n1Var != null) {
                    Integer num = (Integer) this.U1.get(Integer.valueOf(n1Var.b()));
                    if (num != null) {
                        this.L1 = true;
                        this.f35984a.v0(0, -(((this.f35984a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.jr.h);
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
        this.f36099q2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f36043i1 == 0) {
                this.f36043i1 = -j10;
                getMediaDataController().getMediaCounts(this.f36043i1, this.f36001c1, this.classGuid);
            }
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setChatInfo(this.f36099q2);
        }
        my0 my0Var = this.f36049j0;
        if (my0Var != null && !this.f36069m1) {
            my0Var.setChatInfo(this.f36099q2);
        }
        oy0 oy0Var = this.f36097q0;
        if (oy0Var != null && (chatFull3 = this.f36099q2) != null) {
            oy0Var.setStories(chatFull3.stories);
        }
        jh.u0 u0Var = this.f36104r0;
        if (u0Var != null) {
            u0Var.a();
        }
        ly0 ly0Var = this.f35985a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        L3();
        if (this.f35993b1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f36099q2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.P0.I(38, z10);
            org.telegram.ui.Components.zg0 zg0Var = this.W;
            if (zg0Var != null) {
                zg0Var.o(3, z10);
            }
        }
    }

    @Override
    public final void L() {
        org.telegram.ui.Components.iu0 iu0Var;
        hz0 hz0Var = this.K;
        if (hz0Var != null && (iu0Var = this.N) != null) {
            hz0Var.setNewMediaCounts(iu0Var.f29477c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f36106r2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.A2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f36099q2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f36099q2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f36099q2.participants.participants.get(i10);
                    this.f36150y1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.V != null && (tL_emojiStatusCollectible2 = this.c6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.c6 = tL_emojiStatusCollectible;
                nh.t3 t3Var = this.Z5;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f35998b6 = null;
                    this.Z5 = new nh.t3(getParentActivity(), 3);
                    this.f35990a6 = org.telegram.ui.ActionBar.g6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.Z5.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    nh.t3 t3Var2 = this.Z5;
                    int l1 = org.telegram.ui.ActionBar.g6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    t3Var2.f18615w0 = true;
                    t3Var2.E0 = System.currentTimeMillis();
                    t3Var2.f18617x0 = new Path();
                    t3Var2.f18619y0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    t3Var2.f18620z0 = new Paint(1);
                    t3Var2.A0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, l1), org.telegram.ui.ActionBar.g6.l1(1.0f, l1), org.telegram.ui.ActionBar.g6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    t3Var2.D0 = linearGradient;
                    t3Var2.A0.setShader(linearGradient);
                    t3Var2.B0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, l1), org.telegram.ui.ActionBar.g6.l1(0.5f, l1), org.telegram.ui.ActionBar.g6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    t3Var2.C0 = new Matrix();
                    t3Var2.f18620z0.setShader(t3Var2.B0);
                    t3Var2.A0.setStyle(Paint.Style.STROKE);
                    t3Var2.A0.setStrokeJoin(Paint.Join.ROUND);
                    t3Var2.A0.setStrokeCap(Paint.Cap.ROUND);
                    t3Var2.A0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.V.addView(this.Z5, i7.f6.c(24.0f, -1));
                    this.Z5.u(9.33f);
                    nh.t3 t3Var3 = this.Z5;
                    Typeface bold = AndroidUtilities.bold();
                    t3Var3.D.u(bold);
                    t3Var3.F.setTypeface(bold);
                    this.Z5.t(tL_emojiStatusCollectible.title);
                    nh.t3 t3Var4 = this.Z5;
                    t3Var4.d = -1L;
                    t3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
                    nh.t3 t3Var5 = this.Z5;
                    t3Var5.getClass();
                    t3Var5.f18618y = AndroidUtilities.dpf2(4.0f);
                    t3Var5.A = AndroidUtilities.dpf2(2.66f);
                    this.Z5.s();
                    this.Z5.r(16.0f);
                    this.Z5.v();
                    this.Z5.setOnClickListener(new sx0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.M1 < AndroidUtilities.dp(82.0f)) {
                        this.f35998b6 = Boolean.FALSE;
                        this.Z5.setAlpha(0.0f);
                    }
                    V4();
                    nh.t3 t3Var6 = this.Z5;
                    Objects.requireNonNull(t3Var6);
                    AndroidUtilities.runOnUIThread(new vk0(t3Var6, 27), 6000L);
                }
            }
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (this.F1 != 0 && (b5Var = this.parentLayout) != null && b5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof tn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(oz0 oz0Var) {
        if (this.f36018e5 == oz0Var) {
            return;
        }
        this.f36018e5 = oz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f35984a, (f5.d) new nx0(this, 0));
    }

    public final void N3() {
        if (this.f35984a == null) {
            return;
        }
        float measuredWidth = (this.f35984a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.U.getLayoutParams()).width * this.X1) * 0.5f);
        this.V1 = measuredWidth;
        if (this.C1) {
            this.V1 = AndroidUtilities.lerp(this.K5, measuredWidth, this.O1);
        }
        this.U.setTranslationX(this.V1);
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
            this.G1 = z10;
            if (i10 != 0) {
                z11 = true;
            }
            this.H1 = z11;
            k5();
            if (globalMainSettings.getBoolean("view_animations", true)) {
                this.F1 = i10;
            } else if (i10 == 2) {
                this.f36050j1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f35986a1 != 0 && this.m0 != null && !this.f36084o1) {
            return 0;
        }
        if (this.E4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.d6 d6Var, k01 k01Var) {
        boolean z10;
        this.f36106r2 = userFull;
        org.telegram.ui.Components.aw0 aw0Var = this.P;
        if (aw0Var != null) {
            aw0Var.set(userFull.stars_rating);
        }
        oy0 oy0Var = this.f36097q0;
        if (oy0Var != null) {
            oy0Var.setStories(this.f36106r2.stories);
        }
        jh.u0 u0Var = this.f36104r0;
        if (u0Var != null) {
            u0Var.a();
        }
        ly0 ly0Var = this.f35985a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setUserInfo(this.f36106r2);
        }
        if (this.f36113s2 == null) {
            this.f36113s2 = d6Var;
        }
        if (this.f36113s2 == null) {
            this.f36113s2 = new org.telegram.ui.Cells.d6(this.currentAccount);
        }
        org.telegram.ui.Cells.d6 d6Var2 = this.f36113s2;
        fb0 fb0Var = new fb0(this, 20);
        if (d6Var2.f24230c) {
            fb0Var.run();
        } else {
            d6Var2.h.add(fb0Var);
        }
        this.f36113s2.d(this.f36106r2);
        if (this.f36125u2 == null) {
            this.f36125u2 = k01Var;
        }
        k01 k01Var2 = this.f36125u2;
        if (k01Var2 == null) {
            k01 c3 = k01.c(this.currentAccount, this.f36106r2, k01Var2);
            this.f36125u2 = c3;
            if (c3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36119t2 = z10;
        }
        k01 k01Var3 = this.f36125u2;
        if (k01Var3 != null) {
            fb0 fb0Var2 = new fb0(this, 16);
            if (k01Var3.f39719b) {
                fb0Var2.run();
            } else {
                k01Var3.h.add(fb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.P0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f35986a1)));
            if (e4()) {
                this.P0.K(44);
            } else {
                this.P0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.h61) {
            return ((org.telegram.ui.Components.h61) imageReceiver.getDrawable()).f29074a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f35985a0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.f36000c0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35992b0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35992b0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35992b0 = animatorSet2;
            if (z10) {
                this.f36000c0.setVisibility(0);
                this.f35992b0.playTogether(ObjectAnimator.ofFloat(this.f36000c0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36000c0, View.ALPHA, 0.0f));
            }
            this.f35992b0.setDuration(180L);
            this.f35992b0.addListener(new zy0(this, z10, 1));
            this.f35992b0.start();
        } else if (z10) {
            this.f36000c0.setAlpha(1.0f);
            this.f36000c0.setVisibility(0);
        } else {
            this.f36000c0.setAlpha(0.0f);
            this.f36000c0.setVisibility(4);
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final org.telegram.ui.Components.n5 Q3(int i10, long j10) {
        int i11;
        org.telegram.ui.Components.n5[] n5VarArr = this.D;
        if (n5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f36020f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(dp, i11, h5Var, false);
            n5VarArr[i10] = n5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            n5Var.E = 0;
            n5Var.F = dp2;
            if (this.C0) {
                n5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            n5VarArr[i10].j(j10, false);
        } else {
            n5VarArr[i10].g(null, false);
        }
        X4();
        return n5VarArr[i10];
    }

    public final void Q4() {
        int i10;
        int i11;
        Long l10;
        if (this.f36147x5 != null) {
            return;
        }
        u51[] u51VarArr = new u51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
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
        int dp = (-(this.V.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = i7.w.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.A2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        ry0 ry0Var = new ry0(this, this, parentActivity, valueOf, i11, this.f36129v0, i10, u51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35986a1));
        if (user != null) {
            ry0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l11 = this.B;
        org.telegram.ui.Components.n5[] n5VarArr = this.C;
        if (l11 != null) {
            ry0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                Drawable drawable = n5Var.f30849f[0];
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.p5) drawable).i());
                    ry0Var.setSelected(l10);
                }
            }
            l10 = null;
            ry0Var.setSelected(l10);
        }
        ry0Var.setSaveState(3);
        ry0Var.y(n5VarArr[1], h5VarArr[1]);
        sy0 sy0Var = new sy0(this, ry0Var);
        this.f36147x5 = sy0Var;
        u51VarArr[0] = sy0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.getLocationOnScreen(iArr);
        }
        u51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        u51VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        hz0 hz0Var = this.K;
        if (hz0Var != null && this.f36110s != null) {
            int closestTab = hz0Var.getClosestTab();
            int[] iArr = this.N.f29477c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f36110s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f36110s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.K.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.K.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f36110s.setText(a4.w.y(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f36110s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f36110s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f36110s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f36110s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f36110s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f36110s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f36110s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f36110s.setText(LocaleController.formatPluralString("CommonGroups", this.f36106r2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f36110s.setText(this.f36103r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.qu0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f36110s.setText(this.K.V(true));
                } else if (closestTab == 9) {
                    this.f36110s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.K.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.yn0 yn0Var = this.f36110s;
                    if (this.f36078n2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    yn0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f36110s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.yn0 yn0Var2 = this.f36110s;
                    org.telegram.ui.Components.gr0 gr0Var = this.K.R;
                    if (gr0Var != null) {
                        i11 = gr0Var.getGiftsCount();
                    }
                    yn0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f36110s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f36110s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f36078n2) {
                this.f36110s.setText(this.K.V(false));
            } else if (this.K.c0(closestTab) > 0) {
                this.f36110s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.K.c0(closestTab), new Object[0]));
            } else {
                this.f36110s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.h hVar;
        int i10;
        if (!this.f36144x1 && (hVar = this.f36150y1) != null && this.f36099q2 != null) {
            this.f36144x1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f35993b1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.f36150y1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new eg.m0(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.K.E0.setReordering(false);
        hz0 hz0Var = this.K;
        org.telegram.ui.Components.fs0 fs0Var = hz0Var.E0;
        if (hz0Var.f32093r1 != null && fs0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = fs0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.qu0.d0(num.intValue(), hz0Var.Z0 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.K.v1(true);
        this.f36128u5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.jr.h).withEndAction(new fb0(this, 21)).start();
        org.telegram.ui.Components.tc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.n5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        int i11;
        org.telegram.ui.Components.n5[] n5VarArr = this.C;
        if (n5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f36020f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(dp, i11, h5Var, false);
            n5VarArr[i10] = n5Var;
            if (this.C0) {
                n5Var.a();
            }
        }
        if (i10 == 1) {
            this.B = null;
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
                    this.B = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
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
        float f9;
        n0 n0Var;
        if (this.W != null && this.f36103r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.zg0 zg0Var = this.W;
            boolean z10 = this.C1;
            zg0Var.f35341e = z10;
            if (z10 && this.F1 == 2 && (n0Var = this.U) != null) {
                this.W.f35342f = this.U.getY() + (this.U.getScaleY() * n0Var.getHeight());
                this.W.setAlpha(this.O1);
                org.telegram.ui.Components.zg0 zg0Var2 = this.W;
                zg0Var2.A = AndroidUtilities.dp(74.0f);
                zg0Var2.setTranslationY(this.f35984a.getMeasuredWidth());
                zg0Var2.invalidate();
            } else {
                zg0Var.f35342f = -1.0f;
                float f10 = i11;
                float f11 = this.M1 + f10;
                if (this.E4) {
                    f9 = 25.0f;
                } else {
                    f9 = 0.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f9);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.zg0 zg0Var3 = this.W;
                zg0Var3.A = min;
                zg0Var3.setTranslationY(dp - min);
                zg0Var3.invalidate();
            }
            ImageView imageView = this.K0;
            if (imageView != null && imageView.getTag() != null) {
                this.W.getClass();
                if (this.K0.getVisibility() == 0) {
                    this.K0.setVisibility(8);
                }
                if (this.K0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
                    ((org.telegram.ui.ActionBar.w0) this.K0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final boolean T() {
        return this.f36137w1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        int i10;
        if (this.V0 != null && this.W0 != null) {
            TLRPC.UserFull userFull = this.f36106r2;
            if (userFull == null && this.f36099q2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f36099q2.ttl_period;
            }
            this.f36083o0.b(i10);
            this.W0.b(i10);
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
        if (this.f36088o5 != null) {
            hz0 hz0Var = this.K;
            if (hz0Var != null && hz0Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f35984a.getMeasuredHeight() - this.K.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            vd.a aVar = this.f36141w5;
            aVar.a(z10, true);
            float f9 = aVar.f49505e;
            this.f36088o5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f9));
            this.f36088o5.setAlpha(f9);
            FrameLayout frameLayout = this.f36088o5;
            if (f9 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
            if (mcVar != null) {
                mcVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f36142x == null) {
            this.f36142x = org.telegram.ui.ActionBar.g6.f23204l4.getConstantState().newDrawable().mutate();
        }
        return this.f36142x;
    }

    public final void V4() {
        nh.t3 t3Var = this.Z5;
        if (t3Var != null) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
            boolean z10 = true;
            float x4 = h5VarArr[1].getX() + (-t3Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f36030g2);
            float f9 = 0.0f;
            t3Var.n(0.0f, (h5VarArr[1].getScaleX() * (h5VarArr[1].getRightDrawableX() - (lerp * h5VarArr[1].getRightDrawableWidth()))) + x4);
            float lerp2 = AndroidUtilities.lerp(this.f36044i2, this.f36037h2);
            nh.t3 t3Var2 = this.Z5;
            t3Var2.setTranslationY(((h5VarArr[1].getY() + (-t3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.Z5.h(i0.a.d(lerp2, this.f35990a6, 1342177280));
            if (this.M1 < AndroidUtilities.dp(82.0f)) {
                z10 = false;
            }
            Boolean bool = this.f35998b6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.Z5.animate();
            this.f35998b6 = Boolean.valueOf(z10);
            if (z10) {
                f9 = 1.0f;
            }
            b.q(animate.alpha(f9), org.telegram.ui.Components.jr.f29801g, 200L);
        }
    }

    public final float W3(float f9) {
        this.V5 = f9;
        int i10 = this.F1;
        float f10 = 1.0f;
        if (i10 != 2) {
            if (this.O1 < 1.0f && i10 != 0) {
                f10 = 0.0f;
            } else {
                f10 = this.f36030g2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f36061k5) * Utilities.clamp01(f10)) + f9;
    }

    public final void W4() {
        if (getParentActivity() != null && this.R0 != null) {
            if (getUserConfig().isPremium()) {
                this.R0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, this.f36129v0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.R0.setIcon(new lh.h2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    public final float X3(float f9) {
        float f10;
        this.W5 = f9;
        int i10 = this.F1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.O1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f36030g2;
        }
        float clamp01 = Utilities.clamp01(f10);
        if (this.P != null) {
            f11 = this.P.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, clamp01, f11, f9);
    }

    public final void X4() {
        Y4(this.L5);
    }

    public final org.telegram.ui.Components.ir Y3(int i10) {
        org.telegram.ui.Components.ir[] irVarArr = this.G;
        if (irVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.A;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36129v0), PorterDuff.Mode.MULTIPLY);
            irVarArr[i10] = new org.telegram.ui.Components.ir(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return irVarArr[i10];
    }

    public final void Y4(float f9) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.M5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36129v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36129v0), this.A5, 1.0f);
            }
            int d = i0.a.d(f9, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.g6.Oi;
            int d10 = i0.a.d(this.A5, d, org.telegram.ui.ActionBar.g6.v0(i11, this.f36129v0));
            org.telegram.ui.Components.n5 n5Var = this.C[i10];
            if (n5Var != null) {
                n5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.n5 n5Var2 = this.D[i10];
            if (n5Var2 != null) {
                n5Var2.k(Integer.valueOf(i0.a.d(this.A5, i0.a.d(f9, offsetColor, -1711276033), org.telegram.ui.ActionBar.g6.v0(i11, this.f36129v0))));
            }
            if (i10 == 1) {
                this.Z.setColor(d10);
            }
        }
        this.L5 = f9;
    }

    public final float Z3() {
        if (this.P != null) {
            return this.P.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
        }
        return 0.0f;
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.Z;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
        oVar.setScaleX(h5VarArr[1].getScaleX());
        this.Z.setScaleY(h5VarArr[1].getScaleY());
        this.Z.b((h5VarArr[1].getScaleX() * h5VarArr[1].getRightDrawableX()) + h5VarArr[1].getX(), (h5VarArr[1].getHeight() - (h5VarArr[1].getScaleY() * (h5VarArr[1].getHeight() - h5VarArr[1].getRightDrawableY()))) + h5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f36014e1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f35986a1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f35993b1;
    }

    public final org.telegram.ui.Components.vl0 a4(int i10) {
        if (this.H == null) {
            org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(i10);
            this.H = vl0Var;
            vl0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23136h8, this.f36129v0));
        }
        return this.H;
    }

    public final void a5() {
        if (!this.f36069m1 && ChatObject.isForum(this.A2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f35993b1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f36010d5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f35993b1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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

    public final h01 b4() {
        if (this.X5 == null) {
            h01 h01Var = new h01(LocaleController.getString(R.string.StatusHiddenShow));
            this.X5 = h01Var;
            h01Var.setAlpha((int) (Math.min(1.0f, this.M1 / T3()) * 255.0f));
            this.X5.a(i0.a.d(this.f36030g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        return this.X5;
    }

    public final void b5(float f9) {
        wz0 wz0Var;
        ValueAnimator valueAnimator;
        if (this.f36064l2 || ((wz0Var = this.J) != null && (valueAnimator = wz0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.J.getLayoutParams();
            layoutParams.width = this.f35984a.getMeasuredWidth();
            layoutParams.height = (int) (this.M1 + f9);
            this.J.requestLayout();
        }
        j01 j01Var = this.Z0;
        if (j01Var != null) {
            j01Var.A.setTranslate(0.0f, this.W1 - j01Var.f39391x);
            j01 j01Var2 = this.Z0;
            RadialGradient radialGradient = j01Var2.f39392y;
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
        float f9;
        if (this.f36069m1) {
            return 0;
        }
        if (this.f35993b1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f35993b1)))) {
            if (j4()) {
                f9 = 24.0f;
            } else {
                f9 = 38.0f;
            }
            return AndroidUtilities.dp(f9);
        }
        return AndroidUtilities.dp(50.0f);
    }

    public final void c5() {
        TLRPC.User user;
        boolean z10;
        int i10;
        int i11;
        if (this.f36084o1 && this.T0 != null && this.S0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f35986a1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.T0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            g1Var.setIcon(i10);
            org.telegram.ui.ActionBar.g1 g1Var2 = this.T0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            g1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.g1 g1Var3 = this.S0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            g1Var3.setVisibility(i12);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.K.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.M5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.l");
    }

    @Override
    public final android.view.View createView(android.content.Context r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final org.telegram.ui.Components.ir d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f9;
        org.telegram.ui.Components.ir[] irVarArr = this.F;
        if (irVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.g6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f36148y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.g6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.E;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.M5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
                    color3 = this.M5.getColor5();
                } else {
                    color3 = this.M5.getColor3();
                }
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = -0.1f;
                } else {
                    f9 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.g6.b(0.1f, f9, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36129v0), this.A5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f36129v0), this.A5, 1.0f), mode);
            }
            irVarArr[i10] = new org.telegram.ui.Components.ir(new org.telegram.ui.Components.jq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return irVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        vz0 vz0Var;
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
        by0 by0Var;
        by0 by0Var2;
        org.telegram.ui.Components.vk0 vk0Var;
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
                if (this.f35986a1 != 0) {
                    if (z13) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (by0Var2 = this.f35984a) != null && (vk0Var = (org.telegram.ui.Components.vk0) by0Var2.L(this.C3, false)) != null) {
                        this.d.v(vk0Var, this.C3);
                    }
                } else if (this.f35993b1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (z13 && (by0Var = this.f35984a) != null) {
                        int childCount = by0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f35984a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (this.f36099q2 != null && (chat = this.A2) != null && chat.f22392id == l10.longValue()) {
                    this.f36099q2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f36022f1) {
                        AndroidUtilities.runOnUIThread(new av0(8, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.f36157z2;
                    if (encryptedChat2 != null && encryptedChat.f22400id == encryptedChat2.f22400id) {
                        this.f36157z2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.T1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z16 = this.f36029g1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f35986a1) >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f36029g1 = z12;
                    if (z16 != z12) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l11 = (Long) objArr[0];
                    if (this.A2 != null) {
                        long longValue = l11.longValue();
                        TLRPC.Chat chat2 = this.A2;
                        if (longValue == chat2.f22392id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f36099q2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f36099q2 = chatFull4;
                            }
                            hz0 hz0Var = this.K;
                            if (hz0Var != null) {
                                hz0Var.setChatInfo(this.f36099q2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f36099q2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.l1) || (inputGroupCall != null && this.l1))) {
                                D3(false);
                            }
                            oy0 oy0Var = this.f36097q0;
                            if (oy0Var != null && (chatFull3 = this.f36099q2) != null) {
                                oy0Var.setStories(chatFull3.stories);
                            }
                            jh.u0 u0Var = this.f36104r0;
                            if (u0Var != null) {
                                u0Var.a();
                            }
                            ly0 ly0Var = this.f35985a0;
                            if (ly0Var != null) {
                                ly0Var.setHasStories(j4());
                            }
                            if (l11.longValue() != 0) {
                                z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f36099q2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.P0.I(38, z14);
                                org.telegram.ui.Components.zg0 zg0Var = this.W;
                                if (zg0Var != null) {
                                    zg0Var.o(3, z14);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f35986a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f35986a1))) != null && chatFull7.f22393id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.A2;
                    if (chat3 != null && chatFull7.f22393id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f22393id == this.f35993b1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f36099q2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f36099q2 = chatFull7;
                        if (this.f36043i1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f36043i1 = -j10;
                                getMediaDataController().getMediaCount(this.f36043i1, this.f36001c1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        my0 my0Var = this.f36049j0;
                        if (my0Var != null && !this.f36069m1) {
                            my0Var.setChatInfo(this.f36099q2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f35993b1));
                        if (chat4 != null) {
                            this.A2 = chat4;
                            D3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.T1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.A2.megagroup && (z11 || !booleanValue)) {
                            R3(true);
                        }
                        T4();
                        m5();
                        oy0 oy0Var2 = this.f36097q0;
                        if (oy0Var2 != null && (chatFull = this.f36099q2) != null) {
                            oy0Var2.setStories(chatFull.stories);
                        }
                        jh.u0 u0Var2 = this.f36104r0;
                        if (u0Var2 != null) {
                            u0Var2.a();
                        }
                        ly0 ly0Var2 = this.f35985a0;
                        if (ly0Var2 != null) {
                            ly0Var2.setHasStories(j4());
                        }
                        hz0 hz0Var2 = this.K;
                        if (hz0Var2 != null) {
                            hz0Var2.setChatInfo(this.f36099q2);
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
                    if (botInfo.user_id == this.f35986a1) {
                        this.B2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f35986a1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f36106r2 = userFull;
                        org.telegram.ui.Components.aw0 aw0Var = this.P;
                        if (aw0Var != null) {
                            aw0Var.set(userFull.stars_rating);
                        }
                        oy0 oy0Var3 = this.f36097q0;
                        if (oy0Var3 != null) {
                            oy0Var3.setStories(this.f36106r2.stories);
                        }
                        jh.u0 u0Var3 = this.f36104r0;
                        if (u0Var3 != null) {
                            u0Var3.a();
                        }
                        ly0 ly0Var3 = this.f35985a0;
                        if (ly0Var3 != null) {
                            ly0Var3.setHasStories(j4());
                        }
                        hz0 hz0Var3 = this.K;
                        if (hz0Var3 != null) {
                            hz0Var3.setUserInfo(this.f36106r2);
                        }
                        if (this.m0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f36106r2.about, this.f36131v2)) {
                                this.d.m(this.S2);
                            }
                        } else {
                            if (!this.C1 && !this.G0) {
                                D3(true);
                            } else {
                                this.E1 = true;
                            }
                            e5(false, false);
                            hz0 hz0Var4 = this.K;
                            if (hz0Var4 != null) {
                                hz0Var4.setCommonGroupsCount(this.f36106r2.common_chats_count);
                                R();
                                org.telegram.ui.Components.iu0 iu0Var = this.N;
                                if (iu0Var == null || iu0Var.f29485y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f36113s2 == null && !h4()) {
                            org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(this.currentAccount);
                            this.f36113s2 = d6Var;
                            fb0 fb0Var = new fb0(this, 15);
                            if (d6Var.f24230c) {
                                fb0Var.run();
                            } else {
                                d6Var.h.add(fb0Var);
                            }
                            this.f36113s2.d(this.f36106r2);
                        }
                        if (!h4()) {
                            k01 k01Var = this.f36125u2;
                            k01 c3 = k01.c(this.currentAccount, this.f36106r2, k01Var);
                            this.f36125u2 = c3;
                            if (c3 != k01Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f36119t2 = z10;
                            if (c3 != null) {
                                fb0 fb0Var2 = new fb0(this, 16);
                                if (c3.f39719b) {
                                    fb0Var2.run();
                                } else {
                                    c3.h.add(fb0Var2);
                                }
                            }
                        }
                        if (this.P0 != null) {
                            if (e4()) {
                                this.P0.K(44);
                            } else {
                                this.P0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f36106r2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z15 = true;
                            }
                            this.P0.I(46, z15);
                            this.P0.I(47, !z15);
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
                                    if (this.f36157z2 != null) {
                                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (vz0Var = this.d) != null) {
                                            vz0Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        by0 by0Var3 = this.f35984a;
                        if (by0Var3 != null) {
                            by0Var3.f1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.Y2;
                        int i16 = this.W2;
                        int i17 = this.U2;
                        j5();
                        vz0 vz0Var2 = this.d;
                        if (vz0Var2 != null) {
                            if (i15 != this.Y2 || i16 != this.W2 || i17 != this.U2) {
                                vz0Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f36069m1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        g01 g01Var = this.f36012e;
                        if (g01Var != null) {
                            g01Var.f38410c = g01.H(this);
                            this.f36012e.v.clear();
                            this.f36012e.J();
                            g01 g01Var2 = this.f36012e;
                            g01Var2.I(g01Var2.f38418y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.w0 w0Var = this.P0;
                            if (w0Var != null) {
                                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f35986a1)));
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
                            if (this.F4 < 0 && longValue3 == a()) {
                                j5();
                                R();
                                vz0 vz0Var3 = this.d;
                                if (vz0Var3 != null) {
                                    vz0Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !h4()) {
                                if (this.F4 < 0) {
                                    j5();
                                    R();
                                    vz0 vz0Var4 = this.d;
                                    if (vz0Var4 != null) {
                                        vz0Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new fb0(this, 17));
                                    return;
                                }
                                hz0 hz0Var5 = this.K;
                                if (hz0Var5 != null) {
                                    hz0Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f35986a1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f35986a1);
                                if (userFull3 != null) {
                                    this.f36106r2 = userFull3;
                                }
                                j5();
                                R();
                                by0 by0Var4 = this.f35984a;
                                if (by0Var4 != null && by0Var4.b0()) {
                                    this.f35984a.post(new fb0(this, 19));
                                    return;
                                }
                                vz0 vz0Var5 = this.d;
                                if (vz0Var5 != null) {
                                    vz0Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.A2;
                            if (chat5 != null && chat5.f22392id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.f36150y1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.C2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.M4;
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        AndroidUtilities.updateVisibleRows(this.f35984a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        ly0 ly0Var4 = this.f35985a0;
                        if (ly0Var4 != null) {
                            ly0Var4.setHasStories(j4());
                            this.f35985a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f36030g2));
                        }
                        oy0 oy0Var4 = this.f36097q0;
                        if (oy0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f36106r2;
                            if (userFull4 != null) {
                                oy0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f36099q2;
                            if (chatFull9 != null) {
                                oy0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f35993b1)))) {
            getMessagesController().getStoriesController().k(a(), new l4.x0(12), false, this.f36129v0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null && s40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if ((s40Var == null || dialog != s40Var.f32471c) && super.dismissDialogOnPause(dialog)) {
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
        if (!this.f36078n2 || (userFull = this.f36106r2) == null || (botInfo = userFull.bot_info) == null) {
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
        } else if (!z11 && this.f35984a.isInLayout()) {
            by0 by0Var = this.f35984a;
            if (!by0Var.C) {
                return;
            }
            by0Var.post(new org.telegram.ui.Components.p90(12, this, z10));
        } else {
            jz0 jz0Var = new jz0(this);
            jz0Var.f39710b = this.J2;
            jz0Var.f(jz0Var.f39711c);
            jz0Var.f39712e.clear();
            jz0Var.f39713f.clear();
            jz0Var.f39712e.addAll(this.M4);
            jz0Var.f39713f.addAll(this.N4);
            jz0Var.f39714g = this.f36101q4;
            jz0Var.h = this.f36108r4;
            if (z10) {
                h5(false);
            }
            F4();
            j5();
            jz0Var.f(jz0Var.d);
            try {
                f2.q.c(jz0Var, true).b(this.d);
            } catch (Exception e10) {
                FileLog.e(e10);
                this.d.l();
            }
            int i10 = this.Q5;
            if (i10 >= 0) {
                this.f35999c.h1(i10, this.R5 - this.f35984a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f35984a);
        }
    }

    @Override
    public final org.telegram.ui.Components.jl0 f() {
        return this.f35984a;
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
        this.f36051j2 = z10;
    }

    public final void f5() {
        int i10;
        if (this.Y != null && this.f36103r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.C1;
            if (z10 && this.F1 == 2 && this.U != null) {
                this.Y.setAlpha(this.O1);
                org.telegram.ui.Components.rh0 rh0Var = this.Y;
                float dp = AndroidUtilities.dp(74.0f) + this.f35984a.getMeasuredWidth();
                rh0Var.H = O3() - AndroidUtilities.dp(74.0f);
                rh0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                rh0Var.invalidate();
                return;
            }
            if (z10) {
                this.Y.setAlpha(this.O1);
            }
            float f9 = i11;
            float dp2 = this.M1 + f9 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f9);
            org.telegram.ui.Components.rh0 rh0Var2 = this.Y;
            rh0Var2.H = min - AndroidUtilities.dp(74.0f);
            rh0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            rh0Var2.invalidate();
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.A2;
    }

    public final boolean g4() {
        if (this.A2 != null) {
            return getMessagesController().isChatNoForwards(this.A2);
        }
        return getMessagesController().isUserNoForwards(this.f36106r2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.O1;
    }

    @Override
    public final zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f36129v0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f36129v0 != null) {
            return null;
        }
        rx0 rx0Var = new rx0(0, this);
        ArrayList arrayList = new ArrayList();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            arrayList.addAll(hz0Var.getThemeDescriptions());
        }
        by0 by0Var = this.f35984a;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(by0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, null, null, null, null, i10));
        by0 by0Var2 = this.f35984a;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(by0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23101f8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23284pc));
        int i12 = org.telegram.ui.ActionBar.g6.f23136h8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i12));
        org.telegram.ui.Components.yn0 yn0Var = this.f36110s;
        if (yn0Var != null) {
            TextView textView = yn0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.g6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, rx0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36110s.getNextTextView(), 4, null, null, null, rx0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        ly0 ly0Var = this.f35985a0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23305r0;
        int i14 = org.telegram.ui.ActionBar.g6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ly0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35985a0, 0, null, null, new Drawable[]{this.f36063l0}, null, org.telegram.ui.ActionBar.g6.f23064d8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.yh));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23418x6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23260o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i16 = org.telegram.ui.ActionBar.g6.f23223m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.g6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 2, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23376uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i23 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35984a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35991b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.B5;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.g6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f36148y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.g6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f36148y, null, org.telegram.ui.ActionBar.g6.zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.f36129v0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.c6 c6Var = this.f36129v0;
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
        if (this.m0 != null && !this.f36084o1) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.f36145x2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.f36151y2.clear();
        TLRPC.ChatFull chatFull = this.f36099q2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.f36145x2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f36099q2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36099q2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22539id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.f36145x2++;
            }
            this.f36151y2.add(Integer.valueOf(i11));
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
                i11 = th.d(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = th.d(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.f36151y2, Comparator$EL.reversed(Comparator$CC.comparingInt(new ve(arrayList, 1))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (z10 && this.d != null && this.f36101q4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f35984a);
        }
        if (this.K != null && this.F4 != -1) {
            if ((this.f36151y2.size() > 5 || this.O4 == 2) && this.O4 != 1) {
                this.K.a1(this.f36151y2, this.f36099q2);
            }
        }
    }

    public final void i4(boolean z10) {
        boolean z11;
        boolean isForum = ChatObject.isForum(this.A2);
        TLRPC.Chat chat = this.A2;
        if (!isForum && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.c5.s(this, false, chat, null, false, z11, z10, !isForum, new ex0(this, 1));
    }

    public final void i5(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f36064l2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v02;
        if (!this.f36064l2) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null && lVar.s()) {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23403w8, this.f36129v0);
            } else if (this.B5) {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f36129v0);
            } else {
                MessagesController.PeerColor peerColor = this.M5;
                if (peerColor != null) {
                    v02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
                } else {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, this.f36129v0);
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
        if (getMessagesController().getStoriesController().I(a()) && !this.f36069m1) {
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
        if (this.f36021f0 != null && (imageView = this.f36028g0) != null) {
            if (this.H1 && (chat = this.A2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f36028g0.setVisibility(0);
                this.f36021f0.setTag(1);
                this.f36021f0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f36028g0.setVisibility(8);
            this.f36021f0.setTag(null);
            this.f36021f0.setVisibility(8);
        }
    }

    public final void l4(int r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.l4(int, float, boolean):void");
    }

    public final void l5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        float f9;
        float f10;
        boolean z11;
        if ((this.f36097q0 != null || this.f36104r0 != null) && (lVar = this.actionBar) != null) {
            if (lVar.getOccupyStatusBar()) {
                f9 = AndroidUtilities.statusBarHeight;
            } else {
                f9 = 0.0f;
            }
            float width = this.actionBar.getWidth();
            if (this.actionBar.getBackButton() != null) {
                f10 = Math.max(0.0f, this.actionBar.getBackButton().getRight());
            } else {
                f10 = 0.0f;
            }
            boolean z12 = false;
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
            oy0 oy0Var = this.f36097q0;
            if (oy0Var != null) {
                float A = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f9, 2.0f, f9);
                if (Math.abs(f10 - oy0Var.f36266b0) <= 0.1f && Math.abs(width - oy0Var.f36268c0) <= 0.1f && Math.abs(A - oy0Var.f36269d0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                oy0Var.f36266b0 = f10;
                oy0Var.f36268c0 = width;
                if (z10) {
                    oy0Var.f36276i0.d(width, true);
                }
                oy0Var.f36269d0 = A;
                if (z11) {
                    oy0Var.invalidate();
                }
            }
            jh.u0 u0Var = this.f36104r0;
            if (u0Var != null) {
                float A2 = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f9, 2.0f, f9);
                int U3 = U3();
                z12 = (Math.abs(f10 - u0Var.f12880r) > 0.1f || Math.abs(width - u0Var.f12881s) > 0.1f || Math.abs(A2 - u0Var.v) > 0.1f) ? true : true;
                u0Var.f12880r = f10;
                u0Var.f12881s = width;
                if (z10) {
                    u0Var.f12884y.d(width, true);
                }
                u0Var.v = A2;
                u0Var.f12883x = U3 + A2;
                if (z12) {
                    u0Var.invalidate();
                }
            }
        }
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5():void");
    }

    public final void n4(boolean z10) {
        boolean z11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35986a1));
        if (user != null) {
            if (this.f36078n2 && !MessagesController.isSupportUser(user)) {
                if (this.f36029g1 && !z10) {
                    getMessagesController().unblockPeer(this.f35986a1, new fb0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.A2;
                if (this.f36157z2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.c5.s(this, false, chat, user, z11, true, false, true, new fx0(this, user));
            } else if (this.f36029g1) {
                getMessagesController().unblockPeer(this.f35986a1);
                if (org.telegram.ui.Components.tc.a(this)) {
                    org.telegram.ui.Components.tc.d(this, false).j();
                }
            } else if (this.f36036h1) {
                org.telegram.ui.Components.c5.j0(this, this.f35986a1, user, null, this.f36157z2, false, null, new pa(this, 4), this.f36129v0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f36129v0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new ex0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, this.f36129v0));
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
        float f9;
        TLRPC.ChatFull chatFull;
        int i12 = 0;
        float f10 = 0.2f;
        int i13 = (y3() > 0.2f ? 1 : (y3() == 0.2f ? 0 : -1));
        if (i13 > 0 && !this.S1 && (this.m0 == null || this.K2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D5 = z11;
        C3();
        org.telegram.ui.Components.aj0 aj0Var = this.v;
        if (aj0Var != null && aj0Var.getVisibility() != 8) {
            org.telegram.ui.Components.aj0 aj0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            aj0Var2.setTranslationY((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) + this.M1) + this.P1) - AndroidUtilities.dp(29.5f));
            if (i13 > 0 && !this.S1 && !this.f36084o1 && (this.m0 == null || this.K2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f35993b1 != 0) {
                if (ChatObject.isChannel(this.A2) && !this.A2.megagroup && (chatFull = this.f36099q2) != null && chatFull.linked_chat_id != 0 && (this.f36158z3 != -1 || this.A3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.C1) {
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
                    AnimatorSet animatorSet = this.f36135w;
                    if (animatorSet != null) {
                        this.f36135w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f36135w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f36135w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f36135w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f36135w.setDuration(150L);
                        this.f36135w.addListener(new yy0(this, 1));
                        this.f36135w.start();
                    } else {
                        org.telegram.ui.Components.aj0 aj0Var3 = this.v;
                        if (z12) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.2f;
                        }
                        aj0Var3.setScaleX(f9);
                        org.telegram.ui.Components.aj0 aj0Var4 = this.v;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        aj0Var4.setScaleY(f10);
                        org.telegram.ui.Components.aj0 aj0Var5 = this.v;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        aj0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        oy0 oy0Var = this.f36097q0;
        if (oy0Var != null) {
            float measuredWidth = this.V.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            oy0Var.f36271e0 = measuredWidth;
            oy0Var.f36274g0 = z12;
            oy0Var.f36273f0 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10;
            oy0Var.invalidate();
        }
        jh.u0 u0Var = this.f36104r0;
        if (u0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            u0Var.setExpandCoords(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + this.M1 + this.P1);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.F1 == 0) {
            return true;
        }
        return false;
    }

    public final void o4(boolean z10) {
        boolean z11;
        if (this.f35986a1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35986a1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f36106r2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.h2.n(user, z10, z11, getParentActivity(), this.f36106r2, getAccountInstance());
            }
        } else if (this.f35993b1 != 0) {
            if (getMessagesController().getGroupCall(this.f35993b1, false) == null) {
                TLRPC.Chat chat = this.A2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.t70.t(getParentActivity(), -chat.f22392id, accountInstance, new org.telegram.ui.Components.voip.w1(chat, this, accountInstance, 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.h2.m(this.A2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.gr0 gr0Var;
        org.telegram.ui.Components.fs0 fs0Var;
        org.telegram.ui.Components.y80 y80Var;
        int v02;
        int v03;
        int v04;
        int color3;
        int v05;
        int v06;
        int v07;
        this.N5.clear();
        j01 j01Var = this.Z0;
        if (j01Var != null) {
            j01Var.a(this.M5, true);
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36103r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            if (h5Var.getTag() instanceof Integer) {
                v07 = org.telegram.ui.ActionBar.g6.v0(((Integer) h5VarArr[1].getTag()).intValue(), this.f36129v0);
            } else {
                v07 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.f36129v0);
            }
            h5VarArr[1].setTextColor(i0.a.d(this.f36030g2, w3(v07, Boolean.valueOf(this.F0[0])), -1275068417));
        }
        h01 h01Var = this.X5;
        float f9 = -0.1f;
        if (h01Var != null) {
            h01Var.a(i0.a.d(this.f36030g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = -1;
        if (lVar != null) {
            if (this.M5 != null) {
                v05 = -1;
            } else {
                v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, this.f36129v0);
            }
            lVar.C(i0.a.d(this.A5, v05, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y8, this.f36129v0)), false);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.M5;
            if (peerColor != null) {
                v06 = 1090519039;
            } else if (peerColor != null) {
                v06 = 553648127;
            } else {
                v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23101f8, this.f36129v0);
            }
            lVar2.B(i0.a.d(this.A5, v06, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23452z8, this.f36129v0)), false);
        }
        Drawable[] drawableArr = this.f36148y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.M5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.M5.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
                    color3 = this.M5.getColor5();
                } else {
                    color3 = this.M5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = -0.08f;
                }
                v04 = org.telegram.ui.ActionBar.g6.b(0.1f, f9, d);
            } else {
                v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36129v0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v04, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36129v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.E;
        if (drawableArr2[1] != null) {
            if (this.M5 != null) {
                v03 = -1;
            } else {
                v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, this.f36129v0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(v03, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f36129v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f36020f[1];
        if (h5Var2 != null) {
            if (this.M5 != null) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36129v0);
            }
            h5Var2.setTextColor(i0.a.d(this.f36030g2, i0.a.d(this.A5, v02, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36129v0)), -1));
        }
        org.telegram.ui.Components.m8 m8Var = this.W0;
        if (m8Var != null && (y80Var = m8Var.f30597e) != null) {
            y80Var.invalidate();
        }
        Drawable drawable = this.f36142x;
        if (drawable != null) {
            if (this.M5 == null) {
                i10 = i0.a.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284pc, this.f36129v0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.rh0 rh0Var = this.Y;
        if (rh0Var != null) {
            rh0Var.setColor(this.M5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f35984a, (f5.d) new nx0(this, 1));
        hz0 hz0Var = this.K;
        if (hz0Var != null && (fs0Var = hz0Var.E0) != null) {
            fs0Var.e();
        }
        hz0 hz0Var2 = this.K;
        if (hz0Var2 != null && (gr0Var = hz0Var2.R) != null) {
            gr0Var.m();
        }
        p5();
        X4();
        oy0 oy0Var = this.f36097q0;
        if (oy0Var != null) {
            oy0Var.f(true, true);
        }
        jh.u0 u0Var = this.f36104r0;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.i(i10, i11, intent);
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
        View m10;
        org.telegram.ui.Components.rh0 rh0Var;
        org.telegram.ui.Components.zg0 zg0Var;
        super.onConfigurationChanged(configuration);
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f36051j2 && (zg0Var = this.W) != null) {
            zg0Var.i();
        }
        if (this.f36051j2 && (rh0Var = this.Y) != null) {
            rh0Var.b();
        }
        if (this.f36051j2 && this.f36064l2 && (m10 = this.f35999c.m(0)) != null) {
            this.f35984a.scrollBy(0, m10.getTop() - T3());
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
        by0 by0Var = this.f35984a;
        if (by0Var != null) {
            by0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.F0();
        }
        org.telegram.ui.Components.iu0 iu0Var = this.N;
        if (iu0Var != null) {
            iu0Var.b(this);
        }
        org.telegram.ui.Components.iu0 iu0Var2 = this.N;
        if (iu0Var2 != null) {
            iu0Var2.f29484x.remove(this);
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
        my0 my0Var = this.f36049j0;
        if (my0Var != null) {
            my0Var.K();
        }
        org.telegram.ui.Components.bh0 bh0Var = this.f36042i0;
        if (bh0Var != null) {
            bh0Var.e();
        }
        this.F5 = null;
        if (this.f35986a1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f35986a1);
        } else if (this.f35993b1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        ly0 ly0Var = this.f35985a0;
        if (ly0Var != null) {
            ly0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.e();
        }
        qy0 qy0Var = this.R4;
        if (qy0Var != null) {
            qy0Var.b();
        }
        k01 k01Var = this.f36125u2;
        if (k01Var != null && this.f36119t2) {
            k01Var.b(true);
            this.f36125u2 = null;
        }
        org.telegram.messenger.v8 v8Var = this.f36122t5;
        if (v8Var != null) {
            this.f36122t5 = null;
            AndroidUtilities.runOnUIThread(v8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.vs0 vs0Var;
        super.onPause();
        UndoView undoView = this.I;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.j();
        }
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null && (vs0Var = hz0Var.P) != null) {
            vs0Var.f43686e = false;
            if (vs0Var.f43685c != null) {
                vs0Var.f43683a.onPause();
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
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.k(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.A2 != null) {
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
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f35993b1, false);
                    TLRPC.Chat chat = this.A2;
                    if (groupCall == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.h2.m(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.h2.i(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35986a1));
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
            TLRPC.UserFull userFull = this.f36106r2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.h2.n(user, z11, z12, getParentActivity(), this.f36106r2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.h2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        op0 op0Var;
        super.onResume();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.X0 = true;
            org.telegram.ui.Components.us0 us0Var = hz0Var.D;
            if (us0Var != null) {
                us0Var.l();
            }
            org.telegram.ui.Components.du0 du0Var = hz0Var.G;
            if (du0Var != null) {
                du0Var.l();
            }
            org.telegram.ui.Components.eu0 eu0Var = hz0Var.F;
            if (eu0Var != null) {
                eu0Var.X(false);
            }
            for (int i10 = 0; i10 < hz0Var.f32070g0.length; i10++) {
                hz0Var.U(i10);
            }
            org.telegram.ui.Components.vs0 vs0Var = hz0Var.P;
            if (vs0Var != null) {
                vs0Var.f43686e = true;
                if (vs0Var.f43685c != null) {
                    vs0Var.f43683a.onResume();
                }
            }
        }
        f4();
        vz0 vz0Var = this.d;
        if (vz0Var != null) {
            this.P4 = true;
            vz0Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (op0Var = this.Q) != null && op0Var.getVisibility() == 0) {
            this.Q.setVisibility(8);
            this.Q.setBackground(null);
        }
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new vh(this, 5));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f36020f[1];
        if (h5Var != null) {
            setParentActivityTitle(h5Var.getText());
        }
        if (this.f35986a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f35986a1))) != null && user.photo == null && this.M1 >= T3()) {
            this.f36023f2.cancel();
            float[] fArr = this.f36044i2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f36049j0.setVisibility(8);
            this.M1 = T3();
            this.f36058k2 = false;
            this.f35999c.h1(0, T3() - this.f35984a.getPaddingTop());
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
                        this.f36030g2 = 0.0f;
                        org.telegram.ui.Components.aw0 aw0Var = this.P;
                        if (aw0Var != null) {
                            aw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.zg0 zg0Var = this.W;
                        if (zg0Var != null) {
                            zg0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.rh0 rh0Var = this.Y;
                        if (rh0Var != null) {
                            rh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.C1 = false;
                    A3();
                    if (this.E1) {
                        D3(true);
                    }
                }
                if (!this.f36040h5) {
                    this.f36040h5 = true;
                    this.Q4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.L4);
            op0 op0Var = this.Q;
            if (op0Var != null && op0Var.getVisibility() == 0) {
                this.Q.setVisibility(8);
                this.Q.setBackground(null);
            }
        }
        this.D1 = false;
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        op0 op0Var = this.Q;
        if (op0Var != null && op0Var.getVisibility() == 0) {
            if (z10) {
                this.Q.setAlpha(1.0f - f9);
            } else {
                this.Q.setAlpha(f9);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.zg0 zg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.I5 = z10;
        if (z10 && (zg0Var = this.W) != null) {
            ArrayList arrayList = zg0Var.f35338a;
            if (zg0Var.D == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.wg0 wg0Var = (org.telegram.ui.Components.wg0) arrayList.get(i10);
                    org.telegram.ui.Components.xi0 xi0Var = wg0Var.f34407k;
                    if (xi0Var != null) {
                        if (wg0Var.f34399a == 15) {
                            xi0Var.K(14);
                        } else {
                            xi0Var.K(0);
                        }
                        wg0Var.f34407k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.K0) != null && imageView.getTag() != null && (this.K0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.K0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.F1 != 0 && this.I1 && !this.f36064l2) {
            this.C1 = true;
            if (!z10) {
                if (this.F5 == null) {
                    this.F5 = new float[16];
                }
                this.B1 = this.M1;
                this.F5[0] = this.U.getScaleX();
                this.F5[1] = this.U.getTranslationX();
                this.F5[2] = this.U.getTranslationY();
                org.telegram.ui.Components.zg0 zg0Var2 = this.W;
                if (zg0Var2 != null) {
                    this.F5[3] = zg0Var2.getAlpha();
                }
                jh.u0 u0Var = this.f36104r0;
                if (u0Var != null) {
                    float[] fArr = this.F5;
                    fArr[4] = u0Var.f12877e;
                    fArr[5] = u0Var.f12878f;
                }
                h01 h01Var = this.X5;
                if (h01Var != null) {
                    this.F5[6] = h01Var.getAlpha();
                }
                float[] fArr2 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
                fArr2[7] = h5VarArr[1].getScaleX();
                this.F5[8] = h5VarArr[1].getTranslationY();
                float[] fArr3 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36103r;
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
                nh.t3 t3Var = this.Z5;
                if (t3Var != null) {
                    t3Var.e(true);
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
        TLRPC.UserFull userFull = this.f36106r2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.tc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.A2 != null) {
            org.telegram.ui.Components.h40.h.a();
        }
        showDialog(new ih.h2(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.xh, this.f36129v0);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yh, this.f36129v0);
                int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wh, this.f36129v0);
                if (this.M5 != null && org.telegram.ui.ActionBar.g6.b1(v02)) {
                    v02 = org.telegram.ui.ActionBar.g6.b(0.05f, -0.04f, this.M5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.M5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
                        v03 = org.telegram.ui.ActionBar.g6.C(org.telegram.ui.ActionBar.g6.I.q(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, this.f36129v0), bgColor2, v03, bgColor2);
                    }
                    v04 = -1;
                }
                org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(mutate, org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                jqVar.f29787e = dp;
                jqVar.f29788f = dp2;
                this.v.setBackground(jqVar);
                this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean q() {
        return this.I5;
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.A2.f22392id, getUserConfig().getCurrentUser(), 0, null, this, true, new mp0(this, z10, zArr, 3), new m9.b(this, zArr, z10, this.parentLayout.getLastFragment(), 4));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void r4(View view, float f9, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f36014e1;
        if (j11 == 0) {
            j11 = this.f35986a1;
            if (j11 == 0) {
                j11 = -this.f35993b1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f36001c1);
        if (z10 && (this.f36069m1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f36001c1, z11);
            org.telegram.ui.Components.tc.A(this, z11, null).j();
            a5();
            this.W.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f9 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z12 = h5Var.f24453e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f36001c1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f36001c1 == 0) {
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
                if (this.f36001c1 == 0) {
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
            getNotificationsController().updateServerNotificationsSettings(j12, this.f36001c1);
            h5Var.setChecked(z13);
            org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f35984a.L(this.J3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(getParentActivity(), this.currentAccount, null, true, new f2.c(this, j12, 7), this.f36129v0);
            joVar.d(j12, this.f36001c1, this.f36010d5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f9;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f9;
                f12 = f10;
            }
            if (z10) {
                f12 += this.W.getHeight() - AndroidUtilities.dp(12.0f);
            }
            joVar.c(this, view, f11, f12, z10);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null) {
            s40Var.f32473f = bundle.getString("path");
        }
    }

    @Override
    public final void s() {
        this.f35984a.x0(0);
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f35986a1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35986a1));
                if (user != null) {
                    if (this.B2 != null && (userFull = this.f36106r2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f36106r2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f35993b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35993b1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f36099q2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f36099q2.about, ChatObject.getPublicUsername(chat));
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.s40 s40Var = this.m0;
        if (s40Var != null && (str = s40Var.f32473f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f9) {
        int v02;
        int v03;
        int v04;
        int i10;
        int w32;
        int w33;
        this.f36030g2 = f9;
        this.O1 = f9;
        B3();
        if (this.F1 == 2) {
            this.f35985a0.setProgressToExpand(f9);
            org.telegram.ui.Components.zg0 zg0Var = this.W;
            if (zg0Var != null) {
                zg0Var.setParentExpanded(f9);
            }
            org.telegram.ui.Components.rh0 rh0Var = this.Y;
            if (rh0Var != null) {
                rh0Var.setParentExpanded(f9);
            }
            org.telegram.ui.Components.aw0 aw0Var = this.P;
            if (aw0Var != null) {
                aw0Var.setParentExpanded(f9);
            }
            S4();
            f5();
        }
        this.f35984a.setAlpha(f9);
        this.f35984a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f9));
        if (this.F1 != 2 || (v02 = this.f36076n0) == 0) {
            if (this.f35986a1 == 0 && ChatObject.isChannel(this.f35993b1, this.currentAccount)) {
                boolean z10 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f36129v0;
            int[][] iArr = org.telegram.ui.Components.e9.C;
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var);
        }
        int i11 = this.T4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, this.f36129v0);
        }
        this.Z0.setBackgroundColor(i0.a.d(f9, i0.a.k(i11, 0), v02));
        org.telegram.ui.Components.m11 m11Var = this.f36035h0;
        int d = i0.a.d(f9, i11, v02);
        m11Var.f30534k = true;
        m11Var.f30527b.setColor(d);
        int i12 = -1;
        if (this.M5 != null) {
            v03 = -1;
        } else {
            if (this.f35986a1 == 0 && ChatObject.isChannel(this.f35993b1, this.currentAccount)) {
                boolean z11 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var2 = this.f36129v0;
            int[][] iArr2 = org.telegram.ui.Components.e9.C;
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23119g8, c6Var2);
        }
        this.actionBar.C(i0.a.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, this.f36129v0), v03), false);
        if (this.M5 == null) {
            i12 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36129v0);
        }
        int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, this.f36129v0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f36020f[i13];
            if (h5Var != null && (i13 != 1 || this.F1 != 2)) {
                h5Var.setTextColor(i0.a.d(f9, v05, i12));
            }
        }
        boolean[] zArr = this.F0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Bh, this.f36129v0);
        } else {
            if (this.f35986a1 == 0 && ChatObject.isChannel(this.f35993b1, this.currentAccount)) {
                boolean z12 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var3 = this.f36129v0;
            int[][] iArr3 = org.telegram.ui.Components.e9.C;
            v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23136h8, c6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.g6.f23282pa;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.B8;
        }
        int v06 = org.telegram.ui.ActionBar.g6.v0(i10, this.f36129v0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f36103r[i14];
            if (h5Var2 != null && i14 != 1 && (i14 != 2 || this.F1 != 2)) {
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
                h5Var2.setTextColor(i0.a.d(f9, w32, w33));
            }
        }
        this.M1 = this.N1 * f9;
        long j10 = this.f35986a1;
        if (j10 == 0) {
            j10 = this.f35993b1;
        }
        org.telegram.ui.ActionBar.c6 c6Var4 = this.f36129v0;
        int[][] iArr4 = org.telegram.ui.Components.e9.C;
        int v07 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(j10)], c6Var4);
        long j11 = this.f35986a1;
        if (j11 == 0) {
            j11 = this.f35993b1;
        }
        int d10 = org.telegram.ui.Components.e9.d(j11);
        if (v07 != d10) {
            this.f36063l0.h(i0.a.d(f9, d10, v07));
            this.f35985a0.invalidate();
        }
        int i15 = this.U4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f9, i15, getNavigationBarColor()));
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
            ly0 ly0Var = this.f35985a0;
            if (ly0Var != null) {
                ly0Var.setProgressToStoriesInsets(this.O1);
            }
            oy0 oy0Var = this.f36097q0;
            if (oy0Var != null) {
                oy0Var.setProgressToStoriesInsets(this.O1);
            }
            jh.u0 u0Var = this.f36104r0;
            if (u0Var != null) {
                u0Var.setProgressToStoriesInsets(this.O1);
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
        if (b5Var != null && b5Var.getParentActivity() != null) {
            this.T1 = new FlagSecureReason(b5Var.getParentActivity().getWindow(), new ex0(this, 6));
        }
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.H3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f35993b1);
            bundle.putLong("user_id", this.f35986a1);
            presentFragment(new a21(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.Q2) {
            if (this.f35986a1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f36106r2)) {
                org.telegram.ui.Components.tc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f35986a1)))).j();
            } else {
                showDialog(new ih.h2(getParentActivity(), this.currentAccount, this.f35986a1, null, null));
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u4() {
        boolean z10;
        org.telegram.ui.Components.xi0 xi0Var;
        if (this.f35986a1 != 0) {
            if (this.m0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.s40 s40Var = this.m0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s40Var.o(z10, new fb0(this, 24), new s5(this, 14), 0);
                    this.R.K(0);
                    this.R.N(43);
                    this.S.K(0);
                    this.S.N(43);
                    org.telegram.ui.Components.zg0 zg0Var = this.W;
                    if (zg0Var != null) {
                        org.telegram.ui.Components.wg0 j10 = org.telegram.ui.Components.zg0.j(14, zg0Var.f35338a);
                        if (j10 != null && (xi0Var = j10.f34407k) != null) {
                            xi0Var.start();
                        }
                    } else {
                        this.v.d();
                    }
                    org.telegram.ui.Cells.m8 m8Var = this.I2;
                    if (m8Var != null) {
                        m8Var.getImageView().d();
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
    public final boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a4.w.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, fyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new tn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f35986a1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f36014e1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.vs(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = a4.w.i("addToGroup", true);
        i10.putLong("chatId", this.A2.f22392id);
        m60 m60Var = new m60(i10);
        TLRPC.ChatFull chatFull = this.f36099q2;
        m60Var.E = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.f36099q2.participants.participants.size(); i11++) {
                hVar.k(null, this.f36099q2.participants.participants.get(i11).user_id);
            }
            m60Var.F = hVar;
        }
        m60Var.f40466x = new ex0(this, 9);
        presentFragment(m60Var);
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.M5 != null) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, this.f36129v0);
            int d = i0.a.d(0.5f, this.M5.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), this.M5.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()));
            if (!org.telegram.ui.ActionBar.g6.b1(v02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.g6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.g6.l1(0.7f, d));
                }
                return d;
            }
            boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.g6.l1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.g6.C(q6, v02, d, i10, i11);
        }
        return i10;
    }

    public final void w4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.w4(boolean):void");
    }

    public final void x3() {
        int i10;
        int i11;
        if (this.F5 != null) {
            ValueAnimator valueAnimator = this.f36023f2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f36023f2.cancel();
            }
            float clamp01 = Utilities.clamp01(this.M1 / this.B1);
            if (clamp01 > 0.0f) {
                float f9 = (clamp01 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.X1 = AndroidUtilities.lerp(0.42f, this.F5[0], clamp01);
                this.V1 = AndroidUtilities.lerp(this.K5, this.F5[1], clamp01);
                this.W1 = AndroidUtilities.lerp(translationY, this.F5[2], clamp01);
                this.Y1 = AndroidUtilities.lerp(this.F5[11], 0.0f, clamp01);
                this.U.setScaleX(this.X1);
                this.U.setScaleY(this.X1);
                this.U.setTranslationX(this.V1);
                this.U.setTranslationY(this.W1);
                org.telegram.ui.Components.aw0 aw0Var = this.P;
                if (aw0Var != null) {
                    aw0Var.setAlpha(clamp01);
                }
                this.f35985a0.setAlpha(1.0f);
                this.U.setAlpha(1.0f);
                oy0 oy0Var = this.f36097q0;
                if (oy0Var != null) {
                    oy0Var.invalidate();
                }
                jh.u0 u0Var = this.f36104r0;
                if (u0Var != null) {
                    u0Var.f12877e = AndroidUtilities.lerp(0.0f, this.F5[4], f9);
                    this.f36104r0.f12878f = AndroidUtilities.lerp(0.0f, this.F5[5], clamp01);
                    jh.u0 u0Var2 = this.f36104r0;
                    u0Var2.h = true;
                    u0Var2.invalidate();
                }
                h01 h01Var = this.X5;
                if (h01Var != null) {
                    h01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.F5[6], clamp01));
                }
                float dp = (((this.X1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f36005d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f36005d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f36013e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36013e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f36021f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36021f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f36028g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f36028g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.F5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.a2 = AndroidUtilities.lerp(floor, this.F5[8], clamp01);
                this.f36002c2 = AndroidUtilities.lerp(dpf2, this.F5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
                    if (i13 >= h5VarArr.length) {
                        break;
                    }
                    if (h5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i14 + 13], clamp01);
                        h5VarArr[i13].setTranslationX(lerp2);
                        h5VarArr[i13].setTranslationY(this.a2);
                        org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36103r;
                        h5VarArr2[i13].setTranslationX(this.f36061k5 + lerp3);
                        h5VarArr2[i13].setTranslationY(this.f36002c2);
                        if (i13 == 1) {
                            this.Z1 = lerp2;
                            this.f35994b2 = lerp3;
                            this.f36110s.setTranslationX(lerp3);
                            this.f36110s.setTranslationY(this.f36002c2);
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
                b5(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12);
                l4((int) this.F5[10], clamp01, true);
                org.telegram.ui.Components.zg0 zg0Var = this.W;
                if (zg0Var != null) {
                    zg0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.F5[3], f9));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f35986a1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f35986a1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f35986a1);
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
                tn tnVar = new tn(bundle);
                tnVar.f43035x9 = getMediaDataController().getGreetingsSticker();
                tnVar.f43046y9 = false;
                presentFragment(tnVar, z10);
                if (AndroidUtilities.isTablet() && !this.E0) {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final qg.d y() {
        return this.f36055j6;
    }

    public final float y3() {
        return Utilities.clamp01((this.M1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.f36099q2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f36099q2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new tn(bundle));
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
        this.W1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.X1 = 1.38f;
        this.Y1 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36020f;
            if (i11 >= h5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i11];
            if (h5Var != null) {
                float measuredWidth = (this.f35984a.getMeasuredWidth() / 2.0f) - (((h5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36103r;
                float measuredWidth2 = (this.f35984a.getMeasuredWidth() / 2.0f) - ((h5VarArr2[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) h5VarArr2[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.Z1 = measuredWidth;
                    this.f35994b2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.F1 != 2) {
            this.f36097q0.setAlpha(1.0f);
        }
        this.U.setAlpha(1.0f);
        this.f35985a0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f36106r2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                lh.i8 i8Var = new lh.i8(3, 1);
                i8Var.setResourceProvider(this.f36129v0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f36106r2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                i8Var.K0 = false;
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
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f36106r2.business_location.address, new Object[0]))));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.iu0 iu0Var) {
        super(bundle);
        this.f36020f = new org.telegram.ui.ActionBar.h5[2];
        this.h = null;
        this.f36075n = null;
        this.f36103r = new org.telegram.ui.ActionBar.h5[4];
        this.f36148y = new Drawable[2];
        this.A = new Drawable[2];
        this.C = new org.telegram.ui.Components.n5[2];
        this.D = new org.telegram.ui.Components.n5[2];
        this.E = new Drawable[2];
        this.F = new org.telegram.ui.Components.ir[2];
        this.G = new org.telegram.ui.Components.ir[2];
        this.f36111s0 = null;
        this.f36117t0 = new org.telegram.ui.Components.d50(this, 1);
        this.f36123u0 = new Paint(1);
        this.F0 = new boolean[1];
        this.X0 = 1.0f;
        this.f36150y1 = new a0.h();
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.U1 = new HashMap();
        this.f36044i2 = new float[]{0.0f, 1.0f};
        this.f36070m2 = new Paint();
        this.f36145x2 = -1;
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
        this.f36010d5 = new HashSet();
        this.f36026f5 = new org.telegram.ui.Cells.b2(this);
        this.f36033g5 = new wy0(this);
        this.f36141w5 = new vd.a(0, new ex0(this, 8), org.telegram.ui.Components.jr.h, 380L, true);
        this.C5 = new xy0(this);
        this.E5 = new yy0(this, 0);
        this.F5 = null;
        this.N5 = new SparseIntArray();
        this.P5 = null;
        this.Q5 = -1;
        this.U5 = -1.0f;
        qg.b bVar = new qg.b();
        this.f36068l6 = bVar;
        lg.a aVar = new lg.a(bVar);
        this.f36074m6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.f36096p6 = arrayList;
        RectF rectF = new RectF();
        this.q6 = rectF;
        RectF rectF2 = new RectF();
        this.r6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.N = iu0Var;
        qg.c cVar = new qg.c();
        cVar.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f36129v0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f36048i6 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.f36055j6 = dVar;
            lg.a aVar2 = new lg.a(dVar);
            this.f36062k6 = aVar2;
            aVar2.f15225f = LiteMode.isEnabled(262144);
        } else {
            this.f36048i6 = null;
            this.f36055j6 = null;
            this.f36062k6 = new lg.a(cVar);
        }
        aVar.f15223c = new zd.b(true);
    }

    @Override
    public final void P() {
    }
}

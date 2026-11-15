package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
public final class ec1 implements VoIPService.StateListener, org.telegram.messenger.is {
    public static ec1 f46670m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.q0 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public org.telegram.ui.Components.voip.l2 G;
    public boolean G0;
    public dc1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public kg.k L;
    public int M;
    public org.telegram.ui.Components.voip.e2 M0;
    public wg.c1 N;
    public org.telegram.ui.Components.ip N0;
    public z51 O;
    public org.telegram.ui.Components.ip O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public gi.j Q;
    public di.k4 R;
    public boolean R0;
    public hi.y4 S;
    public TextView T;
    public org.telegram.ui.ActionBar.l2 U;
    public boolean U0;
    public org.telegram.ui.Components.voip.q V;
    public float V0;
    public float W0;
    public float X0;
    public ac1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.r1 Z;
    public float Z0;
    public final int f46671a;
    public org.telegram.ui.Components.voip.r1 f46672a0;
    public boolean f46673a1;
    public Activity f46674b;
    public boolean f46675b0;
    public float f46676b1;
    public final TLRPC.User f46677c;
    public TextureViewRenderer f46678c0;
    public float f46679c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.o2 f46680d0;
    public int f46681d1;
    public org.telegram.ui.Components.voip.f3 f46682e;
    public org.telegram.ui.Components.voip.o2 f46683e0;
    public int f46684e1;
    public org.telegram.ui.Components.voip.f3 f46685f;
    public org.telegram.ui.Components.voip.e f46686f0;
    public boolean f46688g0;
    public boolean f46689g1;
    public org.telegram.ui.Components.voip.f3 h;
    public View f46690h0;
    public boolean f46691h1;
    public View f46692i0;
    public ValueAnimator f46693i1;
    public org.telegram.ui.Components.voip.n1 f46694j0;
    public boolean f46695j1;
    public org.telegram.ui.Components.voip.o2 f46697k1;
    public boolean l1;
    public boolean m0;
    public bc1 f46699n;
    public boolean f46700n0;
    public yb1 f46701o0;
    public int f46702p0;
    public int f46703q0;
    public WindowInsets f46705r0;
    public zb1 f46706s;
    public boolean f46707s0;
    public float f46708t0;
    public xb1 f46709u0;
    public int f46710v0;
    public org.telegram.ui.Components.voip.y2 f46711w;
    public AccessibilityManager f46712w0;
    public org.telegram.ui.Components.voip.v2 f46713x;
    public org.telegram.ui.Components.voip.z2 f46715y;
    public boolean f46717z0;
    public final org.telegram.ui.Components.voip.m1 f46704r = new org.telegram.ui.Components.voip.m1();
    public final org.telegram.ui.Components.i9[] W = new org.telegram.ui.Components.i9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint f46696k0 = new Paint();
    public final Paint f46698l0 = new Paint();
    public boolean f46714x0 = true;
    public float f46716y0 = 1.0f;
    public final h2.f L0 = new h2.f((int[]) null);
    public final ez0 Q0 = new ez0(this, 16);
    public final qb1 S0 = new qb1(this, 12);
    public final qb1 T0 = new qb1(this, 13);
    public float f46687f1 = 1.0f;

    public ec1(int i7) {
        this.f46671a = i7;
        this.f46677c = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(org.telegram.messenger.m10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f46703q0 = -1;
        this.f46702p0 = sharedState.getCallState();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.O4);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.M4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.E2);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.G5);
    }

    public static void a(ec1 ec1Var) {
        ec1 ec1Var2;
        if (ec1Var.f46689g1) {
            ec1Var.f46689g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ec1Var.f46693i1 = ofFloat;
            ec1Var2 = ec1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.i0(ec1Var2, ec1Var.f46687f1, ec1Var.Y0, ec1Var.Z0, 1));
            ec1Var2.f46693i1.addListener(new ub1(ec1Var2, 0));
            ec1Var2.f46693i1.setDuration(350L);
            ec1Var2.f46693i1.setInterpolator(org.telegram.ui.Components.er.f34419f);
            ec1Var2.f46693i1.start();
        } else {
            ec1Var2 = ec1Var;
        }
        ec1Var2.f46691h1 = false;
        ec1Var2.f46673a1 = false;
    }

    public static void h(int[] iArr, int i7) {
        ec1 ec1Var = f46670m1;
        if (ec1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ec1Var.f46709u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ec1Var.i(new ah0(5));
                } else if (!ec1Var.f46674b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.c2.h(ec1Var.f46674b, new qb1(ec1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ec1Var.f46709u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ec1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int size;
        int size2;
        float f10;
        ec1 ec1Var = f46670m1;
        if (ec1Var != null && ec1Var.f46709u0.getParent() == null) {
            ec1 ec1Var2 = f46670m1;
            if (ec1Var2 != null) {
                ec1Var2.f46680d0.d.release();
                f46670m1.f46683e0.d.release();
                f46670m1.f46678c0.release();
                xb1 xb1Var = f46670m1.f46709u0;
                if (xb1Var != null) {
                    xb1Var.d();
                }
                f46670m1.c();
            }
            f46670m1 = null;
        }
        if (f46670m1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.i2.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ec1 ec1Var3 = new ec1(i7);
                ec1Var3.f46674b = activity;
                f46670m1 = ec1Var3;
                xb1 xb1Var2 = new xb1(activity, !z10, ec1Var3);
                f46670m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f46670m1.getClass();
                xb1Var2.setLockOnScreen(f46670m1.J0);
                ec1Var3.f46709u0 = xb1Var2;
                pb1 pb1Var = new pb1(ec1Var3, 3);
                WeakHashMap weakHashMap = r0.i0.f55671a;
                r0.a0.i(xb1Var2, pb1Var);
                ((WindowManager) activity.getSystemService("window")).addView(xb1Var2, org.telegram.ui.Components.voip.s2.a());
                ec1Var3.f46708t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ec1Var3.f46712w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                zb1 zb1Var = new zb1(ec1Var3, activity);
                zb1Var.setClipToPadding(false);
                zb1Var.setClipChildren(false);
                zb1Var.setBackgroundColor(-16777216);
                ec1Var3.x();
                ec1Var3.f46706s = zb1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.m1 m1Var = ec1Var3.f46704r;
                ec1Var3.f46711w = new org.telegram.ui.Components.voip.y2(activity, z11, m1Var);
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity, false, true, false, false);
                ec1Var3.f46680d0 = o2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                o2Var.d.setScalingType(scalingType);
                ec1Var3.f46680d0.d.setEnableHardwareScaler(true);
                ec1Var3.f46680d0.d.setRotateTextureWithScreen(true);
                ec1Var3.f46680d0.f40832b0 = 1;
                zb1Var.addView(ec1Var3.f46711w, c8.ja.c(-1.0f, -1));
                TLRPC.User user = ec1Var3.d;
                org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity, user, m1Var);
                ec1Var3.f46713x = v2Var;
                zb1Var.addView(v2Var, c8.ja.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.qc.e(512)) {
                    int i11 = org.telegram.ui.ActionBar.j6.f28784a;
                    Calendar calendar = Calendar.getInstance();
                    z12 = z10;
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f41122a = new org.telegram.ui.Components.du0(0);
                    }
                } else {
                    z12 = z10;
                }
                ec1Var3.f46715y = view;
                zb1Var.addView((View) view, c8.ja.c(220.0f, -1));
                zb1Var.addView(ec1Var3.f46680d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.h9(orientation, new int[]{-14994098, -14328963}).f(ia.d.H(0.5f, 1), new b71(ec1Var3, 1), 0L);
                org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(activity);
                ec1Var3.Z = r1Var;
                r1Var.setDelegate(new pb1(ec1Var3, 2));
                ec1Var3.Z.d(1.0f, 1.0f);
                ec1Var3.f46675b0 = true;
                org.telegram.ui.Components.voip.o2 o2Var2 = new org.telegram.ui.Components.voip.o2(activity, true, false);
                ec1Var3.f46683e0 = o2Var2;
                o2Var2.d.setIsCamera(true);
                ec1Var3.f46683e0.d.setUseCameraRotation(true);
                ec1Var3.Z.setOnTapListener(new rb1(ec1Var3, 1));
                ec1Var3.f46683e0.d.setMirror(true);
                ec1Var3.Z.addView(ec1Var3.f46683e0);
                org.telegram.ui.Components.voip.r1 r1Var2 = new org.telegram.ui.Components.voip.r1(activity);
                ec1Var3.f46672a0 = r1Var2;
                r1Var2.T = true;
                r1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ec1Var3.f46678c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ec1Var3.f46678c0.setIsCamera(false);
                ec1Var3.f46678c0.setFpsReduction(30.0f);
                ec1Var3.f46678c0.setScalingType(scalingType);
                ec1Var3.f46672a0.addView(ec1Var3.f46678c0, c8.ja.e(-1, -2, 17));
                ec1Var3.f46672a0.setOnTapListener(new rb1(ec1Var3, 2));
                ec1Var3.f46672a0.setVisibility(8);
                zb1Var.addView(ec1Var3.Z, c8.ja.c(-2.0f, -2));
                zb1Var.addView(ec1Var3.f46672a0);
                View view2 = new View(activity);
                ec1Var3.f46690h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                zb1Var.addView(ec1Var3.f46690h0, c8.ja.e(-1, 160, 80));
                View view3 = new View(activity);
                ec1Var3.f46692i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                zb1Var.addView(ec1Var3.f46692i0, c8.ja.e(-1, 160, 48));
                z51 z51Var = new z51(24, activity, ec1Var3);
                ec1Var3.O = z51Var;
                z51Var.setOrientation(0);
                ec1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
                ec1Var3.O.setClipToPadding(false);
                ec1Var3.O.setContentDescription(org.telegram.messenger.hd.M0(2131743302, null));
                ec1Var3.O.setOnClickListener(new rb1(ec1Var3, 3));
                ec1Var3.Q = new gi.j(activity, m1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ec1Var3.P = frameLayout;
                frameLayout.addView(ec1Var3.Q, c8.ja.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ec1Var3.P.setVisibility(8);
                ec1Var3.P.setOnClickListener(new rb1(ec1Var3, 4));
                hi.y4 y4Var = new hi.y4(activity, m1Var);
                ec1Var3.S = y4Var;
                y4Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ec1Var3.T = textView;
                textView.setText(org.telegram.messenger.hd.M0(2131743491, null));
                ec1Var3.T.setTextSize(1, 15.0f);
                ec1Var3.T.setTypeface(org.telegram.messenger.g0.o());
                ec1Var3.T.setTextColor(-1);
                ec1Var3.T.setGravity(17);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(8, activity, ec1Var3);
                ec1Var3.U = l2Var;
                l2Var.setTextSize(1, 15.0f);
                ec1Var3.U.setTextColor(-1);
                ec1Var3.U.setGravity(17);
                ec1Var3.U.setText(org.telegram.messenger.hd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.q10.j(user, true), ec1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
                ec1Var3.S.setVisibility(8);
                ec1Var3.S.addView(ec1Var3.T);
                ec1Var3.S.addView(ec1Var3.U, c8.ja.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ec1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
                    org.telegram.ui.Components.i9[] i9VarArr = ec1Var3.W;
                    i9VarArr[i14] = i9Var;
                    i9VarArr[i14].getImageReceiver().S0 = true;
                    z51 z51Var2 = ec1Var3.O;
                    org.telegram.ui.Components.i9 i9Var2 = i9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    z51Var2.addView(i9Var2, c8.ja.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ac1 ac1Var = new ac1(ec1Var3, activity);
                ec1Var3.Y = ac1Var;
                ac1Var.setOrientation(1);
                ec1Var3.Y.setFocusable(true);
                ec1Var3.Y.setFocusableInTouchMode(true);
                ec1Var3.E = new org.telegram.ui.Components.voip.q0(activity);
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.r(user);
                org.telegram.ui.Components.voip.q0 q0Var = ec1Var3.E;
                int i15 = ec1Var3.f46671a;
                q0Var.f40880b.j(org.telegram.messenger.gc.m(i15, 0, user), null, t8Var, user);
                ec1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ec1Var3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                ec1Var3.F.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g5.m(0, user.first_name, user.last_name), ec1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
                ec1Var3.F.setMaxLines(2);
                ec1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
                ec1Var3.F.setTextColor(-1);
                ec1Var3.F.setGravity(1);
                ec1Var3.F.setImportantForAccessibility(2);
                ec1Var3.Y.addView(ec1Var3.F, c8.ja.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f40763a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f40763a[i16] = new TextView(activity);
                    frameLayout2.f40763a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f40763a[i16].setTextColor(-1);
                    frameLayout2.f40763a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f40763a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f40765c = frameLayout3;
                org.telegram.ui.Components.voip.b1 b1Var = new org.telegram.ui.Components.voip.b1(frameLayout2, activity, m1Var);
                b1Var.setTextSize(1, 15.0f);
                b1Var.setTextColor(-1);
                b1Var.setGravity(1);
                b1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
                b1Var.setText(org.telegram.messenger.hd.M0(2131743217, null));
                frameLayout3.addView(b1Var, c8.ja.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, c8.ja.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f40764b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, c8.ja.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131743253, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new kg.p1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(activity);
                frameLayout2.d = p2Var;
                frameLayout2.addView(p2Var, c8.ja.c(-2.0f, -1));
                ec1Var3.G = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f55671a;
                frameLayout2.setImportantForAccessibility(4);
                ec1Var3.Y.addView(ec1Var3.G, c8.ja.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    dc1 dc1Var = new dc1(activity);
                    ec1Var3.H = dc1Var;
                    long j3 = sharedState.getUser().f28200id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i18 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i18 <= 0) {
                        dc1Var.setVisibility(8);
                    } else {
                        if (groupParticipants == null) {
                            size = 0;
                        } else {
                            size = groupParticipants.size();
                        }
                        int max = Math.max(i18, size);
                        if (groupParticipants == null) {
                            size2 = 0;
                        } else {
                            size2 = groupParticipants.size();
                        }
                        int min = Math.min(3, size2);
                        org.telegram.ui.Components.v8 v8Var = dc1Var.f46340b;
                        v8Var.i(min);
                        int i19 = 0;
                        while (i19 < min) {
                            v8Var.j(i19, i15, org.telegram.messenger.np.s1(i15).e2(org.telegram.messenger.m5.o(groupParticipants.get(i19).peer)));
                            i19++;
                            dc1Var = dc1Var;
                        }
                        dc1 dc1Var2 = dc1Var;
                        v8Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.m5.o(groupParticipants.get(0).peer) == j3))) {
                            dc1Var2.setVisibility(8);
                        } else {
                            dc1Var2.f46341c = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                            dc1Var2.setVisibility(0);
                            dc1Var2.invalidate();
                        }
                    }
                    ec1Var3.Y.addView(ec1Var3.H, c8.ja.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ec1Var3.Y.setClipChildren(false);
                ec1Var3.Y.setClipToPadding(false);
                ec1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
                ec1Var3.V = new org.telegram.ui.Components.voip.q(activity);
                ec1Var3.R = new di.k4(activity, m1Var);
                ec1Var3.V.setAlpha(0.0f);
                ec1Var3.R.setVisibility(8);
                zb1Var.addView(ec1Var3.E, c8.ja.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.Y, c8.ja.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.P, c8.ja.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.S, c8.ja.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.O, c8.ja.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.V, c8.ja.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.R, c8.ja.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ec1Var3.f46694j0 = new org.telegram.ui.Components.voip.n1(activity);
                ec1Var3.f46682e = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                ec1Var3.f46685f = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                ec1Var3.h = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                ec1Var3.f46699n = new org.telegram.ui.Components.voip.r2(activity, 52.0f);
                ec1Var3.f46682e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f46682e.setScaleX(0.0f);
                ec1Var3.f46682e.setScaleY(0.0f);
                ec1Var3.f46682e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f46685f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f46685f.setScaleX(0.0f);
                ec1Var3.f46685f.setScaleY(0.0f);
                ec1Var3.f46685f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.h.setScaleX(0.0f);
                ec1Var3.h.setScaleY(0.0f);
                ec1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f46699n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f46699n.setScaleX(0.0f);
                ec1Var3.f46699n.setScaleY(0.0f);
                ec1Var3.f46699n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f46694j0.addView(ec1Var3.f46682e);
                ec1Var3.f46694j0.addView(ec1Var3.f46685f);
                ec1Var3.f46694j0.addView(ec1Var3.h);
                ec1Var3.f46694j0.addView(ec1Var3.f46699n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ec1Var3.f46686f0 = eVar;
                eVar.setListener(new cc1(ec1Var3));
                ec1Var3.f46686f0.setScaleX(1.15f);
                ec1Var3.f46686f0.setScaleY(1.15f);
                zb1Var.addView(ec1Var3.f46694j0, c8.ja.e(-1, -2, 80));
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                zb1Var.addView(ec1Var3.f46686f0, c8.ja.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                ec1Var3.J = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.J.setImageResource(2131232046);
                ec1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                zb1Var.addView(ec1Var3.J, c8.ja.e(56, 56, 53));
                c8.na.a(ec1Var3.J);
                ImageView imageView2 = new ImageView(activity);
                ec1Var3.I = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.I.setImageResource(2131232081);
                ec1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                ec1Var3.I.setContentDescription(org.telegram.messenger.hd.M0(2131753756, null));
                zb1Var.addView(ec1Var3.I, c8.ja.e(56, 56, 51));
                c8.na.a(ec1Var3.I);
                kg.k kVar = new kg.k(activity, 5);
                ec1Var3.L = kVar;
                kVar.setContentDescription(org.telegram.messenger.hd.M0(2131743239, null));
                ec1Var3.L.setBackground(org.telegram.ui.ActionBar.j6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                zb1Var.addView(ec1Var3.L, c8.ja.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ec1Var3.L.setAlpha(0.0f);
                ec1Var3.L.setOnClickListener(new rb1(ec1Var3, 5));
                ec1Var3.I.setOnClickListener(new rb1(ec1Var3, 6));
                ec1Var3.J.setOnClickListener(new a90(23, ec1Var3, activity));
                if (ec1Var3.f46709u0.f40946b) {
                    ec1Var3.I.setVisibility(8);
                    ec1Var3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f40585a = new HashMap();
                linearLayout.f40586b = new ArrayList();
                linearLayout.f40587c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f40591r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f40590n = m1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                ec1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                ec1Var3.M0.setOnViewsUpdated(new qb1(ec1Var3, 5));
                zb1Var.addView(ec1Var3.M0, c8.ja.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(activity, 3, m1Var, true);
                ipVar.r(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                ipVar.L = alignment;
                ipVar.d = -1L;
                ipVar.f14570r0 = new qb1(ec1Var3, 6);
                ipVar.U = true;
                ipVar.h = org.telegram.messenger.g0.L(320.0f);
                ipVar.f14554e = true;
                ipVar.n(10.0f, 6.0f, 10.0f, 6.0f);
                ipVar.s(8.0f);
                ec1Var3.N0 = ipVar;
                ipVar.u(org.telegram.messenger.hd.M0(2131744254, null));
                zb1Var.addView(ec1Var3.N0, c8.ja.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.ip ipVar2 = new org.telegram.ui.Components.ip(activity, 1, m1Var, false);
                ipVar2.r(true);
                ipVar2.L = alignment;
                ipVar2.d = 4000L;
                ipVar2.U = true;
                ipVar2.h = org.telegram.messenger.g0.L(320.0f);
                ipVar2.f14554e = true;
                ipVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
                ipVar2.s(8.0f);
                ec1Var3.O0 = ipVar2;
                ipVar2.u(org.telegram.messenger.hd.M0(2131743302, null));
                zb1Var.addView(ec1Var3.O0, c8.ja.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ec1Var3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ec1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ec1Var3.U0 = z13;
                    }
                    ec1Var3.f();
                }
                xb1Var2.addView(zb1Var);
                if (z12) {
                    ec1Var3.F0 = 0.0f;
                    ec1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ec1Var3.f46680d0.setStub(org.telegram.ui.Components.voip.i2.d().f40664s);
                        ec1Var3.f46683e0.setStub(org.telegram.ui.Components.voip.i2.d().f40663r);
                    }
                    ec1Var3.f46709u0.setAlpha(0.0f);
                    ec1Var3.y();
                    ec1Var3.E0 = true;
                    org.telegram.ui.Components.voip.i2.T = true;
                    if (org.telegram.ui.Components.voip.i2.V == null) {
                        ec1Var3.L0.d();
                        org.telegram.messenger.g0.i3(new qb1(ec1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.i2.U.getClass();
                        throw null;
                    }
                } else {
                    ec1Var3.F0 = 1.0f;
                    ec1Var3.x();
                }
                org.telegram.ui.Components.voip.j2.g();
            }
        }
    }

    public final ValueAnimator b(boolean z10) {
        char c10;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z11;
        final float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        this.Z.animate().cancel();
        float f20 = org.telegram.ui.Components.voip.i2.d().d.x + org.telegram.ui.Components.voip.i2.d().F;
        float f21 = org.telegram.ui.Components.voip.i2.d().d.y + org.telegram.ui.Components.voip.i2.d().G;
        final float x10 = this.Z.getX();
        final float y10 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.i2.U.getClass();
        final float measuredWidth2 = f20 - ((this.f46680d0.getMeasuredWidth() - (this.f46680d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f21 - ((this.f46680d0.getMeasuredHeight() - (this.f46680d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f22 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (this.f46700n0 && measuredWidth3 != 0) {
                f19 = (this.f46709u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.y0.x(org.telegram.ui.Components.voip.i2.d().f40661f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().f40661f * 0.25f) + (f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f18 = org.telegram.ui.Cells.y0.x(org.telegram.ui.Components.voip.i2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().h * 0.25f) + (f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z12 = true;
            } else {
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f18 = 1.0f;
                z12 = false;
                f19 = 0.0f;
            }
            measuredHeight = f18;
            z11 = z12;
            f11 = f19;
        } else {
            c10 = 0;
            f10 = 4.0f;
            measuredWidth = f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z11 = true;
        }
        final float f23 = measuredWidth;
        if (this.m0) {
            f12 = org.telegram.messenger.g0.L(f10);
        } else {
            f12 = 0.0f;
        }
        final float L = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.m0) {
            org.telegram.ui.Components.voip.i2.U.getClass();
            f13 = 1.0f;
            f22 = 0.0f;
        } else {
            f13 = 1.0f;
        }
        float f24 = f13;
        if (z10) {
            if (z11) {
                this.Z.setScaleX(f11);
                this.Z.setScaleY(f11);
                this.Z.setTranslationX(f23);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L);
                this.Z.setAlpha(f22);
            }
            this.f46680d0.setScaleX(0.25f);
            this.f46680d0.setScaleY(0.25f);
            this.f46680d0.setTranslationX(measuredWidth2);
            this.f46680d0.setTranslationY(measuredHeight2);
            f14 = 0.25f;
            this.f46680d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f24) / 0.25f);
        } else {
            f14 = 0.25f;
        }
        if (z10) {
            f15 = f24;
        } else {
            f15 = 0.0f;
        }
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f24;
        }
        float[] fArr = new float[2];
        fArr[c10] = f15;
        fArr[1] = f16;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f17 = 0.0f;
        } else {
            f17 = f24;
        }
        this.F0 = f17;
        x();
        final float f25 = f14;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f26 = 1.0f - floatValue;
                ec1 ec1Var = ec1.this;
                ec1Var.F0 = f26;
                ec1Var.x();
                if (z11) {
                    float f27 = (f11 * floatValue) + (scaleX * f26);
                    ec1Var.Z.setScaleX(f27);
                    ec1Var.Z.setScaleY(f27);
                    ec1Var.Z.setTranslationX((f23 * floatValue) + (x10 * f26));
                    ec1Var.Z.setTranslationY((measuredHeight * floatValue) + (y10 * f26));
                    ec1Var.Z.setCornerRadius((L * floatValue) + (f12 * f26));
                    ec1Var.Z.setAlpha((f22 * floatValue) + (1.0f * f26));
                }
                float f28 = (f25 * floatValue) + (1.0f * f26);
                ec1Var.f46680d0.setScaleX(f28);
                ec1Var.f46680d0.setScaleY(f28);
                float f29 = 0.0f * f26;
                float f30 = (measuredWidth2 * floatValue) + f29;
                float f31 = (measuredHeight2 * floatValue) + f29;
                ec1Var.f46680d0.setTranslationX(f30);
                ec1Var.f46680d0.setTranslationY(f31);
                ec1Var.f46680d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f28);
                if (!ec1Var.Z.Q) {
                    ec1Var.f46683e0.d(false, floatValue);
                }
                ec1Var.f46709u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.O4);
        org.telegram.messenger.ns.f(this.f46671a).n(this, org.telegram.messenger.ns.M4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.E2);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.G5);
        wg.c1 c1Var = this.N;
        if (c1Var != null) {
            c1Var.dismiss();
            this.N = null;
        }
    }

    public final void d(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f46714x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.v2 v2Var = this.f46713x;
            if (v2Var.L && z10 != v2Var.F) {
                v2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                v2Var.f41013c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u2(v2Var, 1));
                v2Var.f41013c.setInterpolator(org.telegram.ui.Components.er.f34419f);
                v2Var.f41013c.setDuration(200L);
                v2Var.f41013c.start();
            }
            if (z10) {
                int i7 = org.telegram.messenger.gz.f23948f1;
                if (i7 < 2) {
                    org.telegram.messenger.gz.f23948f1 = i7 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.gz.f23948f1);
                    edit.apply();
                }
                this.O0.f(true);
                org.telegram.messenger.g0.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.er.f34420g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34419f;
                org.telegram.messenger.i20.n(translationY, erVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ub1(this, 3)).setInterpolator(erVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f34419f;
                duration.setInterpolator(erVar2).setListener(new nn(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(erVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new ub1(this, 4)).setDuration(250L).setInterpolator(erVar2).start();
            }
            this.f46703q0 = this.f46702p0;
            y();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.M4) {
            if (this.f46702p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f46683e0.d.release();
                this.f46680d0.d.release();
                this.f46678c0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i7 == org.telegram.messenger.ns.f25515i4) {
            v(true);
        } else if (i7 == org.telegram.messenger.ns.E2) {
            this.f46709u0.b();
        } else if (i7 == org.telegram.messenger.ns.O4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i7 == org.telegram.messenger.ns.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f46688g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        this.f46709u0.b();
    }

    public final void f() {
        this.f46683e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new vb1(this));
        this.f46680d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new wb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f46678c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            yb1 yb1Var = this.f46701o0;
            if (yb1Var != null) {
                yb1Var.a(false, false);
            } else if (this.m0 && this.f46700n0 && this.H0) {
                this.H0 = false;
                this.Z.setRelativePosition(this.f46672a0);
                this.f46675b0 = false;
                this.f46703q0 = this.f46702p0;
                y();
            } else if (this.C0) {
                d(false);
            } else if (this.S.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (!this.G0 && f46670m1 != null) {
                        this.G0 = true;
                        if (VoIPService.getSharedInstance() != null) {
                            int measuredHeight = f46670m1.f46709u0.getMeasuredHeight();
                            ec1 ec1Var = f46670m1;
                            org.telegram.ui.Components.voip.i2.f(ec1Var.f46674b, ec1Var.f46671a, ec1Var.f46709u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = f46670m1.f46705r0;
                            if (windowInsets != null) {
                                org.telegram.ui.Components.voip.i2.W = windowInsets.getSystemWindowInsetTop();
                                f46670m1.f46705r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (org.telegram.ui.Components.voip.i2.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34419f;
                            duration.setInterpolator(erVar).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                            this.f46694j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
                            this.f46690h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
                            this.f46692i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
                            this.f46672a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
                            org.telegram.ui.Components.voip.i2.T = true;
                            this.E0 = true;
                            ValueAnimator b10 = b(false);
                            this.L0.d();
                            b10.addListener(new ub1(this, 1));
                            b10.setDuration(350L);
                            b10.setInterpolator(erVar);
                            b10.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f46709u0.b();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f46685f.getVisibility() == 0) {
            this.f46686f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f46686f0;
            ValueAnimator valueAnimator = eVar.f40562c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f40562c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.f46699n.animate().cancel();
        this.f46682e.animate().cancel();
        this.h.animate().cancel();
        this.f46685f.animate().cancel();
        this.f46686f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f46686f0;
        ValueAnimator valueAnimator2 = eVar2.f40562c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f40562c0 = null;
            eVar2.V.stop();
        }
        this.f46699n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.M0(2131743411, null), false, false);
        this.f46682e.d(5, false, false);
        this.h.d(1, false, false);
        this.f46685f.d(3, true, false);
        this.f46699n.setVisibility(0);
        this.f46682e.setVisibility(0);
        this.h.setVisibility(0);
        this.f46685f.setVisibility(0);
        this.f46699n.setAlpha(0.0f);
        this.f46682e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f46685f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46686f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ec1 ec1Var = ec1.this;
                ec1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ec1Var.f46686f0.setTranslationY(L2 * floatValue);
                int i7 = marginEnd;
                int i10 = (int) (i7 - ((i7 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                ec1Var.f46686f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f46686f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f46686f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f46686f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f46686f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.y50(17, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.i3(new qb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService) {
        if (!this.f46700n0) {
            f3Var.d(2, false, false);
            f3Var.setOnBtnClickedListener(null);
            f3Var.setEnabled(false);
            return;
        }
        f3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            f3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            f3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        f3Var.setOnBtnClickedListener(new a7(this, voIPService, f3Var, 23));
    }

    public final void k(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService, boolean z10) {
        f3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.r1 r1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = r1Var.f40908g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            r1Var.L = f10;
            r1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = r1Var.f40908g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = r1Var.L;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            r1Var.f40908g0 = ofFloat;
            ofFloat.addUpdateListener(r1Var.f40909h0);
            r1Var.f40908g0.setDuration(150L);
            r1Var.f40908g0.start();
        }
        f3Var.setOnBtnClickedListener(new pb1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            f3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            f3Var.d(5, true, false);
        } else {
            f3Var.d(5, false, false);
            i7 = 1;
            f3Var.setEnabled(true);
            f3Var.setOnBtnClickedListener(new bg.f0(this, i7, f3Var, voIPService, 9));
        }
        i7 = i10;
        f3Var.setEnabled(true);
        f3Var.setOnBtnClickedListener(new bg.f0(this, i7, f3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f46700n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f46700n0) {
                if (voIPService.isScreencast()) {
                    f3Var.d(3, false, z10);
                } else {
                    f3Var.d(3, false, z10);
                }
            } else {
                f3Var.d(3, true, z10);
            }
            f3Var.setOnBtnClickedListener(new pb1(this, 5));
            f3Var.setEnabled(true);
            return;
        }
        f3Var.d(3, true, false);
        f3Var.setOnClickListener(null);
        f3Var.setEnabled(false);
    }

    public final void o(boolean z10, boolean z11) {
        boolean z12;
        int i7 = 0;
        if (!this.f46700n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.E.getTag() == null) {
                this.E.animate().setListener(null).cancel();
                this.E.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.E.setAlpha(0.0f);
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
                    } else {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
                    }
                } else if (z11) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            } else if (!z12 && this.E.getTag() != null) {
                this.E.animate().setListener(null).cancel();
                this.E.setTranslationY(0.0f);
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.er.f34419f).setListener(new ub1(this, 8)).start();
            }
        } else {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            org.telegram.ui.Components.voip.q0 q0Var = this.E;
            if (!z12) {
                i7 = 8;
            }
            q0Var.setVisibility(i7);
        }
        org.telegram.ui.Components.voip.q0 q0Var2 = this.E;
        if (z12) {
            num = 1;
        }
        q0Var2.setTag(num);
    }

    @Override
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f46703q0 = this.f46702p0;
        y();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        this.f46703q0 = this.f46702p0;
        if (i10 == 2 && !this.U0) {
            this.U0 = true;
        }
        org.telegram.ui.Components.voip.j2.g();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.y2 y2Var;
        if (i7 > 0) {
            this.f46695j1 = true;
        }
        if (this.G != null && (y2Var = this.f46711w) != null) {
            int i10 = y2Var.W;
            if ((i10 == 2 || i10 == 3) && this.f46695j1) {
                org.telegram.messenger.g0.i3(new nb1(this, i7, 0), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        int i10 = this.f46702p0;
        if (i10 != i7) {
            this.f46703q0 = i10;
            this.f46702p0 = i7;
            if (this.f46709u0 != null) {
                y();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f46703q0 = this.f46702p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.f46674b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, this.f46674b, null);
        boolean[] zArr = new boolean[3];
        t1Var.S = org.telegram.messenger.hd.M0(2131743408, null);
        t1Var.U = charSequence;
        t1Var.m0 = org.telegram.messenger.hd.M0(2131747831, null);
        t1Var.f29642n0 = null;
        t1Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) t1Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, t1Var.f29638j1);
            }
        }
        t1Var.setCanceledOnTouchOutside(true);
        t1Var.setOnDismissListener(new q5(this, 18));
    }

    public final void q(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.f46714x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        boolean z13 = true;
        if (i7 == 0) {
            if (z10) {
                if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.r1 r1Var = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(r1Var, View.ALPHA, r1Var.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.r1 r1Var2 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var2, View.SCALE_X, r1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.r1 r1Var3 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(r1Var3, View.SCALE_Y, r1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ub1(this, 7));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.er.f34419f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                this.Z.setVisibility(8);
            }
        } else {
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z10) {
                if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                    if (this.Z.getVisibility() == 8) {
                        this.Z.setAlpha(0.0f);
                        this.Z.setScaleX(0.7f);
                        this.Z.setScaleY(0.7f);
                        this.Z.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.A0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.7f, 1.0f));
                    this.A0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.Z.setVisibility(0);
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.r1 r1Var4 = this.Z;
                if (r1Var4.E < 0.0f) {
                    r1Var4.d(1.0f, 1.0f);
                    this.f46675b0 = true;
                }
            }
            org.telegram.ui.Components.voip.r1 r1Var5 = this.Z;
            if (i7 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            r1Var5.c(z12, z11);
            if (i7 == 2) {
                z13 = false;
            }
            this.f46675b0 = z13;
        }
        this.Z.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z10) {
        int i7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ez0 ez0Var = this.Q0;
        int i10 = 0;
        if (!z10 && this.f46714x0) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34419f;
            duration.setInterpolator(erVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(erVar).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(erVar).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(erVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(erVar).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(erVar).start();
            this.f46694j0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(erVar).start();
            this.f46690h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
            this.f46692i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46716y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(ez0Var);
            this.P0.setDuration(150L).setInterpolator(erVar);
            this.P0.start();
            org.telegram.messenger.g0.r(this.S0);
            this.R0 = false;
            this.f46694j0.setEnabled(false);
            this.O0.f(true);
            i7 = 150;
        } else {
            if (z10 && !this.f46714x0) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f34419f;
                translationY.setInterpolator(erVar2).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(erVar2).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.f46694j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.f46690h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar2).start();
                this.f46692i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f46716y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(ez0Var);
                this.P0.setDuration(150L).setInterpolator(erVar2);
                this.P0.start();
                this.f46694j0.setEnabled(true);
            }
            i7 = 0;
        }
        this.f46714x0 = z10;
        xb1 xb1Var = this.f46709u0;
        if (!z10) {
            xb1Var.setSystemUiVisibility(xb1Var.getSystemUiVisibility() | 4);
        } else {
            xb1Var.setSystemUiVisibility(xb1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i11 = -org.telegram.messenger.g0.L(16.0f);
        if (this.f46714x0) {
            i10 = org.telegram.messenger.g0.L(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            qb1 qb1Var = this.S0;
            org.telegram.messenger.g0.r(qb1Var);
            this.R0 = false;
            if (this.f46717z0 && this.f46714x0) {
                org.telegram.messenger.g0.i3(qb1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        String M0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f46712w0.isTouchExplorationEnabled()) {
                if (!this.f46700n0) {
                    M0 = org.telegram.messenger.hd.M0(2131754732, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754733, null);
                }
                this.f46706s.announceForAccessibility(M0);
            }
            if (!this.f46700n0) {
                if (this.f46701o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f46709u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f46685f.getLocationOnScreen(iArr);
                    yb1 yb1Var = new yb1(this, this.f46706s.getContext(), iArr[0], iArr[1]);
                    this.f46701o0 = yb1Var;
                    WindowInsets windowInsets = this.f46705r0;
                    if (windowInsets != null) {
                        yb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f46706s.addView(this.f46701o0);
                    return;
                }
                return;
            }
            this.f46683e0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f46703q0 = this.f46702p0;
            y();
        }
    }

    public final void u(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34419f;
                transitionSet.addTransition(duration.setInterpolator(erVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(erVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.r2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.f3.class, true);
                TransitionManager.beginDelayedTransition(this.f46694j0, transitionSet);
            }
            int i7 = this.f46702p0;
            if (i7 == 11) {
                this.f46682e.setVisibility(8);
                this.f46685f.setVisibility(8);
                this.h.setVisibility(8);
                this.f46699n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i7 != 15 && i7 != 17) {
                if (f46670m1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f46700n0 || this.m0)) {
                    j(this.f46682e, sharedInstance);
                    if (this.f46714x0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                } else {
                    l(this.f46682e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                }
                m(this.f46685f, sharedInstance, false);
                k(this.h, sharedInstance, z10);
                this.f46699n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.M0(2131743411, null), false, z10);
                this.f46699n.setOnClickListener(new rb1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i7 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f46700n0 || this.m0)) {
                        j(this.f46682e, sharedInstance);
                        if (this.f46714x0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    } else {
                        l(this.f46682e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    }
                    m(this.f46685f, sharedInstance, false);
                    k(this.h, sharedInstance, z10);
                } else {
                    this.f46682e.setVisibility(8);
                    this.f46685f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f46699n.setVisibility(8);
            }
            if (this.f46682e.getVisibility() == 0) {
                this.f46682e.f40616f = 0;
                i10 = 16;
            }
            if (this.f46685f.getVisibility() == 0) {
                this.f46685f.f40616f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f40616f = i10;
                i10 += 16;
            }
            if (this.f46699n.getVisibility() == 0) {
                this.f46699n.G = i10;
            }
            w();
        }
    }

    public final void v(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec1.v(boolean):void");
    }

    public final void w() {
        int i7;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i7 = 2131230916;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i7 = 2131230924;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i7 = 2131230920;
        } else {
            i7 = 2131230921;
        }
        if (this.K != i7) {
            org.telegram.messenger.g0.Q3(this.L, i7);
        } else {
            this.L.setImageResource(i7);
        }
        this.K = i7;
    }

    public final void x() {
        this.f46696k0.setColor(i0.a.o(-16777216, (int) (this.f46716y0 * 102.0f * this.F0)));
        this.f46698l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        zb1 zb1Var = this.f46706s;
        if (zb1Var != null) {
            zb1Var.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec1.y():void");
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

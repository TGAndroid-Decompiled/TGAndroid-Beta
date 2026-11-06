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
public final class ec1 implements VoIPService.StateListener, org.telegram.messenger.ls {
    public static ec1 l1;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.voip.p0 D;
    public boolean D0;
    public TextView E;
    public float E0;
    public org.telegram.ui.Components.voip.h2 F;
    public boolean F0;
    public dc1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public long J0;
    public kg.k K;
    public int L;
    public org.telegram.ui.Components.voip.a2 L0;
    public wg.f1 M;
    public org.telegram.ui.Components.zo M0;
    public c61 N;
    public org.telegram.ui.Components.zo N0;
    public FrameLayout O;
    public ValueAnimator O0;
    public ei.k P;
    public bi.m5 Q;
    public boolean Q0;
    public fi.a5 R;
    public TextView S;
    public org.telegram.ui.ActionBar.m2 T;
    public boolean T0;
    public org.telegram.ui.Components.voip.q U;
    public float U0;
    public float V0;
    public float W0;
    public ac1 X;
    public float X0;
    public org.telegram.ui.Components.voip.n1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.n1 Z;
    public boolean Z0;
    public final int f45271a;
    public boolean f45272a0;
    public float f45273a1;
    public Activity f45274b;
    public TextureViewRenderer f45275b0;
    public float f45276b1;
    public final TLRPC.User f45277c;
    public org.telegram.ui.Components.voip.k2 f45278c0;
    public int f45279c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.k2 f45280d0;
    public int f45281d1;
    public org.telegram.ui.Components.voip.b3 f45282e;
    public org.telegram.ui.Components.voip.e f45283e0;
    public org.telegram.ui.Components.voip.b3 f45285f;
    public boolean f45286f0;
    public boolean f45287f1;
    public View f45288g0;
    public boolean f45289g1;
    public org.telegram.ui.Components.voip.b3 h;
    public View f45290h0;
    public ValueAnimator f45291h1;
    public org.telegram.ui.Components.voip.j1 f45292i0;
    public boolean f45293i1;
    public org.telegram.ui.Components.voip.k2 f45295j1;
    public boolean f45297k1;
    public boolean f45298l0;
    public boolean m0;
    public bc1 f45299n;
    public yb1 f45300n0;
    public int f45301o0;
    public int f45302p0;
    public WindowInsets f45303q0;
    public boolean f45305r0;
    public zb1 f45306s;
    public float f45307s0;
    public xb1 f45308t0;
    public int f45309u0;
    public AccessibilityManager f45310v0;
    public org.telegram.ui.Components.voip.u2 f45311w;
    public org.telegram.ui.Components.voip.r2 f45313x;
    public org.telegram.ui.Components.voip.v2 f45315y;
    public boolean f45316y0;
    public AnimatorSet f45317z0;
    public final org.telegram.ui.Components.voip.i1 f45304r = new org.telegram.ui.Components.voip.i1();
    public final org.telegram.ui.Components.l9[] V = new org.telegram.ui.Components.l9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f45294j0 = new Paint();
    public final Paint f45296k0 = new Paint();
    public boolean f45312w0 = true;
    public float f45314x0 = 1.0f;
    public final h2.f K0 = new h2.f((int[]) null);
    public final gz0 P0 = new gz0(this, 16);
    public final qb1 R0 = new qb1(this, 12);
    public final qb1 S0 = new qb1(this, 13);
    public float f45284e1 = 1.0f;

    public ec1(int i7) {
        this.f45271a = i7;
        this.f45277c = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(org.telegram.messenger.p10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f45302p0 = -1;
        this.f45301o0 = sharedState.getCallState();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.M4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.E2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.G5);
    }

    public static void a(ec1 ec1Var) {
        ec1 ec1Var2;
        if (ec1Var.f45287f1) {
            ec1Var.f45287f1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ec1Var.f45291h1 = ofFloat;
            ec1Var2 = ec1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.h0(ec1Var2, ec1Var.f45284e1, ec1Var.X0, ec1Var.Y0, 1));
            ec1Var2.f45291h1.addListener(new ub1(ec1Var2, 0));
            ec1Var2.f45291h1.setDuration(350L);
            ec1Var2.f45291h1.setInterpolator(org.telegram.ui.Components.xq.f40345f);
            ec1Var2.f45291h1.start();
        } else {
            ec1Var2 = ec1Var;
        }
        ec1Var2.f45289g1 = false;
        ec1Var2.Z0 = false;
    }

    public static void h(int[] iArr, int i7) {
        ec1 ec1Var = l1;
        if (ec1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ec1Var.f45308t0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ec1Var.i(new org.telegram.ui.Components.l10(29));
                } else if (!ec1Var.f45274b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.y1.h(ec1Var.f45274b, new qb1(ec1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ec1Var.f45308t0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ec1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        boolean z9;
        boolean z10;
        int i10;
        boolean z11;
        int size;
        int size2;
        float f10;
        ec1 ec1Var = l1;
        if (ec1Var != null && ec1Var.f45308t0.getParent() == null) {
            ec1 ec1Var2 = l1;
            if (ec1Var2 != null) {
                ec1Var2.f45278c0.d.release();
                l1.f45280d0.d.release();
                l1.f45275b0.release();
                xb1 xb1Var = l1.f45308t0;
                if (xb1Var != null) {
                    xb1Var.d();
                }
                l1.c();
            }
            l1 = null;
        }
        if (l1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.e2.d() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ec1 ec1Var3 = new ec1(i7);
                ec1Var3.f45274b = activity;
                l1 = ec1Var3;
                xb1 xb1Var2 = new xb1(activity, !z9, ec1Var3);
                l1.I0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                l1.getClass();
                xb1Var2.setLockOnScreen(l1.I0);
                ec1Var3.f45308t0 = xb1Var2;
                pb1 pb1Var = new pb1(ec1Var3, 3);
                WeakHashMap weakHashMap = r0.i0.f54097a;
                r0.a0.i(xb1Var2, pb1Var);
                ((WindowManager) activity.getSystemService("window")).addView(xb1Var2, org.telegram.ui.Components.voip.o2.a());
                ec1Var3.f45307s0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ec1Var3.f45310v0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                zb1 zb1Var = new zb1(ec1Var3, activity);
                zb1Var.setClipToPadding(false);
                zb1Var.setClipChildren(false);
                zb1Var.setBackgroundColor(-16777216);
                ec1Var3.x();
                ec1Var3.f45306s = zb1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.i1 i1Var = ec1Var3.f45304r;
                ec1Var3.f45311w = new org.telegram.ui.Components.voip.u2(activity, z10, i1Var);
                org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity, false, true, false, false);
                ec1Var3.f45278c0 = k2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                k2Var.d.setScalingType(scalingType);
                ec1Var3.f45278c0.d.setEnableHardwareScaler(true);
                ec1Var3.f45278c0.d.setRotateTextureWithScreen(true);
                ec1Var3.f45278c0.f39296a0 = 1;
                zb1Var.addView(ec1Var3.f45311w, c8.ha.c(-1.0f, -1));
                TLRPC.User user = ec1Var3.d;
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, user, i1Var);
                ec1Var3.f45313x = r2Var;
                zb1Var.addView(r2Var, c8.ha.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.rc.e(512)) {
                    int i11 = org.telegram.ui.ActionBar.k6.f27785a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f39548a = new org.telegram.ui.Components.cu0(0);
                    }
                }
                ec1Var3.f45315y = view;
                zb1Var.addView((View) view, c8.ha.c(220.0f, -1));
                zb1Var.addView(ec1Var3.f45278c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.k9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Components.n.x(0.5f, 1), new d71(ec1Var3, 1), 0L);
                org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(activity);
                ec1Var3.Y = n1Var;
                n1Var.setDelegate(new pb1(ec1Var3, 2));
                ec1Var3.Y.d(1.0f, 1.0f);
                ec1Var3.f45272a0 = true;
                org.telegram.ui.Components.voip.k2 k2Var2 = new org.telegram.ui.Components.voip.k2(activity, true, false);
                ec1Var3.f45280d0 = k2Var2;
                k2Var2.d.setIsCamera(true);
                ec1Var3.f45280d0.d.setUseCameraRotation(true);
                ec1Var3.Y.setOnTapListener(new rb1(ec1Var3, 1));
                ec1Var3.f45280d0.d.setMirror(true);
                ec1Var3.Y.addView(ec1Var3.f45280d0);
                org.telegram.ui.Components.voip.n1 n1Var2 = new org.telegram.ui.Components.voip.n1(activity);
                ec1Var3.Z = n1Var2;
                n1Var2.S = true;
                n1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ec1Var3.f45275b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ec1Var3.f45275b0.setIsCamera(false);
                ec1Var3.f45275b0.setFpsReduction(30.0f);
                ec1Var3.f45275b0.setScalingType(scalingType);
                ec1Var3.Z.addView(ec1Var3.f45275b0, c8.ha.e(-1, -2, 17));
                ec1Var3.Z.setOnTapListener(new rb1(ec1Var3, 2));
                ec1Var3.Z.setVisibility(8);
                zb1Var.addView(ec1Var3.Y, c8.ha.c(-2.0f, -2));
                zb1Var.addView(ec1Var3.Z);
                View view2 = new View(activity);
                ec1Var3.f45288g0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                zb1Var.addView(ec1Var3.f45288g0, c8.ha.e(-1, 160, 80));
                View view3 = new View(activity);
                ec1Var3.f45290h0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                zb1Var.addView(ec1Var3.f45290h0, c8.ha.e(-1, 160, 48));
                c61 c61Var = new c61(22, activity, ec1Var3);
                ec1Var3.N = c61Var;
                c61Var.setOrientation(0);
                ec1Var3.N.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
                ec1Var3.N.setClipToPadding(false);
                ec1Var3.N.setContentDescription(org.telegram.messenger.hd.M0(2131743303, null));
                ec1Var3.N.setOnClickListener(new rb1(ec1Var3, 3));
                ec1Var3.P = new ei.k(activity, i1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ec1Var3.O = frameLayout;
                frameLayout.addView(ec1Var3.P, c8.ha.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ec1Var3.O.setVisibility(8);
                ec1Var3.O.setOnClickListener(new rb1(ec1Var3, 4));
                fi.a5 a5Var = new fi.a5(activity, i1Var);
                ec1Var3.R = a5Var;
                a5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ec1Var3.S = textView;
                textView.setText(org.telegram.messenger.hd.M0(2131743492, null));
                ec1Var3.S.setTextSize(1, 15.0f);
                ec1Var3.S.setTypeface(org.telegram.messenger.g0.o());
                ec1Var3.S.setTextColor(-1);
                ec1Var3.S.setGravity(17);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(8, activity, ec1Var3);
                ec1Var3.T = m2Var;
                m2Var.setTextSize(1, 15.0f);
                ec1Var3.T.setTextColor(-1);
                ec1Var3.T.setGravity(17);
                ec1Var3.T.setText(org.telegram.messenger.hd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.t10.j(user, true), ec1Var3.T.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
                ec1Var3.R.setVisibility(8);
                ec1Var3.R.addView(ec1Var3.S);
                ec1Var3.R.addView(ec1Var3.T, c8.ha.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ec1Var3.R.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
                    org.telegram.ui.Components.l9[] l9VarArr = ec1Var3.V;
                    l9VarArr[i14] = l9Var;
                    l9VarArr[i14].getImageReceiver().R0 = true;
                    c61 c61Var2 = ec1Var3.N;
                    org.telegram.ui.Components.l9 l9Var2 = l9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    c61Var2.addView(l9Var2, c8.ha.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ac1 ac1Var = new ac1(ec1Var3, activity);
                ec1Var3.X = ac1Var;
                ac1Var.setOrientation(1);
                ec1Var3.X.setFocusable(true);
                ec1Var3.X.setFocusableInTouchMode(true);
                ec1Var3.D = new org.telegram.ui.Components.voip.p0(activity);
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                w8Var.r(user);
                org.telegram.ui.Components.voip.p0 p0Var = ec1Var3.D;
                int i15 = ec1Var3.f45271a;
                p0Var.f39421b.j(org.telegram.messenger.hc.m(i15, 0, user), null, w8Var, user);
                ec1Var3.D.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ec1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                ec1Var3.E.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g5.m(0, user.first_name, user.last_name), ec1Var3.E.getPaint().getFontMetricsInt(), false, null, 0));
                ec1Var3.E.setMaxLines(2);
                ec1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                ec1Var3.E.setTextColor(-1);
                ec1Var3.E.setGravity(1);
                ec1Var3.E.setImportantForAccessibility(2);
                ec1Var3.X.addView(ec1Var3.E, c8.ha.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f39209a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f39209a[i16] = new TextView(activity);
                    frameLayout2.f39209a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f39209a[i16].setTextColor(-1);
                    frameLayout2.f39209a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f39209a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f39211c = frameLayout3;
                org.telegram.ui.Components.voip.x0 x0Var = new org.telegram.ui.Components.voip.x0(frameLayout2, activity, i1Var);
                x0Var.setTextSize(1, 15.0f);
                x0Var.setTextColor(-1);
                x0Var.setGravity(1);
                x0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
                x0Var.setText(org.telegram.messenger.hd.M0(2131743218, null));
                frameLayout3.addView(x0Var, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, c8.ha.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f39210b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, c8.ha.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131743254, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new kg.o1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(activity);
                frameLayout2.d = l2Var;
                frameLayout2.addView(l2Var, c8.ha.c(-2.0f, -1));
                ec1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f54097a;
                frameLayout2.setImportantForAccessibility(4);
                ec1Var3.X.addView(ec1Var3.F, c8.ha.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    dc1 dc1Var = new dc1(activity);
                    ec1Var3.G = dc1Var;
                    long j3 = sharedState.getUser().f27102id;
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
                        org.telegram.ui.Components.y8 y8Var = dc1Var.f45049b;
                        y8Var.i(min);
                        int i19 = 0;
                        while (i19 < min) {
                            y8Var.j(i19, i15, org.telegram.messenger.qp.s1(i15).e2(org.telegram.messenger.m5.o(groupParticipants.get(i19).peer)));
                            i19++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        y8Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.m5.o(groupParticipants.get(0).peer) == j10))) {
                            dc1Var.setVisibility(8);
                        } else {
                            dc1Var.f45050c = new org.telegram.ui.Components.my0(org.telegram.messenger.hd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                            dc1Var.setVisibility(0);
                            dc1Var.invalidate();
                        }
                    }
                    ec1Var3.X.addView(ec1Var3.G, c8.ha.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ec1Var3.X.setClipChildren(false);
                ec1Var3.X.setClipToPadding(false);
                ec1Var3.X.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
                ec1Var3.U = new org.telegram.ui.Components.voip.q(activity);
                ec1Var3.Q = new bi.m5(activity, i1Var);
                ec1Var3.U.setAlpha(0.0f);
                ec1Var3.Q.setVisibility(8);
                zb1Var.addView(ec1Var3.D, c8.ha.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.X, c8.ha.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.O, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.R, c8.ha.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.N, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.U, c8.ha.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var.addView(ec1Var3.Q, c8.ha.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ec1Var3.f45292i0 = new org.telegram.ui.Components.voip.j1(activity);
                ec1Var3.f45282e = new org.telegram.ui.Components.voip.b3(activity, i1Var);
                ec1Var3.f45285f = new org.telegram.ui.Components.voip.b3(activity, i1Var);
                ec1Var3.h = new org.telegram.ui.Components.voip.b3(activity, i1Var);
                ec1Var3.f45299n = new org.telegram.ui.Components.voip.n2(activity, 52.0f);
                ec1Var3.f45282e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f45282e.setScaleX(0.0f);
                ec1Var3.f45282e.setScaleY(0.0f);
                ec1Var3.f45282e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f45285f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f45285f.setScaleX(0.0f);
                ec1Var3.f45285f.setScaleY(0.0f);
                ec1Var3.f45285f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.h.setScaleX(0.0f);
                ec1Var3.h.setScaleY(0.0f);
                ec1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f45299n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                ec1Var3.f45299n.setScaleX(0.0f);
                ec1Var3.f45299n.setScaleY(0.0f);
                ec1Var3.f45299n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ec1Var3.f45292i0.addView(ec1Var3.f45282e);
                ec1Var3.f45292i0.addView(ec1Var3.f45285f);
                ec1Var3.f45292i0.addView(ec1Var3.h);
                ec1Var3.f45292i0.addView(ec1Var3.f45299n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ec1Var3.f45283e0 = eVar;
                eVar.setListener(new cc1(ec1Var3));
                ec1Var3.f45283e0.setScaleX(1.15f);
                ec1Var3.f45283e0.setScaleY(1.15f);
                zb1Var.addView(ec1Var3.f45292i0, c8.ha.e(-1, -2, 80));
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                zb1Var.addView(ec1Var3.f45283e0, c8.ha.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                ec1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.I.setImageResource(2131232045);
                ec1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                zb1Var.addView(ec1Var3.I, c8.ha.e(56, 56, 53));
                c8.ka.a(ec1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                ec1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.H.setImageResource(2131232080);
                ec1Var3.H.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                ec1Var3.H.setContentDescription(org.telegram.messenger.hd.M0(2131753756, null));
                zb1Var.addView(ec1Var3.H, c8.ha.e(56, 56, 51));
                c8.ka.a(ec1Var3.H);
                kg.k kVar = new kg.k(activity, 6);
                ec1Var3.K = kVar;
                kVar.setContentDescription(org.telegram.messenger.hd.M0(2131743240, null));
                ec1Var3.K.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                ec1Var3.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                zb1Var.addView(ec1Var3.K, c8.ha.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ec1Var3.K.setAlpha(0.0f);
                ec1Var3.K.setOnClickListener(new rb1(ec1Var3, 5));
                ec1Var3.H.setOnClickListener(new rb1(ec1Var3, 6));
                ec1Var3.I.setOnClickListener(new fk0(15, ec1Var3, activity));
                if (ec1Var3.f45308t0.f39405b) {
                    ec1Var3.H.setVisibility(8);
                    ec1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f39055a = new HashMap();
                linearLayout.f39056b = new ArrayList();
                linearLayout.f39057c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f39061r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f39060n = i1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                ec1Var3.L0 = linearLayout;
                linearLayout.setGravity(80);
                ec1Var3.L0.setOnViewsUpdated(new qb1(ec1Var3, 5));
                zb1Var.addView(ec1Var3.L0, c8.ha.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(activity, 3, i1Var, true);
                zoVar.r(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                zoVar.K = alignment;
                zoVar.d = -1L;
                zoVar.f12436q0 = new qb1(ec1Var3, 6);
                zoVar.T = true;
                zoVar.h = org.telegram.messenger.g0.L(320.0f);
                zoVar.f12422e = true;
                zoVar.n(10.0f, 6.0f, 10.0f, 6.0f);
                zoVar.s(8.0f);
                ec1Var3.M0 = zoVar;
                zoVar.u(org.telegram.messenger.hd.M0(2131744255, null));
                zb1Var.addView(ec1Var3.M0, c8.ha.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(activity, 1, i1Var, false);
                zoVar2.r(true);
                zoVar2.K = alignment;
                zoVar2.d = 4000L;
                zoVar2.T = true;
                zoVar2.h = org.telegram.messenger.g0.L(320.0f);
                zoVar2.f12422e = true;
                zoVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
                zoVar2.s(8.0f);
                ec1Var3.N0 = zoVar2;
                zoVar2.u(org.telegram.messenger.hd.M0(2131743303, null));
                zb1Var.addView(ec1Var3.N0, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ec1Var3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ec1Var3.T0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ec1Var3.T0 = z11;
                    }
                    ec1Var3.f();
                }
                xb1Var2.addView(zb1Var);
                if (z9) {
                    ec1Var3.E0 = 0.0f;
                    ec1Var3.H0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ec1Var3.f45278c0.setStub(org.telegram.ui.Components.voip.e2.d().f39143s);
                        ec1Var3.f45280d0.setStub(org.telegram.ui.Components.voip.e2.d().f39142r);
                    }
                    ec1Var3.f45308t0.setAlpha(0.0f);
                    ec1Var3.y();
                    ec1Var3.D0 = true;
                    org.telegram.ui.Components.voip.e2.S = true;
                    if (org.telegram.ui.Components.voip.e2.U == null) {
                        ec1Var3.K0.d();
                        org.telegram.messenger.g0.i3(new qb1(ec1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.e2.T.getClass();
                        throw null;
                    }
                } else {
                    ec1Var3.E0 = 1.0f;
                    ec1Var3.x();
                }
                org.telegram.ui.Components.voip.f2.d();
            }
        }
    }

    public final ValueAnimator b(boolean z9) {
        char c10;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z10;
        final float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z11;
        float f19;
        this.Y.animate().cancel();
        float f20 = org.telegram.ui.Components.voip.e2.d().d.x + org.telegram.ui.Components.voip.e2.d().E;
        float f21 = org.telegram.ui.Components.voip.e2.d().d.y + org.telegram.ui.Components.voip.e2.d().F;
        final float x10 = this.Y.getX();
        final float y10 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.e2.T.getClass();
        final float measuredWidth2 = f20 - ((this.f45278c0.getMeasuredWidth() - (this.f45278c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f21 - ((this.f45278c0.getMeasuredHeight() - (this.f45278c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f22 = 1.0f;
        if (this.f45298l0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.m0 && measuredWidth3 != 0) {
                f19 = (this.f45308t0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.e2.d().f39140f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.e2.d().f39140f * 0.25f) + (f20 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f18 = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.e2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.e2.d().h * 0.25f) + (f21 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f18 = 1.0f;
                z11 = false;
                f19 = 0.0f;
            }
            measuredHeight = f18;
            z10 = z11;
            f11 = f19;
        } else {
            c10 = 0;
            f10 = 4.0f;
            measuredWidth = f20 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f21 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z10 = true;
        }
        final float f23 = measuredWidth;
        if (this.f45298l0) {
            f12 = org.telegram.messenger.g0.L(f10);
        } else {
            f12 = 0.0f;
        }
        final float L = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.f45298l0) {
            org.telegram.ui.Components.voip.e2.T.getClass();
            f13 = 1.0f;
            f22 = 0.0f;
        } else {
            f13 = 1.0f;
        }
        float f24 = f13;
        if (z9) {
            if (z10) {
                this.Y.setScaleX(f11);
                this.Y.setScaleY(f11);
                this.Y.setTranslationX(f23);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(L);
                this.Y.setAlpha(f22);
            }
            this.f45278c0.setScaleX(0.25f);
            this.f45278c0.setScaleY(0.25f);
            this.f45278c0.setTranslationX(measuredWidth2);
            this.f45278c0.setTranslationY(measuredHeight2);
            f14 = 0.25f;
            this.f45278c0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f24) / 0.25f);
        } else {
            f14 = 0.25f;
        }
        if (z9) {
            f15 = f24;
        } else {
            f15 = 0.0f;
        }
        if (z9) {
            f16 = 0.0f;
        } else {
            f16 = f24;
        }
        float[] fArr = new float[2];
        fArr[c10] = f15;
        fArr[1] = f16;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z9) {
            f17 = 0.0f;
        } else {
            f17 = f24;
        }
        this.E0 = f17;
        x();
        final float f25 = f14;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f26 = 1.0f - floatValue;
                ec1 ec1Var = ec1.this;
                ec1Var.E0 = f26;
                ec1Var.x();
                if (z10) {
                    float f27 = (f11 * floatValue) + (scaleX * f26);
                    ec1Var.Y.setScaleX(f27);
                    ec1Var.Y.setScaleY(f27);
                    ec1Var.Y.setTranslationX((f23 * floatValue) + (x10 * f26));
                    ec1Var.Y.setTranslationY((measuredHeight * floatValue) + (y10 * f26));
                    ec1Var.Y.setCornerRadius((L * floatValue) + (f12 * f26));
                    ec1Var.Y.setAlpha((f22 * floatValue) + (1.0f * f26));
                }
                float f28 = (f25 * floatValue) + (1.0f * f26);
                ec1Var.f45278c0.setScaleX(f28);
                ec1Var.f45278c0.setScaleY(f28);
                float f29 = 0.0f * f26;
                float f30 = (measuredWidth2 * floatValue) + f29;
                float f31 = (measuredHeight2 * floatValue) + f29;
                ec1Var.f45278c0.setTranslationX(f30);
                ec1Var.f45278c0.setTranslationY(f31);
                ec1Var.f45278c0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f28);
                if (!ec1Var.Y.P) {
                    ec1Var.f45280d0.d(false, floatValue);
                }
                ec1Var.f45308t0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.f(this.f45271a).n(this, org.telegram.messenger.qs.M4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.E2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.G5);
        wg.f1 f1Var = this.M;
        if (f1Var != null) {
            f1Var.dismiss();
            this.M = null;
        }
    }

    public final void d(boolean z9) {
        ValueAnimator ofFloat;
        if (this.A0 && this.B0 != z9 && this.f45312w0) {
            this.B0 = z9;
            org.telegram.ui.Components.voip.r2 r2Var = this.f45313x;
            if (r2Var.K && z9 != r2Var.E) {
                r2Var.E = z9;
                float[] fArr = {1.0f, 0.0f};
                if (z9) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                r2Var.f39472c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.q2(r2Var, 1));
                r2Var.f39472c.setInterpolator(org.telegram.ui.Components.xq.f40345f);
                r2Var.f39472c.setDuration(200L);
                r2Var.f39472c.start();
            }
            if (z9) {
                int i7 = org.telegram.messenger.iz.f23380f1;
                if (i7 < 2) {
                    org.telegram.messenger.iz.f23380f1 = i7 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f23380f1);
                    edit.apply();
                }
                this.N0.f(true);
                org.telegram.messenger.g0.r(this.R0);
                this.Q0 = false;
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.f40346g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40345f;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ub1(this, 3)).setInterpolator(xqVar).start();
            } else {
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40345f;
                duration.setInterpolator(xqVar2).setListener(new org.telegram.ui.Components.t9(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(xqVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new ub1(this, 4)).setDuration(250L).setInterpolator(xqVar2).start();
            }
            this.f45302p0 = this.f45301o0;
            y();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.M4) {
            if (this.f45301o0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f45280d0.d.release();
                this.f45278c0.d.release();
                this.f45275b0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i7 == org.telegram.messenger.qs.f25009i4) {
            v(true);
        } else if (i7 == org.telegram.messenger.qs.E2) {
            this.f45308t0.b();
        } else if (i7 == org.telegram.messenger.qs.O4) {
            this.D.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i7 == org.telegram.messenger.qs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f45286f0 = booleanValue;
            if (booleanValue) {
                this.D.b(true, true);
            }
        }
    }

    public final void e() {
        this.f45308t0.b();
    }

    public final void f() {
        this.f45280d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new vb1(this));
        this.f45278c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new wb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f45275b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.F0 && !this.D0) {
            yb1 yb1Var = this.f45300n0;
            if (yb1Var != null) {
                yb1Var.a(false, false);
            } else if (this.f45298l0 && this.m0 && this.G0) {
                this.G0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f45272a0 = false;
                this.f45302p0 = this.f45301o0;
                y();
            } else if (this.B0) {
                d(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.C0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (!this.F0 && l1 != null) {
                        this.F0 = true;
                        if (VoIPService.getSharedInstance() != null) {
                            int measuredHeight = l1.f45308t0.getMeasuredHeight();
                            ec1 ec1Var = l1;
                            org.telegram.ui.Components.voip.e2.f(ec1Var.f45274b, ec1Var.f45271a, ec1Var.f45308t0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = l1.f45303q0;
                            if (windowInsets != null) {
                                org.telegram.ui.Components.voip.e2.V = windowInsets.getSystemWindowInsetTop();
                                l1.f45303q0.getSystemWindowInsetBottom();
                            }
                        }
                        if (org.telegram.ui.Components.voip.e2.d() != null) {
                            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40345f;
                            duration.setInterpolator(xqVar).start();
                            this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                            this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                            this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                            this.f45292i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                            this.f45288g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                            this.f45290h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                            this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                            this.L0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                            org.telegram.ui.Components.voip.e2.S = true;
                            this.D0 = true;
                            ValueAnimator b10 = b(false);
                            this.K0.d();
                            b10.addListener(new ub1(this, 1));
                            b10.setDuration(350L);
                            b10.setInterpolator(xqVar);
                            b10.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f45308t0.b();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f45285f.getVisibility() == 0) {
            this.f45283e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f45283e0;
            ValueAnimator valueAnimator = eVar.f39120b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f39120b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f45299n.animate().cancel();
        this.f45282e.animate().cancel();
        this.h.animate().cancel();
        this.f45285f.animate().cancel();
        this.f45283e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f45283e0;
        ValueAnimator valueAnimator2 = eVar2.f39120b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f39120b0 = null;
            eVar2.U.stop();
        }
        this.f45299n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.M0(2131743412, null), false, false);
        this.f45282e.d(5, false, false);
        this.h.d(1, false, false);
        this.f45285f.d(3, true, false);
        this.f45299n.setVisibility(0);
        this.f45282e.setVisibility(0);
        this.h.setVisibility(0);
        this.f45285f.setVisibility(0);
        this.f45299n.setAlpha(0.0f);
        this.f45282e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f45285f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45283e0.getLayoutParams();
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
                ec1Var.f45283e0.setTranslationY(L2 * floatValue);
                int i7 = marginEnd;
                int i10 = (int) (i7 - ((i7 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                ec1Var.f45283e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f45283e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f45283e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f45283e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f45283e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.v50(17, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.i3(new qb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService) {
        if (!this.m0) {
            b3Var.d(2, false, false);
            b3Var.setOnBtnClickedListener(null);
            b3Var.setEnabled(false);
            return;
        }
        b3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            b3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            b3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        b3Var.setOnBtnClickedListener(new a7(this, voIPService, b3Var, 23));
    }

    public final void k(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService, boolean z9) {
        b3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.n1 n1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z9) {
            ValueAnimator valueAnimator = n1Var.f39370f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            n1Var.K = f10;
            n1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = n1Var.f39370f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = n1Var.K;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            n1Var.f39370f0 = ofFloat;
            ofFloat.addUpdateListener(n1Var.f39371g0);
            n1Var.f39370f0.setDuration(150L);
            n1Var.f39370f0.start();
        }
        b3Var.setOnBtnClickedListener(new pb1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            b3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            b3Var.d(5, true, false);
        } else {
            b3Var.d(5, false, false);
            i7 = 1;
            b3Var.setEnabled(true);
            b3Var.setOnBtnClickedListener(new bg.f0(this, i7, b3Var, voIPService, 9));
        }
        i7 = i10;
        b3Var.setEnabled(true);
        b3Var.setOnBtnClickedListener(new bg.f0(this, i7, b3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService, boolean z9) {
        boolean z10;
        if (!this.m0 && !this.f45298l0) {
            z10 = voIPService.isVideoAvailable();
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.m0) {
                if (voIPService.isScreencast()) {
                    b3Var.d(3, false, z9);
                } else {
                    b3Var.d(3, false, z9);
                }
            } else {
                b3Var.d(3, true, z9);
            }
            b3Var.setOnBtnClickedListener(new pb1(this, 5));
            b3Var.setEnabled(true);
            return;
        }
        b3Var.d(3, true, false);
        b3Var.setOnClickListener(null);
        b3Var.setEnabled(false);
    }

    public final void o(boolean z9, boolean z10) {
        boolean z11;
        int i7 = 0;
        if (!this.m0 && !this.f45298l0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Integer num = null;
        if (z9) {
            if (z11 && this.D.getTag() == null) {
                this.D.animate().setListener(null).cancel();
                this.D.setVisibility(0);
                if (!this.B0) {
                    if (z10) {
                        this.D.setAlpha(0.0f);
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
                    } else {
                        this.D.setAlpha(0.0f);
                        this.D.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
                    }
                } else if (z10) {
                    this.D.setAlpha(0.0f);
                    this.D.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.D.setScaleX(0.1f);
                    this.D.setScaleY(0.1f);
                }
            } else if (!z11 && this.D.getTag() != null) {
                this.D.animate().setListener(null).cancel();
                this.D.setTranslationY(0.0f);
                this.D.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.xq.f40345f).setListener(new ub1(this, 8)).start();
            }
        } else {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.setAlpha(1.0f);
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            org.telegram.ui.Components.voip.p0 p0Var = this.D;
            if (!z11) {
                i7 = 8;
            }
            p0Var.setVisibility(i7);
        }
        org.telegram.ui.Components.voip.p0 p0Var2 = this.D;
        if (z11) {
            num = 1;
        }
        p0Var2.setTag(num);
    }

    @Override
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        this.f45302p0 = this.f45301o0;
        y();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        this.f45302p0 = this.f45301o0;
        if (i10 == 2 && !this.T0) {
            this.T0 = true;
        }
        org.telegram.ui.Components.voip.f2.d();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.u2 u2Var;
        if (i7 > 0) {
            this.f45293i1 = true;
        }
        if (this.F != null && (u2Var = this.f45311w) != null) {
            int i10 = u2Var.V;
            if ((i10 == 2 || i10 == 3) && this.f45293i1) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.r2(this, i7, 27), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        int i10 = this.f45301o0;
        if (i10 != i7) {
            this.f45302p0 = i10;
            this.f45301o0 = i7;
            if (this.f45308t0 != null) {
                y();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        this.f45302p0 = this.f45301o0;
        if (z9 && !this.T0) {
            this.T0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.f45274b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(0, this.f45274b, null);
        boolean[] zArr = new boolean[3];
        u1Var.R = org.telegram.messenger.hd.M0(2131743409, null);
        u1Var.T = charSequence;
        u1Var.f28573l0 = org.telegram.messenger.hd.M0(2131747830, null);
        u1Var.m0 = null;
        u1Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) u1Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, u1Var.f28570i1);
            }
        }
        u1Var.setCanceledOnTouchOutside(true);
        u1Var.setOnDismissListener(new q5(this, 18));
    }

    public final void q(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f45312w0);
        }
        if (!z9 && (animatorSet = this.f45317z0) != null) {
            animatorSet.removeAllListeners();
            this.f45317z0.cancel();
        }
        boolean z12 = true;
        if (i7 == 0) {
            if (z9) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f45317z0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f45317z0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.n1 n1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(n1Var, View.ALPHA, n1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.n1 n1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n1Var2, View.SCALE_X, n1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.n1 n1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(n1Var3, View.SCALE_Y, n1Var3.getScaleX(), 0.7f));
                    }
                    this.f45317z0 = animatorSet3;
                    animatorSet3.addListener(new ub1(this, 7));
                    this.f45317z0.setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f40345f);
                    this.f45317z0.setStartDelay(50L);
                    this.f45317z0.start();
                }
            } else {
                this.Y.setVisibility(8);
            }
        } else {
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                z10 = z9;
            } else {
                z10 = false;
            }
            if (z9) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                    if (this.Y.getVisibility() == 8) {
                        this.Y.setAlpha(0.0f);
                        this.Y.setScaleX(0.7f);
                        this.Y.setScaleY(0.7f);
                        this.Y.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.f45317z0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f45317z0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.7f, 1.0f));
                    this.f45317z0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.Y.setVisibility(0);
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.n1 n1Var4 = this.Y;
                if (n1Var4.D < 0.0f) {
                    n1Var4.d(1.0f, 1.0f);
                    this.f45272a0 = true;
                }
            }
            org.telegram.ui.Components.voip.n1 n1Var5 = this.Y;
            if (i7 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            n1Var5.c(z11, z10);
            if (i7 == 2) {
                z12 = false;
            }
            this.f45272a0 = z12;
        }
        this.Y.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z9) {
        int i7;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gz0 gz0Var = this.P0;
        int i10 = 0;
        if (!z9 && this.f45312w0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40345f;
            duration.setInterpolator(xqVar).start();
            this.H.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.N.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar).start();
            this.f45292i0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.f45288g0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f45290h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45314x0, 0.0f);
            this.O0 = ofFloat;
            ofFloat.addUpdateListener(gz0Var);
            this.O0.setDuration(150L).setInterpolator(xqVar);
            this.O0.start();
            org.telegram.messenger.g0.r(this.R0);
            this.Q0 = false;
            this.f45292i0.setEnabled(false);
            this.N0.f(true);
            i7 = 150;
        } else {
            if (z9 && !this.f45312w0) {
                this.M0.f(true);
                this.N0.f(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40345f;
                translationY.setInterpolator(xqVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(xqVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f45292i0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f45288g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f45290h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f45314x0, 1.0f);
                this.O0 = ofFloat2;
                ofFloat2.addUpdateListener(gz0Var);
                this.O0.setDuration(150L).setInterpolator(xqVar2);
                this.O0.start();
                this.f45292i0.setEnabled(true);
            }
            i7 = 0;
        }
        this.f45312w0 = z9;
        xb1 xb1Var = this.f45308t0;
        if (!z9) {
            xb1Var.setSystemUiVisibility(xb1Var.getSystemUiVisibility() | 4);
        } else {
            xb1Var.setSystemUiVisibility(xb1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.L0.animate();
        int i11 = -org.telegram.messenger.g0.L(16.0f);
        if (this.f45312w0) {
            i10 = org.telegram.messenger.g0.L(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.xq.f40345f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            qb1 qb1Var = this.R0;
            org.telegram.messenger.g0.r(qb1Var);
            this.Q0 = false;
            if (this.f45316y0 && this.f45312w0) {
                org.telegram.messenger.g0.i3(qb1Var, 3000L);
                this.Q0 = true;
            }
        }
    }

    public final void t() {
        String M0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f45310v0.isTouchExplorationEnabled()) {
                if (!this.m0) {
                    M0 = org.telegram.messenger.hd.M0(2131754732, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131754733, null);
                }
                this.f45306s.announceForAccessibility(M0);
            }
            if (!this.m0) {
                if (this.f45300n0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f45308t0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f45285f.getLocationOnScreen(iArr);
                    yb1 yb1Var = new yb1(this, this.f45306s.getContext(), iArr[0], iArr[1]);
                    this.f45300n0 = yb1Var;
                    WindowInsets windowInsets = this.f45303q0;
                    if (windowInsets != null) {
                        yb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f45306s.addView(this.f45300n0);
                    return;
                }
                return;
            }
            this.f45280d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f45302p0 = this.f45301o0;
            y();
        }
    }

    public final void u(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z9) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40345f;
                transitionSet.addTransition(duration.setInterpolator(xqVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(xqVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.n2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.b3.class, true);
                TransitionManager.beginDelayedTransition(this.f45292i0, transitionSet);
            }
            int i7 = this.f45301o0;
            if (i7 == 11) {
                this.f45282e.setVisibility(8);
                this.f45285f.setVisibility(8);
                this.h.setVisibility(8);
                this.f45299n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i7 != 15 && i7 != 17) {
                if (l1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.m0 || this.f45298l0)) {
                    j(this.f45282e, sharedInstance);
                    if (this.f45312w0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    l(this.f45282e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                m(this.f45285f, sharedInstance, false);
                k(this.h, sharedInstance, z9);
                this.f45299n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.M0(2131743412, null), false, z9);
                this.f45299n.setOnClickListener(new rb1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i7 == 15) {
                    if (!sharedInstance.isScreencast() && (this.m0 || this.f45298l0)) {
                        j(this.f45282e, sharedInstance);
                        if (this.f45312w0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        l(this.f45282e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    m(this.f45285f, sharedInstance, false);
                    k(this.h, sharedInstance, z9);
                } else {
                    this.f45282e.setVisibility(8);
                    this.f45285f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f45299n.setVisibility(8);
            }
            if (this.f45282e.getVisibility() == 0) {
                this.f45282e.f39083f = 0;
                i10 = 16;
            }
            if (this.f45285f.getVisibility() == 0) {
                this.f45285f.f39083f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f39083f = i10;
                i10 += 16;
            }
            if (this.f45299n.getVisibility() == 0) {
                this.f45299n.F = i10;
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
        if (this.J != i7) {
            org.telegram.messenger.g0.R3(this.K, i7);
        } else {
            this.K.setImageResource(i7);
        }
        this.J = i7;
    }

    public final void x() {
        this.f45294j0.setColor(i0.a.o(-16777216, (int) (this.f45314x0 * 102.0f * this.E0)));
        this.f45296k0.setColor(i0.a.o(-16777216, (int) (127.5f * this.E0)));
        zb1 zb1Var = this.f45306s;
        if (zb1Var != null) {
            zb1Var.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec1.y():void");
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
    }
}

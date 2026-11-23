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
public final class fc1 implements VoIPService.StateListener, org.telegram.messenger.fs {
    public static fc1 f47751m1;
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
    public ec1 H;
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
    public wg.d1 N;
    public org.telegram.ui.Components.op N0;
    public b61 O;
    public org.telegram.ui.Components.op O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public gi.j Q;
    public di.n4 R;
    public boolean R0;
    public hi.i5 S;
    public TextView T;
    public org.telegram.ui.ActionBar.n2 U;
    public boolean U0;
    public org.telegram.ui.Components.voip.r V;
    public float V0;
    public float W0;
    public float X0;
    public bc1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.r1 Z;
    public float Z0;
    public final int f47752a;
    public org.telegram.ui.Components.voip.r1 f47753a0;
    public boolean f47754a1;
    public Activity f47755b;
    public boolean f47756b0;
    public float f47757b1;
    public final TLRPC.User f47758c;
    public TextureViewRenderer f47759c0;
    public float f47760c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.o2 f47761d0;
    public int f47762d1;
    public org.telegram.ui.Components.voip.f3 f47763e;
    public org.telegram.ui.Components.voip.o2 f47764e0;
    public int f47765e1;
    public org.telegram.ui.Components.voip.f3 f47766f;
    public org.telegram.ui.Components.voip.e f47767f0;
    public boolean f47769g0;
    public boolean f47770g1;
    public org.telegram.ui.Components.voip.f3 h;
    public View f47771h0;
    public boolean f47772h1;
    public View f47773i0;
    public ValueAnimator f47774i1;
    public org.telegram.ui.Components.voip.n1 f47775j0;
    public boolean f47776j1;
    public org.telegram.ui.Components.voip.o2 f47778k1;
    public boolean l1;
    public boolean m0;
    public cc1 f47780n;
    public boolean f47781n0;
    public zb1 f47782o0;
    public int f47783p0;
    public int f47784q0;
    public WindowInsets f47786r0;
    public ac1 f47787s;
    public boolean f47788s0;
    public float f47789t0;
    public yb1 f47790u0;
    public int f47791v0;
    public org.telegram.ui.Components.voip.y2 f47792w;
    public AccessibilityManager f47793w0;
    public org.telegram.ui.Components.voip.v2 f47794x;
    public org.telegram.ui.Components.voip.z2 f47796y;
    public boolean f47798z0;
    public final org.telegram.ui.Components.voip.m1 f47785r = new org.telegram.ui.Components.voip.m1();
    public final org.telegram.ui.Components.p9[] W = new org.telegram.ui.Components.p9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint f47777k0 = new Paint();
    public final Paint f47779l0 = new Paint();
    public boolean f47795x0 = true;
    public float f47797y0 = 1.0f;
    public final h2.f L0 = new h2.f((int[]) null);
    public final hz0 Q0 = new hz0(this, 16);
    public final rb1 S0 = new rb1(this, 12);
    public final rb1 T0 = new rb1(this, 13);
    public float f47768f1 = 1.0f;

    public fc1(int i7) {
        this.f47752a = i7;
        this.f47758c = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.i10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f47784q0 = -1;
        this.f47783p0 = sharedState.getCallState();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.E2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.J5);
    }

    public static void a(fc1 fc1Var) {
        fc1 fc1Var2;
        if (fc1Var.f47770g1) {
            fc1Var.f47770g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            fc1Var.f47774i1 = ofFloat;
            fc1Var2 = fc1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.i0(fc1Var2, fc1Var.f47768f1, fc1Var.Y0, fc1Var.Z0, 1));
            fc1Var2.f47774i1.addListener(new vb1(fc1Var2, 0));
            fc1Var2.f47774i1.setDuration(350L);
            fc1Var2.f47774i1.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            fc1Var2.f47774i1.start();
        } else {
            fc1Var2 = fc1Var;
        }
        fc1Var2.f47772h1 = false;
        fc1Var2.f47754a1 = false;
    }

    public static void h(int[] iArr, int i7) {
        fc1 fc1Var = f47751m1;
        if (fc1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    fc1Var.f47790u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    fc1Var.i(new cd0(7));
                } else if (!fc1Var.f47755b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.c2.h(fc1Var.f47755b, new rb1(fc1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    fc1Var.f47790u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    fc1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int size;
        int size2;
        float f10;
        fc1 fc1Var = f47751m1;
        if (fc1Var != null && fc1Var.f47790u0.getParent() == null) {
            fc1 fc1Var2 = f47751m1;
            if (fc1Var2 != null) {
                fc1Var2.f47761d0.d.release();
                f47751m1.f47764e0.d.release();
                f47751m1.f47759c0.release();
                yb1 yb1Var = f47751m1.f47790u0;
                if (yb1Var != null) {
                    yb1Var.d();
                }
                f47751m1.c();
            }
            f47751m1 = null;
        }
        if (f47751m1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.i2.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                fc1 fc1Var3 = new fc1(i7);
                fc1Var3.f47755b = activity;
                f47751m1 = fc1Var3;
                yb1 yb1Var2 = new yb1(activity, !z10, fc1Var3);
                f47751m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f47751m1.getClass();
                yb1Var2.setLockOnScreen(f47751m1.J0);
                fc1Var3.f47790u0 = yb1Var2;
                qb1 qb1Var = new qb1(fc1Var3, 3);
                WeakHashMap weakHashMap = r0.i0.f56367a;
                r0.a0.i(yb1Var2, qb1Var);
                ((WindowManager) activity.getSystemService("window")).addView(yb1Var2, org.telegram.ui.Components.voip.s2.a());
                fc1Var3.f47789t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                fc1Var3.f47793w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                ac1 ac1Var = new ac1(fc1Var3, activity);
                ac1Var.setClipToPadding(false);
                ac1Var.setClipChildren(false);
                ac1Var.setBackgroundColor(-16777216);
                fc1Var3.x();
                fc1Var3.f47787s = ac1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.m1 m1Var = fc1Var3.f47785r;
                fc1Var3.f47792w = new org.telegram.ui.Components.voip.y2(activity, z11, m1Var);
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity, false, true, false, false);
                fc1Var3.f47761d0 = o2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                o2Var.d.setScalingType(scalingType);
                fc1Var3.f47761d0.d.setEnableHardwareScaler(true);
                fc1Var3.f47761d0.d.setRotateTextureWithScreen(true);
                fc1Var3.f47761d0.f41109b0 = 1;
                ac1Var.addView(fc1Var3.f47792w, c8.na.c(-1.0f, -1));
                TLRPC.User user = fc1Var3.d;
                org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity, user, m1Var);
                fc1Var3.f47794x = v2Var;
                ac1Var.addView(v2Var, c8.na.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.pc.e(512)) {
                    int i11 = org.telegram.ui.ActionBar.n6.f29386a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f41398a = new org.telegram.ui.Components.nu0(0);
                    }
                }
                fc1Var3.f47796y = view;
                ac1Var.addView((View) view, c8.na.c(220.0f, -1));
                ac1Var.addView(fc1Var3.f47761d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.ActionBar.i5.M(0.5f, 1), new d71(fc1Var3, 1), 0L);
                org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(activity);
                fc1Var3.Z = r1Var;
                r1Var.setDelegate(new qb1(fc1Var3, 2));
                fc1Var3.Z.d(1.0f, 1.0f);
                fc1Var3.f47756b0 = true;
                org.telegram.ui.Components.voip.o2 o2Var2 = new org.telegram.ui.Components.voip.o2(activity, true, false);
                fc1Var3.f47764e0 = o2Var2;
                o2Var2.d.setIsCamera(true);
                fc1Var3.f47764e0.d.setUseCameraRotation(true);
                fc1Var3.Z.setOnTapListener(new sb1(fc1Var3, 1));
                fc1Var3.f47764e0.d.setMirror(true);
                fc1Var3.Z.addView(fc1Var3.f47764e0);
                org.telegram.ui.Components.voip.r1 r1Var2 = new org.telegram.ui.Components.voip.r1(activity);
                fc1Var3.f47753a0 = r1Var2;
                r1Var2.T = true;
                r1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                fc1Var3.f47759c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                fc1Var3.f47759c0.setIsCamera(false);
                fc1Var3.f47759c0.setFpsReduction(30.0f);
                fc1Var3.f47759c0.setScalingType(scalingType);
                fc1Var3.f47753a0.addView(fc1Var3.f47759c0, c8.na.e(-1, -2, 17));
                fc1Var3.f47753a0.setOnTapListener(new sb1(fc1Var3, 2));
                fc1Var3.f47753a0.setVisibility(8);
                ac1Var.addView(fc1Var3.Z, c8.na.c(-2.0f, -2));
                ac1Var.addView(fc1Var3.f47753a0);
                View view2 = new View(activity);
                fc1Var3.f47771h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                ac1Var.addView(fc1Var3.f47771h0, c8.na.e(-1, 160, 80));
                View view3 = new View(activity);
                fc1Var3.f47773i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                ac1Var.addView(fc1Var3.f47773i0, c8.na.e(-1, 160, 48));
                b61 b61Var = new b61(23, activity, fc1Var3);
                fc1Var3.O = b61Var;
                b61Var.setOrientation(0);
                fc1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
                fc1Var3.O.setClipToPadding(false);
                fc1Var3.O.setContentDescription(org.telegram.messenger.gd.N0(2131743052, null));
                fc1Var3.O.setOnClickListener(new sb1(fc1Var3, 3));
                fc1Var3.Q = new gi.j(activity, m1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                fc1Var3.P = frameLayout;
                frameLayout.addView(fc1Var3.Q, c8.na.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                fc1Var3.P.setVisibility(8);
                fc1Var3.P.setOnClickListener(new sb1(fc1Var3, 4));
                hi.i5 i5Var = new hi.i5(activity, m1Var);
                fc1Var3.S = i5Var;
                i5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                fc1Var3.T = textView;
                textView.setText(org.telegram.messenger.gd.N0(2131743241, null));
                fc1Var3.T.setTextSize(1, 15.0f);
                fc1Var3.T.setTypeface(org.telegram.messenger.g0.o());
                fc1Var3.T.setTextColor(-1);
                fc1Var3.T.setGravity(17);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(8, activity, fc1Var3);
                fc1Var3.U = n2Var;
                n2Var.setTextSize(1, 15.0f);
                fc1Var3.U.setTextColor(-1);
                fc1Var3.U.setGravity(17);
                fc1Var3.U.setText(org.telegram.messenger.gd.a0("CallEmojiKeyTooltip", null, 2131752615, TextUtils.ellipsize(org.telegram.messenger.n10.k(user, true), fc1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
                fc1Var3.S.setVisibility(8);
                fc1Var3.S.addView(fc1Var3.T);
                fc1Var3.S.addView(fc1Var3.U, c8.na.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                fc1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                    org.telegram.ui.Components.p9[] p9VarArr = fc1Var3.W;
                    p9VarArr[i14] = p9Var;
                    p9VarArr[i14].getImageReceiver().S0 = true;
                    b61 b61Var2 = fc1Var3.O;
                    org.telegram.ui.Components.p9 p9Var2 = p9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    b61Var2.addView(p9Var2, c8.na.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                bc1 bc1Var = new bc1(fc1Var3, activity);
                fc1Var3.Y = bc1Var;
                bc1Var.setOrientation(1);
                fc1Var3.Y.setFocusable(true);
                fc1Var3.Y.setFocusableInTouchMode(true);
                fc1Var3.E = new org.telegram.ui.Components.voip.q0(activity);
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                a9Var.r(user);
                org.telegram.ui.Components.voip.q0 q0Var = fc1Var3.E;
                int i15 = fc1Var3.f47752a;
                q0Var.f41156b.j(org.telegram.messenger.fc.m(i15, 0, user), null, a9Var, user);
                fc1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                fc1Var3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                fc1Var3.F.setText(org.telegram.messenger.j6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), fc1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
                fc1Var3.F.setMaxLines(2);
                fc1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
                fc1Var3.F.setTextColor(-1);
                fc1Var3.F.setGravity(1);
                fc1Var3.F.setImportantForAccessibility(2);
                fc1Var3.Y.addView(fc1Var3.F, c8.na.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f41039a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f41039a[i16] = new TextView(activity);
                    frameLayout2.f41039a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f41039a[i16].setTextColor(-1);
                    frameLayout2.f41039a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f41039a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f41041c = frameLayout3;
                org.telegram.ui.Components.voip.b1 b1Var = new org.telegram.ui.Components.voip.b1(frameLayout2, activity, m1Var);
                b1Var.setTextSize(1, 15.0f);
                b1Var.setTextColor(-1);
                b1Var.setGravity(1);
                b1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
                b1Var.setText(org.telegram.messenger.gd.N0(2131742967, null));
                frameLayout3.addView(b1Var, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, c8.na.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f41040b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, c8.na.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131743003, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new kg.r1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(activity);
                frameLayout2.d = p2Var;
                frameLayout2.addView(p2Var, c8.na.c(-2.0f, -1));
                fc1Var3.G = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f56367a;
                frameLayout2.setImportantForAccessibility(4);
                fc1Var3.Y.addView(fc1Var3.G, c8.na.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    ec1 ec1Var = new ec1(activity);
                    fc1Var3.H = ec1Var;
                    long j3 = sharedState.getUser().f28641id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i18 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i18 <= 0) {
                        ec1Var.setVisibility(8);
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
                        org.telegram.ui.Components.c9 c9Var = ec1Var.f47504b;
                        c9Var.i(min);
                        int i19 = 0;
                        while (i19 < min) {
                            c9Var.j(i19, i15, org.telegram.messenger.mp.u1(i15).g2(org.telegram.messenger.n5.o(groupParticipants.get(i19).peer)));
                            i19++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        c9Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.n5.o(groupParticipants.get(0).peer) == j10))) {
                            ec1Var.setVisibility(8);
                        } else {
                            ec1Var.f47505c = new org.telegram.ui.Components.wy0(org.telegram.messenger.gd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                            ec1Var.setVisibility(0);
                            ec1Var.invalidate();
                        }
                    }
                    fc1Var3.Y.addView(fc1Var3.H, c8.na.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                fc1Var3.Y.setClipChildren(false);
                fc1Var3.Y.setClipToPadding(false);
                fc1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
                fc1Var3.V = new org.telegram.ui.Components.voip.r(activity);
                fc1Var3.R = new di.n4(activity, m1Var);
                fc1Var3.V.setAlpha(0.0f);
                fc1Var3.R.setVisibility(8);
                ac1Var.addView(fc1Var3.E, c8.na.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.Y, c8.na.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.P, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.S, c8.na.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.O, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.V, c8.na.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                ac1Var.addView(fc1Var3.R, c8.na.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                fc1Var3.f47775j0 = new org.telegram.ui.Components.voip.n1(activity);
                fc1Var3.f47763e = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                fc1Var3.f47766f = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                fc1Var3.h = new org.telegram.ui.Components.voip.f3(activity, m1Var);
                fc1Var3.f47780n = new org.telegram.ui.Components.voip.r2(activity, 52.0f);
                fc1Var3.f47763e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                fc1Var3.f47763e.setScaleX(0.0f);
                fc1Var3.f47763e.setScaleY(0.0f);
                fc1Var3.f47763e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                fc1Var3.f47766f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                fc1Var3.f47766f.setScaleX(0.0f);
                fc1Var3.f47766f.setScaleY(0.0f);
                fc1Var3.f47766f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                fc1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                fc1Var3.h.setScaleX(0.0f);
                fc1Var3.h.setScaleY(0.0f);
                fc1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                fc1Var3.f47780n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                fc1Var3.f47780n.setScaleX(0.0f);
                fc1Var3.f47780n.setScaleY(0.0f);
                fc1Var3.f47780n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                fc1Var3.f47775j0.addView(fc1Var3.f47763e);
                fc1Var3.f47775j0.addView(fc1Var3.f47766f);
                fc1Var3.f47775j0.addView(fc1Var3.h);
                fc1Var3.f47775j0.addView(fc1Var3.f47780n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                fc1Var3.f47767f0 = eVar;
                eVar.setListener(new dc1(fc1Var3));
                fc1Var3.f47767f0.setScaleX(1.15f);
                fc1Var3.f47767f0.setScaleY(1.15f);
                ac1Var.addView(fc1Var3.f47775j0, c8.na.e(-1, -2, 80));
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                ac1Var.addView(fc1Var3.f47767f0, c8.na.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                fc1Var3.J = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
                fc1Var3.J.setImageResource(2131232050);
                fc1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                ac1Var.addView(fc1Var3.J, c8.na.e(56, 56, 53));
                c8.sa.a(fc1Var3.J);
                ImageView imageView2 = new ImageView(activity);
                fc1Var3.I = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
                fc1Var3.I.setImageResource(2131232085);
                fc1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                fc1Var3.I.setContentDescription(org.telegram.messenger.gd.N0(2131753753, null));
                ac1Var.addView(fc1Var3.I, c8.na.e(56, 56, 51));
                c8.sa.a(fc1Var3.I);
                kg.k kVar = new kg.k(activity, 5);
                fc1Var3.L = kVar;
                kVar.setContentDescription(org.telegram.messenger.gd.N0(2131742989, null));
                fc1Var3.L.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
                fc1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                ac1Var.addView(fc1Var3.L, c8.na.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                fc1Var3.L.setAlpha(0.0f);
                fc1Var3.L.setOnClickListener(new sb1(fc1Var3, 5));
                fc1Var3.I.setOnClickListener(new sb1(fc1Var3, 6));
                fc1Var3.J.setOnClickListener(new ig0(17, fc1Var3, activity));
                if (fc1Var3.f47790u0.f41223b) {
                    fc1Var3.I.setVisibility(8);
                    fc1Var3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f40861a = new HashMap();
                linearLayout.f40862b = new ArrayList();
                linearLayout.f40863c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f40867r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f40866n = m1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                fc1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                fc1Var3.M0.setOnViewsUpdated(new rb1(fc1Var3, 5));
                ac1Var.addView(fc1Var3.M0, c8.na.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(activity, 3, m1Var, true);
                opVar.r(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                opVar.L = alignment;
                opVar.d = -1L;
                opVar.f15506r0 = new rb1(fc1Var3, 6);
                opVar.U = true;
                opVar.h = org.telegram.messenger.g0.L(320.0f);
                opVar.f15490e = true;
                opVar.n(10.0f, 6.0f, 10.0f, 6.0f);
                opVar.s(8.0f);
                fc1Var3.N0 = opVar;
                opVar.v(org.telegram.messenger.gd.N0(2131744009, null));
                ac1Var.addView(fc1Var3.N0, c8.na.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.op opVar2 = new org.telegram.ui.Components.op(activity, 1, m1Var, false);
                opVar2.r(true);
                opVar2.L = alignment;
                opVar2.d = 4000L;
                opVar2.U = true;
                opVar2.h = org.telegram.messenger.g0.L(320.0f);
                opVar2.f15490e = true;
                opVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
                opVar2.s(8.0f);
                fc1Var3.O0 = opVar2;
                opVar2.v(org.telegram.messenger.gd.N0(2131743052, null));
                ac1Var.addView(fc1Var3.O0, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                fc1Var3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!fc1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fc1Var3.U0 = z12;
                    }
                    fc1Var3.f();
                }
                yb1Var2.addView(ac1Var);
                if (z10) {
                    fc1Var3.F0 = 0.0f;
                    fc1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        fc1Var3.f47761d0.setStub(org.telegram.ui.Components.voip.i2.d().f40940s);
                        fc1Var3.f47764e0.setStub(org.telegram.ui.Components.voip.i2.d().f40939r);
                    }
                    fc1Var3.f47790u0.setAlpha(0.0f);
                    fc1Var3.y();
                    fc1Var3.E0 = true;
                    org.telegram.ui.Components.voip.i2.T = true;
                    if (org.telegram.ui.Components.voip.i2.V == null) {
                        fc1Var3.L0.d();
                        org.telegram.messenger.g0.h3(new rb1(fc1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.i2.U.getClass();
                        throw null;
                    }
                } else {
                    fc1Var3.F0 = 1.0f;
                    fc1Var3.x();
                }
                org.telegram.ui.Components.voip.j2.d();
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
        final float measuredWidth2 = f20 - ((this.f47761d0.getMeasuredWidth() - (this.f47761d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f21 - ((this.f47761d0.getMeasuredHeight() - (this.f47761d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f22 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (this.f47781n0 && measuredWidth3 != 0) {
                f19 = (this.f47790u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.i2.d().f40937f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().f40937f * 0.25f) + (f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f18 = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.i2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().h * 0.25f) + (f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
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
            this.f47761d0.setScaleX(0.25f);
            this.f47761d0.setScaleY(0.25f);
            this.f47761d0.setTranslationX(measuredWidth2);
            this.f47761d0.setTranslationY(measuredHeight2);
            f14 = 0.25f;
            this.f47761d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f24) / 0.25f);
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
                fc1 fc1Var = fc1.this;
                fc1Var.F0 = f26;
                fc1Var.x();
                if (z11) {
                    float f27 = (f11 * floatValue) + (scaleX * f26);
                    fc1Var.Z.setScaleX(f27);
                    fc1Var.Z.setScaleY(f27);
                    fc1Var.Z.setTranslationX((f23 * floatValue) + (x10 * f26));
                    fc1Var.Z.setTranslationY((measuredHeight * floatValue) + (y10 * f26));
                    fc1Var.Z.setCornerRadius((L * floatValue) + (f12 * f26));
                    fc1Var.Z.setAlpha((f22 * floatValue) + (1.0f * f26));
                }
                float f28 = (f25 * floatValue) + (1.0f * f26);
                fc1Var.f47761d0.setScaleX(f28);
                fc1Var.f47761d0.setScaleY(f28);
                float f29 = 0.0f * f26;
                float f30 = (measuredWidth2 * floatValue) + f29;
                float f31 = (measuredHeight2 * floatValue) + f29;
                fc1Var.f47761d0.setTranslationX(f30);
                fc1Var.f47761d0.setTranslationY(f31);
                fc1Var.f47761d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f28);
                if (!fc1Var.Z.Q) {
                    fc1Var.f47764e0.d(false, floatValue);
                }
                fc1Var.f47790u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.f(this.f47752a).n(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.E2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.J5);
        wg.d1 d1Var = this.N;
        if (d1Var != null) {
            d1Var.dismiss();
            this.N = null;
        }
    }

    public final void d(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f47795x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.v2 v2Var = this.f47794x;
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
                v2Var.f41289c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u2(v2Var, 1));
                v2Var.f41289c.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                v2Var.f41289c.setDuration(200L);
                v2Var.f41289c.start();
            }
            if (z10) {
                int i7 = org.telegram.messenger.bz.f23286f1;
                if (i7 < 2) {
                    org.telegram.messenger.bz.f23286f1 = i7 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.bz.f23286f1);
                    edit.apply();
                }
                this.O0.f(true);
                org.telegram.messenger.g0.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.kr.f36859g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
                org.telegram.messenger.m10.o(translationY, krVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new vb1(this, 3)).setInterpolator(krVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f36858f;
                duration.setInterpolator(krVar2).setListener(new on(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(krVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new vb1(this, 4)).setDuration(250L).setInterpolator(krVar2).start();
            }
            this.f47784q0 = this.f47783p0;
            y();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.P4) {
            if (this.f47783p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f47764e0.d.release();
                this.f47761d0.d.release();
                this.f47759c0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i7 == org.telegram.messenger.ks.f25247l4) {
            v(true);
        } else if (i7 == org.telegram.messenger.ks.E2) {
            this.f47790u0.b();
        } else if (i7 == org.telegram.messenger.ks.R4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i7 == org.telegram.messenger.ks.J5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f47769g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        this.f47790u0.b();
    }

    public final void f() {
        this.f47764e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new wb1(this));
        this.f47761d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f47759c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            zb1 zb1Var = this.f47782o0;
            if (zb1Var != null) {
                zb1Var.a(false, false);
            } else if (this.m0 && this.f47781n0 && this.H0) {
                this.H0 = false;
                this.Z.setRelativePosition(this.f47753a0);
                this.f47756b0 = false;
                this.f47784q0 = this.f47783p0;
                y();
            } else if (this.C0) {
                d(false);
            } else if (this.S.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (!this.G0 && f47751m1 != null) {
                        this.G0 = true;
                        if (VoIPService.getSharedInstance() != null) {
                            int measuredHeight = f47751m1.f47790u0.getMeasuredHeight();
                            fc1 fc1Var = f47751m1;
                            org.telegram.ui.Components.voip.i2.f(fc1Var.f47755b, fc1Var.f47752a, fc1Var.f47790u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = f47751m1.f47786r0;
                            if (windowInsets != null) {
                                org.telegram.ui.Components.voip.i2.W = windowInsets.getSystemWindowInsetTop();
                                f47751m1.f47786r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (org.telegram.ui.Components.voip.i2.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
                            duration.setInterpolator(krVar).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                            this.f47775j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
                            this.f47771h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
                            this.f47773i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
                            this.f47753a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
                            org.telegram.ui.Components.voip.i2.T = true;
                            this.E0 = true;
                            ValueAnimator b10 = b(false);
                            this.L0.d();
                            b10.addListener(new vb1(this, 1));
                            b10.setDuration(350L);
                            b10.setInterpolator(krVar);
                            b10.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f47790u0.b();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f47766f.getVisibility() == 0) {
            this.f47767f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f47767f0;
            ValueAnimator valueAnimator = eVar.f40838c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f40838c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.f47780n.animate().cancel();
        this.f47763e.animate().cancel();
        this.h.animate().cancel();
        this.f47766f.animate().cancel();
        this.f47767f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f47767f0;
        ValueAnimator valueAnimator2 = eVar2.f40838c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f40838c0 = null;
            eVar2.V.stop();
        }
        this.f47780n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.N0(2131743161, null), false, false);
        this.f47763e.d(5, false, false);
        this.h.d(1, false, false);
        this.f47766f.d(3, true, false);
        this.f47780n.setVisibility(0);
        this.f47763e.setVisibility(0);
        this.h.setVisibility(0);
        this.f47766f.setVisibility(0);
        this.f47780n.setAlpha(0.0f);
        this.f47763e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f47766f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f47767f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                fc1 fc1Var = fc1.this;
                fc1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                fc1Var.f47767f0.setTranslationY(L2 * floatValue);
                int i7 = marginEnd;
                int i10 = (int) (i7 - ((i7 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                fc1Var.f47767f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f47767f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f47767f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f47767f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f47767f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.f10(18, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.h3(new rb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService) {
        if (!this.f47781n0) {
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
            ValueAnimator valueAnimator = r1Var.f41182g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            r1Var.L = f10;
            r1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = r1Var.f41182g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = r1Var.L;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            r1Var.f41182g0 = ofFloat;
            ofFloat.addUpdateListener(r1Var.f41183h0);
            r1Var.f41182g0.setDuration(150L);
            r1Var.f41182g0.start();
        }
        f3Var.setOnBtnClickedListener(new qb1(this, 4));
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
            f3Var.setOnBtnClickedListener(new bg.g0(this, i7, f3Var, voIPService, 9));
        }
        i7 = i10;
        f3Var.setEnabled(true);
        f3Var.setOnBtnClickedListener(new bg.g0(this, i7, f3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f47781n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f47781n0) {
                if (voIPService.isScreencast()) {
                    f3Var.d(3, false, z10);
                } else {
                    f3Var.d(3, false, z10);
                }
            } else {
                f3Var.d(3, true, z10);
            }
            f3Var.setOnBtnClickedListener(new qb1(this, 5));
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
        if (!this.f47781n0 && !this.m0) {
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
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
                    } else {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
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
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.kr.f36858f).setListener(new vb1(this, 8)).start();
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
        this.f47784q0 = this.f47783p0;
        y();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        this.f47784q0 = this.f47783p0;
        if (i10 == 2 && !this.U0) {
            this.U0 = true;
        }
        org.telegram.ui.Components.voip.j2.d();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.y2 y2Var;
        if (i7 > 0) {
            this.f47776j1 = true;
        }
        if (this.G != null && (y2Var = this.f47792w) != null) {
            int i10 = y2Var.W;
            if ((i10 == 2 || i10 == 3) && this.f47776j1) {
                org.telegram.messenger.g0.h3(new ao0(this, i7, 5), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        int i10 = this.f47783p0;
        if (i10 != i7) {
            this.f47784q0 = i10;
            this.f47783p0 = i7;
            if (this.f47790u0 != null) {
                y();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f47784q0 = this.f47783p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.f47755b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, this.f47755b, null);
        boolean[] zArr = new boolean[3];
        t1Var.S = org.telegram.messenger.gd.N0(2131743158, null);
        t1Var.U = charSequence;
        t1Var.m0 = org.telegram.messenger.gd.N0(2131747637, null);
        t1Var.f30096n0 = null;
        t1Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) t1Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, t1Var.f30092j1);
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
            this.Z.setUiVisible(this.f47795x0);
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
                    animatorSet3.addListener(new vb1(this, 7));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.kr.f36858f);
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
                    this.f47756b0 = true;
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
            this.f47756b0 = z13;
        }
        this.Z.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z10) {
        int i7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hz0 hz0Var = this.Q0;
        int i10 = 0;
        if (!z10 && this.f47795x0) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            duration.setInterpolator(krVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(krVar).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(krVar).start();
            this.f47775j0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar).start();
            this.f47771h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
            this.f47773i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47797y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(hz0Var);
            this.P0.setDuration(150L).setInterpolator(krVar);
            this.P0.start();
            org.telegram.messenger.g0.r(this.S0);
            this.R0 = false;
            this.f47775j0.setEnabled(false);
            this.O0.f(true);
            i7 = 150;
        } else {
            if (z10 && !this.f47795x0) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f36858f;
                translationY.setInterpolator(krVar2).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(krVar2).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.f47775j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.f47771h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar2).start();
                this.f47773i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f47797y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(hz0Var);
                this.P0.setDuration(150L).setInterpolator(krVar2);
                this.P0.start();
                this.f47775j0.setEnabled(true);
            }
            i7 = 0;
        }
        this.f47795x0 = z10;
        yb1 yb1Var = this.f47790u0;
        if (!z10) {
            yb1Var.setSystemUiVisibility(yb1Var.getSystemUiVisibility() | 4);
        } else {
            yb1Var.setSystemUiVisibility(yb1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i11 = -org.telegram.messenger.g0.L(16.0f);
        if (this.f47795x0) {
            i10 = org.telegram.messenger.g0.L(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.kr.f36858f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            rb1 rb1Var = this.S0;
            org.telegram.messenger.g0.r(rb1Var);
            this.R0 = false;
            if (this.f47798z0 && this.f47795x0) {
                org.telegram.messenger.g0.h3(rb1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        String N0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f47793w0.isTouchExplorationEnabled()) {
                if (!this.f47781n0) {
                    N0 = org.telegram.messenger.gd.N0(2131754731, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131754732, null);
                }
                this.f47787s.announceForAccessibility(N0);
            }
            if (!this.f47781n0) {
                if (this.f47782o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f47790u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f47766f.getLocationOnScreen(iArr);
                    zb1 zb1Var = new zb1(this, this.f47787s.getContext(), iArr[0], iArr[1]);
                    this.f47782o0 = zb1Var;
                    WindowInsets windowInsets = this.f47786r0;
                    if (windowInsets != null) {
                        zb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f47787s.addView(this.f47782o0);
                    return;
                }
                return;
            }
            this.f47764e0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f47784q0 = this.f47783p0;
            y();
        }
    }

    public final void u(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
                transitionSet.addTransition(duration.setInterpolator(krVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(krVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.r2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.f3.class, true);
                TransitionManager.beginDelayedTransition(this.f47775j0, transitionSet);
            }
            int i7 = this.f47783p0;
            if (i7 == 11) {
                this.f47763e.setVisibility(8);
                this.f47766f.setVisibility(8);
                this.h.setVisibility(8);
                this.f47780n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i7 != 15 && i7 != 17) {
                if (f47751m1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f47781n0 || this.m0)) {
                    j(this.f47763e, sharedInstance);
                    if (this.f47795x0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                } else {
                    l(this.f47763e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                }
                m(this.f47766f, sharedInstance, false);
                k(this.h, sharedInstance, z10);
                this.f47780n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.N0(2131743161, null), false, z10);
                this.f47780n.setOnClickListener(new sb1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i7 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f47781n0 || this.m0)) {
                        j(this.f47763e, sharedInstance);
                        if (this.f47795x0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    } else {
                        l(this.f47763e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    }
                    m(this.f47766f, sharedInstance, false);
                    k(this.h, sharedInstance, z10);
                } else {
                    this.f47763e.setVisibility(8);
                    this.f47766f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f47780n.setVisibility(8);
            }
            if (this.f47763e.getVisibility() == 0) {
                this.f47763e.f40892f = 0;
                i10 = 16;
            }
            if (this.f47766f.getVisibility() == 0) {
                this.f47766f.f40892f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f40892f = i10;
                i10 += 16;
            }
            if (this.f47780n.getVisibility() == 0) {
                this.f47780n.G = i10;
            }
            w();
        }
    }

    public final void v(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc1.v(boolean):void");
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
            org.telegram.messenger.g0.P3(this.L, i7);
        } else {
            this.L.setImageResource(i7);
        }
        this.K = i7;
    }

    public final void x() {
        this.f47777k0.setColor(i0.a.o(-16777216, (int) (this.f47797y0 * 102.0f * this.F0)));
        this.f47779l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        ac1 ac1Var = this.f47787s;
        if (ac1Var != null) {
            ac1Var.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc1.y():void");
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

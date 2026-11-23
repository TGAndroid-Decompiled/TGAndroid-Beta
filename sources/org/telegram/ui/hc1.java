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
public final class hc1 implements VoIPService.StateListener, org.telegram.messenger.gs {
    public static hc1 f48294m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.p0 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public org.telegram.ui.Components.voip.k2 G;
    public boolean G0;
    public gc1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public kg.k L;
    public int M;
    public org.telegram.ui.Components.voip.d2 M0;
    public wg.e1 N;
    public org.telegram.ui.Components.rp N0;
    public d61 O;
    public org.telegram.ui.Components.rp O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public gi.j Q;
    public di.n4 R;
    public boolean R0;
    public hi.y4 S;
    public TextView T;
    public org.telegram.ui.ActionBar.n2 U;
    public boolean U0;
    public org.telegram.ui.Components.voip.q V;
    public float V0;
    public float W0;
    public float X0;
    public dc1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.q1 Z;
    public float Z0;
    public final int f48295a;
    public org.telegram.ui.Components.voip.q1 f48296a0;
    public boolean f48297a1;
    public Activity f48298b;
    public boolean f48299b0;
    public float f48300b1;
    public final TLRPC.User f48301c;
    public TextureViewRenderer f48302c0;
    public float f48303c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.n2 f48304d0;
    public int f48305d1;
    public org.telegram.ui.Components.voip.e3 f48306e;
    public org.telegram.ui.Components.voip.n2 f48307e0;
    public int f48308e1;
    public org.telegram.ui.Components.voip.e3 f48309f;
    public org.telegram.ui.Components.voip.e f48310f0;
    public boolean f48312g0;
    public boolean f48313g1;
    public org.telegram.ui.Components.voip.e3 h;
    public View f48314h0;
    public boolean f48315h1;
    public View f48316i0;
    public ValueAnimator f48317i1;
    public org.telegram.ui.Components.voip.m1 f48318j0;
    public boolean f48319j1;
    public org.telegram.ui.Components.voip.n2 f48321k1;
    public boolean l1;
    public boolean m0;
    public ec1 f48323n;
    public boolean f48324n0;
    public bc1 f48325o0;
    public int f48326p0;
    public int f48327q0;
    public WindowInsets f48329r0;
    public cc1 f48330s;
    public boolean f48331s0;
    public float f48332t0;
    public ac1 f48333u0;
    public int f48334v0;
    public org.telegram.ui.Components.voip.x2 f48335w;
    public AccessibilityManager f48336w0;
    public org.telegram.ui.Components.voip.u2 f48337x;
    public org.telegram.ui.Components.voip.y2 f48339y;
    public boolean f48341z0;
    public final org.telegram.ui.Components.voip.l1 f48328r = new org.telegram.ui.Components.voip.l1();
    public final org.telegram.ui.Components.q9[] W = new org.telegram.ui.Components.q9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint f48320k0 = new Paint();
    public final Paint f48322l0 = new Paint();
    public boolean f48338x0 = true;
    public float f48340y0 = 1.0f;
    public final h2.f L0 = new h2.f((int[]) null);
    public final iz0 Q0 = new iz0(this, 16);
    public final tb1 S0 = new tb1(this, 12);
    public final tb1 T0 = new tb1(this, 13);
    public float f48311f1 = 1.0f;

    public hc1(int i7) {
        this.f48295a = i7;
        this.f48301c = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(org.telegram.messenger.k10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f48327q0 = -1;
        this.f48326p0 = sharedState.getCallState();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.R4);
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.P4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.E2);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.J5);
    }

    public static void a(hc1 hc1Var) {
        hc1 hc1Var2;
        if (hc1Var.f48313g1) {
            hc1Var.f48313g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            hc1Var.f48317i1 = ofFloat;
            hc1Var2 = hc1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.h0(hc1Var2, hc1Var.f48311f1, hc1Var.Y0, hc1Var.Z0, 1));
            hc1Var2.f48317i1.addListener(new xb1(hc1Var2, 0));
            hc1Var2.f48317i1.setDuration(350L);
            hc1Var2.f48317i1.setInterpolator(org.telegram.ui.Components.nr.f37917f);
            hc1Var2.f48317i1.start();
        } else {
            hc1Var2 = hc1Var;
        }
        hc1Var2.f48315h1 = false;
        hc1Var2.f48297a1 = false;
    }

    public static void h(int[] iArr, int i7) {
        hc1 hc1Var = f48294m1;
        if (hc1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    hc1Var.f48333u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    hc1Var.i(new cd0(7));
                } else if (!hc1Var.f48298b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.b2.h(hc1Var.f48298b, new tb1(hc1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    hc1Var.f48333u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    hc1Var.t();
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
        hc1 hc1Var = f48294m1;
        if (hc1Var != null && hc1Var.f48333u0.getParent() == null) {
            hc1 hc1Var2 = f48294m1;
            if (hc1Var2 != null) {
                hc1Var2.f48304d0.d.release();
                f48294m1.f48307e0.d.release();
                f48294m1.f48302c0.release();
                ac1 ac1Var = f48294m1.f48333u0;
                if (ac1Var != null) {
                    ac1Var.d();
                }
                f48294m1.c();
            }
            f48294m1 = null;
        }
        if (f48294m1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                hc1 hc1Var3 = new hc1(i7);
                hc1Var3.f48298b = activity;
                f48294m1 = hc1Var3;
                ac1 ac1Var2 = new ac1(activity, !z10, hc1Var3);
                f48294m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f48294m1.getClass();
                ac1Var2.setLockOnScreen(f48294m1.J0);
                hc1Var3.f48333u0 = ac1Var2;
                sb1 sb1Var = new sb1(hc1Var3, 3);
                WeakHashMap weakHashMap = r0.i0.f56254a;
                r0.a0.i(ac1Var2, sb1Var);
                ((WindowManager) activity.getSystemService("window")).addView(ac1Var2, org.telegram.ui.Components.voip.r2.a());
                hc1Var3.f48332t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                hc1Var3.f48336w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                cc1 cc1Var = new cc1(hc1Var3, activity);
                cc1Var.setClipToPadding(false);
                cc1Var.setClipChildren(false);
                cc1Var.setBackgroundColor(-16777216);
                hc1Var3.x();
                hc1Var3.f48330s = cc1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.l1 l1Var = hc1Var3.f48328r;
                hc1Var3.f48335w = new org.telegram.ui.Components.voip.x2(activity, z11, l1Var);
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(activity, false, true, false, false);
                hc1Var3.f48304d0 = n2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                n2Var.d.setScalingType(scalingType);
                hc1Var3.f48304d0.d.setEnableHardwareScaler(true);
                hc1Var3.f48304d0.d.setRotateTextureWithScreen(true);
                hc1Var3.f48304d0.f41175b0 = 1;
                cc1Var.addView(hc1Var3.f48335w, c8.na.c(-1.0f, -1));
                TLRPC.User user = hc1Var3.d;
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity, user, l1Var);
                hc1Var3.f48337x = u2Var;
                cc1Var.addView(u2Var, c8.na.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.qc.e(512)) {
                    int i11 = org.telegram.ui.ActionBar.m6.f29282a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f41464a = new org.telegram.ui.Components.ou0(0);
                    }
                }
                hc1Var3.f48339y = view;
                cc1Var.addView((View) view, c8.na.c(220.0f, -1));
                cc1Var.addView(hc1Var3.f48304d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.p9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Cells.c5.y(0.5f, 1), new f71(hc1Var3, 1), 0L);
                org.telegram.ui.Components.voip.q1 q1Var = new org.telegram.ui.Components.voip.q1(activity);
                hc1Var3.Z = q1Var;
                q1Var.setDelegate(new sb1(hc1Var3, 2));
                hc1Var3.Z.d(1.0f, 1.0f);
                hc1Var3.f48299b0 = true;
                org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(activity, true, false);
                hc1Var3.f48307e0 = n2Var2;
                n2Var2.d.setIsCamera(true);
                hc1Var3.f48307e0.d.setUseCameraRotation(true);
                hc1Var3.Z.setOnTapListener(new ub1(hc1Var3, 1));
                hc1Var3.f48307e0.d.setMirror(true);
                hc1Var3.Z.addView(hc1Var3.f48307e0);
                org.telegram.ui.Components.voip.q1 q1Var2 = new org.telegram.ui.Components.voip.q1(activity);
                hc1Var3.f48296a0 = q1Var2;
                q1Var2.T = true;
                q1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                hc1Var3.f48302c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                hc1Var3.f48302c0.setIsCamera(false);
                hc1Var3.f48302c0.setFpsReduction(30.0f);
                hc1Var3.f48302c0.setScalingType(scalingType);
                hc1Var3.f48296a0.addView(hc1Var3.f48302c0, c8.na.e(-1, -2, 17));
                hc1Var3.f48296a0.setOnTapListener(new ub1(hc1Var3, 2));
                hc1Var3.f48296a0.setVisibility(8);
                cc1Var.addView(hc1Var3.Z, c8.na.c(-2.0f, -2));
                cc1Var.addView(hc1Var3.f48296a0);
                View view2 = new View(activity);
                hc1Var3.f48314h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                cc1Var.addView(hc1Var3.f48314h0, c8.na.e(-1, 160, 80));
                View view3 = new View(activity);
                hc1Var3.f48316i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                cc1Var.addView(hc1Var3.f48316i0, c8.na.e(-1, 160, 48));
                d61 d61Var = new d61(23, activity, hc1Var3);
                hc1Var3.O = d61Var;
                d61Var.setOrientation(0);
                hc1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
                hc1Var3.O.setClipToPadding(false);
                hc1Var3.O.setContentDescription(org.telegram.messenger.hd.N0(2131743059, null));
                hc1Var3.O.setOnClickListener(new ub1(hc1Var3, 3));
                hc1Var3.Q = new gi.j(activity, l1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                hc1Var3.P = frameLayout;
                frameLayout.addView(hc1Var3.Q, c8.na.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                hc1Var3.P.setVisibility(8);
                hc1Var3.P.setOnClickListener(new ub1(hc1Var3, 4));
                hi.y4 y4Var = new hi.y4(activity, l1Var);
                hc1Var3.S = y4Var;
                y4Var.setOrientation(1);
                TextView textView = new TextView(activity);
                hc1Var3.T = textView;
                textView.setText(org.telegram.messenger.hd.N0(2131743248, null));
                hc1Var3.T.setTextSize(1, 15.0f);
                hc1Var3.T.setTypeface(org.telegram.messenger.g0.o());
                hc1Var3.T.setTextColor(-1);
                hc1Var3.T.setGravity(17);
                org.telegram.ui.ActionBar.n2 n2Var3 = new org.telegram.ui.ActionBar.n2(8, activity, hc1Var3);
                hc1Var3.U = n2Var3;
                n2Var3.setTextSize(1, 15.0f);
                hc1Var3.U.setTextColor(-1);
                hc1Var3.U.setGravity(17);
                hc1Var3.U.setText(org.telegram.messenger.hd.a0("CallEmojiKeyTooltip", null, 2131752615, TextUtils.ellipsize(org.telegram.messenger.p10.k(user, true), hc1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
                hc1Var3.S.setVisibility(8);
                hc1Var3.S.addView(hc1Var3.T);
                hc1Var3.S.addView(hc1Var3.U, c8.na.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                hc1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
                    org.telegram.ui.Components.q9[] q9VarArr = hc1Var3.W;
                    q9VarArr[i14] = q9Var;
                    q9VarArr[i14].getImageReceiver().S0 = true;
                    d61 d61Var2 = hc1Var3.O;
                    org.telegram.ui.Components.q9 q9Var2 = q9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    d61Var2.addView(q9Var2, c8.na.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                dc1 dc1Var = new dc1(hc1Var3, activity);
                hc1Var3.Y = dc1Var;
                dc1Var.setOrientation(1);
                hc1Var3.Y.setFocusable(true);
                hc1Var3.Y.setFocusableInTouchMode(true);
                hc1Var3.E = new org.telegram.ui.Components.voip.p0(activity);
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                b9Var.r(user);
                org.telegram.ui.Components.voip.p0 p0Var = hc1Var3.E;
                int i15 = hc1Var3.f48295a;
                p0Var.f41222b.j(org.telegram.messenger.gc.m(i15, 0, user), null, b9Var, user);
                hc1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                hc1Var3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                hc1Var3.F.setText(org.telegram.messenger.j6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), hc1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
                hc1Var3.F.setMaxLines(2);
                hc1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
                hc1Var3.F.setTextColor(-1);
                hc1Var3.F.setGravity(1);
                hc1Var3.F.setImportantForAccessibility(2);
                hc1Var3.Y.addView(hc1Var3.F, c8.na.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f41107a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f41107a[i16] = new TextView(activity);
                    frameLayout2.f41107a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f41107a[i16].setTextColor(-1);
                    frameLayout2.f41107a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f41107a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f41109c = frameLayout3;
                org.telegram.ui.Components.voip.a1 a1Var = new org.telegram.ui.Components.voip.a1(frameLayout2, activity, l1Var);
                a1Var.setTextSize(1, 15.0f);
                a1Var.setTextColor(-1);
                a1Var.setGravity(1);
                a1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
                a1Var.setText(org.telegram.messenger.hd.N0(2131742974, null));
                frameLayout3.addView(a1Var, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, c8.na.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f41108b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, c8.na.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131743010, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new kg.r1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity);
                frameLayout2.d = o2Var;
                frameLayout2.addView(o2Var, c8.na.c(-2.0f, -1));
                hc1Var3.G = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f56254a;
                frameLayout2.setImportantForAccessibility(4);
                hc1Var3.Y.addView(hc1Var3.G, c8.na.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    gc1 gc1Var = new gc1(activity);
                    hc1Var3.H = gc1Var;
                    long j3 = sharedState.getUser().f28547id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i18 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i18 <= 0) {
                        gc1Var.setVisibility(8);
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
                        org.telegram.ui.Components.d9 d9Var = gc1Var.f47993b;
                        d9Var.i(min);
                        int i19 = 0;
                        while (i19 < min) {
                            d9Var.j(i19, i15, org.telegram.messenger.np.u1(i15).g2(org.telegram.messenger.n5.o(groupParticipants.get(i19).peer)));
                            i19++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        d9Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.n5.o(groupParticipants.get(0).peer) == j10))) {
                            gc1Var.setVisibility(8);
                        } else {
                            gc1Var.f47994c = new org.telegram.ui.Components.xy0(org.telegram.messenger.hd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                            gc1Var.setVisibility(0);
                            gc1Var.invalidate();
                        }
                    }
                    hc1Var3.Y.addView(hc1Var3.H, c8.na.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                hc1Var3.Y.setClipChildren(false);
                hc1Var3.Y.setClipToPadding(false);
                hc1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
                hc1Var3.V = new org.telegram.ui.Components.voip.q(activity);
                hc1Var3.R = new di.n4(activity, l1Var);
                hc1Var3.V.setAlpha(0.0f);
                hc1Var3.R.setVisibility(8);
                cc1Var.addView(hc1Var3.E, c8.na.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.Y, c8.na.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.P, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.S, c8.na.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.O, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.V, c8.na.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                cc1Var.addView(hc1Var3.R, c8.na.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                hc1Var3.f48318j0 = new org.telegram.ui.Components.voip.m1(activity);
                hc1Var3.f48306e = new org.telegram.ui.Components.voip.e3(activity, l1Var);
                hc1Var3.f48309f = new org.telegram.ui.Components.voip.e3(activity, l1Var);
                hc1Var3.h = new org.telegram.ui.Components.voip.e3(activity, l1Var);
                hc1Var3.f48323n = new org.telegram.ui.Components.voip.q2(activity, 52.0f);
                hc1Var3.f48306e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                hc1Var3.f48306e.setScaleX(0.0f);
                hc1Var3.f48306e.setScaleY(0.0f);
                hc1Var3.f48306e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hc1Var3.f48309f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                hc1Var3.f48309f.setScaleX(0.0f);
                hc1Var3.f48309f.setScaleY(0.0f);
                hc1Var3.f48309f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hc1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                hc1Var3.h.setScaleX(0.0f);
                hc1Var3.h.setScaleY(0.0f);
                hc1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hc1Var3.f48323n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                hc1Var3.f48323n.setScaleX(0.0f);
                hc1Var3.f48323n.setScaleY(0.0f);
                hc1Var3.f48323n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hc1Var3.f48318j0.addView(hc1Var3.f48306e);
                hc1Var3.f48318j0.addView(hc1Var3.f48309f);
                hc1Var3.f48318j0.addView(hc1Var3.h);
                hc1Var3.f48318j0.addView(hc1Var3.f48323n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                hc1Var3.f48310f0 = eVar;
                eVar.setListener(new fc1(hc1Var3));
                hc1Var3.f48310f0.setScaleX(1.15f);
                hc1Var3.f48310f0.setScaleY(1.15f);
                cc1Var.addView(hc1Var3.f48318j0, c8.na.e(-1, -2, 80));
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                cc1Var.addView(hc1Var3.f48310f0, c8.na.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                hc1Var3.J = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
                hc1Var3.J.setImageResource(2131232047);
                hc1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                cc1Var.addView(hc1Var3.J, c8.na.e(56, 56, 53));
                c8.sa.a(hc1Var3.J);
                ImageView imageView2 = new ImageView(activity);
                hc1Var3.I = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
                hc1Var3.I.setImageResource(2131232082);
                hc1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                hc1Var3.I.setContentDescription(org.telegram.messenger.hd.N0(2131753753, null));
                cc1Var.addView(hc1Var3.I, c8.na.e(56, 56, 51));
                c8.sa.a(hc1Var3.I);
                kg.k kVar = new kg.k(activity, 5);
                hc1Var3.L = kVar;
                kVar.setContentDescription(org.telegram.messenger.hd.N0(2131742996, null));
                hc1Var3.L.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
                hc1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                cc1Var.addView(hc1Var3.L, c8.na.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                hc1Var3.L.setAlpha(0.0f);
                hc1Var3.L.setOnClickListener(new ub1(hc1Var3, 5));
                hc1Var3.I.setOnClickListener(new ub1(hc1Var3, 6));
                hc1Var3.J.setOnClickListener(new jg0(17, hc1Var3, activity));
                if (hc1Var3.f48333u0.f41289b) {
                    hc1Var3.I.setVisibility(8);
                    hc1Var3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f40916a = new HashMap();
                linearLayout.f40917b = new ArrayList();
                linearLayout.f40918c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f40922r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f40921n = l1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                hc1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                hc1Var3.M0.setOnViewsUpdated(new tb1(hc1Var3, 5));
                cc1Var.addView(hc1Var3.M0, c8.na.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(activity, 3, l1Var, true);
                rpVar.r(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                rpVar.L = alignment;
                rpVar.d = -1L;
                rpVar.f14868r0 = new tb1(hc1Var3, 6);
                rpVar.U = true;
                rpVar.h = org.telegram.messenger.g0.L(320.0f);
                rpVar.f14852e = true;
                rpVar.n(10.0f, 6.0f, 10.0f, 6.0f);
                rpVar.s(8.0f);
                hc1Var3.N0 = rpVar;
                rpVar.v(org.telegram.messenger.hd.N0(2131744013, null));
                cc1Var.addView(hc1Var3.N0, c8.na.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(activity, 1, l1Var, false);
                rpVar2.r(true);
                rpVar2.L = alignment;
                rpVar2.d = 4000L;
                rpVar2.U = true;
                rpVar2.h = org.telegram.messenger.g0.L(320.0f);
                rpVar2.f14852e = true;
                rpVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
                rpVar2.s(8.0f);
                hc1Var3.O0 = rpVar2;
                rpVar2.v(org.telegram.messenger.hd.N0(2131743059, null));
                cc1Var.addView(hc1Var3.O0, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hc1Var3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!hc1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        hc1Var3.U0 = z12;
                    }
                    hc1Var3.f();
                }
                ac1Var2.addView(cc1Var);
                if (z10) {
                    hc1Var3.F0 = 0.0f;
                    hc1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        hc1Var3.f48304d0.setStub(org.telegram.ui.Components.voip.h2.d().f41007s);
                        hc1Var3.f48307e0.setStub(org.telegram.ui.Components.voip.h2.d().f41006r);
                    }
                    hc1Var3.f48333u0.setAlpha(0.0f);
                    hc1Var3.y();
                    hc1Var3.E0 = true;
                    org.telegram.ui.Components.voip.h2.T = true;
                    if (org.telegram.ui.Components.voip.h2.V == null) {
                        hc1Var3.L0.d();
                        org.telegram.messenger.g0.h3(new tb1(hc1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.h2.U.getClass();
                        throw null;
                    }
                } else {
                    hc1Var3.F0 = 1.0f;
                    hc1Var3.x();
                }
                org.telegram.ui.Components.voip.i2.g();
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
        float f20 = org.telegram.ui.Components.voip.h2.d().d.x + org.telegram.ui.Components.voip.h2.d().F;
        float f21 = org.telegram.ui.Components.voip.h2.d().d.y + org.telegram.ui.Components.voip.h2.d().G;
        final float x10 = this.Z.getX();
        final float y10 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.h2.U.getClass();
        final float measuredWidth2 = f20 - ((this.f48304d0.getMeasuredWidth() - (this.f48304d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f21 - ((this.f48304d0.getMeasuredHeight() - (this.f48304d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f22 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (this.f48324n0 && measuredWidth3 != 0) {
                f19 = (this.f48333u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.h2.d().f41004f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.h2.d().f41004f * 0.25f) + (f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f18 = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.h2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.h2.d().h * 0.25f) + (f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
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
            org.telegram.ui.Components.voip.h2.U.getClass();
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
            this.f48304d0.setScaleX(0.25f);
            this.f48304d0.setScaleY(0.25f);
            this.f48304d0.setTranslationX(measuredWidth2);
            this.f48304d0.setTranslationY(measuredHeight2);
            f14 = 0.25f;
            this.f48304d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f24) / 0.25f);
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
                hc1 hc1Var = hc1.this;
                hc1Var.F0 = f26;
                hc1Var.x();
                if (z11) {
                    float f27 = (f11 * floatValue) + (scaleX * f26);
                    hc1Var.Z.setScaleX(f27);
                    hc1Var.Z.setScaleY(f27);
                    hc1Var.Z.setTranslationX((f23 * floatValue) + (x10 * f26));
                    hc1Var.Z.setTranslationY((measuredHeight * floatValue) + (y10 * f26));
                    hc1Var.Z.setCornerRadius((L * floatValue) + (f12 * f26));
                    hc1Var.Z.setAlpha((f22 * floatValue) + (1.0f * f26));
                }
                float f28 = (f25 * floatValue) + (1.0f * f26);
                hc1Var.f48304d0.setScaleX(f28);
                hc1Var.f48304d0.setScaleY(f28);
                float f29 = 0.0f * f26;
                float f30 = (measuredWidth2 * floatValue) + f29;
                float f31 = (measuredHeight2 * floatValue) + f29;
                hc1Var.f48304d0.setTranslationX(f30);
                hc1Var.f48304d0.setTranslationY(f31);
                hc1Var.f48304d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f28);
                if (!hc1Var.Z.Q) {
                    hc1Var.f48307e0.d(false, floatValue);
                }
                hc1Var.f48333u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.R4);
        org.telegram.messenger.ls.f(this.f48295a).n(this, org.telegram.messenger.ls.P4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.E2);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.J5);
        wg.e1 e1Var = this.N;
        if (e1Var != null) {
            e1Var.dismiss();
            this.N = null;
        }
    }

    public final void d(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f48338x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.u2 u2Var = this.f48337x;
            if (u2Var.L && z10 != u2Var.F) {
                u2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                u2Var.f41355c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t2(u2Var, 1));
                u2Var.f41355c.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                u2Var.f41355c.setDuration(200L);
                u2Var.f41355c.start();
            }
            if (z10) {
                int i7 = org.telegram.messenger.cz.f23370f1;
                if (i7 < 2) {
                    org.telegram.messenger.cz.f23370f1 = i7 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.cz.f23370f1);
                    edit.apply();
                }
                this.O0.f(true);
                org.telegram.messenger.g0.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.nr.f37917f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.nr.f37918g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37917f;
                org.telegram.messenger.o10.o(translationY, nrVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new xb1(this, 3)).setInterpolator(nrVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.nr.f37917f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.f37917f;
                duration.setInterpolator(nrVar2).setListener(new on(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(nrVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new xb1(this, 4)).setDuration(250L).setInterpolator(nrVar2).start();
            }
            this.f48327q0 = this.f48326p0;
            y();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.P4) {
            if (this.f48326p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f48307e0.d.release();
                this.f48304d0.d.release();
                this.f48302c0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i7 == org.telegram.messenger.ls.f25306l4) {
            v(true);
        } else if (i7 == org.telegram.messenger.ls.E2) {
            this.f48333u0.b();
        } else if (i7 == org.telegram.messenger.ls.R4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i7 == org.telegram.messenger.ls.J5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f48312g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        this.f48333u0.b();
    }

    public final void f() {
        this.f48307e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yb1(this));
        this.f48304d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f48302c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            bc1 bc1Var = this.f48325o0;
            if (bc1Var != null) {
                bc1Var.a(false, false);
            } else if (this.m0 && this.f48324n0 && this.H0) {
                this.H0 = false;
                this.Z.setRelativePosition(this.f48296a0);
                this.f48299b0 = false;
                this.f48327q0 = this.f48326p0;
                y();
            } else if (this.C0) {
                d(false);
            } else if (this.S.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (!this.G0 && f48294m1 != null) {
                        this.G0 = true;
                        if (VoIPService.getSharedInstance() != null) {
                            int measuredHeight = f48294m1.f48333u0.getMeasuredHeight();
                            hc1 hc1Var = f48294m1;
                            org.telegram.ui.Components.voip.h2.f(hc1Var.f48298b, hc1Var.f48295a, hc1Var.f48333u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = f48294m1.f48329r0;
                            if (windowInsets != null) {
                                org.telegram.ui.Components.voip.h2.W = windowInsets.getSystemWindowInsetTop();
                                f48294m1.f48329r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (org.telegram.ui.Components.voip.h2.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37917f;
                            duration.setInterpolator(nrVar).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                            this.f48318j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).start();
                            this.f48314h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).start();
                            this.f48316i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).start();
                            this.f48296a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).start();
                            org.telegram.ui.Components.voip.h2.T = true;
                            this.E0 = true;
                            ValueAnimator b10 = b(false);
                            this.L0.d();
                            b10.addListener(new xb1(this, 1));
                            b10.setDuration(350L);
                            b10.setInterpolator(nrVar);
                            b10.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f48333u0.b();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f48309f.getVisibility() == 0) {
            this.f48310f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f48310f0;
            ValueAnimator valueAnimator = eVar.f40939c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f40939c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.f48323n.animate().cancel();
        this.f48306e.animate().cancel();
        this.h.animate().cancel();
        this.f48309f.animate().cancel();
        this.f48310f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f48310f0;
        ValueAnimator valueAnimator2 = eVar2.f40939c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f40939c0 = null;
            eVar2.V.stop();
        }
        this.f48323n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.N0(2131743168, null), false, false);
        this.f48306e.d(5, false, false);
        this.h.d(1, false, false);
        this.f48309f.d(3, true, false);
        this.f48323n.setVisibility(0);
        this.f48306e.setVisibility(0);
        this.h.setVisibility(0);
        this.f48309f.setVisibility(0);
        this.f48323n.setAlpha(0.0f);
        this.f48306e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f48309f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f48310f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                hc1 hc1Var = hc1.this;
                hc1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                hc1Var.f48310f0.setTranslationY(L2 * floatValue);
                int i7 = marginEnd;
                int i10 = (int) (i7 - ((i7 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                hc1Var.f48310f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f48310f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f48310f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f48310f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f48310f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.h10(18, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.h3(new tb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService) {
        if (!this.f48324n0) {
            e3Var.d(2, false, false);
            e3Var.setOnBtnClickedListener(null);
            e3Var.setEnabled(false);
            return;
        }
        e3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            e3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            e3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        e3Var.setOnBtnClickedListener(new z6(this, voIPService, e3Var, 23));
    }

    public final void k(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService, boolean z10) {
        e3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.q1 q1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = q1Var.f41248g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            q1Var.L = f10;
            q1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = q1Var.f41248g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = q1Var.L;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            q1Var.f41248g0 = ofFloat;
            ofFloat.addUpdateListener(q1Var.f41249h0);
            q1Var.f41248g0.setDuration(150L);
            q1Var.f41248g0.start();
        }
        e3Var.setOnBtnClickedListener(new sb1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            e3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            e3Var.d(5, true, false);
        } else {
            e3Var.d(5, false, false);
            i7 = 1;
            e3Var.setEnabled(true);
            e3Var.setOnBtnClickedListener(new bg.g0(this, i7, e3Var, voIPService, 9));
        }
        i7 = i10;
        e3Var.setEnabled(true);
        e3Var.setOnBtnClickedListener(new bg.g0(this, i7, e3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f48324n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f48324n0) {
                if (voIPService.isScreencast()) {
                    e3Var.d(3, false, z10);
                } else {
                    e3Var.d(3, false, z10);
                }
            } else {
                e3Var.d(3, true, z10);
            }
            e3Var.setOnBtnClickedListener(new sb1(this, 5));
            e3Var.setEnabled(true);
            return;
        }
        e3Var.d(3, true, false);
        e3Var.setOnClickListener(null);
        e3Var.setEnabled(false);
    }

    public final void o(boolean z10, boolean z11) {
        boolean z12;
        int i7 = 0;
        if (!this.f48324n0 && !this.m0) {
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
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.nr.f37917f).start();
                    } else {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.nr.f37917f).start();
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
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.nr.f37917f).setListener(new xb1(this, 8)).start();
            }
        } else {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            org.telegram.ui.Components.voip.p0 p0Var = this.E;
            if (!z12) {
                i7 = 8;
            }
            p0Var.setVisibility(i7);
        }
        org.telegram.ui.Components.voip.p0 p0Var2 = this.E;
        if (z12) {
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
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f48327q0 = this.f48326p0;
        y();
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        this.f48327q0 = this.f48326p0;
        if (i10 == 2 && !this.U0) {
            this.U0 = true;
        }
        org.telegram.ui.Components.voip.i2.g();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.x2 x2Var;
        if (i7 > 0) {
            this.f48319j1 = true;
        }
        if (this.G != null && (x2Var = this.f48335w) != null) {
            int i10 = x2Var.W;
            if ((i10 == 2 || i10 == 3) && this.f48319j1) {
                org.telegram.messenger.g0.h3(new zn0(this, i7, 5), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i7) {
        int i10 = this.f48326p0;
        if (i10 != i7) {
            this.f48327q0 = i10;
            this.f48326p0 = i7;
            if (this.f48333u0 != null) {
                y();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f48327q0 = this.f48326p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.f48298b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(0, this.f48298b, null);
        boolean[] zArr = new boolean[3];
        t1Var.S = org.telegram.messenger.hd.N0(2131743165, null);
        t1Var.U = charSequence;
        t1Var.m0 = org.telegram.messenger.hd.N0(2131747637, null);
        t1Var.f30004n0 = null;
        t1Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) t1Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, t1Var.f30000j1);
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
            this.Z.setUiVisible(this.f48338x0);
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
                    org.telegram.ui.Components.voip.q1 q1Var = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(q1Var, View.ALPHA, q1Var.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.q1 q1Var2 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var2, View.SCALE_X, q1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.q1 q1Var3 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(q1Var3, View.SCALE_Y, q1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new xb1(this, 7));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.nr.f37917f);
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
                org.telegram.ui.Components.voip.q1 q1Var4 = this.Z;
                if (q1Var4.E < 0.0f) {
                    q1Var4.d(1.0f, 1.0f);
                    this.f48299b0 = true;
                }
            }
            org.telegram.ui.Components.voip.q1 q1Var5 = this.Z;
            if (i7 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            q1Var5.c(z12, z11);
            if (i7 == 2) {
                z13 = false;
            }
            this.f48299b0 = z13;
        }
        this.Z.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z10) {
        int i7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iz0 iz0Var = this.Q0;
        int i10 = 0;
        if (!z10 && this.f48338x0) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37917f;
            duration.setInterpolator(nrVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(nrVar).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(nrVar).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(nrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(nrVar).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(nrVar).start();
            this.f48318j0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(nrVar).start();
            this.f48314h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
            this.f48316i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48340y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(iz0Var);
            this.P0.setDuration(150L).setInterpolator(nrVar);
            this.P0.start();
            org.telegram.messenger.g0.r(this.S0);
            this.R0 = false;
            this.f48318j0.setEnabled(false);
            this.O0.f(true);
            i7 = 150;
        } else {
            if (z10 && !this.f48338x0) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.f37917f;
                translationY.setInterpolator(nrVar2).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(nrVar2).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.f48318j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.f48314h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar2).start();
                this.f48316i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f48340y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(iz0Var);
                this.P0.setDuration(150L).setInterpolator(nrVar2);
                this.P0.start();
                this.f48318j0.setEnabled(true);
            }
            i7 = 0;
        }
        this.f48338x0 = z10;
        ac1 ac1Var = this.f48333u0;
        if (!z10) {
            ac1Var.setSystemUiVisibility(ac1Var.getSystemUiVisibility() | 4);
        } else {
            ac1Var.setSystemUiVisibility(ac1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i11 = -org.telegram.messenger.g0.L(16.0f);
        if (this.f48338x0) {
            i10 = org.telegram.messenger.g0.L(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.nr.f37917f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            tb1 tb1Var = this.S0;
            org.telegram.messenger.g0.r(tb1Var);
            this.R0 = false;
            if (this.f48341z0 && this.f48338x0) {
                org.telegram.messenger.g0.h3(tb1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        String N0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f48336w0.isTouchExplorationEnabled()) {
                if (!this.f48324n0) {
                    N0 = org.telegram.messenger.hd.N0(2131754731, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131754732, null);
                }
                this.f48330s.announceForAccessibility(N0);
            }
            if (!this.f48324n0) {
                if (this.f48325o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f48333u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f48309f.getLocationOnScreen(iArr);
                    bc1 bc1Var = new bc1(this, this.f48330s.getContext(), iArr[0], iArr[1]);
                    this.f48325o0 = bc1Var;
                    WindowInsets windowInsets = this.f48329r0;
                    if (windowInsets != null) {
                        bc1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f48330s.addView(this.f48325o0);
                    return;
                }
                return;
            }
            this.f48307e0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f48327q0 = this.f48326p0;
            y();
        }
    }

    public final void u(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37917f;
                transitionSet.addTransition(duration.setInterpolator(nrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(nrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.q2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.e3.class, true);
                TransitionManager.beginDelayedTransition(this.f48318j0, transitionSet);
            }
            int i7 = this.f48326p0;
            if (i7 == 11) {
                this.f48306e.setVisibility(8);
                this.f48309f.setVisibility(8);
                this.h.setVisibility(8);
                this.f48323n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i7 != 15 && i7 != 17) {
                if (f48294m1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f48324n0 || this.m0)) {
                    j(this.f48306e, sharedInstance);
                    if (this.f48338x0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                } else {
                    l(this.f48306e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                }
                m(this.f48309f, sharedInstance, false);
                k(this.h, sharedInstance, z10);
                this.f48323n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.hd.N0(2131743168, null), false, z10);
                this.f48323n.setOnClickListener(new ub1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i7 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f48324n0 || this.m0)) {
                        j(this.f48306e, sharedInstance);
                        if (this.f48338x0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    } else {
                        l(this.f48306e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    }
                    m(this.f48309f, sharedInstance, false);
                    k(this.h, sharedInstance, z10);
                } else {
                    this.f48306e.setVisibility(8);
                    this.f48309f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f48323n.setVisibility(8);
            }
            if (this.f48306e.getVisibility() == 0) {
                this.f48306e.f40958f = 0;
                i10 = 16;
            }
            if (this.f48309f.getVisibility() == 0) {
                this.f48309f.f40958f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f40958f = i10;
                i10 += 16;
            }
            if (this.f48323n.getVisibility() == 0) {
                this.f48323n.G = i10;
            }
            w();
        }
    }

    public final void v(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc1.v(boolean):void");
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
        this.f48320k0.setColor(i0.a.o(-16777216, (int) (this.f48340y0 * 102.0f * this.F0)));
        this.f48322l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        cc1 cc1Var = this.f48330s;
        if (cc1Var != null) {
            cc1Var.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc1.y():void");
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

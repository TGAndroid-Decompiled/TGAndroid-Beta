package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
public final class be1 implements VoIPService.StateListener, org.telegram.messenger.us, lf.a {
    public static be1 f36195n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.voip.b0 D;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.v1 F;
    public float F0;
    public ae1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ag.r K;
    public long K0;
    public int L;
    public mg.i2 M;
    public org.telegram.ui.Components.voip.o1 M0;
    public u71 N;
    public org.telegram.ui.Components.voip.k2 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.k2 O0;
    public bi.j6 P;
    public ValueAnimator P0;
    public jg.b1 Q;
    public jg.d0 R;
    public boolean R0;
    public TextView S;
    public org.telegram.ui.ActionBar.q2 T;
    public org.telegram.ui.Components.voip.j U;
    public boolean U0;
    public float V0;
    public float W0;
    public xd1 X;
    public float X0;
    public org.telegram.ui.Components.voip.b1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.b1 Z;
    public float Z0;
    public final int f36196a;
    public boolean f36197a0;
    public boolean f36198a1;
    public Activity f36199b;
    public TextureViewRenderer f36200b0;
    public float f36201b1;
    public final TLRPC.User f36202c;
    public org.telegram.ui.Components.voip.y1 f36203c0;
    public float f36204c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.y1 f36205d0;
    public int f36206d1;
    public org.telegram.ui.Components.voip.r2 e;
    public org.telegram.ui.Components.voip.e f36207e0;
    public int f36208e1;
    public org.telegram.ui.Components.voip.r2 f36209f;
    public boolean f36210f0;
    public jf.f f36212g0;
    public boolean f36213g1;
    public org.telegram.ui.Components.voip.r2 h;
    public View f36214h0;
    public boolean f36215h1;
    public View f36216i0;
    public ValueAnimator f36217i1;
    public org.telegram.ui.Components.voip.y0 f36218j0;
    public boolean f36219j1;
    public org.telegram.ui.Components.voip.y1 f36221k1;
    public com.google.android.gms.internal.cast.o l1;
    public boolean m0;
    public boolean f36223m1;
    public yd1 f36224n;
    public boolean f36225n0;
    public ud1 f36226o0;
    public int f36227p0;
    public int f36228q0;
    public WindowInsets f36230r0;
    public wd1 f36231s;
    public boolean f36232s0;
    public float f36233t0;
    public td1 f36234u0;
    public int f36235v0;
    public org.telegram.ui.Components.voip.j2 f36236w;
    public AccessibilityManager f36237w0;
    public org.telegram.ui.Components.voip.f2 f36238x;
    public org.telegram.ui.Components.voip.l2 f36240y;
    public boolean f36242z0;
    public final org.telegram.ui.Components.voip.x0 f36229r = new org.telegram.ui.Components.voip.x0();
    public final org.telegram.ui.Components.g9[] V = new org.telegram.ui.Components.g9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f36220k0 = new Paint();
    public final Paint f36222l0 = new Paint();
    public boolean f36239x0 = true;
    public float f36241y0 = 1.0f;
    public final e2.f L0 = new e2.f(null);
    public final u01 Q0 = new u01(this, 16);
    public final md1 S0 = new md1(this, 12);
    public final md1 T0 = new md1(this, 13);
    public float f36211f1 = 1.0f;

    public be1(int i10) {
        this.f36196a = i10;
        this.f36202c = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(org.telegram.messenger.d20.i(i10).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f36228q0 = -1;
        this.f36227p0 = sharedState.getCallState();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.M4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.E2);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.G5);
    }

    public static void a(be1 be1Var) {
        be1 be1Var2;
        if (be1Var.f36213g1) {
            be1Var.f36213g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            be1Var.f36217i1 = ofFloat;
            be1Var2 = be1Var;
            ofFloat.addUpdateListener(new lg.j(be1Var2, be1Var.f36211f1, be1Var.Y0, be1Var.Z0, 2));
            be1Var2.f36217i1.addListener(new qd1(be1Var2, 0));
            be1Var2.f36217i1.setDuration(350L);
            be1Var2.f36217i1.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            be1Var2.f36217i1.start();
        } else {
            be1Var2 = be1Var;
        }
        be1Var2.f36215h1 = false;
        be1Var2.f36198a1 = false;
    }

    public static void k(int[] iArr, int i10) {
        be1 be1Var = f36195n1;
        if (be1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    be1Var.f36234u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    be1Var.o(new org.telegram.ui.Components.voip.m0(17));
                } else if (!be1Var.f36199b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.m1.h(be1Var.f36199b, new md1(be1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    be1Var.f36234u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    be1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int size;
        int size2;
        float f7;
        be1 be1Var = f36195n1;
        if (be1Var != null && be1Var.f36234u0.getParent() == null) {
            be1 be1Var2 = f36195n1;
            if (be1Var2 != null) {
                be1Var2.f36203c0.d.release();
                f36195n1.f36205d0.d.release();
                f36195n1.f36200b0.release();
                td1 td1Var = f36195n1.f36234u0;
                if (td1Var != null) {
                    td1Var.d();
                }
                f36195n1.d();
            }
            f36195n1 = null;
        }
        if (f36195n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.t1.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                be1 be1Var3 = new be1(i10);
                be1Var3.f36199b = activity;
                f36195n1 = be1Var3;
                td1 td1Var2 = new td1(activity, !z10, be1Var3);
                f36195n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f36195n1.getClass();
                td1Var2.setLockOnScreen(f36195n1.J0);
                be1Var3.f36234u0 = td1Var2;
                kd1 kd1Var = new kd1(be1Var3, 4);
                WeakHashMap weakHashMap = r0.h0.f46123a;
                r0.z.i(td1Var2, kd1Var);
                ((WindowManager) activity.getSystemService("window")).addView(td1Var2, org.telegram.ui.Components.voip.c2.a());
                be1Var3.f36233t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                be1Var3.f36237w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                wd1 wd1Var = new wd1(be1Var3, activity);
                wd1Var.setClipToPadding(false);
                wd1Var.setClipChildren(false);
                wd1Var.setBackgroundColor(-16777216);
                be1Var3.F();
                be1Var3.f36231s = wd1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.x0 x0Var = be1Var3.f36229r;
                be1Var3.f36236w = new org.telegram.ui.Components.voip.j2(activity, z11, x0Var);
                org.telegram.ui.Components.voip.y1 y1Var = new org.telegram.ui.Components.voip.y1(activity, false, true, false, false);
                be1Var3.f36203c0 = y1Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                y1Var.d.setScalingType(scalingType);
                be1Var3.f36203c0.d.setEnableHardwareScaler(true);
                be1Var3.f36203c0.d.setRotateTextureWithScreen(true);
                be1Var3.f36203c0.f31768a0 = 1;
                wd1Var.addView(be1Var3.f36236w, w7.b6.c(-1.0f, -1));
                TLRPC.User user = be1Var3.d;
                org.telegram.ui.Components.voip.f2 f2Var = new org.telegram.ui.Components.voip.f2(activity, user, x0Var);
                be1Var3.f36238x = f2Var;
                wd1Var.addView(f2Var, w7.b6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.sc.e(512)) {
                    int i12 = org.telegram.ui.ActionBar.t6.f20865a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31532a = new org.telegram.ui.Components.fv0(0);
                    }
                }
                be1Var3.f36240y = view;
                wd1Var.addView((View) view, w7.b6.c(220.0f, -1));
                wd1Var.addView(be1Var3.f36203c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.f9(orientation, new int[]{-14994098, -14328963}).f(k2.m0.j0(0.5f, 1), new v81(be1Var3, 1), 0L);
                org.telegram.ui.Components.voip.b1 b1Var = new org.telegram.ui.Components.voip.b1(activity);
                be1Var3.Y = b1Var;
                b1Var.setDelegate(new kd1(be1Var3, 3));
                be1Var3.Y.d(1.0f, 1.0f);
                be1Var3.f36197a0 = true;
                org.telegram.ui.Components.voip.y1 y1Var2 = new org.telegram.ui.Components.voip.y1(activity, true, false);
                be1Var3.f36205d0 = y1Var2;
                y1Var2.d.setIsCamera(true);
                be1Var3.f36205d0.d.setUseCameraRotation(true);
                be1Var3.Y.setOnTapListener(new nd1(be1Var3, 1));
                be1Var3.f36205d0.d.setMirror(true);
                be1Var3.Y.addView(be1Var3.f36205d0);
                org.telegram.ui.Components.voip.b1 b1Var2 = new org.telegram.ui.Components.voip.b1(activity);
                be1Var3.Z = b1Var2;
                b1Var2.S = true;
                b1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                be1Var3.f36200b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                be1Var3.f36200b0.setIsCamera(false);
                be1Var3.f36200b0.setFpsReduction(30.0f);
                be1Var3.f36200b0.setScalingType(scalingType);
                be1Var3.Z.addView(be1Var3.f36200b0, w7.b6.e(-1, -2, 17));
                be1Var3.Z.setOnTapListener(new nd1(be1Var3, 2));
                be1Var3.Z.setVisibility(8);
                wd1Var.addView(be1Var3.Y, w7.b6.c(-2.0f, -2));
                wd1Var.addView(be1Var3.Z);
                View view2 = new View(activity);
                be1Var3.f36214h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.b.o(-16777216, 127)}));
                wd1Var.addView(be1Var3.f36214h0, w7.b6.e(-1, 160, 80));
                View view3 = new View(activity);
                be1Var3.f36216i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.b.o(-16777216, 102), 0}));
                wd1Var.addView(be1Var3.f36216i0, w7.b6.e(-1, 160, 48));
                u71 u71Var = new u71(be1Var3, activity, 18);
                be1Var3.N = u71Var;
                u71Var.setOrientation(0);
                be1Var3.N.setPadding(0, 0, 0, org.telegram.messenger.i0.L(30.0f));
                be1Var3.N.setClipToPadding(false);
                be1Var3.N.setContentDescription(org.telegram.messenger.cd.L0(2131743328, null));
                be1Var3.N.setOnClickListener(new nd1(be1Var3, 3));
                be1Var3.P = new bi.j6(activity, x0Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                be1Var3.O = frameLayout;
                frameLayout.addView(be1Var3.P, w7.b6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                be1Var3.O.setVisibility(8);
                be1Var3.O.setOnClickListener(new nd1(be1Var3, 4));
                jg.d0 d0Var = new jg.d0(activity, x0Var);
                be1Var3.R = d0Var;
                d0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                be1Var3.S = textView;
                textView.setText(org.telegram.messenger.cd.L0(2131743517, null));
                be1Var3.S.setTextSize(1, 15.0f);
                be1Var3.S.setTypeface(org.telegram.messenger.i0.o());
                be1Var3.S.setTextColor(-1);
                be1Var3.S.setGravity(17);
                org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(be1Var3, activity, 8);
                be1Var3.T = q2Var;
                q2Var.setTextSize(1, 15.0f);
                be1Var3.T.setTextColor(-1);
                be1Var3.T.setGravity(17);
                be1Var3.T.setText(org.telegram.messenger.cd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.h20.j(user, true), be1Var3.T.getPaint(), org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END)));
                be1Var3.R.setVisibility(8);
                be1Var3.R.addView(be1Var3.S);
                be1Var3.R.addView(be1Var3.T, w7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                be1Var3.R.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
                    org.telegram.ui.Components.g9[] g9VarArr = be1Var3.V;
                    g9VarArr[i15] = g9Var;
                    g9VarArr[i15].getImageReceiver().R0 = true;
                    u71 u71Var2 = be1Var3.N;
                    org.telegram.ui.Components.g9 g9Var2 = g9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    u71Var2.addView(g9Var2, w7.b6.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                xd1 xd1Var = new xd1(be1Var3, activity);
                be1Var3.X = xd1Var;
                xd1Var.setOrientation(1);
                be1Var3.X.setFocusable(true);
                be1Var3.X.setFocusableInTouchMode(true);
                be1Var3.D = new org.telegram.ui.Components.voip.b0(activity);
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(user);
                org.telegram.ui.Components.voip.b0 b0Var = be1Var3.D;
                int i16 = be1Var3.f36196a;
                b0Var.f31319b.j(org.telegram.messenger.ic.m(i16, 0, user), null, r8Var, user);
                be1Var3.D.setRoundRadius(org.telegram.messenger.i0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                be1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                be1Var3.E.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), be1Var3.E.getPaint().getFontMetricsInt(), false, null, 0));
                be1Var3.E.setMaxLines(2);
                be1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                be1Var3.E.setTextColor(-1);
                be1Var3.E.setGravity(1);
                be1Var3.E.setImportantForAccessibility(2);
                be1Var3.X.addView(be1Var3.E, w7.b6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f31690a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f31690a[i17] = new TextView(activity);
                    frameLayout2.f31690a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f31690a[i17].setTextColor(-1);
                    frameLayout2.f31690a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f31690a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f31692c = frameLayout3;
                org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(frameLayout2, activity, x0Var);
                j0Var.setTextSize(1, 15.0f);
                j0Var.setTextColor(-1);
                j0Var.setGravity(1);
                j0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f));
                j0Var.setText(org.telegram.messenger.cd.L0(2131743243, null));
                frameLayout3.addView(j0Var, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.b6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f31691b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.b6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131743279, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new ag.x2(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(activity);
                frameLayout2.d = z1Var;
                frameLayout2.addView(z1Var, w7.b6.c(-2.0f, -1));
                be1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.h0.f46123a;
                frameLayout2.setImportantForAccessibility(4);
                be1Var3.X.addView(be1Var3.F, w7.b6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    ae1 ae1Var = new ae1(activity);
                    be1Var3.G = ae1Var;
                    long j10 = sharedState.getUser().f19942id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        ae1Var.setVisibility(8);
                    } else {
                        if (groupParticipants == null) {
                            size = 0;
                        } else {
                            size = groupParticipants.size();
                        }
                        int max = Math.max(i19, size);
                        if (groupParticipants == null) {
                            size2 = 0;
                        } else {
                            size2 = groupParticipants.size();
                        }
                        int min = Math.min(3, size2);
                        org.telegram.ui.Components.t8 t8Var = ae1Var.f35636b;
                        t8Var.i(min);
                        int i20 = 0;
                        while (i20 < min) {
                            t8Var.j(i20, i16, org.telegram.messenger.vp.r1(i16).d2(org.telegram.messenger.o5.o(groupParticipants.get(i20).peer)));
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        t8Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.o5.o(groupParticipants.get(0).peer) == j11))) {
                            ae1Var.setVisibility(8);
                        } else {
                            ae1Var.f35637c = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.H(',', "Participants", max), 14.0f, org.telegram.messenger.i0.o());
                            ae1Var.setVisibility(0);
                            ae1Var.invalidate();
                        }
                    }
                    be1Var3.X.addView(be1Var3.G, w7.b6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                be1Var3.X.setClipChildren(false);
                be1Var3.X.setClipToPadding(false);
                be1Var3.X.setPadding(0, 0, 0, org.telegram.messenger.i0.L(15.0f));
                be1Var3.U = new org.telegram.ui.Components.voip.j(activity);
                be1Var3.Q = new jg.b1(activity, x0Var);
                be1Var3.U.setAlpha(0.0f);
                be1Var3.Q.setVisibility(8);
                wd1Var.addView(be1Var3.D, w7.b6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.X, w7.b6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.O, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.R, w7.b6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.N, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.U, w7.b6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                wd1Var.addView(be1Var3.Q, w7.b6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                be1Var3.f36218j0 = new org.telegram.ui.Components.voip.y0(activity);
                be1Var3.e = new org.telegram.ui.Components.voip.r2(activity, x0Var);
                be1Var3.f36209f = new org.telegram.ui.Components.voip.r2(activity, x0Var);
                be1Var3.h = new org.telegram.ui.Components.voip.r2(activity, x0Var);
                be1Var3.f36224n = new org.telegram.ui.Components.voip.b2(activity, 52.0f);
                be1Var3.e.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                be1Var3.e.setScaleX(0.0f);
                be1Var3.e.setScaleY(0.0f);
                be1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                be1Var3.f36209f.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                be1Var3.f36209f.setScaleX(0.0f);
                be1Var3.f36209f.setScaleY(0.0f);
                be1Var3.f36209f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                be1Var3.h.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                be1Var3.h.setScaleX(0.0f);
                be1Var3.h.setScaleY(0.0f);
                be1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                be1Var3.f36224n.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                be1Var3.f36224n.setScaleX(0.0f);
                be1Var3.f36224n.setScaleY(0.0f);
                be1Var3.f36224n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                be1Var3.f36218j0.addView(be1Var3.e);
                be1Var3.f36218j0.addView(be1Var3.f36209f);
                be1Var3.f36218j0.addView(be1Var3.h);
                be1Var3.f36218j0.addView(be1Var3.f36224n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                be1Var3.f36207e0 = eVar;
                eVar.setListener(new zd1(be1Var3));
                be1Var3.f36207e0.setScaleX(1.15f);
                be1Var3.f36207e0.setScaleY(1.15f);
                wd1Var.addView(be1Var3.f36218j0, w7.b6.e(-1, -2, 80));
                if (org.telegram.messenger.i0.Q1()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                wd1Var.addView(be1Var3.f36207e0, w7.b6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                be1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                be1Var3.I.setImageResource(2131232044);
                be1Var3.I.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                wd1Var.addView(be1Var3.I, w7.b6.e(56, 56, 53));
                w7.e6.a(be1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                be1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                be1Var3.H.setImageResource(2131232079);
                be1Var3.H.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                be1Var3.H.setContentDescription(org.telegram.messenger.cd.L0(2131753756, null));
                wd1Var.addView(be1Var3.H, w7.b6.e(56, 56, 51));
                w7.e6.a(be1Var3.H);
                ag.r rVar = new ag.r(activity, 6);
                be1Var3.K = rVar;
                rVar.setContentDescription(org.telegram.messenger.cd.L0(2131743265, null));
                be1Var3.K.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                be1Var3.K.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
                wd1Var.addView(be1Var3.K, w7.b6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                be1Var3.K.setAlpha(0.0f);
                be1Var3.K.setOnClickListener(new nd1(be1Var3, 5));
                be1Var3.H.setOnClickListener(new nd1(be1Var3, 6));
                be1Var3.I.setOnClickListener(new rv0(9, be1Var3, activity));
                if (be1Var3.f36234u0.f31369b) {
                    be1Var3.H.setVisibility(8);
                    be1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f31563a = new HashMap();
                linearLayout.f31564b = new ArrayList();
                linearLayout.f31565c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f31568r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f31567n = x0Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new kg.g0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                be1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                be1Var3.M0.setOnViewsUpdated(new md1(be1Var3, 5));
                wd1Var.addView(be1Var3.M0, w7.b6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity, 3, x0Var, true);
                k2Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                k2Var.K = alignment;
                k2Var.d = -1L;
                k2Var.f51740l0 = new md1(be1Var3, 6);
                k2Var.T = true;
                k2Var.h = org.telegram.messenger.i0.L(320.0f);
                k2Var.e = true;
                k2Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                k2Var.q(8.0f);
                be1Var3.N0 = k2Var;
                k2Var.s(org.telegram.messenger.cd.L0(2131744279, null));
                wd1Var.addView(be1Var3.N0, w7.b6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.k2 k2Var2 = new org.telegram.ui.Components.voip.k2(activity, 1, x0Var, false);
                k2Var2.p(true);
                k2Var2.K = alignment;
                k2Var2.d = 4000L;
                k2Var2.T = true;
                k2Var2.h = org.telegram.messenger.i0.L(320.0f);
                k2Var2.e = true;
                k2Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                k2Var2.q(8.0f);
                be1Var3.O0 = k2Var2;
                k2Var2.s(org.telegram.messenger.cd.L0(2131743328, null));
                wd1Var.addView(be1Var3.O0, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                be1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!be1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        be1Var3.U0 = z12;
                    }
                    be1Var3.h();
                }
                td1Var2.addView(wd1Var);
                if (z10) {
                    be1Var3.F0 = 0.0f;
                    be1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        be1Var3.f36203c0.setStub(org.telegram.ui.Components.voip.t1.d().f31672s);
                        be1Var3.f36205d0.setStub(org.telegram.ui.Components.voip.t1.d().f31671r);
                    }
                    be1Var3.f36234u0.setAlpha(0.0f);
                    be1Var3.G();
                    be1Var3.E0 = true;
                    org.telegram.ui.Components.voip.t1.U = true;
                    if (org.telegram.ui.Components.voip.t1.W == null) {
                        be1Var3.L0.d();
                        org.telegram.messenger.i0.h3(new md1(be1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.t1.V.getClass();
                        throw null;
                    }
                } else {
                    be1Var3.F0 = 1.0f;
                    be1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && mf.b.a(activity) == 1) {
                    be1 be1Var4 = f36195n1;
                    jf.e eVar2 = new jf.e(activity, be1Var4);
                    eVar2.f9854c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.y1 y1Var3 = be1Var4.f36203c0;
                    eVar2.f9858j = y1Var3.d;
                    eVar2.f9859k = y1Var3.getPlaceholderView();
                    be1Var4.f36212g0 = eVar2.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            md1 md1Var = this.S0;
            org.telegram.messenger.i0.r(md1Var);
            this.R0 = false;
            if (this.f36242z0 && this.f36239x0) {
                org.telegram.messenger.i0.h3(md1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String L0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f36237w0.isTouchExplorationEnabled()) {
                if (!this.f36225n0) {
                    L0 = org.telegram.messenger.cd.L0(2131754732, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131754733, null);
                }
                this.f36231s.announceForAccessibility(L0);
            }
            if (!this.f36225n0) {
                if (this.f36226o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f36234u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f36209f.getLocationOnScreen(iArr);
                    ud1 ud1Var = new ud1(this, this.f36231s.getContext(), iArr[0], iArr[1]);
                    this.f36226o0 = ud1Var;
                    WindowInsets windowInsets = this.f36230r0;
                    if (windowInsets != null) {
                        ud1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f36231s.addView(this.f36226o0);
                    return;
                }
                return;
            }
            this.f36205d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f36228q0 = this.f36227p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new kg.g0(5).setDuration(250L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
                transitionSet.addTransition(duration.setInterpolator(grVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(grVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.b2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.r2.class, true);
                TransitionManager.beginDelayedTransition(this.f36218j0, transitionSet);
            }
            int i10 = this.f36227p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f36209f.setVisibility(8);
                this.h.setVisibility(8);
                this.f36224n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f36195n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f36225n0 || this.m0)) {
                    p(this.e, sharedInstance);
                    if (this.f36239x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f36209f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f36224n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.cd.L0(2131743437, null), false, z10);
                this.f36224n.setOnClickListener(new nd1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f36225n0 || this.m0)) {
                        p(this.e, sharedInstance);
                        if (this.f36239x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f36209f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f36209f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f36224n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f31640f = 0;
                i11 = 16;
            }
            if (this.f36209f.getVisibility() == 0) {
                this.f36209f.f31640f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f31640f = i11;
                i11 += 16;
            }
            if (this.f36224n.getVisibility() == 0) {
                this.f36224n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.be1.D(boolean):void");
    }

    public final void E() {
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i10 = 2131230916;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i10 = 2131230924;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i10 = 2131230920;
        } else {
            i10 = 2131230921;
        }
        if (this.J != i10) {
            org.telegram.messenger.i0.Q3(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void F() {
        this.f36220k0.setColor(i0.b.o(-16777216, (int) (this.f36241y0 * 102.0f * this.F0)));
        this.f36222l0.setColor(i0.b.o(-16777216, (int) (127.5f * this.F0)));
        wd1 wd1Var = this.f36231s;
        if (wd1Var != null) {
            wd1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.be1.G():void");
    }

    public final ValueAnimator b(boolean z10) {
        char c10;
        float f7;
        float measuredWidth;
        final float measuredHeight;
        final float f10;
        final boolean z11;
        final float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z12;
        float f18;
        this.Y.animate().cancel();
        float f19 = org.telegram.ui.Components.voip.t1.d().d.x + org.telegram.ui.Components.voip.t1.d().E;
        float f20 = org.telegram.ui.Components.voip.t1.d().d.y + org.telegram.ui.Components.voip.t1.d().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.t1.V.getClass();
        final float measuredWidth2 = f19 - ((this.f36203c0.getMeasuredWidth() - (this.f36203c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f36203c0.getMeasuredHeight() - (this.f36203c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f36225n0 && measuredWidth3 != 0) {
                f18 = (this.f36234u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.t1.d().f31669f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.t1.d().f31669f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                f17 = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.t1.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.t1.d().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                z12 = true;
            } else {
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = 1.0f;
                f17 = 1.0f;
                z12 = false;
                f18 = 0.0f;
            }
            measuredHeight = f17;
            z11 = z12;
            f10 = f18;
        } else {
            c10 = 0;
            f7 = 4.0f;
            measuredWidth = f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = 0.25f;
            z11 = true;
        }
        final float f22 = measuredWidth;
        if (this.m0) {
            f11 = org.telegram.messenger.i0.L(f7);
        } else {
            f11 = 0.0f;
        }
        final float L = (org.telegram.messenger.i0.L(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.t1.V.getClass();
            f12 = 1.0f;
            f21 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f23 = f12;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f22);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(L);
                this.Y.setAlpha(f21);
            }
            this.f36203c0.setScaleX(0.25f);
            this.f36203c0.setScaleY(0.25f);
            this.f36203c0.setTranslationX(measuredWidth2);
            this.f36203c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f36203c0.setRoundCorners((org.telegram.messenger.i0.L(6.0f) * f23) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        if (z10) {
            f14 = f23;
        } else {
            f14 = 0.0f;
        }
        if (z10) {
            f15 = 0.0f;
        } else {
            f15 = f23;
        }
        float[] fArr = new float[2];
        fArr[c10] = f14;
        fArr[1] = f15;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f23;
        }
        this.F0 = f16;
        F();
        final float f24 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f25 = 1.0f - floatValue;
                be1 be1Var = be1.this;
                be1Var.F0 = f25;
                be1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    be1Var.Y.setScaleX(f26);
                    be1Var.Y.setScaleY(f26);
                    be1Var.Y.setTranslationX((f22 * floatValue) + (x10 * f25));
                    be1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    be1Var.Y.setCornerRadius((L * floatValue) + (f11 * f25));
                    be1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                be1Var.f36203c0.setScaleX(f27);
                be1Var.f36203c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                be1Var.f36203c0.setTranslationX(f29);
                be1Var.f36203c0.setTranslationY(f30);
                be1Var.f36203c0.setRoundCorners(((org.telegram.messenger.i0.L(4.0f) * floatValue) * 1.0f) / f27);
                if (!be1Var.Y.P) {
                    be1Var.f36205d0.d(false, floatValue);
                }
                be1Var.f36234u0.invalidate();
            }
        });
        return ofFloat;
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        org.telegram.ui.Components.voip.y1 y1Var = this.f36203c0;
        if (y1Var != null) {
            y1Var.d.clearFirstFrame();
        }
        this.f36223m1 = true;
        G();
        try {
            ((WindowManager) this.f36199b.getSystemService("window")).removeView(this.f36234u0);
        } catch (IllegalArgumentException e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f36234u0.invalidate();
    }

    public final void d() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.f(this.f36196a).n(this, org.telegram.messenger.zs.M4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.E2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.G5);
        jf.f fVar = this.f36212g0;
        if (fVar != null) {
            fVar.c();
            this.f36212g0 = null;
        }
        mg.i2 i2Var = this.M;
        if (i2Var != null) {
            i2Var.dismiss();
            this.M = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.M4) {
            if (this.f36227p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f36205d0.d.release();
                this.f36203c0.d.release();
                this.f36200b0.release();
                h();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            D(true);
        } else if (i10 == org.telegram.messenger.zs.E2) {
            this.f36234u0.b();
        } else if (i10 == org.telegram.messenger.zs.O4) {
            this.D.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == org.telegram.messenger.zs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f36210f0 = booleanValue;
            if (booleanValue) {
                this.D.b(true, true);
            }
        }
    }

    public final void e(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f36239x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.f2 f2Var = this.f36238x;
            if (f2Var.K && z10 != f2Var.E) {
                f2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                f2Var.f31425c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.e2(f2Var, 1));
                f2Var.f31425c.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                f2Var.f31425c.setDuration(200L);
                f2Var.f31425c.start();
            }
            if (z10) {
                int i10 = org.telegram.messenger.tz.f18146f1;
                if (i10 < 2) {
                    org.telegram.messenger.tz.f18146f1 = i10 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.tz.f18146f1);
                    edit.apply();
                }
                this.O0.e(true);
                org.telegram.messenger.i0.r(this.S0);
                this.R0 = false;
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(0L).translationY(org.telegram.messenger.i0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.f26496g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.i0.L(140.0f));
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
                org.telegram.messenger.z20.m(translationY, grVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-org.telegram.messenger.i0.L(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new qd1(this, 3)).setInterpolator(grVar).start();
            } else {
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f26495f;
                duration.setInterpolator(grVar2).setListener(new eg.m(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.i0.L(120.0f)).setListener(new qd1(this, 4)).setDuration(250L).setInterpolator(grVar2).start();
            }
            this.f36228q0 = this.f36227p0;
            G();
        }
    }

    public final void f() {
        this.f36234u0.b();
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        td1 td1Var = this.f36234u0;
        td1Var.getClass();
        ((WindowManager) this.f36199b.getSystemService("window")).addView(td1Var, org.telegram.ui.Components.voip.c2.a());
        this.f36223m1 = false;
        G();
        this.f36234u0.invalidate();
        org.telegram.ui.Components.voip.y1 y1Var = this.f36221k1;
        if (y1Var != null) {
            y1Var.d.release();
            this.f36221k1 = null;
        }
    }

    public final void h() {
        this.f36205d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new rd1(this));
        this.f36203c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new sd1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f36200b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final Bitmap i() {
        org.telegram.ui.Components.voip.y1 y1Var = this.f36221k1;
        if (y1Var != null && y1Var.d.isAvailable()) {
            return this.f36221k1.d.getBitmap();
        }
        return null;
    }

    public final void j() {
        if (!this.G0 && !this.E0) {
            ud1 ud1Var = this.f36226o0;
            if (ud1Var != null) {
                ud1Var.a(false, false);
            } else if (this.m0 && this.f36225n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f36197a0 = false;
                this.f36228q0 = this.f36227p0;
                G();
            } else if (this.C0) {
                e(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (mf.b.a(this.f36199b) > 0) {
                        if (!this.G0 && f36195n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f36195n1.f36234u0.getMeasuredHeight();
                                be1 be1Var = f36195n1;
                                org.telegram.ui.Components.voip.t1.e(be1Var.f36199b, be1Var.f36196a, be1Var.f36234u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f36195n1.f36230r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.t1.X = windowInsets.getSystemWindowInsetTop();
                                    f36195n1.f36230r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.t1.d() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
                                duration.setInterpolator(grVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.f36218j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f36214h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f36216i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                org.telegram.ui.Components.voip.t1.U = true;
                                this.E0 = true;
                                ValueAnimator b10 = b(false);
                                this.L0.d();
                                b10.addListener(new qd1(this, 1));
                                b10.setDuration(350L);
                                b10.setInterpolator(grVar);
                                b10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.s4.A(this.f36199b, new kd1(this, 0), true).p();
                    return;
                }
                this.f36234u0.b();
            }
        }
    }

    @Override
    public final void l(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap m() {
        org.telegram.ui.Components.voip.y1 y1Var = this.f36203c0;
        if (y1Var != null && y1Var.d.isAvailable()) {
            return this.f36203c0.d.getBitmap();
        }
        return null;
    }

    public final void o(Runnable runnable) {
        if (this.f36209f.getVisibility() == 0) {
            this.f36207e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f36207e0;
            ValueAnimator valueAnimator = eVar.f31386b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31386b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f36224n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f36209f.animate().cancel();
        this.f36207e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f36207e0;
        ValueAnimator valueAnimator2 = eVar2.f31386b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31386b0 = null;
            eVar2.U.stop();
        }
        this.f36224n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.cd.L0(2131743437, null), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f36209f.d(3, true, false);
        this.f36224n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f36209f.setVisibility(0);
        this.f36224n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f36209f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36207e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.i0.L(52.0f);
        final int L = org.telegram.messenger.i0.L(24.0f);
        final int L2 = org.telegram.messenger.i0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                be1 be1Var = be1.this;
                be1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                be1Var.f36207e0.setTranslationY(L2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                be1Var.f36207e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f36207e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f36207e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f36207e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f36207e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.iw0(12, this, runnable));
        animatorSet.start();
        org.telegram.messenger.i0.h3(new md1(this, 7), 133L);
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f36228q0 = this.f36227p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f36228q0 = this.f36227p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f36212g0 == null && mf.b.a(this.f36199b) == 1) {
                jf.e eVar = new jf.e(this.f36199b, f36195n1);
                eVar.f9854c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.y1 y1Var = this.f36203c0;
                eVar.f9858j = y1Var.d;
                eVar.f9859k = y1Var.getPlaceholderView();
                this.f36212g0 = eVar.a();
            }
        } else {
            jf.f fVar = this.f36212g0;
            if (fVar != null) {
                fVar.c();
                this.f36212g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.j2 j2Var;
        if (i10 > 0) {
            this.f36219j1 = true;
        }
        if (this.F != null && (j2Var = this.f36236w) != null) {
            int i11 = j2Var.V;
            if ((i11 == 2 || i11 == 3) && this.f36219j1) {
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.qq(this, i10, 22), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f36227p0;
        if (i11 != i10) {
            this.f36228q0 = i11;
            this.f36227p0 = i10;
            if (this.f36234u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f36228q0 = this.f36227p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void p(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService) {
        if (!this.f36225n0) {
            r2Var.d(2, false, false);
            r2Var.setOnBtnClickedListener(null);
            r2Var.setEnabled(false);
            return;
        }
        r2Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            r2Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            r2Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        r2Var.setOnBtnClickedListener(new a7(this, voIPService, r2Var, 23));
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final View r() {
        org.telegram.ui.Components.voip.y1 y1Var = new org.telegram.ui.Components.voip.y1(this.f36199b, false, true, false, false);
        this.f36221k1 = y1Var;
        y1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f36221k1.d.setEnableHardwareScaler(true);
        this.f36221k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.y1 y1Var2 = this.f36221k1;
        y1Var2.f31768a0 = 1;
        y1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new vd1(this));
        View view = this.f36221k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f36221k1;
    }

    public final void s(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService, boolean z10) {
        r2Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.b1 b1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = b1Var.f31331f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            b1Var.K = f7;
            b1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = b1Var.f31331f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = b1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            b1Var.f31331f0 = ofFloat;
            ofFloat.addUpdateListener(b1Var.f31332g0);
            b1Var.f31331f0.setDuration(150L);
            b1Var.f31331f0.start();
        }
        r2Var.setOnBtnClickedListener(new kd1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            r2Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            r2Var.d(5, true, false);
        } else {
            r2Var.d(5, false, false);
            i10 = 1;
            r2Var.setEnabled(true);
            r2Var.setOnBtnClickedListener(new mg.i0(this, i10, r2Var, voIPService, 9));
        }
        i10 = i11;
        r2Var.setEnabled(true);
        r2Var.setOnBtnClickedListener(new mg.i0(this, i10, r2Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f36225n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f36225n0) {
                if (voIPService.isScreencast()) {
                    r2Var.d(3, false, z10);
                } else {
                    r2Var.d(3, false, z10);
                }
            } else {
                r2Var.d(3, true, z10);
            }
            r2Var.setOnBtnClickedListener(new kd1(this, 6));
            r2Var.setEnabled(true);
            return;
        }
        r2Var.d(3, true, false);
        r2Var.setOnClickListener(null);
        r2Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f36225n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.D.getTag() == null) {
                this.D.animate().setListener(null).cancel();
                this.D.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.D.setAlpha(0.0f);
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
                    } else {
                        this.D.setAlpha(0.0f);
                        this.D.setTranslationY(-org.telegram.messenger.i0.L(135.0f));
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
                    }
                } else if (z11) {
                    this.D.setAlpha(0.0f);
                    this.D.setTranslationY(org.telegram.messenger.i0.L(48.0f));
                    this.D.setScaleX(0.1f);
                    this.D.setScaleY(0.1f);
                }
            } else if (!z12 && this.D.getTag() != null) {
                this.D.animate().setListener(null).cancel();
                this.D.setTranslationY(0.0f);
                this.D.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.gr.f26495f).setListener(new qd1(this, 8)).start();
            }
        } else {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.setAlpha(1.0f);
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            org.telegram.ui.Components.voip.b0 b0Var = this.D;
            if (!z12) {
                i10 = 8;
            }
            b0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.b0 b0Var2 = this.D;
        if (z12) {
            num = 1;
        }
        b0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f36199b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(0, this.f36199b, null);
        boolean[] zArr = new boolean[3];
        x1Var.R = org.telegram.messenger.cd.L0(2131743434, null);
        x1Var.T = charSequence;
        x1Var.f21496n0 = org.telegram.messenger.cd.L0(2131747847, null);
        x1Var.f21497o0 = null;
        x1Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) x1Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, x1Var.f21493k1);
            }
        }
        x1Var.setCanceledOnTouchOutside(true);
        x1Var.setOnDismissListener(new q5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f36239x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        boolean z13 = true;
        if (i10 == 0) {
            if (z10) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.b1 b1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(b1Var, View.ALPHA, b1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.b1 b1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var2, View.SCALE_X, b1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.b1 b1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(b1Var3, View.SCALE_Y, b1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new qd1(this, 7));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                this.Y.setVisibility(8);
            }
        } else {
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z10) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                    if (this.Y.getVisibility() == 8) {
                        this.Y.setAlpha(0.0f);
                        this.Y.setScaleX(0.7f);
                        this.Y.setScaleY(0.7f);
                        this.Y.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.A0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.7f, 1.0f));
                    this.A0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.Y.setVisibility(0);
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.b1 b1Var4 = this.Y;
                if (b1Var4.D < 0.0f) {
                    b1Var4.d(1.0f, 1.0f);
                    this.f36197a0 = true;
                }
            }
            org.telegram.ui.Components.voip.b1 b1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            b1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f36197a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u01 u01Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f36239x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
            duration.setInterpolator(grVar).start();
            this.H.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.N.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar).start();
            this.f36218j0.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.f36214h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f36216i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36241y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(u01Var);
            this.P0.setDuration(150L).setInterpolator(grVar);
            this.P0.start();
            org.telegram.messenger.i0.r(this.S0);
            this.R0 = false;
            this.f36218j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f36239x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f26495f;
                translationY.setInterpolator(grVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(grVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f36218j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f36214h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f36216i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f36241y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(u01Var);
                this.P0.setDuration(150L).setInterpolator(grVar2);
                this.P0.start();
                this.f36218j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f36239x0 = z10;
        td1 td1Var = this.f36234u0;
        if (!z10) {
            td1Var.setSystemUiVisibility(td1Var.getSystemUiVisibility() | 4);
        } else {
            td1Var.setSystemUiVisibility(td1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -org.telegram.messenger.i0.L(16.0f);
        if (this.f36239x0) {
            i11 = org.telegram.messenger.i0.L(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
    }

    @Override
    public final void n(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

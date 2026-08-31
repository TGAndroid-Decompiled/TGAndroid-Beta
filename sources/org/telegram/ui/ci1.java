package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
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
public final class ci1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, ef.a {
    public static ci1 f35817k1;
    public boolean A0;
    public TextView B;
    public boolean B0;
    public org.telegram.ui.Components.voip.q2 C;
    public float C0;
    public bi1 D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public ImageView F;
    public boolean F0;
    public int G;
    public boolean G0;
    public org.telegram.ui.Components.ge H;
    public long H0;
    public int I;
    public hg.v2 J;
    public org.telegram.ui.Components.voip.i2 J0;
    public ib1 K;
    public org.telegram.ui.Components.voip.e3 K0;
    public FrameLayout L;
    public org.telegram.ui.Components.voip.e3 L0;
    public org.telegram.ui.Components.voip.p0 M;
    public ValueAnimator M0;
    public org.telegram.ui.Components.voip.m1 N;
    public eg.i0 O;
    public boolean O0;
    public TextView P;
    public pk Q;
    public org.telegram.ui.Components.voip.k R;
    public boolean R0;
    public float S0;
    public float T0;
    public yh1 U;
    public float U0;
    public org.telegram.ui.Components.voip.t1 V;
    public float V0;
    public org.telegram.ui.Components.voip.t1 W;
    public float W0;
    public boolean X;
    public boolean X0;
    public TextureViewRenderer Y;
    public float Y0;
    public org.telegram.ui.Components.voip.t2 Z;
    public float Z0;
    public final int f35818a;
    public org.telegram.ui.Components.voip.t2 f35819a0;
    public int f35820a1;
    public Activity f35821b;
    public org.telegram.ui.Components.voip.e f35822b0;
    public int f35823b1;
    public final TLRPC.User f35824c;
    public boolean f35825c0;
    public final TLRPC.User d;
    public cf.f f35827d0;
    public boolean f35828d1;
    public org.telegram.ui.Components.voip.l3 f35829e;
    public View f35830e0;
    public boolean f35831e1;
    public org.telegram.ui.Components.voip.l3 f35832f;
    public View f35833f0;
    public ValueAnimator f35834f1;
    public org.telegram.ui.Components.voip.p1 f35835g0;
    public boolean f35836g1;
    public org.telegram.ui.Components.voip.l3 h;
    public org.telegram.ui.Components.voip.t2 f35838h1;
    public c2.p f35840i1;
    public boolean f35841j0;
    public boolean f35842j1;
    public boolean f35843k0;
    public vh1 f35844l0;
    public int m0;
    public zh1 f35845n;
    public int f35846n0;
    public WindowInsets f35847o0;
    public boolean f35848p0;
    public float f35849q0;
    public uh1 f35851r0;
    public xh1 f35852s;
    public int f35853s0;
    public AccessibilityManager f35854t0;
    public org.telegram.ui.Components.voip.d3 v;
    public org.telegram.ui.Components.voip.a3 f35857w;
    public boolean f35858w0;
    public org.telegram.ui.Components.voip.f3 f35859x;
    public AnimatorSet f35860x0;
    public org.telegram.ui.Components.voip.r0 f35861y;
    public boolean f35862y0;
    public boolean f35863z0;
    public final org.telegram.ui.Components.voip.o1 f35850r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.p9[] S = new org.telegram.ui.Components.p9[4];
    public final Drawable[] T = new Drawable[4];
    public final Paint f35837h0 = new Paint();
    public final Paint f35839i0 = new Paint();
    public boolean f35855u0 = true;
    public float f35856v0 = 1.0f;
    public final AnimationNotificationsLocker I0 = new AnimationNotificationsLocker();
    public final j11 N0 = new j11(this, 20);
    public final mh1 P0 = new mh1(this, 12);
    public final mh1 Q0 = new mh1(this, 13);
    public float f35826c1 = 1.0f;

    public ci1(int i10) {
        this.f35818a = i10;
        this.f35824c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f35846n0 = -1;
        this.m0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(ci1 ci1Var) {
        AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
        ci1Var.O0 = false;
        if (Build.VERSION.SDK_INT >= 23 && ci1Var.f35821b.checkSelfPermission("android.permission.CAMERA") != 0) {
            ci1Var.f35821b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            ci1Var.C();
        }
    }

    public static void j(ci1 ci1Var) {
        ci1 ci1Var2;
        if (ci1Var.f35828d1) {
            ci1Var.f35828d1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ci1Var.f35834f1 = ofFloat;
            ci1Var2 = ci1Var;
            ofFloat.addUpdateListener(new gg.c(ci1Var2, ci1Var.f35826c1, ci1Var.V0, ci1Var.W0, 2));
            ci1Var2.f35834f1.addListener(new qh1(ci1Var2, 0));
            ci1Var2.f35834f1.setDuration(350L);
            ci1Var2.f35834f1.setInterpolator(org.telegram.ui.Components.pr.f30183f);
            ci1Var2.f35834f1.start();
        } else {
            ci1Var2 = ci1Var;
        }
        ci1Var2.f35831e1 = false;
        ci1Var2.X0 = false;
    }

    public static void q(int i10, int[] iArr) {
        ci1 ci1Var = f35817k1;
        if (ci1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ci1Var.f35851r0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ci1Var.r(new sj0(7));
                } else if (!ci1Var.f35821b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.i(ci1Var.f35821b, new mh1(ci1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ci1Var.f35851r0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ci1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        boolean z4;
        boolean z10;
        int i11;
        boolean z11;
        int size;
        int size2;
        float f10;
        ci1 ci1Var = f35817k1;
        if (ci1Var != null && ci1Var.f35851r0.getParent() == null) {
            ci1 ci1Var2 = f35817k1;
            if (ci1Var2 != null) {
                ci1Var2.Z.d.release();
                f35817k1.f35819a0.d.release();
                f35817k1.Y.release();
                uh1 uh1Var = f35817k1.f35851r0;
                if (uh1Var != null) {
                    uh1Var.d();
                }
                f35817k1.l();
            }
            f35817k1 = null;
        }
        if (f35817k1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ci1 ci1Var3 = new ci1(i10);
                ci1Var3.f35821b = activity;
                f35817k1 = ci1Var3;
                uh1 uh1Var2 = new uh1(activity, !z4, ci1Var3);
                f35817k1.G0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f35817k1.getClass();
                uh1Var2.setLockOnScreen(f35817k1.G0);
                ci1Var3.f35851r0 = uh1Var2;
                kh1 kh1Var = new kh1(ci1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f46438a;
                r0.b0.j(uh1Var2, kh1Var);
                ((WindowManager) activity.getSystemService("window")).addView(uh1Var2, org.telegram.ui.Components.voip.x2.a());
                ci1Var3.f35849q0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ci1Var3.f35854t0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                xh1 xh1Var = new xh1(ci1Var3, activity);
                xh1Var.setClipToPadding(false);
                xh1Var.setClipChildren(false);
                xh1Var.setBackgroundColor(-16777216);
                ci1Var3.G();
                ci1Var3.f35852s = xh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = ci1Var3.f35850r;
                ci1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z10, o1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                ci1Var3.Z = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                ci1Var3.Z.d.setEnableHardwareScaler(true);
                ci1Var3.Z.d.setRotateTextureWithScreen(true);
                ci1Var3.Z.U = 1;
                xh1Var.addView(ci1Var3.v, k7.c6.c(-1.0f, -1));
                TLRPC.User user = ci1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, o1Var);
                ci1Var3.f35857w = a3Var;
                xh1Var.addView(a3Var, k7.c6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.k6.f21598a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f32039a = new org.telegram.ui.Components.cw0(0);
                    }
                }
                ci1Var3.f35859x = view;
                xh1Var.addView((View) view, k7.c6.c(220.0f, -1));
                xh1Var.addView(ci1Var3.Z);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Cells.f1.t(0.5f, 1), new mc1(ci1Var3, 1), 0L);
                org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
                ci1Var3.V = t1Var;
                t1Var.setDelegate(new kh1(ci1Var3, 3));
                ci1Var3.V.d(1.0f, 1.0f);
                ci1Var3.X = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                ci1Var3.f35819a0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                ci1Var3.f35819a0.d.setUseCameraRotation(true);
                ci1Var3.V.setOnTapListener(new nh1(ci1Var3, 1));
                ci1Var3.f35819a0.d.setMirror(true);
                ci1Var3.V.addView(ci1Var3.f35819a0);
                org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
                ci1Var3.W = t1Var2;
                t1Var2.P = true;
                t1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ci1Var3.Y = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ci1Var3.Y.setIsCamera(false);
                ci1Var3.Y.setFpsReduction(30.0f);
                ci1Var3.Y.setScalingType(scalingType);
                ci1Var3.W.addView(ci1Var3.Y, k7.c6.e(-1, -2, 17));
                ci1Var3.W.setOnTapListener(new nh1(ci1Var3, 2));
                ci1Var3.W.setVisibility(8);
                xh1Var.addView(ci1Var3.V, k7.c6.c(-2.0f, -2));
                xh1Var.addView(ci1Var3.W);
                View view2 = new View(activity);
                ci1Var3.f35830e0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                xh1Var.addView(ci1Var3.f35830e0, k7.c6.e(-1, 160, 80));
                View view3 = new View(activity);
                ci1Var3.f35833f0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                xh1Var.addView(ci1Var3.f35833f0, k7.c6.e(-1, 160, 48));
                ib1 ib1Var = new ib1(ci1Var3, activity, 17);
                ci1Var3.K = ib1Var;
                ib1Var.setOrientation(0);
                ci1Var3.K.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ci1Var3.K.setClipToPadding(false);
                ci1Var3.K.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ci1Var3.K.setOnClickListener(new nh1(ci1Var3, 3));
                ci1Var3.M = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ci1Var3.L = frameLayout;
                frameLayout.addView(ci1Var3.M, k7.c6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ci1Var3.L.setVisibility(8);
                ci1Var3.L.setOnClickListener(new nh1(ci1Var3, 4));
                eg.i0 i0Var = new eg.i0(activity, o1Var);
                ci1Var3.O = i0Var;
                i0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ci1Var3.P = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ci1Var3.P.setTextSize(1, 15.0f);
                ci1Var3.P.setTypeface(AndroidUtilities.bold());
                ci1Var3.P.setTextColor(-1);
                ci1Var3.P.setGravity(17);
                pk pkVar = new pk(ci1Var3, activity, 5);
                ci1Var3.Q = pkVar;
                pkVar.setTextSize(1, 15.0f);
                ci1Var3.Q.setTextColor(-1);
                ci1Var3.Q.setGravity(17);
                ci1Var3.Q.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ci1Var3.Q.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ci1Var3.O.setVisibility(8);
                ci1Var3.O.addView(ci1Var3.P);
                ci1Var3.O.addView(ci1Var3.Q, k7.c6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ci1Var3.O.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                    org.telegram.ui.Components.p9[] p9VarArr = ci1Var3.S;
                    p9VarArr[i15] = p9Var;
                    p9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ib1 ib1Var2 = ci1Var3.K;
                    org.telegram.ui.Components.p9 p9Var2 = p9VarArr[i15];
                    if (i15 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    ib1Var2.addView(p9Var2, k7.c6.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                yh1 yh1Var = new yh1(ci1Var3, activity);
                ci1Var3.U = yh1Var;
                yh1Var.setOrientation(1);
                ci1Var3.U.setFocusable(true);
                ci1Var3.U.setFocusableInTouchMode(true);
                ci1Var3.f35861y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = ci1Var3.f35861y;
                int i16 = ci1Var3.f35818a;
                r0Var.f32299b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, z8Var, user);
                ci1Var3.f35861y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ci1Var3.B = textView2;
                textView2.setTextSize(1, 28.0f);
                ci1Var3.B.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ci1Var3.B.getPaint().getFontMetricsInt(), false));
                ci1Var3.B.setMaxLines(2);
                ci1Var3.B.setEllipsize(TextUtils.TruncateAt.END);
                ci1Var3.B.setTextColor(-1);
                ci1Var3.B.setGravity(1);
                ci1Var3.B.setImportantForAccessibility(2);
                ci1Var3.U.addView(ci1Var3.B, k7.c6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f32291a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f32291a[i17] = new TextView(activity);
                    frameLayout2.f32291a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f32291a[i17].setTextColor(-1);
                    frameLayout2.f32291a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f32291a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f32293c = frameLayout3;
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(frameLayout2, activity, o1Var);
                o2Var.setTextSize(1, 15.0f);
                o2Var.setTextColor(-1);
                o2Var.setGravity(1);
                o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(o2Var, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, k7.c6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f32292b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, k7.c6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new org.telegram.ui.Components.a0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
                frameLayout2.d = u2Var;
                frameLayout2.addView(u2Var, k7.c6.c(-2.0f, -1));
                ci1Var3.C = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f46438a;
                frameLayout2.setImportantForAccessibility(4);
                ci1Var3.U.addView(ci1Var3.C, k7.c6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    bi1 bi1Var = new bi1(activity);
                    ci1Var3.D = bi1Var;
                    long j10 = sharedState.getUser().f20990id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        bi1Var.setVisibility(8);
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
                        org.telegram.ui.Components.c9 c9Var = bi1Var.f35533b;
                        c9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            c9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        c9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            bi1Var.setVisibility(8);
                        } else {
                            bi1Var.f35534c = new org.telegram.ui.Components.l01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            bi1Var.setVisibility(0);
                            bi1Var.invalidate();
                        }
                    }
                    ci1Var3.U.addView(ci1Var3.D, k7.c6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ci1Var3.U.setClipChildren(false);
                ci1Var3.U.setClipToPadding(false);
                ci1Var3.U.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ci1Var3.R = new org.telegram.ui.Components.voip.k(activity);
                ci1Var3.N = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                ci1Var3.R.setAlpha(0.0f);
                ci1Var3.N.setVisibility(8);
                xh1Var.addView(ci1Var3.f35861y, k7.c6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.U, k7.c6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.L, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.O, k7.c6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.K, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.R, k7.c6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                xh1Var.addView(ci1Var3.N, k7.c6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ci1Var3.f35835g0 = new org.telegram.ui.Components.voip.p1(activity);
                ci1Var3.f35829e = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ci1Var3.f35832f = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ci1Var3.h = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ci1Var3.f35845n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                ci1Var3.f35829e.setTranslationY(AndroidUtilities.dp(100.0f));
                ci1Var3.f35829e.setScaleX(0.0f);
                ci1Var3.f35829e.setScaleY(0.0f);
                ci1Var3.f35829e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ci1Var3.f35832f.setTranslationY(AndroidUtilities.dp(100.0f));
                ci1Var3.f35832f.setScaleX(0.0f);
                ci1Var3.f35832f.setScaleY(0.0f);
                ci1Var3.f35832f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ci1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ci1Var3.h.setScaleX(0.0f);
                ci1Var3.h.setScaleY(0.0f);
                ci1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ci1Var3.f35845n.setTranslationY(AndroidUtilities.dp(100.0f));
                ci1Var3.f35845n.setScaleX(0.0f);
                ci1Var3.f35845n.setScaleY(0.0f);
                ci1Var3.f35845n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ci1Var3.f35835g0.addView(ci1Var3.f35829e);
                ci1Var3.f35835g0.addView(ci1Var3.f35832f);
                ci1Var3.f35835g0.addView(ci1Var3.h);
                ci1Var3.f35835g0.addView(ci1Var3.f35845n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ci1Var3.f35822b0 = eVar;
                eVar.setListener(new ai1(ci1Var3));
                ci1Var3.f35822b0.setScaleX(1.15f);
                ci1Var3.f35822b0.setScaleY(1.15f);
                xh1Var.addView(ci1Var3.f35835g0, k7.c6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f11 = i11;
                xh1Var.addView(ci1Var3.f35822b0, k7.c6.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                ci1Var3.F = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ci1Var3.F.setImageResource(R.drawable.msg_addcontact);
                ci1Var3.F.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                xh1Var.addView(ci1Var3.F, k7.c6.e(56, 56, 53));
                k7.e6.a(ci1Var3.F);
                ImageView imageView2 = new ImageView(activity);
                ci1Var3.E = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ci1Var3.E.setImageResource(R.drawable.msg_call_minimize_shadow);
                ci1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ci1Var3.E.setContentDescription(LocaleController.getString(R.string.Back));
                xh1Var.addView(ci1Var3.E, k7.c6.e(56, 56, 51));
                k7.e6.a(ci1Var3.E);
                org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
                ci1Var3.H = geVar;
                geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ci1Var3.H.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ci1Var3.H.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                xh1Var.addView(ci1Var3.H, k7.c6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ci1Var3.H.setAlpha(0.0f);
                ci1Var3.H.setOnClickListener(new nh1(ci1Var3, 5));
                ci1Var3.E.setOnClickListener(new nh1(ci1Var3, 6));
                ci1Var3.F.setOnClickListener(new hb0(25, ci1Var3, activity));
                if (ci1Var3.f35851r0.f32465b) {
                    ci1Var3.E.setVisibility(8);
                    ci1Var3.F.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f32092a = new HashMap();
                linearLayout.f32093b = new ArrayList();
                linearLayout.f32094c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f32098r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f32097n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new fg.j0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ci1Var3.J0 = linearLayout;
                linearLayout.setGravity(80);
                ci1Var3.J0.setOnViewsUpdated(new mh1(ci1Var3, 5));
                xh1Var.addView(ci1Var3.J0, k7.c6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, o1Var, true);
                e3Var.q(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.H = alignment;
                e3Var.d = -1L;
                e3Var.f45298i0 = new mh1(ci1Var3, 6);
                e3Var.Q = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.f45292e = true;
                e3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.r(8.0f);
                ci1Var3.K0 = e3Var;
                e3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
                xh1Var.addView(ci1Var3.K0, k7.c6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, o1Var, false);
                e3Var2.q(true);
                e3Var2.H = alignment;
                e3Var2.d = 4000L;
                e3Var2.Q = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.f45292e = true;
                e3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.r(8.0f);
                ci1Var3.L0 = e3Var2;
                e3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
                xh1Var.addView(ci1Var3.L0, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ci1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ci1Var3.R0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ci1Var3.R0 = z11;
                    }
                    ci1Var3.o();
                }
                uh1Var2.addView(xh1Var);
                if (z4) {
                    ci1Var3.C0 = 0.0f;
                    ci1Var3.F0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ci1Var3.Z.setStub(org.telegram.ui.Components.voip.n2.k().f32207r);
                        ci1Var3.f35819a0.setStub(org.telegram.ui.Components.voip.n2.k().f32206n);
                    }
                    ci1Var3.f35851r0.setAlpha(0.0f);
                    ci1Var3.H();
                    ci1Var3.B0 = true;
                    org.telegram.ui.Components.voip.n2.Q = true;
                    if (org.telegram.ui.Components.voip.n2.S == null) {
                        ci1Var3.I0.lock();
                        AndroidUtilities.runOnUIThread(new mh1(ci1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.R.getClass();
                        throw null;
                    }
                } else {
                    ci1Var3.C0 = 1.0f;
                    ci1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ff.d.a(activity) == 1) {
                    ci1 ci1Var4 = f35817k1;
                    cf.e eVar2 = new cf.e(activity, ci1Var4);
                    eVar2.f2482c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = ci1Var4.Z;
                    eVar2.f2487j = t2Var3.d;
                    eVar2.f2488k = t2Var3.getPlaceholderView();
                    ci1Var4.f35827d0 = eVar2.a();
                }
            }
        }
    }

    public final void A(boolean z4) {
        int i10;
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        j11 j11Var = this.N0;
        int i11 = 0;
        if (!z4 && this.f35855u0) {
            ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
            duration.setInterpolator(prVar).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.F.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar).start();
            this.C.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar).start();
            this.f35835g0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.f35830e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
            this.f35833f0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35856v0, 0.0f);
            this.M0 = ofFloat;
            ofFloat.addUpdateListener(j11Var);
            this.M0.setDuration(150L).setInterpolator(prVar);
            this.M0.start();
            AndroidUtilities.cancelRunOnUIThread(this.P0);
            this.O0 = false;
            this.f35835g0.setEnabled(false);
            this.L0.e(true);
            i10 = 150;
        } else {
            if (z4 && !this.f35855u0) {
                this.K0.e(true);
                this.L0.e(true);
                ViewPropertyAnimator translationY = this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f30183f;
                translationY.setInterpolator(prVar2).start();
                this.C.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(prVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f35835g0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f35830e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f35833f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f35856v0, 1.0f);
                this.M0 = ofFloat2;
                ofFloat2.addUpdateListener(j11Var);
                this.M0.setDuration(150L).setInterpolator(prVar2);
                this.M0.start();
                this.f35835g0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f35855u0 = z4;
        uh1 uh1Var = this.f35851r0;
        if (!z4) {
            uh1Var.setSystemUiVisibility(uh1Var.getSystemUiVisibility() | 4);
        } else {
            uh1Var.setSystemUiVisibility(uh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.J0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f35855u0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            mh1 mh1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(mh1Var);
            this.O0 = false;
            if (this.f35858w0 && this.f35855u0) {
                AndroidUtilities.runOnUIThread(mh1Var, 3000L);
                this.O0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f35854t0.isTouchExplorationEnabled()) {
                if (!this.f35843k0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f35852s.announceForAccessibility(string);
            }
            if (!this.f35843k0) {
                if (this.f35844l0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f35851r0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f35832f.getLocationOnScreen(iArr);
                    vh1 vh1Var = new vh1(this, this.f35852s.getContext(), iArr[0], iArr[1]);
                    this.f35844l0 = vh1Var;
                    WindowInsets windowInsets = this.f35847o0;
                    if (windowInsets != null) {
                        vh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f35852s.addView(this.f35844l0);
                    return;
                }
                return;
            }
            this.f35819a0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f35846n0 = this.m0;
            H();
        }
    }

    public final void D(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z4) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new fg.j0(5).setDuration(250L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
                transitionSet.addTransition(duration.setInterpolator(prVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(prVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f35835g0, transitionSet);
            }
            int i10 = this.m0;
            if (i10 == 11) {
                this.f35829e.setVisibility(8);
                this.f35832f.setVisibility(8);
                this.h.setVisibility(8);
                this.f35845n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f35817k1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f35843k0 || this.f35841j0)) {
                    s(this.f35829e, sharedInstance);
                    if (this.f35855u0) {
                        this.H.setTag(1);
                        this.H.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.f35829e, sharedInstance);
                    this.H.setTag(null);
                    this.H.animate().alpha(0.0f).start();
                }
                v(this.f35832f, sharedInstance, false);
                t(this.h, sharedInstance, z4);
                this.f35845n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z4);
                this.f35845n.setOnClickListener(new nh1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f35843k0 || this.f35841j0)) {
                        s(this.f35829e, sharedInstance);
                        if (this.f35855u0) {
                            this.H.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.f35829e, sharedInstance);
                        this.H.animate().alpha(0.0f).start();
                    }
                    v(this.f35832f, sharedInstance, false);
                    t(this.h, sharedInstance, z4);
                } else {
                    this.f35829e.setVisibility(8);
                    this.f35832f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f35845n.setVisibility(8);
            }
            if (this.f35829e.getVisibility() == 0) {
                this.f35829e.f32184f = 0;
                i11 = 16;
            }
            if (this.f35832f.getVisibility() == 0) {
                this.f35832f.f32184f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f32184f = i11;
                i11 += 16;
            }
            if (this.f35845n.getVisibility() == 0) {
                this.f35845n.C = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci1.E(boolean):void");
    }

    public final void F() {
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i10 = R.drawable.calls_bluetooth;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i10 = R.drawable.calls_speaker;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i10 = R.drawable.calls_menu_headset;
        } else {
            i10 = R.drawable.calls_menu_phone;
        }
        if (this.G != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.H, i10);
        } else {
            this.H.setImageResource(i10);
        }
        this.G = i10;
    }

    public final void G() {
        this.f35837h0.setColor(i0.a.k(-16777216, (int) (this.f35856v0 * 102.0f * this.C0)));
        this.f35839i0.setColor(i0.a.k(-16777216, (int) (127.5f * this.C0)));
        xh1 xh1Var = this.f35852s;
        if (xh1Var != null) {
            xh1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci1.H():void");
    }

    @Override
    public final void a(c2.p pVar) {
        this.f35840i1 = pVar;
        uh1 uh1Var = this.f35851r0;
        uh1Var.getClass();
        ((WindowManager) this.f35821b.getSystemService("window")).addView(uh1Var, org.telegram.ui.Components.voip.x2.a());
        this.f35842j1 = false;
        H();
        this.f35851r0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f35838h1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f35838h1 = null;
        }
    }

    @Override
    public final Bitmap b() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f35838h1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f35838h1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap d() {
        org.telegram.ui.Components.voip.t2 t2Var = this.Z;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.Z.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.m0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f35819a0.d.release();
                this.Z.d.release();
                this.Y.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f35851r0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f35861y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f35825c0 = booleanValue;
            if (booleanValue) {
                this.f35861y.b(true, true);
            }
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.f35840i1 = pVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f35842j1 = true;
        H();
        ((WindowManager) this.f35821b.getSystemService("window")).removeView(this.f35851r0);
        this.f35851r0.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f35821b, false, true, false, false);
        this.f35838h1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f35838h1.d.setEnableHardwareScaler(true);
        this.f35838h1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f35838h1;
        t2Var2.U = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new wh1(this));
        View view = this.f35838h1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f35838h1;
    }

    public final ValueAnimator k(boolean z4) {
        char c3;
        float measuredHeight;
        final float f10;
        final boolean z10;
        final float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.V.animate().cancel();
        float f18 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().f32211y;
        float f19 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().B;
        final float x10 = this.V.getX();
        final float y10 = this.V.getY();
        final float scaleX = this.V.getScaleX();
        org.telegram.ui.Components.voip.n2.R.getClass();
        final float measuredWidth = f18 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f19 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f20 = 1.0f;
        if (this.f35841j0) {
            int measuredWidth2 = this.V.getMeasuredWidth();
            if (this.f35843k0 && measuredWidth2 != 0) {
                f17 = (this.f35851r0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f16 = (((org.telegram.ui.Components.voip.n2.k().f32205f * 0.25f) + (f18 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().f32205f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f19 - ((this.V.getMeasuredHeight() - (this.V.getMeasuredHeight() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z10 = true;
            } else {
                c3 = 0;
                measuredHeight = 1.0f;
                z10 = false;
                f16 = 1.0f;
                f17 = 0.0f;
            }
            float f21 = f17;
            f10 = f16;
            f11 = f21;
        } else {
            c3 = 0;
            float measuredWidth3 = f18 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f19 - ((this.V.getMeasuredHeight() - (this.V.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = measuredWidth3;
            z10 = true;
            f11 = 0.25f;
        }
        final float f22 = measuredHeight;
        if (this.f35841j0) {
            f12 = AndroidUtilities.dp(4.0f);
        } else {
            f12 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.f35841j0) {
            org.telegram.ui.Components.voip.n2.R.getClass();
            f20 = 0.0f;
        }
        if (z4) {
            if (z10) {
                this.V.setScaleX(f11);
                this.V.setScaleY(f11);
                this.V.setTranslationX(f10);
                this.V.setTranslationY(f22);
                this.V.setCornerRadius(dp);
                this.V.setAlpha(f20);
            }
            this.Z.setScaleX(0.25f);
            this.Z.setScaleY(0.25f);
            this.Z.setTranslationX(measuredWidth);
            this.Z.setTranslationY(measuredHeight2);
            this.Z.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        if (z4) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (z4) {
            f14 = 0.0f;
        } else {
            f14 = 1.0f;
        }
        float[] fArr = new float[2];
        fArr[c3] = f13;
        fArr[1] = f14;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z4) {
            f15 = 0.0f;
        } else {
            f15 = 1.0f;
        }
        this.C0 = f15;
        G();
        final float f23 = f12;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                ci1 ci1Var = ci1.this;
                ci1Var.C0 = f24;
                ci1Var.G();
                if (z10) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    ci1Var.V.setScaleX(f25);
                    ci1Var.V.setScaleY(f25);
                    ci1Var.V.setTranslationX((f10 * floatValue) + (x10 * f24));
                    ci1Var.V.setTranslationY((f22 * floatValue) + (y10 * f24));
                    ci1Var.V.setCornerRadius((dp * floatValue) + (f23 * f24));
                    ci1Var.V.setAlpha((f20 * floatValue) + (1.0f * f24));
                }
                float f26 = (r12 * floatValue) + (1.0f * f24);
                ci1Var.Z.setScaleX(f26);
                ci1Var.Z.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                ci1Var.Z.setTranslationX(f28);
                ci1Var.Z.setTranslationY(f29);
                ci1Var.Z.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f26);
                if (!ci1Var.V.M) {
                    ci1Var.f35819a0.d(floatValue, false);
                }
                ci1Var.f35851r0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f35818a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        cf.f fVar = this.f35827d0;
        if (fVar != null) {
            fVar.c();
            this.f35827d0 = null;
        }
        hg.v2 v2Var = this.J;
        if (v2Var != null) {
            v2Var.dismiss();
            this.J = null;
        }
    }

    public final void m(boolean z4) {
        ValueAnimator ofFloat;
        if (this.f35862y0 && this.f35863z0 != z4 && this.f35855u0) {
            this.f35863z0 = z4;
            org.telegram.ui.Components.voip.a3 a3Var = this.f35857w;
            if (a3Var.H && z4 != a3Var.B) {
                a3Var.B = z4;
                float[] fArr = {1.0f, 0.0f};
                if (z4) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                a3Var.f31952c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f31952c.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                a3Var.f31952c.setDuration(200L);
                a3Var.f31952c.start();
            }
            if (z4) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.L0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.P0);
                this.O0 = false;
                if (this.f35861y.getVisibility() == 0) {
                    this.f35861y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
                }
                this.L.animate().setListener(null).cancel();
                this.L.setVisibility(0);
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.3f);
                this.L.setScaleY(0.3f);
                this.L.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.f30184g).start();
                ViewPropertyAnimator translationY = this.K.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
                b.p(translationY, prVar, 400L);
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.O.setScaleX(0.7f);
                this.O.setScaleY(0.7f);
                this.O.setAlpha(0.0f);
                this.O.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new qh1(this, 3)).setInterpolator(prVar).start();
            } else {
                if (this.f35861y.getVisibility() == 0) {
                    this.f35861y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
                }
                this.L.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f30183f;
                duration.setInterpolator(prVar2).setListener(new org.telegram.ui.Components.x20(this.L)).start();
                this.K.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar2).setDuration(280L).start();
                this.O.animate().setListener(null).cancel();
                this.O.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new qh1(this, 4)).setDuration(250L).setInterpolator(prVar2).start();
            }
            this.f35846n0 = this.m0;
            H();
        }
    }

    public final void n() {
        this.f35851r0.b();
    }

    public final void o() {
        this.f35819a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new rh1(this));
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new sh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.Y.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        this.f35846n0 = this.m0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f35846n0 = this.m0;
        if (i11 == 2 && !this.R0) {
            this.R0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f35827d0 == null && ff.d.a(this.f35821b) == 1) {
                cf.e eVar = new cf.e(this.f35821b, f35817k1);
                eVar.f2482c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.Z;
                eVar.f2487j = t2Var.d;
                eVar.f2488k = t2Var.getPlaceholderView();
                this.f35827d0 = eVar.a();
            }
        } else {
            cf.f fVar = this.f35827d0;
            if (fVar != null) {
                fVar.c();
                this.f35827d0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f35836g1 = true;
        }
        if (this.C != null && (d3Var = this.v) != null) {
            int i11 = d3Var.S;
            if ((i11 == 2 || i11 == 3) && this.f35836g1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jm(this, i10, 26), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.m0;
        if (i11 != i10) {
            this.f35846n0 = i11;
            this.m0 = i10;
            if (this.f35851r0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        this.f35846n0 = this.m0;
        if (z4 && !this.R0) {
            this.R0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.D0 && !this.B0) {
            vh1 vh1Var = this.f35844l0;
            if (vh1Var != null) {
                vh1Var.a(false, false);
            } else if (this.f35841j0 && this.f35843k0 && this.E0) {
                this.E0 = false;
                this.V.setRelativePosition(this.W);
                this.X = false;
                this.f35846n0 = this.m0;
                H();
            } else if (this.f35863z0) {
                m(false);
            } else if (this.O.getVisibility() == 8) {
                if (this.A0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (ff.d.a(this.f35821b) > 0) {
                        if (!this.D0 && f35817k1 != null) {
                            this.D0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f35817k1.f35851r0.getMeasuredHeight();
                                ci1 ci1Var = f35817k1;
                                org.telegram.ui.Components.voip.n2.l(ci1Var.f35821b, ci1Var.f35818a, ci1Var.f35851r0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f35817k1.f35847o0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.T = windowInsets.getSystemWindowInsetTop();
                                    f35817k1.f35847o0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
                                duration.setInterpolator(prVar).start();
                                this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.F.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.K.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.U.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.f35835g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.f35830e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.f35833f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.W.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.J0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                org.telegram.ui.Components.voip.n2.Q = true;
                                this.B0 = true;
                                ValueAnimator k10 = k(false);
                                this.I0.lock();
                                k10.addListener(new qh1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(prVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.z4.B(this.f35821b, new kh1(this, 0), true).o();
                    return;
                }
                this.f35851r0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f35832f.getVisibility() == 0) {
            this.f35822b0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f35822b0;
            ValueAnimator valueAnimator = eVar.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.V = null;
                eVar.R.stop();
            }
            runnable.run();
            return;
        }
        this.f35845n.animate().cancel();
        this.f35829e.animate().cancel();
        this.h.animate().cancel();
        this.f35832f.animate().cancel();
        this.f35822b0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f35822b0;
        ValueAnimator valueAnimator2 = eVar2.V;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.V = null;
            eVar2.R.stop();
        }
        this.f35845n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f35829e.d(5, false, false);
        this.h.d(1, false, false);
        this.f35832f.d(3, true, false);
        this.f35845n.setVisibility(0);
        this.f35829e.setVisibility(0);
        this.h.setVisibility(0);
        this.f35832f.setVisibility(0);
        this.f35845n.setAlpha(0.0f);
        this.f35829e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f35832f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35822b0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ci1 ci1Var = ci1.this;
                ci1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ci1Var.f35822b0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ci1Var.f35822b0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f35822b0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f35822b0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f35822b0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f35822b0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.fx0(14, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new mh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f35843k0) {
            l3Var.d(2, false, false);
            l3Var.setOnBtnClickedListener(null);
            l3Var.setEnabled(false);
            return;
        }
        l3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            l3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            l3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        l3Var.setOnBtnClickedListener(new d7(this, voIPService, l3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z4) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.V;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z4) {
            ValueAnimator valueAnimator = t1Var.f32333c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            t1Var.H = f10;
            t1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = t1Var.f32333c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = t1Var.H;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            t1Var.f32333c0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f32334d0);
            t1Var.f32333c0.setDuration(150L);
            t1Var.f32333c0.start();
        }
        l3Var.setOnBtnClickedListener(new kh1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            l3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            l3Var.d(5, true, false);
            i10 = 0;
        } else {
            l3Var.d(5, false, false);
            i10 = 1;
        }
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new hg.a0(this, i10, l3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z4) {
        boolean z10;
        if (!this.f35843k0 && !this.f35841j0) {
            z10 = voIPService.isVideoAvailable();
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.f35843k0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z4);
                } else {
                    l3Var.d(3, false, z4);
                }
            } else {
                l3Var.d(3, true, z4);
            }
            l3Var.setOnBtnClickedListener(new kh1(this, 6));
            l3Var.setEnabled(true);
            return;
        }
        l3Var.d(3, true, false);
        l3Var.setOnClickListener(null);
        l3Var.setEnabled(false);
    }

    public final void x(boolean z4, boolean z10) {
        boolean z11;
        int i10 = 0;
        if (!this.f35843k0 && !this.f35841j0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Integer num = null;
        if (z4) {
            if (z11 && this.f35861y.getTag() == null) {
                this.f35861y.animate().setListener(null).cancel();
                this.f35861y.setVisibility(0);
                if (!this.f35863z0) {
                    if (z10) {
                        this.f35861y.setAlpha(0.0f);
                        this.f35861y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
                    } else {
                        this.f35861y.setAlpha(0.0f);
                        this.f35861y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f35861y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
                    }
                } else if (z10) {
                    this.f35861y.setAlpha(0.0f);
                    this.f35861y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f35861y.setScaleX(0.1f);
                    this.f35861y.setScaleY(0.1f);
                }
            } else if (!z11 && this.f35861y.getTag() != null) {
                this.f35861y.animate().setListener(null).cancel();
                this.f35861y.setTranslationY(0.0f);
                this.f35861y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.pr.f30183f).setListener(new qh1(this, 7)).start();
            }
        } else {
            this.f35861y.animate().setListener(null).cancel();
            this.f35861y.setTranslationY(0.0f);
            this.f35861y.setAlpha(1.0f);
            this.f35861y.setScaleX(1.0f);
            this.f35861y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f35861y;
            if (!z11) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f35861y;
        if (z11) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f35821b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.f35821b, 0, null);
        boolean[] zArr = new boolean[3];
        d2Var.O = LocaleController.getString(R.string.VoipFailed);
        d2Var.Q = charSequence;
        d2Var.f21248i0 = LocaleController.getString(R.string.OK);
        d2Var.f21249j0 = null;
        d2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(d2Var.e(org.telegram.ui.ActionBar.k6.f21895q7));
            }
        }
        d2Var.setCanceledOnTouchOutside(true);
        d2Var.setOnDismissListener(new v5(this, 19));
    }

    public final void z(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        AnimatorSet animatorSet;
        if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
            this.V.setUiVisible(this.f35855u0);
        }
        if (!z4 && (animatorSet = this.f35860x0) != null) {
            animatorSet.removeAllListeners();
            this.f35860x0.cancel();
        }
        boolean z12 = true;
        if (i10 == 0) {
            if (z4) {
                if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f35860x0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f35860x0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.t1 t1Var = this.V;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(t1Var, View.ALPHA, t1Var.getAlpha(), 0.0f));
                    if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.t1 t1Var2 = this.V;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var2, View.SCALE_X, t1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.t1 t1Var3 = this.V;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var3, View.SCALE_Y, t1Var3.getScaleX(), 0.7f));
                    }
                    this.f35860x0 = animatorSet3;
                    animatorSet3.addListener(new qh1(this, 6));
                    this.f35860x0.setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f30183f);
                    this.f35860x0.setStartDelay(50L);
                    this.f35860x0.start();
                }
            } else {
                this.V.setVisibility(8);
            }
        } else {
            if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() != 0) {
                z10 = z4;
            } else {
                z10 = false;
            }
            if (z4) {
                if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() == 0) {
                    if (this.V.getVisibility() == 8) {
                        this.V.setAlpha(0.0f);
                        this.V.setScaleX(0.7f);
                        this.V.setScaleY(0.7f);
                        this.V.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.f35860x0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f35860x0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.V, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_Y, 0.7f, 1.0f));
                    this.f35860x0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.V.setVisibility(0);
            }
            if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var4 = this.V;
                if (t1Var4.f32345y < 0.0f) {
                    t1Var4.d(1.0f, 1.0f);
                    this.X = true;
                }
            }
            org.telegram.ui.Components.voip.t1 t1Var5 = this.V;
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            t1Var5.c(z11, z10);
            if (i10 == 2) {
                z12 = false;
            }
            this.X = z12;
        }
        this.V.setTag(Integer.valueOf(i10));
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
    }
}

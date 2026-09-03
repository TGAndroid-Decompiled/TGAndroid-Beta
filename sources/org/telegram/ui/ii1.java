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
public final class ii1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, df.a {
    public static ii1 f34943k1;
    public boolean A0;
    public TextView B;
    public boolean B0;
    public org.telegram.ui.Components.voip.p2 C;
    public float C0;
    public hi1 D;
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
    public gg.v2 J;
    public org.telegram.ui.Components.voip.h2 J0;
    public pb1 K;
    public org.telegram.ui.Components.voip.d3 K0;
    public FrameLayout L;
    public org.telegram.ui.Components.voip.d3 L0;
    public org.telegram.ui.Components.voip.o0 M;
    public ValueAnimator M0;
    public org.telegram.ui.Components.voip.l1 N;
    public dg.k0 O;
    public boolean O0;
    public TextView P;
    public rk Q;
    public org.telegram.ui.Components.voip.k R;
    public boolean R0;
    public float S0;
    public float T0;
    public ei1 U;
    public float U0;
    public org.telegram.ui.Components.voip.s1 V;
    public float V0;
    public org.telegram.ui.Components.voip.s1 W;
    public float W0;
    public boolean X;
    public boolean X0;
    public TextureViewRenderer Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s2 Z;
    public float Z0;
    public final int f34944a;
    public org.telegram.ui.Components.voip.s2 f34945a0;
    public int f34946a1;
    public Activity f34947b;
    public org.telegram.ui.Components.voip.e f34948b0;
    public int f34949b1;
    public final TLRPC.User f34950c;
    public boolean f34951c0;
    public final TLRPC.User d;
    public bf.f f34953d0;
    public boolean f34954d1;
    public org.telegram.ui.Components.voip.k3 e;
    public View f34955e0;
    public boolean f34956e1;
    public org.telegram.ui.Components.voip.k3 f34957f;
    public View f34958f0;
    public ValueAnimator f34959f1;
    public org.telegram.ui.Components.voip.o1 f34960g0;
    public boolean f34961g1;
    public org.telegram.ui.Components.voip.k3 h;
    public org.telegram.ui.Components.voip.s2 f34963h1;
    public c2.p f34965i1;
    public boolean f34966j0;
    public boolean f34967j1;
    public boolean f34968k0;
    public bi1 f34969l0;
    public int m0;
    public fi1 f34970n;
    public int f34971n0;
    public WindowInsets f34972o0;
    public boolean f34973p0;
    public float f34974q0;
    public ai1 f34976r0;
    public di1 f34977s;
    public int f34978s0;
    public AccessibilityManager f34979t0;
    public org.telegram.ui.Components.voip.c3 v;
    public org.telegram.ui.Components.voip.z2 f34982w;
    public boolean f34983w0;
    public org.telegram.ui.Components.voip.e3 f34984x;
    public AnimatorSet f34985x0;
    public org.telegram.ui.Components.voip.q0 f34986y;
    public boolean f34987y0;
    public boolean f34988z0;
    public final org.telegram.ui.Components.voip.n1 f34975r = new org.telegram.ui.Components.voip.n1();
    public final org.telegram.ui.Components.p9[] S = new org.telegram.ui.Components.p9[4];
    public final Drawable[] T = new Drawable[4];
    public final Paint f34962h0 = new Paint();
    public final Paint f34964i0 = new Paint();
    public boolean f34980u0 = true;
    public float f34981v0 = 1.0f;
    public final AnimationNotificationsLocker I0 = new AnimationNotificationsLocker();
    public final o11 N0 = new o11(this, 20);
    public final sh1 P0 = new sh1(this, 12);
    public final sh1 Q0 = new sh1(this, 13);
    public float f34952c1 = 1.0f;

    public ii1(int i10) {
        this.f34944a = i10;
        this.f34950c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f34971n0 = -1;
        this.m0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(ii1 ii1Var) {
        AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
        ii1Var.O0 = false;
        if (Build.VERSION.SDK_INT >= 23 && ii1Var.f34947b.checkSelfPermission("android.permission.CAMERA") != 0) {
            ii1Var.f34947b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            ii1Var.C();
        }
    }

    public static void j(ii1 ii1Var) {
        ii1 ii1Var2;
        if (ii1Var.f34954d1) {
            ii1Var.f34954d1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ii1Var.f34959f1 = ofFloat;
            ii1Var2 = ii1Var;
            ofFloat.addUpdateListener(new fg.c(ii1Var2, ii1Var.f34952c1, ii1Var.V0, ii1Var.W0, 2));
            ii1Var2.f34959f1.addListener(new wh1(ii1Var2, 0));
            ii1Var2.f34959f1.setDuration(350L);
            ii1Var2.f34959f1.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            ii1Var2.f34959f1.start();
        } else {
            ii1Var2 = ii1Var;
        }
        ii1Var2.f34956e1 = false;
        ii1Var2.X0 = false;
    }

    public static void q(int i10, int[] iArr) {
        ii1 ii1Var = f34943k1;
        if (ii1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.f34976r0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ii1Var.r(new j21(5));
                } else if (!ii1Var.f34947b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.f2.h(ii1Var.f34947b, new sh1(ii1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.f34976r0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ii1Var.C();
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
        ii1 ii1Var = f34943k1;
        if (ii1Var != null && ii1Var.f34976r0.getParent() == null) {
            ii1 ii1Var2 = f34943k1;
            if (ii1Var2 != null) {
                ii1Var2.Z.d.release();
                f34943k1.f34945a0.d.release();
                f34943k1.Y.release();
                ai1 ai1Var = f34943k1.f34976r0;
                if (ai1Var != null) {
                    ai1Var.d();
                }
                f34943k1.l();
            }
            f34943k1 = null;
        }
        if (f34943k1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ii1 ii1Var3 = new ii1(i10);
                ii1Var3.f34947b = activity;
                f34943k1 = ii1Var3;
                ai1 ai1Var2 = new ai1(activity, !z4, ii1Var3);
                f34943k1.G0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f34943k1.getClass();
                ai1Var2.setLockOnScreen(f34943k1.G0);
                ii1Var3.f34976r0 = ai1Var2;
                qh1 qh1Var = new qh1(ii1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f43142a;
                r0.b0.j(ai1Var2, qh1Var);
                ((WindowManager) activity.getSystemService("window")).addView(ai1Var2, org.telegram.ui.Components.voip.w2.a());
                ii1Var3.f34974q0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ii1Var3.f34979t0 = (AccessibilityManager) f0.f.f(activity, AccessibilityManager.class);
                di1 di1Var = new di1(ii1Var3, activity);
                di1Var.setClipToPadding(false);
                di1Var.setClipChildren(false);
                di1Var.setBackgroundColor(-16777216);
                ii1Var3.G();
                ii1Var3.f34977s = di1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.n1 n1Var = ii1Var3.f34975r;
                ii1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z10, n1Var);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity, false, true, false, false);
                ii1Var3.Z = s2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                s2Var.d.setScalingType(scalingType);
                ii1Var3.Z.d.setEnableHardwareScaler(true);
                ii1Var3.Z.d.setRotateTextureWithScreen(true);
                ii1Var3.Z.U = 1;
                di1Var.addView(ii1Var3.v, k7.b6.c(-1.0f, -1));
                TLRPC.User user = ii1Var3.d;
                org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, n1Var);
                ii1Var3.f34982w = z2Var;
                di1Var.addView(z2Var, k7.b6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.j6.f19820a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f29594a = new org.telegram.ui.Components.bw0(0);
                    }
                }
                ii1Var3.f34984x = view;
                di1Var.addView((View) view, k7.b6.c(220.0f, -1));
                di1Var.addView(ii1Var3.Z);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(ja.c.o(0.5f, 1), new rc1(ii1Var3, 1), 0L);
                org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
                ii1Var3.V = s1Var;
                s1Var.setDelegate(new qh1(ii1Var3, 3));
                ii1Var3.V.d(1.0f, 1.0f);
                ii1Var3.X = true;
                org.telegram.ui.Components.voip.s2 s2Var2 = new org.telegram.ui.Components.voip.s2(activity, true, false);
                ii1Var3.f34945a0 = s2Var2;
                s2Var2.d.setIsCamera(true);
                ii1Var3.f34945a0.d.setUseCameraRotation(true);
                ii1Var3.V.setOnTapListener(new th1(ii1Var3, 1));
                ii1Var3.f34945a0.d.setMirror(true);
                ii1Var3.V.addView(ii1Var3.f34945a0);
                org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
                ii1Var3.W = s1Var2;
                s1Var2.P = true;
                s1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ii1Var3.Y = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ii1Var3.Y.setIsCamera(false);
                ii1Var3.Y.setFpsReduction(30.0f);
                ii1Var3.Y.setScalingType(scalingType);
                ii1Var3.W.addView(ii1Var3.Y, k7.b6.e(-1, -2, 17));
                ii1Var3.W.setOnTapListener(new th1(ii1Var3, 2));
                ii1Var3.W.setVisibility(8);
                di1Var.addView(ii1Var3.V, k7.b6.c(-2.0f, -2));
                di1Var.addView(ii1Var3.W);
                View view2 = new View(activity);
                ii1Var3.f34955e0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                di1Var.addView(ii1Var3.f34955e0, k7.b6.e(-1, 160, 80));
                View view3 = new View(activity);
                ii1Var3.f34958f0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                di1Var.addView(ii1Var3.f34958f0, k7.b6.e(-1, 160, 48));
                pb1 pb1Var = new pb1(ii1Var3, activity, 17);
                ii1Var3.K = pb1Var;
                pb1Var.setOrientation(0);
                ii1Var3.K.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ii1Var3.K.setClipToPadding(false);
                ii1Var3.K.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ii1Var3.K.setOnClickListener(new th1(ii1Var3, 3));
                ii1Var3.M = new org.telegram.ui.Components.voip.o0(activity, n1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ii1Var3.L = frameLayout;
                frameLayout.addView(ii1Var3.M, k7.b6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ii1Var3.L.setVisibility(8);
                ii1Var3.L.setOnClickListener(new th1(ii1Var3, 4));
                dg.k0 k0Var = new dg.k0(activity, n1Var);
                ii1Var3.O = k0Var;
                k0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ii1Var3.P = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ii1Var3.P.setTextSize(1, 15.0f);
                ii1Var3.P.setTypeface(AndroidUtilities.bold());
                ii1Var3.P.setTextColor(-1);
                ii1Var3.P.setGravity(17);
                rk rkVar = new rk(ii1Var3, activity, 5);
                ii1Var3.Q = rkVar;
                rkVar.setTextSize(1, 15.0f);
                ii1Var3.Q.setTextColor(-1);
                ii1Var3.Q.setGravity(17);
                ii1Var3.Q.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ii1Var3.Q.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ii1Var3.O.setVisibility(8);
                ii1Var3.O.addView(ii1Var3.P);
                ii1Var3.O.addView(ii1Var3.Q, k7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ii1Var3.O.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                    org.telegram.ui.Components.p9[] p9VarArr = ii1Var3.S;
                    p9VarArr[i15] = p9Var;
                    p9VarArr[i15].getImageReceiver().setAspectFit(true);
                    pb1 pb1Var2 = ii1Var3.K;
                    org.telegram.ui.Components.p9 p9Var2 = p9VarArr[i15];
                    if (i15 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    pb1Var2.addView(p9Var2, k7.b6.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ei1 ei1Var = new ei1(ii1Var3, activity);
                ii1Var3.U = ei1Var;
                ei1Var.setOrientation(1);
                ii1Var3.U.setFocusable(true);
                ii1Var3.U.setFocusableInTouchMode(true);
                ii1Var3.f34986y = new org.telegram.ui.Components.voip.q0(activity);
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.r(user);
                org.telegram.ui.Components.voip.q0 q0Var = ii1Var3.f34986y;
                int i16 = ii1Var3.f34944a;
                q0Var.f29835b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, z8Var, user);
                ii1Var3.f34986y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ii1Var3.B = textView2;
                textView2.setTextSize(1, 28.0f);
                ii1Var3.B.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ii1Var3.B.getPaint().getFontMetricsInt(), false));
                ii1Var3.B.setMaxLines(2);
                ii1Var3.B.setEllipsize(TextUtils.TruncateAt.END);
                ii1Var3.B.setTextColor(-1);
                ii1Var3.B.setGravity(1);
                ii1Var3.B.setImportantForAccessibility(2);
                ii1Var3.U.addView(ii1Var3.B, k7.b6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f29828a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f29828a[i17] = new TextView(activity);
                    frameLayout2.f29828a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f29828a[i17].setTextColor(-1);
                    frameLayout2.f29828a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f29828a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f29830c = frameLayout3;
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(frameLayout2, activity, n1Var);
                n2Var.setTextSize(1, 15.0f);
                n2Var.setTextColor(-1);
                n2Var.setGravity(1);
                n2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                n2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(n2Var, k7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, k7.b6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f29829b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, k7.b6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new org.telegram.ui.Components.a0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity);
                frameLayout2.d = t2Var;
                frameLayout2.addView(t2Var, k7.b6.c(-2.0f, -1));
                ii1Var3.C = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f43142a;
                frameLayout2.setImportantForAccessibility(4);
                ii1Var3.U.addView(ii1Var3.C, k7.b6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    hi1 hi1Var = new hi1(activity);
                    ii1Var3.D = hi1Var;
                    long j10 = sharedState.getUser().f19306id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        hi1Var.setVisibility(8);
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
                        org.telegram.ui.Components.c9 c9Var = hi1Var.f34682b;
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
                            hi1Var.setVisibility(8);
                        } else {
                            hi1Var.f34683c = new org.telegram.ui.Components.k01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            hi1Var.setVisibility(0);
                            hi1Var.invalidate();
                        }
                    }
                    ii1Var3.U.addView(ii1Var3.D, k7.b6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ii1Var3.U.setClipChildren(false);
                ii1Var3.U.setClipToPadding(false);
                ii1Var3.U.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ii1Var3.R = new org.telegram.ui.Components.voip.k(activity);
                ii1Var3.N = new org.telegram.ui.Components.voip.l1(activity, n1Var);
                ii1Var3.R.setAlpha(0.0f);
                ii1Var3.N.setVisibility(8);
                di1Var.addView(ii1Var3.f34986y, k7.b6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.U, k7.b6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.L, k7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.O, k7.b6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.K, k7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.R, k7.b6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.N, k7.b6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ii1Var3.f34960g0 = new org.telegram.ui.Components.voip.o1(activity);
                ii1Var3.e = new org.telegram.ui.Components.voip.k3(activity, n1Var);
                ii1Var3.f34957f = new org.telegram.ui.Components.voip.k3(activity, n1Var);
                ii1Var3.h = new org.telegram.ui.Components.voip.k3(activity, n1Var);
                ii1Var3.f34970n = new org.telegram.ui.Components.voip.v2(activity, 52.0f);
                ii1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.e.setScaleX(0.0f);
                ii1Var3.e.setScaleY(0.0f);
                ii1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f34957f.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.f34957f.setScaleX(0.0f);
                ii1Var3.f34957f.setScaleY(0.0f);
                ii1Var3.f34957f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.h.setScaleX(0.0f);
                ii1Var3.h.setScaleY(0.0f);
                ii1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f34970n.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.f34970n.setScaleX(0.0f);
                ii1Var3.f34970n.setScaleY(0.0f);
                ii1Var3.f34970n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f34960g0.addView(ii1Var3.e);
                ii1Var3.f34960g0.addView(ii1Var3.f34957f);
                ii1Var3.f34960g0.addView(ii1Var3.h);
                ii1Var3.f34960g0.addView(ii1Var3.f34970n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ii1Var3.f34948b0 = eVar;
                eVar.setListener(new gi1(ii1Var3));
                ii1Var3.f34948b0.setScaleX(1.15f);
                ii1Var3.f34948b0.setScaleY(1.15f);
                di1Var.addView(ii1Var3.f34960g0, k7.b6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f11 = i11;
                di1Var.addView(ii1Var3.f34948b0, k7.b6.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                ii1Var3.F = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.F.setImageResource(R.drawable.msg_addcontact);
                ii1Var3.F.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                di1Var.addView(ii1Var3.F, k7.b6.e(56, 56, 53));
                k7.d6.a(ii1Var3.F);
                ImageView imageView2 = new ImageView(activity);
                ii1Var3.E = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.E.setImageResource(R.drawable.msg_call_minimize_shadow);
                ii1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ii1Var3.E.setContentDescription(LocaleController.getString(R.string.Back));
                di1Var.addView(ii1Var3.E, k7.b6.e(56, 56, 51));
                k7.d6.a(ii1Var3.E);
                org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
                ii1Var3.H = geVar;
                geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ii1Var3.H.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.H.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                di1Var.addView(ii1Var3.H, k7.b6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ii1Var3.H.setAlpha(0.0f);
                ii1Var3.H.setOnClickListener(new th1(ii1Var3, 5));
                ii1Var3.E.setOnClickListener(new th1(ii1Var3, 6));
                ii1Var3.F.setOnClickListener(new ib0(25, ii1Var3, activity));
                if (ii1Var3.f34976r0.f29989b) {
                    ii1Var3.E.setVisibility(8);
                    ii1Var3.F.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f29643a = new HashMap();
                linearLayout.f29644b = new ArrayList();
                linearLayout.f29645c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f29648r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f29647n = n1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new eg.j0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ii1Var3.J0 = linearLayout;
                linearLayout.setGravity(80);
                ii1Var3.J0.setOnViewsUpdated(new sh1(ii1Var3, 5));
                di1Var.addView(ii1Var3.J0, k7.b6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, n1Var, true);
                d3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                d3Var.H = alignment;
                d3Var.d = -1L;
                d3Var.f41662i0 = new sh1(ii1Var3, 6);
                d3Var.Q = true;
                d3Var.h = AndroidUtilities.dp(320.0f);
                d3Var.e = true;
                d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var.q(8.0f);
                ii1Var3.K0 = d3Var;
                d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                di1Var.addView(ii1Var3.K0, k7.b6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, n1Var, false);
                d3Var2.p(true);
                d3Var2.H = alignment;
                d3Var2.d = 4000L;
                d3Var2.Q = true;
                d3Var2.h = AndroidUtilities.dp(320.0f);
                d3Var2.e = true;
                d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var2.q(8.0f);
                ii1Var3.L0 = d3Var2;
                d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                di1Var.addView(ii1Var3.L0, k7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ii1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ii1Var3.R0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ii1Var3.R0 = z11;
                    }
                    ii1Var3.o();
                }
                ai1Var2.addView(di1Var);
                if (z4) {
                    ii1Var3.C0 = 0.0f;
                    ii1Var3.F0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ii1Var3.Z.setStub(org.telegram.ui.Components.voip.m2.k().f29749r);
                        ii1Var3.f34945a0.setStub(org.telegram.ui.Components.voip.m2.k().f29748n);
                    }
                    ii1Var3.f34976r0.setAlpha(0.0f);
                    ii1Var3.H();
                    ii1Var3.B0 = true;
                    org.telegram.ui.Components.voip.m2.Q = true;
                    if (org.telegram.ui.Components.voip.m2.S == null) {
                        ii1Var3.I0.lock();
                        AndroidUtilities.runOnUIThread(new sh1(ii1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.m2.R.getClass();
                        throw null;
                    }
                } else {
                    ii1Var3.C0 = 1.0f;
                    ii1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ef.d.a(activity) == 1) {
                    ii1 ii1Var4 = f34943k1;
                    bf.e eVar2 = new bf.e(activity, ii1Var4);
                    eVar2.f1809c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.s2 s2Var3 = ii1Var4.Z;
                    eVar2.f1813j = s2Var3.d;
                    eVar2.f1814k = s2Var3.getPlaceholderView();
                    ii1Var4.f34953d0 = eVar2.a();
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
        o11 o11Var = this.N0;
        int i11 = 0;
        if (!z4 && this.f34980u0) {
            ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
            duration.setInterpolator(mrVar).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(mrVar).start();
            this.F.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(mrVar).start();
            this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(mrVar).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(mrVar).start();
            this.C.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(mrVar).start();
            this.f34960g0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(mrVar).start();
            this.f34955e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
            this.f34958f0.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34981v0, 0.0f);
            this.M0 = ofFloat;
            ofFloat.addUpdateListener(o11Var);
            this.M0.setDuration(150L).setInterpolator(mrVar);
            this.M0.start();
            AndroidUtilities.cancelRunOnUIThread(this.P0);
            this.O0 = false;
            this.f34960g0.setEnabled(false);
            this.L0.e(true);
            i10 = 150;
        } else {
            if (z4 && !this.f34980u0) {
                this.K0.e(true);
                this.L0.e(true);
                ViewPropertyAnimator translationY = this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.mr mrVar2 = org.telegram.ui.Components.mr.f27122f;
                translationY.setInterpolator(mrVar2).start();
                this.C.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(mrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.f34960g0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.f34955e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar2).start();
                this.f34958f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f34981v0, 1.0f);
                this.M0 = ofFloat2;
                ofFloat2.addUpdateListener(o11Var);
                this.M0.setDuration(150L).setInterpolator(mrVar2);
                this.M0.start();
                this.f34960g0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f34980u0 = z4;
        ai1 ai1Var = this.f34976r0;
        if (!z4) {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() | 4);
        } else {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.J0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f34980u0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            sh1 sh1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            this.O0 = false;
            if (this.f34983w0 && this.f34980u0) {
                AndroidUtilities.runOnUIThread(sh1Var, 3000L);
                this.O0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f34979t0.isTouchExplorationEnabled()) {
                if (!this.f34968k0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f34977s.announceForAccessibility(string);
            }
            if (!this.f34968k0) {
                if (this.f34969l0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f34976r0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f34957f.getLocationOnScreen(iArr);
                    bi1 bi1Var = new bi1(this, this.f34977s.getContext(), iArr[0], iArr[1]);
                    this.f34969l0 = bi1Var;
                    WindowInsets windowInsets = this.f34972o0;
                    if (windowInsets != null) {
                        bi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f34977s.addView(this.f34969l0);
                    return;
                }
                return;
            }
            this.f34945a0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f34971n0 = this.m0;
            H();
        }
    }

    public final void D(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z4) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new eg.j0(5).setDuration(250L);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
                transitionSet.addTransition(duration.setInterpolator(mrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(mrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.v2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
                TransitionManager.beginDelayedTransition(this.f34960g0, transitionSet);
            }
            int i10 = this.m0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f34957f.setVisibility(8);
                this.h.setVisibility(8);
                this.f34970n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f34943k1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f34968k0 || this.f34966j0)) {
                    s(this.e, sharedInstance);
                    if (this.f34980u0) {
                        this.H.setTag(1);
                        this.H.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.e, sharedInstance);
                    this.H.setTag(null);
                    this.H.animate().alpha(0.0f).start();
                }
                v(this.f34957f, sharedInstance, false);
                t(this.h, sharedInstance, z4);
                this.f34970n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z4);
                this.f34970n.setOnClickListener(new th1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f34968k0 || this.f34966j0)) {
                        s(this.e, sharedInstance);
                        if (this.f34980u0) {
                            this.H.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.e, sharedInstance);
                        this.H.animate().alpha(0.0f).start();
                    }
                    v(this.f34957f, sharedInstance, false);
                    t(this.h, sharedInstance, z4);
                } else {
                    this.e.setVisibility(8);
                    this.f34957f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f34970n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f29726f = 0;
                i11 = 16;
            }
            if (this.f34957f.getVisibility() == 0) {
                this.f34957f.f29726f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f29726f = i11;
                i11 += 16;
            }
            if (this.f34970n.getVisibility() == 0) {
                this.f34970n.C = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii1.E(boolean):void");
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
        this.f34962h0.setColor(i0.a.k(-16777216, (int) (this.f34981v0 * 102.0f * this.C0)));
        this.f34964i0.setColor(i0.a.k(-16777216, (int) (127.5f * this.C0)));
        di1 di1Var = this.f34977s;
        if (di1Var != null) {
            di1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii1.H():void");
    }

    @Override
    public final void a(c2.p pVar) {
        this.f34965i1 = pVar;
        ai1 ai1Var = this.f34976r0;
        ai1Var.getClass();
        ((WindowManager) this.f34947b.getSystemService("window")).addView(ai1Var, org.telegram.ui.Components.voip.w2.a());
        this.f34967j1 = false;
        H();
        this.f34976r0.invalidate();
        org.telegram.ui.Components.voip.s2 s2Var = this.f34963h1;
        if (s2Var != null) {
            s2Var.d.release();
            this.f34963h1 = null;
        }
    }

    @Override
    public final Bitmap b() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f34963h1;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f34963h1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap d() {
        org.telegram.ui.Components.voip.s2 s2Var = this.Z;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.Z.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.m0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f34945a0.d.release();
                this.Z.d.release();
                this.Y.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f34976r0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f34986y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f34951c0 = booleanValue;
            if (booleanValue) {
                this.f34986y.b(true, true);
            }
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.f34965i1 = pVar;
        org.telegram.ui.Components.voip.s2 s2Var = this.Z;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        this.f34967j1 = true;
        H();
        ((WindowManager) this.f34947b.getSystemService("window")).removeView(this.f34976r0);
        this.f34976r0.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(this.f34947b, false, true, false, false);
        this.f34963h1 = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f34963h1.d.setEnableHardwareScaler(true);
        this.f34963h1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.s2 s2Var2 = this.f34963h1;
        s2Var2.U = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ci1(this));
        View view = this.f34963h1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f34963h1;
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
        float f18 = org.telegram.ui.Components.voip.m2.k().d.x + org.telegram.ui.Components.voip.m2.k().f29753y;
        float f19 = org.telegram.ui.Components.voip.m2.k().d.y + org.telegram.ui.Components.voip.m2.k().B;
        final float x10 = this.V.getX();
        final float y10 = this.V.getY();
        final float scaleX = this.V.getScaleX();
        org.telegram.ui.Components.voip.m2.R.getClass();
        final float measuredWidth = f18 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f19 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f20 = 1.0f;
        if (this.f34966j0) {
            int measuredWidth2 = this.V.getMeasuredWidth();
            if (this.f34968k0 && measuredWidth2 != 0) {
                f17 = (this.f34976r0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f16 = (((org.telegram.ui.Components.voip.m2.k().f29747f * 0.25f) + (f18 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().f29747f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.m2.k().h * 0.25f) + (f19 - ((this.V.getMeasuredHeight() - (this.V.getMeasuredHeight() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
        if (this.f34966j0) {
            f12 = AndroidUtilities.dp(4.0f);
        } else {
            f12 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.f34966j0) {
            org.telegram.ui.Components.voip.m2.R.getClass();
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
                ii1 ii1Var = ii1.this;
                ii1Var.C0 = f24;
                ii1Var.G();
                if (z10) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    ii1Var.V.setScaleX(f25);
                    ii1Var.V.setScaleY(f25);
                    ii1Var.V.setTranslationX((f10 * floatValue) + (x10 * f24));
                    ii1Var.V.setTranslationY((f22 * floatValue) + (y10 * f24));
                    ii1Var.V.setCornerRadius((dp * floatValue) + (f23 * f24));
                    ii1Var.V.setAlpha((f20 * floatValue) + (1.0f * f24));
                }
                float f26 = (r12 * floatValue) + (1.0f * f24);
                ii1Var.Z.setScaleX(f26);
                ii1Var.Z.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                ii1Var.Z.setTranslationX(f28);
                ii1Var.Z.setTranslationY(f29);
                ii1Var.Z.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f26);
                if (!ii1Var.V.M) {
                    ii1Var.f34945a0.d(floatValue, false);
                }
                ii1Var.f34976r0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f34944a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        bf.f fVar = this.f34953d0;
        if (fVar != null) {
            fVar.c();
            this.f34953d0 = null;
        }
        gg.v2 v2Var = this.J;
        if (v2Var != null) {
            v2Var.dismiss();
            this.J = null;
        }
    }

    public final void m(boolean z4) {
        ValueAnimator ofFloat;
        if (this.f34987y0 && this.f34988z0 != z4 && this.f34980u0) {
            this.f34988z0 = z4;
            org.telegram.ui.Components.voip.z2 z2Var = this.f34982w;
            if (z2Var.H && z4 != z2Var.B) {
                z2Var.B = z4;
                float[] fArr = {1.0f, 0.0f};
                if (z4) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                z2Var.f30027c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, 1));
                z2Var.f30027c.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                z2Var.f30027c.setDuration(200L);
                z2Var.f30027c.start();
            }
            if (z4) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.L0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.P0);
                this.O0 = false;
                if (this.f34986y.getVisibility() == 0) {
                    this.f34986y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
                }
                this.L.animate().setListener(null).cancel();
                this.L.setVisibility(0);
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.3f);
                this.L.setScaleY(0.3f);
                this.L.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.mr.f27123g).start();
                ViewPropertyAnimator translationY = this.K.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
                b.p(translationY, mrVar, 400L);
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.O.setScaleX(0.7f);
                this.O.setScaleY(0.7f);
                this.O.setAlpha(0.0f);
                this.O.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new wh1(this, 3)).setInterpolator(mrVar).start();
            } else {
                if (this.f34986y.getVisibility() == 0) {
                    this.f34986y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
                }
                this.L.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.mr mrVar2 = org.telegram.ui.Components.mr.f27122f;
                duration.setInterpolator(mrVar2).setListener(new org.telegram.ui.Components.m00(this.L)).start();
                this.K.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(mrVar2).setDuration(280L).start();
                this.O.animate().setListener(null).cancel();
                this.O.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new wh1(this, 4)).setDuration(250L).setInterpolator(mrVar2).start();
            }
            this.f34971n0 = this.m0;
            H();
        }
    }

    public final void n() {
        this.f34976r0.b();
    }

    public final void o() {
        this.f34945a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xh1(this));
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
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
        this.f34971n0 = this.m0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f34971n0 = this.m0;
        if (i11 == 2 && !this.R0) {
            this.R0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f34953d0 == null && ef.d.a(this.f34947b) == 1) {
                bf.e eVar = new bf.e(this.f34947b, f34943k1);
                eVar.f1809c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.s2 s2Var = this.Z;
                eVar.f1813j = s2Var.d;
                eVar.f1814k = s2Var.getPlaceholderView();
                this.f34953d0 = eVar.a();
            }
        } else {
            bf.f fVar = this.f34953d0;
            if (fVar != null) {
                fVar.c();
                this.f34953d0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.f34961g1 = true;
        }
        if (this.C != null && (c3Var = this.v) != null) {
            int i11 = c3Var.S;
            if ((i11 == 2 || i11 == 3) && this.f34961g1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dw(this, i10, 25), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.m0;
        if (i11 != i10) {
            this.f34971n0 = i11;
            this.m0 = i10;
            if (this.f34976r0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        this.f34971n0 = this.m0;
        if (z4 && !this.R0) {
            this.R0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.D0 && !this.B0) {
            bi1 bi1Var = this.f34969l0;
            if (bi1Var != null) {
                bi1Var.a(false, false);
            } else if (this.f34966j0 && this.f34968k0 && this.E0) {
                this.E0 = false;
                this.V.setRelativePosition(this.W);
                this.X = false;
                this.f34971n0 = this.m0;
                H();
            } else if (this.f34988z0) {
                m(false);
            } else if (this.O.getVisibility() == 8) {
                if (this.A0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (ef.d.a(this.f34947b) > 0) {
                        if (!this.D0 && f34943k1 != null) {
                            this.D0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f34943k1.f34976r0.getMeasuredHeight();
                                ii1 ii1Var = f34943k1;
                                org.telegram.ui.Components.voip.m2.l(ii1Var.f34947b, ii1Var.f34944a, ii1Var.f34976r0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f34943k1.f34972o0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.m2.T = windowInsets.getSystemWindowInsetTop();
                                    f34943k1.f34972o0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.m2.k() != null) {
                                ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
                                duration.setInterpolator(mrVar).start();
                                this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                                this.F.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                                this.K.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                                this.U.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                                this.f34960g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).start();
                                this.f34955e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).start();
                                this.f34958f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).start();
                                this.W.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).start();
                                this.J0.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).start();
                                org.telegram.ui.Components.voip.m2.Q = true;
                                this.B0 = true;
                                ValueAnimator k10 = k(false);
                                this.I0.lock();
                                k10.addListener(new wh1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(mrVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.z4.B(this.f34947b, new qh1(this, 0), true).o();
                    return;
                }
                this.f34976r0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f34957f.getVisibility() == 0) {
            this.f34948b0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f34948b0;
            ValueAnimator valueAnimator = eVar.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.V = null;
                eVar.R.stop();
            }
            runnable.run();
            return;
        }
        this.f34970n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f34957f.animate().cancel();
        this.f34948b0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f34948b0;
        ValueAnimator valueAnimator2 = eVar2.V;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.V = null;
            eVar2.R.stop();
        }
        this.f34970n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f34957f.d(3, true, false);
        this.f34970n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f34957f.setVisibility(0);
        this.f34970n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f34957f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34948b0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ii1 ii1Var = ii1.this;
                ii1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ii1Var.f34948b0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ii1Var.f34948b0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f34948b0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f34948b0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f34948b0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f34948b0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ex0(14, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new sh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.f34968k0) {
            k3Var.d(2, false, false);
            k3Var.setOnBtnClickedListener(null);
            k3Var.setEnabled(false);
            return;
        }
        k3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            k3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            k3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        k3Var.setOnBtnClickedListener(new f7(this, voIPService, k3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z4) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.V;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z4) {
            ValueAnimator valueAnimator = s1Var.f29866c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            s1Var.H = f10;
            s1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f29866c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = s1Var.H;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            s1Var.f29866c0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f29867d0);
            s1Var.f29866c0.setDuration(150L);
            s1Var.f29866c0.start();
        }
        k3Var.setOnBtnClickedListener(new qh1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            k3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            k3Var.d(5, true, false);
            i10 = 0;
        } else {
            k3Var.d(5, false, false);
            i10 = 1;
        }
        k3Var.setEnabled(true);
        k3Var.setOnBtnClickedListener(new gg.a0(this, i10, k3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z4) {
        boolean z10;
        if (!this.f34968k0 && !this.f34966j0) {
            z10 = voIPService.isVideoAvailable();
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.f34968k0) {
                if (voIPService.isScreencast()) {
                    k3Var.d(3, false, z4);
                } else {
                    k3Var.d(3, false, z4);
                }
            } else {
                k3Var.d(3, true, z4);
            }
            k3Var.setOnBtnClickedListener(new qh1(this, 6));
            k3Var.setEnabled(true);
            return;
        }
        k3Var.d(3, true, false);
        k3Var.setOnClickListener(null);
        k3Var.setEnabled(false);
    }

    public final void x(boolean z4, boolean z10) {
        boolean z11;
        int i10 = 0;
        if (!this.f34968k0 && !this.f34966j0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Integer num = null;
        if (z4) {
            if (z11 && this.f34986y.getTag() == null) {
                this.f34986y.animate().setListener(null).cancel();
                this.f34986y.setVisibility(0);
                if (!this.f34988z0) {
                    if (z10) {
                        this.f34986y.setAlpha(0.0f);
                        this.f34986y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
                    } else {
                        this.f34986y.setAlpha(0.0f);
                        this.f34986y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f34986y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
                    }
                } else if (z10) {
                    this.f34986y.setAlpha(0.0f);
                    this.f34986y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f34986y.setScaleX(0.1f);
                    this.f34986y.setScaleY(0.1f);
                }
            } else if (!z11 && this.f34986y.getTag() != null) {
                this.f34986y.animate().setListener(null).cancel();
                this.f34986y.setTranslationY(0.0f);
                this.f34986y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.mr.f27122f).setListener(new wh1(this, 7)).start();
            }
        } else {
            this.f34986y.animate().setListener(null).cancel();
            this.f34986y.setTranslationY(0.0f);
            this.f34986y.setAlpha(1.0f);
            this.f34986y.setScaleX(1.0f);
            this.f34986y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.q0 q0Var = this.f34986y;
            if (!z11) {
                i10 = 8;
            }
            q0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.q0 q0Var2 = this.f34986y;
        if (z11) {
            num = 1;
        }
        q0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f34947b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.f34947b, 0, null);
        boolean[] zArr = new boolean[3];
        d2Var.O = LocaleController.getString(R.string.VoipFailed);
        d2Var.Q = charSequence;
        d2Var.f19571i0 = LocaleController.getString(R.string.OK);
        d2Var.f19572j0 = null;
        d2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(d2Var.e(org.telegram.ui.ActionBar.j6.f20116q7));
            }
        }
        d2Var.setCanceledOnTouchOutside(true);
        d2Var.setOnDismissListener(new x5(this, 19));
    }

    public final void z(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        AnimatorSet animatorSet;
        if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
            this.V.setUiVisible(this.f34980u0);
        }
        if (!z4 && (animatorSet = this.f34985x0) != null) {
            animatorSet.removeAllListeners();
            this.f34985x0.cancel();
        }
        boolean z12 = true;
        if (i10 == 0) {
            if (z4) {
                if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f34985x0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f34985x0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.s1 s1Var = this.V;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(s1Var, View.ALPHA, s1Var.getAlpha(), 0.0f));
                    if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.s1 s1Var2 = this.V;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var2, View.SCALE_X, s1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.s1 s1Var3 = this.V;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var3, View.SCALE_Y, s1Var3.getScaleX(), 0.7f));
                    }
                    this.f34985x0 = animatorSet3;
                    animatorSet3.addListener(new wh1(this, 6));
                    this.f34985x0.setDuration(250L).setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    this.f34985x0.setStartDelay(50L);
                    this.f34985x0.start();
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
                    AnimatorSet animatorSet4 = this.f34985x0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f34985x0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.V, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_Y, 0.7f, 1.0f));
                    this.f34985x0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.V.setVisibility(0);
            }
            if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var4 = this.V;
                if (s1Var4.f29877y < 0.0f) {
                    s1Var4.d(1.0f, 1.0f);
                    this.X = true;
                }
            }
            org.telegram.ui.Components.voip.s1 s1Var5 = this.V;
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            s1Var5.c(z11, z10);
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

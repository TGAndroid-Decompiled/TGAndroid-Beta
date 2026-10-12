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
public final class dj1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, tf.a {
    public static dj1 f35273n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.o2 F;
    public float F0;
    public cj1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ig.k K;
    public long K0;
    public int L;
    public ug.m1 M;
    public org.telegram.ui.Components.voip.f2 M0;
    public ic1 N;
    public org.telegram.ui.Components.voip.c3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.c3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.m1 Q;
    public di.v5 R;
    public boolean R0;
    public TextView S;
    public xk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public zi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.s1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s1 Z;
    public float Z0;
    public final int f35274a;
    public boolean f35275a0;
    public boolean f35276a1;
    public Activity f35277b;
    public TextureViewRenderer f35278b0;
    public float f35279b1;
    public final TLRPC.User f35280c;
    public org.telegram.ui.Components.voip.r2 f35281c0;
    public float f35282c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.r2 f35283d0;
    public int f35284d1;
    public org.telegram.ui.Components.voip.j3 e;
    public org.telegram.ui.Components.voip.e f35285e0;
    public int f35286e1;
    public org.telegram.ui.Components.voip.j3 f35287f;
    public boolean f35288f0;
    public rf.d f35290g0;
    public boolean f35291g1;
    public org.telegram.ui.Components.voip.j3 h;
    public View f35292h0;
    public boolean f35293h1;
    public View f35294i0;
    public ValueAnimator f35295i1;
    public org.telegram.ui.Components.voip.p1 f35296j0;
    public boolean f35297j1;
    public org.telegram.ui.Components.voip.r2 f35299k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f35301m1;
    public aj1 f35302n;
    public boolean f35303n0;
    public wi1 f35304o0;
    public int f35305p0;
    public int f35306q0;
    public WindowInsets f35308r0;
    public yi1 f35309s;
    public boolean f35310s0;
    public float f35311t0;
    public vi1 f35312u0;
    public org.telegram.ui.Components.voip.b3 v;
    public int f35313v0;
    public org.telegram.ui.Components.voip.y2 f35314w;
    public AccessibilityManager f35315w0;
    public org.telegram.ui.Components.voip.d3 f35316x;
    public org.telegram.ui.Components.voip.r0 f35318y;
    public boolean f35320z0;
    public final org.telegram.ui.Components.voip.o1 f35307r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.z9[] V = new org.telegram.ui.Components.z9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f35298k0 = new Paint();
    public final Paint f35300l0 = new Paint();
    public boolean f35317x0 = true;
    public float f35319y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final f21 Q0 = new f21(this, 20);
    public final ni1 S0 = new ni1(this, 12);
    public final ni1 T0 = new ni1(this, 13);
    public float f35289f1 = 1.0f;

    public dj1(int i10) {
        this.f35274a = i10;
        this.f35280c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f35306q0 = -1;
        this.f35305p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(dj1 dj1Var) {
        dj1 dj1Var2;
        if (dj1Var.f35291g1) {
            dj1Var.f35291g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            dj1Var.f35295i1 = ofFloat;
            dj1Var2 = dj1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(dj1Var2, dj1Var.f35289f1, dj1Var.Y0, dj1Var.Z0, 1));
            dj1Var2.f35295i1.addListener(new ri1(dj1Var2, 0));
            dj1Var2.f35295i1.setDuration(350L);
            dj1Var2.f35295i1.setInterpolator(org.telegram.ui.Components.es.f24771f);
            dj1Var2.f35295i1.start();
        } else {
            dj1Var2 = dj1Var;
        }
        dj1Var2.f35293h1 = false;
        dj1Var2.f35276a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        dj1 dj1Var = f35273n1;
        if (dj1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    dj1Var.f35312u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    dj1Var.q(new b31(5));
                } else if (!dj1Var.f35277b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.d2.h(dj1Var.f35277b, new ni1(dj1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    dj1Var.f35312u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    dj1Var.B();
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
        dj1 dj1Var = f35273n1;
        if (dj1Var != null && dj1Var.f35312u0.getParent() == null) {
            dj1 dj1Var2 = f35273n1;
            if (dj1Var2 != null) {
                dj1Var2.f35281c0.d.release();
                f35273n1.f35283d0.d.release();
                f35273n1.f35278b0.release();
                vi1 vi1Var = f35273n1.f35312u0;
                if (vi1Var != null) {
                    vi1Var.d();
                }
                f35273n1.k();
            }
            f35273n1 = null;
        }
        if (f35273n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                dj1 dj1Var3 = new dj1(i10);
                dj1Var3.f35277b = activity;
                f35273n1 = dj1Var3;
                vi1 vi1Var2 = new vi1(activity, !z10, dj1Var3);
                f35273n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f35273n1.getClass();
                vi1Var2.setLockOnScreen(f35273n1.J0);
                dj1Var3.f35312u0 = vi1Var2;
                ki1 ki1Var = new ki1(dj1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f43732a;
                r0.b0.i(vi1Var2, ki1Var);
                ((WindowManager) activity.getSystemService("window")).addView(vi1Var2, org.telegram.ui.Components.voip.v2.a());
                dj1Var3.f35311t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                dj1Var3.f35315w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                yi1 yi1Var = new yi1(dj1Var3, activity);
                yi1Var.setClipToPadding(false);
                yi1Var.setClipChildren(false);
                yi1Var.setBackgroundColor(-16777216);
                dj1Var3.F();
                dj1Var3.f35309s = yi1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = dj1Var3.f35307r;
                dj1Var3.v = new org.telegram.ui.Components.voip.b3(activity, z11, o1Var);
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
                dj1Var3.f35281c0 = r2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                r2Var.d.setScalingType(scalingType);
                dj1Var3.f35281c0.d.setEnableHardwareScaler(true);
                dj1Var3.f35281c0.d.setRotateTextureWithScreen(true);
                dj1Var3.f35281c0.f30421a0 = 1;
                yi1Var.addView(dj1Var3.v, w7.a6.d(-1.0f, -1));
                TLRPC.User user = dj1Var3.d;
                org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity, user, o1Var);
                dj1Var3.f35314w = y2Var;
                yi1Var.addView(y2Var, w7.a6.d(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.g6.f19836a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f30146a = new org.telegram.ui.Components.zw0(0);
                    }
                }
                dj1Var3.f35316x = view;
                yi1Var.addView((View) view, w7.a6.d(220.0f, -1));
                yi1Var.addView(dj1Var3.f35281c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.y9(orientation, new int[]{-14994098, -14328963}).f(ji.w4.T(0.5f, 1), new kd1(dj1Var3, 1), 0L);
                org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
                dj1Var3.Y = s1Var;
                s1Var.setDelegate(new ki1(dj1Var3, 3));
                dj1Var3.Y.d(1.0f, 1.0f);
                dj1Var3.f35275a0 = true;
                org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
                dj1Var3.f35283d0 = r2Var2;
                r2Var2.d.setIsCamera(true);
                dj1Var3.f35283d0.d.setUseCameraRotation(true);
                dj1Var3.Y.setOnTapListener(new oi1(dj1Var3, 1));
                dj1Var3.f35283d0.d.setMirror(true);
                dj1Var3.Y.addView(dj1Var3.f35283d0);
                org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
                dj1Var3.Z = s1Var2;
                s1Var2.S = true;
                s1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                dj1Var3.f35278b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                dj1Var3.f35278b0.setIsCamera(false);
                dj1Var3.f35278b0.setFpsReduction(30.0f);
                dj1Var3.f35278b0.setScalingType(scalingType);
                dj1Var3.Z.addView(dj1Var3.f35278b0, w7.a6.e(-1, -2, 17));
                dj1Var3.Z.setOnTapListener(new oi1(dj1Var3, 2));
                dj1Var3.Z.setVisibility(8);
                yi1Var.addView(dj1Var3.Y, w7.a6.d(-2.0f, -2));
                yi1Var.addView(dj1Var3.Z);
                View view2 = new View(activity);
                dj1Var3.f35292h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                yi1Var.addView(dj1Var3.f35292h0, w7.a6.e(-1, 160, 80));
                View view3 = new View(activity);
                dj1Var3.f35294i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                yi1Var.addView(dj1Var3.f35294i0, w7.a6.e(-1, 160, 48));
                ic1 ic1Var = new ic1(dj1Var3, activity, 16);
                dj1Var3.N = ic1Var;
                ic1Var.setOrientation(0);
                dj1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                dj1Var3.N.setClipToPadding(false);
                dj1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                dj1Var3.N.setOnClickListener(new oi1(dj1Var3, 3));
                dj1Var3.P = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                dj1Var3.O = frameLayout;
                frameLayout.addView(dj1Var3.P, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 3));
                dj1Var3.O.setVisibility(8);
                dj1Var3.O.setOnClickListener(new oi1(dj1Var3, 4));
                di.v5 v5Var = new di.v5(activity, o1Var);
                dj1Var3.R = v5Var;
                v5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                dj1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                dj1Var3.S.setTextSize(1, 15.0f);
                dj1Var3.S.setTypeface(AndroidUtilities.bold());
                dj1Var3.S.setTextColor(-1);
                dj1Var3.S.setGravity(17);
                xk xkVar = new xk(dj1Var3, activity, 5);
                dj1Var3.T = xkVar;
                xkVar.setTextSize(1, 15.0f);
                dj1Var3.T.setTextColor(-1);
                dj1Var3.T.setGravity(17);
                dj1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), dj1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                dj1Var3.R.setVisibility(8);
                dj1Var3.R.addView(dj1Var3.S);
                dj1Var3.R.addView(dj1Var3.T, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                dj1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(activity);
                    org.telegram.ui.Components.z9[] z9VarArr = dj1Var3.V;
                    z9VarArr[i15] = z9Var;
                    z9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ic1 ic1Var2 = dj1Var3.N;
                    org.telegram.ui.Components.z9 z9Var2 = z9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    ic1Var2.addView(z9Var2, w7.a6.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                zi1 zi1Var = new zi1(dj1Var3, activity);
                dj1Var3.X = zi1Var;
                zi1Var.setOrientation(1);
                dj1Var3.X.setFocusable(true);
                dj1Var3.X.setFocusableInTouchMode(true);
                dj1Var3.f35318y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = dj1Var3.f35318y;
                int i16 = dj1Var3.f35274a;
                r0Var.f30417b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, k9Var, user);
                dj1Var3.f35318y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                dj1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                dj1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), dj1Var3.E.getPaint().getFontMetricsInt(), false));
                dj1Var3.E.setMaxLines(2);
                dj1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                dj1Var3.E.setTextColor(-1);
                dj1Var3.E.setGravity(1);
                dj1Var3.E.setImportantForAccessibility(2);
                dj1Var3.X.addView(dj1Var3.E, w7.a6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f30386a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f30386a[i17] = new TextView(activity);
                    frameLayout2.f30386a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f30386a[i17].setTextColor(-1);
                    frameLayout2.f30386a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f30386a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f30388c = frameLayout3;
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(frameLayout2, activity, o1Var);
                l2Var.setTextSize(1, 15.0f);
                l2Var.setTextColor(-1);
                l2Var.setGravity(1);
                l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                l2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(l2Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.a6.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(activity);
                frameLayout2.f30387b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.a6.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -1, 0));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new ig.w1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
                frameLayout2.d = s2Var;
                frameLayout2.addView(s2Var, w7.a6.d(-2.0f, -1));
                dj1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f43732a;
                frameLayout2.setImportantForAccessibility(4);
                dj1Var3.X.addView(dj1Var3.F, w7.a6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    cj1 cj1Var = new cj1(activity);
                    dj1Var3.G = cj1Var;
                    long j10 = sharedState.getUser().f19363id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        cj1Var.setVisibility(8);
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
                        org.telegram.ui.Components.m9 m9Var = cj1Var.f34962b;
                        m9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            m9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        m9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            cj1Var.setVisibility(8);
                        } else {
                            cj1Var.f34963c = new org.telegram.ui.Components.h11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            cj1Var.setVisibility(0);
                            cj1Var.invalidate();
                        }
                    }
                    dj1Var3.X.addView(dj1Var3.G, w7.a6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                dj1Var3.X.setClipChildren(false);
                dj1Var3.X.setClipToPadding(false);
                dj1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                dj1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                dj1Var3.Q = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                dj1Var3.U.setAlpha(0.0f);
                dj1Var3.Q.setVisibility(8);
                yi1Var.addView(dj1Var3.f35318y, w7.a6.a(204.0f, 0.0f, 93.0f, 0.0f, 0.0f, 204, 1));
                yi1Var.addView(dj1Var3.X, w7.a6.a(-2.0f, 0.0f, 135.0f, 0.0f, 0.0f, -1, 0));
                yi1Var.addView(dj1Var3.O, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                yi1Var.addView(dj1Var3.R, w7.a6.a(-2.0f, 0.0f, 118.0f, 0.0f, 0.0f, 304, 49));
                yi1Var.addView(dj1Var3.N, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                yi1Var.addView(dj1Var3.U, w7.a6.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 5));
                yi1Var.addView(dj1Var3.Q, w7.a6.a(-2.0f, 0.0f, 380.0f, 0.0f, 0.0f, -1, 3));
                dj1Var3.f35296j0 = new org.telegram.ui.Components.voip.p1(activity);
                dj1Var3.e = new org.telegram.ui.Components.voip.j3(activity, o1Var);
                dj1Var3.f35287f = new org.telegram.ui.Components.voip.j3(activity, o1Var);
                dj1Var3.h = new org.telegram.ui.Components.voip.j3(activity, o1Var);
                dj1Var3.f35302n = new org.telegram.ui.Components.voip.u2(activity, 52.0f);
                dj1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                dj1Var3.e.setScaleX(0.0f);
                dj1Var3.e.setScaleY(0.0f);
                dj1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                dj1Var3.f35287f.setTranslationY(AndroidUtilities.dp(100.0f));
                dj1Var3.f35287f.setScaleX(0.0f);
                dj1Var3.f35287f.setScaleY(0.0f);
                dj1Var3.f35287f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                dj1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                dj1Var3.h.setScaleX(0.0f);
                dj1Var3.h.setScaleY(0.0f);
                dj1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                dj1Var3.f35302n.setTranslationY(AndroidUtilities.dp(100.0f));
                dj1Var3.f35302n.setScaleX(0.0f);
                dj1Var3.f35302n.setScaleY(0.0f);
                dj1Var3.f35302n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                dj1Var3.f35296j0.addView(dj1Var3.e);
                dj1Var3.f35296j0.addView(dj1Var3.f35287f);
                dj1Var3.f35296j0.addView(dj1Var3.h);
                dj1Var3.f35296j0.addView(dj1Var3.f35302n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                dj1Var3.f35285e0 = eVar;
                eVar.setListener(new bj1(dj1Var3));
                dj1Var3.f35285e0.setScaleX(1.15f);
                dj1Var3.f35285e0.setScaleY(1.15f);
                yi1Var.addView(dj1Var3.f35296j0, w7.a6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                yi1Var.addView(dj1Var3.f35285e0, w7.a6.a(186.0f, f10, 0.0f, f10, 0.0f, -1, 80));
                ImageView imageView = new ImageView(activity);
                dj1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
                dj1Var3.I.setImageResource(R.drawable.msg_addcontact);
                dj1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                yi1Var.addView(dj1Var3.I, w7.a6.e(56, 56, 53));
                w7.c6.a(dj1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                dj1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
                dj1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                dj1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                dj1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                yi1Var.addView(dj1Var3.H, w7.a6.e(56, 56, 51));
                w7.c6.a(dj1Var3.H);
                ig.k kVar = new ig.k(activity, 5);
                dj1Var3.K = kVar;
                kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                dj1Var3.K.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
                dj1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                yi1Var.addView(dj1Var3.K, w7.a6.a(56.0f, 0.0f, 56.0f, 0.0f, 0.0f, 56, 53));
                dj1Var3.K.setAlpha(0.0f);
                dj1Var3.K.setOnClickListener(new oi1(dj1Var3, 5));
                dj1Var3.H.setOnClickListener(new oi1(dj1Var3, 6));
                dj1Var3.I.setOnClickListener(new bz0(10, dj1Var3, activity));
                if (dj1Var3.f35312u0.f30561b) {
                    dj1Var3.H.setVisibility(8);
                    dj1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f30175a = new HashMap();
                linearLayout.f30176b = new ArrayList();
                linearLayout.f30177c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f30180r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f30179n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                dj1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                dj1Var3.M0.setOnViewsUpdated(new ni1(dj1Var3, 5));
                yi1Var.addView(dj1Var3.M0, w7.a6.a(200.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 80));
                org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity, 3, o1Var, true);
                c3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                c3Var.K = alignment;
                c3Var.d = -1L;
                c3Var.f6801l0 = new ni1(dj1Var3, 6);
                c3Var.T = true;
                c3Var.h = AndroidUtilities.dp(320.0f);
                c3Var.e = true;
                c3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                c3Var.q(8.0f);
                dj1Var3.N0 = c3Var;
                c3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                yi1Var.addView(dj1Var3.N0, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 80));
                org.telegram.ui.Components.voip.c3 c3Var2 = new org.telegram.ui.Components.voip.c3(activity, 1, o1Var, false);
                c3Var2.p(true);
                c3Var2.K = alignment;
                c3Var2.d = 4000L;
                c3Var2.T = true;
                c3Var2.h = AndroidUtilities.dp(320.0f);
                c3Var2.e = true;
                c3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                c3Var2.q(8.0f);
                dj1Var3.O0 = c3Var2;
                c3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                yi1Var.addView(dj1Var3.O0, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                dj1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!dj1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        dj1Var3.U0 = z12;
                    }
                    dj1Var3.n();
                }
                vi1Var2.addView(yi1Var);
                if (z10) {
                    dj1Var3.F0 = 0.0f;
                    dj1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        dj1Var3.f35281c0.setStub(org.telegram.ui.Components.voip.k2.k().f30271s);
                        dj1Var3.f35283d0.setStub(org.telegram.ui.Components.voip.k2.k().f30270r);
                    }
                    dj1Var3.f35312u0.setAlpha(0.0f);
                    dj1Var3.G();
                    dj1Var3.E0 = true;
                    org.telegram.ui.Components.voip.k2.U = true;
                    if (org.telegram.ui.Components.voip.k2.W == null) {
                        dj1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new ni1(dj1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.k2.V.getClass();
                        throw null;
                    }
                } else {
                    dj1Var3.F0 = 1.0f;
                    dj1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && uf.b.a(activity) == 1) {
                    dj1 dj1Var4 = f35273n1;
                    rf.c cVar = new rf.c(activity, dj1Var4);
                    cVar.f44166c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.r2 r2Var3 = dj1Var4.f35281c0;
                    cVar.f44170j = r2Var3.d;
                    cVar.f44171k = r2Var3.getPlaceholderView();
                    dj1Var4.f35290g0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            ni1 ni1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            this.R0 = false;
            if (this.f35320z0 && this.f35317x0) {
                AndroidUtilities.runOnUIThread(ni1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f35315w0.isTouchExplorationEnabled()) {
                if (!this.f35303n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f35309s.announceForAccessibility(string);
            }
            if (!this.f35303n0) {
                if (this.f35304o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f35312u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f35287f.getLocationOnScreen(iArr);
                    wi1 wi1Var = new wi1(this, this.f35309s.getContext(), iArr[0], iArr[1]);
                    this.f35304o0 = wi1Var;
                    WindowInsets windowInsets = this.f35308r0;
                    if (windowInsets != null) {
                        wi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f35309s.addView(this.f35304o0);
                    return;
                }
                return;
            }
            this.f35283d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f35306q0 = this.f35305p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
                transitionSet.addTransition(duration.setInterpolator(esVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(esVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.j3.class, true);
                TransitionManager.beginDelayedTransition(this.f35296j0, transitionSet);
            }
            int i10 = this.f35305p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f35287f.setVisibility(8);
                this.h.setVisibility(8);
                this.f35302n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f35273n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f35303n0 || this.m0)) {
                    r(this.e, sharedInstance);
                    if (this.f35317x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f35287f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f35302n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f35302n.setOnClickListener(new oi1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f35303n0 || this.m0)) {
                        r(this.e, sharedInstance);
                        if (this.f35317x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f35287f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f35287f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f35302n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f30259f = 0;
                i11 = 16;
            }
            if (this.f35287f.getVisibility() == 0) {
                this.f35287f.f30259f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f30259f = i11;
                i11 += 16;
            }
            if (this.f35302n.getVisibility() == 0) {
                this.f35302n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dj1.D(boolean):void");
    }

    public final void E() {
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
        if (this.J != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void F() {
        this.f35298k0.setColor(i0.a.k(-16777216, (int) (this.f35319y0 * 102.0f * this.F0)));
        this.f35300l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        yi1 yi1Var = this.f35309s;
        if (yi1Var != null) {
            yi1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dj1.G():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.f35281c0;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.f35301m1 = true;
        G();
        ((WindowManager) this.f35277b.getSystemService("window")).removeView(this.f35312u0);
        this.f35312u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        vi1 vi1Var = this.f35312u0;
        vi1Var.getClass();
        ((WindowManager) this.f35277b.getSystemService("window")).addView(vi1Var, org.telegram.ui.Components.voip.v2.a());
        this.f35301m1 = false;
        G();
        this.f35312u0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.f35299k1;
        if (r2Var != null) {
            r2Var.d.release();
            this.f35299k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f35299k1;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f35299k1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void d(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.f35305p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f35283d0.d.release();
                this.f35281c0.d.release();
                this.f35278b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f35312u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f35318y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f35288f0 = booleanValue;
            if (booleanValue) {
                this.f35318y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f35281c0;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f35281c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.f35277b, false, true, false, false);
        this.f35299k1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f35299k1.d.setEnableHardwareScaler(true);
        this.f35299k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f35299k1;
        r2Var2.f30421a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xi1(this));
        View view = this.f35299k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f35299k1;
    }

    public final ValueAnimator j(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final float f10;
        final boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        this.Y.animate().cancel();
        float f19 = org.telegram.ui.Components.voip.k2.k().d.x + org.telegram.ui.Components.voip.k2.k().E;
        float f20 = org.telegram.ui.Components.voip.k2.k().d.y + org.telegram.ui.Components.voip.k2.k().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.k2.V.getClass();
        final float measuredWidth = f19 - ((this.f35281c0.getMeasuredWidth() - (this.f35281c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f35281c0.getMeasuredHeight() - (this.f35281c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f35303n0 && measuredWidth2 != 0) {
                f18 = (this.f35312u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f17 = (((org.telegram.ui.Components.voip.k2.k().f30268f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().f30268f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.k2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                measuredHeight = 1.0f;
                f17 = 1.0f;
                z11 = false;
                f18 = 0.0f;
            }
            float f22 = f18;
            f7 = f17;
            f10 = f22;
        } else {
            c10 = 0;
            float measuredWidth3 = f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            f10 = 0.25f;
            z11 = true;
        }
        final float f23 = measuredHeight;
        if (this.m0) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.k2.V.getClass();
            f12 = 1.0f;
            f21 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f24 = f12;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f23);
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f21);
            }
            this.f35281c0.setScaleX(0.25f);
            this.f35281c0.setScaleY(0.25f);
            this.f35281c0.setTranslationX(measuredWidth);
            this.f35281c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f35281c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f24) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        if (z10) {
            f14 = f24;
        } else {
            f14 = 0.0f;
        }
        if (z10) {
            f15 = 0.0f;
        } else {
            f15 = f24;
        }
        float[] fArr = new float[2];
        fArr[c10] = f14;
        fArr[1] = f15;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f24;
        }
        this.F0 = f16;
        F();
        final float f25 = f11;
        final float f26 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f27 = 1.0f - floatValue;
                dj1 dj1Var = dj1.this;
                dj1Var.F0 = f27;
                dj1Var.F();
                if (z11) {
                    float f28 = (f10 * floatValue) + (scaleX * f27);
                    dj1Var.Y.setScaleX(f28);
                    dj1Var.Y.setScaleY(f28);
                    dj1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f27));
                    dj1Var.Y.setTranslationY((f23 * floatValue) + (y3 * f27));
                    dj1Var.Y.setCornerRadius((dp * floatValue) + (f25 * f27));
                    dj1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f27));
                }
                float f29 = (f26 * floatValue) + (1.0f * f27);
                dj1Var.f35281c0.setScaleX(f29);
                dj1Var.f35281c0.setScaleY(f29);
                float f30 = 0.0f * f27;
                float f31 = (measuredWidth * floatValue) + f30;
                float f32 = (measuredHeight2 * floatValue) + f30;
                dj1Var.f35281c0.setTranslationX(f31);
                dj1Var.f35281c0.setTranslationY(f32);
                dj1Var.f35281c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f29);
                if (!dj1Var.Y.P) {
                    dj1Var.f35283d0.d(floatValue, false);
                }
                dj1Var.f35312u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f35274a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        rf.d dVar = this.f35290g0;
        if (dVar != null) {
            dVar.c();
            this.f35290g0 = null;
        }
        ug.m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f35317x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.y2 y2Var = this.f35314w;
            if (y2Var.K && z10 != y2Var.E) {
                y2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                y2Var.f30601c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x2(y2Var, 1));
                y2Var.f30601c.setInterpolator(org.telegram.ui.Components.es.f24771f);
                y2Var.f30601c.setDuration(200L);
                y2Var.f30601c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f35318y.getVisibility() == 0) {
                    this.f35318y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.es.f24771f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.es.f24772g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
                org.telegram.messenger.yh.s(translationY, esVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ri1(this, 3)).setInterpolator(esVar).start();
            } else {
                if (this.f35318y.getVisibility() == 0) {
                    this.f35318y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.es.f24771f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f24771f;
                duration.setInterpolator(esVar2).setListener(new vo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(esVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ri1(this, 4)).setDuration(250L).setInterpolator(esVar2).start();
            }
            this.f35306q0 = this.f35305p0;
            G();
        }
    }

    public final void m() {
        this.f35312u0.b();
    }

    public final void n() {
        this.f35283d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new si1(this));
        this.f35281c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ti1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f35278b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            wi1 wi1Var = this.f35304o0;
            if (wi1Var != null) {
                wi1Var.a(false, false);
            } else if (this.m0 && this.f35303n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f35275a0 = false;
                this.f35306q0 = this.f35305p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (uf.b.a(this.f35277b) > 0) {
                        if (!this.G0 && f35273n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f35273n1.f35312u0.getMeasuredHeight();
                                dj1 dj1Var = f35273n1;
                                org.telegram.ui.Components.voip.k2.l(dj1Var.f35277b, dj1Var.f35274a, dj1Var.f35312u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f35273n1.f35308r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                                    f35273n1.f35308r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.k2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
                                duration.setInterpolator(esVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                this.f35296j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
                                this.f35292h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
                                this.f35294i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
                                org.telegram.ui.Components.voip.k2.U = true;
                                this.E0 = true;
                                ValueAnimator j10 = j(false);
                                this.L0.lock();
                                j10.addListener(new ri1(this, 1));
                                j10.setDuration(350L);
                                j10.setInterpolator(esVar);
                                j10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.g5.A(this.f35277b, new ki1(this, 0), true).o();
                    return;
                }
                this.f35312u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f35306q0 = this.f35305p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f35306q0 = this.f35305p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f35290g0 == null && uf.b.a(this.f35277b) == 1) {
                rf.c cVar = new rf.c(this.f35277b, f35273n1);
                cVar.f44166c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.r2 r2Var = this.f35281c0;
                cVar.f44170j = r2Var.d;
                cVar.f44171k = r2Var.getPlaceholderView();
                this.f35290g0 = cVar.a();
            }
        } else {
            rf.d dVar = this.f35290g0;
            if (dVar != null) {
                dVar.c();
                this.f35290g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.b3 b3Var;
        if (i10 > 0) {
            this.f35297j1 = true;
        }
        if (this.F != null && (b3Var = this.v) != null) {
            int i11 = b3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f35297j1) {
                AndroidUtilities.runOnUIThread(new li1(this, i10, 0), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f35305p0;
        if (i11 != i10) {
            this.f35306q0 = i11;
            this.f35305p0 = i10;
            if (this.f35312u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f35306q0 = this.f35305p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f35287f.getVisibility() == 0) {
            this.f35285e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f35285e0;
            ValueAnimator valueAnimator = eVar.f30151b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f30151b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f35302n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f35287f.animate().cancel();
        this.f35285e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f35285e0;
        ValueAnimator valueAnimator2 = eVar2.f30151b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f30151b0 = null;
            eVar2.U.stop();
        }
        this.f35302n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f35287f.d(3, true, false);
        this.f35302n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f35287f.setVisibility(0);
        this.f35302n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f35287f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35285e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                dj1 dj1Var = dj1.this;
                dj1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                dj1Var.f35285e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                dj1Var.f35285e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f35285e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f35285e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f35285e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f35285e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ql0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ni1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        if (!this.f35303n0) {
            j3Var.d(2, false, false);
            j3Var.setOnBtnClickedListener(null);
            j3Var.setEnabled(false);
            return;
        }
        j3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            j3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            j3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        j3Var.setOnBtnClickedListener(new f7(this, voIPService, j3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        j3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = s1Var.f30458f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            s1Var.K = f7;
            s1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f30458f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = s1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            s1Var.f30458f0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f30459g0);
            s1Var.f30458f0.setDuration(150L);
            s1Var.f30458f0.start();
        }
        j3Var.setOnBtnClickedListener(new ki1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            j3Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            j3Var.d(5, true, false);
        } else {
            j3Var.d(5, false, false);
            i10 = 1;
            j3Var.setEnabled(true);
            j3Var.setOnBtnClickedListener(new ia(this, i10, j3Var, voIPService, 8));
        }
        i10 = i11;
        j3Var.setEnabled(true);
        j3Var.setOnBtnClickedListener(new ia(this, i10, j3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f35303n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f35303n0) {
                if (voIPService.isScreencast()) {
                    j3Var.d(3, false, z10);
                } else {
                    j3Var.d(3, false, z10);
                }
            } else {
                j3Var.d(3, true, z10);
            }
            j3Var.setOnBtnClickedListener(new ki1(this, 6));
            j3Var.setEnabled(true);
            return;
        }
        j3Var.d(3, true, false);
        j3Var.setOnClickListener(null);
        j3Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f35303n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f35318y.getTag() == null) {
                this.f35318y.animate().setListener(null).cancel();
                this.f35318y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f35318y.setAlpha(0.0f);
                        this.f35318y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f24771f).start();
                    } else {
                        this.f35318y.setAlpha(0.0f);
                        this.f35318y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f35318y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f24771f).start();
                    }
                } else if (z11) {
                    this.f35318y.setAlpha(0.0f);
                    this.f35318y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f35318y.setScaleX(0.1f);
                    this.f35318y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f35318y.getTag() != null) {
                this.f35318y.animate().setListener(null).cancel();
                this.f35318y.setTranslationY(0.0f);
                this.f35318y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.es.f24771f).setListener(new ri1(this, 7)).start();
            }
        } else {
            this.f35318y.animate().setListener(null).cancel();
            this.f35318y.setTranslationY(0.0f);
            this.f35318y.setAlpha(1.0f);
            this.f35318y.setScaleX(1.0f);
            this.f35318y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f35318y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f35318y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f35277b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(this.f35277b, 0, null);
        boolean[] zArr = new boolean[3];
        a2Var.R = LocaleController.getString(R.string.VoipFailed);
        a2Var.T = charSequence;
        a2Var.f19574l0 = LocaleController.getString(R.string.OK);
        a2Var.m0 = null;
        a2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) a2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(a2Var.e(org.telegram.ui.ActionBar.g6.f20139q7));
            }
        }
        a2Var.setCanceledOnTouchOutside(true);
        a2Var.setOnDismissListener(new v5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f35317x0);
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
                    org.telegram.ui.Components.voip.s1 s1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(s1Var, View.ALPHA, s1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.s1 s1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var2, View.SCALE_X, s1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.s1 s1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var3, View.SCALE_Y, s1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ri1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.es.f24771f);
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
                org.telegram.ui.Components.voip.s1 s1Var4 = this.Y;
                if (s1Var4.f30468y < 0.0f) {
                    s1Var4.d(1.0f, 1.0f);
                    this.f35275a0 = true;
                }
            }
            org.telegram.ui.Components.voip.s1 s1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            s1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f35275a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f21 f21Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f35317x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
            duration.setInterpolator(esVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(esVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(esVar).start();
            this.f35296j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar).start();
            this.f35292h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
            this.f35294i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35319y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(f21Var);
            this.P0.setDuration(150L).setInterpolator(esVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f35296j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f35317x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f24771f;
                translationY.setInterpolator(esVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(esVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.f35296j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.f35292h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar2).start();
                this.f35294i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f35319y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(f21Var);
                this.P0.setDuration(150L).setInterpolator(esVar2);
                this.P0.start();
                this.f35296j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f35317x0 = z10;
        vi1 vi1Var = this.f35312u0;
        if (!z10) {
            vi1Var.setSystemUiVisibility(vi1Var.getSystemUiVisibility() | 4);
        } else {
            vi1Var.setSystemUiVisibility(vi1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f35317x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.es.f24771f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

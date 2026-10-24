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
public final class nh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, tf.a {
    public static nh1 f39825n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.n2 F;
    public float F0;
    public mh1 G;
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
    public ug.l1 M;
    public org.telegram.ui.Components.voip.f2 M0;
    public ua1 N;
    public org.telegram.ui.Components.voip.b3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.b3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.m1 Q;
    public ei.m5 R;
    public boolean R0;
    public TextView S;
    public lk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public jh1 X;
    public float X0;
    public org.telegram.ui.Components.voip.s1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s1 Z;
    public float Z0;
    public final int f39826a;
    public boolean f39827a0;
    public boolean f39828a1;
    public Activity f39829b;
    public TextureViewRenderer f39830b0;
    public float f39831b1;
    public final TLRPC.User f39832c;
    public org.telegram.ui.Components.voip.q2 f39833c0;
    public float f39834c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.q2 f39835d0;
    public int f39836d1;
    public org.telegram.ui.Components.voip.i3 e;
    public org.telegram.ui.Components.voip.e f39837e0;
    public int f39838e1;
    public org.telegram.ui.Components.voip.i3 f39839f;
    public boolean f39840f0;
    public rf.d f39842g0;
    public boolean f39843g1;
    public org.telegram.ui.Components.voip.i3 h;
    public View f39844h0;
    public boolean f39845h1;
    public View f39846i0;
    public ValueAnimator f39847i1;
    public org.telegram.ui.Components.voip.p1 f39848j0;
    public boolean f39849j1;
    public org.telegram.ui.Components.voip.q2 f39851k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f39853m1;
    public kh1 f39854n;
    public boolean f39855n0;
    public gh1 f39856o0;
    public int f39857p0;
    public int f39858q0;
    public WindowInsets f39860r0;
    public ih1 f39861s;
    public boolean f39862s0;
    public float f39863t0;
    public fh1 f39864u0;
    public org.telegram.ui.Components.voip.a3 v;
    public int f39865v0;
    public org.telegram.ui.Components.voip.x2 f39866w;
    public AccessibilityManager f39867w0;
    public org.telegram.ui.Components.voip.c3 f39868x;
    public org.telegram.ui.Components.voip.r0 f39870y;
    public boolean f39872z0;
    public final org.telegram.ui.Components.voip.o1 f39859r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.u9[] V = new org.telegram.ui.Components.u9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f39850k0 = new Paint();
    public final Paint f39852l0 = new Paint();
    public boolean f39869x0 = true;
    public float f39871y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final f11 Q0 = new f11(this, 18);
    public final xg1 S0 = new xg1(this, 12);
    public final xg1 T0 = new xg1(this, 13);
    public float f39841f1 = 1.0f;

    public nh1(int i10) {
        this.f39826a = i10;
        this.f39832c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f39858q0 = -1;
        this.f39857p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(nh1 nh1Var) {
        nh1 nh1Var2;
        if (nh1Var.f39843g1) {
            nh1Var.f39843g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            nh1Var.f39847i1 = ofFloat;
            nh1Var2 = nh1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(nh1Var2, nh1Var.f39841f1, nh1Var.Y0, nh1Var.Z0, 1));
            nh1Var2.f39847i1.addListener(new bh1(nh1Var2, 0));
            nh1Var2.f39847i1.setDuration(350L);
            nh1Var2.f39847i1.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            nh1Var2.f39847i1.start();
        } else {
            nh1Var2 = nh1Var;
        }
        nh1Var2.f39845h1 = false;
        nh1Var2.f39828a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        nh1 nh1Var = f39825n1;
        if (nh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    nh1Var.f39864u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    nh1Var.q(new hf0(7));
                } else if (!nh1Var.f39829b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.d2.h(nh1Var.f39829b, new xg1(nh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    nh1Var.f39864u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    nh1Var.B();
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
        nh1 nh1Var = f39825n1;
        if (nh1Var != null && nh1Var.f39864u0.getParent() == null) {
            nh1 nh1Var2 = f39825n1;
            if (nh1Var2 != null) {
                nh1Var2.f39833c0.d.release();
                f39825n1.f39835d0.d.release();
                f39825n1.f39830b0.release();
                fh1 fh1Var = f39825n1.f39864u0;
                if (fh1Var != null) {
                    fh1Var.d();
                }
                f39825n1.k();
            }
            f39825n1 = null;
        }
        if (f39825n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                nh1 nh1Var3 = new nh1(i10);
                nh1Var3.f39829b = activity;
                f39825n1 = nh1Var3;
                fh1 fh1Var2 = new fh1(activity, !z10, nh1Var3);
                f39825n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f39825n1.getClass();
                fh1Var2.setLockOnScreen(f39825n1.J0);
                nh1Var3.f39864u0 = fh1Var2;
                ug1 ug1Var = new ug1(nh1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f45241a;
                r0.a0.i(fh1Var2, ug1Var);
                ((WindowManager) activity.getSystemService("window")).addView(fh1Var2, org.telegram.ui.Components.voip.u2.a());
                nh1Var3.f39863t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                nh1Var3.f39867w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                ih1 ih1Var = new ih1(nh1Var3, activity);
                ih1Var.setClipToPadding(false);
                ih1Var.setClipChildren(false);
                ih1Var.setBackgroundColor(-16777216);
                nh1Var3.F();
                nh1Var3.f39861s = ih1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = nh1Var3.f39859r;
                nh1Var3.v = new org.telegram.ui.Components.voip.a3(activity, z11, o1Var);
                org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(activity, false, true, false, false);
                nh1Var3.f39833c0 = q2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                q2Var.d.setScalingType(scalingType);
                nh1Var3.f39833c0.d.setEnableHardwareScaler(true);
                nh1Var3.f39833c0.d.setRotateTextureWithScreen(true);
                nh1Var3.f39833c0.f31800a0 = 1;
                ih1Var.addView(nh1Var3.v, w7.z5.c(-1.0f, -1));
                TLRPC.User user = nh1Var3.d;
                org.telegram.ui.Components.voip.x2 x2Var = new org.telegram.ui.Components.voip.x2(activity, user, o1Var);
                nh1Var3.f39866w = x2Var;
                ih1Var.addView(x2Var, w7.z5.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.k6.f21119a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31531a = new org.telegram.ui.Components.yw0(0);
                    }
                }
                nh1Var3.f39868x = view;
                ih1Var.addView((View) view, w7.z5.c(220.0f, -1));
                ih1Var.addView(nh1Var3.f39833c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.t9(orientation, new int[]{-14994098, -14328963}).f(ki.t1.Q(0.5f, 1), new xb1(nh1Var3, 1), 0L);
                org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
                nh1Var3.Y = s1Var;
                s1Var.setDelegate(new ug1(nh1Var3, 3));
                nh1Var3.Y.d(1.0f, 1.0f);
                nh1Var3.f39827a0 = true;
                org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(activity, true, false);
                nh1Var3.f39835d0 = q2Var2;
                q2Var2.d.setIsCamera(true);
                nh1Var3.f39835d0.d.setUseCameraRotation(true);
                nh1Var3.Y.setOnTapListener(new yg1(nh1Var3, 1));
                nh1Var3.f39835d0.d.setMirror(true);
                nh1Var3.Y.addView(nh1Var3.f39835d0);
                org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
                nh1Var3.Z = s1Var2;
                s1Var2.S = true;
                s1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                nh1Var3.f39830b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                nh1Var3.f39830b0.setIsCamera(false);
                nh1Var3.f39830b0.setFpsReduction(30.0f);
                nh1Var3.f39830b0.setScalingType(scalingType);
                nh1Var3.Z.addView(nh1Var3.f39830b0, w7.z5.e(-1, -2, 17));
                nh1Var3.Z.setOnTapListener(new yg1(nh1Var3, 2));
                nh1Var3.Z.setVisibility(8);
                ih1Var.addView(nh1Var3.Y, w7.z5.c(-2.0f, -2));
                ih1Var.addView(nh1Var3.Z);
                View view2 = new View(activity);
                nh1Var3.f39844h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                ih1Var.addView(nh1Var3.f39844h0, w7.z5.e(-1, 160, 80));
                View view3 = new View(activity);
                nh1Var3.f39846i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                ih1Var.addView(nh1Var3.f39846i0, w7.z5.e(-1, 160, 48));
                ua1 ua1Var = new ua1(nh1Var3, activity, 18);
                nh1Var3.N = ua1Var;
                ua1Var.setOrientation(0);
                nh1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                nh1Var3.N.setClipToPadding(false);
                nh1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                nh1Var3.N.setOnClickListener(new yg1(nh1Var3, 3));
                nh1Var3.P = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                nh1Var3.O = frameLayout;
                frameLayout.addView(nh1Var3.P, w7.z5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                nh1Var3.O.setVisibility(8);
                nh1Var3.O.setOnClickListener(new yg1(nh1Var3, 4));
                ei.m5 m5Var = new ei.m5(activity, o1Var);
                nh1Var3.R = m5Var;
                m5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                nh1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                nh1Var3.S.setTextSize(1, 15.0f);
                nh1Var3.S.setTypeface(AndroidUtilities.bold());
                nh1Var3.S.setTextColor(-1);
                nh1Var3.S.setGravity(17);
                lk lkVar = new lk(nh1Var3, activity, 5);
                nh1Var3.T = lkVar;
                lkVar.setTextSize(1, 15.0f);
                nh1Var3.T.setTextColor(-1);
                nh1Var3.T.setGravity(17);
                nh1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), nh1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                nh1Var3.R.setVisibility(8);
                nh1Var3.R.addView(nh1Var3.S);
                nh1Var3.R.addView(nh1Var3.T, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                nh1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(activity);
                    org.telegram.ui.Components.u9[] u9VarArr = nh1Var3.V;
                    u9VarArr[i15] = u9Var;
                    u9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ua1 ua1Var2 = nh1Var3.N;
                    org.telegram.ui.Components.u9 u9Var2 = u9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    ua1Var2.addView(u9Var2, w7.z5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                jh1 jh1Var = new jh1(nh1Var3, activity);
                nh1Var3.X = jh1Var;
                jh1Var.setOrientation(1);
                nh1Var3.X.setFocusable(true);
                nh1Var3.X.setFocusableInTouchMode(true);
                nh1Var3.f39870y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                f9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = nh1Var3.f39870y;
                int i16 = nh1Var3.f39826a;
                r0Var.f31818b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, f9Var, user);
                nh1Var3.f39870y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                nh1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                nh1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), nh1Var3.E.getPaint().getFontMetricsInt(), false));
                nh1Var3.E.setMaxLines(2);
                nh1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                nh1Var3.E.setTextColor(-1);
                nh1Var3.E.setGravity(1);
                nh1Var3.E.setImportantForAccessibility(2);
                nh1Var3.X.addView(nh1Var3.E, w7.z5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f31739a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f31739a[i17] = new TextView(activity);
                    frameLayout2.f31739a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f31739a[i17].setTextColor(-1);
                    frameLayout2.f31739a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f31739a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f31741c = frameLayout3;
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(frameLayout2, activity, o1Var);
                l2Var.setTextSize(1, 15.0f);
                l2Var.setTextColor(-1);
                l2Var.setGravity(1);
                l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                l2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(l2Var, w7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.z5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f31740b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.z5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new ig.u1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity);
                frameLayout2.d = r2Var;
                frameLayout2.addView(r2Var, w7.z5.c(-2.0f, -1));
                nh1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f45241a;
                frameLayout2.setImportantForAccessibility(4);
                nh1Var3.X.addView(nh1Var3.F, w7.z5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    mh1 mh1Var = new mh1(activity);
                    nh1Var3.G = mh1Var;
                    long j10 = sharedState.getUser().f20491id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        mh1Var.setVisibility(8);
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
                        org.telegram.ui.Components.h9 h9Var = mh1Var.f39595b;
                        h9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            h9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        h9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            mh1Var.setVisibility(8);
                        } else {
                            mh1Var.f39596c = new org.telegram.ui.Components.h11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            mh1Var.setVisibility(0);
                            mh1Var.invalidate();
                        }
                    }
                    nh1Var3.X.addView(nh1Var3.G, w7.z5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                nh1Var3.X.setClipChildren(false);
                nh1Var3.X.setClipToPadding(false);
                nh1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                nh1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                nh1Var3.Q = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                nh1Var3.U.setAlpha(0.0f);
                nh1Var3.Q.setVisibility(8);
                ih1Var.addView(nh1Var3.f39870y, w7.z5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.X, w7.z5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.O, w7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.R, w7.z5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.N, w7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.U, w7.z5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                ih1Var.addView(nh1Var3.Q, w7.z5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                nh1Var3.f39848j0 = new org.telegram.ui.Components.voip.p1(activity);
                nh1Var3.e = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                nh1Var3.f39839f = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                nh1Var3.h = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                nh1Var3.f39854n = new org.telegram.ui.Components.voip.t2(activity, 52.0f);
                nh1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                nh1Var3.e.setScaleX(0.0f);
                nh1Var3.e.setScaleY(0.0f);
                nh1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                nh1Var3.f39839f.setTranslationY(AndroidUtilities.dp(100.0f));
                nh1Var3.f39839f.setScaleX(0.0f);
                nh1Var3.f39839f.setScaleY(0.0f);
                nh1Var3.f39839f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                nh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                nh1Var3.h.setScaleX(0.0f);
                nh1Var3.h.setScaleY(0.0f);
                nh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                nh1Var3.f39854n.setTranslationY(AndroidUtilities.dp(100.0f));
                nh1Var3.f39854n.setScaleX(0.0f);
                nh1Var3.f39854n.setScaleY(0.0f);
                nh1Var3.f39854n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                nh1Var3.f39848j0.addView(nh1Var3.e);
                nh1Var3.f39848j0.addView(nh1Var3.f39839f);
                nh1Var3.f39848j0.addView(nh1Var3.h);
                nh1Var3.f39848j0.addView(nh1Var3.f39854n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                nh1Var3.f39837e0 = eVar;
                eVar.setListener(new lh1(nh1Var3));
                nh1Var3.f39837e0.setScaleX(1.15f);
                nh1Var3.f39837e0.setScaleY(1.15f);
                ih1Var.addView(nh1Var3.f39848j0, w7.z5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                ih1Var.addView(nh1Var3.f39837e0, w7.z5.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                nh1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(i0.a.o(-1, 76), 1, -1));
                nh1Var3.I.setImageResource(R.drawable.msg_addcontact);
                nh1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ih1Var.addView(nh1Var3.I, w7.z5.e(56, 56, 53));
                w7.b6.a(nh1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                nh1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.g0(i0.a.o(-1, 76), 1, -1));
                nh1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                nh1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                nh1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                ih1Var.addView(nh1Var3.H, w7.z5.e(56, 56, 51));
                w7.b6.a(nh1Var3.H);
                ig.k kVar = new ig.k(activity, 5);
                nh1Var3.K = kVar;
                kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                nh1Var3.K.setBackground(org.telegram.ui.ActionBar.k6.g0(i0.a.o(-1, 76), 1, -1));
                nh1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                ih1Var.addView(nh1Var3.K, w7.z5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                nh1Var3.K.setAlpha(0.0f);
                nh1Var3.K.setOnClickListener(new yg1(nh1Var3, 5));
                nh1Var3.H.setOnClickListener(new yg1(nh1Var3, 6));
                nh1Var3.I.setOnClickListener(new zd0(21, nh1Var3, activity));
                if (nh1Var3.f39864u0.f31928b) {
                    nh1Var3.H.setVisibility(8);
                    nh1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f31564a = new HashMap();
                linearLayout.f31565b = new ArrayList();
                linearLayout.f31566c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f31569r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f31568n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                nh1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                nh1Var3.M0.setOnViewsUpdated(new xg1(nh1Var3, 5));
                ih1Var.addView(nh1Var3.M0, w7.z5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.b3 b3Var = new org.telegram.ui.Components.voip.b3(activity, 3, o1Var, true);
                b3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                b3Var.K = alignment;
                b3Var.d = -1L;
                b3Var.f10097l0 = new xg1(nh1Var3, 6);
                b3Var.T = true;
                b3Var.h = AndroidUtilities.dp(320.0f);
                b3Var.e = true;
                b3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                b3Var.q(8.0f);
                nh1Var3.N0 = b3Var;
                b3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                ih1Var.addView(nh1Var3.N0, w7.z5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.b3 b3Var2 = new org.telegram.ui.Components.voip.b3(activity, 1, o1Var, false);
                b3Var2.p(true);
                b3Var2.K = alignment;
                b3Var2.d = 4000L;
                b3Var2.T = true;
                b3Var2.h = AndroidUtilities.dp(320.0f);
                b3Var2.e = true;
                b3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                b3Var2.q(8.0f);
                nh1Var3.O0 = b3Var2;
                b3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ih1Var.addView(nh1Var3.O0, w7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                nh1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!nh1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        nh1Var3.U0 = z12;
                    }
                    nh1Var3.n();
                }
                fh1Var2.addView(ih1Var);
                if (z10) {
                    nh1Var3.F0 = 0.0f;
                    nh1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        nh1Var3.f39833c0.setStub(org.telegram.ui.Components.voip.k2.k().f31658s);
                        nh1Var3.f39835d0.setStub(org.telegram.ui.Components.voip.k2.k().f31657r);
                    }
                    nh1Var3.f39864u0.setAlpha(0.0f);
                    nh1Var3.G();
                    nh1Var3.E0 = true;
                    org.telegram.ui.Components.voip.k2.U = true;
                    if (org.telegram.ui.Components.voip.k2.W == null) {
                        nh1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new xg1(nh1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.k2.V.getClass();
                        throw null;
                    }
                } else {
                    nh1Var3.F0 = 1.0f;
                    nh1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && uf.b.a(activity) == 1) {
                    nh1 nh1Var4 = f39825n1;
                    rf.c cVar = new rf.c(activity, nh1Var4);
                    cVar.f45678c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.q2 q2Var3 = nh1Var4.f39833c0;
                    cVar.f45682j = q2Var3.d;
                    cVar.f45683k = q2Var3.getPlaceholderView();
                    nh1Var4.f39842g0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            xg1 xg1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(xg1Var);
            this.R0 = false;
            if (this.f39872z0 && this.f39869x0) {
                AndroidUtilities.runOnUIThread(xg1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f39867w0.isTouchExplorationEnabled()) {
                if (!this.f39855n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f39861s.announceForAccessibility(string);
            }
            if (!this.f39855n0) {
                if (this.f39856o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f39864u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f39839f.getLocationOnScreen(iArr);
                    gh1 gh1Var = new gh1(this, this.f39861s.getContext(), iArr[0], iArr[1]);
                    this.f39856o0 = gh1Var;
                    WindowInsets windowInsets = this.f39860r0;
                    if (windowInsets != null) {
                        gh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f39861s.addView(this.f39856o0);
                    return;
                }
                return;
            }
            this.f39835d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f39858q0 = this.f39857p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
                transitionSet.addTransition(duration.setInterpolator(zrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(zrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.t2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.i3.class, true);
                TransitionManager.beginDelayedTransition(this.f39848j0, transitionSet);
            }
            int i10 = this.f39857p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f39839f.setVisibility(8);
                this.h.setVisibility(8);
                this.f39854n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f39825n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f39855n0 || this.m0)) {
                    r(this.e, sharedInstance);
                    if (this.f39869x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f39839f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f39854n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f39854n.setOnClickListener(new yg1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f39855n0 || this.m0)) {
                        r(this.e, sharedInstance);
                        if (this.f39869x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f39839f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f39839f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f39854n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f31630f = 0;
                i11 = 16;
            }
            if (this.f39839f.getVisibility() == 0) {
                this.f39839f.f31630f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f31630f = i11;
                i11 += 16;
            }
            if (this.f39854n.getVisibility() == 0) {
                this.f39854n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nh1.D(boolean):void");
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
        this.f39850k0.setColor(i0.a.o(-16777216, (int) (this.f39871y0 * 102.0f * this.F0)));
        this.f39852l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        ih1 ih1Var = this.f39861s;
        if (ih1Var != null) {
            ih1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nh1.G():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.q2 q2Var = this.f39833c0;
        if (q2Var != null) {
            q2Var.d.clearFirstFrame();
        }
        this.f39853m1 = true;
        G();
        ((WindowManager) this.f39829b.getSystemService("window")).removeView(this.f39864u0);
        this.f39864u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        fh1 fh1Var = this.f39864u0;
        fh1Var.getClass();
        ((WindowManager) this.f39829b.getSystemService("window")).addView(fh1Var, org.telegram.ui.Components.voip.u2.a());
        this.f39853m1 = false;
        G();
        this.f39864u0.invalidate();
        org.telegram.ui.Components.voip.q2 q2Var = this.f39851k1;
        if (q2Var != null) {
            q2Var.d.release();
            this.f39851k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.q2 q2Var = this.f39851k1;
        if (q2Var != null && q2Var.d.isAvailable()) {
            return this.f39851k1.d.getBitmap();
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
            if (this.f39857p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f39835d0.d.release();
                this.f39833c0.d.release();
                this.f39830b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f39864u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f39870y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f39840f0 = booleanValue;
            if (booleanValue) {
                this.f39870y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.q2 q2Var = this.f39833c0;
        if (q2Var != null && q2Var.d.isAvailable()) {
            return this.f39833c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(this.f39829b, false, true, false, false);
        this.f39851k1 = q2Var;
        q2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f39851k1.d.setEnableHardwareScaler(true);
        this.f39851k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.q2 q2Var2 = this.f39851k1;
        q2Var2.f31800a0 = 1;
        q2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new hh1(this));
        View view = this.f39851k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f39851k1;
    }

    public final ValueAnimator j(boolean z10) {
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
        float f19 = org.telegram.ui.Components.voip.k2.k().d.x + org.telegram.ui.Components.voip.k2.k().E;
        float f20 = org.telegram.ui.Components.voip.k2.k().d.y + org.telegram.ui.Components.voip.k2.k().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.k2.V.getClass();
        final float measuredWidth2 = f19 - ((this.f39833c0.getMeasuredWidth() - (this.f39833c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f39833c0.getMeasuredHeight() - (this.f39833c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f39855n0 && measuredWidth3 != 0) {
                f18 = (this.f39864u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.b1.x(org.telegram.ui.Components.voip.k2.k().f31655f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.k2.k().f31655f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                f17 = org.telegram.ui.Cells.b1.x(org.telegram.ui.Components.voip.k2.k().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.k2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
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
            f11 = AndroidUtilities.dp(f7);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.k2.V.getClass();
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
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f21);
            }
            this.f39833c0.setScaleX(0.25f);
            this.f39833c0.setScaleY(0.25f);
            this.f39833c0.setTranslationX(measuredWidth2);
            this.f39833c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f39833c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f23) / 0.25f);
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
                nh1 nh1Var = nh1.this;
                nh1Var.F0 = f25;
                nh1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    nh1Var.Y.setScaleX(f26);
                    nh1Var.Y.setScaleY(f26);
                    nh1Var.Y.setTranslationX((f22 * floatValue) + (x10 * f25));
                    nh1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    nh1Var.Y.setCornerRadius((dp * floatValue) + (f11 * f25));
                    nh1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                nh1Var.f39833c0.setScaleX(f27);
                nh1Var.f39833c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                nh1Var.f39833c0.setTranslationX(f29);
                nh1Var.f39833c0.setTranslationY(f30);
                nh1Var.f39833c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f27);
                if (!nh1Var.Y.P) {
                    nh1Var.f39835d0.d(floatValue, false);
                }
                nh1Var.f39864u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f39826a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        rf.d dVar = this.f39842g0;
        if (dVar != null) {
            dVar.c();
            this.f39842g0 = null;
        }
        ug.l1 l1Var = this.M;
        if (l1Var != null) {
            l1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f39869x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.x2 x2Var = this.f39866w;
            if (x2Var.K && z10 != x2Var.E) {
                x2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                x2Var.f31979c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w2(x2Var, 1));
                x2Var.f31979c.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                x2Var.f31979c.setDuration(200L);
                x2Var.f31979c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f39870y.getVisibility() == 0) {
                    this.f39870y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.zr.f33338g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
                org.telegram.messenger.tl.t(translationY, zrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new bh1(this, 3)).setInterpolator(zrVar).start();
            } else {
                if (this.f39870y.getVisibility() == 0) {
                    this.f39870y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.zr zrVar2 = org.telegram.ui.Components.zr.f33337f;
                duration.setInterpolator(zrVar2).setListener(new ho(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(zrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new bh1(this, 4)).setDuration(250L).setInterpolator(zrVar2).start();
            }
            this.f39858q0 = this.f39857p0;
            G();
        }
    }

    public final void m() {
        this.f39864u0.b();
    }

    public final void n() {
        this.f39835d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ch1(this));
        this.f39833c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f39830b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            gh1 gh1Var = this.f39856o0;
            if (gh1Var != null) {
                gh1Var.a(false, false);
            } else if (this.m0 && this.f39855n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f39827a0 = false;
                this.f39858q0 = this.f39857p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (uf.b.a(this.f39829b) > 0) {
                        if (!this.G0 && f39825n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f39825n1.f39864u0.getMeasuredHeight();
                                nh1 nh1Var = f39825n1;
                                org.telegram.ui.Components.voip.k2.l(nh1Var.f39829b, nh1Var.f39826a, nh1Var.f39864u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f39825n1.f39860r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                                    f39825n1.f39860r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.k2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
                                duration.setInterpolator(zrVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
                                this.f39848j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(zrVar).start();
                                this.f39844h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(zrVar).start();
                                this.f39846i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(zrVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(zrVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(zrVar).start();
                                org.telegram.ui.Components.voip.k2.U = true;
                                this.E0 = true;
                                ValueAnimator j10 = j(false);
                                this.L0.lock();
                                j10.addListener(new bh1(this, 1));
                                j10.setDuration(350L);
                                j10.setInterpolator(zrVar);
                                j10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.d5.A(this.f39829b, new ug1(this, 0), true).p();
                    return;
                }
                this.f39864u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f39858q0 = this.f39857p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f39858q0 = this.f39857p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f39842g0 == null && uf.b.a(this.f39829b) == 1) {
                rf.c cVar = new rf.c(this.f39829b, f39825n1);
                cVar.f45678c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.q2 q2Var = this.f39833c0;
                cVar.f45682j = q2Var.d;
                cVar.f45683k = q2Var.getPlaceholderView();
                this.f39842g0 = cVar.a();
            }
        } else {
            rf.d dVar = this.f39842g0;
            if (dVar != null) {
                dVar.c();
                this.f39842g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.a3 a3Var;
        if (i10 > 0) {
            this.f39849j1 = true;
        }
        if (this.F != null && (a3Var = this.v) != null) {
            int i11 = a3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f39849j1) {
                AndroidUtilities.runOnUIThread(new vg1(this, i10, 0), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f39857p0;
        if (i11 != i10) {
            this.f39858q0 = i11;
            this.f39857p0 = i10;
            if (this.f39864u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f39858q0 = this.f39857p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f39839f.getVisibility() == 0) {
            this.f39837e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f39837e0;
            ValueAnimator valueAnimator = eVar.f31541b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31541b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f39854n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f39839f.animate().cancel();
        this.f39837e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f39837e0;
        ValueAnimator valueAnimator2 = eVar2.f31541b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31541b0 = null;
            eVar2.U.stop();
        }
        this.f39854n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f39839f.d(3, true, false);
        this.f39854n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f39839f.setVisibility(0);
        this.f39854n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f39839f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39837e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                nh1 nh1Var = nh1.this;
                nh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                nh1Var.f39837e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                nh1Var.f39837e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f39837e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f39837e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f39837e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f39837e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.pl0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new xg1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService) {
        if (!this.f39855n0) {
            i3Var.d(2, false, false);
            i3Var.setOnBtnClickedListener(null);
            i3Var.setEnabled(false);
            return;
        }
        i3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            i3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            i3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        i3Var.setOnBtnClickedListener(new e7(this, voIPService, i3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService, boolean z10) {
        i3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = s1Var.f31850f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            s1Var.K = f7;
            s1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f31850f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = s1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            s1Var.f31850f0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f31851g0);
            s1Var.f31850f0.setDuration(150L);
            s1Var.f31850f0.start();
        }
        i3Var.setOnBtnClickedListener(new ug1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            i3Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            i3Var.d(5, true, false);
        } else {
            i3Var.d(5, false, false);
            i10 = 1;
            i3Var.setEnabled(true);
            i3Var.setOnBtnClickedListener(new fa(this, i10, i3Var, voIPService, 8));
        }
        i10 = i11;
        i3Var.setEnabled(true);
        i3Var.setOnBtnClickedListener(new fa(this, i10, i3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f39855n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f39855n0) {
                if (voIPService.isScreencast()) {
                    i3Var.d(3, false, z10);
                } else {
                    i3Var.d(3, false, z10);
                }
            } else {
                i3Var.d(3, true, z10);
            }
            i3Var.setOnBtnClickedListener(new ug1(this, 6));
            i3Var.setEnabled(true);
            return;
        }
        i3Var.d(3, true, false);
        i3Var.setOnClickListener(null);
        i3Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f39855n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f39870y.getTag() == null) {
                this.f39870y.animate().setListener(null).cancel();
                this.f39870y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f39870y.setAlpha(0.0f);
                        this.f39870y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
                    } else {
                        this.f39870y.setAlpha(0.0f);
                        this.f39870y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f39870y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
                    }
                } else if (z11) {
                    this.f39870y.setAlpha(0.0f);
                    this.f39870y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f39870y.setScaleX(0.1f);
                    this.f39870y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f39870y.getTag() != null) {
                this.f39870y.animate().setListener(null).cancel();
                this.f39870y.setTranslationY(0.0f);
                this.f39870y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.zr.f33337f).setListener(new bh1(this, 7)).start();
            }
        } else {
            this.f39870y.animate().setListener(null).cancel();
            this.f39870y.setTranslationY(0.0f);
            this.f39870y.setAlpha(1.0f);
            this.f39870y.setScaleX(1.0f);
            this.f39870y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f39870y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f39870y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f39829b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.f39829b, 0, null);
        boolean[] zArr = new boolean[3];
        c2Var.R = LocaleController.getString(R.string.VoipFailed);
        c2Var.T = charSequence;
        c2Var.f20771n0 = LocaleController.getString(R.string.OK);
        c2Var.f20772o0 = null;
        c2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, c2Var.f20768k1);
            }
        }
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnDismissListener(new v5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f39869x0);
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
                    animatorSet3.addListener(new bh1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.zr.f33337f);
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
                if (s1Var4.f31860y < 0.0f) {
                    s1Var4.d(1.0f, 1.0f);
                    this.f39827a0 = true;
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
            this.f39827a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f11 f11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f39869x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
            duration.setInterpolator(zrVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(zrVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(zrVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(zrVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(zrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(zrVar).start();
            this.f39848j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(zrVar).start();
            this.f39844h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
            this.f39846i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39871y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(f11Var);
            this.P0.setDuration(150L).setInterpolator(zrVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f39848j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f39869x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.zr zrVar2 = org.telegram.ui.Components.zr.f33337f;
                translationY.setInterpolator(zrVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(zrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.f39848j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.f39844h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar2).start();
                this.f39846i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f39871y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(f11Var);
                this.P0.setDuration(150L).setInterpolator(zrVar2);
                this.P0.start();
                this.f39848j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f39869x0 = z10;
        fh1 fh1Var = this.f39864u0;
        if (!z10) {
            fh1Var.setSystemUiVisibility(fh1Var.getSystemUiVisibility() | 4);
        } else {
            fh1Var.setSystemUiVisibility(fh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f39869x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

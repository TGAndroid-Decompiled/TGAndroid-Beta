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
public final class jh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, tf.a {
    public static jh1 f38171n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.n2 F;
    public float F0;
    public ih1 G;
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
    public sa1 N;
    public org.telegram.ui.Components.voip.b3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.b3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.m1 Q;
    public ei.m5 R;
    public boolean R0;
    public TextView S;
    public mk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public fh1 X;
    public float X0;
    public org.telegram.ui.Components.voip.s1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s1 Z;
    public float Z0;
    public final int f38172a;
    public boolean f38173a0;
    public boolean f38174a1;
    public Activity f38175b;
    public TextureViewRenderer f38176b0;
    public float f38177b1;
    public final TLRPC.User f38178c;
    public org.telegram.ui.Components.voip.q2 f38179c0;
    public float f38180c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.q2 f38181d0;
    public int f38182d1;
    public org.telegram.ui.Components.voip.i3 e;
    public org.telegram.ui.Components.voip.e f38183e0;
    public int f38184e1;
    public org.telegram.ui.Components.voip.i3 f38185f;
    public boolean f38186f0;
    public rf.d f38188g0;
    public boolean f38189g1;
    public org.telegram.ui.Components.voip.i3 h;
    public View f38190h0;
    public boolean f38191h1;
    public View f38192i0;
    public ValueAnimator f38193i1;
    public org.telegram.ui.Components.voip.p1 f38194j0;
    public boolean f38195j1;
    public org.telegram.ui.Components.voip.q2 f38197k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f38199m1;
    public gh1 f38200n;
    public boolean f38201n0;
    public ch1 f38202o0;
    public int f38203p0;
    public int f38204q0;
    public WindowInsets f38206r0;
    public eh1 f38207s;
    public boolean f38208s0;
    public float f38209t0;
    public bh1 f38210u0;
    public org.telegram.ui.Components.voip.a3 v;
    public int f38211v0;
    public org.telegram.ui.Components.voip.x2 f38212w;
    public AccessibilityManager f38213w0;
    public org.telegram.ui.Components.voip.c3 f38214x;
    public org.telegram.ui.Components.voip.r0 f38216y;
    public boolean f38218z0;
    public final org.telegram.ui.Components.voip.o1 f38205r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.w9[] V = new org.telegram.ui.Components.w9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f38196k0 = new Paint();
    public final Paint f38198l0 = new Paint();
    public boolean f38215x0 = true;
    public float f38217y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final e11 Q0 = new e11(this, 18);
    public final tg1 S0 = new tg1(this, 12);
    public final tg1 T0 = new tg1(this, 13);
    public float f38187f1 = 1.0f;

    public jh1(int i10) {
        this.f38172a = i10;
        this.f38178c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f38204q0 = -1;
        this.f38203p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(jh1 jh1Var) {
        jh1 jh1Var2;
        if (jh1Var.f38189g1) {
            jh1Var.f38189g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            jh1Var.f38193i1 = ofFloat;
            jh1Var2 = jh1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(jh1Var2, jh1Var.f38187f1, jh1Var.Y0, jh1Var.Z0, 1));
            jh1Var2.f38193i1.addListener(new xg1(jh1Var2, 0));
            jh1Var2.f38193i1.setDuration(350L);
            jh1Var2.f38193i1.setInterpolator(org.telegram.ui.Components.bs.f25030f);
            jh1Var2.f38193i1.start();
        } else {
            jh1Var2 = jh1Var;
        }
        jh1Var2.f38191h1 = false;
        jh1Var2.f38174a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        jh1 jh1Var = f38171n1;
        if (jh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    jh1Var.f38210u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    jh1Var.q(new ff0(7));
                } else if (!jh1Var.f38175b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.d2.h(jh1Var.f38175b, new tg1(jh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    jh1Var.f38210u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    jh1Var.B();
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
        jh1 jh1Var = f38171n1;
        if (jh1Var != null && jh1Var.f38210u0.getParent() == null) {
            jh1 jh1Var2 = f38171n1;
            if (jh1Var2 != null) {
                jh1Var2.f38179c0.d.release();
                f38171n1.f38181d0.d.release();
                f38171n1.f38176b0.release();
                bh1 bh1Var = f38171n1.f38210u0;
                if (bh1Var != null) {
                    bh1Var.d();
                }
                f38171n1.k();
            }
            f38171n1 = null;
        }
        if (f38171n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                jh1 jh1Var3 = new jh1(i10);
                jh1Var3.f38175b = activity;
                f38171n1 = jh1Var3;
                bh1 bh1Var2 = new bh1(activity, !z10, jh1Var3);
                f38171n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f38171n1.getClass();
                bh1Var2.setLockOnScreen(f38171n1.J0);
                jh1Var3.f38210u0 = bh1Var2;
                rg1 rg1Var = new rg1(jh1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f44844a;
                r0.a0.i(bh1Var2, rg1Var);
                ((WindowManager) activity.getSystemService("window")).addView(bh1Var2, org.telegram.ui.Components.voip.u2.a());
                jh1Var3.f38209t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                jh1Var3.f38213w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                eh1 eh1Var = new eh1(jh1Var3, activity);
                eh1Var.setClipToPadding(false);
                eh1Var.setClipChildren(false);
                eh1Var.setBackgroundColor(-16777216);
                jh1Var3.F();
                jh1Var3.f38207s = eh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = jh1Var3.f38205r;
                jh1Var3.v = new org.telegram.ui.Components.voip.a3(activity, z11, o1Var);
                org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(activity, false, true, false, false);
                jh1Var3.f38179c0 = q2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                q2Var.d.setScalingType(scalingType);
                jh1Var3.f38179c0.d.setEnableHardwareScaler(true);
                jh1Var3.f38179c0.d.setRotateTextureWithScreen(true);
                jh1Var3.f38179c0.f31684a0 = 1;
                eh1Var.addView(jh1Var3.v, w7.z5.d(-1.0f, -1));
                TLRPC.User user = jh1Var3.d;
                org.telegram.ui.Components.voip.x2 x2Var = new org.telegram.ui.Components.voip.x2(activity, user, o1Var);
                jh1Var3.f38212w = x2Var;
                eh1Var.addView(x2Var, w7.z5.d(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.h6.f20921a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31415a = new org.telegram.ui.Components.uw0(0);
                    }
                }
                jh1Var3.f38214x = view;
                eh1Var.addView((View) view, w7.z5.d(220.0f, -1));
                eh1Var.addView(jh1Var3.f38179c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.v9(orientation, new int[]{-14994098, -14328963}).f(ki.t1.u(0.5f, 1), new ub1(jh1Var3, 1), 0L);
                org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
                jh1Var3.Y = s1Var;
                s1Var.setDelegate(new rg1(jh1Var3, 3));
                jh1Var3.Y.d(1.0f, 1.0f);
                jh1Var3.f38173a0 = true;
                org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(activity, true, false);
                jh1Var3.f38181d0 = q2Var2;
                q2Var2.d.setIsCamera(true);
                jh1Var3.f38181d0.d.setUseCameraRotation(true);
                jh1Var3.Y.setOnTapListener(new ug1(jh1Var3, 1));
                jh1Var3.f38181d0.d.setMirror(true);
                jh1Var3.Y.addView(jh1Var3.f38181d0);
                org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
                jh1Var3.Z = s1Var2;
                s1Var2.S = true;
                s1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                jh1Var3.f38176b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                jh1Var3.f38176b0.setIsCamera(false);
                jh1Var3.f38176b0.setFpsReduction(30.0f);
                jh1Var3.f38176b0.setScalingType(scalingType);
                jh1Var3.Z.addView(jh1Var3.f38176b0, w7.z5.e(-1, -2, 17));
                jh1Var3.Z.setOnTapListener(new ug1(jh1Var3, 2));
                jh1Var3.Z.setVisibility(8);
                eh1Var.addView(jh1Var3.Y, w7.z5.d(-2.0f, -2));
                eh1Var.addView(jh1Var3.Z);
                View view2 = new View(activity);
                jh1Var3.f38190h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.b.o(-16777216, 127)}));
                eh1Var.addView(jh1Var3.f38190h0, w7.z5.e(-1, 160, 80));
                View view3 = new View(activity);
                jh1Var3.f38192i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.b.o(-16777216, 102), 0}));
                eh1Var.addView(jh1Var3.f38192i0, w7.z5.e(-1, 160, 48));
                sa1 sa1Var = new sa1(jh1Var3, activity, 18);
                jh1Var3.N = sa1Var;
                sa1Var.setOrientation(0);
                jh1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                jh1Var3.N.setClipToPadding(false);
                jh1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                jh1Var3.N.setOnClickListener(new ug1(jh1Var3, 3));
                jh1Var3.P = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                jh1Var3.O = frameLayout;
                frameLayout.addView(jh1Var3.P, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 3));
                jh1Var3.O.setVisibility(8);
                jh1Var3.O.setOnClickListener(new ug1(jh1Var3, 4));
                ei.m5 m5Var = new ei.m5(activity, o1Var);
                jh1Var3.R = m5Var;
                m5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                jh1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                jh1Var3.S.setTextSize(1, 15.0f);
                jh1Var3.S.setTypeface(AndroidUtilities.bold());
                jh1Var3.S.setTextColor(-1);
                jh1Var3.S.setGravity(17);
                mk mkVar = new mk(jh1Var3, activity, 5);
                jh1Var3.T = mkVar;
                mkVar.setTextSize(1, 15.0f);
                jh1Var3.T.setTextColor(-1);
                jh1Var3.T.setGravity(17);
                jh1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), jh1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                jh1Var3.R.setVisibility(8);
                jh1Var3.R.addView(jh1Var3.S);
                jh1Var3.R.addView(jh1Var3.T, w7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                jh1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
                    org.telegram.ui.Components.w9[] w9VarArr = jh1Var3.V;
                    w9VarArr[i15] = w9Var;
                    w9VarArr[i15].getImageReceiver().setAspectFit(true);
                    sa1 sa1Var2 = jh1Var3.N;
                    org.telegram.ui.Components.w9 w9Var2 = w9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    sa1Var2.addView(w9Var2, w7.z5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                fh1 fh1Var = new fh1(jh1Var3, activity);
                jh1Var3.X = fh1Var;
                fh1Var.setOrientation(1);
                jh1Var3.X.setFocusable(true);
                jh1Var3.X.setFocusableInTouchMode(true);
                jh1Var3.f38216y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = jh1Var3.f38216y;
                int i16 = jh1Var3.f38172a;
                r0Var.f31702b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, h9Var, user);
                jh1Var3.f38216y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                jh1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                jh1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), jh1Var3.E.getPaint().getFontMetricsInt(), false));
                jh1Var3.E.setMaxLines(2);
                jh1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                jh1Var3.E.setTextColor(-1);
                jh1Var3.E.setGravity(1);
                jh1Var3.E.setImportantForAccessibility(2);
                jh1Var3.X.addView(jh1Var3.E, w7.z5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f31623a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f31623a[i17] = new TextView(activity);
                    frameLayout2.f31623a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f31623a[i17].setTextColor(-1);
                    frameLayout2.f31623a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f31623a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f31625c = frameLayout3;
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(frameLayout2, activity, o1Var);
                l2Var.setTextSize(1, 15.0f);
                l2Var.setTextColor(-1);
                l2Var.setGravity(1);
                l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                l2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(l2Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.z5.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(activity);
                frameLayout2.f31624b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.z5.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -1, 0));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new ig.t1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity);
                frameLayout2.d = r2Var;
                frameLayout2.addView(r2Var, w7.z5.d(-2.0f, -1));
                jh1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f44844a;
                frameLayout2.setImportantForAccessibility(4);
                jh1Var3.X.addView(jh1Var3.F, w7.z5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    ih1 ih1Var = new ih1(activity);
                    jh1Var3.G = ih1Var;
                    long j10 = sharedState.getUser().f20419id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        ih1Var.setVisibility(8);
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
                        org.telegram.ui.Components.j9 j9Var = ih1Var.f37898b;
                        j9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            j9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        j9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            ih1Var.setVisibility(8);
                        } else {
                            ih1Var.f37899c = new org.telegram.ui.Components.d11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            ih1Var.setVisibility(0);
                            ih1Var.invalidate();
                        }
                    }
                    jh1Var3.X.addView(jh1Var3.G, w7.z5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                jh1Var3.X.setClipChildren(false);
                jh1Var3.X.setClipToPadding(false);
                jh1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                jh1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                jh1Var3.Q = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                jh1Var3.U.setAlpha(0.0f);
                jh1Var3.Q.setVisibility(8);
                eh1Var.addView(jh1Var3.f38216y, w7.z5.a(204.0f, 0.0f, 93.0f, 0.0f, 0.0f, 204, 1));
                eh1Var.addView(jh1Var3.X, w7.z5.a(-2.0f, 0.0f, 135.0f, 0.0f, 0.0f, -1, 0));
                eh1Var.addView(jh1Var3.O, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                eh1Var.addView(jh1Var3.R, w7.z5.a(-2.0f, 0.0f, 118.0f, 0.0f, 0.0f, 304, 49));
                eh1Var.addView(jh1Var3.N, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                eh1Var.addView(jh1Var3.U, w7.z5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 5));
                eh1Var.addView(jh1Var3.Q, w7.z5.a(-2.0f, 0.0f, 380.0f, 0.0f, 0.0f, -1, 3));
                jh1Var3.f38194j0 = new org.telegram.ui.Components.voip.p1(activity);
                jh1Var3.e = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                jh1Var3.f38185f = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                jh1Var3.h = new org.telegram.ui.Components.voip.i3(activity, o1Var);
                jh1Var3.f38200n = new org.telegram.ui.Components.voip.t2(activity, 52.0f);
                jh1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                jh1Var3.e.setScaleX(0.0f);
                jh1Var3.e.setScaleY(0.0f);
                jh1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                jh1Var3.f38185f.setTranslationY(AndroidUtilities.dp(100.0f));
                jh1Var3.f38185f.setScaleX(0.0f);
                jh1Var3.f38185f.setScaleY(0.0f);
                jh1Var3.f38185f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                jh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                jh1Var3.h.setScaleX(0.0f);
                jh1Var3.h.setScaleY(0.0f);
                jh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                jh1Var3.f38200n.setTranslationY(AndroidUtilities.dp(100.0f));
                jh1Var3.f38200n.setScaleX(0.0f);
                jh1Var3.f38200n.setScaleY(0.0f);
                jh1Var3.f38200n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                jh1Var3.f38194j0.addView(jh1Var3.e);
                jh1Var3.f38194j0.addView(jh1Var3.f38185f);
                jh1Var3.f38194j0.addView(jh1Var3.h);
                jh1Var3.f38194j0.addView(jh1Var3.f38200n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                jh1Var3.f38183e0 = eVar;
                eVar.setListener(new hh1(jh1Var3));
                jh1Var3.f38183e0.setScaleX(1.15f);
                jh1Var3.f38183e0.setScaleY(1.15f);
                eh1Var.addView(jh1Var3.f38194j0, w7.z5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                eh1Var.addView(jh1Var3.f38183e0, w7.z5.a(186.0f, f10, 0.0f, f10, 0.0f, -1, 80));
                ImageView imageView = new ImageView(activity);
                jh1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.b.o(-1, 76), 1, -1));
                jh1Var3.I.setImageResource(R.drawable.msg_addcontact);
                jh1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                eh1Var.addView(jh1Var3.I, w7.z5.e(56, 56, 53));
                w7.b6.a(jh1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                jh1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.b.o(-1, 76), 1, -1));
                jh1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                jh1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                jh1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                eh1Var.addView(jh1Var3.H, w7.z5.e(56, 56, 51));
                w7.b6.a(jh1Var3.H);
                ig.k kVar = new ig.k(activity, 5);
                jh1Var3.K = kVar;
                kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                jh1Var3.K.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.b.o(-1, 76), 1, -1));
                jh1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                eh1Var.addView(jh1Var3.K, w7.z5.a(56.0f, 0.0f, 56.0f, 0.0f, 0.0f, 56, 53));
                jh1Var3.K.setAlpha(0.0f);
                jh1Var3.K.setOnClickListener(new ug1(jh1Var3, 5));
                jh1Var3.H.setOnClickListener(new ug1(jh1Var3, 6));
                jh1Var3.I.setOnClickListener(new ef0(20, jh1Var3, activity));
                if (jh1Var3.f38210u0.f31812b) {
                    jh1Var3.H.setVisibility(8);
                    jh1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f31448a = new HashMap();
                linearLayout.f31449b = new ArrayList();
                linearLayout.f31450c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f31453r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f31452n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                jh1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                jh1Var3.M0.setOnViewsUpdated(new tg1(jh1Var3, 5));
                eh1Var.addView(jh1Var3.M0, w7.z5.a(200.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 80));
                org.telegram.ui.Components.voip.b3 b3Var = new org.telegram.ui.Components.voip.b3(activity, 3, o1Var, true);
                b3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                b3Var.K = alignment;
                b3Var.d = -1L;
                b3Var.f10081l0 = new tg1(jh1Var3, 6);
                b3Var.T = true;
                b3Var.h = AndroidUtilities.dp(320.0f);
                b3Var.e = true;
                b3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                b3Var.q(8.0f);
                jh1Var3.N0 = b3Var;
                b3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                eh1Var.addView(jh1Var3.N0, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 80));
                org.telegram.ui.Components.voip.b3 b3Var2 = new org.telegram.ui.Components.voip.b3(activity, 1, o1Var, false);
                b3Var2.p(true);
                b3Var2.K = alignment;
                b3Var2.d = 4000L;
                b3Var2.T = true;
                b3Var2.h = AndroidUtilities.dp(320.0f);
                b3Var2.e = true;
                b3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                b3Var2.q(8.0f);
                jh1Var3.O0 = b3Var2;
                b3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                eh1Var.addView(jh1Var3.O0, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                jh1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!jh1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        jh1Var3.U0 = z12;
                    }
                    jh1Var3.n();
                }
                bh1Var2.addView(eh1Var);
                if (z10) {
                    jh1Var3.F0 = 0.0f;
                    jh1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        jh1Var3.f38179c0.setStub(org.telegram.ui.Components.voip.k2.k().f31542s);
                        jh1Var3.f38181d0.setStub(org.telegram.ui.Components.voip.k2.k().f31541r);
                    }
                    jh1Var3.f38210u0.setAlpha(0.0f);
                    jh1Var3.G();
                    jh1Var3.E0 = true;
                    org.telegram.ui.Components.voip.k2.U = true;
                    if (org.telegram.ui.Components.voip.k2.W == null) {
                        jh1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new tg1(jh1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.k2.V.getClass();
                        throw null;
                    }
                } else {
                    jh1Var3.F0 = 1.0f;
                    jh1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && uf.b.a(activity) == 1) {
                    jh1 jh1Var4 = f38171n1;
                    rf.c cVar = new rf.c(activity, jh1Var4);
                    cVar.f45281c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.q2 q2Var3 = jh1Var4.f38179c0;
                    cVar.f45285j = q2Var3.d;
                    cVar.f45286k = q2Var3.getPlaceholderView();
                    jh1Var4.f38188g0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            tg1 tg1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(tg1Var);
            this.R0 = false;
            if (this.f38218z0 && this.f38215x0) {
                AndroidUtilities.runOnUIThread(tg1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f38213w0.isTouchExplorationEnabled()) {
                if (!this.f38201n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f38207s.announceForAccessibility(string);
            }
            if (!this.f38201n0) {
                if (this.f38202o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f38210u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f38185f.getLocationOnScreen(iArr);
                    ch1 ch1Var = new ch1(this, this.f38207s.getContext(), iArr[0], iArr[1]);
                    this.f38202o0 = ch1Var;
                    WindowInsets windowInsets = this.f38206r0;
                    if (windowInsets != null) {
                        ch1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f38207s.addView(this.f38202o0);
                    return;
                }
                return;
            }
            this.f38181d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f38204q0 = this.f38203p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
                transitionSet.addTransition(duration.setInterpolator(bsVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(bsVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.t2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.i3.class, true);
                TransitionManager.beginDelayedTransition(this.f38194j0, transitionSet);
            }
            int i10 = this.f38203p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f38185f.setVisibility(8);
                this.h.setVisibility(8);
                this.f38200n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f38171n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f38201n0 || this.m0)) {
                    r(this.e, sharedInstance);
                    if (this.f38215x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f38185f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f38200n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f38200n.setOnClickListener(new ug1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f38201n0 || this.m0)) {
                        r(this.e, sharedInstance);
                        if (this.f38215x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f38185f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f38185f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f38200n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f31514f = 0;
                i11 = 16;
            }
            if (this.f38185f.getVisibility() == 0) {
                this.f38185f.f31514f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f31514f = i11;
                i11 += 16;
            }
            if (this.f38200n.getVisibility() == 0) {
                this.f38200n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jh1.D(boolean):void");
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
        this.f38196k0.setColor(i0.b.o(-16777216, (int) (this.f38217y0 * 102.0f * this.F0)));
        this.f38198l0.setColor(i0.b.o(-16777216, (int) (127.5f * this.F0)));
        eh1 eh1Var = this.f38207s;
        if (eh1Var != null) {
            eh1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jh1.G():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.q2 q2Var = this.f38179c0;
        if (q2Var != null) {
            q2Var.d.clearFirstFrame();
        }
        this.f38199m1 = true;
        G();
        ((WindowManager) this.f38175b.getSystemService("window")).removeView(this.f38210u0);
        this.f38210u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        bh1 bh1Var = this.f38210u0;
        bh1Var.getClass();
        ((WindowManager) this.f38175b.getSystemService("window")).addView(bh1Var, org.telegram.ui.Components.voip.u2.a());
        this.f38199m1 = false;
        G();
        this.f38210u0.invalidate();
        org.telegram.ui.Components.voip.q2 q2Var = this.f38197k1;
        if (q2Var != null) {
            q2Var.d.release();
            this.f38197k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.q2 q2Var = this.f38197k1;
        if (q2Var != null && q2Var.d.isAvailable()) {
            return this.f38197k1.d.getBitmap();
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
            if (this.f38203p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f38181d0.d.release();
                this.f38179c0.d.release();
                this.f38176b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f38210u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f38216y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f38186f0 = booleanValue;
            if (booleanValue) {
                this.f38216y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.q2 q2Var = this.f38179c0;
        if (q2Var != null && q2Var.d.isAvailable()) {
            return this.f38179c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(this.f38175b, false, true, false, false);
        this.f38197k1 = q2Var;
        q2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f38197k1.d.setEnableHardwareScaler(true);
        this.f38197k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.q2 q2Var2 = this.f38197k1;
        q2Var2.f31684a0 = 1;
        q2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dh1(this));
        View view = this.f38197k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f38197k1;
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
        final float measuredWidth2 = f19 - ((this.f38179c0.getMeasuredWidth() - (this.f38179c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f38179c0.getMeasuredHeight() - (this.f38179c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f38201n0 && measuredWidth3 != 0) {
                f18 = (this.f38210u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.t0.z(org.telegram.ui.Components.voip.k2.k().f31539f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.k2.k().f31539f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                f17 = org.telegram.ui.Cells.t0.z(org.telegram.ui.Components.voip.k2.k().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.k2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
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
            this.f38179c0.setScaleX(0.25f);
            this.f38179c0.setScaleY(0.25f);
            this.f38179c0.setTranslationX(measuredWidth2);
            this.f38179c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f38179c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f23) / 0.25f);
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
                jh1 jh1Var = jh1.this;
                jh1Var.F0 = f25;
                jh1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    jh1Var.Y.setScaleX(f26);
                    jh1Var.Y.setScaleY(f26);
                    jh1Var.Y.setTranslationX((f22 * floatValue) + (x10 * f25));
                    jh1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    jh1Var.Y.setCornerRadius((dp * floatValue) + (f11 * f25));
                    jh1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                jh1Var.f38179c0.setScaleX(f27);
                jh1Var.f38179c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                jh1Var.f38179c0.setTranslationX(f29);
                jh1Var.f38179c0.setTranslationY(f30);
                jh1Var.f38179c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f27);
                if (!jh1Var.Y.P) {
                    jh1Var.f38181d0.d(floatValue, false);
                }
                jh1Var.f38210u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f38172a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        rf.d dVar = this.f38188g0;
        if (dVar != null) {
            dVar.c();
            this.f38188g0 = null;
        }
        ug.l1 l1Var = this.M;
        if (l1Var != null) {
            l1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f38215x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.x2 x2Var = this.f38212w;
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
                x2Var.f31863c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w2(x2Var, 1));
                x2Var.f31863c.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                x2Var.f31863c.setDuration(200L);
                x2Var.f31863c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f38216y.getVisibility() == 0) {
                    this.f38216y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.bs.f25031g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
                org.telegram.messenger.wh.t(translationY, bsVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new xg1(this, 3)).setInterpolator(bsVar).start();
            } else {
                if (this.f38216y.getVisibility() == 0) {
                    this.f38216y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.bs.f25030f;
                duration.setInterpolator(bsVar2).setListener(new ho(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(bsVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new xg1(this, 4)).setDuration(250L).setInterpolator(bsVar2).start();
            }
            this.f38204q0 = this.f38203p0;
            G();
        }
    }

    public final void m() {
        this.f38210u0.b();
    }

    public final void n() {
        this.f38181d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yg1(this));
        this.f38179c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zg1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f38176b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            ch1 ch1Var = this.f38202o0;
            if (ch1Var != null) {
                ch1Var.a(false, false);
            } else if (this.m0 && this.f38201n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f38173a0 = false;
                this.f38204q0 = this.f38203p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (uf.b.a(this.f38175b) > 0) {
                        if (!this.G0 && f38171n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f38171n1.f38210u0.getMeasuredHeight();
                                jh1 jh1Var = f38171n1;
                                org.telegram.ui.Components.voip.k2.l(jh1Var.f38175b, jh1Var.f38172a, jh1Var.f38210u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f38171n1.f38206r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                                    f38171n1.f38206r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.k2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
                                duration.setInterpolator(bsVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                this.f38194j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).start();
                                this.f38190h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).start();
                                this.f38192i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).start();
                                org.telegram.ui.Components.voip.k2.U = true;
                                this.E0 = true;
                                ValueAnimator j10 = j(false);
                                this.L0.lock();
                                j10.addListener(new xg1(this, 1));
                                j10.setDuration(350L);
                                j10.setInterpolator(bsVar);
                                j10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.f5.A(this.f38175b, new rg1(this, 0), true).o();
                    return;
                }
                this.f38210u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f38204q0 = this.f38203p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f38204q0 = this.f38203p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f38188g0 == null && uf.b.a(this.f38175b) == 1) {
                rf.c cVar = new rf.c(this.f38175b, f38171n1);
                cVar.f45281c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.q2 q2Var = this.f38179c0;
                cVar.f45285j = q2Var.d;
                cVar.f45286k = q2Var.getPlaceholderView();
                this.f38188g0 = cVar.a();
            }
        } else {
            rf.d dVar = this.f38188g0;
            if (dVar != null) {
                dVar.c();
                this.f38188g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.a3 a3Var;
        if (i10 > 0) {
            this.f38195j1 = true;
        }
        if (this.F != null && (a3Var = this.v) != null) {
            int i11 = a3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f38195j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(this, i10, 29), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f38203p0;
        if (i11 != i10) {
            this.f38204q0 = i11;
            this.f38203p0 = i10;
            if (this.f38210u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f38204q0 = this.f38203p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f38185f.getVisibility() == 0) {
            this.f38183e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f38183e0;
            ValueAnimator valueAnimator = eVar.f31425b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31425b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f38200n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f38185f.animate().cancel();
        this.f38183e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f38183e0;
        ValueAnimator valueAnimator2 = eVar2.f31425b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31425b0 = null;
            eVar2.U.stop();
        }
        this.f38200n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f38185f.d(3, true, false);
        this.f38200n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f38185f.setVisibility(0);
        this.f38200n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f38185f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f38183e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                jh1 jh1Var = jh1.this;
                jh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                jh1Var.f38183e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                jh1Var.f38183e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f38183e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f38183e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f38183e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f38183e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ml0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new tg1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService) {
        if (!this.f38201n0) {
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
            ValueAnimator valueAnimator = s1Var.f31734f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            s1Var.K = f7;
            s1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f31734f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = s1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            s1Var.f31734f0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f31735g0);
            s1Var.f31734f0.setDuration(150L);
            s1Var.f31734f0.start();
        }
        i3Var.setOnBtnClickedListener(new rg1(this, 5));
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
            i3Var.setOnBtnClickedListener(new ha(this, i10, i3Var, voIPService, 8));
        }
        i10 = i11;
        i3Var.setEnabled(true);
        i3Var.setOnBtnClickedListener(new ha(this, i10, i3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.i3 i3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f38201n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f38201n0) {
                if (voIPService.isScreencast()) {
                    i3Var.d(3, false, z10);
                } else {
                    i3Var.d(3, false, z10);
                }
            } else {
                i3Var.d(3, true, z10);
            }
            i3Var.setOnBtnClickedListener(new rg1(this, 6));
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
        if (!this.f38201n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f38216y.getTag() == null) {
                this.f38216y.animate().setListener(null).cancel();
                this.f38216y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f38216y.setAlpha(0.0f);
                        this.f38216y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
                    } else {
                        this.f38216y.setAlpha(0.0f);
                        this.f38216y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f38216y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
                    }
                } else if (z11) {
                    this.f38216y.setAlpha(0.0f);
                    this.f38216y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f38216y.setScaleX(0.1f);
                    this.f38216y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f38216y.getTag() != null) {
                this.f38216y.animate().setListener(null).cancel();
                this.f38216y.setTranslationY(0.0f);
                this.f38216y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.bs.f25030f).setListener(new xg1(this, 7)).start();
            }
        } else {
            this.f38216y.animate().setListener(null).cancel();
            this.f38216y.setTranslationY(0.0f);
            this.f38216y.setAlpha(1.0f);
            this.f38216y.setScaleX(1.0f);
            this.f38216y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f38216y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f38216y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f38175b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.f38175b, 0, null);
        boolean[] zArr = new boolean[3];
        b2Var.R = LocaleController.getString(R.string.VoipFailed);
        b2Var.T = charSequence;
        b2Var.f20666l0 = LocaleController.getString(R.string.OK);
        b2Var.m0 = null;
        b2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(b2Var.e(org.telegram.ui.ActionBar.h6.f21224q7));
            }
        }
        b2Var.setCanceledOnTouchOutside(true);
        b2Var.setOnDismissListener(new w5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f38215x0);
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
                    animatorSet3.addListener(new xg1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.bs.f25030f);
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
                if (s1Var4.f31744y < 0.0f) {
                    s1Var4.d(1.0f, 1.0f);
                    this.f38173a0 = true;
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
            this.f38173a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        e11 e11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f38215x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
            duration.setInterpolator(bsVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(bsVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(bsVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(bsVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(bsVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(bsVar).start();
            this.f38194j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(bsVar).start();
            this.f38190h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.f38192i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38217y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(e11Var);
            this.P0.setDuration(150L).setInterpolator(bsVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f38194j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f38215x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.bs.f25030f;
                translationY.setInterpolator(bsVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(bsVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.f38194j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.f38190h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar2).start();
                this.f38192i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f38217y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(e11Var);
                this.P0.setDuration(150L).setInterpolator(bsVar2);
                this.P0.start();
                this.f38194j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f38215x0 = z10;
        bh1 bh1Var = this.f38210u0;
        if (!z10) {
            bh1Var.setSystemUiVisibility(bh1Var.getSystemUiVisibility() | 4);
        } else {
            bh1Var.setSystemUiVisibility(bh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f38215x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

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
public final class mh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, ze.a {
    public static mh1 f40427j1;
    public TextView A;
    public boolean A0;
    public org.telegram.ui.Components.voip.o2 B;
    public float B0;
    public lh1 C;
    public boolean C0;
    public ImageView D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public int F;
    public boolean F0;
    public org.telegram.ui.Components.ge G;
    public long G0;
    public int H;
    public bg.g3 I;
    public org.telegram.ui.Components.voip.g2 I0;
    public ta1 J;
    public org.telegram.ui.Components.voip.c3 J0;
    public FrameLayout K;
    public org.telegram.ui.Components.voip.c3 K0;
    public org.telegram.ui.Components.voip.o0 L;
    public ValueAnimator L0;
    public org.telegram.ui.Components.voip.l1 M;
    public kh.n5 N;
    public boolean N0;
    public TextView O;
    public gk P;
    public org.telegram.ui.Components.voip.k Q;
    public boolean Q0;
    public float R0;
    public float S0;
    public ih1 T;
    public float T0;
    public org.telegram.ui.Components.voip.s1 U;
    public float U0;
    public org.telegram.ui.Components.voip.s1 V;
    public float V0;
    public boolean W;
    public boolean W0;
    public TextureViewRenderer X;
    public float X0;
    public org.telegram.ui.Components.voip.r2 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.r2 Z;
    public int Z0;
    public final int f40428a;
    public org.telegram.ui.Components.voip.e f40429a0;
    public int f40430a1;
    public Activity f40431b;
    public boolean f40432b0;
    public final TLRPC.User f40434c;
    public xe.d f40435c0;
    public boolean f40436c1;
    public final TLRPC.User d;
    public View f40437d0;
    public boolean f40438d1;
    public org.telegram.ui.Components.voip.j3 f40439e;
    public View f40440e0;
    public ValueAnimator f40441e1;
    public org.telegram.ui.Components.voip.j3 f40442f;
    public org.telegram.ui.Components.voip.o1 f40443f0;
    public boolean f40444f1;
    public org.telegram.ui.Components.voip.r2 f40446g1;
    public org.telegram.ui.Components.voip.j3 h;
    public af.f f40448h1;
    public boolean f40449i0;
    public boolean f40450i1;
    public boolean f40451j0;
    public fh1 f40452k0;
    public int f40453l0;
    public int m0;
    public jh1 f40454n;
    public WindowInsets f40455n0;
    public boolean f40456o0;
    public float f40457p0;
    public eh1 f40458q0;
    public int f40460r0;
    public hh1 f40461s;
    public AccessibilityManager f40462s0;
    public org.telegram.ui.Components.voip.b3 v;
    public boolean f40465v0;
    public org.telegram.ui.Components.voip.y2 f40466w;
    public AnimatorSet f40467w0;
    public org.telegram.ui.Components.voip.d3 f40468x;
    public boolean f40469x0;
    public org.telegram.ui.Components.voip.q0 f40470y;
    public boolean f40471y0;
    public boolean f40472z0;
    public final org.telegram.ui.Components.voip.n1 f40459r = new org.telegram.ui.Components.voip.n1();
    public final org.telegram.ui.Components.o9[] R = new org.telegram.ui.Components.o9[4];
    public final Drawable[] S = new Drawable[4];
    public final Paint f40445g0 = new Paint();
    public final Paint f40447h0 = new Paint();
    public boolean f40463t0 = true;
    public float f40464u0 = 1.0f;
    public final AnimationNotificationsLocker H0 = new AnimationNotificationsLocker();
    public final v01 M0 = new v01(this, 20);
    public final wg1 O0 = new wg1(this, 12);
    public final wg1 P0 = new wg1(this, 13);
    public float f40433b1 = 1.0f;

    public mh1(int i9) {
        this.f40428a = i9;
        this.f40434c = MessagesController.getInstance(i9).getUser(Long.valueOf(UserConfig.getInstance(i9).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.m0 = -1;
        this.f40453l0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(mh1 mh1Var) {
        AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
        mh1Var.N0 = false;
        if (Build.VERSION.SDK_INT >= 23 && mh1Var.f40431b.checkSelfPermission("android.permission.CAMERA") != 0) {
            mh1Var.f40431b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            mh1Var.C();
        }
    }

    public static void j(mh1 mh1Var) {
        mh1 mh1Var2;
        if (mh1Var.f40436c1) {
            mh1Var.f40436c1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            mh1Var.f40441e1 = ofFloat;
            mh1Var2 = mh1Var;
            ofFloat.addUpdateListener(new ag.c(mh1Var2, mh1Var.f40433b1, mh1Var.U0, mh1Var.V0, 2));
            mh1Var2.f40441e1.addListener(new ah1(mh1Var2, 0));
            mh1Var2.f40441e1.setDuration(350L);
            mh1Var2.f40441e1.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            mh1Var2.f40441e1.start();
        } else {
            mh1Var2 = mh1Var;
        }
        mh1Var2.f40438d1 = false;
        mh1Var2.W0 = false;
    }

    public static void q(int i9, int[] iArr) {
        mh1 mh1Var = f40427j1;
        if (mh1Var != null) {
            if (i9 == 101) {
                if (VoIPService.getSharedState() == null) {
                    mh1Var.f40458q0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mh1Var.r(new lj0(7));
                } else if (!mh1Var.f40431b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.e2.i(mh1Var.f40431b, new wg1(mh1Var, 2), i9);
                    return;
                }
            }
            if (i9 == 102) {
                if (VoIPService.getSharedState() == null) {
                    mh1Var.f40458q0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mh1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i9) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int size;
        int size2;
        float f10;
        mh1 mh1Var = f40427j1;
        if (mh1Var != null && mh1Var.f40458q0.getParent() == null) {
            mh1 mh1Var2 = f40427j1;
            if (mh1Var2 != null) {
                mh1Var2.Y.d.release();
                f40427j1.Z.d.release();
                f40427j1.X.release();
                eh1 eh1Var = f40427j1.f40458q0;
                if (eh1Var != null) {
                    eh1Var.d();
                }
                f40427j1.l();
            }
            f40427j1 = null;
        }
        if (f40427j1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                mh1 mh1Var3 = new mh1(i9);
                mh1Var3.f40431b = activity;
                f40427j1 = mh1Var3;
                eh1 eh1Var2 = new eh1(activity, !z10, mh1Var3);
                f40427j1.F0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f40427j1.getClass();
                eh1Var2.setLockOnScreen(f40427j1.F0);
                mh1Var3.f40458q0 = eh1Var2;
                ug1 ug1Var = new ug1(mh1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f46915a;
                r0.b0.j(eh1Var2, ug1Var);
                ((WindowManager) activity.getSystemService("window")).addView(eh1Var2, org.telegram.ui.Components.voip.v2.a());
                mh1Var3.f40457p0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                mh1Var3.f40462s0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                hh1 hh1Var = new hh1(mh1Var3, activity);
                hh1Var.setClipToPadding(false);
                hh1Var.setClipChildren(false);
                hh1Var.setBackgroundColor(-16777216);
                mh1Var3.G();
                mh1Var3.f40461s = hh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.n1 n1Var = mh1Var3.f40459r;
                mh1Var3.v = new org.telegram.ui.Components.voip.b3(activity, z11, n1Var);
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
                mh1Var3.Y = r2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                r2Var.d.setScalingType(scalingType);
                mh1Var3.Y.d.setEnableHardwareScaler(true);
                mh1Var3.Y.d.setRotateTextureWithScreen(true);
                mh1Var3.Y.T = 1;
                hh1Var.addView(mh1Var3.v, g7.e6.c(-1.0f, -1));
                TLRPC.User user = mh1Var3.d;
                org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity, user, n1Var);
                mh1Var3.f40466w = y2Var;
                hh1Var.addView(y2Var, g7.e6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i11 = org.telegram.ui.ActionBar.f6.f22941a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f33480a = new org.telegram.ui.Components.iv0(0);
                    }
                }
                mh1Var3.f40468x = view;
                hh1Var.addView((View) view, g7.e6.c(220.0f, -1));
                hh1Var.addView(mh1Var3.Y);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.n9(orientation, new int[]{-14994098, -14328963}).f(m5.c0.m(0.5f, 1), new wb1(mh1Var3, 1), 0L);
                org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
                mh1Var3.U = s1Var;
                s1Var.setDelegate(new ug1(mh1Var3, 3));
                mh1Var3.U.d(1.0f, 1.0f);
                mh1Var3.W = true;
                org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
                mh1Var3.Z = r2Var2;
                r2Var2.d.setIsCamera(true);
                mh1Var3.Z.d.setUseCameraRotation(true);
                mh1Var3.U.setOnTapListener(new xg1(mh1Var3, 1));
                mh1Var3.Z.d.setMirror(true);
                mh1Var3.U.addView(mh1Var3.Z);
                org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
                mh1Var3.V = s1Var2;
                s1Var2.O = true;
                s1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                mh1Var3.X = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                mh1Var3.X.setIsCamera(false);
                mh1Var3.X.setFpsReduction(30.0f);
                mh1Var3.X.setScalingType(scalingType);
                mh1Var3.V.addView(mh1Var3.X, g7.e6.e(-1, -2, 17));
                mh1Var3.V.setOnTapListener(new xg1(mh1Var3, 2));
                mh1Var3.V.setVisibility(8);
                hh1Var.addView(mh1Var3.U, g7.e6.c(-2.0f, -2));
                hh1Var.addView(mh1Var3.V);
                View view2 = new View(activity);
                mh1Var3.f40437d0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                hh1Var.addView(mh1Var3.f40437d0, g7.e6.e(-1, 160, 80));
                View view3 = new View(activity);
                mh1Var3.f40440e0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                hh1Var.addView(mh1Var3.f40440e0, g7.e6.e(-1, 160, 48));
                ta1 ta1Var = new ta1(mh1Var3, activity, 17);
                mh1Var3.J = ta1Var;
                ta1Var.setOrientation(0);
                mh1Var3.J.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                mh1Var3.J.setClipToPadding(false);
                mh1Var3.J.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                mh1Var3.J.setOnClickListener(new xg1(mh1Var3, 3));
                mh1Var3.L = new org.telegram.ui.Components.voip.o0(activity, n1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                mh1Var3.K = frameLayout;
                frameLayout.addView(mh1Var3.L, g7.e6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                mh1Var3.K.setVisibility(8);
                mh1Var3.K.setOnClickListener(new xg1(mh1Var3, 4));
                kh.n5 n5Var = new kh.n5(activity, n1Var);
                mh1Var3.N = n5Var;
                n5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                mh1Var3.O = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                mh1Var3.O.setTextSize(1, 15.0f);
                mh1Var3.O.setTypeface(AndroidUtilities.bold());
                mh1Var3.O.setTextColor(-1);
                mh1Var3.O.setGravity(17);
                gk gkVar = new gk(mh1Var3, activity, 5);
                mh1Var3.P = gkVar;
                gkVar.setTextSize(1, 15.0f);
                mh1Var3.P.setTextColor(-1);
                mh1Var3.P.setGravity(17);
                mh1Var3.P.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), mh1Var3.P.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                mh1Var3.N.setVisibility(8);
                mh1Var3.N.addView(mh1Var3.O);
                mh1Var3.N.addView(mh1Var3.P, g7.e6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                mh1Var3.N.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
                    org.telegram.ui.Components.o9[] o9VarArr = mh1Var3.R;
                    o9VarArr[i14] = o9Var;
                    o9VarArr[i14].getImageReceiver().setAspectFit(true);
                    ta1 ta1Var2 = mh1Var3.J;
                    org.telegram.ui.Components.o9 o9Var2 = o9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    ta1Var2.addView(o9Var2, g7.e6.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ih1 ih1Var = new ih1(mh1Var3, activity);
                mh1Var3.T = ih1Var;
                ih1Var.setOrientation(1);
                mh1Var3.T.setFocusable(true);
                mh1Var3.T.setFocusableInTouchMode(true);
                mh1Var3.f40470y = new org.telegram.ui.Components.voip.q0(activity);
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.r(user);
                org.telegram.ui.Components.voip.q0 q0Var = mh1Var3.f40470y;
                int i15 = mh1Var3.f40428a;
                q0Var.f33759b.h(ImageLocation.getForUserOrChat(i15, user, 0), null, z8Var, user);
                mh1Var3.f40470y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                mh1Var3.A = textView2;
                textView2.setTextSize(1, 28.0f);
                mh1Var3.A.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), mh1Var3.A.getPaint().getFontMetricsInt(), false));
                mh1Var3.A.setMaxLines(2);
                mh1Var3.A.setEllipsize(TextUtils.TruncateAt.END);
                mh1Var3.A.setTextColor(-1);
                mh1Var3.A.setGravity(1);
                mh1Var3.A.setImportantForAccessibility(2);
                mh1Var3.T.addView(mh1Var3.A, g7.e6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f33733a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f33733a[i16] = new TextView(activity);
                    frameLayout2.f33733a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f33733a[i16].setTextColor(-1);
                    frameLayout2.f33733a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f33733a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f33735c = frameLayout3;
                org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(frameLayout2, activity, n1Var);
                m2Var.setTextSize(1, 15.0f);
                m2Var.setTextColor(-1);
                m2Var.setGravity(1);
                m2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                m2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(m2Var, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, g7.e6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f33734b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, g7.e6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new org.telegram.ui.Components.z(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
                frameLayout2.d = s2Var;
                frameLayout2.addView(s2Var, g7.e6.c(-2.0f, -1));
                mh1Var3.B = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f46915a;
                frameLayout2.setImportantForAccessibility(4);
                mh1Var3.T.addView(mh1Var3.B, g7.e6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    lh1 lh1Var = new lh1(activity);
                    mh1Var3.C = lh1Var;
                    long j10 = sharedState.getUser().f22527id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i18 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i18 <= 0) {
                        lh1Var.setVisibility(8);
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
                        org.telegram.ui.Components.b9 b9Var = lh1Var.f40143b;
                        b9Var.k(min);
                        int i19 = 0;
                        while (i19 < min) {
                            b9Var.l(i19, MessagesController.getInstance(i15).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i19).peer)), i15);
                            i19++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        b9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            lh1Var.setVisibility(8);
                        } else {
                            lh1Var.f40144c = new org.telegram.ui.Components.nz0(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            lh1Var.setVisibility(0);
                            lh1Var.invalidate();
                        }
                    }
                    mh1Var3.T.addView(mh1Var3.C, g7.e6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                mh1Var3.T.setClipChildren(false);
                mh1Var3.T.setClipToPadding(false);
                mh1Var3.T.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                mh1Var3.Q = new org.telegram.ui.Components.voip.k(activity);
                mh1Var3.M = new org.telegram.ui.Components.voip.l1(activity, n1Var);
                mh1Var3.Q.setAlpha(0.0f);
                mh1Var3.M.setVisibility(8);
                hh1Var.addView(mh1Var3.f40470y, g7.e6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.T, g7.e6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.K, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.N, g7.e6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.J, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.Q, g7.e6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                hh1Var.addView(mh1Var3.M, g7.e6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                mh1Var3.f40443f0 = new org.telegram.ui.Components.voip.o1(activity);
                mh1Var3.f40439e = new org.telegram.ui.Components.voip.j3(activity, n1Var);
                mh1Var3.f40442f = new org.telegram.ui.Components.voip.j3(activity, n1Var);
                mh1Var3.h = new org.telegram.ui.Components.voip.j3(activity, n1Var);
                mh1Var3.f40454n = new org.telegram.ui.Components.voip.u2(activity, 52.0f);
                mh1Var3.f40439e.setTranslationY(AndroidUtilities.dp(100.0f));
                mh1Var3.f40439e.setScaleX(0.0f);
                mh1Var3.f40439e.setScaleY(0.0f);
                mh1Var3.f40439e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mh1Var3.f40442f.setTranslationY(AndroidUtilities.dp(100.0f));
                mh1Var3.f40442f.setScaleX(0.0f);
                mh1Var3.f40442f.setScaleY(0.0f);
                mh1Var3.f40442f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                mh1Var3.h.setScaleX(0.0f);
                mh1Var3.h.setScaleY(0.0f);
                mh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mh1Var3.f40454n.setTranslationY(AndroidUtilities.dp(100.0f));
                mh1Var3.f40454n.setScaleX(0.0f);
                mh1Var3.f40454n.setScaleY(0.0f);
                mh1Var3.f40454n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mh1Var3.f40443f0.addView(mh1Var3.f40439e);
                mh1Var3.f40443f0.addView(mh1Var3.f40442f);
                mh1Var3.f40443f0.addView(mh1Var3.h);
                mh1Var3.f40443f0.addView(mh1Var3.f40454n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                mh1Var3.f40429a0 = eVar;
                eVar.setListener(new kh1(mh1Var3));
                mh1Var3.f40429a0.setScaleX(1.15f);
                mh1Var3.f40429a0.setScaleY(1.15f);
                hh1Var.addView(mh1Var3.f40443f0, g7.e6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                hh1Var.addView(mh1Var3.f40429a0, g7.e6.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                mh1Var3.E = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
                mh1Var3.E.setImageResource(R.drawable.msg_addcontact);
                mh1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                hh1Var.addView(mh1Var3.E, g7.e6.e(56, 56, 53));
                g7.g6.a(mh1Var3.E);
                ImageView imageView2 = new ImageView(activity);
                mh1Var3.D = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
                mh1Var3.D.setImageResource(R.drawable.msg_call_minimize_shadow);
                mh1Var3.D.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                mh1Var3.D.setContentDescription(LocaleController.getString(R.string.Back));
                hh1Var.addView(mh1Var3.D, g7.e6.e(56, 56, 51));
                g7.g6.a(mh1Var3.D);
                org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
                mh1Var3.G = geVar;
                geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                mh1Var3.G.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
                mh1Var3.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                hh1Var.addView(mh1Var3.G, g7.e6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                mh1Var3.G.setAlpha(0.0f);
                mh1Var3.G.setOnClickListener(new xg1(mh1Var3, 5));
                mh1Var3.D.setOnClickListener(new xg1(mh1Var3, 6));
                mh1Var3.E.setOnClickListener(new v80(27, mh1Var3, activity));
                if (mh1Var3.f40458q0.f33908b) {
                    mh1Var3.D.setVisibility(8);
                    mh1Var3.E.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f33528a = new HashMap();
                linearLayout.f33529b = new ArrayList();
                linearLayout.f33530c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f33534r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f33533n = n1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.o0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                mh1Var3.I0 = linearLayout;
                linearLayout.setGravity(80);
                mh1Var3.I0.setOnViewsUpdated(new wg1(mh1Var3, 5));
                hh1Var.addView(mh1Var3.I0, g7.e6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity, 3, n1Var, true);
                c3Var.q(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                c3Var.G = alignment;
                c3Var.d = -1L;
                c3Var.f16352h0 = new wg1(mh1Var3, 6);
                c3Var.P = true;
                c3Var.h = AndroidUtilities.dp(320.0f);
                c3Var.f16347e = true;
                c3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
                c3Var.r(8.0f);
                mh1Var3.J0 = c3Var;
                c3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
                hh1Var.addView(mh1Var3.J0, g7.e6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.c3 c3Var2 = new org.telegram.ui.Components.voip.c3(activity, 1, n1Var, false);
                c3Var2.q(true);
                c3Var2.G = alignment;
                c3Var2.d = 4000L;
                c3Var2.P = true;
                c3Var2.h = AndroidUtilities.dp(320.0f);
                c3Var2.f16347e = true;
                c3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
                c3Var2.r(8.0f);
                mh1Var3.K0 = c3Var2;
                c3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
                hh1Var.addView(mh1Var3.K0, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                mh1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!mh1Var3.Q0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        mh1Var3.Q0 = z12;
                    }
                    mh1Var3.o();
                }
                eh1Var2.addView(hh1Var);
                if (z10) {
                    mh1Var3.B0 = 0.0f;
                    mh1Var3.E0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        mh1Var3.Y.setStub(org.telegram.ui.Components.voip.l2.k().f33658r);
                        mh1Var3.Z.setStub(org.telegram.ui.Components.voip.l2.k().f33657n);
                    }
                    mh1Var3.f40458q0.setAlpha(0.0f);
                    mh1Var3.H();
                    mh1Var3.A0 = true;
                    org.telegram.ui.Components.voip.l2.P = true;
                    if (org.telegram.ui.Components.voip.l2.R == null) {
                        mh1Var3.H0.lock();
                        AndroidUtilities.runOnUIThread(new wg1(mh1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.l2.Q.getClass();
                        throw null;
                    }
                } else {
                    mh1Var3.B0 = 1.0f;
                    mh1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && af.d.a(activity) == 1) {
                    mh1 mh1Var4 = f40427j1;
                    xe.c cVar = new xe.c(activity, mh1Var4);
                    cVar.f49135c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.r2 r2Var3 = mh1Var4.Y;
                    cVar.f49140j = r2Var3.d;
                    cVar.f49141k = r2Var3.getPlaceholderView();
                    mh1Var4.f40435c0 = cVar.a();
                }
            }
        }
    }

    public final void A(boolean z10) {
        int i9;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        v01 v01Var = this.M0;
        int i10 = 0;
        if (!z10 && this.f40463t0) {
            ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
            duration.setInterpolator(grVar).start();
            this.D.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.J.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.A.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(grVar).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(grVar).start();
            this.f40443f0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.f40437d0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f40440e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40464u0, 0.0f);
            this.L0 = ofFloat;
            ofFloat.addUpdateListener(v01Var);
            this.L0.setDuration(150L).setInterpolator(grVar);
            this.L0.start();
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            this.N0 = false;
            this.f40443f0.setEnabled(false);
            this.K0.e(true);
            i9 = 150;
        } else {
            if (z10 && !this.f40463t0) {
                this.J0.e(true);
                this.K0.e(true);
                ViewPropertyAnimator translationY = this.A.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f28844f;
                translationY.setInterpolator(grVar2).start();
                this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(grVar2).start();
                this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.D.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f40443f0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f40437d0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f40440e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f40464u0, 1.0f);
                this.L0 = ofFloat2;
                ofFloat2.addUpdateListener(v01Var);
                this.L0.setDuration(150L).setInterpolator(grVar2);
                this.L0.start();
                this.f40443f0.setEnabled(true);
            }
            i9 = 0;
        }
        this.f40463t0 = z10;
        eh1 eh1Var = this.f40458q0;
        if (!z10) {
            eh1Var.setSystemUiVisibility(eh1Var.getSystemUiVisibility() | 4);
        } else {
            eh1Var.setSystemUiVisibility(eh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.I0.animate();
        int i11 = -AndroidUtilities.dp(16.0f);
        if (this.f40463t0) {
            i10 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i9).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            wg1 wg1Var = this.O0;
            AndroidUtilities.cancelRunOnUIThread(wg1Var);
            this.N0 = false;
            if (this.f40465v0 && this.f40463t0) {
                AndroidUtilities.runOnUIThread(wg1Var, 3000L);
                this.N0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f40462s0.isTouchExplorationEnabled()) {
                if (!this.f40451j0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f40461s.announceForAccessibility(string);
            }
            if (!this.f40451j0) {
                if (this.f40452k0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f40458q0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f40442f.getLocationOnScreen(iArr);
                    fh1 fh1Var = new fh1(this, this.f40461s.getContext(), iArr[0], iArr[1]);
                    this.f40452k0 = fh1Var;
                    WindowInsets windowInsets = this.f40455n0;
                    if (windowInsets != null) {
                        fh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f40461s.addView(this.f40452k0);
                    return;
                }
                return;
            }
            this.Z.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.m0 = this.f40453l0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.o0(4).setDuration(250L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
                transitionSet.addTransition(duration.setInterpolator(grVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(grVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.j3.class, true);
                TransitionManager.beginDelayedTransition(this.f40443f0, transitionSet);
            }
            int i9 = this.f40453l0;
            if (i9 == 11) {
                this.f40439e.setVisibility(8);
                this.f40442f.setVisibility(8);
                this.h.setVisibility(8);
                this.f40454n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i9 != 15 && i9 != 17) {
                if (f40427j1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f40451j0 || this.f40449i0)) {
                    s(this.f40439e, sharedInstance);
                    if (this.f40463t0) {
                        this.G.setTag(1);
                        this.G.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.f40439e, sharedInstance);
                    this.G.setTag(null);
                    this.G.animate().alpha(0.0f).start();
                }
                v(this.f40442f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f40454n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f40454n.setOnClickListener(new xg1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i9 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f40451j0 || this.f40449i0)) {
                        s(this.f40439e, sharedInstance);
                        if (this.f40463t0) {
                            this.G.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.f40439e, sharedInstance);
                        this.G.animate().alpha(0.0f).start();
                    }
                    v(this.f40442f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.f40439e.setVisibility(8);
                    this.f40442f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f40454n.setVisibility(8);
            }
            if (this.f40439e.getVisibility() == 0) {
                this.f40439e.f33592f = 0;
                i10 = 16;
            }
            if (this.f40442f.getVisibility() == 0) {
                this.f40442f.f33592f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f33592f = i10;
                i10 += 16;
            }
            if (this.f40454n.getVisibility() == 0) {
                this.f40454n.B = i10;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mh1.E(boolean):void");
    }

    public final void F() {
        int i9;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i9 = R.drawable.calls_bluetooth;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i9 = R.drawable.calls_speaker;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i9 = R.drawable.calls_menu_headset;
        } else {
            i9 = R.drawable.calls_menu_phone;
        }
        if (this.F != i9) {
            AndroidUtilities.updateImageViewImageAnimated(this.G, i9);
        } else {
            this.G.setImageResource(i9);
        }
        this.F = i9;
    }

    public final void G() {
        this.f40445g0.setColor(i0.a.k(-16777216, (int) (this.f40464u0 * 102.0f * this.B0)));
        this.f40447h0.setColor(i0.a.k(-16777216, (int) (127.5f * this.B0)));
        hh1 hh1Var = this.f40461s;
        if (hh1Var != null) {
            hh1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mh1.H():void");
    }

    @Override
    public final Bitmap a() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f40446g1;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f40446g1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void b(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.Y.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.voipServiceCreated) {
            if (this.f40453l0 == 17 && VoIPService.getSharedInstance() != null) {
                this.Z.d.release();
                this.Y.d.release();
                this.X.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i9 == NotificationCenter.closeInCallActivity) {
            this.f40458q0.b();
        } else if (i9 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f40470y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i9 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f40432b0 = booleanValue;
            if (booleanValue) {
                this.f40470y.b(true, true);
            }
        }
    }

    @Override
    public final void e(af.f fVar) {
        this.f40448h1 = fVar;
        eh1 eh1Var = this.f40458q0;
        eh1Var.getClass();
        ((WindowManager) this.f40431b.getSystemService("window")).addView(eh1Var, org.telegram.ui.Components.voip.v2.a());
        this.f40450i1 = false;
        H();
        this.f40458q0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.f40446g1;
        if (r2Var != null) {
            r2Var.d.release();
            this.f40446g1 = null;
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(af.f fVar) {
        this.f40448h1 = fVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.f40450i1 = true;
        H();
        ((WindowManager) this.f40431b.getSystemService("window")).removeView(this.f40458q0);
        this.f40458q0.invalidate();
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.f40431b, false, true, false, false);
        this.f40446g1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f40446g1.d.setEnableHardwareScaler(true);
        this.f40446g1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f40446g1;
        r2Var2.T = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new gh1(this));
        View view = this.f40446g1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f40446g1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f10;
        final boolean z11;
        final float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.U.animate().cancel();
        float f18 = org.telegram.ui.Components.voip.l2.k().d.x + org.telegram.ui.Components.voip.l2.k().f33662y;
        float f19 = org.telegram.ui.Components.voip.l2.k().d.y + org.telegram.ui.Components.voip.l2.k().A;
        final float x10 = this.U.getX();
        final float y10 = this.U.getY();
        final float scaleX = this.U.getScaleX();
        org.telegram.ui.Components.voip.l2.Q.getClass();
        final float measuredWidth = f18 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f19 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f20 = 1.0f;
        if (this.f40449i0) {
            int measuredWidth2 = this.U.getMeasuredWidth();
            if (this.f40451j0 && measuredWidth2 != 0) {
                f17 = (this.f40458q0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f16 = (((org.telegram.ui.Components.voip.l2.k().f33656f * 0.25f) + (f18 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().f33656f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.l2.k().h * 0.25f) + (f19 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f16 = 1.0f;
                f17 = 0.0f;
            }
            float f21 = f17;
            f10 = f16;
            f11 = f21;
        } else {
            c10 = 0;
            float measuredWidth3 = f18 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f19 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = measuredWidth3;
            z11 = true;
            f11 = 0.25f;
        }
        final float f22 = measuredHeight;
        if (this.f40449i0) {
            f12 = AndroidUtilities.dp(4.0f);
        } else {
            f12 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.f40449i0) {
            org.telegram.ui.Components.voip.l2.Q.getClass();
            f20 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.U.setScaleX(f11);
                this.U.setScaleY(f11);
                this.U.setTranslationX(f10);
                this.U.setTranslationY(f22);
                this.U.setCornerRadius(dp);
                this.U.setAlpha(f20);
            }
            this.Y.setScaleX(0.25f);
            this.Y.setScaleY(0.25f);
            this.Y.setTranslationX(measuredWidth);
            this.Y.setTranslationY(measuredHeight2);
            this.Y.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (z10) {
            f14 = 0.0f;
        } else {
            f14 = 1.0f;
        }
        float[] fArr = new float[2];
        fArr[c10] = f13;
        fArr[1] = f14;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f15 = 0.0f;
        } else {
            f15 = 1.0f;
        }
        this.B0 = f15;
        G();
        final float f23 = f12;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                mh1 mh1Var = mh1.this;
                mh1Var.B0 = f24;
                mh1Var.G();
                if (z11) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    mh1Var.U.setScaleX(f25);
                    mh1Var.U.setScaleY(f25);
                    mh1Var.U.setTranslationX((f10 * floatValue) + (x10 * f24));
                    mh1Var.U.setTranslationY((f22 * floatValue) + (y10 * f24));
                    mh1Var.U.setCornerRadius((dp * floatValue) + (f23 * f24));
                    mh1Var.U.setAlpha((f20 * floatValue) + (1.0f * f24));
                }
                float f26 = (r12 * floatValue) + (1.0f * f24);
                mh1Var.Y.setScaleX(f26);
                mh1Var.Y.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                mh1Var.Y.setTranslationX(f28);
                mh1Var.Y.setTranslationY(f29);
                mh1Var.Y.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f26);
                if (!mh1Var.U.L) {
                    mh1Var.Z.d(floatValue, false);
                }
                mh1Var.f40458q0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f40428a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        xe.d dVar = this.f40435c0;
        if (dVar != null) {
            dVar.c();
            this.f40435c0 = null;
        }
        bg.g3 g3Var = this.I;
        if (g3Var != null) {
            g3Var.dismiss();
            this.I = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.f40469x0 && this.f40471y0 != z10 && this.f40463t0) {
            this.f40471y0 = z10;
            org.telegram.ui.Components.voip.y2 y2Var = this.f40466w;
            if (y2Var.G && z10 != y2Var.A) {
                y2Var.A = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                y2Var.f33956c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x2(y2Var, 1));
                y2Var.f33956c.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                y2Var.f33956c.setDuration(200L);
                y2Var.f33956c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.K0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.O0);
                this.N0 = false;
                if (this.f40470y.getVisibility() == 0) {
                    this.f40470y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
                }
                this.K.animate().setListener(null).cancel();
                this.K.setVisibility(0);
                this.K.setAlpha(0.0f);
                this.K.setScaleX(0.3f);
                this.K.setScaleY(0.3f);
                this.K.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.f28845g).start();
                ViewPropertyAnimator translationY = this.J.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
                org.telegram.messenger.ll.r(translationY, grVar, 400L);
                this.N.animate().setListener(null).cancel();
                this.N.setVisibility(0);
                this.N.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.N.setScaleX(0.7f);
                this.N.setScaleY(0.7f);
                this.N.setAlpha(0.0f);
                this.N.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ah1(this, 3)).setInterpolator(grVar).start();
            } else {
                if (this.f40470y.getVisibility() == 0) {
                    this.f40470y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
                }
                this.K.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f28844f;
                duration.setInterpolator(grVar2).setListener(new org.telegram.ui.Components.u9(this.K)).start();
                this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar2).setDuration(280L).start();
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ah1(this, 4)).setDuration(250L).setInterpolator(grVar2).start();
            }
            this.m0 = this.f40453l0;
            H();
        }
    }

    public final void n() {
        this.f40458q0.b();
    }

    public final void o() {
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bh1(this));
        this.Y.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ch1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.X.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.m0 = this.f40453l0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        this.m0 = this.f40453l0;
        if (i10 == 2 && !this.Q0) {
            this.Q0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f40435c0 == null && af.d.a(this.f40431b) == 1) {
                xe.c cVar = new xe.c(this.f40431b, f40427j1);
                cVar.f49135c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.r2 r2Var = this.Y;
                cVar.f49140j = r2Var.d;
                cVar.f49141k = r2Var.getPlaceholderView();
                this.f40435c0 = cVar.a();
            }
        } else {
            xe.d dVar = this.f40435c0;
            if (dVar != null) {
                dVar.c();
                this.f40435c0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.ui.Components.voip.b3 b3Var;
        if (i9 > 0) {
            this.f40444f1 = true;
        }
        if (this.B != null && (b3Var = this.v) != null) {
            int i10 = b3Var.R;
            if ((i10 == 2 || i10 == 3) && this.f40444f1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(this, i9, 26), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i9) {
        int i10 = this.f40453l0;
        if (i10 != i9) {
            this.m0 = i10;
            this.f40453l0 = i9;
            if (this.f40458q0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.m0 = this.f40453l0;
        if (z10 && !this.Q0) {
            this.Q0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.C0 && !this.A0) {
            fh1 fh1Var = this.f40452k0;
            if (fh1Var != null) {
                fh1Var.a(false, false);
            } else if (this.f40449i0 && this.f40451j0 && this.D0) {
                this.D0 = false;
                this.U.setRelativePosition(this.V);
                this.W = false;
                this.m0 = this.f40453l0;
                H();
            } else if (this.f40471y0) {
                m(false);
            } else if (this.N.getVisibility() == 8) {
                if (this.f40472z0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (af.d.a(this.f40431b) > 0) {
                        if (!this.C0 && f40427j1 != null) {
                            this.C0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f40427j1.f40458q0.getMeasuredHeight();
                                mh1 mh1Var = f40427j1;
                                org.telegram.ui.Components.voip.l2.l(mh1Var.f40431b, mh1Var.f40428a, mh1Var.f40458q0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f40427j1.f40455n0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.l2.S = windowInsets.getSystemWindowInsetTop();
                                    f40427j1.f40455n0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.l2.k() != null) {
                                ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
                                duration.setInterpolator(grVar).start();
                                this.D.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.T.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.f40443f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f40437d0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f40440e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.V.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.I0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                org.telegram.ui.Components.voip.l2.P = true;
                                this.A0 = true;
                                ValueAnimator k10 = k(false);
                                this.H0.lock();
                                k10.addListener(new ah1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(grVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.y4.B(this.f40431b, new ug1(this, 0), true).o();
                    return;
                }
                this.f40458q0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f40442f.getVisibility() == 0) {
            this.f40429a0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f40429a0;
            ValueAnimator valueAnimator = eVar.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.U = null;
                eVar.Q.stop();
            }
            runnable.run();
            return;
        }
        this.f40454n.animate().cancel();
        this.f40439e.animate().cancel();
        this.h.animate().cancel();
        this.f40442f.animate().cancel();
        this.f40429a0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f40429a0;
        ValueAnimator valueAnimator2 = eVar2.U;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.U = null;
            eVar2.Q.stop();
        }
        this.f40454n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f40439e.d(5, false, false);
        this.h.d(1, false, false);
        this.f40442f.d(3, true, false);
        this.f40454n.setVisibility(0);
        this.f40439e.setVisibility(0);
        this.h.setVisibility(0);
        this.f40442f.setVisibility(0);
        this.f40454n.setAlpha(0.0f);
        this.f40439e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f40442f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40429a0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                mh1 mh1Var = mh1.this;
                mh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mh1Var.f40429a0.setTranslationY(dp2 * floatValue);
                int i9 = marginEnd;
                int i10 = (int) (i9 - ((i9 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                mh1Var.f40429a0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f40429a0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f40429a0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f40429a0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f40429a0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.su0(15, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new wg1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        if (!this.f40451j0) {
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
        j3Var.setOnBtnClickedListener(new a7(this, voIPService, j3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        j3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.U;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = s1Var.f33799b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            s1Var.G = f10;
            s1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f33799b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = s1Var.G;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            s1Var.f33799b0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.f33801c0);
            s1Var.f33799b0.setDuration(150L);
            s1Var.f33799b0.start();
        }
        j3Var.setOnBtnClickedListener(new ug1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        int i9;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            j3Var.d(4, false, false);
            i9 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            j3Var.d(5, true, false);
            i9 = 0;
        } else {
            j3Var.d(5, false, false);
            i9 = 1;
        }
        j3Var.setEnabled(true);
        j3Var.setOnBtnClickedListener(new bg.d0(this, i9, j3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f40451j0 && !this.f40449i0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f40451j0) {
                if (voIPService.isScreencast()) {
                    j3Var.d(3, false, z10);
                } else {
                    j3Var.d(3, false, z10);
                }
            } else {
                j3Var.d(3, true, z10);
            }
            j3Var.setOnBtnClickedListener(new ug1(this, 6));
            j3Var.setEnabled(true);
            return;
        }
        j3Var.d(3, true, false);
        j3Var.setOnClickListener(null);
        j3Var.setEnabled(false);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12;
        int i9 = 0;
        if (!this.f40451j0 && !this.f40449i0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f40470y.getTag() == null) {
                this.f40470y.animate().setListener(null).cancel();
                this.f40470y.setVisibility(0);
                if (!this.f40471y0) {
                    if (z11) {
                        this.f40470y.setAlpha(0.0f);
                        this.f40470y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
                    } else {
                        this.f40470y.setAlpha(0.0f);
                        this.f40470y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f40470y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
                    }
                } else if (z11) {
                    this.f40470y.setAlpha(0.0f);
                    this.f40470y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f40470y.setScaleX(0.1f);
                    this.f40470y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f40470y.getTag() != null) {
                this.f40470y.animate().setListener(null).cancel();
                this.f40470y.setTranslationY(0.0f);
                this.f40470y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.gr.f28844f).setListener(new ah1(this, 7)).start();
            }
        } else {
            this.f40470y.animate().setListener(null).cancel();
            this.f40470y.setTranslationY(0.0f);
            this.f40470y.setAlpha(1.0f);
            this.f40470y.setScaleX(1.0f);
            this.f40470y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.q0 q0Var = this.f40470y;
            if (!z12) {
                i9 = 8;
            }
            q0Var.setVisibility(i9);
        }
        org.telegram.ui.Components.voip.q0 q0Var2 = this.f40470y;
        if (z12) {
            num = 1;
        }
        q0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f40431b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.f40431b, 0, null);
        boolean[] zArr = new boolean[3];
        c2Var.N = LocaleController.getString(R.string.VoipFailed);
        c2Var.P = charSequence;
        c2Var.f22773h0 = LocaleController.getString(R.string.OK);
        c2Var.f22774i0 = null;
        c2Var.show();
        for (int i9 = 0; i9 < 3; i9++) {
            if (zArr[i9] && (textView = (TextView) c2Var.d(-(i9 + 1))) != null) {
                textView.setTextColor(c2Var.e(org.telegram.ui.ActionBar.f6.f23230q7));
            }
        }
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnDismissListener(new r5(this, 19));
    }

    public final void z(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
            this.U.setUiVisible(this.f40463t0);
        }
        if (!z10 && (animatorSet = this.f40467w0) != null) {
            animatorSet.removeAllListeners();
            this.f40467w0.cancel();
        }
        boolean z13 = true;
        if (i9 == 0) {
            if (z10) {
                if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f40467w0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f40467w0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.s1 s1Var = this.U;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(s1Var, View.ALPHA, s1Var.getAlpha(), 0.0f));
                    if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.s1 s1Var2 = this.U;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var2, View.SCALE_X, s1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.s1 s1Var3 = this.U;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var3, View.SCALE_Y, s1Var3.getScaleX(), 0.7f));
                    }
                    this.f40467w0 = animatorSet3;
                    animatorSet3.addListener(new ah1(this, 6));
                    this.f40467w0.setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    this.f40467w0.setStartDelay(50L);
                    this.f40467w0.start();
                }
            } else {
                this.U.setVisibility(8);
            }
        } else {
            if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z10) {
                if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 0) {
                    if (this.U.getVisibility() == 8) {
                        this.U.setAlpha(0.0f);
                        this.U.setScaleX(0.7f);
                        this.U.setScaleY(0.7f);
                        this.U.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.f40467w0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f40467w0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 0.7f, 1.0f));
                    this.f40467w0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.U.setVisibility(0);
            }
            if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var4 = this.U;
                if (s1Var4.f33812y < 0.0f) {
                    s1Var4.d(1.0f, 1.0f);
                    this.W = true;
                }
            }
            org.telegram.ui.Components.voip.s1 s1Var5 = this.U;
            if (i9 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            s1Var5.c(z12, z11);
            if (i9 == 2) {
                z13 = false;
            }
            this.W = z13;
        }
        this.U.setTag(Integer.valueOf(i9));
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

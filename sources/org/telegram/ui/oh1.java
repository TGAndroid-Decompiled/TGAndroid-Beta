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
public final class oh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, cf.a {
    public static oh1 f41135j1;
    public TextView A;
    public boolean A0;
    public org.telegram.ui.Components.voip.r2 B;
    public float B0;
    public nh1 C;
    public boolean C0;
    public ImageView D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public int F;
    public boolean F0;
    public org.telegram.ui.Components.je G;
    public long G0;
    public int H;
    public eg.w2 I;
    public org.telegram.ui.Components.voip.j2 I0;
    public ua1 J;
    public org.telegram.ui.Components.voip.f3 J0;
    public FrameLayout K;
    public org.telegram.ui.Components.voip.f3 K0;
    public org.telegram.ui.Components.voip.p0 L;
    public ValueAnimator L0;
    public org.telegram.ui.Components.voip.m1 M;
    public bg.l0 N;
    public boolean N0;
    public TextView O;
    public jk P;
    public org.telegram.ui.Components.voip.k Q;
    public boolean Q0;
    public float R0;
    public float S0;
    public kh1 T;
    public float T0;
    public org.telegram.ui.Components.voip.t1 U;
    public float U0;
    public org.telegram.ui.Components.voip.t1 V;
    public float V0;
    public boolean W;
    public boolean W0;
    public TextureViewRenderer X;
    public float X0;
    public org.telegram.ui.Components.voip.u2 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u2 Z;
    public int Z0;
    public final int f41136a;
    public org.telegram.ui.Components.voip.e f41137a0;
    public int f41138a1;
    public Activity f41139b;
    public boolean f41140b0;
    public final TLRPC.User f41142c;
    public af.g f41143c0;
    public boolean f41144c1;
    public final TLRPC.User d;
    public View f41145d0;
    public boolean f41146d1;
    public org.telegram.ui.Components.voip.m3 f41147e;
    public View f41148e0;
    public ValueAnimator f41149e1;
    public org.telegram.ui.Components.voip.m3 f41150f;
    public org.telegram.ui.Components.voip.p1 f41151f0;
    public boolean f41152f1;
    public org.telegram.ui.Components.voip.u2 f41154g1;
    public org.telegram.ui.Components.voip.m3 h;
    public c2.p f41156h1;
    public boolean f41157i0;
    public boolean f41158i1;
    public boolean f41159j0;
    public hh1 f41160k0;
    public int f41161l0;
    public int m0;
    public lh1 f41162n;
    public WindowInsets f41163n0;
    public boolean f41164o0;
    public float f41165p0;
    public gh1 f41166q0;
    public int f41168r0;
    public jh1 f41169s;
    public AccessibilityManager f41170s0;
    public org.telegram.ui.Components.voip.e3 v;
    public boolean f41173v0;
    public org.telegram.ui.Components.voip.b3 f41174w;
    public AnimatorSet f41175w0;
    public org.telegram.ui.Components.voip.g3 f41176x;
    public boolean f41177x0;
    public org.telegram.ui.Components.voip.r0 f41178y;
    public boolean f41179y0;
    public boolean f41180z0;
    public final org.telegram.ui.Components.voip.o1 f41167r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.t9[] R = new org.telegram.ui.Components.t9[4];
    public final Drawable[] S = new Drawable[4];
    public final Paint f41153g0 = new Paint();
    public final Paint f41155h0 = new Paint();
    public boolean f41171t0 = true;
    public float f41172u0 = 1.0f;
    public final AnimationNotificationsLocker H0 = new AnimationNotificationsLocker();
    public final w01 M0 = new w01(this, 20);
    public final yg1 O0 = new yg1(this, 12);
    public final yg1 P0 = new yg1(this, 13);
    public float f41141b1 = 1.0f;

    public oh1(int i10) {
        this.f41136a = i10;
        this.f41142c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
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
        this.f41161l0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(oh1 oh1Var) {
        AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
        oh1Var.N0 = false;
        if (Build.VERSION.SDK_INT >= 23 && oh1Var.f41139b.checkSelfPermission("android.permission.CAMERA") != 0) {
            oh1Var.f41139b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            oh1Var.C();
        }
    }

    public static void j(oh1 oh1Var) {
        oh1 oh1Var2;
        if (oh1Var.f41144c1) {
            oh1Var.f41144c1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            oh1Var.f41149e1 = ofFloat;
            oh1Var2 = oh1Var;
            ofFloat.addUpdateListener(new dg.c(oh1Var2, oh1Var.f41141b1, oh1Var.U0, oh1Var.V0, 2));
            oh1Var2.f41149e1.addListener(new ch1(oh1Var2, 0));
            oh1Var2.f41149e1.setDuration(350L);
            oh1Var2.f41149e1.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            oh1Var2.f41149e1.start();
        } else {
            oh1Var2 = oh1Var;
        }
        oh1Var2.f41146d1 = false;
        oh1Var2.W0 = false;
    }

    public static void q(int i10, int[] iArr) {
        oh1 oh1Var = f41135j1;
        if (oh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    oh1Var.f41166q0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    oh1Var.r(new ef0(9));
                } else if (!oh1Var.f41139b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.h2.i(oh1Var.f41139b, new yg1(oh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    oh1Var.f41166q0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    oh1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int size;
        int size2;
        float f9;
        oh1 oh1Var = f41135j1;
        if (oh1Var != null && oh1Var.f41166q0.getParent() == null) {
            oh1 oh1Var2 = f41135j1;
            if (oh1Var2 != null) {
                oh1Var2.Y.d.release();
                f41135j1.Z.d.release();
                f41135j1.X.release();
                gh1 gh1Var = f41135j1.f41166q0;
                if (gh1Var != null) {
                    gh1Var.d();
                }
                f41135j1.l();
            }
            f41135j1 = null;
        }
        if (f41135j1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.o2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                oh1 oh1Var3 = new oh1(i10);
                oh1Var3.f41139b = activity;
                f41135j1 = oh1Var3;
                gh1 gh1Var2 = new gh1(activity, !z10, oh1Var3);
                f41135j1.F0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f41135j1.getClass();
                gh1Var2.setLockOnScreen(f41135j1.F0);
                oh1Var3.f41166q0 = gh1Var2;
                wg1 wg1Var = new wg1(oh1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f46829a;
                r0.b0.j(gh1Var2, wg1Var);
                ((WindowManager) activity.getSystemService("window")).addView(gh1Var2, org.telegram.ui.Components.voip.y2.a());
                oh1Var3.f41165p0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                oh1Var3.f41170s0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                jh1 jh1Var = new jh1(oh1Var3, activity);
                jh1Var.setClipToPadding(false);
                jh1Var.setClipChildren(false);
                jh1Var.setBackgroundColor(-16777216);
                oh1Var3.G();
                oh1Var3.f41169s = jh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = oh1Var3.f41167r;
                oh1Var3.v = new org.telegram.ui.Components.voip.e3(activity, z11, o1Var);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity, false, true, false, false);
                oh1Var3.Y = u2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                u2Var.d.setScalingType(scalingType);
                oh1Var3.Y.d.setEnableHardwareScaler(true);
                oh1Var3.Y.d.setRotateTextureWithScreen(true);
                oh1Var3.Y.T = 1;
                jh1Var.addView(oh1Var3.v, i7.f6.c(-1.0f, -1));
                TLRPC.User user = oh1Var3.d;
                org.telegram.ui.Components.voip.b3 b3Var = new org.telegram.ui.Components.voip.b3(activity, user, o1Var);
                oh1Var3.f41174w = b3Var;
                jh1Var.addView(b3Var, i7.f6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.g6.f23002a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f33714a = new org.telegram.ui.Components.sv0(0);
                    }
                }
                oh1Var3.f41176x = view;
                jh1Var.addView((View) view, i7.f6.c(220.0f, -1));
                jh1Var.addView(oh1Var3.Y);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.s9(orientation, new int[]{-14994098, -14328963}).f(o1.a.F(0.5f, 1), new xb1(oh1Var3, 1), 0L);
                org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
                oh1Var3.U = t1Var;
                t1Var.setDelegate(new wg1(oh1Var3, 3));
                oh1Var3.U.d(1.0f, 1.0f);
                oh1Var3.W = true;
                org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(activity, true, false);
                oh1Var3.Z = u2Var2;
                u2Var2.d.setIsCamera(true);
                oh1Var3.Z.d.setUseCameraRotation(true);
                oh1Var3.U.setOnTapListener(new zg1(oh1Var3, 1));
                oh1Var3.Z.d.setMirror(true);
                oh1Var3.U.addView(oh1Var3.Z);
                org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
                oh1Var3.V = t1Var2;
                t1Var2.O = true;
                t1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                oh1Var3.X = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                oh1Var3.X.setIsCamera(false);
                oh1Var3.X.setFpsReduction(30.0f);
                oh1Var3.X.setScalingType(scalingType);
                oh1Var3.V.addView(oh1Var3.X, i7.f6.e(-1, -2, 17));
                oh1Var3.V.setOnTapListener(new zg1(oh1Var3, 2));
                oh1Var3.V.setVisibility(8);
                jh1Var.addView(oh1Var3.U, i7.f6.c(-2.0f, -2));
                jh1Var.addView(oh1Var3.V);
                View view2 = new View(activity);
                oh1Var3.f41145d0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                jh1Var.addView(oh1Var3.f41145d0, i7.f6.e(-1, 160, 80));
                View view3 = new View(activity);
                oh1Var3.f41148e0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                jh1Var.addView(oh1Var3.f41148e0, i7.f6.e(-1, 160, 48));
                ua1 ua1Var = new ua1(oh1Var3, activity, 18);
                oh1Var3.J = ua1Var;
                ua1Var.setOrientation(0);
                oh1Var3.J.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                oh1Var3.J.setClipToPadding(false);
                oh1Var3.J.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                oh1Var3.J.setOnClickListener(new zg1(oh1Var3, 3));
                oh1Var3.L = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                oh1Var3.K = frameLayout;
                frameLayout.addView(oh1Var3.L, i7.f6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                oh1Var3.K.setVisibility(8);
                oh1Var3.K.setOnClickListener(new zg1(oh1Var3, 4));
                bg.l0 l0Var = new bg.l0(activity, o1Var);
                oh1Var3.N = l0Var;
                l0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                oh1Var3.O = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                oh1Var3.O.setTextSize(1, 15.0f);
                oh1Var3.O.setTypeface(AndroidUtilities.bold());
                oh1Var3.O.setTextColor(-1);
                oh1Var3.O.setGravity(17);
                jk jkVar = new jk(oh1Var3, activity, 5);
                oh1Var3.P = jkVar;
                jkVar.setTextSize(1, 15.0f);
                oh1Var3.P.setTextColor(-1);
                oh1Var3.P.setGravity(17);
                oh1Var3.P.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), oh1Var3.P.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                oh1Var3.N.setVisibility(8);
                oh1Var3.N.addView(oh1Var3.O);
                oh1Var3.N.addView(oh1Var3.P, i7.f6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                oh1Var3.N.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
                    org.telegram.ui.Components.t9[] t9VarArr = oh1Var3.R;
                    t9VarArr[i15] = t9Var;
                    t9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ua1 ua1Var2 = oh1Var3.J;
                    org.telegram.ui.Components.t9 t9Var2 = t9VarArr[i15];
                    if (i15 == 0) {
                        f9 = 0.0f;
                    } else {
                        f9 = 6.0f;
                    }
                    ua1Var2.addView(t9Var2, i7.f6.k(f9, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                kh1 kh1Var = new kh1(oh1Var3, activity);
                oh1Var3.T = kh1Var;
                kh1Var.setOrientation(1);
                oh1Var3.T.setFocusable(true);
                oh1Var3.T.setFocusableInTouchMode(true);
                oh1Var3.f41178y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = oh1Var3.f41178y;
                int i16 = oh1Var3.f41136a;
                r0Var.f33962b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, e9Var, user);
                oh1Var3.f41178y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                oh1Var3.A = textView2;
                textView2.setTextSize(1, 28.0f);
                oh1Var3.A.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), oh1Var3.A.getPaint().getFontMetricsInt(), false));
                oh1Var3.A.setMaxLines(2);
                oh1Var3.A.setEllipsize(TextUtils.TruncateAt.END);
                oh1Var3.A.setTextColor(-1);
                oh1Var3.A.setGravity(1);
                oh1Var3.A.setImportantForAccessibility(2);
                oh1Var3.T.addView(oh1Var3.A, i7.f6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f33969a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f33969a[i17] = new TextView(activity);
                    frameLayout2.f33969a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f33969a[i17].setTextColor(-1);
                    frameLayout2.f33969a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f33969a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f33971c = frameLayout3;
                org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(frameLayout2, activity, o1Var);
                p2Var.setTextSize(1, 15.0f);
                p2Var.setTextColor(-1);
                p2Var.setGravity(1);
                p2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                p2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(p2Var, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, i7.f6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f33970b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, i7.f6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new org.telegram.ui.Components.b0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity);
                frameLayout2.d = v2Var;
                frameLayout2.addView(v2Var, i7.f6.c(-2.0f, -1));
                oh1Var3.B = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f46829a;
                frameLayout2.setImportantForAccessibility(4);
                oh1Var3.T.addView(oh1Var3.B, i7.f6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    nh1 nh1Var = new nh1(activity);
                    oh1Var3.C = nh1Var;
                    long j10 = sharedState.getUser().f22539id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        nh1Var.setVisibility(8);
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
                        org.telegram.ui.Components.g9 g9Var = nh1Var.f40811b;
                        g9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            g9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        g9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            nh1Var.setVisibility(8);
                        } else {
                            nh1Var.f40812c = new org.telegram.ui.Components.zz0(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            nh1Var.setVisibility(0);
                            nh1Var.invalidate();
                        }
                    }
                    oh1Var3.T.addView(oh1Var3.C, i7.f6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                oh1Var3.T.setClipChildren(false);
                oh1Var3.T.setClipToPadding(false);
                oh1Var3.T.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                oh1Var3.Q = new org.telegram.ui.Components.voip.k(activity);
                oh1Var3.M = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                oh1Var3.Q.setAlpha(0.0f);
                oh1Var3.M.setVisibility(8);
                jh1Var.addView(oh1Var3.f41178y, i7.f6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.T, i7.f6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.K, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.N, i7.f6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.J, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.Q, i7.f6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                jh1Var.addView(oh1Var3.M, i7.f6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                oh1Var3.f41151f0 = new org.telegram.ui.Components.voip.p1(activity);
                oh1Var3.f41147e = new org.telegram.ui.Components.voip.m3(activity, o1Var);
                oh1Var3.f41150f = new org.telegram.ui.Components.voip.m3(activity, o1Var);
                oh1Var3.h = new org.telegram.ui.Components.voip.m3(activity, o1Var);
                oh1Var3.f41162n = new org.telegram.ui.Components.voip.x2(activity, 52.0f);
                oh1Var3.f41147e.setTranslationY(AndroidUtilities.dp(100.0f));
                oh1Var3.f41147e.setScaleX(0.0f);
                oh1Var3.f41147e.setScaleY(0.0f);
                oh1Var3.f41147e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                oh1Var3.f41150f.setTranslationY(AndroidUtilities.dp(100.0f));
                oh1Var3.f41150f.setScaleX(0.0f);
                oh1Var3.f41150f.setScaleY(0.0f);
                oh1Var3.f41150f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                oh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                oh1Var3.h.setScaleX(0.0f);
                oh1Var3.h.setScaleY(0.0f);
                oh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                oh1Var3.f41162n.setTranslationY(AndroidUtilities.dp(100.0f));
                oh1Var3.f41162n.setScaleX(0.0f);
                oh1Var3.f41162n.setScaleY(0.0f);
                oh1Var3.f41162n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                oh1Var3.f41151f0.addView(oh1Var3.f41147e);
                oh1Var3.f41151f0.addView(oh1Var3.f41150f);
                oh1Var3.f41151f0.addView(oh1Var3.h);
                oh1Var3.f41151f0.addView(oh1Var3.f41162n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                oh1Var3.f41137a0 = eVar;
                eVar.setListener(new mh1(oh1Var3));
                oh1Var3.f41137a0.setScaleX(1.15f);
                oh1Var3.f41137a0.setScaleY(1.15f);
                jh1Var.addView(oh1Var3.f41151f0, i7.f6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                jh1Var.addView(oh1Var3.f41137a0, i7.f6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                oh1Var3.E = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
                oh1Var3.E.setImageResource(R.drawable.msg_addcontact);
                oh1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                jh1Var.addView(oh1Var3.E, i7.f6.e(56, 56, 53));
                i7.h6.a(oh1Var3.E);
                ImageView imageView2 = new ImageView(activity);
                oh1Var3.D = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
                oh1Var3.D.setImageResource(R.drawable.msg_call_minimize_shadow);
                oh1Var3.D.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                oh1Var3.D.setContentDescription(LocaleController.getString(R.string.Back));
                jh1Var.addView(oh1Var3.D, i7.f6.e(56, 56, 51));
                i7.h6.a(oh1Var3.D);
                org.telegram.ui.Components.je jeVar = new org.telegram.ui.Components.je(activity, 4);
                oh1Var3.G = jeVar;
                jeVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                oh1Var3.G.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
                oh1Var3.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                jh1Var.addView(oh1Var3.G, i7.f6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                oh1Var3.G.setAlpha(0.0f);
                oh1Var3.G.setOnClickListener(new zg1(oh1Var3, 5));
                oh1Var3.D.setOnClickListener(new zg1(oh1Var3, 6));
                oh1Var3.E.setOnClickListener(new t70(28, oh1Var3, activity));
                if (oh1Var3.f41166q0.f34139b) {
                    oh1Var3.D.setVisibility(8);
                    oh1Var3.E.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f33773a = new HashMap();
                linearLayout.f33774b = new ArrayList();
                linearLayout.f33775c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f33779r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f33778n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new cg.j0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                oh1Var3.I0 = linearLayout;
                linearLayout.setGravity(80);
                oh1Var3.I0.setOnViewsUpdated(new yg1(oh1Var3, 5));
                jh1Var.addView(oh1Var3.I0, i7.f6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.f3 f3Var = new org.telegram.ui.Components.voip.f3(activity, 3, o1Var, true);
                f3Var.q(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                f3Var.G = alignment;
                f3Var.d = -1L;
                f3Var.f18597h0 = new yg1(oh1Var3, 6);
                f3Var.P = true;
                f3Var.h = AndroidUtilities.dp(320.0f);
                f3Var.f18592e = true;
                f3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
                f3Var.r(8.0f);
                oh1Var3.J0 = f3Var;
                f3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
                jh1Var.addView(oh1Var3.J0, i7.f6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.f3 f3Var2 = new org.telegram.ui.Components.voip.f3(activity, 1, o1Var, false);
                f3Var2.q(true);
                f3Var2.G = alignment;
                f3Var2.d = 4000L;
                f3Var2.P = true;
                f3Var2.h = AndroidUtilities.dp(320.0f);
                f3Var2.f18592e = true;
                f3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
                f3Var2.r(8.0f);
                oh1Var3.K0 = f3Var2;
                f3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
                jh1Var.addView(oh1Var3.K0, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                oh1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!oh1Var3.Q0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        oh1Var3.Q0 = z12;
                    }
                    oh1Var3.o();
                }
                gh1Var2.addView(jh1Var);
                if (z10) {
                    oh1Var3.B0 = 0.0f;
                    oh1Var3.E0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        oh1Var3.Y.setStub(org.telegram.ui.Components.voip.o2.k().f33900r);
                        oh1Var3.Z.setStub(org.telegram.ui.Components.voip.o2.k().f33899n);
                    }
                    oh1Var3.f41166q0.setAlpha(0.0f);
                    oh1Var3.H();
                    oh1Var3.A0 = true;
                    org.telegram.ui.Components.voip.o2.P = true;
                    if (org.telegram.ui.Components.voip.o2.R == null) {
                        oh1Var3.H0.lock();
                        AndroidUtilities.runOnUIThread(new yg1(oh1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.o2.Q.getClass();
                        throw null;
                    }
                } else {
                    oh1Var3.B0 = 1.0f;
                    oh1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && df.d.a(activity) == 1) {
                    oh1 oh1Var4 = f41135j1;
                    af.f fVar = new af.f(activity, oh1Var4);
                    fVar.f388c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.u2 u2Var3 = oh1Var4.Y;
                    fVar.f393j = u2Var3.d;
                    fVar.f394k = u2Var3.getPlaceholderView();
                    oh1Var4.f41143c0 = fVar.a();
                }
            }
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        w01 w01Var = this.M0;
        int i11 = 0;
        if (!z10 && this.f41171t0) {
            ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            duration.setInterpolator(jrVar).start();
            this.D.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar).start();
            this.J.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar).start();
            this.A.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jrVar).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jrVar).start();
            this.f41151f0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar).start();
            this.f41145d0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
            this.f41148e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41172u0, 0.0f);
            this.L0 = ofFloat;
            ofFloat.addUpdateListener(w01Var);
            this.L0.setDuration(150L).setInterpolator(jrVar);
            this.L0.start();
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            this.N0 = false;
            this.f41151f0.setEnabled(false);
            this.K0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f41171t0) {
                this.J0.e(true);
                this.K0.e(true);
                ViewPropertyAnimator translationY = this.A.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f29800f;
                translationY.setInterpolator(jrVar2).start();
                this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(jrVar2).start();
                this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.D.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.f41151f0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.f41145d0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar2).start();
                this.f41148e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f41172u0, 1.0f);
                this.L0 = ofFloat2;
                ofFloat2.addUpdateListener(w01Var);
                this.L0.setDuration(150L).setInterpolator(jrVar2);
                this.L0.start();
                this.f41151f0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f41171t0 = z10;
        gh1 gh1Var = this.f41166q0;
        if (!z10) {
            gh1Var.setSystemUiVisibility(gh1Var.getSystemUiVisibility() | 4);
        } else {
            gh1Var.setSystemUiVisibility(gh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.I0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f41171t0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            yg1 yg1Var = this.O0;
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            this.N0 = false;
            if (this.f41173v0 && this.f41171t0) {
                AndroidUtilities.runOnUIThread(yg1Var, 3000L);
                this.N0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f41170s0.isTouchExplorationEnabled()) {
                if (!this.f41159j0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f41169s.announceForAccessibility(string);
            }
            if (!this.f41159j0) {
                if (this.f41160k0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f41166q0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f41150f.getLocationOnScreen(iArr);
                    hh1 hh1Var = new hh1(this, this.f41169s.getContext(), iArr[0], iArr[1]);
                    this.f41160k0 = hh1Var;
                    WindowInsets windowInsets = this.f41163n0;
                    if (windowInsets != null) {
                        hh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f41169s.addView(this.f41160k0);
                    return;
                }
                return;
            }
            this.Z.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.m0 = this.f41161l0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new cg.j0(5).setDuration(250L);
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
                transitionSet.addTransition(duration.setInterpolator(jrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(jrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.x2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.m3.class, true);
                TransitionManager.beginDelayedTransition(this.f41151f0, transitionSet);
            }
            int i10 = this.f41161l0;
            if (i10 == 11) {
                this.f41147e.setVisibility(8);
                this.f41150f.setVisibility(8);
                this.h.setVisibility(8);
                this.f41162n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f41135j1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f41159j0 || this.f41157i0)) {
                    s(this.f41147e, sharedInstance);
                    if (this.f41171t0) {
                        this.G.setTag(1);
                        this.G.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.f41147e, sharedInstance);
                    this.G.setTag(null);
                    this.G.animate().alpha(0.0f).start();
                }
                v(this.f41150f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f41162n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f41162n.setOnClickListener(new zg1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f41159j0 || this.f41157i0)) {
                        s(this.f41147e, sharedInstance);
                        if (this.f41171t0) {
                            this.G.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.f41147e, sharedInstance);
                        this.G.animate().alpha(0.0f).start();
                    }
                    v(this.f41150f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.f41147e.setVisibility(8);
                    this.f41150f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f41162n.setVisibility(8);
            }
            if (this.f41147e.getVisibility() == 0) {
                this.f41147e.f33859f = 0;
                i11 = 16;
            }
            if (this.f41150f.getVisibility() == 0) {
                this.f41150f.f33859f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f33859f = i11;
                i11 += 16;
            }
            if (this.f41162n.getVisibility() == 0) {
                this.f41162n.B = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oh1.E(boolean):void");
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
        if (this.F != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.G, i10);
        } else {
            this.G.setImageResource(i10);
        }
        this.F = i10;
    }

    public final void G() {
        this.f41153g0.setColor(i0.a.k(-16777216, (int) (this.f41172u0 * 102.0f * this.B0)));
        this.f41155h0.setColor(i0.a.k(-16777216, (int) (127.5f * this.B0)));
        jh1 jh1Var = this.f41169s;
        if (jh1Var != null) {
            jh1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oh1.H():void");
    }

    @Override
    public final void a(c2.p pVar) {
        this.f41156h1 = pVar;
        gh1 gh1Var = this.f41166q0;
        gh1Var.getClass();
        ((WindowManager) this.f41139b.getSystemService("window")).addView(gh1Var, org.telegram.ui.Components.voip.y2.a());
        this.f41158i1 = false;
        H();
        this.f41166q0.invalidate();
        org.telegram.ui.Components.voip.u2 u2Var = this.f41154g1;
        if (u2Var != null) {
            u2Var.d.release();
            this.f41154g1 = null;
        }
    }

    @Override
    public final Bitmap b() {
        org.telegram.ui.Components.voip.u2 u2Var = this.f41154g1;
        if (u2Var != null && u2Var.d.isAvailable()) {
            return this.f41154g1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap d() {
        org.telegram.ui.Components.voip.u2 u2Var = this.Y;
        if (u2Var != null && u2Var.d.isAvailable()) {
            return this.Y.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.f41161l0 == 17 && VoIPService.getSharedInstance() != null) {
                this.Z.d.release();
                this.Y.d.release();
                this.X.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f41166q0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f41178y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f41140b0 = booleanValue;
            if (booleanValue) {
                this.f41178y.b(true, true);
            }
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.f41156h1 = pVar;
        org.telegram.ui.Components.voip.u2 u2Var = this.Y;
        if (u2Var != null) {
            u2Var.d.clearFirstFrame();
        }
        this.f41158i1 = true;
        H();
        ((WindowManager) this.f41139b.getSystemService("window")).removeView(this.f41166q0);
        this.f41166q0.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(this.f41139b, false, true, false, false);
        this.f41154g1 = u2Var;
        u2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f41154g1.d.setEnableHardwareScaler(true);
        this.f41154g1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.u2 u2Var2 = this.f41154g1;
        u2Var2.T = 1;
        u2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ih1(this));
        View view = this.f41154g1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f41154g1;
    }

    public final ValueAnimator k(boolean z10) {
        char c3;
        float measuredHeight;
        final float f9;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        this.U.animate().cancel();
        float f17 = org.telegram.ui.Components.voip.o2.k().d.x + org.telegram.ui.Components.voip.o2.k().f33904y;
        float f18 = org.telegram.ui.Components.voip.o2.k().d.y + org.telegram.ui.Components.voip.o2.k().A;
        final float x4 = this.U.getX();
        final float y8 = this.U.getY();
        final float scaleX = this.U.getScaleX();
        org.telegram.ui.Components.voip.o2.Q.getClass();
        final float measuredWidth = f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f19 = 1.0f;
        if (this.f41157i0) {
            int measuredWidth2 = this.U.getMeasuredWidth();
            if (this.f41159j0 && measuredWidth2 != 0) {
                f16 = (this.f41166q0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f15 = (((org.telegram.ui.Components.voip.o2.k().f33898f * 0.25f) + (f17 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.o2.k().f33898f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.o2.k().h * 0.25f) + (f18 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.o2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c3 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f15 = 1.0f;
                f16 = 0.0f;
            }
            float f20 = f16;
            f9 = f15;
            f10 = f20;
        } else {
            c3 = 0;
            float measuredWidth3 = f17 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f18 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * 0.25f)) / 2.0f);
            f9 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f21 = measuredHeight;
        if (this.f41157i0) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.f41157i0) {
            org.telegram.ui.Components.voip.o2.Q.getClass();
            f19 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.U.setScaleX(f10);
                this.U.setScaleY(f10);
                this.U.setTranslationX(f9);
                this.U.setTranslationY(f21);
                this.U.setCornerRadius(dp);
                this.U.setAlpha(f19);
            }
            this.Y.setScaleX(0.25f);
            this.Y.setScaleY(0.25f);
            this.Y.setTranslationX(measuredWidth);
            this.Y.setTranslationY(measuredHeight2);
            this.Y.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 1.0f;
        }
        float[] fArr = new float[2];
        fArr[c3] = f12;
        fArr[1] = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f14 = 0.0f;
        } else {
            f14 = 1.0f;
        }
        this.B0 = f14;
        G();
        final float f22 = f11;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                oh1 oh1Var = oh1.this;
                oh1Var.B0 = f23;
                oh1Var.G();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    oh1Var.U.setScaleX(f24);
                    oh1Var.U.setScaleY(f24);
                    oh1Var.U.setTranslationX((f9 * floatValue) + (x4 * f23));
                    oh1Var.U.setTranslationY((f21 * floatValue) + (y8 * f23));
                    oh1Var.U.setCornerRadius((dp * floatValue) + (f22 * f23));
                    oh1Var.U.setAlpha((f19 * floatValue) + (1.0f * f23));
                }
                float f25 = (r12 * floatValue) + (1.0f * f23);
                oh1Var.Y.setScaleX(f25);
                oh1Var.Y.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                oh1Var.Y.setTranslationX(f27);
                oh1Var.Y.setTranslationY(f28);
                oh1Var.Y.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!oh1Var.U.L) {
                    oh1Var.Z.d(floatValue, false);
                }
                oh1Var.f41166q0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f41136a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        af.g gVar = this.f41143c0;
        if (gVar != null) {
            gVar.c();
            this.f41143c0 = null;
        }
        eg.w2 w2Var = this.I;
        if (w2Var != null) {
            w2Var.dismiss();
            this.I = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.f41177x0 && this.f41179y0 != z10 && this.f41171t0) {
            this.f41179y0 = z10;
            org.telegram.ui.Components.voip.b3 b3Var = this.f41174w;
            if (b3Var.G && z10 != b3Var.A) {
                b3Var.A = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                b3Var.f33636c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.a3(b3Var, 1));
                b3Var.f33636c.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                b3Var.f33636c.setDuration(200L);
                b3Var.f33636c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.K0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.O0);
                this.N0 = false;
                if (this.f41178y.getVisibility() == 0) {
                    this.f41178y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
                }
                this.K.animate().setListener(null).cancel();
                this.K.setVisibility(0);
                this.K.setAlpha(0.0f);
                this.K.setScaleX(0.3f);
                this.K.setScaleY(0.3f);
                this.K.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.jr.f29801g).start();
                ViewPropertyAnimator translationY = this.J.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
                b.q(translationY, jrVar, 400L);
                this.N.animate().setListener(null).cancel();
                this.N.setVisibility(0);
                this.N.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.N.setScaleX(0.7f);
                this.N.setScaleY(0.7f);
                this.N.setAlpha(0.0f);
                this.N.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ch1(this, 3)).setInterpolator(jrVar).start();
            } else {
                if (this.f41178y.getVisibility() == 0) {
                    this.f41178y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
                }
                this.K.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f29800f;
                duration.setInterpolator(jrVar2).setListener(new org.telegram.ui.Components.z9(this.K)).start();
                this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(jrVar2).setDuration(280L).start();
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ch1(this, 4)).setDuration(250L).setInterpolator(jrVar2).start();
            }
            this.m0 = this.f41161l0;
            H();
        }
    }

    public final void n() {
        this.f41166q0.b();
    }

    public final void o() {
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dh1(this));
        this.Y.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new eh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
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
        this.m0 = this.f41161l0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.m0 = this.f41161l0;
        if (i11 == 2 && !this.Q0) {
            this.Q0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f41143c0 == null && df.d.a(this.f41139b) == 1) {
                af.f fVar = new af.f(this.f41139b, f41135j1);
                fVar.f388c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.u2 u2Var = this.Y;
                fVar.f393j = u2Var.d;
                fVar.f394k = u2Var.getPlaceholderView();
                this.f41143c0 = fVar.a();
            }
        } else {
            af.g gVar = this.f41143c0;
            if (gVar != null) {
                gVar.c();
                this.f41143c0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.e3 e3Var;
        if (i10 > 0) {
            this.f41152f1 = true;
        }
        if (this.B != null && (e3Var = this.v) != null) {
            int i11 = e3Var.R;
            if ((i11 == 2 || i11 == 3) && this.f41152f1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(this, i10, 28), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f41161l0;
        if (i11 != i10) {
            this.m0 = i11;
            this.f41161l0 = i10;
            if (this.f41166q0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.m0 = this.f41161l0;
        if (z10 && !this.Q0) {
            this.Q0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.C0 && !this.A0) {
            hh1 hh1Var = this.f41160k0;
            if (hh1Var != null) {
                hh1Var.a(false, false);
            } else if (this.f41157i0 && this.f41159j0 && this.D0) {
                this.D0 = false;
                this.U.setRelativePosition(this.V);
                this.W = false;
                this.m0 = this.f41161l0;
                H();
            } else if (this.f41179y0) {
                m(false);
            } else if (this.N.getVisibility() == 8) {
                if (this.f41180z0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (df.d.a(this.f41139b) > 0) {
                        if (!this.C0 && f41135j1 != null) {
                            this.C0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f41135j1.f41166q0.getMeasuredHeight();
                                oh1 oh1Var = f41135j1;
                                org.telegram.ui.Components.voip.o2.l(oh1Var.f41139b, oh1Var.f41136a, oh1Var.f41166q0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f41135j1.f41163n0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.o2.S = windowInsets.getSystemWindowInsetTop();
                                    f41135j1.f41163n0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.o2.k() != null) {
                                ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
                                duration.setInterpolator(jrVar).start();
                                this.D.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                                this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                                this.T.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                                this.f41151f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
                                this.f41145d0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
                                this.f41148e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
                                this.V.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
                                this.I0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
                                org.telegram.ui.Components.voip.o2.P = true;
                                this.A0 = true;
                                ValueAnimator k9 = k(false);
                                this.H0.lock();
                                k9.addListener(new ch1(this, 1));
                                k9.setDuration(350L);
                                k9.setInterpolator(jrVar);
                                k9.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.c5.B(this.f41139b, new wg1(this, 0), true).o();
                    return;
                }
                this.f41166q0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f41150f.getVisibility() == 0) {
            this.f41137a0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f41137a0;
            ValueAnimator valueAnimator = eVar.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.U = null;
                eVar.Q.stop();
            }
            runnable.run();
            return;
        }
        this.f41162n.animate().cancel();
        this.f41147e.animate().cancel();
        this.h.animate().cancel();
        this.f41150f.animate().cancel();
        this.f41137a0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f41137a0;
        ValueAnimator valueAnimator2 = eVar2.U;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.U = null;
            eVar2.Q.stop();
        }
        this.f41162n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f41147e.d(5, false, false);
        this.h.d(1, false, false);
        this.f41150f.d(3, true, false);
        this.f41162n.setVisibility(0);
        this.f41147e.setVisibility(0);
        this.h.setVisibility(0);
        this.f41150f.setVisibility(0);
        this.f41162n.setAlpha(0.0f);
        this.f41147e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f41150f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41137a0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                oh1 oh1Var = oh1.this;
                oh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                oh1Var.f41137a0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                oh1Var.f41137a0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f41137a0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f41137a0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f41137a0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f41137a0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ok0(18, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new yg1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService) {
        if (!this.f41159j0) {
            m3Var.d(2, false, false);
            m3Var.setOnBtnClickedListener(null);
            m3Var.setEnabled(false);
            return;
        }
        m3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            m3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            m3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        m3Var.setOnBtnClickedListener(new z6(this, voIPService, m3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService, boolean z10) {
        m3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.U;
        boolean isMicMute = voIPService.isMicMute();
        float f9 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = t1Var.f33999b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f9 = 1.0f;
            }
            t1Var.G = f9;
            t1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = t1Var.f33999b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = t1Var.G;
            if (isMicMute) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            t1Var.f33999b0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f34001c0);
            t1Var.f33999b0.setDuration(150L);
            t1Var.f33999b0.start();
        }
        m3Var.setOnBtnClickedListener(new wg1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            m3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            m3Var.d(5, true, false);
            i10 = 0;
        } else {
            m3Var.d(5, false, false);
            i10 = 1;
        }
        m3Var.setEnabled(true);
        m3Var.setOnBtnClickedListener(new eg.b0(this, i10, m3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f41159j0 && !this.f41157i0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f41159j0) {
                if (voIPService.isScreencast()) {
                    m3Var.d(3, false, z10);
                } else {
                    m3Var.d(3, false, z10);
                }
            } else {
                m3Var.d(3, true, z10);
            }
            m3Var.setOnBtnClickedListener(new wg1(this, 6));
            m3Var.setEnabled(true);
            return;
        }
        m3Var.d(3, true, false);
        m3Var.setOnClickListener(null);
        m3Var.setEnabled(false);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f41159j0 && !this.f41157i0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f41178y.getTag() == null) {
                this.f41178y.animate().setListener(null).cancel();
                this.f41178y.setVisibility(0);
                if (!this.f41179y0) {
                    if (z11) {
                        this.f41178y.setAlpha(0.0f);
                        this.f41178y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
                    } else {
                        this.f41178y.setAlpha(0.0f);
                        this.f41178y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f41178y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
                    }
                } else if (z11) {
                    this.f41178y.setAlpha(0.0f);
                    this.f41178y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f41178y.setScaleX(0.1f);
                    this.f41178y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f41178y.getTag() != null) {
                this.f41178y.animate().setListener(null).cancel();
                this.f41178y.setTranslationY(0.0f);
                this.f41178y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.jr.f29800f).setListener(new ch1(this, 7)).start();
            }
        } else {
            this.f41178y.animate().setListener(null).cancel();
            this.f41178y.setTranslationY(0.0f);
            this.f41178y.setAlpha(1.0f);
            this.f41178y.setScaleX(1.0f);
            this.f41178y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f41178y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f41178y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f41139b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.f41139b, 0, null);
        boolean[] zArr = new boolean[3];
        c2Var.N = LocaleController.getString(R.string.VoipFailed);
        c2Var.P = charSequence;
        c2Var.f22790h0 = LocaleController.getString(R.string.OK);
        c2Var.f22791i0 = null;
        c2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(c2Var.e(org.telegram.ui.ActionBar.g6.f23295q7));
            }
        }
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
            this.U.setUiVisible(this.f41171t0);
        }
        if (!z10 && (animatorSet = this.f41175w0) != null) {
            animatorSet.removeAllListeners();
            this.f41175w0.cancel();
        }
        boolean z13 = true;
        if (i10 == 0) {
            if (z10) {
                if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f41175w0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f41175w0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.t1 t1Var = this.U;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(t1Var, View.ALPHA, t1Var.getAlpha(), 0.0f));
                    if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.t1 t1Var2 = this.U;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var2, View.SCALE_X, t1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.t1 t1Var3 = this.U;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var3, View.SCALE_Y, t1Var3.getScaleX(), 0.7f));
                    }
                    this.f41175w0 = animatorSet3;
                    animatorSet3.addListener(new ch1(this, 6));
                    this.f41175w0.setDuration(250L).setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    this.f41175w0.setStartDelay(50L);
                    this.f41175w0.start();
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
                    AnimatorSet animatorSet4 = this.f41175w0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f41175w0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.U, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.U, View.SCALE_Y, 0.7f, 1.0f));
                    this.f41175w0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.U.setVisibility(0);
            }
            if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var4 = this.U;
                if (t1Var4.f34012y < 0.0f) {
                    t1Var4.d(1.0f, 1.0f);
                    this.W = true;
                }
            }
            org.telegram.ui.Components.voip.t1 t1Var5 = this.U;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            t1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.W = z13;
        }
        this.U.setTag(Integer.valueOf(i10));
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

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
public final class ii1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, ef.a {
    public static ii1 f37669k1;
    public boolean A0;
    public TextView B;
    public boolean B0;
    public org.telegram.ui.Components.voip.q2 C;
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
    public hg.v2 J;
    public org.telegram.ui.Components.voip.i2 J0;
    public ob1 K;
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
    public ei1 U;
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
    public final int f37670a;
    public org.telegram.ui.Components.voip.t2 f37671a0;
    public int f37672a1;
    public Activity f37673b;
    public org.telegram.ui.Components.voip.e f37674b0;
    public int f37675b1;
    public final TLRPC.User f37676c;
    public boolean f37677c0;
    public final TLRPC.User d;
    public cf.f f37679d0;
    public boolean f37680d1;
    public org.telegram.ui.Components.voip.l3 f37681e;
    public View f37682e0;
    public boolean f37683e1;
    public org.telegram.ui.Components.voip.l3 f37684f;
    public View f37685f0;
    public ValueAnimator f37686f1;
    public org.telegram.ui.Components.voip.p1 f37687g0;
    public boolean f37688g1;
    public org.telegram.ui.Components.voip.l3 h;
    public org.telegram.ui.Components.voip.t2 f37690h1;
    public c2.p f37692i1;
    public boolean f37693j0;
    public boolean f37694j1;
    public boolean f37695k0;
    public bi1 f37696l0;
    public int m0;
    public fi1 f37697n;
    public int f37698n0;
    public WindowInsets f37699o0;
    public boolean f37700p0;
    public float f37701q0;
    public ai1 f37703r0;
    public di1 f37704s;
    public int f37705s0;
    public AccessibilityManager f37706t0;
    public org.telegram.ui.Components.voip.d3 v;
    public org.telegram.ui.Components.voip.a3 f37709w;
    public boolean f37710w0;
    public org.telegram.ui.Components.voip.f3 f37711x;
    public AnimatorSet f37712x0;
    public org.telegram.ui.Components.voip.r0 f37713y;
    public boolean f37714y0;
    public boolean f37715z0;
    public final org.telegram.ui.Components.voip.o1 f37702r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.p9[] S = new org.telegram.ui.Components.p9[4];
    public final Drawable[] T = new Drawable[4];
    public final Paint f37689h0 = new Paint();
    public final Paint f37691i0 = new Paint();
    public boolean f37707u0 = true;
    public float f37708v0 = 1.0f;
    public final AnimationNotificationsLocker I0 = new AnimationNotificationsLocker();
    public final n11 N0 = new n11(this, 20);
    public final sh1 P0 = new sh1(this, 12);
    public final sh1 Q0 = new sh1(this, 13);
    public float f37678c1 = 1.0f;

    public ii1(int i10) {
        this.f37670a = i10;
        this.f37676c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f37698n0 = -1;
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
        if (Build.VERSION.SDK_INT >= 23 && ii1Var.f37673b.checkSelfPermission("android.permission.CAMERA") != 0) {
            ii1Var.f37673b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            ii1Var.C();
        }
    }

    public static void j(ii1 ii1Var) {
        ii1 ii1Var2;
        if (ii1Var.f37680d1) {
            ii1Var.f37680d1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ii1Var.f37686f1 = ofFloat;
            ii1Var2 = ii1Var;
            ofFloat.addUpdateListener(new gg.c(ii1Var2, ii1Var.f37678c1, ii1Var.V0, ii1Var.W0, 2));
            ii1Var2.f37686f1.addListener(new wh1(ii1Var2, 0));
            ii1Var2.f37686f1.setDuration(350L);
            ii1Var2.f37686f1.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            ii1Var2.f37686f1.start();
        } else {
            ii1Var2 = ii1Var;
        }
        ii1Var2.f37683e1 = false;
        ii1Var2.X0 = false;
    }

    public static void q(int i10, int[] iArr) {
        ii1 ii1Var = f37669k1;
        if (ii1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.f37703r0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ii1Var.r(new sj0(7));
                } else if (!ii1Var.f37673b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(ii1Var.f37673b, new sh1(ii1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.f37703r0.b();
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
        ii1 ii1Var = f37669k1;
        if (ii1Var != null && ii1Var.f37703r0.getParent() == null) {
            ii1 ii1Var2 = f37669k1;
            if (ii1Var2 != null) {
                ii1Var2.Z.d.release();
                f37669k1.f37671a0.d.release();
                f37669k1.Y.release();
                ai1 ai1Var = f37669k1.f37703r0;
                if (ai1Var != null) {
                    ai1Var.d();
                }
                f37669k1.l();
            }
            f37669k1 = null;
        }
        if (f37669k1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ii1 ii1Var3 = new ii1(i10);
                ii1Var3.f37673b = activity;
                f37669k1 = ii1Var3;
                ai1 ai1Var2 = new ai1(activity, !z4, ii1Var3);
                f37669k1.G0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f37669k1.getClass();
                ai1Var2.setLockOnScreen(f37669k1.G0);
                ii1Var3.f37703r0 = ai1Var2;
                qh1 qh1Var = new qh1(ii1Var3, 4);
                WeakHashMap weakHashMap = r0.j0.f46469a;
                r0.b0.j(ai1Var2, qh1Var);
                ((WindowManager) activity.getSystemService("window")).addView(ai1Var2, org.telegram.ui.Components.voip.x2.a());
                ii1Var3.f37701q0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ii1Var3.f37706t0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                di1 di1Var = new di1(ii1Var3, activity);
                di1Var.setClipToPadding(false);
                di1Var.setClipChildren(false);
                di1Var.setBackgroundColor(-16777216);
                ii1Var3.G();
                ii1Var3.f37704s = di1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.o1 o1Var = ii1Var3.f37702r;
                ii1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z10, o1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                ii1Var3.Z = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                ii1Var3.Z.d.setEnableHardwareScaler(true);
                ii1Var3.Z.d.setRotateTextureWithScreen(true);
                ii1Var3.Z.U = 1;
                di1Var.addView(ii1Var3.v, k7.c6.c(-1.0f, -1));
                TLRPC.User user = ii1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, o1Var);
                ii1Var3.f37709w = a3Var;
                di1Var.addView(a3Var, k7.c6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.k6.f21600a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f32044a = new org.telegram.ui.Components.bw0(0);
                    }
                }
                ii1Var3.f37711x = view;
                di1Var.addView((View) view, k7.c6.c(220.0f, -1));
                di1Var.addView(ii1Var3.Z);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Cells.f1.t(0.5f, 1), new rc1(ii1Var3, 1), 0L);
                org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
                ii1Var3.V = t1Var;
                t1Var.setDelegate(new qh1(ii1Var3, 3));
                ii1Var3.V.d(1.0f, 1.0f);
                ii1Var3.X = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                ii1Var3.f37671a0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                ii1Var3.f37671a0.d.setUseCameraRotation(true);
                ii1Var3.V.setOnTapListener(new th1(ii1Var3, 1));
                ii1Var3.f37671a0.d.setMirror(true);
                ii1Var3.V.addView(ii1Var3.f37671a0);
                org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
                ii1Var3.W = t1Var2;
                t1Var2.P = true;
                t1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ii1Var3.Y = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ii1Var3.Y.setIsCamera(false);
                ii1Var3.Y.setFpsReduction(30.0f);
                ii1Var3.Y.setScalingType(scalingType);
                ii1Var3.W.addView(ii1Var3.Y, k7.c6.e(-1, -2, 17));
                ii1Var3.W.setOnTapListener(new th1(ii1Var3, 2));
                ii1Var3.W.setVisibility(8);
                di1Var.addView(ii1Var3.V, k7.c6.c(-2.0f, -2));
                di1Var.addView(ii1Var3.W);
                View view2 = new View(activity);
                ii1Var3.f37682e0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                di1Var.addView(ii1Var3.f37682e0, k7.c6.e(-1, 160, 80));
                View view3 = new View(activity);
                ii1Var3.f37685f0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                di1Var.addView(ii1Var3.f37685f0, k7.c6.e(-1, 160, 48));
                ob1 ob1Var = new ob1(ii1Var3, activity, 17);
                ii1Var3.K = ob1Var;
                ob1Var.setOrientation(0);
                ii1Var3.K.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ii1Var3.K.setClipToPadding(false);
                ii1Var3.K.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ii1Var3.K.setOnClickListener(new th1(ii1Var3, 3));
                ii1Var3.M = new org.telegram.ui.Components.voip.p0(activity, o1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ii1Var3.L = frameLayout;
                frameLayout.addView(ii1Var3.M, k7.c6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ii1Var3.L.setVisibility(8);
                ii1Var3.L.setOnClickListener(new th1(ii1Var3, 4));
                eg.i0 i0Var = new eg.i0(activity, o1Var);
                ii1Var3.O = i0Var;
                i0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ii1Var3.P = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ii1Var3.P.setTextSize(1, 15.0f);
                ii1Var3.P.setTypeface(AndroidUtilities.bold());
                ii1Var3.P.setTextColor(-1);
                ii1Var3.P.setGravity(17);
                pk pkVar = new pk(ii1Var3, activity, 5);
                ii1Var3.Q = pkVar;
                pkVar.setTextSize(1, 15.0f);
                ii1Var3.Q.setTextColor(-1);
                ii1Var3.Q.setGravity(17);
                ii1Var3.Q.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ii1Var3.Q.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ii1Var3.O.setVisibility(8);
                ii1Var3.O.addView(ii1Var3.P);
                ii1Var3.O.addView(ii1Var3.Q, k7.c6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ii1Var3.O.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                    org.telegram.ui.Components.p9[] p9VarArr = ii1Var3.S;
                    p9VarArr[i15] = p9Var;
                    p9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ob1 ob1Var2 = ii1Var3.K;
                    org.telegram.ui.Components.p9 p9Var2 = p9VarArr[i15];
                    if (i15 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    ob1Var2.addView(p9Var2, k7.c6.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ei1 ei1Var = new ei1(ii1Var3, activity);
                ii1Var3.U = ei1Var;
                ei1Var.setOrientation(1);
                ii1Var3.U.setFocusable(true);
                ii1Var3.U.setFocusableInTouchMode(true);
                ii1Var3.f37713y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = ii1Var3.f37713y;
                int i16 = ii1Var3.f37670a;
                r0Var.f32304b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, z8Var, user);
                ii1Var3.f37713y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ii1Var3.B = textView2;
                textView2.setTextSize(1, 28.0f);
                ii1Var3.B.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ii1Var3.B.getPaint().getFontMetricsInt(), false));
                ii1Var3.B.setMaxLines(2);
                ii1Var3.B.setEllipsize(TextUtils.TruncateAt.END);
                ii1Var3.B.setTextColor(-1);
                ii1Var3.B.setGravity(1);
                ii1Var3.B.setImportantForAccessibility(2);
                ii1Var3.U.addView(ii1Var3.B, k7.c6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f32296a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f32296a[i17] = new TextView(activity);
                    frameLayout2.f32296a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f32296a[i17].setTextColor(-1);
                    frameLayout2.f32296a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f32296a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f32298c = frameLayout3;
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
                frameLayout2.f32297b = textView3;
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
                ii1Var3.C = frameLayout2;
                WeakHashMap weakHashMap2 = r0.j0.f46469a;
                frameLayout2.setImportantForAccessibility(4);
                ii1Var3.U.addView(ii1Var3.C, k7.c6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    hi1 hi1Var = new hi1(activity);
                    ii1Var3.D = hi1Var;
                    long j10 = sharedState.getUser().f20992id;
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
                        org.telegram.ui.Components.c9 c9Var = hi1Var.f37399b;
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
                            hi1Var.f37400c = new org.telegram.ui.Components.k01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            hi1Var.setVisibility(0);
                            hi1Var.invalidate();
                        }
                    }
                    ii1Var3.U.addView(ii1Var3.D, k7.c6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ii1Var3.U.setClipChildren(false);
                ii1Var3.U.setClipToPadding(false);
                ii1Var3.U.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ii1Var3.R = new org.telegram.ui.Components.voip.k(activity);
                ii1Var3.N = new org.telegram.ui.Components.voip.m1(activity, o1Var);
                ii1Var3.R.setAlpha(0.0f);
                ii1Var3.N.setVisibility(8);
                di1Var.addView(ii1Var3.f37713y, k7.c6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.U, k7.c6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.L, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.O, k7.c6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.K, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.R, k7.c6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                di1Var.addView(ii1Var3.N, k7.c6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ii1Var3.f37687g0 = new org.telegram.ui.Components.voip.p1(activity);
                ii1Var3.f37681e = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ii1Var3.f37684f = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ii1Var3.h = new org.telegram.ui.Components.voip.l3(activity, o1Var);
                ii1Var3.f37697n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                ii1Var3.f37681e.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.f37681e.setScaleX(0.0f);
                ii1Var3.f37681e.setScaleY(0.0f);
                ii1Var3.f37681e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f37684f.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.f37684f.setScaleX(0.0f);
                ii1Var3.f37684f.setScaleY(0.0f);
                ii1Var3.f37684f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.h.setScaleX(0.0f);
                ii1Var3.h.setScaleY(0.0f);
                ii1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f37697n.setTranslationY(AndroidUtilities.dp(100.0f));
                ii1Var3.f37697n.setScaleX(0.0f);
                ii1Var3.f37697n.setScaleY(0.0f);
                ii1Var3.f37697n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ii1Var3.f37687g0.addView(ii1Var3.f37681e);
                ii1Var3.f37687g0.addView(ii1Var3.f37684f);
                ii1Var3.f37687g0.addView(ii1Var3.h);
                ii1Var3.f37687g0.addView(ii1Var3.f37697n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ii1Var3.f37674b0 = eVar;
                eVar.setListener(new gi1(ii1Var3));
                ii1Var3.f37674b0.setScaleX(1.15f);
                ii1Var3.f37674b0.setScaleY(1.15f);
                di1Var.addView(ii1Var3.f37687g0, k7.c6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f11 = i11;
                di1Var.addView(ii1Var3.f37674b0, k7.c6.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                ii1Var3.F = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.F.setImageResource(R.drawable.msg_addcontact);
                ii1Var3.F.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                di1Var.addView(ii1Var3.F, k7.c6.e(56, 56, 53));
                k7.e6.a(ii1Var3.F);
                ImageView imageView2 = new ImageView(activity);
                ii1Var3.E = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.E.setImageResource(R.drawable.msg_call_minimize_shadow);
                ii1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ii1Var3.E.setContentDescription(LocaleController.getString(R.string.Back));
                di1Var.addView(ii1Var3.E, k7.c6.e(56, 56, 51));
                k7.e6.a(ii1Var3.E);
                org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
                ii1Var3.H = geVar;
                geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ii1Var3.H.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
                ii1Var3.H.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                di1Var.addView(ii1Var3.H, k7.c6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ii1Var3.H.setAlpha(0.0f);
                ii1Var3.H.setOnClickListener(new th1(ii1Var3, 5));
                ii1Var3.E.setOnClickListener(new th1(ii1Var3, 6));
                ii1Var3.F.setOnClickListener(new hb0(25, ii1Var3, activity));
                if (ii1Var3.f37703r0.f32470b) {
                    ii1Var3.E.setVisibility(8);
                    ii1Var3.F.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f32097a = new HashMap();
                linearLayout.f32098b = new ArrayList();
                linearLayout.f32099c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f32103r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f32102n = o1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new fg.j0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ii1Var3.J0 = linearLayout;
                linearLayout.setGravity(80);
                ii1Var3.J0.setOnViewsUpdated(new sh1(ii1Var3, 5));
                di1Var.addView(ii1Var3.J0, k7.c6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, o1Var, true);
                e3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.H = alignment;
                e3Var.d = -1L;
                e3Var.f45272i0 = new sh1(ii1Var3, 6);
                e3Var.Q = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.f45266e = true;
                e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.q(8.0f);
                ii1Var3.K0 = e3Var;
                e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                di1Var.addView(ii1Var3.K0, k7.c6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, o1Var, false);
                e3Var2.p(true);
                e3Var2.H = alignment;
                e3Var2.d = 4000L;
                e3Var2.Q = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.f45266e = true;
                e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.q(8.0f);
                ii1Var3.L0 = e3Var2;
                e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                di1Var.addView(ii1Var3.L0, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
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
                        ii1Var3.Z.setStub(org.telegram.ui.Components.voip.n2.k().f32212r);
                        ii1Var3.f37671a0.setStub(org.telegram.ui.Components.voip.n2.k().f32211n);
                    }
                    ii1Var3.f37703r0.setAlpha(0.0f);
                    ii1Var3.H();
                    ii1Var3.B0 = true;
                    org.telegram.ui.Components.voip.n2.Q = true;
                    if (org.telegram.ui.Components.voip.n2.S == null) {
                        ii1Var3.I0.lock();
                        AndroidUtilities.runOnUIThread(new sh1(ii1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.R.getClass();
                        throw null;
                    }
                } else {
                    ii1Var3.C0 = 1.0f;
                    ii1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ff.d.a(activity) == 1) {
                    ii1 ii1Var4 = f37669k1;
                    cf.e eVar2 = new cf.e(activity, ii1Var4);
                    eVar2.f2482c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = ii1Var4.Z;
                    eVar2.f2487j = t2Var3.d;
                    eVar2.f2488k = t2Var3.getPlaceholderView();
                    ii1Var4.f37679d0 = eVar2.a();
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
        n11 n11Var = this.N0;
        int i11 = 0;
        if (!z4 && this.f37707u0) {
            ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
            duration.setInterpolator(prVar).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.F.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar).start();
            this.C.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar).start();
            this.f37687g0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar).start();
            this.f37682e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
            this.f37685f0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37708v0, 0.0f);
            this.M0 = ofFloat;
            ofFloat.addUpdateListener(n11Var);
            this.M0.setDuration(150L).setInterpolator(prVar);
            this.M0.start();
            AndroidUtilities.cancelRunOnUIThread(this.P0);
            this.O0 = false;
            this.f37687g0.setEnabled(false);
            this.L0.e(true);
            i10 = 150;
        } else {
            if (z4 && !this.f37707u0) {
                this.K0.e(true);
                this.L0.e(true);
                ViewPropertyAnimator translationY = this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f30168f;
                translationY.setInterpolator(prVar2).start();
                this.C.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(prVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f37687g0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f37682e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar2).start();
                this.f37685f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f37708v0, 1.0f);
                this.M0 = ofFloat2;
                ofFloat2.addUpdateListener(n11Var);
                this.M0.setDuration(150L).setInterpolator(prVar2);
                this.M0.start();
                this.f37687g0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f37707u0 = z4;
        ai1 ai1Var = this.f37703r0;
        if (!z4) {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() | 4);
        } else {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.J0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f37707u0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            sh1 sh1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            this.O0 = false;
            if (this.f37710w0 && this.f37707u0) {
                AndroidUtilities.runOnUIThread(sh1Var, 3000L);
                this.O0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f37706t0.isTouchExplorationEnabled()) {
                if (!this.f37695k0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f37704s.announceForAccessibility(string);
            }
            if (!this.f37695k0) {
                if (this.f37696l0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f37703r0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f37684f.getLocationOnScreen(iArr);
                    bi1 bi1Var = new bi1(this, this.f37704s.getContext(), iArr[0], iArr[1]);
                    this.f37696l0 = bi1Var;
                    WindowInsets windowInsets = this.f37699o0;
                    if (windowInsets != null) {
                        bi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f37704s.addView(this.f37696l0);
                    return;
                }
                return;
            }
            this.f37671a0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f37698n0 = this.m0;
            H();
        }
    }

    public final void D(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z4) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new fg.j0(5).setDuration(250L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
                transitionSet.addTransition(duration.setInterpolator(prVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(prVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f37687g0, transitionSet);
            }
            int i10 = this.m0;
            if (i10 == 11) {
                this.f37681e.setVisibility(8);
                this.f37684f.setVisibility(8);
                this.h.setVisibility(8);
                this.f37697n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f37669k1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f37695k0 || this.f37693j0)) {
                    s(this.f37681e, sharedInstance);
                    if (this.f37707u0) {
                        this.H.setTag(1);
                        this.H.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.f37681e, sharedInstance);
                    this.H.setTag(null);
                    this.H.animate().alpha(0.0f).start();
                }
                v(this.f37684f, sharedInstance, false);
                t(this.h, sharedInstance, z4);
                this.f37697n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z4);
                this.f37697n.setOnClickListener(new th1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f37695k0 || this.f37693j0)) {
                        s(this.f37681e, sharedInstance);
                        if (this.f37707u0) {
                            this.H.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.f37681e, sharedInstance);
                        this.H.animate().alpha(0.0f).start();
                    }
                    v(this.f37684f, sharedInstance, false);
                    t(this.h, sharedInstance, z4);
                } else {
                    this.f37681e.setVisibility(8);
                    this.f37684f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f37697n.setVisibility(8);
            }
            if (this.f37681e.getVisibility() == 0) {
                this.f37681e.f32189f = 0;
                i11 = 16;
            }
            if (this.f37684f.getVisibility() == 0) {
                this.f37684f.f32189f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f32189f = i11;
                i11 += 16;
            }
            if (this.f37697n.getVisibility() == 0) {
                this.f37697n.C = i11;
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
        this.f37689h0.setColor(i0.a.k(-16777216, (int) (this.f37708v0 * 102.0f * this.C0)));
        this.f37691i0.setColor(i0.a.k(-16777216, (int) (127.5f * this.C0)));
        di1 di1Var = this.f37704s;
        if (di1Var != null) {
            di1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ii1.H():void");
    }

    @Override
    public final void a(c2.p pVar) {
        this.f37692i1 = pVar;
        ai1 ai1Var = this.f37703r0;
        ai1Var.getClass();
        ((WindowManager) this.f37673b.getSystemService("window")).addView(ai1Var, org.telegram.ui.Components.voip.x2.a());
        this.f37694j1 = false;
        H();
        this.f37703r0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f37690h1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f37690h1 = null;
        }
    }

    @Override
    public final Bitmap b() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f37690h1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f37690h1.d.getBitmap();
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
                this.f37671a0.d.release();
                this.Z.d.release();
                this.Y.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f37703r0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f37713y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f37677c0 = booleanValue;
            if (booleanValue) {
                this.f37713y.b(true, true);
            }
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.f37692i1 = pVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f37694j1 = true;
        H();
        ((WindowManager) this.f37673b.getSystemService("window")).removeView(this.f37703r0);
        this.f37703r0.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f37673b, false, true, false, false);
        this.f37690h1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f37690h1.d.setEnableHardwareScaler(true);
        this.f37690h1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f37690h1;
        t2Var2.U = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ci1(this));
        View view = this.f37690h1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f37690h1;
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
        float f18 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().f32216y;
        float f19 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().B;
        final float x10 = this.V.getX();
        final float y10 = this.V.getY();
        final float scaleX = this.V.getScaleX();
        org.telegram.ui.Components.voip.n2.R.getClass();
        final float measuredWidth = f18 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f19 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f20 = 1.0f;
        if (this.f37693j0) {
            int measuredWidth2 = this.V.getMeasuredWidth();
            if (this.f37695k0 && measuredWidth2 != 0) {
                f17 = (this.f37703r0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f16 = (((org.telegram.ui.Components.voip.n2.k().f32210f * 0.25f) + (f18 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * f17)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().f32210f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
        if (this.f37693j0) {
            f12 = AndroidUtilities.dp(4.0f);
        } else {
            f12 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.f37693j0) {
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
                    ii1Var.f37671a0.d(floatValue, false);
                }
                ii1Var.f37703r0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f37670a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        cf.f fVar = this.f37679d0;
        if (fVar != null) {
            fVar.c();
            this.f37679d0 = null;
        }
        hg.v2 v2Var = this.J;
        if (v2Var != null) {
            v2Var.dismiss();
            this.J = null;
        }
    }

    public final void m(boolean z4) {
        ValueAnimator ofFloat;
        if (this.f37714y0 && this.f37715z0 != z4 && this.f37707u0) {
            this.f37715z0 = z4;
            org.telegram.ui.Components.voip.a3 a3Var = this.f37709w;
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
                a3Var.f31957c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f31957c.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                a3Var.f31957c.setDuration(200L);
                a3Var.f31957c.start();
            }
            if (z4) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.L0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.P0);
                this.O0 = false;
                if (this.f37713y.getVisibility() == 0) {
                    this.f37713y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
                }
                this.L.animate().setListener(null).cancel();
                this.L.setVisibility(0);
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.3f);
                this.L.setScaleY(0.3f);
                this.L.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.f30169g).start();
                ViewPropertyAnimator translationY = this.K.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
                b.p(translationY, prVar, 400L);
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.O.setScaleX(0.7f);
                this.O.setScaleY(0.7f);
                this.O.setAlpha(0.0f);
                this.O.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new wh1(this, 3)).setInterpolator(prVar).start();
            } else {
                if (this.f37713y.getVisibility() == 0) {
                    this.f37713y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
                }
                this.L.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f30168f;
                duration.setInterpolator(prVar2).setListener(new org.telegram.ui.Components.x20(this.L)).start();
                this.K.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar2).setDuration(280L).start();
                this.O.animate().setListener(null).cancel();
                this.O.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new wh1(this, 4)).setDuration(250L).setInterpolator(prVar2).start();
            }
            this.f37698n0 = this.m0;
            H();
        }
    }

    public final void n() {
        this.f37703r0.b();
    }

    public final void o() {
        this.f37671a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xh1(this));
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
        this.f37698n0 = this.m0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f37698n0 = this.m0;
        if (i11 == 2 && !this.R0) {
            this.R0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f37679d0 == null && ff.d.a(this.f37673b) == 1) {
                cf.e eVar = new cf.e(this.f37673b, f37669k1);
                eVar.f2482c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.Z;
                eVar.f2487j = t2Var.d;
                eVar.f2488k = t2Var.getPlaceholderView();
                this.f37679d0 = eVar.a();
            }
        } else {
            cf.f fVar = this.f37679d0;
            if (fVar != null) {
                fVar.c();
                this.f37679d0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f37688g1 = true;
        }
        if (this.C != null && (d3Var = this.v) != null) {
            int i11 = d3Var.S;
            if ((i11 == 2 || i11 == 3) && this.f37688g1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.im(this, i10, 26), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.m0;
        if (i11 != i10) {
            this.f37698n0 = i11;
            this.m0 = i10;
            if (this.f37703r0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        this.f37698n0 = this.m0;
        if (z4 && !this.R0) {
            this.R0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.D0 && !this.B0) {
            bi1 bi1Var = this.f37696l0;
            if (bi1Var != null) {
                bi1Var.a(false, false);
            } else if (this.f37693j0 && this.f37695k0 && this.E0) {
                this.E0 = false;
                this.V.setRelativePosition(this.W);
                this.X = false;
                this.f37698n0 = this.m0;
                H();
            } else if (this.f37715z0) {
                m(false);
            } else if (this.O.getVisibility() == 8) {
                if (this.A0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (ff.d.a(this.f37673b) > 0) {
                        if (!this.D0 && f37669k1 != null) {
                            this.D0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f37669k1.f37703r0.getMeasuredHeight();
                                ii1 ii1Var = f37669k1;
                                org.telegram.ui.Components.voip.n2.l(ii1Var.f37673b, ii1Var.f37670a, ii1Var.f37703r0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f37669k1.f37699o0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.T = windowInsets.getSystemWindowInsetTop();
                                    f37669k1.f37699o0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
                                duration.setInterpolator(prVar).start();
                                this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.F.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.K.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.U.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
                                this.f37687g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.f37682e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.f37685f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.W.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                this.J0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
                                org.telegram.ui.Components.voip.n2.Q = true;
                                this.B0 = true;
                                ValueAnimator k10 = k(false);
                                this.I0.lock();
                                k10.addListener(new wh1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(prVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.z4.B(this.f37673b, new qh1(this, 0), true).o();
                    return;
                }
                this.f37703r0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f37684f.getVisibility() == 0) {
            this.f37674b0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f37674b0;
            ValueAnimator valueAnimator = eVar.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.V = null;
                eVar.R.stop();
            }
            runnable.run();
            return;
        }
        this.f37697n.animate().cancel();
        this.f37681e.animate().cancel();
        this.h.animate().cancel();
        this.f37684f.animate().cancel();
        this.f37674b0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f37674b0;
        ValueAnimator valueAnimator2 = eVar2.V;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.V = null;
            eVar2.R.stop();
        }
        this.f37697n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f37681e.d(5, false, false);
        this.h.d(1, false, false);
        this.f37684f.d(3, true, false);
        this.f37697n.setVisibility(0);
        this.f37681e.setVisibility(0);
        this.h.setVisibility(0);
        this.f37684f.setVisibility(0);
        this.f37697n.setAlpha(0.0f);
        this.f37681e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f37684f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37674b0.getLayoutParams();
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
                ii1Var.f37674b0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ii1Var.f37674b0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f37674b0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f37674b0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f37674b0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f37674b0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ex0(14, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new sh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f37695k0) {
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
            ValueAnimator valueAnimator = t1Var.f32338c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            t1Var.H = f10;
            t1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = t1Var.f32338c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = t1Var.H;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            t1Var.f32338c0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f32339d0);
            t1Var.f32338c0.setDuration(150L);
            t1Var.f32338c0.start();
        }
        l3Var.setOnBtnClickedListener(new qh1(this, 5));
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
        if (!this.f37695k0 && !this.f37693j0) {
            z10 = voIPService.isVideoAvailable();
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.f37695k0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z4);
                } else {
                    l3Var.d(3, false, z4);
                }
            } else {
                l3Var.d(3, true, z4);
            }
            l3Var.setOnBtnClickedListener(new qh1(this, 6));
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
        if (!this.f37695k0 && !this.f37693j0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Integer num = null;
        if (z4) {
            if (z11 && this.f37713y.getTag() == null) {
                this.f37713y.animate().setListener(null).cancel();
                this.f37713y.setVisibility(0);
                if (!this.f37715z0) {
                    if (z10) {
                        this.f37713y.setAlpha(0.0f);
                        this.f37713y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
                    } else {
                        this.f37713y.setAlpha(0.0f);
                        this.f37713y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f37713y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
                    }
                } else if (z10) {
                    this.f37713y.setAlpha(0.0f);
                    this.f37713y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f37713y.setScaleX(0.1f);
                    this.f37713y.setScaleY(0.1f);
                }
            } else if (!z11 && this.f37713y.getTag() != null) {
                this.f37713y.animate().setListener(null).cancel();
                this.f37713y.setTranslationY(0.0f);
                this.f37713y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.pr.f30168f).setListener(new wh1(this, 7)).start();
            }
        } else {
            this.f37713y.animate().setListener(null).cancel();
            this.f37713y.setTranslationY(0.0f);
            this.f37713y.setAlpha(1.0f);
            this.f37713y.setScaleX(1.0f);
            this.f37713y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f37713y;
            if (!z11) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f37713y;
        if (z11) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f37673b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.f37673b, 0, null);
        boolean[] zArr = new boolean[3];
        d2Var.O = LocaleController.getString(R.string.VoipFailed);
        d2Var.Q = charSequence;
        d2Var.f21250i0 = LocaleController.getString(R.string.OK);
        d2Var.f21251j0 = null;
        d2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(d2Var.e(org.telegram.ui.ActionBar.k6.f21897q7));
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
            this.V.setUiVisible(this.f37707u0);
        }
        if (!z4 && (animatorSet = this.f37712x0) != null) {
            animatorSet.removeAllListeners();
            this.f37712x0.cancel();
        }
        boolean z12 = true;
        if (i10 == 0) {
            if (z4) {
                if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.f37712x0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.f37712x0.cancel();
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
                    this.f37712x0 = animatorSet3;
                    animatorSet3.addListener(new wh1(this, 6));
                    this.f37712x0.setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f30168f);
                    this.f37712x0.setStartDelay(50L);
                    this.f37712x0.start();
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
                    AnimatorSet animatorSet4 = this.f37712x0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.f37712x0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.V, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.V, View.SCALE_Y, 0.7f, 1.0f));
                    this.f37712x0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.V.setVisibility(0);
            }
            if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var4 = this.V;
                if (t1Var4.f32350y < 0.0f) {
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

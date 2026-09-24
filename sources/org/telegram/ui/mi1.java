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
public final class mi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static mi1 f35554n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.q2 F;
    public float F0;
    public li1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public hg.l K;
    public long K0;
    public int L;
    public tg.m1 M;
    public org.telegram.ui.Components.voip.i2 M0;
    public ub1 N;
    public org.telegram.ui.Components.voip.e3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.e3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.p1 Q;
    public ci.w5 R;
    public boolean R0;
    public TextView S;
    public pk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public ii1 X;
    public float X0;
    public org.telegram.ui.Components.voip.v1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.v1 Z;
    public float Z0;
    public final int f35555a;
    public boolean f35556a0;
    public boolean f35557a1;
    public Activity f35558b;
    public TextureViewRenderer f35559b0;
    public float f35560b1;
    public final TLRPC.User f35561c;
    public org.telegram.ui.Components.voip.t2 f35562c0;
    public float f35563c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.t2 f35564d0;
    public int f35565d1;
    public org.telegram.ui.Components.voip.l3 e;
    public org.telegram.ui.Components.voip.e f35566e0;
    public int f35567e1;
    public org.telegram.ui.Components.voip.l3 f35568f;
    public boolean f35569f0;
    public pf.e f35571g0;
    public boolean f35572g1;
    public org.telegram.ui.Components.voip.l3 h;
    public View f35573h0;
    public boolean f35574h1;
    public View f35575i0;
    public ValueAnimator f35576i1;
    public org.telegram.ui.Components.voip.s1 f35577j0;
    public boolean f35578j1;
    public org.telegram.ui.Components.voip.t2 f35580k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f35582m1;
    public ji1 f35583n;
    public boolean f35584n0;
    public fi1 f35585o0;
    public int f35586p0;
    public int f35587q0;
    public WindowInsets f35589r0;
    public hi1 f35590s;
    public boolean f35591s0;
    public float f35592t0;
    public ei1 f35593u0;
    public org.telegram.ui.Components.voip.d3 v;
    public int f35594v0;
    public org.telegram.ui.Components.voip.a3 f35595w;
    public AccessibilityManager f35596w0;
    public org.telegram.ui.Components.voip.f3 f35597x;
    public org.telegram.ui.Components.voip.t0 f35599y;
    public boolean f35601z0;
    public final org.telegram.ui.Components.voip.r1 f35588r = new org.telegram.ui.Components.voip.r1();
    public final org.telegram.ui.Components.w9[] V = new org.telegram.ui.Components.w9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f35579k0 = new Paint();
    public final Paint f35581l0 = new Paint();
    public boolean f35598x0 = true;
    public float f35600y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final q11 Q0 = new q11(this, 20);
    public final wh1 S0 = new wh1(this, 12);
    public final wh1 T0 = new wh1(this, 13);
    public float f35570f1 = 1.0f;

    public mi1(int i10) {
        this.f35555a = i10;
        this.f35561c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f35587q0 = -1;
        this.f35586p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(mi1 mi1Var) {
        AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
        mi1Var.R0 = false;
        if (Build.VERSION.SDK_INT >= 23 && mi1Var.f35558b.checkSelfPermission("android.permission.CAMERA") != 0) {
            mi1Var.f35558b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            mi1Var.C();
        }
    }

    public static void j(mi1 mi1Var) {
        mi1 mi1Var2;
        if (mi1Var.f35572g1) {
            mi1Var.f35572g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            mi1Var.f35576i1 = ofFloat;
            mi1Var2 = mi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x(mi1Var2, mi1Var.f35570f1, mi1Var.Y0, mi1Var.Z0, 1));
            mi1Var2.f35576i1.addListener(new ai1(mi1Var2, 0));
            mi1Var2.f35576i1.setDuration(350L);
            mi1Var2.f35576i1.setInterpolator(org.telegram.ui.Components.rr.f28022f);
            mi1Var2.f35576i1.start();
        } else {
            mi1Var2 = mi1Var;
        }
        mi1Var2.f35574h1 = false;
        mi1Var2.f35557a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        mi1 mi1Var = f35554n1;
        if (mi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    mi1Var.f35593u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mi1Var.r(new l21(4));
                } else if (!mi1Var.f35558b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(mi1Var.f35558b, new wh1(mi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    mi1Var.f35593u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mi1Var.C();
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
        float f7;
        mi1 mi1Var = f35554n1;
        if (mi1Var != null && mi1Var.f35593u0.getParent() == null) {
            mi1 mi1Var2 = f35554n1;
            if (mi1Var2 != null) {
                mi1Var2.f35562c0.d.release();
                f35554n1.f35564d0.d.release();
                f35554n1.f35559b0.release();
                ei1 ei1Var = f35554n1.f35593u0;
                if (ei1Var != null) {
                    ei1Var.d();
                }
                f35554n1.l();
            }
            f35554n1 = null;
        }
        if (f35554n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                mi1 mi1Var3 = new mi1(i10);
                mi1Var3.f35558b = activity;
                f35554n1 = mi1Var3;
                ei1 ei1Var2 = new ei1(activity, !z10, mi1Var3);
                f35554n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f35554n1.getClass();
                ei1Var2.setLockOnScreen(f35554n1.J0);
                mi1Var3.f35593u0 = ei1Var2;
                uh1 uh1Var = new uh1(mi1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f42114a;
                r0.a0.j(ei1Var2, uh1Var);
                ((WindowManager) activity.getSystemService("window")).addView(ei1Var2, org.telegram.ui.Components.voip.x2.a());
                mi1Var3.f35592t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                mi1Var3.f35596w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                hi1 hi1Var = new hi1(mi1Var3, activity);
                hi1Var.setClipToPadding(false);
                hi1Var.setClipChildren(false);
                hi1Var.setBackgroundColor(-16777216);
                mi1Var3.G();
                mi1Var3.f35590s = hi1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.r1 r1Var = mi1Var3.f35588r;
                mi1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z11, r1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                mi1Var3.f35562c0 = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                mi1Var3.f35562c0.d.setEnableHardwareScaler(true);
                mi1Var3.f35562c0.d.setRotateTextureWithScreen(true);
                mi1Var3.f35562c0.f29618a0 = 1;
                hi1Var.addView(mi1Var3.v, w7.y5.c(-1.0f, -1));
                TLRPC.User user = mi1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, r1Var);
                mi1Var3.f35595w = a3Var;
                hi1Var.addView(a3Var, w7.y5.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.h6.f18982a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f29343a = new org.telegram.ui.Components.lw0(0);
                    }
                }
                mi1Var3.f35597x = view;
                hi1Var.addView((View) view, w7.y5.c(220.0f, -1));
                hi1Var.addView(mi1Var3.f35562c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.v9(orientation, new int[]{-14994098, -14328963}).f(n2.e.E(0.5f, 1), new wc1(mi1Var3, 1), 0L);
                org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
                mi1Var3.Y = v1Var;
                v1Var.setDelegate(new uh1(mi1Var3, 3));
                mi1Var3.Y.d(1.0f, 1.0f);
                mi1Var3.f35556a0 = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                mi1Var3.f35564d0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                mi1Var3.f35564d0.d.setUseCameraRotation(true);
                mi1Var3.Y.setOnTapListener(new xh1(mi1Var3, 1));
                mi1Var3.f35564d0.d.setMirror(true);
                mi1Var3.Y.addView(mi1Var3.f35564d0);
                org.telegram.ui.Components.voip.v1 v1Var2 = new org.telegram.ui.Components.voip.v1(activity);
                mi1Var3.Z = v1Var2;
                v1Var2.S = true;
                v1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                mi1Var3.f35559b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                mi1Var3.f35559b0.setIsCamera(false);
                mi1Var3.f35559b0.setFpsReduction(30.0f);
                mi1Var3.f35559b0.setScalingType(scalingType);
                mi1Var3.Z.addView(mi1Var3.f35559b0, w7.y5.e(-1, -2, 17));
                mi1Var3.Z.setOnTapListener(new xh1(mi1Var3, 2));
                mi1Var3.Z.setVisibility(8);
                hi1Var.addView(mi1Var3.Y, w7.y5.c(-2.0f, -2));
                hi1Var.addView(mi1Var3.Z);
                View view2 = new View(activity);
                mi1Var3.f35573h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                hi1Var.addView(mi1Var3.f35573h0, w7.y5.e(-1, 160, 80));
                View view3 = new View(activity);
                mi1Var3.f35575i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                hi1Var.addView(mi1Var3.f35575i0, w7.y5.e(-1, 160, 48));
                ub1 ub1Var = new ub1(mi1Var3, activity, 16);
                mi1Var3.N = ub1Var;
                ub1Var.setOrientation(0);
                mi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                mi1Var3.N.setClipToPadding(false);
                mi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                mi1Var3.N.setOnClickListener(new xh1(mi1Var3, 3));
                mi1Var3.P = new org.telegram.ui.Components.voip.q0(activity, r1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                mi1Var3.O = frameLayout;
                frameLayout.addView(mi1Var3.P, w7.y5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                mi1Var3.O.setVisibility(8);
                mi1Var3.O.setOnClickListener(new xh1(mi1Var3, 4));
                ci.w5 w5Var = new ci.w5(activity, r1Var);
                mi1Var3.R = w5Var;
                w5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                mi1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                mi1Var3.S.setTextSize(1, 15.0f);
                mi1Var3.S.setTypeface(AndroidUtilities.bold());
                mi1Var3.S.setTextColor(-1);
                mi1Var3.S.setGravity(17);
                pk pkVar = new pk(mi1Var3, activity, 5);
                mi1Var3.T = pkVar;
                pkVar.setTextSize(1, 15.0f);
                mi1Var3.T.setTextColor(-1);
                mi1Var3.T.setGravity(17);
                mi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), mi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                mi1Var3.R.setVisibility(8);
                mi1Var3.R.addView(mi1Var3.S);
                mi1Var3.R.addView(mi1Var3.T, w7.y5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                mi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
                    org.telegram.ui.Components.w9[] w9VarArr = mi1Var3.V;
                    w9VarArr[i15] = w9Var;
                    w9VarArr[i15].getImageReceiver().setAspectFit(true);
                    ub1 ub1Var2 = mi1Var3.N;
                    org.telegram.ui.Components.w9 w9Var2 = w9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    ub1Var2.addView(w9Var2, w7.y5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ii1 ii1Var = new ii1(mi1Var3, activity);
                mi1Var3.X = ii1Var;
                ii1Var.setOrientation(1);
                mi1Var3.X.setFocusable(true);
                mi1Var3.X.setFocusableInTouchMode(true);
                mi1Var3.f35599y = new org.telegram.ui.Components.voip.t0(activity);
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(user);
                org.telegram.ui.Components.voip.t0 t0Var = mi1Var3.f35599y;
                int i16 = mi1Var3.f35555a;
                t0Var.f29611b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, h9Var, user);
                mi1Var3.f35599y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                mi1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                mi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), mi1Var3.E.getPaint().getFontMetricsInt(), false));
                mi1Var3.E.setMaxLines(2);
                mi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                mi1Var3.E.setTextColor(-1);
                mi1Var3.E.setGravity(1);
                mi1Var3.E.setImportantForAccessibility(2);
                mi1Var3.X.addView(mi1Var3.E, w7.y5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f29564a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f29564a[i17] = new TextView(activity);
                    frameLayout2.f29564a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f29564a[i17].setTextColor(-1);
                    frameLayout2.f29564a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f29564a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f29566c = frameLayout3;
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(frameLayout2, activity, r1Var);
                o2Var.setTextSize(1, 15.0f);
                o2Var.setTextColor(-1);
                o2Var.setGravity(1);
                o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(o2Var, w7.y5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.y5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f29565b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.y5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new hg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
                frameLayout2.d = u2Var;
                frameLayout2.addView(u2Var, w7.y5.c(-2.0f, -1));
                mi1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f42114a;
                frameLayout2.setImportantForAccessibility(4);
                mi1Var3.X.addView(mi1Var3.F, w7.y5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    li1 li1Var = new li1(activity);
                    mi1Var3.G = li1Var;
                    long j3 = sharedState.getUser().f18468id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        li1Var.setVisibility(8);
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
                        org.telegram.ui.Components.j9 j9Var = li1Var.f35337b;
                        j9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            j9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        j9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                            li1Var.setVisibility(8);
                        } else {
                            li1Var.f35338c = new org.telegram.ui.Components.t01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            li1Var.setVisibility(0);
                            li1Var.invalidate();
                        }
                    }
                    mi1Var3.X.addView(mi1Var3.G, w7.y5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                mi1Var3.X.setClipChildren(false);
                mi1Var3.X.setClipToPadding(false);
                mi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                mi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                mi1Var3.Q = new org.telegram.ui.Components.voip.p1(activity, r1Var);
                mi1Var3.U.setAlpha(0.0f);
                mi1Var3.Q.setVisibility(8);
                hi1Var.addView(mi1Var3.f35599y, w7.y5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.X, w7.y5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.O, w7.y5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.R, w7.y5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.N, w7.y5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.U, w7.y5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                hi1Var.addView(mi1Var3.Q, w7.y5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                mi1Var3.f35577j0 = new org.telegram.ui.Components.voip.s1(activity);
                mi1Var3.e = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                mi1Var3.f35568f = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                mi1Var3.h = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                mi1Var3.f35583n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                mi1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                mi1Var3.e.setScaleX(0.0f);
                mi1Var3.e.setScaleY(0.0f);
                mi1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mi1Var3.f35568f.setTranslationY(AndroidUtilities.dp(100.0f));
                mi1Var3.f35568f.setScaleX(0.0f);
                mi1Var3.f35568f.setScaleY(0.0f);
                mi1Var3.f35568f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                mi1Var3.h.setScaleX(0.0f);
                mi1Var3.h.setScaleY(0.0f);
                mi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mi1Var3.f35583n.setTranslationY(AndroidUtilities.dp(100.0f));
                mi1Var3.f35583n.setScaleX(0.0f);
                mi1Var3.f35583n.setScaleY(0.0f);
                mi1Var3.f35583n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mi1Var3.f35577j0.addView(mi1Var3.e);
                mi1Var3.f35577j0.addView(mi1Var3.f35568f);
                mi1Var3.f35577j0.addView(mi1Var3.h);
                mi1Var3.f35577j0.addView(mi1Var3.f35583n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                mi1Var3.f35566e0 = eVar;
                eVar.setListener(new ki1(mi1Var3));
                mi1Var3.f35566e0.setScaleX(1.15f);
                mi1Var3.f35566e0.setScaleY(1.15f);
                hi1Var.addView(mi1Var3.f35577j0, w7.y5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                hi1Var.addView(mi1Var3.f35566e0, w7.y5.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                mi1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
                mi1Var3.I.setImageResource(R.drawable.msg_addcontact);
                mi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                hi1Var.addView(mi1Var3.I, w7.y5.e(56, 56, 53));
                w7.a6.a(mi1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                mi1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
                mi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                mi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                mi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                hi1Var.addView(mi1Var3.H, w7.y5.e(56, 56, 51));
                w7.a6.a(mi1Var3.H);
                hg.l lVar = new hg.l(activity, 5);
                mi1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                mi1Var3.K.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
                mi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                hi1Var.addView(mi1Var3.K, w7.y5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                mi1Var3.K.setAlpha(0.0f);
                mi1Var3.K.setOnClickListener(new xh1(mi1Var3, 5));
                mi1Var3.H.setOnClickListener(new xh1(mi1Var3, 6));
                mi1Var3.I.setOnClickListener(new ny0(10, mi1Var3, activity));
                if (mi1Var3.f35593u0.f29745b) {
                    mi1Var3.H.setVisibility(8);
                    mi1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f29383a = new HashMap();
                linearLayout.f29384b = new ArrayList();
                linearLayout.f29385c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f29388r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f29387n = r1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                mi1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                mi1Var3.M0.setOnViewsUpdated(new wh1(mi1Var3, 5));
                hi1Var.addView(mi1Var3.M0, w7.y5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, r1Var, true);
                e3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.K = alignment;
                e3Var.d = -1L;
                e3Var.f4615l0 = new wh1(mi1Var3, 6);
                e3Var.T = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.e = true;
                e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.q(8.0f);
                mi1Var3.N0 = e3Var;
                e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                hi1Var.addView(mi1Var3.N0, w7.y5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, r1Var, false);
                e3Var2.p(true);
                e3Var2.K = alignment;
                e3Var2.d = 4000L;
                e3Var2.T = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.e = true;
                e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.q(8.0f);
                mi1Var3.O0 = e3Var2;
                e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                hi1Var.addView(mi1Var3.O0, w7.y5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                mi1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!mi1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        mi1Var3.U0 = z12;
                    }
                    mi1Var3.o();
                }
                ei1Var2.addView(hi1Var);
                if (z10) {
                    mi1Var3.F0 = 0.0f;
                    mi1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        mi1Var3.f35562c0.setStub(org.telegram.ui.Components.voip.n2.k().f29500r);
                        mi1Var3.f35564d0.setStub(org.telegram.ui.Components.voip.n2.k().f29499n);
                    }
                    mi1Var3.f35593u0.setAlpha(0.0f);
                    mi1Var3.H();
                    mi1Var3.E0 = true;
                    org.telegram.ui.Components.voip.n2.T = true;
                    if (org.telegram.ui.Components.voip.n2.V == null) {
                        mi1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new wh1(mi1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.U.getClass();
                        throw null;
                    }
                } else {
                    mi1Var3.F0 = 1.0f;
                    mi1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
                    mi1 mi1Var4 = f35554n1;
                    pf.d dVar = new pf.d(activity, mi1Var4);
                    dVar.f41038c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = mi1Var4.f35562c0;
                    dVar.f41042j = t2Var3.d;
                    dVar.f41043k = t2Var3.getPlaceholderView();
                    mi1Var4.f35571g0 = dVar.a();
                }
            }
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        q11 q11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f35598x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
            duration.setInterpolator(rrVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(rrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(rrVar).start();
            this.f35577j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar).start();
            this.f35573h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
            this.f35575i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35600y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(q11Var);
            this.P0.setDuration(150L).setInterpolator(rrVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f35577j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f35598x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f28022f;
                translationY.setInterpolator(rrVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(rrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.f35577j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.f35573h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar2).start();
                this.f35575i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f35600y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(q11Var);
                this.P0.setDuration(150L).setInterpolator(rrVar2);
                this.P0.start();
                this.f35577j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f35598x0 = z10;
        ei1 ei1Var = this.f35593u0;
        if (!z10) {
            ei1Var.setSystemUiVisibility(ei1Var.getSystemUiVisibility() | 4);
        } else {
            ei1Var.setSystemUiVisibility(ei1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f35598x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            wh1 wh1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(wh1Var);
            this.R0 = false;
            if (this.f35601z0 && this.f35598x0) {
                AndroidUtilities.runOnUIThread(wh1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f35596w0.isTouchExplorationEnabled()) {
                if (!this.f35584n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f35590s.announceForAccessibility(string);
            }
            if (!this.f35584n0) {
                if (this.f35585o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f35593u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f35568f.getLocationOnScreen(iArr);
                    fi1 fi1Var = new fi1(this, this.f35590s.getContext(), iArr[0], iArr[1]);
                    this.f35585o0 = fi1Var;
                    WindowInsets windowInsets = this.f35589r0;
                    if (windowInsets != null) {
                        fi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f35590s.addView(this.f35585o0);
                    return;
                }
                return;
            }
            this.f35564d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f35587q0 = this.f35586p0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
                transitionSet.addTransition(duration.setInterpolator(rrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(rrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f35577j0, transitionSet);
            }
            int i10 = this.f35586p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f35568f.setVisibility(8);
                this.h.setVisibility(8);
                this.f35583n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f35554n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f35584n0 || this.m0)) {
                    s(this.e, sharedInstance);
                    if (this.f35598x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                v(this.f35568f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f35583n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f35583n.setOnClickListener(new xh1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f35584n0 || this.m0)) {
                        s(this.e, sharedInstance);
                        if (this.f35598x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    v(this.f35568f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f35568f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f35583n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f29447f = 0;
                i11 = 16;
            }
            if (this.f35568f.getVisibility() == 0) {
                this.f35568f.f29447f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f29447f = i11;
                i11 += 16;
            }
            if (this.f35583n.getVisibility() == 0) {
                this.f35583n.F = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mi1.E(boolean):void");
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
        if (this.J != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void G() {
        this.f35579k0.setColor(i0.a.k(-16777216, (int) (this.f35600y0 * 102.0f * this.F0)));
        this.f35581l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        hi1 hi1Var = this.f35590s;
        if (hi1Var != null) {
            hi1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mi1.H():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.f35562c0;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f35582m1 = true;
        H();
        ((WindowManager) this.f35558b.getSystemService("window")).removeView(this.f35593u0);
        this.f35593u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        ei1 ei1Var = this.f35593u0;
        ei1Var.getClass();
        ((WindowManager) this.f35558b.getSystemService("window")).addView(ei1Var, org.telegram.ui.Components.voip.x2.a());
        this.f35582m1 = false;
        H();
        this.f35593u0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f35580k1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f35580k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f35580k1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f35580k1.d.getBitmap();
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
            if (this.f35586p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f35564d0.d.release();
                this.f35562c0.d.release();
                this.f35559b0.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f35593u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f35599y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f35569f0 = booleanValue;
            if (booleanValue) {
                this.f35599y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f35562c0;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f35562c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f35558b, false, true, false, false);
        this.f35580k1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f35580k1.d.setEnableHardwareScaler(true);
        this.f35580k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f35580k1;
        t2Var2.f29618a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new gi1(this));
        View view = this.f35580k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f35580k1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        this.Y.animate().cancel();
        float f17 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().f29504y;
        float f18 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.n2.U.getClass();
        final float measuredWidth = f17 - ((this.f35562c0.getMeasuredWidth() - (this.f35562c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f18 - ((this.f35562c0.getMeasuredHeight() - (this.f35562c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f19 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f35584n0 && measuredWidth2 != 0) {
                f16 = (this.f35593u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f15 = (((org.telegram.ui.Components.voip.n2.k().f29498f * 0.25f) + (f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().f29498f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f15 = 1.0f;
                f16 = 0.0f;
            }
            float f20 = f16;
            f7 = f15;
            f10 = f20;
        } else {
            c10 = 0;
            float measuredWidth3 = f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f21 = measuredHeight;
        if (this.m0) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.n2.U.getClass();
            f19 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f21);
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f19);
            }
            this.f35562c0.setScaleX(0.25f);
            this.f35562c0.setScaleY(0.25f);
            this.f35562c0.setTranslationX(measuredWidth);
            this.f35562c0.setTranslationY(measuredHeight2);
            this.f35562c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
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
        fArr[c10] = f12;
        fArr[1] = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f14 = 0.0f;
        } else {
            f14 = 1.0f;
        }
        this.F0 = f14;
        G();
        final float f22 = f11;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                mi1 mi1Var = mi1.this;
                mi1Var.F0 = f23;
                mi1Var.G();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    mi1Var.Y.setScaleX(f24);
                    mi1Var.Y.setScaleY(f24);
                    mi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f23));
                    mi1Var.Y.setTranslationY((f21 * floatValue) + (y3 * f23));
                    mi1Var.Y.setCornerRadius((dp * floatValue) + (f22 * f23));
                    mi1Var.Y.setAlpha((f19 * floatValue) + (1.0f * f23));
                }
                float f25 = (r12 * floatValue) + (1.0f * f23);
                mi1Var.f35562c0.setScaleX(f25);
                mi1Var.f35562c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                mi1Var.f35562c0.setTranslationX(f27);
                mi1Var.f35562c0.setTranslationY(f28);
                mi1Var.f35562c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!mi1Var.Y.P) {
                    mi1Var.f35564d0.d(floatValue, false);
                }
                mi1Var.f35593u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f35555a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        pf.e eVar = this.f35571g0;
        if (eVar != null) {
            eVar.c();
            this.f35571g0 = null;
        }
        tg.m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f35598x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.a3 a3Var = this.f35595w;
            if (a3Var.K && z10 != a3Var.E) {
                a3Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                a3Var.f29262c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f29262c.setInterpolator(org.telegram.ui.Components.rr.f28022f);
                a3Var.f29262c.setDuration(200L);
                a3Var.f29262c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f35599y.getVisibility() == 0) {
                    this.f35599y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.rr.f28023g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
                org.telegram.messenger.ok.s(translationY, rrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ai1(this, 3)).setInterpolator(rrVar).start();
            } else {
                if (this.f35599y.getVisibility() == 0) {
                    this.f35599y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f28022f;
                duration.setInterpolator(rrVar2).setListener(new org.telegram.ui.Components.ca(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(rrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ai1(this, 4)).setDuration(250L).setInterpolator(rrVar2).start();
            }
            this.f35587q0 = this.f35586p0;
            H();
        }
    }

    public final void n() {
        this.f35593u0.b();
    }

    public final void o() {
        this.f35564d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bi1(this));
        this.f35562c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ci1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f35559b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
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
        this.f35587q0 = this.f35586p0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f35587q0 = this.f35586p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f35571g0 == null && sf.c.a(this.f35558b) == 1) {
                pf.d dVar = new pf.d(this.f35558b, f35554n1);
                dVar.f41038c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.f35562c0;
                dVar.f41042j = t2Var.d;
                dVar.f41043k = t2Var.getPlaceholderView();
                this.f35571g0 = dVar.a();
            }
        } else {
            pf.e eVar = this.f35571g0;
            if (eVar != null) {
                eVar.c();
                this.f35571g0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f35578j1 = true;
        }
        if (this.F != null && (d3Var = this.v) != null) {
            int i11 = d3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f35578j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld(this, i10, 28), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f35586p0;
        if (i11 != i10) {
            this.f35587q0 = i11;
            this.f35586p0 = i10;
            if (this.f35593u0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f35587q0 = this.f35586p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.G0 && !this.E0) {
            fi1 fi1Var = this.f35585o0;
            if (fi1Var != null) {
                fi1Var.a(false, false);
            } else if (this.m0 && this.f35584n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f35556a0 = false;
                this.f35587q0 = this.f35586p0;
                H();
            } else if (this.C0) {
                m(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (sf.c.a(this.f35558b) > 0) {
                        if (!this.G0 && f35554n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f35554n1.f35593u0.getMeasuredHeight();
                                mi1 mi1Var = f35554n1;
                                org.telegram.ui.Components.voip.n2.l(mi1Var.f35558b, mi1Var.f35555a, mi1Var.f35593u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f35554n1.f35589r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.W = windowInsets.getSystemWindowInsetTop();
                                    f35554n1.f35589r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
                                duration.setInterpolator(rrVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                                this.f35577j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
                                this.f35573h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
                                this.f35575i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
                                org.telegram.ui.Components.voip.n2.T = true;
                                this.E0 = true;
                                ValueAnimator k10 = k(false);
                                this.L0.lock();
                                k10.addListener(new ai1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(rrVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.e5.B(this.f35558b, new uh1(this, 0), true).o();
                    return;
                }
                this.f35593u0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f35568f.getVisibility() == 0) {
            this.f35566e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f35566e0;
            ValueAnimator valueAnimator = eVar.f29317b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f29317b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f35583n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f35568f.animate().cancel();
        this.f35566e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f35566e0;
        ValueAnimator valueAnimator2 = eVar2.f29317b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f29317b0 = null;
            eVar2.U.stop();
        }
        this.f35583n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f35568f.d(3, true, false);
        this.f35583n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f35568f.setVisibility(0);
        this.f35583n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f35568f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35566e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                mi1 mi1Var = mi1.this;
                mi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mi1Var.f35566e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                mi1Var.f35566e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f35566e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f35566e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f35566e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f35566e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.al0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new wh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f35584n0) {
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
        l3Var.setOnBtnClickedListener(new b7(this, voIPService, l3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.v1 v1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = v1Var.f29689f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            v1Var.K = f7;
            v1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = v1Var.f29689f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = v1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            v1Var.f29689f0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.f29690g0);
            v1Var.f29689f0.setDuration(150L);
            v1Var.f29689f0.start();
        }
        l3Var.setOnBtnClickedListener(new uh1(this, 5));
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
        l3Var.setOnBtnClickedListener(new da(this, i10, l3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f35584n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f35584n0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z10);
                } else {
                    l3Var.d(3, false, z10);
                }
            } else {
                l3Var.d(3, true, z10);
            }
            l3Var.setOnBtnClickedListener(new uh1(this, 6));
            l3Var.setEnabled(true);
            return;
        }
        l3Var.d(3, true, false);
        l3Var.setOnClickListener(null);
        l3Var.setEnabled(false);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f35584n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f35599y.getTag() == null) {
                this.f35599y.animate().setListener(null).cancel();
                this.f35599y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f35599y.setAlpha(0.0f);
                        this.f35599y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
                    } else {
                        this.f35599y.setAlpha(0.0f);
                        this.f35599y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f35599y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
                    }
                } else if (z11) {
                    this.f35599y.setAlpha(0.0f);
                    this.f35599y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f35599y.setScaleX(0.1f);
                    this.f35599y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f35599y.getTag() != null) {
                this.f35599y.animate().setListener(null).cancel();
                this.f35599y.setTranslationY(0.0f);
                this.f35599y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.rr.f28022f).setListener(new ai1(this, 7)).start();
            }
        } else {
            this.f35599y.animate().setListener(null).cancel();
            this.f35599y.setTranslationY(0.0f);
            this.f35599y.setAlpha(1.0f);
            this.f35599y.setScaleX(1.0f);
            this.f35599y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.t0 t0Var = this.f35599y;
            if (!z12) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.t0 t0Var2 = this.f35599y;
        if (z12) {
            num = 1;
        }
        t0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f35558b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(this.f35558b, 0, null);
        boolean[] zArr = new boolean[3];
        a2Var.R = LocaleController.getString(R.string.VoipFailed);
        a2Var.T = charSequence;
        a2Var.f18673l0 = LocaleController.getString(R.string.OK);
        a2Var.m0 = null;
        a2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) a2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(a2Var.e(org.telegram.ui.ActionBar.h6.f19284q7));
            }
        }
        a2Var.setCanceledOnTouchOutside(true);
        a2Var.setOnDismissListener(new r5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f35598x0);
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
                    org.telegram.ui.Components.voip.v1 v1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(v1Var, View.ALPHA, v1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.v1 v1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v1Var2, View.SCALE_X, v1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.v1 v1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(v1Var3, View.SCALE_Y, v1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ai1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.rr.f28022f);
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
                org.telegram.ui.Components.voip.v1 v1Var4 = this.Y;
                if (v1Var4.f29699y < 0.0f) {
                    v1Var4.d(1.0f, 1.0f);
                    this.f35556a0 = true;
                }
            }
            org.telegram.ui.Components.voip.v1 v1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            v1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f35556a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

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
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
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
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
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
import org.webrtc.VideoSink;

public final class lh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, af.a {

    public static lh1 f40088j1;
    public TextView A;
    public boolean A0;
    public org.telegram.ui.Components.voip.o2 B;
    public float B0;
    public kh1 C;
    public boolean C0;
    public ImageView D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public int F;
    public boolean F0;
    public org.telegram.ui.Components.ce G;
    public long G0;
    public int H;
    public cg.y2 I;
    public org.telegram.ui.Components.voip.g2 I0;
    public ra1 J;
    public org.telegram.ui.Components.voip.c3 J0;
    public FrameLayout K;
    public org.telegram.ui.Components.voip.c3 K0;
    public org.telegram.ui.Components.voip.o0 L;
    public ValueAnimator L0;
    public org.telegram.ui.Components.voip.l1 M;
    public lh.m5 N;
    public boolean N0;
    public TextView O;
    public ik P;
    public org.telegram.ui.Components.voip.k Q;
    public boolean Q0;
    public float R0;
    public float S0;
    public hh1 T;
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

    public final int f40089a;

    public org.telegram.ui.Components.voip.e f40090a0;

    public int f40091a1;

    public Activity f40092b;

    public boolean f40093b0;

    public final TLRPC.User f40095c;

    public ye.d f40096c0;

    public boolean f40097c1;
    public final TLRPC.User d;

    public View f40098d0;

    public boolean f40099d1;

    public org.telegram.ui.Components.voip.j3 f40100e;

    public View f40101e0;

    public ValueAnimator f40102e1;

    public org.telegram.ui.Components.voip.j3 f40103f;

    public org.telegram.ui.Components.voip.o1 f40104f0;

    public boolean f40105f1;

    public org.telegram.ui.Components.voip.r2 f40107g1;
    public org.telegram.ui.Components.voip.j3 h;

    public bf.e f40109h1;

    public boolean f40110i0;

    public boolean f40111i1;

    public boolean f40112j0;

    public eh1 f40113k0;

    public int f40114l0;
    public int m0;

    public ih1 f40115n;

    public WindowInsets f40116n0;

    public boolean f40117o0;

    public float f40118p0;

    public dh1 f40119q0;

    public int f40121r0;

    public gh1 f40122s;

    public AccessibilityManager f40123s0;
    public org.telegram.ui.Components.voip.b3 v;

    public boolean f40126v0;

    public org.telegram.ui.Components.voip.y2 f40127w;

    public AnimatorSet f40128w0;

    public org.telegram.ui.Components.voip.d3 f40129x;

    public boolean f40130x0;

    public org.telegram.ui.Components.voip.q0 f40131y;

    public boolean f40132y0;

    public boolean f40133z0;

    public final org.telegram.ui.Components.voip.n1 f40120r = new org.telegram.ui.Components.voip.n1();
    public final org.telegram.ui.Components.n9[] R = new org.telegram.ui.Components.n9[4];
    public final Drawable[] S = new Drawable[4];

    public final Paint f40106g0 = new Paint();

    public final Paint f40108h0 = new Paint();

    public boolean f40124t0 = true;

    public float f40125u0 = 1.0f;
    public final AnimationNotificationsLocker H0 = new AnimationNotificationsLocker();
    public final w01 M0 = new w01(this, 20);
    public final vg1 O0 = new vg1(this, 12);
    public final vg1 P0 = new vg1(this, 13);

    public float f40094b1 = 1.0f;

    public lh1(int i10) {
        this.f40089a = i10;
        this.f40095c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
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
        this.f40114l0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(lh1 lh1Var) {
        AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
        lh1Var.N0 = false;
        if (Build.VERSION.SDK_INT < 23 || lh1Var.f40092b.checkSelfPermission("android.permission.CAMERA") == 0) {
            lh1Var.C();
        } else {
            lh1Var.f40092b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(lh1 lh1Var) {
        lh1 lh1Var2;
        int i10 = 0;
        if (lh1Var.f40097c1) {
            lh1Var.f40097c1 = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            lh1Var.f40102e1 = valueAnimatorOfFloat;
            lh1Var2 = lh1Var;
            valueAnimatorOfFloat.addUpdateListener(new bg.c(lh1Var2, lh1Var.f40094b1, lh1Var.U0, lh1Var.V0, 2));
            lh1Var2.f40102e1.addListener(new zg1(lh1Var2, i10));
            lh1Var2.f40102e1.setDuration(350L);
            lh1Var2.f40102e1.setInterpolator(org.telegram.ui.Components.er.f28122f);
            lh1Var2.f40102e1.start();
        } else {
            lh1Var2 = lh1Var;
        }
        lh1Var2.f40099d1 = false;
        lh1Var2.W0 = false;
    }

    public static void q(int i10, int[] iArr) {
        lh1 lh1Var = f40088j1;
        if (lh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    lh1Var.f40119q0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    lh1Var.r(new tq0(6));
                } else if (!lh1Var.f40092b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.e2.i(lh1Var.f40092b, new vg1(lh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    lh1Var.f40119q0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    lh1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        lh1 lh1Var = f40088j1;
        if (lh1Var != null && lh1Var.f40119q0.getParent() == null) {
            lh1 lh1Var2 = f40088j1;
            if (lh1Var2 != null) {
                lh1Var2.Y.d.release();
                f40088j1.Z.d.release();
                f40088j1.X.release();
                dh1 dh1Var = f40088j1.f40119q0;
                if (dh1Var != null) {
                    dh1Var.d();
                }
                f40088j1.l();
            }
            f40088j1 = null;
        }
        if (f40088j1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.l2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        lh1 lh1Var3 = new lh1(i10);
        lh1Var3.f40092b = activity;
        f40088j1 = lh1Var3;
        dh1 dh1Var2 = new dh1(activity, !z10, lh1Var3);
        f40088j1.F0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        f40088j1.getClass();
        dh1Var2.setLockOnScreen(f40088j1.F0);
        lh1Var3.f40119q0 = dh1Var2;
        tg1 tg1Var = new tg1(lh1Var3, 4);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(dh1Var2, tg1Var);
        ((WindowManager) activity.getSystemService("window")).addView(dh1Var2, org.telegram.ui.Components.voip.v2.a());
        lh1Var3.f40118p0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        lh1Var3.f40123s0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        gh1 gh1Var = new gh1(lh1Var3, activity);
        gh1Var.setClipToPadding(false);
        gh1Var.setClipChildren(false);
        gh1Var.setBackgroundColor(-16777216);
        lh1Var3.G();
        lh1Var3.f40122s = gh1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.n1 n1Var = lh1Var3.f40120r;
        lh1Var3.v = new org.telegram.ui.Components.voip.b3(activity, z11, n1Var);
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
        lh1Var3.Y = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2Var.d.setScalingType(scalingType);
        lh1Var3.Y.d.setEnableHardwareScaler(true);
        lh1Var3.Y.d.setRotateTextureWithScreen(true);
        lh1Var3.Y.T = 1;
        gh1Var.addView(lh1Var3.v, h7.z5.c(-1.0f, -1));
        TLRPC.User user = lh1Var3.d;
        org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity, user, n1Var);
        lh1Var3.f40127w = y2Var;
        gh1Var.addView(y2Var, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.g6.f22993a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                d3Var.f33530a = new org.telegram.ui.Components.kv0(0);
            }
        }
        lh1Var3.f40129x = d3Var;
        gh1Var.addView(d3Var, h7.z5.c(220.0f, -1));
        gh1Var.addView(lh1Var3.Y);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.m9(orientation, new int[]{-14994098, -14328963}).f(o0.b.h(0.5f, 1), new ub1(lh1Var3, 1), 0L);
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
        lh1Var3.U = s1Var;
        s1Var.setDelegate(new tg1(lh1Var3, 3));
        lh1Var3.U.d(1.0f, 1.0f);
        lh1Var3.W = true;
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
        lh1Var3.Z = r2Var2;
        r2Var2.d.setIsCamera(true);
        lh1Var3.Z.d.setUseCameraRotation(true);
        lh1Var3.U.setOnTapListener(new wg1(lh1Var3, 1));
        lh1Var3.Z.d.setMirror(true);
        lh1Var3.U.addView(lh1Var3.Z);
        org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
        lh1Var3.V = s1Var2;
        s1Var2.O = true;
        s1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        lh1Var3.X = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        lh1Var3.X.setIsCamera(false);
        lh1Var3.X.setFpsReduction(30.0f);
        lh1Var3.X.setScalingType(scalingType);
        lh1Var3.V.addView(lh1Var3.X, h7.z5.e(-1, -2, 17));
        lh1Var3.V.setOnTapListener(new wg1(lh1Var3, i11));
        lh1Var3.V.setVisibility(8);
        gh1Var.addView(lh1Var3.U, h7.z5.c(-2.0f, -2));
        gh1Var.addView(lh1Var3.V);
        View view = new View(activity);
        lh1Var3.f40098d0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.b.k(-16777216, 127)}));
        gh1Var.addView(lh1Var3.f40098d0, h7.z5.e(-1, 160, 80));
        View view2 = new View(activity);
        lh1Var3.f40101e0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.b.k(-16777216, 102), 0}));
        gh1Var.addView(lh1Var3.f40101e0, h7.z5.e(-1, 160, 48));
        ra1 ra1Var = new ra1(lh1Var3, activity, 18);
        lh1Var3.J = ra1Var;
        ra1Var.setOrientation(0);
        lh1Var3.J.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        lh1Var3.J.setClipToPadding(false);
        lh1Var3.J.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        lh1Var3.J.setOnClickListener(new wg1(lh1Var3, 3));
        lh1Var3.L = new org.telegram.ui.Components.voip.o0(activity, n1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        lh1Var3.K = frameLayout;
        frameLayout.addView(lh1Var3.L, h7.z5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        lh1Var3.K.setVisibility(8);
        lh1Var3.K.setOnClickListener(new wg1(lh1Var3, 4));
        lh.m5 m5Var = new lh.m5(activity, n1Var);
        lh1Var3.N = m5Var;
        m5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        lh1Var3.O = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        lh1Var3.O.setTextSize(1, 15.0f);
        lh1Var3.O.setTypeface(AndroidUtilities.bold());
        lh1Var3.O.setTextColor(-1);
        lh1Var3.O.setGravity(17);
        ik ikVar = new ik(lh1Var3, activity, 5);
        lh1Var3.P = ikVar;
        ikVar.setTextSize(1, 15.0f);
        lh1Var3.P.setTextColor(-1);
        lh1Var3.P.setGravity(17);
        lh1Var3.P.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), lh1Var3.P.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        lh1Var3.N.setVisibility(8);
        lh1Var3.N.addView(lh1Var3.O);
        lh1Var3.N.addView(lh1Var3.P, h7.z5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        lh1Var3.N.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(activity);
            org.telegram.ui.Components.n9[] n9VarArr = lh1Var3.R;
            n9VarArr[i15] = n9Var;
            n9VarArr[i15].getImageReceiver().setAspectFit(true);
            lh1Var3.J.addView(n9VarArr[i15], h7.z5.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        hh1 hh1Var = new hh1(lh1Var3, activity);
        lh1Var3.T = hh1Var;
        hh1Var.setOrientation(1);
        lh1Var3.T.setFocusable(true);
        lh1Var3.T.setFocusableInTouchMode(true);
        lh1Var3.f40131y = new org.telegram.ui.Components.voip.q0(activity);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(user);
        org.telegram.ui.Components.voip.q0 q0Var = lh1Var3.f40131y;
        int i16 = lh1Var3.f40089a;
        q0Var.f33809b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, y8Var, user);
        lh1Var3.f40131y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        lh1Var3.A = textView2;
        textView2.setTextSize(1, 28.0f);
        lh1Var3.A.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), lh1Var3.A.getPaint().getFontMetricsInt(), false));
        lh1Var3.A.setMaxLines(2);
        lh1Var3.A.setEllipsize(TextUtils.TruncateAt.END);
        lh1Var3.A.setTextColor(-1);
        lh1Var3.A.setGravity(1);
        lh1Var3.A.setImportantForAccessibility(2);
        lh1Var3.T.addView(lh1Var3.A, h7.z5.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity);
        o2Var.f33783a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            o2Var.f33783a[i17] = new TextView(activity);
            o2Var.f33783a[i17].setTextSize(1, 15.0f);
            o2Var.f33783a[i17].setTextColor(-1);
            o2Var.f33783a[i17].setGravity(1);
            o2Var.addView(o2Var.f33783a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        o2Var.f33785c = frameLayout2;
        org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(o2Var, activity, n1Var);
        m2Var.setTextSize(1, 15.0f);
        m2Var.setTextColor(-1);
        m2Var.setGravity(1);
        m2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        m2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(m2Var, h7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        o2Var.addView(frameLayout2, h7.z5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        o2Var.f33784b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        o2Var.addView(textView3, h7.z5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new org.telegram.ui.Components.z(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
        o2Var.d = s2Var;
        o2Var.addView(s2Var, h7.z5.c(-2.0f, -1));
        lh1Var3.B = o2Var;
        WeakHashMap weakHashMap2 = r0.j0.f46605a;
        o2Var.setImportantForAccessibility(4);
        lh1Var3.T.addView(lh1Var3.B, h7.z5.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            kh1 kh1Var = new kh1(activity);
            lh1Var3.C = kh1Var;
            long j10 = sharedState.getUser().f22527id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int iMax = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int iMin = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.a9 a9Var = kh1Var.f39763b;
                a9Var.k(iMin);
                int i20 = 0;
                while (i20 < iMin) {
                    a9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                a9Var.b(false, true);
                if (iMax == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    kh1Var.setVisibility(8);
                } else {
                    kh1Var.f39764c = new org.telegram.ui.Components.pz0(LocaleController.formatPluralStringComma("Participants", iMax), 14.0f, AndroidUtilities.bold());
                    kh1Var.setVisibility(0);
                    kh1Var.invalidate();
                }
            } else {
                kh1Var.setVisibility(8);
            }
            lh1Var3.T.addView(lh1Var3.C, h7.z5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        lh1Var3.T.setClipChildren(false);
        lh1Var3.T.setClipToPadding(false);
        lh1Var3.T.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        lh1Var3.Q = new org.telegram.ui.Components.voip.k(activity);
        lh1Var3.M = new org.telegram.ui.Components.voip.l1(activity, n1Var);
        lh1Var3.Q.setAlpha(0.0f);
        lh1Var3.M.setVisibility(8);
        gh1Var.addView(lh1Var3.f40131y, h7.z5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.T, h7.z5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.K, h7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.N, h7.z5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.J, h7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.Q, h7.z5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        gh1Var.addView(lh1Var3.M, h7.z5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        lh1Var3.f40104f0 = new org.telegram.ui.Components.voip.o1(activity);
        lh1Var3.f40100e = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        lh1Var3.f40103f = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        lh1Var3.h = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        lh1Var3.f40115n = new ih1(activity, 52.0f);
        lh1Var3.f40100e.setTranslationY(AndroidUtilities.dp(100.0f));
        lh1Var3.f40100e.setScaleX(0.0f);
        lh1Var3.f40100e.setScaleY(0.0f);
        lh1Var3.f40100e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        lh1Var3.f40103f.setTranslationY(AndroidUtilities.dp(100.0f));
        lh1Var3.f40103f.setScaleX(0.0f);
        lh1Var3.f40103f.setScaleY(0.0f);
        lh1Var3.f40103f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        lh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        lh1Var3.h.setScaleX(0.0f);
        lh1Var3.h.setScaleY(0.0f);
        lh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        lh1Var3.f40115n.setTranslationY(AndroidUtilities.dp(100.0f));
        lh1Var3.f40115n.setScaleX(0.0f);
        lh1Var3.f40115n.setScaleY(0.0f);
        lh1Var3.f40115n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        lh1Var3.f40104f0.addView(lh1Var3.f40100e);
        lh1Var3.f40104f0.addView(lh1Var3.f40103f);
        lh1Var3.f40104f0.addView(lh1Var3.h);
        lh1Var3.f40104f0.addView(lh1Var3.f40115n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        lh1Var3.f40090a0 = eVar;
        eVar.setListener(new jh1(lh1Var3));
        lh1Var3.f40090a0.setScaleX(1.15f);
        lh1Var3.f40090a0.setScaleY(1.15f);
        gh1Var.addView(lh1Var3.f40104f0, h7.z5.e(-1, -2, 80));
        float f10 = AndroidUtilities.isTablet() ? 100 : 27;
        gh1Var.addView(lh1Var3.f40090a0, h7.z5.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        lh1Var3.E = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(-1, 76), 1, -1));
        lh1Var3.E.setImageResource(R.drawable.msg_addcontact);
        lh1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        gh1Var.addView(lh1Var3.E, h7.z5.e(56, 56, 53));
        h7.b6.a(lh1Var3.E);
        ImageView imageView2 = new ImageView(activity);
        lh1Var3.D = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(-1, 76), 1, -1));
        lh1Var3.D.setImageResource(R.drawable.msg_call_minimize_shadow);
        lh1Var3.D.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        lh1Var3.D.setContentDescription(LocaleController.getString(R.string.Back));
        gh1Var.addView(lh1Var3.D, h7.z5.e(56, 56, 51));
        h7.b6.a(lh1Var3.D);
        org.telegram.ui.Components.ce ceVar = new org.telegram.ui.Components.ce(activity, 4);
        lh1Var3.G = ceVar;
        ceVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        lh1Var3.G.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(-1, 76), 1, -1));
        lh1Var3.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        gh1Var.addView(lh1Var3.G, h7.z5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        lh1Var3.G.setAlpha(0.0f);
        lh1Var3.G.setOnClickListener(new wg1(lh1Var3, 5));
        int i21 = 6;
        lh1Var3.D.setOnClickListener(new wg1(lh1Var3, i21));
        lh1Var3.E.setOnClickListener(new u70(28, lh1Var3, activity));
        if (lh1Var3.f40119q0.f33958b) {
            lh1Var3.D.setVisibility(8);
            lh1Var3.E.setVisibility(8);
        }
        org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity);
        g2Var.f33578a = new HashMap();
        g2Var.f33579b = new ArrayList();
        g2Var.f33580c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        g2Var.f33584r = textPaint;
        g2Var.setOrientation(1);
        g2Var.f33583n = n1Var;
        TransitionSet transitionSet = new TransitionSet();
        g2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new ag.u0(4).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        lh1Var3.I0 = g2Var;
        g2Var.setGravity(80);
        lh1Var3.I0.setOnViewsUpdated(new vg1(lh1Var3, 5));
        gh1Var.addView(lh1Var3.I0, h7.z5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity, 3, n1Var, true);
        c3Var.q(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c3Var.G = alignment;
        c3Var.d = -1L;
        c3Var.f16984h0 = new vg1(lh1Var3, i21);
        c3Var.P = true;
        c3Var.h = AndroidUtilities.dp(320.0f);
        c3Var.f16979e = true;
        c3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var.r(8.0f);
        lh1Var3.J0 = c3Var;
        c3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
        gh1Var.addView(lh1Var3.J0, h7.z5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.c3 c3Var2 = new org.telegram.ui.Components.voip.c3(activity, 1, n1Var, false);
        c3Var2.q(true);
        c3Var2.G = alignment;
        c3Var2.d = 4000L;
        c3Var2.P = true;
        c3Var2.h = AndroidUtilities.dp(320.0f);
        c3Var2.f16979e = true;
        c3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var2.r(8.0f);
        lh1Var3.K0 = c3Var2;
        c3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
        gh1Var.addView(lh1Var3.K0, h7.z5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        lh1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!lh1Var3.Q0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                lh1Var3.Q0 = phoneCall != null && phoneCall.video;
            }
            lh1Var3.o();
        }
        dh1Var2.addView(gh1Var);
        if (z10) {
            lh1Var3.B0 = 0.0f;
            lh1Var3.E0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                lh1Var3.Y.setStub(org.telegram.ui.Components.voip.l2.k().f33708r);
                lh1Var3.Z.setStub(org.telegram.ui.Components.voip.l2.k().f33707n);
            }
            lh1Var3.f40119q0.setAlpha(0.0f);
            lh1Var3.H();
            lh1Var3.A0 = true;
            org.telegram.ui.Components.voip.l2.P = true;
            if (org.telegram.ui.Components.voip.l2.R != null) {
                org.telegram.ui.Components.voip.l2.Q.getClass();
                throw null;
            }
            lh1Var3.H0.lock();
            AndroidUtilities.runOnUIThread(new vg1(lh1Var3, 11), 32L);
        } else {
            lh1Var3.B0 = 1.0f;
            lh1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && bf.d.a(activity) == 1) {
            lh1 lh1Var4 = f40088j1;
            ye.c cVar = new ye.c(activity, lh1Var4);
            cVar.f49851c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var3 = lh1Var4.Y;
            cVar.f49856j = r2Var3.d;
            cVar.f49857k = r2Var3.getPlaceholderView();
            lh1Var4.f40096c0 = cVar.a();
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        w01 w01Var = this.M0;
        if (z10 || !this.f40124t0) {
            if (z10 && !this.f40124t0) {
                this.J0.e(true);
                this.K0.e(true);
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.A.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
                viewPropertyAnimatorTranslationY.setInterpolator(erVar).start();
                this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(erVar).start();
                this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
                this.D.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
                this.f40104f0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
                this.f40098d0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                this.f40101e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f40125u0, 1.0f);
                this.L0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(w01Var);
                this.L0.setDuration(150L).setInterpolator(erVar);
                this.L0.start();
                this.f40104f0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f28122f;
            duration.setInterpolator(erVar2).start();
            this.D.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(erVar2).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(erVar2).start();
            this.J.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(erVar2).start();
            this.A.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(erVar2).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(erVar2).start();
            this.f40104f0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(erVar2).start();
            this.f40098d0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar2).start();
            this.f40101e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar2).start();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f40125u0, 0.0f);
            this.L0 = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(w01Var);
            this.L0.setDuration(150L).setInterpolator(erVar2);
            this.L0.start();
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            this.N0 = false;
            this.f40104f0.setEnabled(false);
            this.K0.e(true);
            i10 = 150;
        }
        this.f40124t0 = z10;
        dh1 dh1Var = this.f40119q0;
        if (z10) {
            dh1Var.setSystemUiVisibility(dh1Var.getSystemUiVisibility() & (-5));
        } else {
            dh1Var.setSystemUiVisibility(dh1Var.getSystemUiVisibility() | 4);
        }
        this.I0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.f40124t0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            vg1 vg1Var = this.O0;
            AndroidUtilities.cancelRunOnUIThread(vg1Var);
            this.N0 = false;
            if (this.f40126v0 && this.f40124t0) {
                AndroidUtilities.runOnUIThread(vg1Var, 3000L);
                this.N0 = true;
            }
        }
    }

    public final void C() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f40123s0.isTouchExplorationEnabled()) {
                this.f40122s.announceForAccessibility(!this.f40112j0 ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.f40112j0) {
                this.Z.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.m0 = this.f40114l0;
                H();
                return;
            }
            if (this.f40113k0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.f40119q0.setLockOnScreen(true);
                int[] iArr = new int[2];
                this.f40103f.getLocationOnScreen(iArr);
                eh1 eh1Var = new eh1(this, this.f40122s.getContext(), iArr[0], iArr[1]);
                this.f40113k0 = eh1Var;
                WindowInsets windowInsets = this.f40116n0;
                if (windowInsets != null) {
                    eh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.f40122s.addView(this.f40113k0);
            }
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new ag.u0(5).setDuration(250L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
            transitionSet.addTransition(duration.setInterpolator(erVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(erVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.j3.class, true);
            TransitionManager.beginDelayedTransition(this.f40104f0, transitionSet);
        }
        int i10 = this.f40114l0;
        if (i10 == 11) {
            this.f40100e.setVisibility(8);
            this.f40103f.setVisibility(8);
            this.h.setVisibility(8);
            this.f40115n.setVisibility(8);
            return;
        }
        int i11 = 0;
        if (i10 == 15 || i10 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i10 == 15) {
                if (sharedInstance.isScreencast() || !(this.f40112j0 || this.f40110i0)) {
                    u(this.f40100e, sharedInstance);
                    this.G.animate().alpha(0.0f).start();
                } else {
                    s(this.f40100e, sharedInstance);
                    if (this.f40124t0) {
                        this.G.animate().alpha(1.0f).start();
                    }
                }
                v(this.f40103f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
            } else {
                this.f40100e.setVisibility(8);
                this.f40103f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.f40115n.setVisibility(8);
        } else {
            if (f40088j1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.f40112j0 || this.f40110i0)) {
                u(this.f40100e, sharedInstance);
                this.G.setTag(null);
                this.G.animate().alpha(0.0f).start();
            } else {
                s(this.f40100e, sharedInstance);
                if (this.f40124t0) {
                    this.G.setTag(1);
                    this.G.animate().alpha(1.0f).start();
                }
            }
            v(this.f40103f, sharedInstance, false);
            t(this.h, sharedInstance, z10);
            this.f40115n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
            this.f40115n.setOnClickListener(new wg1(this, 0));
        }
        if (this.f40100e.getVisibility() == 0) {
            this.f40100e.f33642f = 0;
            i11 = 16;
        }
        if (this.f40103f.getVisibility() == 0) {
            this.f40103f.f33642f = i11;
            i11 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f33642f = i11;
            i11 += 16;
        }
        if (this.f40115n.getVisibility() == 0) {
            this.f40115n.B = i11;
        }
        F();
    }

    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] byteArray;
        ?? r10;
        ?? r11;
        boolean zIsLoaded;
        jh.y2 y2Var;
        String[] strArr;
        TLRPC.Document document;
        ?? r12;
        int i10;
        org.telegram.ui.Components.k5 k5Var;
        if (this.f40130x0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z11 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception e9) {
            FileLog.e((Throwable) e9, false);
            byteArray = null;
        }
        if (byteArray == null) {
            return;
        }
        String[] strArrEmojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(byteArray, 0, byteArray.length));
        int i11 = 0;
        while (true) {
            r10 = this.R;
            r11 = this.S;
            if (i11 >= 4) {
                break;
            }
            Emoji.preloadEmoji(strArrEmojifyForCall[i11]);
            ?? emojiDrawable = Emoji.getEmojiDrawable(strArrEmojifyForCall[i11]);
            if (emojiDrawable != 0) {
                emojiDrawable.setBounds(z11 ? 1 : 0, z11 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(strArrEmojifyForCall[i11], textPaint.getFontMetricsInt(), z11, iArr);
                boolean z12 = charSequenceReplaceEmoji instanceof Spannable;
                int i12 = this.f40089a;
                if (!z12) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                Spannable spannable = (Spannable) charSequenceReplaceEmoji;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), org.telegram.ui.Components.t5.class);
                if (emojiSpanArr == null) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                if ((iArr[z11 ? 1 : 0] - emojiSpanArr.length) - (t5VarArr == null ? 0 : t5VarArr.length) > 0) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                int length = emojiSpanArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        r12 = z11;
                        strArr = strArrEmojifyForCall;
                        document = null;
                        break;
                    }
                    Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r12), false, true, new x3(this, 23));
                    if (stickerSet == null) {
                        r12 = z11;
                        strArr = strArrEmojifyForCall;
                        document = null;
                        break;
                    }
                    String strReplace = emojiSpan.emoji.replace("️", "");
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            r12 = z11;
                            strArr = strArrEmojifyForCall;
                            i10 = length;
                            document = null;
                            break;
                        }
                        TLRPC.Document document2 = arrayList.get(i14);
                        i14++;
                        strArr = strArrEmojifyForCall;
                        document = document2;
                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                        i10 = length;
                        if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), strReplace)) {
                            break;
                        }
                        r12 = z11;
                        length = i10;
                        strArrEmojifyForCall = strArr;
                        arrayList = arrayList2;
                    }
                    if (document != null) {
                        break;
                    }
                    r12 = z11;
                    i13++;
                    length = i10;
                    strArrEmojifyForCall = strArr;
                    r12 = 0;
                }
                if (document != null) {
                    r12 = z11;
                    ?? r13 = r11[i11];
                    if ((r13 instanceof org.telegram.ui.Components.k5) && ((org.telegram.ui.Components.k5) r13).i() == document.f22386id) {
                        k5Var = (org.telegram.ui.Components.k5) r11[i11];
                    } else {
                        org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5(21, i12, document);
                        r11[i11] = k5Var2;
                        k5Var = k5Var2;
                    }
                    k5Var.r(strArr[i11]);
                    r10[i11].setAnimatedEmojiDrawable(k5Var);
                    r10[i11].getImageReceiver().clearImage();
                    emojiDrawable = k5Var;
                } else {
                    r12 = z11;
                    r10[i11].setImageDrawable(emojiDrawable);
                    emojiDrawable = emojiDrawable;
                }
                r10[i11].setVisibility(8);
            } else {
                strArr = strArrEmojifyForCall;
            }
            r11[i11] = emojiDrawable;
            i11++;
            strArrEmojifyForCall = strArr;
            z11 = false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            ?? r14 = r11[i16];
            if (r14 instanceof Emoji.EmojiDrawable) {
                zIsLoaded = ((Emoji.EmojiDrawable) r14).isLoaded();
            } else if (!(r14 instanceof org.telegram.ui.Components.k5) || (y2Var = ((org.telegram.ui.Components.k5) r14).f29961k) == null) {
                zIsLoaded = false;
            } else {
                Drawable thumb = y2Var.getThumb();
                if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                    zIsLoaded = true;
                } else {
                    zIsLoaded = false;
                }
            }
            if (zIsLoaded) {
                i15++;
            }
        }
        if (i15 == 4) {
            this.f40130x0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r10[i17].getVisibility() != 0) {
                    r10[i17].setVisibility(0);
                    if (z10) {
                        r10[i17].setAlpha(0.0f);
                        r10[i17].setScaleX(0.0f);
                        r10[i17].setScaleY(0.0f);
                        org.telegram.messenger.rl.o(r10[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.er.f28126k, 250L);
                    }
                }
            }
            this.K0.postDelayed(new vg1(this, 9), 1000L);
        }
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
        } else {
            i10 = sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        }
        if (this.F != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.G, i10);
        } else {
            this.G.setImageResource(i10);
        }
        this.F = i10;
    }

    public final void G() {
        this.f40106g0.setColor(i0.b.k(-16777216, (int) (this.f40125u0 * 102.0f * this.B0)));
        this.f40108h0.setColor(i0.b.k(-16777216, (int) (127.5f * this.B0)));
        gh1 gh1Var = this.f40122s;
        if (gh1Var != null) {
            gh1Var.invalidate();
        }
    }

    public final void H() {
        Integer num;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int iDp;
        int i11;
        Integer num2;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        float f10;
        int i13;
        float f11;
        int iDp2;
        int i14;
        boolean z17;
        int i15;
        boolean z18;
        int childsHight;
        org.telegram.ui.Components.voip.s1 s1Var;
        org.telegram.ui.Components.voip.s1 s1Var2;
        boolean z19;
        boolean z20;
        vg1 vg1Var;
        int i16;
        VideoSink videoSink;
        VideoSink videoSink2;
        int i17;
        boolean z21;
        org.telegram.ui.Components.voip.g2 g2Var;
        TL_phone.PhoneCall phoneCall;
        org.telegram.ui.Components.voip.g2 g2Var2;
        long j10;
        Layout layout;
        int lineCount;
        float f12;
        float f13;
        int iDp3;
        TL_phone.PhoneCall phoneCall2;
        int i18;
        float f14;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        TextView textView;
        boolean z26 = true;
        if (this.C0 || this.A0) {
            return;
        }
        int i19 = 0;
        boolean z27 = this.m0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i20 = this.f40114l0;
        TLRPC.User user = this.d;
        if (i20 != 1 && i20 != 2) {
            if (i20 == 3) {
                num = 1;
                E(z27);
                if (this.f40114l0 == 5) {
                    z25 = this.f40117o0;
                    if (z25 && this.m0 != 5) {
                        this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z27);
                    }
                    z10 = z25;
                    z26 = false;
                    i19 = 0;
                } else {
                    i19 = 1;
                    this.f40117o0 = true;
                    z26 = false;
                    z10 = false;
                }
            } else if (i20 != 4) {
                if (i20 != 5) {
                    switch (i20) {
                        case 11:
                            boolean z28 = sharedInstance != null && sharedInstance.hasRate();
                            this.Z.c();
                            if (!z28 || this.C0) {
                                num = 1;
                                AndroidUtilities.runOnUIThread(new vg1(this, 0), 200L);
                            } else {
                                if (this.f40124t0) {
                                    int[] iArr = new int[2];
                                    int i21 = AndroidUtilities.displaySize.x;
                                    this.f40115n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i21 - iArr[0]) - ((this.f40115n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.Q.setTranslationY(iArr[1]);
                                    this.Q.setAlpha(1.0f);
                                    this.Q.setLayoutParams(marginLayoutParams);
                                    this.f40104f0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new m21(27, this, sharedInstance), 2L);
                                } else {
                                    this.f40104f0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                                    layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                    layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                    int iDp4 = AndroidUtilities.dp(36.0f);
                                    layoutParams.bottomMargin = iDp4;
                                    WindowInsets windowInsets = this.f40116n0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + iDp4;
                                    }
                                    layoutParams.gravity = 80;
                                    this.Q.setLayoutParams(layoutParams);
                                    this.Q.animate().alpha(1.0f).setDuration(250L).start();
                                    this.Q.a(new ug1(this, sharedInstance, i19), false);
                                }
                                this.M.setVisibility(0);
                                org.telegram.ui.Components.voip.l1 l1Var = this.M;
                                tg1 tg1Var = new tg1(this, 1 == true ? 1 : 0);
                                org.telegram.ui.Components.voip.k1[] k1VarArr = l1Var.f33701c;
                                l1Var.d = tg1Var;
                                org.telegram.ui.Components.voip.i1 i1Var = l1Var.f33699a;
                                i1Var.setVisibility(0);
                                l1Var.f33700b.setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.er.f28122f);
                                Integer num3 = 1;
                                animatorSet.setDuration(250L);
                                int i22 = 0;
                                while (i22 < k1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    k1VarArr[i22].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(k1VarArr[i22], (Property<org.telegram.ui.Components.voip.k1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i22], (Property<org.telegram.ui.Components.voip.k1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i22], (Property<org.telegram.ui.Components.voip.k1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i22], (Property<org.telegram.ui.Components.voip.k1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(((long) i22) * 16);
                                    animatorSet2.start();
                                    i22++;
                                    property4 = property4;
                                    num3 = num3;
                                }
                                num = num3;
                                animatorSet.start();
                                if (this.f40132y0) {
                                    this.f40132y0 = false;
                                    ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
                                    duration.setInterpolator(erVar).setListener(new go(this.K)).start();
                                    this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(erVar).setDuration(250L).start();
                                    this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new go(this.K)).setDuration(250L).setInterpolator(erVar).start();
                                }
                                for (org.telegram.ui.Components.n9 n9Var : this.R) {
                                    n9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.er.f28122f).setDuration(250L).start();
                                }
                                this.A.animate().alpha(0.0f).setDuration(70L).setListener(new ch1(this)).start();
                                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.G.animate().alpha(0.0f);
                                org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f28122f;
                                org.telegram.messenger.rl.o(viewPropertyAnimatorAlpha, erVar2, 250L);
                                this.G.setVisibility(8);
                                this.B.d(false, true);
                                this.B.c(false);
                                org.telegram.ui.Components.voip.s2 s2Var = this.B.d;
                                s2Var.f33868n = true;
                                s2Var.invalidate();
                                org.telegram.ui.Components.voip.q0 q0Var = this.f40131y;
                                q0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = q0Var.f33810c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                q0Var.f33810c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.ALPHA, q0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.TRANSLATION_Y, q0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_X, q0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_Y, q0Var.getScaleY(), 0.9f, 1.0f));
                                q0Var.f33810c.setInterpolator(erVar2);
                                q0Var.f33810c.setDuration(300L);
                                q0Var.f33810c.setStartDelay(250L);
                                q0Var.f33810c.start();
                                D(true);
                                this.f40115n.setVisibility(4);
                                this.V.setAlpha(0.0f);
                                this.V.setVisibility(8);
                                this.U.setAlpha(0.0f);
                                this.U.setVisibility(8);
                                eh1 eh1Var = this.f40113k0;
                                if (eh1Var != null) {
                                    eh1Var.a(false, false);
                                }
                                this.I0.animate().alpha(0.0f).setDuration(250L).start();
                            }
                            break;
                        case 12:
                            if (this.m0 != 12) {
                                this.B.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z27);
                            }
                            num = 1;
                            break;
                        case 13:
                            this.B.b(LocaleController.getString(R.string.VoipWaiting), true, z27);
                            num = 1;
                            break;
                        case 14:
                            this.B.b(LocaleController.getString(R.string.VoipRequesting), true, z27);
                            num = 1;
                            break;
                        case 15:
                            this.f40090a0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.B.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z27);
                                this.f40090a0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.B.b(LocaleController.getString(R.string.VoipInCallBranding), false, z27);
                                this.f40090a0.setTranslationY(0.0f);
                            } else {
                                this.B.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z27);
                                this.f40090a0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            num = 1;
                            break;
                        case 16:
                            if (this.m0 != 16) {
                                this.B.b(LocaleController.getString(R.string.VoipRinging), true, z27);
                            }
                            num = 1;
                            break;
                        case 17:
                            this.B.b(LocaleController.getString(R.string.VoipBusy), false, z27);
                            this.f40090a0.setRetryMod(true);
                            this.f40112j0 = false;
                            this.f40110i0 = false;
                            num = 1;
                            break;
                        default:
                            num = 1;
                            break;
                    }
                } else {
                    num = 1;
                    E(z27);
                    if (this.f40114l0 == 5) {
                        z25 = this.f40117o0;
                        if (z25) {
                        }
                        z10 = z25;
                        z26 = false;
                        i19 = 0;
                    } else {
                        i19 = 1;
                        this.f40117o0 = true;
                        z26 = false;
                    }
                }
                z10 = false;
            } else {
                num = 1;
                this.B.b(LocaleController.getString(R.string.VoipFailed), false, z27);
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : "ERROR_UNKNOWN";
                if (TextUtils.equals(lastError, "ERROR_UNKNOWN")) {
                    AndroidUtilities.runOnUIThread(new vg1(this, 3), 1000L);
                } else if (TextUtils.equals(lastError, "ERROR_INCOMPATIBLE")) {
                    y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                } else if (TextUtils.equals(lastError, "ERROR_PEER_OUTDATED")) {
                    if (this.Q0) {
                        String string = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.f40092b, 0, null);
                        boolean[] zArr2 = new boolean[3];
                        w3Var.N = LocaleController.getString(R.string.VoipFailed);
                        w3Var.P = AndroidUtilities.replaceTags(string);
                        String string2 = LocaleController.getString(R.string.Cancel);
                        tg1 tg1Var2 = new tg1(this, 2);
                        w3Var.f22756j0 = string2;
                        w3Var.f22757k0 = tg1Var2;
                        String string3 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                        nl0 nl0Var = new nl0(28, this, zArr);
                        w3Var.f22754h0 = string3;
                        w3Var.f22755i0 = nl0Var;
                        w3Var.show();
                        for (int i23 = 0; i23 < 3; i23++) {
                            if (zArr2[i23] && (textView = (TextView) w3Var.d(-(i23 + 1))) != null) {
                                textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.f23284q7));
                            }
                        }
                        w3Var.setCanceledOnTouchOutside(true);
                        w3Var.setOnDismissListener(new cg.g(13, this, zArr));
                    } else {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                    }
                } else if (TextUtils.equals(lastError, "ERROR_PRIVACY")) {
                    y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                    org.telegram.ui.Components.y4.l0(this.f40092b, this.f40089a, user.f22527id);
                } else if (TextUtils.equals(lastError, "ERROR_AUDIO_IO")) {
                    y("Error initializing audio hardware");
                } else if (TextUtils.equals(lastError, "ERROR_LOCALIZED")) {
                    this.f40119q0.b();
                } else if (TextUtils.equals(lastError, "ERROR_CONNECTION_SERVICE")) {
                    y(LocaleController.getString(R.string.VoipErrorUnknown));
                } else {
                    AndroidUtilities.runOnUIThread(new vg1(this, 1), 1000L);
                }
            }
            if (this.f40113k0 != null) {
                return;
            }
            if (!this.f40110i0 || this.f40112j0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sharedInstance != null) {
                if (sharedInstance.getRemoteVideoState() == 2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                this.f40110i0 = z22;
                if (sharedInstance.getVideoState(false) != 2) {
                    z23 = true;
                    if (sharedInstance.getVideoState(false) == 1) {
                        z24 = false;
                    }
                    this.f40112j0 = z24;
                    if (z24 && !this.Q0) {
                        this.Q0 = z23;
                    }
                } else {
                    z23 = true;
                }
                z24 = true;
                this.f40112j0 = z24;
                if (z24) {
                    this.Q0 = z23;
                }
            }
            if (z27) {
                this.U.b();
                this.V.b();
            }
            if (this.f40110i0) {
                if (this.A0) {
                    f14 = 1.0f;
                } else {
                    f14 = 1.0f;
                    this.v.setAlpha(1.0f);
                }
                if (z27) {
                    this.Y.animate().alpha(f14).setDuration(250L).start();
                } else {
                    this.Y.animate().cancel();
                    this.Y.setAlpha(f14);
                }
                if (!this.Y.d.isFirstFrameRendered() || this.E0) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    this.f40110i0 = false;
                }
            } else {
                i10 = 0;
            }
            if (!this.f40112j0 || this.f40110i0) {
                this.v.setVisibility(4);
            } else {
                this.v.setVisibility(i10);
                if (z27) {
                    this.Y.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    this.Y.animate().cancel();
                    this.Y.setAlpha(0.0f);
                }
            }
            z12 = this.f40112j0;
            if (z12 || !this.f40110i0) {
                this.D0 = false;
            }
            if (z12 || !this.D0 || AndroidUtilities.isInPictureInPictureMode(this.f40092b)) {
                z13 = false;
            } else {
                z13 = true;
            }
            x(z27, z11);
            if (this.f40131y.getTag() == null) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
            }
            if (!z27) {
                if (z26 && this.f40090a0.getTag() == null) {
                    this.f40090a0.animate().setListener(null).cancel();
                    if (this.f40090a0.getVisibility() == 8) {
                        this.f40090a0.setVisibility(0);
                        this.f40090a0.setAlpha(0.0f);
                    }
                    this.f40090a0.animate().alpha(1.0f);
                }
                if (z26 && this.f40090a0.getTag() != null) {
                    this.f40090a0.animate().setListener(null).cancel();
                    i11 = 8;
                    this.f40090a0.animate().setListener(new zg1(this, i11)).alpha(0.0f);
                }
                this.f40090a0.setEnabled(z26);
                org.telegram.ui.Components.voip.e eVar = this.f40090a0;
                if (z26) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                eVar.setTag(num2);
                this.f40119q0.setLockOnScreen(this.F0);
                if (this.f40114l0 == 3 || !(this.f40112j0 || this.f40110i0)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f40126v0 = z14;
                if (!z14 && !this.f40124t0) {
                    A(true);
                }
                if (this.f40124t0 && this.f40126v0 && !this.N0 && sharedInstance != null) {
                    AndroidUtilities.runOnUIThread(this.O0, 3000L);
                    this.N0 = true;
                }
                i12 = this.f40114l0;
                if (i12 == 11 && this.f40124t0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z26 || i12 == 16 || i12 == 11 || i12 == 12 || i12 == 14 || i12 == 6 || !this.f40124t0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (z27) {
                    if (z15) {
                        this.D.animate().alpha(1.0f).start();
                    } else {
                        if (this.D.getVisibility() != 0) {
                            this.D.setVisibility(0);
                            f12 = 0.0f;
                            this.D.setAlpha(0.0f);
                        } else {
                            f12 = 0.0f;
                        }
                        this.D.animate().alpha(f12).start();
                    }
                    if (z16) {
                        this.E.animate().alpha(1.0f).start();
                    } else {
                        if (this.E.getVisibility() != 0) {
                            this.E.setVisibility(0);
                            f13 = 0.0f;
                            this.E.setAlpha(0.0f);
                        } else {
                            f13 = 0.0f;
                        }
                        this.E.animate().alpha(f13).start();
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = this.I0.animate();
                    int i24 = -AndroidUtilities.dp(16.0f);
                    if (this.f40124t0) {
                        iDp3 = AndroidUtilities.dp(80.0f);
                    } else {
                        iDp3 = 0;
                    }
                    viewPropertyAnimatorAnimate.translationY(i24 - iDp3).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                } else {
                    ImageView imageView = this.D;
                    if (z15) {
                        i11 = 0;
                    }
                    imageView.setVisibility(i11);
                    ImageView imageView2 = this.D;
                    if (z15) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView2.setAlpha(f10);
                    ImageView imageView3 = this.E;
                    if (z16) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    imageView3.setVisibility(i13);
                    ImageView imageView4 = this.E;
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    imageView4.setAlpha(f11);
                    org.telegram.ui.Components.voip.g2 g2Var3 = this.I0;
                    int i25 = -AndroidUtilities.dp(16.0f);
                    if (this.f40124t0) {
                        iDp2 = AndroidUtilities.dp(80.0f);
                    } else {
                        iDp2 = 0;
                    }
                    g2Var3.setTranslationY(i25 - iDp2);
                }
                i14 = this.f40114l0;
                if (i14 != 10 && i14 != 11) {
                    D(z27);
                }
                if (i19 != 0) {
                    this.B.e(z27);
                }
                this.B.d(z10, z27);
                if (this.f40131y.getVisibility() == 0 && this.f40132y0) {
                    iDp += AndroidUtilities.dp(24.0f);
                    layout = this.P.getLayout();
                    if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                        iDp = i0.a.e(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
                    }
                }
                if (this.f40114l0 == 11 && !this.f40112j0 && !this.f40110i0) {
                    iDp -= AndroidUtilities.dp(24.0f);
                }
                if (this.f40112j0 || this.f40110i0) {
                    iDp -= AndroidUtilities.dp(60.0f);
                }
                if (z27) {
                    if (this.f40132y0 || !(this.f40112j0 || this.f40110i0)) {
                        j10 = 250;
                        this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                    } else {
                        this.T.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                        j10 = 250;
                    }
                    if (iDp != this.f40121r0) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.T.animate();
                        if (this.f40114l0 != 11) {
                            j10 = 0;
                        }
                        viewPropertyAnimatorAnimate2.setStartDelay(j10).translationY(iDp).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                    }
                } else {
                    this.T.setTranslationY(iDp);
                }
                this.f40121r0 = iDp;
                if (sharedInstance == null && sharedInstance.isScreencast()) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i15 = this.f40114l0;
                if (i15 != 11 || i15 == 17 || ((!this.f40112j0 || z17) && !this.f40110i0)) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                this.f40133z0 = z18;
                if (sharedInstance != null) {
                    if (this.f40112j0) {
                        sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                    }
                    this.Z.setIsScreencast(sharedInstance.isScreencast());
                    this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
                    if (this.f40112j0 || sharedInstance.isScreencast()) {
                        videoSink = null;
                    } else {
                        videoSink = this.Z.d;
                    }
                    if (!this.f40111i1 && (r2Var = this.f40107g1) != null) {
                        videoSink2 = r2Var.d;
                    } else if (z13) {
                        videoSink2 = this.X;
                    } else {
                        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
                        videoSink2 = r2Var.d;
                    }
                    sharedInstance.setSinks(videoSink, videoSink2);
                    if (z27) {
                        g2Var2 = this.I0;
                        g2Var2.f33582f = false;
                        if (!g2Var2.f33581e && g2Var2.getParent() != null) {
                            TransitionManager.beginDelayedTransition(g2Var2, g2Var2.d);
                        }
                    }
                    if (sharedInstance.isMicMute()) {
                        this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                    } else {
                        this.I0.c("self-muted");
                    }
                    if ((!this.f40112j0 || this.f40110i0) && (((i17 = this.f40114l0) == 3 || i17 == 5) && sharedInstance.getCallDuration() > 500)) {
                        if (sharedInstance.getRemoteAudioState() == 0) {
                            org.telegram.ui.Components.voip.g2 g2Var4 = this.I0;
                            g2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var4.b(UserObject.getFirstName(user))), "muted");
                        } else {
                            this.I0.c("muted");
                        }
                        if (sharedInstance.getRemoteVideoState() == 0) {
                            org.telegram.ui.Components.voip.g2 g2Var5 = this.I0;
                            g2Var5.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var5.b(UserObject.getFirstName(user))), "video");
                        } else {
                            this.I0.c("video");
                        }
                    } else {
                        if (sharedInstance.getRemoteAudioState() == 0) {
                            org.telegram.ui.Components.voip.g2 g2Var6 = this.I0;
                            g2Var6.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var6.b(UserObject.getFirstName(user))), "muted");
                        } else {
                            this.I0.c("muted");
                        }
                        this.I0.c("video");
                    }
                    if (this.I0.getChildCount() != 0 && this.f40110i0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                        VoIPService.SharedUIParams sharedUIParams = sharedInstance.sharedUIParams;
                        if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                            sharedUIParams.tapToVideoTooltipWasShowed = true;
                            this.J0.setTranslationY(-((this.f40122s.getMeasuredHeight() - this.f40104f0.getY()) + AndroidUtilities.dp(6.0f)));
                            this.J0.n(0.0f, this.f40103f.getX() + this.f40104f0.getX() + AndroidUtilities.dp(14.0f));
                            this.J0.v();
                        } else if (this.I0.getChildCount() != 0) {
                            z21 = true;
                            this.J0.e(true);
                        }
                        z21 = true;
                    } else if (this.I0.getChildCount() != 0) {
                        z21 = true;
                        this.J0.e(true);
                    } else {
                        z21 = true;
                    }
                    if (z27) {
                        g2Var = this.I0;
                        if (g2Var.f33582f) {
                            g2Var.f33581e = z21;
                            AndroidUtilities.runOnUIThread(new nh.f0(g2Var, 15), 700L);
                        }
                        g2Var.f33582f = false;
                    }
                }
                childsHight = this.I0.getChildsHight();
                s1Var = this.V;
                if (s1Var.getParent() == null && z27) {
                    s1Var.P = childsHight;
                } else {
                    s1Var.P = childsHight;
                }
                s1Var2 = this.U;
                if (s1Var2.getParent() == null && z27) {
                    s1Var2.P = childsHight;
                } else {
                    s1Var2.P = childsHight;
                }
                this.U.setUiVisible(this.f40124t0);
                this.V.setUiVisible(this.f40124t0);
                if (this.f40112j0) {
                    z19 = true;
                    z(0, z27);
                } else if (this.f40110i0 || this.D0) {
                    z19 = true;
                    z(1, z27);
                } else {
                    z(2, z27);
                    z19 = true;
                }
                if (!z13 && this.V.getTag() == null) {
                    this.V.setIsActive(z19);
                    if (this.V.getVisibility() != 0) {
                        this.V.setVisibility(0);
                        this.V.setAlpha(0.0f);
                        this.V.setScaleX(0.5f);
                        this.V.setScaleY(0.5f);
                    }
                    this.V.animate().setListener(null).cancel();
                    org.telegram.ui.Components.voip.s1 s1Var3 = this.V;
                    s1Var3.V = true;
                    s1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).setStartDelay(150L).withEndAction(new vg1(this, 4)).start();
                    this.V.setTag(num);
                } else if (!z13 && this.V.getTag() != null) {
                    this.V.setIsActive(false);
                    this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                    this.V.setTag(null);
                }
                this.U.a();
                this.V.a();
                F();
                if (this.f40114l0 == 3) {
                    this.f40127w.a();
                    this.f40131y.a();
                    i16 = this.v.R;
                    if (i16 == 2 && i16 != 3) {
                        int[] iArr2 = new int[2];
                        this.f40131y.getLocationOnScreen(iArr2);
                        this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.m0 != -1);
                    }
                }
                if (!this.f40112j0 || this.f40110i0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                this.f40129x.setState(z20);
                this.f40127w.setState(z20);
                this.f40120r.e(z20);
                if (this.f40110i0 && !z11 && this.f40093b0) {
                    this.f40093b0 = false;
                    if (sharedInstance != null) {
                        sharedInstance.playStartRecordSound();
                    }
                }
                if (z20) {
                    if (this.f40101e0.getVisibility() != 0) {
                        this.f40101e0.setVisibility(0);
                        this.f40098d0.setVisibility(0);
                    }
                } else if (this.f40101e0.getVisibility() != 4) {
                    this.f40101e0.setVisibility(4);
                    this.f40098d0.setVisibility(4);
                }
                vg1Var = this.P0;
                AndroidUtilities.cancelRunOnUIThread(vg1Var);
                if (this.f40114l0 == 3) {
                    AndroidUtilities.runOnUIThread(vg1Var, 10000L);
                }
            }
            org.telegram.ui.Components.voip.e eVar2 = this.f40090a0;
            if (z26) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            eVar2.setVisibility(i18);
            i11 = 8;
            this.f40090a0.setEnabled(z26);
            org.telegram.ui.Components.voip.e eVar3 = this.f40090a0;
            if (z26) {
                num2 = num;
            } else {
                num2 = null;
            }
            eVar3.setTag(num2);
            this.f40119q0.setLockOnScreen(this.F0);
            if (this.f40114l0 == 3) {
                z14 = false;
            } else {
                z14 = false;
            }
            this.f40126v0 = z14;
            if (!z14) {
                A(true);
            }
            if (this.f40124t0) {
                AndroidUtilities.runOnUIThread(this.O0, 3000L);
                this.N0 = true;
            }
            i12 = this.f40114l0;
            if (i12 == 11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z26) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z27) {
                if (z15) {
                    this.D.animate().alpha(1.0f).start();
                } else {
                    if (this.D.getVisibility() != 0) {
                        this.D.setVisibility(0);
                        f12 = 0.0f;
                        this.D.setAlpha(0.0f);
                    } else {
                        f12 = 0.0f;
                    }
                    this.D.animate().alpha(f12).start();
                }
                if (z16) {
                    this.E.animate().alpha(1.0f).start();
                } else {
                    if (this.E.getVisibility() != 0) {
                        this.E.setVisibility(0);
                        f13 = 0.0f;
                        this.E.setAlpha(0.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    this.E.animate().alpha(f13).start();
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = this.I0.animate();
                int i26 = -AndroidUtilities.dp(16.0f);
                if (this.f40124t0) {
                    iDp3 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp3 = 0;
                }
                viewPropertyAnimatorAnimate3.translationY(i26 - iDp3).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            } else {
                ImageView imageView5 = this.D;
                if (z15) {
                    i11 = 0;
                }
                imageView5.setVisibility(i11);
                ImageView imageView6 = this.D;
                if (z15) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView6.setAlpha(f10);
                ImageView imageView7 = this.E;
                if (z16) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView7.setVisibility(i13);
                ImageView imageView8 = this.E;
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView8.setAlpha(f11);
                org.telegram.ui.Components.voip.g2 g2Var7 = this.I0;
                int i27 = -AndroidUtilities.dp(16.0f);
                if (this.f40124t0) {
                    iDp2 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp2 = 0;
                }
                g2Var7.setTranslationY(i27 - iDp2);
            }
            i14 = this.f40114l0;
            if (i14 != 10) {
                D(z27);
            }
            if (i19 != 0) {
                this.B.e(z27);
            }
            this.B.d(z10, z27);
            if (this.f40131y.getVisibility() == 0) {
                iDp += AndroidUtilities.dp(24.0f);
                layout = this.P.getLayout();
                if (layout != null) {
                    iDp = i0.a.e(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
                }
            }
            if (this.f40114l0 == 11) {
                iDp -= AndroidUtilities.dp(24.0f);
            }
            if (this.f40112j0) {
                iDp -= AndroidUtilities.dp(60.0f);
            } else {
                iDp -= AndroidUtilities.dp(60.0f);
            }
            if (z27) {
                if (this.f40132y0) {
                    j10 = 250;
                    this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                } else {
                    j10 = 250;
                    this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
                if (iDp != this.f40121r0) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate4 = this.T.animate();
                    if (this.f40114l0 != 11) {
                        j10 = 0;
                    }
                    viewPropertyAnimatorAnimate4.setStartDelay(j10).translationY(iDp).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
            } else {
                this.T.setTranslationY(iDp);
            }
            this.f40121r0 = iDp;
            if (sharedInstance == null) {
                z17 = false;
            } else {
                z17 = false;
            }
            i15 = this.f40114l0;
            if (i15 != 11) {
                z18 = false;
            } else {
                z18 = false;
            }
            this.f40133z0 = z18;
            if (sharedInstance != null) {
                if (this.f40112j0) {
                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                }
                this.Z.setIsScreencast(sharedInstance.isScreencast());
                this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
                if (this.f40112j0) {
                    videoSink = null;
                } else {
                    videoSink = null;
                }
                if (!this.f40111i1) {
                    if (z13) {
                        videoSink2 = this.X;
                    } else {
                        org.telegram.ui.Components.voip.r2 r2Var2 = this.Y;
                        videoSink2 = r2Var2.d;
                    }
                } else if (z13) {
                    videoSink2 = this.X;
                } else {
                    org.telegram.ui.Components.voip.r2 r2Var3 = this.Y;
                    videoSink2 = r2Var3.d;
                }
                sharedInstance.setSinks(videoSink, videoSink2);
                if (z27) {
                    g2Var2 = this.I0;
                    g2Var2.f33582f = false;
                    if (!g2Var2.f33581e) {
                        TransitionManager.beginDelayedTransition(g2Var2, g2Var2.d);
                    }
                }
                if (sharedInstance.isMicMute()) {
                    this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                } else {
                    this.I0.c("self-muted");
                }
                if (this.f40112j0) {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var8 = this.I0;
                        g2Var8.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var8.b(UserObject.getFirstName(user))), "muted");
                    } else {
                        this.I0.c("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var9 = this.I0;
                        g2Var9.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var9.b(UserObject.getFirstName(user))), "video");
                    } else {
                        this.I0.c("video");
                    }
                } else {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var10 = this.I0;
                        g2Var10.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var10.b(UserObject.getFirstName(user))), "muted");
                    } else {
                        this.I0.c("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var11 = this.I0;
                        g2Var11.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var11.b(UserObject.getFirstName(user))), "video");
                    } else {
                        this.I0.c("video");
                    }
                }
                if (this.I0.getChildCount() != 0) {
                    if (this.I0.getChildCount() != 0) {
                        z21 = true;
                        this.J0.e(true);
                    } else {
                        z21 = true;
                    }
                } else if (this.I0.getChildCount() != 0) {
                    z21 = true;
                    this.J0.e(true);
                } else {
                    z21 = true;
                }
                if (z27) {
                    g2Var = this.I0;
                    if (g2Var.f33582f) {
                        g2Var.f33581e = z21;
                        AndroidUtilities.runOnUIThread(new nh.f0(g2Var, 15), 700L);
                    }
                    g2Var.f33582f = false;
                }
            }
            childsHight = this.I0.getChildsHight();
            s1Var = this.V;
            if (s1Var.getParent() == null) {
                s1Var.P = childsHight;
            } else {
                s1Var.P = childsHight;
            }
            s1Var2 = this.U;
            if (s1Var2.getParent() == null) {
                s1Var2.P = childsHight;
            } else {
                s1Var2.P = childsHight;
            }
            this.U.setUiVisible(this.f40124t0);
            this.V.setUiVisible(this.f40124t0);
            if (this.f40112j0) {
                z19 = true;
                z(0, z27);
            } else if (this.f40110i0) {
                z19 = true;
                z(1, z27);
            } else {
                z19 = true;
                z(1, z27);
            }
            if (!z13) {
                if (!z13) {
                    this.V.setIsActive(false);
                    this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                    this.V.setTag(null);
                }
            } else if (!z13) {
                this.V.setIsActive(false);
                this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                this.V.setTag(null);
            }
            this.U.a();
            this.V.a();
            F();
            if (this.f40114l0 == 3) {
                this.f40127w.a();
                this.f40131y.a();
                i16 = this.v.R;
                if (i16 == 2) {
                }
            }
            if (this.f40112j0) {
                z20 = true;
            } else {
                z20 = true;
            }
            this.f40129x.setState(z20);
            this.f40127w.setState(z20);
            this.f40120r.e(z20);
            if (this.f40110i0) {
                this.f40093b0 = false;
                if (sharedInstance != null) {
                    sharedInstance.playStartRecordSound();
                }
            }
            if (z20) {
                if (this.f40101e0.getVisibility() != 4) {
                    this.f40101e0.setVisibility(4);
                    this.f40098d0.setVisibility(4);
                }
            } else if (this.f40101e0.getVisibility() != 0) {
                this.f40101e0.setVisibility(0);
                this.f40098d0.setVisibility(0);
            }
            vg1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(vg1Var);
            if (this.f40114l0 == 3) {
                AndroidUtilities.runOnUIThread(vg1Var, 10000L);
            }
        }
        num = 1;
        this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z27);
        z26 = false;
        z10 = false;
        i19 = 0;
        if (this.f40113k0 != null) {
            return;
        }
        if (this.f40110i0) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z22 = true;
            } else {
                z22 = false;
            }
            this.f40110i0 = z22;
            if (sharedInstance.getVideoState(false) != 2) {
                z23 = true;
                if (sharedInstance.getVideoState(false) == 1) {
                    z24 = false;
                }
                this.f40112j0 = z24;
                if (z24) {
                    this.Q0 = z23;
                }
            } else {
                z23 = true;
            }
            z24 = true;
            this.f40112j0 = z24;
            if (z24) {
                this.Q0 = z23;
            }
        }
        if (z27) {
            this.U.b();
            this.V.b();
        }
        if (this.f40110i0) {
            i10 = 0;
        } else {
            if (this.A0) {
                f14 = 1.0f;
                this.v.setAlpha(1.0f);
            } else {
                f14 = 1.0f;
            }
            if (z27) {
                this.Y.animate().alpha(f14).setDuration(250L).start();
            } else {
                this.Y.animate().cancel();
                this.Y.setAlpha(f14);
            }
            if (this.Y.d.isFirstFrameRendered()) {
                i10 = 0;
            } else {
                i10 = 0;
            }
        }
        if (this.f40112j0) {
            this.v.setVisibility(4);
        } else {
            this.v.setVisibility(4);
        }
        z12 = this.f40112j0;
        if (z12) {
            this.D0 = false;
        } else {
            this.D0 = false;
        }
        if (z12) {
            z13 = false;
        } else {
            z13 = false;
        }
        x(z27, z11);
        if (this.f40131y.getTag() == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
        }
        if (!z27) {
            if (z26) {
                this.f40090a0.animate().setListener(null).cancel();
                if (this.f40090a0.getVisibility() == 8) {
                    this.f40090a0.setVisibility(0);
                    this.f40090a0.setAlpha(0.0f);
                }
                this.f40090a0.animate().alpha(1.0f);
            }
            if (z26) {
            }
            this.f40090a0.setEnabled(z26);
            org.telegram.ui.Components.voip.e eVar4 = this.f40090a0;
            if (z26) {
                num2 = num;
            } else {
                num2 = null;
            }
            eVar4.setTag(num2);
            this.f40119q0.setLockOnScreen(this.F0);
            if (this.f40114l0 == 3) {
                z14 = false;
            } else {
                z14 = false;
            }
            this.f40126v0 = z14;
            if (!z14) {
                A(true);
            }
            if (this.f40124t0) {
                AndroidUtilities.runOnUIThread(this.O0, 3000L);
                this.N0 = true;
            }
            i12 = this.f40114l0;
            if (i12 == 11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z26) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z27) {
                if (z15) {
                    this.D.animate().alpha(1.0f).start();
                } else {
                    if (this.D.getVisibility() != 0) {
                        this.D.setVisibility(0);
                        f12 = 0.0f;
                        this.D.setAlpha(0.0f);
                    } else {
                        f12 = 0.0f;
                    }
                    this.D.animate().alpha(f12).start();
                }
                if (z16) {
                    this.E.animate().alpha(1.0f).start();
                } else {
                    if (this.E.getVisibility() != 0) {
                        this.E.setVisibility(0);
                        f13 = 0.0f;
                        this.E.setAlpha(0.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    this.E.animate().alpha(f13).start();
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate5 = this.I0.animate();
                int i28 = -AndroidUtilities.dp(16.0f);
                if (this.f40124t0) {
                    iDp3 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp3 = 0;
                }
                viewPropertyAnimatorAnimate5.translationY(i28 - iDp3).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            } else {
                ImageView imageView9 = this.D;
                if (z15) {
                    i11 = 0;
                }
                imageView9.setVisibility(i11);
                ImageView imageView10 = this.D;
                if (z15) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView10.setAlpha(f10);
                ImageView imageView11 = this.E;
                if (z16) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView11.setVisibility(i13);
                ImageView imageView12 = this.E;
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView12.setAlpha(f11);
                org.telegram.ui.Components.voip.g2 g2Var12 = this.I0;
                int i29 = -AndroidUtilities.dp(16.0f);
                if (this.f40124t0) {
                    iDp2 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp2 = 0;
                }
                g2Var12.setTranslationY(i29 - iDp2);
            }
            i14 = this.f40114l0;
            if (i14 != 10) {
                D(z27);
            }
            if (i19 != 0) {
                this.B.e(z27);
            }
            this.B.d(z10, z27);
            if (this.f40131y.getVisibility() == 0) {
                iDp += AndroidUtilities.dp(24.0f);
                layout = this.P.getLayout();
                if (layout != null) {
                    iDp = i0.a.e(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
                }
            }
            if (this.f40114l0 == 11) {
                iDp -= AndroidUtilities.dp(24.0f);
            }
            if (this.f40112j0) {
                iDp -= AndroidUtilities.dp(60.0f);
            } else {
                iDp -= AndroidUtilities.dp(60.0f);
            }
            if (z27) {
                if (this.f40132y0) {
                    j10 = 250;
                    this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                } else {
                    j10 = 250;
                    this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
                if (iDp != this.f40121r0) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate6 = this.T.animate();
                    if (this.f40114l0 != 11) {
                        j10 = 0;
                    }
                    viewPropertyAnimatorAnimate6.setStartDelay(j10).translationY(iDp).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
            } else {
                this.T.setTranslationY(iDp);
            }
            this.f40121r0 = iDp;
            if (sharedInstance == null) {
                z17 = false;
            } else {
                z17 = false;
            }
            i15 = this.f40114l0;
            if (i15 != 11) {
                z18 = false;
            } else {
                z18 = false;
            }
            this.f40133z0 = z18;
            if (sharedInstance != null) {
                if (this.f40112j0) {
                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                }
                this.Z.setIsScreencast(sharedInstance.isScreencast());
                this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
                if (this.f40112j0) {
                    videoSink = null;
                } else {
                    videoSink = null;
                }
                if (!this.f40111i1) {
                    if (z13) {
                        videoSink2 = this.X;
                    } else {
                        org.telegram.ui.Components.voip.r2 r2Var4 = this.Y;
                        videoSink2 = r2Var4.d;
                    }
                } else if (z13) {
                    videoSink2 = this.X;
                } else {
                    org.telegram.ui.Components.voip.r2 r2Var5 = this.Y;
                    videoSink2 = r2Var5.d;
                }
                sharedInstance.setSinks(videoSink, videoSink2);
                if (z27) {
                    g2Var2 = this.I0;
                    g2Var2.f33582f = false;
                    if (!g2Var2.f33581e) {
                        TransitionManager.beginDelayedTransition(g2Var2, g2Var2.d);
                    }
                }
                if (sharedInstance.isMicMute()) {
                    this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                } else {
                    this.I0.c("self-muted");
                }
                if (this.f40112j0) {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var13 = this.I0;
                        g2Var13.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var13.b(UserObject.getFirstName(user))), "muted");
                    } else {
                        this.I0.c("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var14 = this.I0;
                        g2Var14.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var14.b(UserObject.getFirstName(user))), "video");
                    } else {
                        this.I0.c("video");
                    }
                } else {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var15 = this.I0;
                        g2Var15.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var15.b(UserObject.getFirstName(user))), "muted");
                    } else {
                        this.I0.c("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        org.telegram.ui.Components.voip.g2 g2Var16 = this.I0;
                        g2Var16.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var16.b(UserObject.getFirstName(user))), "video");
                    } else {
                        this.I0.c("video");
                    }
                }
                if (this.I0.getChildCount() != 0) {
                    if (this.I0.getChildCount() != 0) {
                        z21 = true;
                        this.J0.e(true);
                    } else {
                        z21 = true;
                    }
                } else if (this.I0.getChildCount() != 0) {
                    z21 = true;
                    this.J0.e(true);
                } else {
                    z21 = true;
                }
                if (z27) {
                    g2Var = this.I0;
                    if (g2Var.f33582f) {
                        g2Var.f33581e = z21;
                        AndroidUtilities.runOnUIThread(new nh.f0(g2Var, 15), 700L);
                    }
                    g2Var.f33582f = false;
                }
            }
            childsHight = this.I0.getChildsHight();
            s1Var = this.V;
            if (s1Var.getParent() == null) {
                s1Var.P = childsHight;
            } else {
                s1Var.P = childsHight;
            }
            s1Var2 = this.U;
            if (s1Var2.getParent() == null) {
                s1Var2.P = childsHight;
            } else {
                s1Var2.P = childsHight;
            }
            this.U.setUiVisible(this.f40124t0);
            this.V.setUiVisible(this.f40124t0);
            if (this.f40112j0) {
                z19 = true;
                z(0, z27);
            } else if (this.f40110i0) {
                z19 = true;
                z(1, z27);
            } else {
                z19 = true;
                z(1, z27);
            }
            if (!z13) {
                if (!z13) {
                    this.V.setIsActive(false);
                    this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                    this.V.setTag(null);
                }
            } else if (!z13) {
                this.V.setIsActive(false);
                this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                this.V.setTag(null);
            }
            this.U.a();
            this.V.a();
            F();
            if (this.f40114l0 == 3) {
                this.f40127w.a();
                this.f40131y.a();
                i16 = this.v.R;
                if (i16 == 2) {
                }
            }
            if (this.f40112j0) {
                z20 = true;
            } else {
                z20 = true;
            }
            this.f40129x.setState(z20);
            this.f40127w.setState(z20);
            this.f40120r.e(z20);
            if (this.f40110i0) {
                this.f40093b0 = false;
                if (sharedInstance != null) {
                    sharedInstance.playStartRecordSound();
                }
            }
            if (z20) {
                if (this.f40101e0.getVisibility() != 4) {
                    this.f40101e0.setVisibility(4);
                    this.f40098d0.setVisibility(4);
                }
            } else if (this.f40101e0.getVisibility() != 0) {
                this.f40101e0.setVisibility(0);
                this.f40098d0.setVisibility(0);
            }
            vg1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(vg1Var);
            if (this.f40114l0 == 3) {
                AndroidUtilities.runOnUIThread(vg1Var, 10000L);
            }
        }
        org.telegram.ui.Components.voip.e eVar5 = this.f40090a0;
        if (z26) {
            i18 = 0;
        } else {
            i18 = 8;
        }
        eVar5.setVisibility(i18);
        i11 = 8;
        this.f40090a0.setEnabled(z26);
        org.telegram.ui.Components.voip.e eVar6 = this.f40090a0;
        if (z26) {
            num2 = num;
        } else {
            num2 = null;
        }
        eVar6.setTag(num2);
        this.f40119q0.setLockOnScreen(this.F0);
        if (this.f40114l0 == 3) {
            z14 = false;
        } else {
            z14 = false;
        }
        this.f40126v0 = z14;
        if (!z14) {
            A(true);
        }
        if (this.f40124t0) {
            AndroidUtilities.runOnUIThread(this.O0, 3000L);
            this.N0 = true;
        }
        i12 = this.f40114l0;
        if (i12 == 11) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z26) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z27) {
            if (z15) {
                this.D.animate().alpha(1.0f).start();
            } else {
                if (this.D.getVisibility() != 0) {
                    this.D.setVisibility(0);
                    f12 = 0.0f;
                    this.D.setAlpha(0.0f);
                } else {
                    f12 = 0.0f;
                }
                this.D.animate().alpha(f12).start();
            }
            if (z16) {
                this.E.animate().alpha(1.0f).start();
            } else {
                if (this.E.getVisibility() != 0) {
                    this.E.setVisibility(0);
                    f13 = 0.0f;
                    this.E.setAlpha(0.0f);
                } else {
                    f13 = 0.0f;
                }
                this.E.animate().alpha(f13).start();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate7 = this.I0.animate();
            int i210 = -AndroidUtilities.dp(16.0f);
            if (this.f40124t0) {
                iDp3 = AndroidUtilities.dp(80.0f);
            } else {
                iDp3 = 0;
            }
            viewPropertyAnimatorAnimate7.translationY(i210 - iDp3).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
        } else {
            ImageView imageView13 = this.D;
            if (z15) {
                i11 = 0;
            }
            imageView13.setVisibility(i11);
            ImageView imageView14 = this.D;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            imageView14.setAlpha(f10);
            ImageView imageView15 = this.E;
            if (z16) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            imageView15.setVisibility(i13);
            ImageView imageView16 = this.E;
            if (z16) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            imageView16.setAlpha(f11);
            org.telegram.ui.Components.voip.g2 g2Var17 = this.I0;
            int i211 = -AndroidUtilities.dp(16.0f);
            if (this.f40124t0) {
                iDp2 = AndroidUtilities.dp(80.0f);
            } else {
                iDp2 = 0;
            }
            g2Var17.setTranslationY(i211 - iDp2);
        }
        i14 = this.f40114l0;
        if (i14 != 10) {
            D(z27);
        }
        if (i19 != 0) {
            this.B.e(z27);
        }
        this.B.d(z10, z27);
        if (this.f40131y.getVisibility() == 0) {
            iDp += AndroidUtilities.dp(24.0f);
            layout = this.P.getLayout();
            if (layout != null) {
                iDp = i0.a.e(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
            }
        }
        if (this.f40114l0 == 11) {
            iDp -= AndroidUtilities.dp(24.0f);
        }
        if (this.f40112j0) {
            iDp -= AndroidUtilities.dp(60.0f);
        } else {
            iDp -= AndroidUtilities.dp(60.0f);
        }
        if (z27) {
            if (this.f40132y0) {
                j10 = 250;
                this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            } else {
                j10 = 250;
                this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            }
            if (iDp != this.f40121r0) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate8 = this.T.animate();
                if (this.f40114l0 != 11) {
                    j10 = 0;
                }
                viewPropertyAnimatorAnimate8.setStartDelay(j10).translationY(iDp).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            }
        } else {
            this.T.setTranslationY(iDp);
        }
        this.f40121r0 = iDp;
        if (sharedInstance == null) {
            z17 = false;
        } else {
            z17 = false;
        }
        i15 = this.f40114l0;
        if (i15 != 11) {
            z18 = false;
        } else {
            z18 = false;
        }
        this.f40133z0 = z18;
        if (sharedInstance != null) {
            if (this.f40112j0) {
                sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
            }
            this.Z.setIsScreencast(sharedInstance.isScreencast());
            this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
            if (this.f40112j0) {
                videoSink = null;
            } else {
                videoSink = null;
            }
            if (!this.f40111i1) {
                if (z13) {
                    videoSink2 = this.X;
                } else {
                    org.telegram.ui.Components.voip.r2 r2Var6 = this.Y;
                    videoSink2 = r2Var6.d;
                }
            } else if (z13) {
                videoSink2 = this.X;
            } else {
                org.telegram.ui.Components.voip.r2 r2Var7 = this.Y;
                videoSink2 = r2Var7.d;
            }
            sharedInstance.setSinks(videoSink, videoSink2);
            if (z27) {
                g2Var2 = this.I0;
                g2Var2.f33582f = false;
                if (!g2Var2.f33581e) {
                    TransitionManager.beginDelayedTransition(g2Var2, g2Var2.d);
                }
            }
            if (sharedInstance.isMicMute()) {
                this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
            } else {
                this.I0.c("self-muted");
            }
            if (this.f40112j0) {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    org.telegram.ui.Components.voip.g2 g2Var18 = this.I0;
                    g2Var18.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var18.b(UserObject.getFirstName(user))), "muted");
                } else {
                    this.I0.c("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    org.telegram.ui.Components.voip.g2 g2Var19 = this.I0;
                    g2Var19.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var19.b(UserObject.getFirstName(user))), "video");
                } else {
                    this.I0.c("video");
                }
            } else {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    org.telegram.ui.Components.voip.g2 g2Var110 = this.I0;
                    g2Var110.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var110.b(UserObject.getFirstName(user))), "muted");
                } else {
                    this.I0.c("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    org.telegram.ui.Components.voip.g2 g2Var111 = this.I0;
                    g2Var111.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var111.b(UserObject.getFirstName(user))), "video");
                } else {
                    this.I0.c("video");
                }
            }
            if (this.I0.getChildCount() != 0) {
                if (this.I0.getChildCount() != 0) {
                    z21 = true;
                    this.J0.e(true);
                } else {
                    z21 = true;
                }
            } else if (this.I0.getChildCount() != 0) {
                z21 = true;
                this.J0.e(true);
            } else {
                z21 = true;
            }
            if (z27) {
                g2Var = this.I0;
                if (g2Var.f33582f) {
                    g2Var.f33581e = z21;
                    AndroidUtilities.runOnUIThread(new nh.f0(g2Var, 15), 700L);
                }
                g2Var.f33582f = false;
            }
        }
        childsHight = this.I0.getChildsHight();
        s1Var = this.V;
        if (s1Var.getParent() == null) {
            s1Var.P = childsHight;
        } else {
            s1Var.P = childsHight;
        }
        s1Var2 = this.U;
        if (s1Var2.getParent() == null) {
            s1Var2.P = childsHight;
        } else {
            s1Var2.P = childsHight;
        }
        this.U.setUiVisible(this.f40124t0);
        this.V.setUiVisible(this.f40124t0);
        if (this.f40112j0) {
            z19 = true;
            z(0, z27);
        } else if (this.f40110i0) {
            z19 = true;
            z(1, z27);
        } else {
            z19 = true;
            z(1, z27);
        }
        if (!z13) {
            if (!z13) {
                this.V.setIsActive(false);
                this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                this.V.setTag(null);
            }
        } else if (!z13) {
            this.V.setIsActive(false);
            this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zg1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            this.V.setTag(null);
        }
        this.U.a();
        this.V.a();
        F();
        if (this.f40114l0 == 3) {
            this.f40127w.a();
            this.f40131y.a();
            i16 = this.v.R;
            if (i16 == 2) {
            }
        }
        if (this.f40112j0) {
            z20 = true;
        } else {
            z20 = true;
        }
        this.f40129x.setState(z20);
        this.f40127w.setState(z20);
        this.f40120r.e(z20);
        if (this.f40110i0) {
            this.f40093b0 = false;
            if (sharedInstance != null) {
                sharedInstance.playStartRecordSound();
            }
        }
        if (z20) {
            if (this.f40101e0.getVisibility() != 4) {
                this.f40101e0.setVisibility(4);
                this.f40098d0.setVisibility(4);
            }
        } else if (this.f40101e0.getVisibility() != 0) {
            this.f40101e0.setVisibility(0);
            this.f40098d0.setVisibility(0);
        }
        vg1Var = this.P0;
        AndroidUtilities.cancelRunOnUIThread(vg1Var);
        if (this.f40114l0 == 3) {
            AndroidUtilities.runOnUIThread(vg1Var, 10000L);
        }
    }

    @Override
    public final Bitmap a() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f40107g1;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.f40107g1.d.getBitmap();
    }

    @Override
    public final void b(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.Y.d.getBitmap();
    }

    @Override
    public final void d(bf.e eVar) {
        this.f40109h1 = eVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.f40111i1 = true;
        H();
        ((WindowManager) this.f40092b.getSystemService("window")).removeView(this.f40119q0);
        this.f40119q0.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.f40114l0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.Z.d.release();
            this.Y.d.release();
            this.X.release();
            o();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
            return;
        }
        if (i10 == NotificationCenter.closeInCallActivity) {
            this.f40119q0.b();
            return;
        }
        if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f40131y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == NotificationCenter.nearEarEvent) {
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f40093b0 = zBooleanValue;
            if (zBooleanValue) {
                this.f40131y.b(true, true);
            }
        }
    }

    @Override
    public final void f(bf.e eVar) {
        this.f40109h1 = eVar;
        WindowManager windowManager = (WindowManager) this.f40092b.getSystemService("window");
        dh1 dh1Var = this.f40119q0;
        dh1Var.getClass();
        windowManager.addView(dh1Var, org.telegram.ui.Components.voip.v2.a());
        this.f40111i1 = false;
        H();
        this.f40119q0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.f40107g1;
        if (r2Var != null) {
            r2Var.d.release();
            this.f40107g1 = null;
        }
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.f40092b, false, true, false, false);
        this.f40107g1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f40107g1.d.setEnableHardwareScaler(true);
        this.f40107g1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f40107g1;
        r2Var2.T = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new fh1(this));
        View view = this.f40107g1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f40107g1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f10;
        final boolean z11;
        final float f11;
        float measuredWidth;
        float measuredWidth2;
        this.U.animate().cancel();
        float f12 = org.telegram.ui.Components.voip.l2.k().d.x + org.telegram.ui.Components.voip.l2.k().f33712y;
        float f13 = org.telegram.ui.Components.voip.l2.k().d.y + org.telegram.ui.Components.voip.l2.k().A;
        final float x8 = this.U.getX();
        final float y10 = this.U.getY();
        final float scaleX = this.U.getScaleX();
        org.telegram.ui.Components.voip.l2.Q.getClass();
        final float measuredWidth3 = f12 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f13 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f14 = 1.0f;
        if (this.f40110i0) {
            int measuredWidth4 = this.U.getMeasuredWidth();
            if (!this.f40112j0 || measuredWidth4 == 0) {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                measuredWidth = 1.0f;
                measuredWidth2 = 0.0f;
            } else {
                measuredWidth2 = (this.f40119q0.getMeasuredWidth() / measuredWidth4) * 0.25f * 0.4f;
                c10 = 0;
                measuredWidth = (((org.telegram.ui.Components.voip.l2.k().f33706f * 0.25f) + (f12 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * measuredWidth2)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().f33706f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.l2.k().h * 0.25f) + (f13 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * measuredWidth2)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f15 = measuredWidth2;
            f10 = measuredWidth;
            f11 = f15;
        } else {
            c10 = 0;
            float measuredWidth5 = f12 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f13 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = measuredWidth5;
            z11 = true;
            f11 = 0.25f;
        }
        final float f16 = measuredHeight;
        float fDp = this.f40110i0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.f40110i0) {
            org.telegram.ui.Components.voip.l2.Q.getClass();
            f14 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.U.setScaleX(f11);
                this.U.setScaleY(f11);
                this.U.setTranslationX(f10);
                this.U.setTranslationY(f16);
                this.U.setCornerRadius(fDp2);
                this.U.setAlpha(f14);
            }
            this.Y.setScaleX(0.25f);
            this.Y.setScaleY(0.25f);
            this.Y.setTranslationX(measuredWidth3);
            this.Y.setTranslationY(measuredHeight2);
            this.Y.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f17 = z10 ? 1.0f : 0.0f;
        float f18 = z10 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c10] = f17;
        fArr[1] = f18;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        this.B0 = z10 ? 0.0f : 1.0f;
        G();
        final float f19 = fDp;
        final float f20 = 0.25f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f21 = 1.0f - fFloatValue;
                lh1 lh1Var = this.f44819a;
                lh1Var.B0 = f21;
                lh1Var.G();
                if (z11) {
                    float f22 = (f11 * fFloatValue) + (scaleX * f21);
                    lh1Var.U.setScaleX(f22);
                    lh1Var.U.setScaleY(f22);
                    lh1Var.U.setTranslationX((f10 * fFloatValue) + (x8 * f21));
                    lh1Var.U.setTranslationY((f16 * fFloatValue) + (y10 * f21));
                    lh1Var.U.setCornerRadius((fDp2 * fFloatValue) + (f19 * f21));
                    lh1Var.U.setAlpha((f14 * fFloatValue) + (1.0f * f21));
                }
                float f23 = (f20 * fFloatValue) + (1.0f * f21);
                lh1Var.Y.setScaleX(f23);
                lh1Var.Y.setScaleY(f23);
                float f24 = 0.0f * f21;
                float f25 = (measuredWidth3 * fFloatValue) + f24;
                float f26 = (measuredHeight2 * fFloatValue) + f24;
                lh1Var.Y.setTranslationX(f25);
                lh1Var.Y.setTranslationY(f26);
                lh1Var.Y.setRoundCorners(((AndroidUtilities.dp(4.0f) * fFloatValue) * 1.0f) / f23);
                if (!lh1Var.U.L) {
                    lh1Var.Z.d(fFloatValue, false);
                }
                lh1Var.f40119q0.invalidate();
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f40089a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        ye.d dVar = this.f40096c0;
        if (dVar != null) {
            dVar.c();
            this.f40096c0 = null;
        }
        cg.y2 y2Var = this.I;
        if (y2Var != null) {
            y2Var.dismiss();
            this.I = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator valueAnimatorOfFloat;
        if (this.f40130x0 && this.f40132y0 != z10 && this.f40124t0) {
            this.f40132y0 = z10;
            org.telegram.ui.Components.voip.y2 y2Var = this.f40127w;
            int i10 = 1;
            if (y2Var.G && z10 != y2Var.A) {
                y2Var.A = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                }
                y2Var.f34006c = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new org.telegram.ui.Components.voip.x2(y2Var, i10));
                y2Var.f34006c.setInterpolator(org.telegram.ui.Components.er.f28122f);
                y2Var.f34006c.setDuration(200L);
                y2Var.f34006c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.K0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.O0);
                this.N0 = false;
                if (this.f40131y.getVisibility() == 0) {
                    this.f40131y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
                this.K.animate().setListener(null).cancel();
                this.K.setVisibility(0);
                this.K.setAlpha(0.0f);
                this.K.setScaleX(0.3f);
                this.K.setScaleY(0.3f);
                this.K.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.er.f28123g).start();
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.J.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
                org.telegram.messenger.rl.o(viewPropertyAnimatorTranslationY, erVar, 400L);
                this.N.animate().setListener(null).cancel();
                this.N.setVisibility(0);
                this.N.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.N.setScaleX(0.7f);
                this.N.setScaleY(0.7f);
                this.N.setAlpha(0.0f);
                this.N.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new zg1(this, 3)).setInterpolator(erVar).start();
            } else {
                if (this.f40131y.getVisibility() == 0) {
                    this.f40131y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
                this.K.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f28122f;
                duration.setInterpolator(erVar2).setListener(new go(this.K)).start();
                this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(erVar2).setDuration(280L).start();
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new zg1(this, 4)).setDuration(250L).setInterpolator(erVar2).start();
            }
            this.m0 = this.f40114l0;
            H();
        }
    }

    public final void n() {
        this.f40119q0.b();
    }

    public final void o() {
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ah1(this));
        this.Y.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
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
        this.m0 = this.f40114l0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.m0 = this.f40114l0;
        if (i11 == 2 && !this.Q0) {
            this.Q0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            ye.d dVar = this.f40096c0;
            if (dVar != null) {
                dVar.c();
                this.f40096c0 = null;
            }
        } else if (this.f40096c0 == null && bf.d.a(this.f40092b) == 1) {
            ye.c cVar = new ye.c(this.f40092b, f40088j1);
            cVar.f49851c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var = this.Y;
            cVar.f49856j = r2Var.d;
            cVar.f49857k = r2Var.getPlaceholderView();
            this.f40096c0 = cVar.a();
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.b3 b3Var;
        if (i10 > 0) {
            this.f40105f1 = true;
        }
        if (this.B == null || (b3Var = this.v) == null) {
            return;
        }
        int i11 = b3Var.R;
        if ((i11 == 2 || i11 == 3) && this.f40105f1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(this, i10, 25), 400L);
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f40114l0;
        if (i11 != i10) {
            this.m0 = i11;
            this.f40114l0 = i10;
            if (this.f40119q0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.m0 = this.f40114l0;
        if (z10 && !this.Q0) {
            this.Q0 = true;
        }
        H();
    }

    public final void p() {
        if (this.C0 || this.A0) {
            return;
        }
        eh1 eh1Var = this.f40113k0;
        if (eh1Var != null) {
            eh1Var.a(false, false);
            return;
        }
        if (this.f40110i0 && this.f40112j0 && this.D0) {
            this.D0 = false;
            this.U.setRelativePosition(this.V);
            this.W = false;
            this.m0 = this.f40114l0;
            H();
            return;
        }
        if (this.f40132y0) {
            m(false);
            return;
        }
        if (this.N.getVisibility() != 8) {
            return;
        }
        if (!this.f40133z0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.f40119q0.b();
            return;
        }
        if (bf.d.a(this.f40092b) <= 0) {
            org.telegram.ui.Components.y4.B(this.f40092b, new tg1(this, 0), true).o();
            return;
        }
        if (this.C0 || f40088j1 == null) {
            return;
        }
        this.C0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = f40088j1.f40119q0.getMeasuredHeight();
            lh1 lh1Var = f40088j1;
            org.telegram.ui.Components.voip.l2.l(lh1Var.f40092b, lh1Var.f40089a, lh1Var.f40119q0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = f40088j1.f40116n0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.l2.S = windowInsets.getSystemWindowInsetTop();
                f40088j1.f40116n0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.l2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
        duration.setInterpolator(erVar).start();
        this.D.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
        this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
        this.T.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
        this.f40104f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
        this.f40098d0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
        this.f40101e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
        this.V.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
        this.I0.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).start();
        org.telegram.ui.Components.voip.l2.P = true;
        this.A0 = true;
        ValueAnimator valueAnimatorK = k(false);
        this.H0.lock();
        valueAnimatorK.addListener(new zg1(this, 1));
        valueAnimatorK.setDuration(350L);
        valueAnimatorK.setInterpolator(erVar);
        valueAnimatorK.start();
    }

    public final void r(Runnable runnable) {
        if (this.f40103f.getVisibility() == 0) {
            this.f40090a0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f40090a0;
            ValueAnimator valueAnimator = eVar.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.U = null;
                eVar.Q.stop();
            }
            runnable.run();
            return;
        }
        this.f40115n.animate().cancel();
        this.f40100e.animate().cancel();
        this.h.animate().cancel();
        this.f40103f.animate().cancel();
        this.f40090a0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f40090a0;
        ValueAnimator valueAnimator2 = eVar2.U;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.U = null;
            eVar2.Q.stop();
        }
        this.f40115n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f40100e.d(5, false, false);
        this.h.d(1, false, false);
        this.f40103f.d(3, true, false);
        this.f40115n.setVisibility(0);
        this.f40100e.setVisibility(0);
        this.h.setVisibility(0);
        this.f40103f.setVisibility(0);
        this.f40115n.setAlpha(0.0f);
        this.f40100e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f40103f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40090a0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int iDp = AndroidUtilities.dp(24.0f);
        final int iDp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                lh1 lh1Var = this.f44449a;
                lh1Var.getClass();
                float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                lh1Var.f40090a0.setTranslationY(iDp2 * fFloatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + iDp) * fFloatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                lh1Var.f40090a0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f40090a0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f40090a0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f40090a0;
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.f40090a0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.fk0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new vg1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        if (!this.f40112j0) {
            j3Var.d(2, false, false);
            j3Var.setOnBtnClickedListener(null);
            j3Var.setEnabled(false);
        } else {
            j3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                j3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                j3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            j3Var.setOnBtnClickedListener(new b7(this, voIPService, j3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        j3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.U;
        boolean zIsMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = s1Var.f33849b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s1Var.G, zIsMicMute ? 1.0f : 0.0f);
            s1Var.f33849b0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(s1Var.f33851c0);
            s1Var.f33849b0.setDuration(150L);
            s1Var.f33849b0.start();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f33849b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            s1Var.G = zIsMicMute ? 1.0f : 0.0f;
            s1Var.invalidate();
        }
        j3Var.setOnBtnClickedListener(new tg1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            j3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            j3Var.d(5, true, false);
            i10 = 0;
        } else {
            j3Var.d(5, false, false);
            i10 = 1;
        }
        j3Var.setEnabled(true);
        j3Var.setOnBtnClickedListener(new cg.a0(this, i10, j3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        if (!((this.f40112j0 || this.f40110i0) ? true : voIPService.isVideoAvailable())) {
            j3Var.d(3, true, false);
            j3Var.setOnClickListener(null);
            j3Var.setEnabled(false);
            return;
        }
        if (!this.f40112j0) {
            j3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            j3Var.d(3, false, z10);
        } else {
            j3Var.d(3, false, z10);
        }
        j3Var.setOnBtnClickedListener(new tg1(this, 6));
        j3Var.setEnabled(true);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12 = (this.f40112j0 || this.f40110i0) ? false : true;
        if (!z10) {
            this.f40131y.animate().setListener(null).cancel();
            this.f40131y.setTranslationY(0.0f);
            this.f40131y.setAlpha(1.0f);
            this.f40131y.setScaleX(1.0f);
            this.f40131y.setScaleY(1.0f);
            this.f40131y.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.f40131y.getTag() == null) {
            this.f40131y.animate().setListener(null).cancel();
            this.f40131y.setVisibility(0);
            if (this.f40132y0) {
                if (z11) {
                    this.f40131y.setAlpha(0.0f);
                    this.f40131y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f40131y.setScaleX(0.1f);
                    this.f40131y.setScaleY(0.1f);
                }
            } else if (z11) {
                this.f40131y.setAlpha(0.0f);
                this.f40131y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            } else {
                this.f40131y.setAlpha(0.0f);
                this.f40131y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.f40131y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
            }
        } else if (!z12 && this.f40131y.getTag() != null) {
            this.f40131y.animate().setListener(null).cancel();
            this.f40131y.setTranslationY(0.0f);
            this.f40131y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.er.f28122f).setListener(new zg1(this, 7)).start();
        }
        this.f40131y.setTag(z12 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f40092b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.f40092b, 0, null);
        boolean[] zArr = new boolean[3];
        w3Var.N = LocaleController.getString(R.string.VoipFailed);
        w3Var.P = charSequence;
        w3Var.f22754h0 = LocaleController.getString(R.string.OK);
        w3Var.f22755i0 = null;
        w3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) w3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.f23284q7));
            }
        }
        w3Var.setCanceledOnTouchOutside(true);
        w3Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        AnimatorSet animatorSet;
        if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
            this.U.setUiVisible(this.f40124t0);
        }
        if (!z10 && (animatorSet = this.f40128w0) != null) {
            animatorSet.removeAllListeners();
            this.f40128w0.cancel();
        }
        if (i10 != 0) {
            boolean z11 = (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.U.setVisibility(0);
            } else if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 0) {
                if (this.U.getVisibility() == 8) {
                    this.U.setAlpha(0.0f);
                    this.U.setScaleX(0.7f);
                    this.U.setScaleY(0.7f);
                    this.U.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.f40128w0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.f40128w0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.f40128w0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var = this.U;
                if (s1Var.f33862y < 0.0f) {
                    s1Var.d(1.0f, 1.0f);
                    this.W = true;
                }
            }
            this.U.c(i10 == 2, z11);
            this.W = i10 != 2;
        } else if (!z10) {
            this.U.setVisibility(8);
        } else if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.f40128w0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.f40128w0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.s1 s1Var2 = this.U;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(s1Var2, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, s1Var2.getAlpha(), 0.0f));
            if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.s1 s1Var3 = this.U;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(s1Var3, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, s1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.s1 s1Var4 = this.U;
                animatorSet5.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(s1Var4, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, s1Var4.getScaleX(), 0.7f));
            }
            this.f40128w0 = animatorSet5;
            animatorSet5.addListener(new zg1(this, 6));
            this.f40128w0.setDuration(250L).setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.f40128w0.setStartDelay(50L);
            this.f40128w0.start();
        }
        this.U.setTag(Integer.valueOf(i10));
    }

    @Override
    public final void e(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

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
public final class ph1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, uf.a {
    public static ph1 f42509n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.q2 F;
    public float F0;
    public oh1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public jg.l K;
    public long K0;
    public int L;
    public vg.n1 M;
    public org.telegram.ui.Components.voip.i2 M0;
    public xa1 N;
    public org.telegram.ui.Components.voip.e3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.e3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.p1 Q;
    public fi.l5 R;
    public boolean R0;
    public TextView S;
    public mk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public lh1 X;
    public float X0;
    public org.telegram.ui.Components.voip.v1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.v1 Z;
    public float Z0;
    public final int f42510a;
    public boolean f42511a0;
    public boolean f42512a1;
    public Activity f42513b;
    public TextureViewRenderer f42514b0;
    public float f42515b1;
    public final TLRPC.User f42516c;
    public org.telegram.ui.Components.voip.t2 f42517c0;
    public float f42518c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.t2 f42519d0;
    public int f42520d1;
    public org.telegram.ui.Components.voip.l3 e;
    public org.telegram.ui.Components.voip.e f42521e0;
    public int f42522e1;
    public org.telegram.ui.Components.voip.l3 f42523f;
    public boolean f42524f0;
    public sf.d f42526g0;
    public boolean f42527g1;
    public org.telegram.ui.Components.voip.l3 h;
    public View f42528h0;
    public boolean f42529h1;
    public View f42530i0;
    public ValueAnimator f42531i1;
    public org.telegram.ui.Components.voip.s1 f42532j0;
    public boolean f42533j1;
    public org.telegram.ui.Components.voip.t2 f42535k1;
    public a8.fg l1;
    public boolean m0;
    public boolean f42537m1;
    public mh1 f42538n;
    public boolean f42539n0;
    public ih1 f42540o0;
    public int f42541p0;
    public int f42542q0;
    public WindowInsets f42544r0;
    public kh1 f42545s;
    public boolean f42546s0;
    public float f42547t0;
    public hh1 f42548u0;
    public org.telegram.ui.Components.voip.d3 v;
    public int f42549v0;
    public org.telegram.ui.Components.voip.a3 f42550w;
    public AccessibilityManager f42551w0;
    public org.telegram.ui.Components.voip.f3 f42552x;
    public org.telegram.ui.Components.voip.r0 f42554y;
    public boolean f42556z0;
    public final org.telegram.ui.Components.voip.r1 f42543r = new org.telegram.ui.Components.voip.r1();
    public final org.telegram.ui.Components.y9[] V = new org.telegram.ui.Components.y9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f42534k0 = new Paint();
    public final Paint f42536l0 = new Paint();
    public boolean f42553x0 = true;
    public float f42555y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final v11 Q0 = new v11(this, 17);
    public final yg1 S0 = new yg1(this, 12);
    public final yg1 T0 = new yg1(this, 13);
    public float f42525f1 = 1.0f;

    public ph1(int i10) {
        this.f42510a = i10;
        this.f42516c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f42542q0 = -1;
        this.f42541p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(ph1 ph1Var) {
        ph1 ph1Var2;
        if (ph1Var.f42527g1) {
            ph1Var.f42527g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ph1Var.f42531i1 = ofFloat;
            ph1Var2 = ph1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(ph1Var2, ph1Var.f42525f1, ph1Var.Y0, ph1Var.Z0, 1));
            ph1Var2.f42531i1.addListener(new dh1(ph1Var2, 0));
            ph1Var2.f42531i1.setDuration(350L);
            ph1Var2.f42531i1.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            ph1Var2.f42531i1.start();
        } else {
            ph1Var2 = ph1Var;
        }
        ph1Var2.f42529h1 = false;
        ph1Var2.f42512a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        ph1 ph1Var = f42509n1;
        if (ph1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ph1Var.f42548u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ph1Var.q(new u90(10));
                } else if (!ph1Var.f42513b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(ph1Var.f42513b, new yg1(ph1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ph1Var.f42548u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ph1Var.B();
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
        ph1 ph1Var = f42509n1;
        if (ph1Var != null && ph1Var.f42548u0.getParent() == null) {
            ph1 ph1Var2 = f42509n1;
            if (ph1Var2 != null) {
                ph1Var2.f42517c0.d.release();
                f42509n1.f42519d0.d.release();
                f42509n1.f42514b0.release();
                hh1 hh1Var = f42509n1.f42548u0;
                if (hh1Var != null) {
                    hh1Var.d();
                }
                f42509n1.k();
            }
            f42509n1 = null;
        }
        if (f42509n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ph1 ph1Var3 = new ph1(i10);
                ph1Var3.f42513b = activity;
                f42509n1 = ph1Var3;
                hh1 hh1Var2 = new hh1(activity, !z10, ph1Var3);
                f42509n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f42509n1.getClass();
                hh1Var2.setLockOnScreen(f42509n1.J0);
                ph1Var3.f42548u0 = hh1Var2;
                vg1 vg1Var = new vg1(ph1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f47108a;
                r0.a0.i(hh1Var2, vg1Var);
                ((WindowManager) activity.getSystemService("window")).addView(hh1Var2, org.telegram.ui.Components.voip.x2.a());
                ph1Var3.f42547t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ph1Var3.f42551w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                kh1 kh1Var = new kh1(ph1Var3, activity);
                kh1Var.setClipToPadding(false);
                kh1Var.setClipChildren(false);
                kh1Var.setBackgroundColor(-16777216);
                ph1Var3.F();
                ph1Var3.f42545s = kh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.r1 r1Var = ph1Var3.f42543r;
                ph1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z11, r1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                ph1Var3.f42517c0 = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                ph1Var3.f42517c0.d.setEnableHardwareScaler(true);
                ph1Var3.f42517c0.d.setRotateTextureWithScreen(true);
                ph1Var3.f42517c0.f34113a0 = 1;
                kh1Var.addView(ph1Var3.v, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                TLRPC.User user = ph1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, r1Var);
                ph1Var3.f42550w = a3Var;
                kh1Var.addView(a3Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.y6.f23292a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f33803a = new org.telegram.ui.Components.gx0(0);
                    }
                }
                ph1Var3.f42552x = view;
                kh1Var.addView((View) view, org.telegram.ui.Components.gb1.g(220.0f, -1));
                kh1Var.addView(ph1Var3.f42517c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.x9(orientation, new int[]{-14994098, -14328963}).f(jg.s0.e0(0.5f, 1), new ac1(ph1Var3, 1), 0L);
                org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
                ph1Var3.Y = v1Var;
                v1Var.setDelegate(new vg1(ph1Var3, 3));
                ph1Var3.Y.d(1.0f, 1.0f);
                ph1Var3.f42511a0 = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                ph1Var3.f42519d0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                ph1Var3.f42519d0.d.setUseCameraRotation(true);
                ph1Var3.Y.setOnTapListener(new ah1(ph1Var3, 1));
                ph1Var3.f42519d0.d.setMirror(true);
                ph1Var3.Y.addView(ph1Var3.f42519d0);
                org.telegram.ui.Components.voip.v1 v1Var2 = new org.telegram.ui.Components.voip.v1(activity);
                ph1Var3.Z = v1Var2;
                v1Var2.S = true;
                v1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ph1Var3.f42514b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ph1Var3.f42514b0.setIsCamera(false);
                ph1Var3.f42514b0.setFpsReduction(30.0f);
                ph1Var3.f42514b0.setScalingType(scalingType);
                ph1Var3.Z.addView(ph1Var3.f42514b0, org.telegram.ui.Components.gb1.i(-1, -2, 17));
                ph1Var3.Z.setOnTapListener(new ah1(ph1Var3, 2));
                ph1Var3.Z.setVisibility(8);
                kh1Var.addView(ph1Var3.Y, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                kh1Var.addView(ph1Var3.Z);
                View view2 = new View(activity);
                ph1Var3.f42528h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                kh1Var.addView(ph1Var3.f42528h0, org.telegram.ui.Components.gb1.i(-1, 160, 80));
                View view3 = new View(activity);
                ph1Var3.f42530i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                kh1Var.addView(ph1Var3.f42530i0, org.telegram.ui.Components.gb1.i(-1, 160, 48));
                xa1 xa1Var = new xa1(ph1Var3, activity, 19);
                ph1Var3.N = xa1Var;
                xa1Var.setOrientation(0);
                ph1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ph1Var3.N.setClipToPadding(false);
                ph1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ph1Var3.N.setOnClickListener(new ah1(ph1Var3, 3));
                ph1Var3.P = new org.telegram.ui.Components.voip.p0(activity, r1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ph1Var3.O = frameLayout;
                frameLayout.addView(ph1Var3.P, org.telegram.ui.Components.gb1.h(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ph1Var3.O.setVisibility(8);
                ph1Var3.O.setOnClickListener(new ah1(ph1Var3, 4));
                fi.l5 l5Var = new fi.l5(activity, r1Var);
                ph1Var3.R = l5Var;
                l5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ph1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ph1Var3.S.setTextSize(1, 15.0f);
                ph1Var3.S.setTypeface(AndroidUtilities.bold());
                ph1Var3.S.setTextColor(-1);
                ph1Var3.S.setGravity(17);
                mk mkVar = new mk(ph1Var3, activity, 5);
                ph1Var3.T = mkVar;
                mkVar.setTextSize(1, 15.0f);
                ph1Var3.T.setTextColor(-1);
                ph1Var3.T.setGravity(17);
                ph1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ph1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ph1Var3.R.setVisibility(8);
                ph1Var3.R.addView(ph1Var3.S);
                ph1Var3.R.addView(ph1Var3.T, org.telegram.ui.Components.gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ph1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
                    org.telegram.ui.Components.y9[] y9VarArr = ph1Var3.V;
                    y9VarArr[i15] = y9Var;
                    y9VarArr[i15].getImageReceiver().setAspectFit(true);
                    xa1 xa1Var2 = ph1Var3.N;
                    org.telegram.ui.Components.y9 y9Var2 = y9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    xa1Var2.addView(y9Var2, org.telegram.ui.Components.gb1.o(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                lh1 lh1Var = new lh1(ph1Var3, activity);
                ph1Var3.X = lh1Var;
                lh1Var.setOrientation(1);
                ph1Var3.X.setFocusable(true);
                ph1Var3.X.setFocusableInTouchMode(true);
                ph1Var3.f42554y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = ph1Var3.f42554y;
                int i16 = ph1Var3.f42510a;
                r0Var.f34040b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, j9Var, user);
                ph1Var3.f42554y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ph1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                ph1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ph1Var3.E.getPaint().getFontMetricsInt(), false));
                ph1Var3.E.setMaxLines(2);
                ph1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                ph1Var3.E.setTextColor(-1);
                ph1Var3.E.setGravity(1);
                ph1Var3.E.setImportantForAccessibility(2);
                ph1Var3.X.addView(ph1Var3.E, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f34032a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f34032a[i17] = new TextView(activity);
                    frameLayout2.f34032a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f34032a[i17].setTextColor(-1);
                    frameLayout2.f34032a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f34032a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f34034c = frameLayout3;
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(frameLayout2, activity, r1Var);
                o2Var.setTextSize(1, 15.0f);
                o2Var.setTextColor(-1);
                o2Var.setGravity(1);
                o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(o2Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f34033b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new jg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
                frameLayout2.d = u2Var;
                frameLayout2.addView(u2Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                ph1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f47108a;
                frameLayout2.setImportantForAccessibility(4);
                ph1Var3.X.addView(ph1Var3.F, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    oh1 oh1Var = new oh1(activity);
                    ph1Var3.G = oh1Var;
                    long j10 = sharedState.getUser().f22176id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        oh1Var.setVisibility(8);
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
                        org.telegram.ui.Components.l9 l9Var = oh1Var.f42193b;
                        l9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            l9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        l9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            oh1Var.setVisibility(8);
                        } else {
                            oh1Var.f42194c = new org.telegram.ui.Components.q11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            oh1Var.setVisibility(0);
                            oh1Var.invalidate();
                        }
                    }
                    ph1Var3.X.addView(ph1Var3.G, org.telegram.ui.Components.gb1.o(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ph1Var3.X.setClipChildren(false);
                ph1Var3.X.setClipToPadding(false);
                ph1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ph1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                ph1Var3.Q = new org.telegram.ui.Components.voip.p1(activity, r1Var);
                ph1Var3.U.setAlpha(0.0f);
                ph1Var3.Q.setVisibility(8);
                kh1Var.addView(ph1Var3.f42554y, org.telegram.ui.Components.gb1.h(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.X, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.O, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.R, org.telegram.ui.Components.gb1.h(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.N, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.U, org.telegram.ui.Components.gb1.h(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                kh1Var.addView(ph1Var3.Q, org.telegram.ui.Components.gb1.h(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ph1Var3.f42532j0 = new org.telegram.ui.Components.voip.s1(activity);
                ph1Var3.e = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                ph1Var3.f42523f = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                ph1Var3.h = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                ph1Var3.f42538n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                ph1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                ph1Var3.e.setScaleX(0.0f);
                ph1Var3.e.setScaleY(0.0f);
                ph1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ph1Var3.f42523f.setTranslationY(AndroidUtilities.dp(100.0f));
                ph1Var3.f42523f.setScaleX(0.0f);
                ph1Var3.f42523f.setScaleY(0.0f);
                ph1Var3.f42523f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ph1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ph1Var3.h.setScaleX(0.0f);
                ph1Var3.h.setScaleY(0.0f);
                ph1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ph1Var3.f42538n.setTranslationY(AndroidUtilities.dp(100.0f));
                ph1Var3.f42538n.setScaleX(0.0f);
                ph1Var3.f42538n.setScaleY(0.0f);
                ph1Var3.f42538n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ph1Var3.f42532j0.addView(ph1Var3.e);
                ph1Var3.f42532j0.addView(ph1Var3.f42523f);
                ph1Var3.f42532j0.addView(ph1Var3.h);
                ph1Var3.f42532j0.addView(ph1Var3.f42538n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ph1Var3.f42521e0 = eVar;
                eVar.setListener(new nh1(ph1Var3));
                ph1Var3.f42521e0.setScaleX(1.15f);
                ph1Var3.f42521e0.setScaleY(1.15f);
                kh1Var.addView(ph1Var3.f42532j0, org.telegram.ui.Components.gb1.i(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                kh1Var.addView(ph1Var3.f42521e0, org.telegram.ui.Components.gb1.h(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                ph1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                ph1Var3.I.setImageResource(R.drawable.msg_addcontact);
                ph1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                kh1Var.addView(ph1Var3.I, org.telegram.ui.Components.gb1.i(56, 56, 53));
                org.telegram.ui.Components.gb1.b(ph1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                ph1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                ph1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                ph1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ph1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                kh1Var.addView(ph1Var3.H, org.telegram.ui.Components.gb1.i(56, 56, 51));
                org.telegram.ui.Components.gb1.b(ph1Var3.H);
                jg.l lVar = new jg.l(activity, 5);
                ph1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ph1Var3.K.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                ph1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                kh1Var.addView(ph1Var3.K, org.telegram.ui.Components.gb1.h(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ph1Var3.K.setAlpha(0.0f);
                ph1Var3.K.setOnClickListener(new ah1(ph1Var3, 5));
                ph1Var3.H.setOnClickListener(new ah1(ph1Var3, 6));
                ph1Var3.I.setOnClickListener(new xd0(21, ph1Var3, activity));
                if (ph1Var3.f42548u0.f34207b) {
                    ph1Var3.H.setVisibility(8);
                    ph1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f33856a = new HashMap();
                linearLayout.f33857b = new ArrayList();
                linearLayout.f33858c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f33861r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f33860n = r1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ph1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                ph1Var3.M0.setOnViewsUpdated(new yg1(ph1Var3, 5));
                kh1Var.addView(ph1Var3.M0, org.telegram.ui.Components.gb1.h(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, r1Var, true);
                e3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.K = alignment;
                e3Var.d = -1L;
                e3Var.f11798l0 = new yg1(ph1Var3, 6);
                e3Var.T = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.e = true;
                e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.q(8.0f);
                ph1Var3.N0 = e3Var;
                e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                kh1Var.addView(ph1Var3.N0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, r1Var, false);
                e3Var2.p(true);
                e3Var2.K = alignment;
                e3Var2.d = 4000L;
                e3Var2.T = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.e = true;
                e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.q(8.0f);
                ph1Var3.O0 = e3Var2;
                e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                kh1Var.addView(ph1Var3.O0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ph1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ph1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ph1Var3.U0 = z12;
                    }
                    ph1Var3.n();
                }
                hh1Var2.addView(kh1Var);
                if (z10) {
                    ph1Var3.F0 = 0.0f;
                    ph1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ph1Var3.f42517c0.setStub(org.telegram.ui.Components.voip.n2.k().f33962s);
                        ph1Var3.f42519d0.setStub(org.telegram.ui.Components.voip.n2.k().f33961r);
                    }
                    ph1Var3.f42548u0.setAlpha(0.0f);
                    ph1Var3.G();
                    ph1Var3.E0 = true;
                    org.telegram.ui.Components.voip.n2.U = true;
                    if (org.telegram.ui.Components.voip.n2.W == null) {
                        ph1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new yg1(ph1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.V.getClass();
                        throw null;
                    }
                } else {
                    ph1Var3.F0 = 1.0f;
                    ph1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && vf.b.a(activity) == 1) {
                    ph1 ph1Var4 = f42509n1;
                    sf.c cVar = new sf.c(activity, ph1Var4);
                    cVar.f48120c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = ph1Var4.f42517c0;
                    cVar.f48124j = t2Var3.d;
                    cVar.f48125k = t2Var3.getPlaceholderView();
                    ph1Var4.f42526g0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            yg1 yg1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            this.R0 = false;
            if (this.f42556z0 && this.f42553x0) {
                AndroidUtilities.runOnUIThread(yg1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f42551w0.isTouchExplorationEnabled()) {
                if (!this.f42539n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f42545s.announceForAccessibility(string);
            }
            if (!this.f42539n0) {
                if (this.f42540o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f42548u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f42523f.getLocationOnScreen(iArr);
                    ih1 ih1Var = new ih1(this, this.f42545s.getContext(), iArr[0], iArr[1]);
                    this.f42540o0 = ih1Var;
                    WindowInsets windowInsets = this.f42544r0;
                    if (windowInsets != null) {
                        ih1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f42545s.addView(this.f42540o0);
                    return;
                }
                return;
            }
            this.f42519d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f42542q0 = this.f42541p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
                transitionSet.addTransition(duration.setInterpolator(dsVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(dsVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f42532j0, transitionSet);
            }
            int i10 = this.f42541p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f42523f.setVisibility(8);
                this.h.setVisibility(8);
                this.f42538n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f42509n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f42539n0 || this.m0)) {
                    r(this.e, sharedInstance);
                    if (this.f42553x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f42523f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f42538n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f42538n.setOnClickListener(new ah1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f42539n0 || this.m0)) {
                        r(this.e, sharedInstance);
                        if (this.f42553x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f42523f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f42523f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f42538n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f33943f = 0;
                i11 = 16;
            }
            if (this.f42523f.getVisibility() == 0) {
                this.f42523f.f33943f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f33943f = i11;
                i11 += 16;
            }
            if (this.f42538n.getVisibility() == 0) {
                this.f42538n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph1.D(boolean):void");
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
        this.f42534k0.setColor(i0.a.o(-16777216, (int) (this.f42555y0 * 102.0f * this.F0)));
        this.f42536l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        kh1 kh1Var = this.f42545s;
        if (kh1Var != null) {
            kh1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph1.G():void");
    }

    @Override
    public final void a(a8.fg fgVar) {
        this.l1 = fgVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.f42517c0;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f42537m1 = true;
        G();
        ((WindowManager) this.f42513b.getSystemService("window")).removeView(this.f42548u0);
        this.f42548u0.invalidate();
    }

    @Override
    public final void b(a8.fg fgVar) {
        this.l1 = fgVar;
        hh1 hh1Var = this.f42548u0;
        hh1Var.getClass();
        ((WindowManager) this.f42513b.getSystemService("window")).addView(hh1Var, org.telegram.ui.Components.voip.x2.a());
        this.f42537m1 = false;
        G();
        this.f42548u0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f42535k1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f42535k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f42535k1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f42535k1.d.getBitmap();
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
            if (this.f42541p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f42519d0.d.release();
                this.f42517c0.d.release();
                this.f42514b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f42548u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f42554y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f42524f0 = booleanValue;
            if (booleanValue) {
                this.f42554y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f42517c0;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f42517c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f42513b, false, true, false, false);
        this.f42535k1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f42535k1.d.setEnableHardwareScaler(true);
        this.f42535k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f42535k1;
        t2Var2.f34113a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new jh1(this));
        View view = this.f42535k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f42535k1;
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
        float f19 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().E;
        float f20 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().F;
        final float x9 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.n2.V.getClass();
        final float measuredWidth2 = f19 - ((this.f42517c0.getMeasuredWidth() - (this.f42517c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f42517c0.getMeasuredHeight() - (this.f42517c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f42539n0 && measuredWidth3 != 0) {
                f18 = (this.f42548u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = d3.A(org.telegram.ui.Components.voip.n2.k().f33959f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().f33959f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                f17 = d3.A(org.telegram.ui.Components.voip.n2.k().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
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
            org.telegram.ui.Components.voip.n2.V.getClass();
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
            this.f42517c0.setScaleX(0.25f);
            this.f42517c0.setScaleY(0.25f);
            this.f42517c0.setTranslationX(measuredWidth2);
            this.f42517c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f42517c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f23) / 0.25f);
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
                ph1 ph1Var = ph1.this;
                ph1Var.F0 = f25;
                ph1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    ph1Var.Y.setScaleX(f26);
                    ph1Var.Y.setScaleY(f26);
                    ph1Var.Y.setTranslationX((f22 * floatValue) + (x9 * f25));
                    ph1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    ph1Var.Y.setCornerRadius((dp * floatValue) + (f11 * f25));
                    ph1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                ph1Var.f42517c0.setScaleX(f27);
                ph1Var.f42517c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                ph1Var.f42517c0.setTranslationX(f29);
                ph1Var.f42517c0.setTranslationY(f30);
                ph1Var.f42517c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f27);
                if (!ph1Var.Y.P) {
                    ph1Var.f42519d0.d(floatValue, false);
                }
                ph1Var.f42548u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f42510a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        sf.d dVar = this.f42526g0;
        if (dVar != null) {
            dVar.c();
            this.f42526g0 = null;
        }
        vg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f42553x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.a3 a3Var = this.f42550w;
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
                a3Var.f33722c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f33722c.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                a3Var.f33722c.setDuration(200L);
                a3Var.f33722c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f42554y.getVisibility() == 0) {
                    this.f42554y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.ds.f27587g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
                org.telegram.messenger.vh.q(translationY, dsVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new dh1(this, 3)).setInterpolator(dsVar).start();
            } else {
                if (this.f42554y.getVisibility() == 0) {
                    this.f42554y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f27586f;
                duration.setInterpolator(dsVar2).setListener(new jo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(dsVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new dh1(this, 4)).setDuration(250L).setInterpolator(dsVar2).start();
            }
            this.f42542q0 = this.f42541p0;
            G();
        }
    }

    public final void m() {
        this.f42548u0.b();
    }

    public final void n() {
        this.f42519d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new eh1(this));
        this.f42517c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new fh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f42514b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            ih1 ih1Var = this.f42540o0;
            if (ih1Var != null) {
                ih1Var.a(false, false);
            } else if (this.m0 && this.f42539n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f42511a0 = false;
                this.f42542q0 = this.f42541p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (vf.b.a(this.f42513b) > 0) {
                        if (!this.G0 && f42509n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f42509n1.f42548u0.getMeasuredHeight();
                                ph1 ph1Var = f42509n1;
                                org.telegram.ui.Components.voip.n2.l(ph1Var.f42513b, ph1Var.f42510a, ph1Var.f42548u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f42509n1.f42544r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.X = windowInsets.getSystemWindowInsetTop();
                                    f42509n1.f42544r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
                                duration.setInterpolator(dsVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.f42532j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.f42528h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.f42530i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                org.telegram.ui.Components.voip.n2.U = true;
                                this.E0 = true;
                                ValueAnimator j10 = j(false);
                                this.L0.lock();
                                j10.addListener(new dh1(this, 1));
                                j10.setDuration(350L);
                                j10.setInterpolator(dsVar);
                                j10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.g5.A(this.f42513b, new vg1(this, 0), true).p();
                    return;
                }
                this.f42548u0.b();
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
        this.f42542q0 = this.f42541p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f42542q0 = this.f42541p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f42526g0 == null && vf.b.a(this.f42513b) == 1) {
                sf.c cVar = new sf.c(this.f42513b, f42509n1);
                cVar.f48120c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.f42517c0;
                cVar.f48124j = t2Var.d;
                cVar.f48125k = t2Var.getPlaceholderView();
                this.f42526g0 = cVar.a();
            }
        } else {
            sf.d dVar = this.f42526g0;
            if (dVar != null) {
                dVar.c();
                this.f42526g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f42533j1 = true;
        }
        if (this.F != null && (d3Var = this.v) != null) {
            int i11 = d3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f42533j1) {
                AndroidUtilities.runOnUIThread(new wg1(this, i10, 0), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f42541p0;
        if (i11 != i10) {
            this.f42542q0 = i11;
            this.f42541p0 = i10;
            if (this.f42548u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f42542q0 = this.f42541p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f42523f.getVisibility() == 0) {
            this.f42521e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f42521e0;
            ValueAnimator valueAnimator = eVar.f33776b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f33776b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f42538n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f42523f.animate().cancel();
        this.f42521e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f42521e0;
        ValueAnimator valueAnimator2 = eVar2.f33776b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f33776b0 = null;
            eVar2.U.stop();
        }
        this.f42538n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f42523f.d(3, true, false);
        this.f42538n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f42523f.setVisibility(0);
        this.f42538n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f42523f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42521e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ph1 ph1Var = ph1.this;
                ph1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ph1Var.f42521e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ph1Var.f42521e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f42521e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f42521e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f42521e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f42521e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ll0(16, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new yg1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f42539n0) {
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
        l3Var.setOnBtnClickedListener(new e7(this, voIPService, l3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.v1 v1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = v1Var.f34159f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            v1Var.K = f7;
            v1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = v1Var.f34159f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = v1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            v1Var.f34159f0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.f34160g0);
            v1Var.f34159f0.setDuration(150L);
            v1Var.f34159f0.start();
        }
        l3Var.setOnBtnClickedListener(new vg1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            l3Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            l3Var.d(5, true, false);
        } else {
            l3Var.d(5, false, false);
            i10 = 1;
            l3Var.setEnabled(true);
            l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
        }
        i10 = i11;
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f42539n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f42539n0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z10);
                } else {
                    l3Var.d(3, false, z10);
                }
            } else {
                l3Var.d(3, true, z10);
            }
            l3Var.setOnBtnClickedListener(new vg1(this, 6));
            l3Var.setEnabled(true);
            return;
        }
        l3Var.d(3, true, false);
        l3Var.setOnClickListener(null);
        l3Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f42539n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f42554y.getTag() == null) {
                this.f42554y.animate().setListener(null).cancel();
                this.f42554y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f42554y.setAlpha(0.0f);
                        this.f42554y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
                    } else {
                        this.f42554y.setAlpha(0.0f);
                        this.f42554y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f42554y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
                    }
                } else if (z11) {
                    this.f42554y.setAlpha(0.0f);
                    this.f42554y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f42554y.setScaleX(0.1f);
                    this.f42554y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f42554y.getTag() != null) {
                this.f42554y.animate().setListener(null).cancel();
                this.f42554y.setTranslationY(0.0f);
                this.f42554y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.ds.f27586f).setListener(new dh1(this, 7)).start();
            }
        } else {
            this.f42554y.animate().setListener(null).cancel();
            this.f42554y.setTranslationY(0.0f);
            this.f42554y.setAlpha(1.0f);
            this.f42554y.setScaleX(1.0f);
            this.f42554y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f42554y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f42554y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f42513b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(this.f42513b, 0, null);
        boolean[] zArr = new boolean[3];
        e2Var.R = LocaleController.getString(R.string.VoipFailed);
        e2Var.T = charSequence;
        e2Var.f22583n0 = LocaleController.getString(R.string.OK);
        e2Var.f22584o0 = null;
        e2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) e2Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, e2Var.f22580k1);
            }
        }
        e2Var.setCanceledOnTouchOutside(true);
        e2Var.setOnDismissListener(new u5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f42553x0);
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
                    animatorSet3.addListener(new dh1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f27586f);
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
                if (v1Var4.f34169y < 0.0f) {
                    v1Var4.d(1.0f, 1.0f);
                    this.f42511a0 = true;
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
            this.f42511a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        v11 v11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f42553x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
            duration.setInterpolator(dsVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar).start();
            this.f42532j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.f42528h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f42530i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42555y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(v11Var);
            this.P0.setDuration(150L).setInterpolator(dsVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f42532j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f42553x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f27586f;
                translationY.setInterpolator(dsVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(dsVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f42532j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f42528h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f42530i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f42555y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(v11Var);
                this.P0.setDuration(150L).setInterpolator(dsVar2);
                this.P0.start();
                this.f42532j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f42553x0 = z10;
        hh1 hh1Var = this.f42548u0;
        if (!z10) {
            hh1Var.setSystemUiVisibility(hh1Var.getSystemUiVisibility() | 4);
        } else {
            hh1Var.setSystemUiVisibility(hh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f42553x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}

package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.bb;
import ci.m6;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.y9;
import org.webrtc.RendererCommon;
import w7.x5;
public final class j1 implements NotificationCenter.NotificationCenterDelegate, sf.a {
    public static final lw0 f31995b0 = new lw0(new fe0(20), new fe0(21));
    public static final lw0 f31996c0 = new lw0(new fe0(22), new fe0(23));
    public static final j1 f31997d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public m.f3 G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public qf.e O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public i2.h0 X;
    public com.google.android.gms.internal.cast.p Y;
    public s2 Z;
    public float f31998a;
    public boolean f31999a0;
    public WindowManager f32000b;
    public WindowManager.LayoutParams f32001c;
    public org.telegram.ui.f d;
    public m6 f32002e;
    public s2 f32003f;
    public FrameLayout h;
    public h f32004n;
    public y9 f32005r;
    public bb f32006s;
    public TLRPC.GroupCallParticipant v;
    public boolean f32007w;
    public boolean f32008x;
    public boolean f32009y;

    static {
        ?? obj = new Object();
        obj.f31998a = 1.4f;
        obj.f32004n = new h();
        obj.f32007w = true;
        obj.P = 1.0f;
        obj.X = new i2.h0((Object) obj, 20);
        f31997d0 = obj;
    }

    public static void j() {
        j1 j1Var = f31997d0;
        if (j1Var.V) {
            j1Var.V = false;
            AndroidUtilities.runOnUIThread(new vh(15), 100L);
            j1Var.E.getNotificationCenter().removeObserver(j1Var, NotificationCenter.groupCallUpdated);
            j1Var.E.getNotificationCenter().removeObserver(j1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(j1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = j1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (j1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(j1Var.X);
                j1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(hs.f27118f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new g1(j1Var));
            animatorSet.start();
            qf.e eVar = j1Var.O;
            if (eVar != null) {
                eVar.c();
                j1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        j1 j1Var = f31997d0;
        j1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !j1Var.V) {
            j1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            j1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(j1Var, NotificationCenter.groupCallUpdated);
            j1Var.E.getNotificationCenter().addObserver(j1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(j1Var, NotificationCenter.didEndCall);
            j1Var.M = j1Var.m();
            j1Var.N = j1Var.l();
            j1Var.P = 1.0f;
            j1Var.K = false;
            o1.k kVar = new o1.k(j1Var, f31995b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f16938u = lVar;
            j1Var.S = kVar;
            o1.k kVar2 = new o1.k(j1Var, f31996c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f16938u = lVar2;
            j1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new lg.b(j1Var, 2));
            j1Var.F = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            j1Var.F.setStylusScaleEnabled(false);
            j1Var.G = new m.f3(activity2, new h1(j1Var, scaledTouchSlop));
            j1Var.f32002e = new m6(j1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(j1Var, activity2, 2);
            j1Var.d = fVar;
            fVar.addView(j1Var.f32002e, x5.d(-1.0f, -1));
            j1Var.f32002e.setOutlineProvider(new ai.l2(17));
            j1Var.f32002e.setClipToOutline(true);
            j1Var.f32002e.setBackgroundColor(i6.x0(null, i6.f20860gg, false));
            y9 y9Var = new y9(activity2);
            j1Var.f32005r = y9Var;
            j1Var.f32002e.addView(y9Var, x5.d(-1.0f, -1));
            s2 s2Var = new s2(activity2, false, false, false, false);
            j1Var.f32003f = s2Var;
            s2Var.setAlpha(0.0f);
            j1Var.f32003f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            s2 s2Var2 = j1Var.f32003f;
            s2Var2.f32211a0 = 0;
            s2Var2.d.setRotateTextureWithScreen(true);
            j1Var.f32003f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new i1(j1Var));
            j1Var.f32002e.addView(j1Var.f32003f, x5.d(-1.0f, -1));
            bb bbVar = new bb(j1Var, activity2, 27);
            j1Var.f32006s = bbVar;
            j1Var.f32002e.addView(bbVar, x5.d(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            j1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            j1Var.h.addView(view, x5.d(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i10 = i6.f20878hg;
            imageView.setColorFilter(i6.x0(null, i10, false));
            int i11 = i6.f20888i6;
            imageView.setBackground(i6.g0(i6.x0(null, i11, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ai.e2(13));
            float f7 = 38;
            float f10 = 4;
            j1Var.h.addView(imageView, x5.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(i6.x0(null, i10, false));
            imageView2.setBackground(i6.g0(i6.x0(null, i11, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            j1Var.h.addView(imageView2, x5.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
            j1Var.f32002e.addView(j1Var.h, x5.d(-1.0f, -1));
            j1Var.f32000b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = tf.c.b(activity2, false);
            j1Var.f32001c = b10;
            int i12 = j1Var.M;
            b10.width = i12;
            b10.height = j1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i12) - AndroidUtilities.dp(16.0f);
            j1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = j1Var.f32001c;
            float dp3 = (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f);
            j1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = j1Var.f32001c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            j1Var.d.setAlpha(0.0f);
            j1Var.d.setScaleX(0.1f);
            j1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f32000b, j1Var.d, j1Var.f32001c);
            j1Var.f32000b.addView(j1Var.d, j1Var.f32001c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(hs.f27118f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new e1(j1Var, 0));
            animatorSet.start();
            j1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            qf.e eVar = j1Var.O;
            if (eVar != null) {
                eVar.c();
                j1Var.O = null;
            }
            if (activity != null && tf.c.a(activity) == 1) {
                qf.d dVar = new qf.d(activity, j1Var);
                dVar.f46151c = "pip-rtmp-video";
                dVar.f46152e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f46156j = j1Var.d;
                dVar.f46157k = j1Var.f32003f.getPlaceholderView();
                j1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        s2 s2Var = this.f32003f;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        i(true);
        this.f31999a0 = true;
        this.f32000b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        qf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f32001c;
            int width = this.O.h.f48256a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f32001c;
            int height = this.O.h.f48256a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f31999a0 = false;
        this.f32000b.addView(this.d, this.f32001c);
        this.d.invalidate();
        s2 s2Var = this.Z;
        if (s2Var != null) {
            s2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override
    public final Bitmap c() {
        s2 s2Var = this.Z;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.Z.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i(false);
        }
    }

    @Override
    public final Bitmap e() {
        s2 s2Var = this.f32003f;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f32003f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        s2 s2Var = new s2(this.f32003f.getContext(), false, false, false, false);
        this.Z = s2Var;
        s2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        s2 s2Var2 = this.Z;
        s2Var2.f32211a0 = 0;
        s2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new f1(this));
        View view = this.Z.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Z;
    }

    public final void i(boolean z10) {
        float dp;
        float f7;
        float f10;
        float f11;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z11;
        int d;
        int d10;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f32009y);
                }
                s2 s2Var = this.Z;
                if (s2Var == null) {
                    s2Var = this.f32003f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f32009y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(s2Var.d, this.f32009y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f32009y, s2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = j9.d(user.f20185id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32005r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = j9.d(chat.f20038id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32005r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f32008x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f32007w != z12) {
            this.f32006s.animate().cancel();
            ViewPropertyAnimator animate = this.f32006s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            hs hsVar = hs.f27118f;
            duration.setInterpolator(hsVar).start();
            this.f32005r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f32005r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(hsVar).start();
            this.f32003f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f32003f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(hsVar).start();
            this.f32007w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f32001c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f32001c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f32000b, this.d, this.f32001c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f16928b = f13;
        kVar.f16929c = true;
        o1.l lVar = kVar.f16938u;
        float B = a1.g.B(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (B >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16945i = dp;
        this.S.h();
        o1.k kVar2 = this.T;
        kVar2.f16928b = this.R;
        kVar2.f16929c = true;
        kVar2.f16938u.f16945i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
        this.T.h();
    }

    public final float k() {
        float f7;
        if (this.U == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f10 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f10 != 0.0f) {
                    f7 = 1.0f / f10;
                    this.U = Float.valueOf(f7);
                    Point point = AndroidUtilities.displaySize;
                    this.f31998a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f31998a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.U.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f7;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void o(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.L = duration;
        duration.setInterpolator(hs.f27118f);
        this.L.addUpdateListener(new r0(this, 2));
        this.L.addListener(new e1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

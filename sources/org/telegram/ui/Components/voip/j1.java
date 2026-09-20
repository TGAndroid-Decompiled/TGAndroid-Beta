package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.eb;
import ci.n6;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.v9;
import org.webrtc.RendererCommon;
import w7.y5;
public final class j1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final tv0 f29406b0 = new tv0(new ig0(17), new ig0(18));
    public static final tv0 f29407c0 = new tv0(new ig0(19), new ig0(20));
    public static final j1 f29408d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public n2.e G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public pf.e O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public i2.g0 X;
    public com.google.android.gms.internal.cast.p Y;
    public s2 Z;
    public float f29409a;
    public boolean f29410a0;
    public WindowManager f29411b;
    public WindowManager.LayoutParams f29412c;
    public org.telegram.ui.f d;
    public n6 e;
    public s2 f29413f;
    public FrameLayout h;
    public h f29414n;
    public v9 f29415r;
    public eb f29416s;
    public TLRPC.GroupCallParticipant v;
    public boolean f29417w;
    public boolean f29418x;
    public boolean f29419y;

    static {
        ?? obj = new Object();
        obj.f29409a = 1.4f;
        obj.f29414n = new h();
        obj.f29417w = true;
        obj.P = 1.0f;
        obj.X = new i2.g0((Object) obj, 20);
        f29408d0 = obj;
    }

    public static void j() {
        j1 j1Var = f29408d0;
        if (j1Var.V) {
            j1Var.V = false;
            AndroidUtilities.runOnUIThread(new sh(15), 100L);
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
            animatorSet.setInterpolator(qr.f27642f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new g1(j1Var));
            animatorSet.start();
            pf.e eVar = j1Var.O;
            if (eVar != null) {
                eVar.c();
                j1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        j1 j1Var = f29408d0;
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
            o1.k kVar = new o1.k(j1Var, f29406b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f15522u = lVar;
            j1Var.S = kVar;
            o1.k kVar2 = new o1.k(j1Var, f29407c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f15522u = lVar2;
            j1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new lg.b(j1Var, 2));
            j1Var.F = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                j1Var.F.setStylusScaleEnabled(false);
            }
            j1Var.G = new n2.e(activity2, new h1(j1Var, scaledTouchSlop));
            j1Var.e = new n6(j1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(j1Var, activity2, 2);
            j1Var.d = fVar;
            fVar.addView(j1Var.e, y5.c(-1.0f, -1));
            j1Var.e.setOutlineProvider(new ai.k2(17));
            j1Var.e.setClipToOutline(true);
            j1Var.e.setBackgroundColor(j6.w0(null, j6.f19157gg, false));
            v9 v9Var = new v9(activity2);
            j1Var.f29415r = v9Var;
            j1Var.e.addView(v9Var, y5.c(-1.0f, -1));
            s2 s2Var = new s2(activity2, false, false, false, false);
            j1Var.f29413f = s2Var;
            s2Var.setAlpha(0.0f);
            j1Var.f29413f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            s2 s2Var2 = j1Var.f29413f;
            s2Var2.f29607a0 = 0;
            s2Var2.d.setRotateTextureWithScreen(true);
            j1Var.f29413f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new i1(j1Var));
            j1Var.e.addView(j1Var.f29413f, y5.c(-1.0f, -1));
            eb ebVar = new eb(j1Var, activity2, 27);
            j1Var.f29416s = ebVar;
            j1Var.e.addView(ebVar, y5.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            j1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            j1Var.h.addView(view, y5.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = j6.f19174hg;
            imageView.setColorFilter(j6.w0(null, i11, false));
            int i12 = j6.f19184i6;
            imageView.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ai.e2(13));
            float f7 = 38;
            float f10 = 4;
            j1Var.h.addView(imageView, y5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(j6.w0(null, i11, false));
            imageView2.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            j1Var.h.addView(imageView2, y5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            j1Var.e.addView(j1Var.h, y5.c(-1.0f, -1));
            j1Var.f29411b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
            j1Var.f29412c = b10;
            int i13 = j1Var.M;
            b10.width = i13;
            b10.height = j1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            j1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = j1Var.f29412c;
            float dp3 = (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f);
            j1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = j1Var.f29412c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            j1Var.d.setAlpha(0.0f);
            j1Var.d.setScaleX(0.1f);
            j1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f29411b, j1Var.d, j1Var.f29412c);
            j1Var.f29411b.addView(j1Var.d, j1Var.f29412c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(qr.f27642f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(j1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new e1(j1Var, 0));
            animatorSet.start();
            j1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = j1Var.O;
            if (eVar != null) {
                eVar.c();
                j1Var.O = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, j1Var);
                dVar.f41081c = "pip-rtmp-video";
                dVar.e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f41085j = j1Var.d;
                dVar.f41086k = j1Var.f29413f.getPlaceholderView();
                j1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        s2 s2Var = this.f29413f;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        i(true);
        this.f29410a0 = true;
        this.f29411b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f29412c;
            int width = this.O.h.f43206a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f29412c;
            int height = this.O.h.f43206a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f29410a0 = false;
        this.f29411b.addView(this.d, this.f29412c);
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
        s2 s2Var = this.f29413f;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f29413f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        s2 s2Var = new s2(this.f29413f.getContext(), false, false, false, false);
        this.Z = s2Var;
        s2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        s2 s2Var2 = this.Z;
        s2Var2.f29607a0 = 0;
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f29419y);
                }
                s2 s2Var = this.Z;
                if (s2Var == null) {
                    s2Var = this.f29413f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29419y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(s2Var.d, this.f29419y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f29419y, s2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = g9.d(user.f18475id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29415r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = g9.d(chat.f18328id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29415r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f29418x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f29417w != z12) {
            this.f29416s.animate().cancel();
            ViewPropertyAnimator animate = this.f29416s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            qr qrVar = qr.f27642f;
            duration.setInterpolator(qrVar).start();
            this.f29415r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f29415r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(qrVar).start();
            this.f29413f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f29413f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(qrVar).start();
            this.f29417w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f29412c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f29412c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f29411b, this.d, this.f29412c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f15513b = f13;
        kVar.f15514c = true;
        o1.l lVar = kVar.f15522u;
        float A = a4.a.A(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (A >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f15528i = dp;
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.f15513b = this.R;
        kVar2.f15514c = true;
        kVar2.f15522u.f15528i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
        this.T.f();
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
                    this.f29409a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f29409a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(qr.f27642f);
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

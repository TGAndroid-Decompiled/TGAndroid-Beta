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
import ci.ab;
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
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.w9;
import org.webrtc.RendererCommon;
import w7.z5;
public final class k1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final ew0 f31929b0 = new ew0(new e1(0), new e1(1));
    public static final ew0 f31930c0 = new ew0(new e1(2), new e1(3));
    public static final k1 f31931d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public k2.e G;
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
    public i2.h0 X;
    public com.google.android.gms.internal.cast.p Y;
    public t2 Z;
    public float f31932a;
    public boolean f31933a0;
    public WindowManager f31934b;
    public WindowManager.LayoutParams f31935c;
    public org.telegram.ui.f d;
    public m6 f31936e;
    public t2 f31937f;
    public FrameLayout h;
    public h f31938n;
    public w9 f31939r;
    public ab f31940s;
    public TLRPC.GroupCallParticipant v;
    public boolean f31941w;
    public boolean f31942x;
    public boolean f31943y;

    static {
        ?? obj = new Object();
        obj.f31932a = 1.4f;
        obj.f31938n = new h();
        obj.f31941w = true;
        obj.P = 1.0f;
        obj.X = new i2.h0((Object) obj, 19);
        f31931d0 = obj;
    }

    public static void j() {
        k1 k1Var = f31931d0;
        if (k1Var.V) {
            k1Var.V = false;
            AndroidUtilities.runOnUIThread(new uh(15), 100L);
            k1Var.E.getNotificationCenter().removeObserver(k1Var, NotificationCenter.groupCallUpdated);
            k1Var.E.getNotificationCenter().removeObserver(k1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(k1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = k1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (k1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(k1Var.X);
                k1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f31141f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new h1(k1Var));
            animatorSet.start();
            pf.e eVar = k1Var.O;
            if (eVar != null) {
                eVar.c();
                k1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        k1 k1Var = f31931d0;
        k1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !k1Var.V) {
            k1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            k1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(k1Var, NotificationCenter.groupCallUpdated);
            k1Var.E.getNotificationCenter().addObserver(k1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(k1Var, NotificationCenter.didEndCall);
            k1Var.M = k1Var.m();
            k1Var.N = k1Var.l();
            k1Var.P = 1.0f;
            k1Var.K = false;
            o1.k kVar = new o1.k(k1Var, f31929b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f16984u = lVar;
            k1Var.S = kVar;
            o1.k kVar2 = new o1.k(k1Var, f31930c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f16984u = lVar2;
            k1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new lg.b(k1Var, 2));
            k1Var.F = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                k1Var.F.setStylusScaleEnabled(false);
            }
            k1Var.G = new k2.e(activity2, new i1(k1Var, scaledTouchSlop));
            k1Var.f31936e = new m6(k1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(k1Var, activity2, 2);
            k1Var.d = fVar;
            fVar.addView(k1Var.f31936e, z5.c(-1.0f, -1));
            k1Var.f31936e.setOutlineProvider(new ai.k2(17));
            k1Var.f31936e.setClipToOutline(true);
            k1Var.f31936e.setBackgroundColor(i6.w0(null, i6.f20882gg, false));
            w9 w9Var = new w9(activity2);
            k1Var.f31939r = w9Var;
            k1Var.f31936e.addView(w9Var, z5.c(-1.0f, -1));
            t2 t2Var = new t2(activity2, false, false, false, false);
            k1Var.f31937f = t2Var;
            t2Var.setAlpha(0.0f);
            k1Var.f31937f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            t2 t2Var2 = k1Var.f31937f;
            t2Var2.f32155a0 = 0;
            t2Var2.d.setRotateTextureWithScreen(true);
            k1Var.f31937f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j1(k1Var));
            k1Var.f31936e.addView(k1Var.f31937f, z5.c(-1.0f, -1));
            ab abVar = new ab(k1Var, activity2, 28);
            k1Var.f31940s = abVar;
            k1Var.f31936e.addView(abVar, z5.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            k1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            k1Var.h.addView(view, z5.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = i6.f20899hg;
            imageView.setColorFilter(i6.w0(null, i11, false));
            int i12 = i6.f20909i6;
            imageView.setBackground(i6.f0(i6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ai.e2(13));
            float f7 = 38;
            float f10 = 4;
            k1Var.h.addView(imageView, z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(i6.w0(null, i11, false));
            imageView2.setBackground(i6.f0(i6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            k1Var.h.addView(imageView2, z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            k1Var.f31936e.addView(k1Var.h, z5.c(-1.0f, -1));
            k1Var.f31934b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
            k1Var.f31935c = b10;
            int i13 = k1Var.M;
            b10.width = i13;
            b10.height = k1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            k1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = k1Var.f31935c;
            float dp3 = (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f);
            k1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = k1Var.f31935c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            k1Var.d.setAlpha(0.0f);
            k1Var.d.setScaleX(0.1f);
            k1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f31934b, k1Var.d, k1Var.f31935c);
            k1Var.f31934b.addView(k1Var.d, k1Var.f31935c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(tr.f31141f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(k1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(k1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new f1(k1Var, 0));
            animatorSet.start();
            k1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            pf.e eVar = k1Var.O;
            if (eVar != null) {
                eVar.c();
                k1Var.O = null;
            }
            if (activity != null && sf.c.a(activity) == 1) {
                pf.d dVar = new pf.d(activity, k1Var);
                dVar.f44401c = "pip-rtmp-video";
                dVar.f44402e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f44406j = k1Var.d;
                dVar.f44407k = k1Var.f31937f.getPlaceholderView();
                k1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        t2 t2Var = this.f31937f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.f31933a0 = true;
        this.f31934b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f31935c;
            int width = this.O.h.f46779a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f31935c;
            int height = this.O.h.f46779a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f31933a0 = false;
        this.f31934b.addView(this.d, this.f31935c);
        this.d.invalidate();
        t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override
    public final Bitmap c() {
        t2 t2Var = this.Z;
        if (t2Var != null && t2Var.d.isAvailable()) {
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
        t2 t2Var = this.f31937f;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f31937f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f31937f.getContext(), false, false, false, false);
        this.Z = t2Var;
        t2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.Z;
        t2Var2.f32155a0 = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(this));
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f31943y);
                }
                t2 t2Var = this.Z;
                if (t2Var == null) {
                    t2Var = this.f31937f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f31943y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.f31943y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f31943y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = h9.d(user.f20185id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f31939r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = h9.d(chat.f20038id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f31939r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f31942x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f31941w != z12) {
            this.f31940s.animate().cancel();
            ViewPropertyAnimator animate = this.f31940s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            tr trVar = tr.f31141f;
            duration.setInterpolator(trVar).start();
            this.f31939r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f31939r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(trVar).start();
            this.f31937f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f31937f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(trVar).start();
            this.f31941w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f31935c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f31935c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f31934b, this.d, this.f31935c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f16974b = f13;
        kVar.f16975c = true;
        o1.l lVar = kVar.f16984u;
        float A = a4.a.A(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (A >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16991i = dp;
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.f16974b = this.R;
        kVar2.f16975c = true;
        kVar2.f16984u.f16991i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
                    this.f31932a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f31932a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(tr.f31141f);
        this.L.addUpdateListener(new r0(this, 2));
        this.L.addListener(new f1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

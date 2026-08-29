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
import i7.f6;
import lh.d5;
import nh.m6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yf0;
import org.webrtc.RendererCommon;
public final class h1 implements NotificationCenter.NotificationCenterDelegate, cf.a {
    public static final av0 X = new av0(new xo0(9), new xo0(10));
    public static final av0 Y = new av0(new xo0(11), new xo0(12));
    public static final h1 Z;
    public AccountInstance A;
    public ScaleGestureDetector B;
    public o4.g C;
    public boolean D;
    public boolean E;
    public View F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public af.g K;
    public float L;
    public float M;
    public float N;
    public o1.k O;
    public o1.k P;
    public Float Q;
    public boolean R;
    public boolean S;
    public m6 T;
    public c2.p U;
    public u2 V;
    public boolean W;
    public float f33731a;
    public WindowManager f33732b;
    public WindowManager.LayoutParams f33733c;
    public org.telegram.ui.g d;
    public bg.d1 f33734e;
    public u2 f33735f;
    public FrameLayout h;
    public h f33736n;
    public t9 f33737r;
    public cg.h0 f33738s;
    public TLRPC.GroupCallParticipant v;
    public boolean f33739w;
    public boolean f33740x;
    public boolean f33741y;

    static {
        ?? obj = new Object();
        obj.f33731a = 1.4f;
        obj.f33736n = new h();
        obj.f33739w = true;
        obj.L = 1.0f;
        obj.T = new m6(obj, 15);
        Z = obj;
    }

    public static void j() {
        h1 h1Var = Z;
        if (h1Var.R) {
            h1Var.R = false;
            AndroidUtilities.runOnUIThread(new g5(20), 100L);
            h1Var.A.getNotificationCenter().removeObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.A.getNotificationCenter().removeObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(h1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = h1Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (h1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(h1Var.T);
                h1Var.S = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(jr.f29800f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new e1(h1Var));
            animatorSet.start();
            af.g gVar = h1Var.K;
            if (gVar != null) {
                gVar.c();
                h1Var.K = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        h1 h1Var = Z;
        h1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !h1Var.R) {
            h1Var.R = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            h1Var.A = accountInstance;
            accountInstance.getNotificationCenter().addObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.A.getNotificationCenter().addObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(h1Var, NotificationCenter.didEndCall);
            h1Var.I = h1Var.m();
            h1Var.J = h1Var.l();
            h1Var.L = 1.0f;
            h1Var.G = false;
            o1.k kVar = new o1.k(h1Var, X);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f19045u = lVar;
            h1Var.O = kVar;
            o1.k kVar2 = new o1.k(h1Var, Y);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f19045u = lVar2;
            h1Var.P = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new yf0(h1Var, 1));
            h1Var.B = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                h1Var.B.setStylusScaleEnabled(false);
            }
            h1Var.C = new o4.g(activity2, new f1(h1Var, scaledTouchSlop));
            h1Var.f33734e = new bg.d1(h1Var, activity2);
            org.telegram.ui.g gVar = new org.telegram.ui.g(h1Var, activity2, 2);
            h1Var.d = gVar;
            gVar.addView(h1Var.f33734e, f6.c(-1.0f, -1));
            h1Var.f33734e.setOutlineProvider(new eg.k1(15));
            h1Var.f33734e.setClipToOutline(true);
            h1Var.f33734e.setBackgroundColor(g6.w0(null, g6.f23126gg, false));
            t9 t9Var = new t9(activity2);
            h1Var.f33737r = t9Var;
            h1Var.f33734e.addView(t9Var, f6.c(-1.0f, -1));
            u2 u2Var = new u2(activity2, false, false, false, false);
            h1Var.f33735f = u2Var;
            u2Var.setAlpha(0.0f);
            h1Var.f33735f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            u2 u2Var2 = h1Var.f33735f;
            u2Var2.T = 0;
            u2Var2.d.setRotateTextureWithScreen(true);
            h1Var.f33735f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(h1Var));
            h1Var.f33734e.addView(h1Var.f33735f, f6.c(-1.0f, -1));
            cg.h0 h0Var = new cg.h0(h1Var, activity2, 24);
            h1Var.f33738s = h0Var;
            h1Var.f33734e.addView(h0Var, f6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            h1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            h1Var.h.addView(view, f6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = g6.f23143hg;
            imageView.setColorFilter(g6.w0(null, i11, false));
            int i12 = g6.f23152i6;
            imageView.setBackground(g6.f0(g6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new bg.n(17));
            float f9 = 38;
            float f10 = 4;
            h1Var.h.addView(imageView, f6.d(38, f9, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(g6.w0(null, i11, false));
            imageView2.setBackground(g6.f0(g6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new mh.n(activity2, 10));
            h1Var.h.addView(imageView2, f6.d(38, f9, 5, 0.0f, f10, 48, 0.0f));
            h1Var.f33734e.addView(h1Var.h, f6.c(-1.0f, -1));
            h1Var.f33732b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = df.d.b(activity2, false);
            h1Var.f33733c = b10;
            int i13 = h1Var.I;
            b10.width = i13;
            b10.height = h1Var.J;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            h1Var.M = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = h1Var.f33733c;
            float dp3 = (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f);
            h1Var.N = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = h1Var.f33733c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            h1Var.d.setAlpha(0.0f);
            h1Var.d.setScaleX(0.1f);
            h1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f33732b, h1Var.d, h1Var.f33733c);
            h1Var.f33732b.addView(h1Var.d, h1Var.f33733c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(jr.f29800f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new c1(h1Var, 0));
            animatorSet.start();
            h1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            af.g gVar2 = h1Var.K;
            if (gVar2 != null) {
                gVar2.c();
                h1Var.K = null;
            }
            if (activity != null && df.d.a(activity) == 1) {
                af.f fVar = new af.f(activity, h1Var);
                fVar.f388c = "pip-rtmp-video";
                fVar.f389e = 1;
                fVar.d = AndroidUtilities.dp(10.0f);
                fVar.f393j = h1Var.d;
                fVar.f394k = h1Var.f33735f.getPlaceholderView();
                h1Var.K = fVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.U = pVar;
        af.g gVar = this.K;
        if (gVar != null && gVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f33733c;
            int width = this.K.h.f5546a.width();
            this.I = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f33733c;
            int height = this.K.h.f5546a.height();
            this.J = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f33732b.addView(this.d, this.f33733c);
        this.d.invalidate();
        u2 u2Var = this.V;
        if (u2Var != null) {
            u2Var.d.release();
            this.V = null;
        }
        i(true);
    }

    @Override
    public final Bitmap b() {
        u2 u2Var = this.V;
        if (u2Var != null && u2Var.d.isAvailable()) {
            return this.V.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        u2 u2Var = this.f33735f;
        if (u2Var != null && u2Var.d.isAvailable()) {
            return this.f33735f.d.getBitmap();
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
    public final void e(c2.p pVar) {
        this.U = pVar;
        u2 u2Var = this.f33735f;
        if (u2Var != null) {
            u2Var.d.clearFirstFrame();
        }
        i(true);
        this.W = true;
        this.f33732b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        u2 u2Var = new u2(this.f33735f.getContext(), false, false, false, false);
        this.V = u2Var;
        u2Var.d.setOpaque(false);
        this.V.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        u2 u2Var2 = this.V;
        u2Var2.T = 0;
        u2Var2.d.setRotateTextureWithScreen(true);
        this.V.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d1(this));
        View view = this.V.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.V;
    }

    public final void i(boolean z10) {
        float dp;
        float f9;
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f33741y);
                }
                u2 u2Var = this.V;
                if (u2Var == null) {
                    u2Var = this.f33735f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33741y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(u2Var.d, this.f33741y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f33741y, u2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = e9.d(user.f22539id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f33737r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = e9.d(chat.f22392id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f33737r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f33740x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f33739w != z12) {
            this.f33738s.animate().cancel();
            ViewPropertyAnimator animate = this.f33738s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            jr jrVar = jr.f29800f;
            duration.setInterpolator(jrVar).start();
            this.f33737r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f33737r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(jrVar).start();
            this.f33735f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f33735f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(jrVar).start();
            this.f33739w = z12;
        }
        if (this.I == m() * this.L && this.J == l() * this.L) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f33733c;
        int m10 = (int) (m() * this.L);
        this.I = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f33733c;
        int l10 = (int) (l() * this.L);
        this.J = l10;
        layoutParams2.height = l10;
        AndroidUtilities.updateViewLayout(this.f33732b, this.d, this.f33733c);
        o1.k kVar = this.O;
        float f13 = this.M;
        kVar.f19036b = f13;
        kVar.f19037c = true;
        o1.l lVar = kVar.f19045u;
        float d11 = a4.w.d(m(), this.L, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (d11 >= f14 / 2.0f) {
            dp = (f14 - (m() * this.L)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f19052i = dp;
        this.O.f();
        o1.k kVar2 = this.P;
        kVar2.f19036b = this.N;
        kVar2.f19037c = true;
        kVar2.f19045u.f19052i = i7.w.a(f9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.L)) - AndroidUtilities.dp(16.0f));
        this.P.f();
    }

    public final float k() {
        float f9;
        if (this.Q == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f10 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f10 != 0.0f) {
                    f9 = 1.0f / f10;
                    this.Q = Float.valueOf(f9);
                    Point point = AndroidUtilities.displaySize;
                    this.f33731a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f9 = 0.5625f;
            this.Q = Float.valueOf(f9);
            Point point2 = AndroidUtilities.displaySize;
            this.f33731a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.Q.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f9;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f9 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f9 = 0.6f;
        }
        return (int) (min * f9);
    }

    public final void o(boolean z10) {
        float f9;
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration(200L);
        this.H = duration;
        duration.setInterpolator(jr.f29800f);
        this.H.addUpdateListener(new d5(this, 18));
        this.H.addListener(new c1(this, 1));
        this.H.start();
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

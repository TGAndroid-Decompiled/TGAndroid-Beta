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
import k7.b6;
import nh.e5;
import nh.n5;
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
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.webrtc.RendererCommon;
public final class g1 implements NotificationCenter.NotificationCenterDelegate, ef.a {
    public static final iv0 Y = new iv0(new kh0(14), new kh0(15));
    public static final iv0 Z = new iv0(new kh0(16), new kh0(17));
    public static final g1 f29636a0;
    public AccountInstance B;
    public ScaleGestureDetector C;
    public org.telegram.ui.Cells.f1 D;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public cf.f L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public n5 U;
    public c2.p V;
    public s2 W;
    public boolean X;
    public float f29637a;
    public WindowManager f29638b;
    public WindowManager.LayoutParams f29639c;
    public org.telegram.ui.g d;
    public ah.d e;
    public s2 f29640f;
    public FrameLayout h;
    public h f29641n;
    public p9 f29642r;
    public eg.h0 f29643s;
    public TLRPC.GroupCallParticipant v;
    public boolean f29644w;
    public boolean f29645x;
    public boolean f29646y;

    static {
        ?? obj = new Object();
        obj.f29637a = 1.4f;
        obj.f29641n = new h();
        obj.f29644w = true;
        obj.M = 1.0f;
        obj.U = new n5(obj, 20);
        f29636a0 = obj;
    }

    public static void j() {
        g1 g1Var = f29636a0;
        if (g1Var.S) {
            g1Var.S = false;
            AndroidUtilities.runOnUIThread(new mc(16), 100L);
            g1Var.B.getNotificationCenter().removeObserver(g1Var, NotificationCenter.groupCallUpdated);
            g1Var.B.getNotificationCenter().removeObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(g1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = g1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(g1Var.U);
                g1Var.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f27346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new d1(g1Var));
            animatorSet.start();
            cf.f fVar = g1Var.L;
            if (fVar != null) {
                fVar.c();
                g1Var.L = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        g1 g1Var = f29636a0;
        g1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !g1Var.S) {
            g1Var.S = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            g1Var.B = accountInstance;
            accountInstance.getNotificationCenter().addObserver(g1Var, NotificationCenter.groupCallUpdated);
            g1Var.B.getNotificationCenter().addObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(g1Var, NotificationCenter.didEndCall);
            g1Var.J = g1Var.m();
            g1Var.K = g1Var.l();
            g1Var.M = 1.0f;
            g1Var.H = false;
            o1.j jVar = new o1.j(g1Var, Y);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f16198u = kVar;
            g1Var.P = jVar;
            o1.j jVar2 = new o1.j(g1Var, Z);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f16198u = kVar2;
            g1Var.Q = jVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new hg0(g1Var, 1));
            g1Var.C = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                g1Var.C.setStylusScaleEnabled(false);
            }
            g1Var.D = new org.telegram.ui.Cells.f1(activity2, new e1(g1Var, scaledTouchSlop));
            g1Var.e = new ah.d(g1Var, activity2);
            org.telegram.ui.g gVar = new org.telegram.ui.g(g1Var, activity2, 2);
            g1Var.d = gVar;
            gVar.addView(g1Var.e, b6.c(-1.0f, -1));
            g1Var.e.setOutlineProvider(new gg.j1(13));
            g1Var.e.setClipToOutline(true);
            g1Var.e.setBackgroundColor(j6.w0(null, j6.f19970gg, false));
            p9 p9Var = new p9(activity2);
            g1Var.f29642r = p9Var;
            g1Var.e.addView(p9Var, b6.c(-1.0f, -1));
            s2 s2Var = new s2(activity2, false, false, false, false);
            g1Var.f29640f = s2Var;
            s2Var.setAlpha(0.0f);
            g1Var.f29640f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            s2 s2Var2 = g1Var.f29640f;
            s2Var2.U = 0;
            s2Var2.d.setRotateTextureWithScreen(true);
            g1Var.f29640f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new f1(g1Var));
            g1Var.e.addView(g1Var.f29640f, b6.c(-1.0f, -1));
            eg.h0 h0Var = new eg.h0(g1Var, activity2, 22);
            g1Var.f29643s = h0Var;
            g1Var.e.addView(h0Var, b6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            g1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            g1Var.h.addView(view, b6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = j6.f19987hg;
            imageView.setColorFilter(j6.w0(null, i11, false));
            int i12 = j6.f19996i6;
            imageView.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new dg.m(15));
            float f10 = 38;
            float f11 = 4;
            g1Var.h.addView(imageView, b6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(j6.w0(null, i11, false));
            imageView2.setBackground(j6.f0(j6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new oh.n(activity2, 4));
            g1Var.h.addView(imageView2, b6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            g1Var.e.addView(g1Var.h, b6.c(-1.0f, -1));
            g1Var.f29638b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = ff.d.b(activity2, false);
            g1Var.f29639c = b10;
            int i13 = g1Var.J;
            b10.width = i13;
            b10.height = g1Var.K;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            g1Var.N = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = g1Var.f29639c;
            float dp3 = (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f);
            g1Var.O = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = g1Var.f29639c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            g1Var.d.setAlpha(0.0f);
            g1Var.d.setScaleX(0.1f);
            g1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f29638b, g1Var.d, g1Var.f29639c);
            g1Var.f29638b.addView(g1Var.d, g1Var.f29639c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f27346f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new b1(g1Var, 0));
            animatorSet.start();
            g1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            cf.f fVar = g1Var.L;
            if (fVar != null) {
                fVar.c();
                g1Var.L = null;
            }
            if (activity != null && ff.d.a(activity) == 1) {
                cf.e eVar = new cf.e(activity, g1Var);
                eVar.f2287c = "pip-rtmp-video";
                eVar.e = 1;
                eVar.d = AndroidUtilities.dp(10.0f);
                eVar.f2291j = g1Var.d;
                eVar.f2292k = g1Var.f29640f.getPlaceholderView();
                g1Var.L = eVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.V = pVar;
        cf.f fVar = this.L;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f29639c;
            int width = this.L.h.f6114a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f29639c;
            int height = this.L.h.f6114a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.X = false;
        this.f29638b.addView(this.d, this.f29639c);
        this.d.invalidate();
        s2 s2Var = this.W;
        if (s2Var != null) {
            s2Var.d.release();
            this.W = null;
        }
        i(true);
    }

    @Override
    public final Bitmap b() {
        s2 s2Var = this.W;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.W.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        s2 s2Var = this.f29640f;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f29640f.d.getBitmap();
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
        this.V = pVar;
        s2 s2Var = this.f29640f;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        i(true);
        this.X = true;
        this.f29638b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        s2 s2Var = new s2(this.f29640f.getContext(), false, false, false, false);
        this.W = s2Var;
        s2Var.d.setOpaque(false);
        this.W.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        s2 s2Var2 = this.W;
        s2Var2.U = 0;
        s2Var2.d.setRotateTextureWithScreen(true);
        this.W.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new c1(this));
        View view = this.W.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.W;
    }

    public final void i(boolean z4) {
        float dp;
        float f10;
        float f11;
        float f12;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z10;
        int d;
        int d10;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z11 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z4 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f29646y);
                }
                s2 s2Var = this.W;
                if (s2Var == null) {
                    s2Var = this.f29640f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29646y = z10;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(s2Var.d, this.f29646y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f29646y, s2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = z8.d(user.f19331id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29642r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = z8.d(chat.f19184id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29642r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f29645x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z11 = true;
        }
        if (this.f29644w != z11) {
            this.f29643s.animate().cancel();
            ViewPropertyAnimator animate = this.f29643s.animate();
            float f13 = 0.0f;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            nr nrVar = nr.f27346f;
            duration.setInterpolator(nrVar).start();
            this.f29642r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f29642r.animate();
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setDuration(150L).setInterpolator(nrVar).start();
            this.f29640f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f29640f.animate();
            if (!z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setDuration(150L).setInterpolator(nrVar).start();
            this.f29644w = z11;
        }
        if (this.J == m() * this.M && this.K == l() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f29639c;
        int m9 = (int) (m() * this.M);
        this.J = m9;
        layoutParams.width = m9;
        WindowManager.LayoutParams layoutParams2 = this.f29639c;
        int l10 = (int) (l() * this.M);
        this.K = l10;
        layoutParams2.height = l10;
        AndroidUtilities.updateViewLayout(this.f29638b, this.d, this.f29639c);
        o1.j jVar = this.P;
        float f14 = this.N;
        jVar.f16190b = f14;
        jVar.f16191c = true;
        o1.k kVar = jVar.f16198u;
        float d11 = android.support.v4.media.a.d(m(), this.M, 2.0f, f14);
        float f15 = AndroidUtilities.displaySize.x;
        if (d11 >= f15 / 2.0f) {
            dp = (f15 - (m() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f16204i = dp;
        this.P.f();
        o1.j jVar2 = this.Q;
        jVar2.f16190b = this.O;
        jVar2.f16191c = true;
        jVar2.f16198u.f16204i = k7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final float k() {
        float f10;
        if (this.R == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f11 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                    this.R = Float.valueOf(f10);
                    Point point = AndroidUtilities.displaySize;
                    this.f29637a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f10 = 0.5625f;
            this.R = Float.valueOf(f10);
            Point point2 = AndroidUtilities.displaySize;
            this.f29637a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.R.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f10;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public final void o(boolean z4) {
        float f10;
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(nr.f27346f);
        this.I.addUpdateListener(new e5(this, 6));
        this.I.addListener(new b1(this, 1));
        this.I.start();
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

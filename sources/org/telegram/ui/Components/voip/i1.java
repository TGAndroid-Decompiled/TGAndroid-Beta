package org.telegram.ui.Components.voip;

import a8.ee;
import a8.fg;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.cc;
import fi.e4;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.y9;
import org.webrtc.RendererCommon;
public final class i1 implements NotificationCenter.NotificationCenterDelegate, uf.a {
    public static final qw0 f33947b0 = new qw0(new Object(), new c1(0));
    public static final qw0 f33948c0 = new qw0(new c1(1), new c1(2));
    public static final i1 f33949d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public jg.s0 G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public sf.d O;
    public float P;
    public float Q;
    public float R;
    public o1.j S;
    public o1.j T;
    public Float U;
    public boolean V;
    public boolean W;
    public k2.c X;
    public fg Y;
    public t2 Z;
    public float f33950a;
    public boolean f33951a0;
    public WindowManager f33952b;
    public WindowManager.LayoutParams f33953c;
    public org.telegram.ui.e d;
    public bh.p e;
    public t2 f33954f;
    public FrameLayout h;
    public h f33955n;
    public y9 f33956r;
    public cc f33957s;
    public TLRPC.GroupCallParticipant v;
    public boolean f33958w;
    public boolean f33959x;
    public boolean f33960y;

    static {
        ?? obj = new Object();
        obj.f33950a = 1.4f;
        obj.f33955n = new h();
        obj.f33958w = true;
        obj.P = 1.0f;
        obj.X = new k2.c(obj, 17);
        f33949d0 = obj;
    }

    public static void j() {
        i1 i1Var = f33949d0;
        if (i1Var.V) {
            i1Var.V = false;
            AndroidUtilities.runOnUIThread(new k5(23), 100L);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.groupCallUpdated);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(i1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = i1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(i1Var.X);
                i1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ds.f27530f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new f1(i1Var));
            animatorSet.start();
            sf.d dVar = i1Var.O;
            if (dVar != null) {
                dVar.c();
                i1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        i1 i1Var = f33949d0;
        i1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !i1Var.V) {
            i1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            i1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(i1Var, NotificationCenter.groupCallUpdated);
            i1Var.E.getNotificationCenter().addObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(i1Var, NotificationCenter.didEndCall);
            i1Var.M = i1Var.m();
            i1Var.N = i1Var.l();
            i1Var.P = 1.0f;
            i1Var.K = false;
            o1.j jVar = new o1.j(i1Var, f33947b0);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f18968u = kVar;
            i1Var.S = jVar;
            o1.j jVar2 = new o1.j(i1Var, f33948c0);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f18968u = kVar2;
            i1Var.T = jVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new ng.b(i1Var, 2));
            i1Var.F = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            i1Var.F.setStylusScaleEnabled(false);
            i1Var.G = new jg.s0(activity2, new g1(i1Var, scaledTouchSlop));
            i1Var.e = new bh.p(i1Var, activity2);
            org.telegram.ui.e eVar = new org.telegram.ui.e(i1Var, activity2, 2);
            i1Var.d = eVar;
            eVar.addView(i1Var.e, kb1.g(-1.0f, -1));
            i1Var.e.setOutlineProvider(new ag.v0(19));
            i1Var.e.setClipToOutline(true);
            f7.i(y6.gg, i1Var.e, null);
            y9 y9Var = new y9(activity2);
            i1Var.f33956r = y9Var;
            i1Var.e.addView(y9Var, kb1.g(-1.0f, -1));
            t2 t2Var = new t2(activity2, false, false, false, false);
            i1Var.f33954f = t2Var;
            t2Var.setAlpha(0.0f);
            i1Var.f33954f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            t2 t2Var2 = i1Var.f33954f;
            t2Var2.f34218a0 = 0;
            t2Var2.d.setRotateTextureWithScreen(true);
            i1Var.f33954f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h1(i1Var));
            i1Var.e.addView(i1Var.f33954f, kb1.g(-1.0f, -1));
            cc ccVar = new cc(i1Var, activity2, 28);
            i1Var.f33957s = ccVar;
            i1Var.e.addView(ccVar, kb1.g(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            i1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            i1Var.h.addView(view, kb1.g(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i10 = y6.f23439hg;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            f7.t(imageView, i10, null, mode);
            int i11 = y6.f23449i6;
            imageView.setBackground(y6.g0(y6.x0(null, i11, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new bh.f(15));
            float f7 = 38;
            float f10 = 4;
            i1Var.h.addView(imageView, kb1.h(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            f7.t(imageView2, i10, null, mode);
            imageView2.setBackground(y6.g0(y6.x0(null, i11, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new ig.d0(activity2, 15));
            i1Var.h.addView(imageView2, kb1.h(38, f7, 5, 0.0f, f10, 48, 0.0f));
            i1Var.e.addView(i1Var.h, kb1.g(-1.0f, -1));
            i1Var.f33952b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = vf.b.b(activity2, false);
            i1Var.f33953c = b10;
            int i12 = i1Var.M;
            b10.width = i12;
            b10.height = i1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i12) - AndroidUtilities.dp(16.0f);
            i1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = i1Var.f33953c;
            float dp3 = (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f);
            i1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = i1Var.f33953c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            i1Var.d.setAlpha(0.0f);
            i1Var.d.setScaleX(0.1f);
            i1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f33952b, i1Var.d, i1Var.f33953c);
            i1Var.f33952b.addView(i1Var.d, i1Var.f33953c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ds.f27530f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new d1(i1Var, 0));
            animatorSet.start();
            i1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            sf.d dVar = i1Var.O;
            if (dVar != null) {
                dVar.c();
                i1Var.O = null;
            }
            if (activity != null && vf.b.a(activity) == 1) {
                sf.c cVar = new sf.c(activity, i1Var);
                cVar.f48158c = "pip-rtmp-video";
                cVar.e = 1;
                cVar.d = AndroidUtilities.dp(10.0f);
                cVar.f48162j = i1Var.d;
                cVar.f48163k = i1Var.f33954f.getPlaceholderView();
                i1Var.O = cVar.a();
            }
        }
    }

    @Override
    public final void a(fg fgVar) {
        this.Y = fgVar;
        t2 t2Var = this.f33954f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.f33951a0 = true;
        this.f33952b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(fg fgVar) {
        this.Y = fgVar;
        sf.d dVar = this.O;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f33953c;
            int width = ((Rect) this.O.h.f16246a).width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f33953c;
            int height = ((Rect) this.O.h.f16246a).height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f33951a0 = false;
        this.f33952b.addView(this.d, this.f33953c);
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
        t2 t2Var = this.f33954f;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f33954f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f33954f.getContext(), false, false, false, false);
        this.Z = t2Var;
        t2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.Z;
        t2Var2.f34218a0 = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e1(this));
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
        int f12;
        int f13;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f33960y);
                }
                t2 t2Var = this.Z;
                if (t2Var == null) {
                    t2Var = this.f33954f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33960y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.f33960y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f33960y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        f13 = j9.d(user.f22177id);
                    } else {
                        f13 = i0.a.f(0.2f, -16777216, -1);
                    }
                    this.f33956r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f13, -16777216), i0.a.f(0.4f, f13, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        f12 = j9.d(chat.f22028id);
                    } else {
                        f12 = i0.a.f(0.2f, -16777216, -1);
                    }
                    this.f33956r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f12, -16777216), i0.a.f(0.4f, f12, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f33959x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f33958w != z12) {
            this.f33957s.animate().cancel();
            ViewPropertyAnimator animate = this.f33957s.animate();
            float f14 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            ds dsVar = ds.f27530f;
            duration.setInterpolator(dsVar).start();
            this.f33956r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f33956r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(dsVar).start();
            this.f33954f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f33954f.animate();
            if (!z12) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setDuration(150L).setInterpolator(dsVar).start();
            this.f33958w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f33953c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f33953c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f33952b, this.d, this.f33953c);
        o1.j jVar = this.S;
        float f15 = this.Q;
        jVar.f18960b = f15;
        jVar.f18961c = true;
        o1.k kVar = jVar.f18968u;
        float C = a1.g.C(m(), this.P, 2.0f, f15);
        float f16 = AndroidUtilities.displaySize.x;
        if (C >= f16 / 2.0f) {
            dp = (f16 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18974i = dp;
        this.S.h();
        o1.j jVar2 = this.T;
        jVar2.f18960b = this.R;
        jVar2.f18961c = true;
        jVar2.f18968u.f18974i = ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
                    this.f33950a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f33950a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(ds.f27530f);
        this.L.addUpdateListener(new e4(this, 13));
        this.L.addListener(new d1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

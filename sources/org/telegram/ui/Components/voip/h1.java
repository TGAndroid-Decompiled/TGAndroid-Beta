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
import k7.c6;
import oh.f5;
import oh.t3;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
import org.webrtc.RendererCommon;
public final class h1 implements NotificationCenter.NotificationCenterDelegate, ef.a {
    public static final jv0 Y = new jv0(new mh0(14), new mh0(15));
    public static final jv0 Z = new jv0(new mh0(16), new mh0(17));
    public static final h1 f32066a0;
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
    public t3 U;
    public c2.p V;
    public t2 W;
    public boolean X;
    public float f32067a;
    public WindowManager f32068b;
    public WindowManager.LayoutParams f32069c;
    public org.telegram.ui.g d;
    public ag.l f32070e;
    public t2 f32071f;
    public FrameLayout h;
    public h f32072n;
    public p9 f32073r;
    public fg.h0 f32074s;
    public TLRPC.GroupCallParticipant v;
    public boolean f32075w;
    public boolean f32076x;
    public boolean f32077y;

    static {
        ?? obj = new Object();
        obj.f32067a = 1.4f;
        obj.f32072n = new h();
        obj.f32075w = true;
        obj.M = 1.0f;
        obj.U = new t3(obj, 19);
        f32066a0 = obj;
    }

    public static void j() {
        h1 h1Var = f32066a0;
        if (h1Var.S) {
            h1Var.S = false;
            AndroidUtilities.runOnUIThread(new jc(18), 100L);
            h1Var.B.getNotificationCenter().removeObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.B.getNotificationCenter().removeObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(h1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = h1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (h1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(h1Var.U);
                h1Var.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(pr.f30183f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new e1(h1Var));
            animatorSet.start();
            cf.f fVar = h1Var.L;
            if (fVar != null) {
                fVar.c();
                h1Var.L = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        h1 h1Var = f32066a0;
        h1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !h1Var.S) {
            h1Var.S = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            h1Var.B = accountInstance;
            accountInstance.getNotificationCenter().addObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.B.getNotificationCenter().addObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(h1Var, NotificationCenter.didEndCall);
            h1Var.J = h1Var.m();
            h1Var.K = h1Var.l();
            h1Var.M = 1.0f;
            h1Var.H = false;
            o1.j jVar = new o1.j(h1Var, Y);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f16336u = kVar;
            h1Var.P = jVar;
            o1.j jVar2 = new o1.j(h1Var, Z);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f16336u = kVar2;
            h1Var.Q = jVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new jg0(h1Var, 1));
            h1Var.C = scaleGestureDetector;
            int i10 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i10 >= 23) {
                h1Var.C.setStylusScaleEnabled(false);
            }
            h1Var.D = new org.telegram.ui.Cells.f1(activity2, new f1(h1Var, scaledTouchSlop));
            h1Var.f32070e = new ag.l(h1Var, activity2);
            org.telegram.ui.g gVar = new org.telegram.ui.g(h1Var, activity2, 2);
            h1Var.d = gVar;
            gVar.addView(h1Var.f32070e, c6.c(-1.0f, -1));
            h1Var.f32070e.setOutlineProvider(new hg.j1(13));
            h1Var.f32070e.setClipToOutline(true);
            h1Var.f32070e.setBackgroundColor(k6.w0(null, k6.f21724gg, false));
            p9 p9Var = new p9(activity2);
            h1Var.f32073r = p9Var;
            h1Var.f32070e.addView(p9Var, c6.c(-1.0f, -1));
            t2 t2Var = new t2(activity2, false, false, false, false);
            h1Var.f32071f = t2Var;
            t2Var.setAlpha(0.0f);
            h1Var.f32071f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            t2 t2Var2 = h1Var.f32071f;
            t2Var2.U = 0;
            t2Var2.d.setRotateTextureWithScreen(true);
            h1Var.f32071f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(h1Var));
            h1Var.f32070e.addView(h1Var.f32071f, c6.c(-1.0f, -1));
            fg.h0 h0Var = new fg.h0(h1Var, activity2, 22);
            h1Var.f32074s = h0Var;
            h1Var.f32070e.addView(h0Var, c6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            h1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            h1Var.h.addView(view, c6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = k6.f21741hg;
            imageView.setColorFilter(k6.w0(null, i11, false));
            int i12 = k6.f21750i6;
            imageView.setBackground(k6.f0(k6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new eg.m(15));
            float f10 = 38;
            float f11 = 4;
            h1Var.h.addView(imageView, c6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(k6.w0(null, i11, false));
            imageView2.setBackground(k6.f0(k6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            h1Var.h.addView(imageView2, c6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            h1Var.f32070e.addView(h1Var.h, c6.c(-1.0f, -1));
            h1Var.f32068b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = ff.d.b(activity2, false);
            h1Var.f32069c = b10;
            int i13 = h1Var.J;
            b10.width = i13;
            b10.height = h1Var.K;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            h1Var.N = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = h1Var.f32069c;
            float dp3 = (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f);
            h1Var.O = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = h1Var.f32069c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            h1Var.d.setAlpha(0.0f);
            h1Var.d.setScaleX(0.1f);
            h1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f32068b, h1Var.d, h1Var.f32069c);
            h1Var.f32068b.addView(h1Var.d, h1Var.f32069c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(pr.f30183f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new c1(h1Var, 0));
            animatorSet.start();
            h1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            cf.f fVar = h1Var.L;
            if (fVar != null) {
                fVar.c();
                h1Var.L = null;
            }
            if (activity != null && ff.d.a(activity) == 1) {
                cf.e eVar = new cf.e(activity, h1Var);
                eVar.f2482c = "pip-rtmp-video";
                eVar.f2483e = 1;
                eVar.d = AndroidUtilities.dp(10.0f);
                eVar.f2487j = h1Var.d;
                eVar.f2488k = h1Var.f32071f.getPlaceholderView();
                h1Var.L = eVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.V = pVar;
        cf.f fVar = this.L;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f32069c;
            int width = this.L.h.f6233a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f32069c;
            int height = this.L.h.f6233a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.X = false;
        this.f32068b.addView(this.d, this.f32069c);
        this.d.invalidate();
        t2 t2Var = this.W;
        if (t2Var != null) {
            t2Var.d.release();
            this.W = null;
        }
        i(true);
    }

    @Override
    public final Bitmap b() {
        t2 t2Var = this.W;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.W.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        t2 t2Var = this.f32071f;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f32071f.d.getBitmap();
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
        t2 t2Var = this.f32071f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.X = true;
        this.f32068b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f32071f.getContext(), false, false, false, false);
        this.W = t2Var;
        t2Var.d.setOpaque(false);
        this.W.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.W;
        t2Var2.U = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.W.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d1(this));
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f32077y);
                }
                t2 t2Var = this.W;
                if (t2Var == null) {
                    t2Var = this.f32071f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32077y = z10;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.f32077y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f32077y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = z8.d(user.f20990id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32073r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = z8.d(chat.f20843id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f32073r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f32076x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z11 = true;
        }
        if (this.f32075w != z11) {
            this.f32074s.animate().cancel();
            ViewPropertyAnimator animate = this.f32074s.animate();
            float f13 = 0.0f;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            pr prVar = pr.f30183f;
            duration.setInterpolator(prVar).start();
            this.f32073r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f32073r.animate();
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setDuration(150L).setInterpolator(prVar).start();
            this.f32071f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f32071f.animate();
            if (!z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setDuration(150L).setInterpolator(prVar).start();
            this.f32075w = z11;
        }
        if (this.J == m() * this.M && this.K == l() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f32069c;
        int m9 = (int) (m() * this.M);
        this.J = m9;
        layoutParams.width = m9;
        WindowManager.LayoutParams layoutParams2 = this.f32069c;
        int l10 = (int) (l() * this.M);
        this.K = l10;
        layoutParams2.height = l10;
        AndroidUtilities.updateViewLayout(this.f32068b, this.d, this.f32069c);
        o1.j jVar = this.P;
        float f14 = this.N;
        jVar.f16327b = f14;
        jVar.f16328c = true;
        o1.k kVar = jVar.f16336u;
        float d11 = android.support.v4.media.a.d(m(), this.M, 2.0f, f14);
        float f15 = AndroidUtilities.displaySize.x;
        if (d11 >= f15 / 2.0f) {
            dp = (f15 - (m() * this.M)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f16343i = dp;
        this.P.f();
        o1.j jVar2 = this.Q;
        jVar2.f16327b = this.O;
        jVar2.f16328c = true;
        jVar2.f16336u.f16343i = k7.o.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.M)) - AndroidUtilities.dp(16.0f));
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
                    this.f32067a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f10 = 0.5625f;
            this.R = Float.valueOf(f10);
            Point point2 = AndroidUtilities.displaySize;
            this.f32067a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(pr.f30183f);
        this.I.addUpdateListener(new f5(this, 5));
        this.I.addListener(new c1(this, 1));
        this.I.start();
    }

    @Override
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

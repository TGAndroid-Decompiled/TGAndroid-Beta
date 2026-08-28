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
import g7.e6;
import kh.g4;
import kh.x8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.z8;
import org.webrtc.RendererCommon;
public final class g1 implements NotificationCenter.NotificationCenterDelegate, ze.a {
    public static final pu0 X = new pu0(new if0(15), new if0(16));
    public static final pu0 Y = new pu0(new if0(17), new if0(18));
    public static final g1 Z;
    public AccountInstance A;
    public ScaleGestureDetector B;
    public m5.c0 C;
    public boolean D;
    public boolean E;
    public View F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public xe.d K;
    public float L;
    public float M;
    public float N;
    public o1.j O;
    public o1.j P;
    public Float Q;
    public boolean R;
    public boolean S;
    public mh.m2 T;
    public af.f U;
    public r2 V;
    public boolean W;
    public float f33517a;
    public WindowManager f33518b;
    public WindowManager.LayoutParams f33519c;
    public org.telegram.ui.f d;
    public fh.v f33520e;
    public r2 f33521f;
    public FrameLayout h;
    public h f33522n;
    public o9 f33523r;
    public fh.l2 f33524s;
    public TLRPC.GroupCallParticipant v;
    public boolean f33525w;
    public boolean f33526x;
    public boolean f33527y;

    static {
        ?? obj = new Object();
        obj.f33517a = 1.4f;
        obj.f33522n = new h();
        obj.f33525w = true;
        obj.L = 1.0f;
        obj.T = new mh.m2(obj, 6);
        Z = obj;
    }

    public static void j() {
        g1 g1Var = Z;
        if (g1Var.R) {
            g1Var.R = false;
            AndroidUtilities.runOnUIThread(new hc(18), 100L);
            g1Var.A.getNotificationCenter().removeObserver(g1Var, NotificationCenter.groupCallUpdated);
            g1Var.A.getNotificationCenter().removeObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(g1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = g1Var.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (g1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(g1Var.T);
                g1Var.S = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f28844f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new d1(g1Var));
            animatorSet.start();
            xe.d dVar = g1Var.K;
            if (dVar != null) {
                dVar.c();
                g1Var.K = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        g1 g1Var = Z;
        g1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !g1Var.R) {
            g1Var.R = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            g1Var.A = accountInstance;
            accountInstance.getNotificationCenter().addObserver(g1Var, NotificationCenter.groupCallUpdated);
            g1Var.A.getNotificationCenter().addObserver(g1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(g1Var, NotificationCenter.didEndCall);
            g1Var.I = g1Var.m();
            g1Var.J = g1Var.l();
            g1Var.L = 1.0f;
            g1Var.G = false;
            o1.j jVar = new o1.j(g1Var, X);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f18800u = kVar;
            g1Var.O = jVar;
            o1.j jVar2 = new o1.j(g1Var, Y);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f18800u = kVar2;
            g1Var.P = jVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new mf0(g1Var, 1));
            g1Var.B = scaleGestureDetector;
            int i9 = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i9 >= 23) {
                g1Var.B.setStylusScaleEnabled(false);
            }
            g1Var.C = new m5.c0(activity2, new e1(g1Var, scaledTouchSlop));
            g1Var.f33520e = new fh.v(g1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(g1Var, activity2, 2);
            g1Var.d = fVar;
            fVar.addView(g1Var.f33520e, e6.c(-1.0f, -1));
            g1Var.f33520e.setOutlineProvider(new bg.q1(15));
            g1Var.f33520e.setClipToOutline(true);
            g1Var.f33520e.setBackgroundColor(f6.w0(null, f6.f23065gg, false));
            o9 o9Var = new o9(activity2);
            g1Var.f33523r = o9Var;
            g1Var.f33520e.addView(o9Var, e6.c(-1.0f, -1));
            r2 r2Var = new r2(activity2, false, false, false, false);
            g1Var.f33521f = r2Var;
            r2Var.setAlpha(0.0f);
            g1Var.f33521f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            r2 r2Var2 = g1Var.f33521f;
            r2Var2.T = 0;
            r2Var2.d.setRotateTextureWithScreen(true);
            g1Var.f33521f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new f1(g1Var));
            g1Var.f33520e.addView(g1Var.f33521f, e6.c(-1.0f, -1));
            fh.l2 l2Var = new fh.l2(g1Var, activity2, 26);
            g1Var.f33524s = l2Var;
            g1Var.f33520e.addView(l2Var, e6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            g1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            g1Var.h.addView(view, e6.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i10 = f6.f23083hg;
            imageView.setColorFilter(f6.w0(null, i10, false));
            int i11 = f6.f23092i6;
            imageView.setBackground(f6.f0(f6.w0(null, i11, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new fh.n(16));
            float f10 = 38;
            float f11 = 4;
            g1Var.h.addView(imageView, e6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(f6.w0(null, i10, false));
            imageView2.setBackground(f6.f0(f6.w0(null, i11, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new x8(activity2, 15));
            g1Var.h.addView(imageView2, e6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            g1Var.f33520e.addView(g1Var.h, e6.c(-1.0f, -1));
            g1Var.f33518b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = af.d.b(activity2, false);
            g1Var.f33519c = b10;
            int i12 = g1Var.I;
            b10.width = i12;
            b10.height = g1Var.J;
            float dp2 = (AndroidUtilities.displaySize.x - i12) - AndroidUtilities.dp(16.0f);
            g1Var.M = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = g1Var.f33519c;
            float dp3 = (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f);
            g1Var.N = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = g1Var.f33519c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            g1Var.d.setAlpha(0.0f);
            g1Var.d.setScaleX(0.1f);
            g1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f33518b, g1Var.d, g1Var.f33519c);
            g1Var.f33518b.addView(g1Var.d, g1Var.f33519c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f28844f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(g1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(g1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new b1(g1Var, 0));
            animatorSet.start();
            g1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            xe.d dVar = g1Var.K;
            if (dVar != null) {
                dVar.c();
                g1Var.K = null;
            }
            if (activity != null && af.d.a(activity) == 1) {
                xe.c cVar = new xe.c(activity, g1Var);
                cVar.f49135c = "pip-rtmp-video";
                cVar.f49136e = 1;
                cVar.d = AndroidUtilities.dp(10.0f);
                cVar.f49140j = g1Var.d;
                cVar.f49141k = g1Var.f33521f.getPlaceholderView();
                g1Var.K = cVar.a();
            }
        }
    }

    @Override
    public final Bitmap a() {
        r2 r2Var = this.V;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.V.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap c() {
        r2 r2Var = this.f33521f;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f33521f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didEndCall) {
            j();
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            i(false);
        }
    }

    @Override
    public final void e(af.f fVar) {
        this.U = fVar;
        xe.d dVar = this.K;
        if (dVar != null && dVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f33519c;
            int width = this.K.h.f153a.width();
            this.I = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f33519c;
            int height = this.K.h.f153a.height();
            this.J = height;
            layoutParams2.height = height;
        }
        this.W = false;
        this.f33518b.addView(this.d, this.f33519c);
        this.d.invalidate();
        r2 r2Var = this.V;
        if (r2Var != null) {
            r2Var.d.release();
            this.V = null;
        }
        i(true);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(af.f fVar) {
        this.U = fVar;
        r2 r2Var = this.f33521f;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        i(true);
        this.W = true;
        this.f33518b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final View h() {
        r2 r2Var = new r2(this.f33521f.getContext(), false, false, false, false);
        this.V = r2Var;
        r2Var.d.setOpaque(false);
        this.V.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = this.V;
        r2Var2.T = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        this.V.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new c1(this));
        View view = this.V.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.V;
    }

    public final void i(boolean z10) {
        float dp;
        float f10;
        float f11;
        float f12;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z11;
        int d;
        int d9;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f33527y);
                }
                r2 r2Var = this.V;
                if (r2Var == null) {
                    r2Var = this.f33521f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33527y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(r2Var.d, this.f33527y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f33527y, r2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d9 = z8.d(user.f22527id);
                    } else {
                        d9 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f33523r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d9, -16777216), i0.a.d(0.4f, d9, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = z8.d(chat.f22380id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f33523r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f33526x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f33525w != z12) {
            this.f33524s.animate().cancel();
            ViewPropertyAnimator animate = this.f33524s.animate();
            float f13 = 0.0f;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            gr grVar = gr.f28844f;
            duration.setInterpolator(grVar).start();
            this.f33523r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f33523r.animate();
            if (z12) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setDuration(150L).setInterpolator(grVar).start();
            this.f33521f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f33521f.animate();
            if (!z12) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setDuration(150L).setInterpolator(grVar).start();
            this.f33525w = z12;
        }
        if (this.I == m() * this.L && this.J == l() * this.L) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f33519c;
        int m10 = (int) (m() * this.L);
        this.I = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f33519c;
        int l10 = (int) (l() * this.L);
        this.J = l10;
        layoutParams2.height = l10;
        AndroidUtilities.updateViewLayout(this.f33518b, this.d, this.f33519c);
        o1.j jVar = this.O;
        float f14 = this.M;
        jVar.f18791b = f14;
        jVar.f18792c = true;
        o1.k kVar = jVar.f18800u;
        float d10 = aa.d.d(m(), this.L, 2.0f, f14);
        float f15 = AndroidUtilities.displaySize.x;
        if (d10 >= f15 / 2.0f) {
            dp = (f15 - (m() * this.L)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        kVar.f18807i = dp;
        this.O.f();
        o1.j jVar2 = this.P;
        jVar2.f18791b = this.N;
        jVar2.f18792c = true;
        jVar2.f18800u.f18807i = g7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.L)) - AndroidUtilities.dp(16.0f));
        this.P.f();
    }

    public final float k() {
        float f10;
        if (this.Q == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f11 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                    this.Q = Float.valueOf(f10);
                    Point point = AndroidUtilities.displaySize;
                    this.f33517a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f10 = 0.5625f;
            this.Q = Float.valueOf(f10);
            Point point2 = AndroidUtilities.displaySize;
            this.f33517a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.Q.floatValue();
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

    public final void o(boolean z10) {
        float f10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.H = duration;
        duration.setInterpolator(gr.f28844f);
        this.H.addUpdateListener(new g4(this, 9));
        this.H.addListener(new b1(this, 1));
        this.H.start();
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void d(Canvas canvas) {
    }
}

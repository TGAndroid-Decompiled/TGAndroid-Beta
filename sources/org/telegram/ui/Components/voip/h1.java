package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.ab;
import ji.d4;
import ji.o4;
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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zg0;
import org.webrtc.RendererCommon;
import w7.a6;
public final class h1 implements NotificationCenter.NotificationCenterDelegate, tf.a {
    public static final hw0 f30207b0 = new hw0(new zg0(15), new zg0(16));
    public static final hw0 f30208c0 = new hw0(new zg0(17), new zg0(18));
    public static final h1 f30209d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public d4 G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public rf.d O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public ig.t0 X;
    public com.google.android.gms.internal.cast.p Y;
    public r2 Z;
    public float f30210a;
    public boolean f30211a0;
    public WindowManager f30212b;
    public WindowManager.LayoutParams f30213c;
    public org.telegram.ui.f d;
    public ah.v e;
    public r2 f30214f;
    public FrameLayout h;
    public h f30215n;
    public z9 f30216r;
    public ab f30217s;
    public TLRPC.GroupCallParticipant v;
    public boolean f30218w;
    public boolean f30219x;
    public boolean f30220y;

    static {
        ?? obj = new Object();
        obj.f30210a = 1.4f;
        obj.f30215n = new h();
        obj.f30218w = true;
        obj.P = 1.0f;
        obj.X = new ig.t0(obj, 25);
        f30209d0 = obj;
    }

    public static void j() {
        h1 h1Var = f30209d0;
        if (h1Var.V) {
            h1Var.V = false;
            AndroidUtilities.runOnUIThread(new ve(16), 100L);
            h1Var.E.getNotificationCenter().removeObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.E.getNotificationCenter().removeObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(h1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = h1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (h1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(h1Var.X);
                h1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(es.f24771f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new e1(h1Var));
            animatorSet.start();
            rf.d dVar = h1Var.O;
            if (dVar != null) {
                dVar.c();
                h1Var.O = null;
            }
        }
    }

    public static void n(Activity activity) {
        Activity activity2;
        h1 h1Var = f30209d0;
        h1Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !h1Var.V) {
            h1Var.V = true;
            AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
            h1Var.E = accountInstance;
            accountInstance.getNotificationCenter().addObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.E.getNotificationCenter().addObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().addObserver(h1Var, NotificationCenter.didEndCall);
            h1Var.M = h1Var.m();
            h1Var.N = h1Var.l();
            h1Var.P = 1.0f;
            h1Var.K = false;
            o1.k kVar = new o1.k(h1Var, f30207b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f16468u = lVar;
            h1Var.S = kVar;
            o1.k kVar2 = new o1.k(h1Var, f30208c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f16468u = lVar2;
            h1Var.T = kVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = ApplicationLoader.applicationContext;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new mg.b(h1Var, 2));
            h1Var.F = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            h1Var.F.setStylusScaleEnabled(false);
            h1Var.G = new d4(activity2, new f1(h1Var, scaledTouchSlop));
            h1Var.e = new ah.v(h1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(h1Var, activity2, 2);
            h1Var.d = fVar;
            fVar.addView(h1Var.e, a6.d(-1.0f, -1));
            h1Var.e.setOutlineProvider(new bi.a2(17));
            h1Var.e.setClipToOutline(true);
            h1Var.e.setBackgroundColor(g6.x0(null, g6.f19964gg, false));
            z9 z9Var = new z9(activity2);
            h1Var.f30216r = z9Var;
            h1Var.e.addView(z9Var, a6.d(-1.0f, -1));
            r2 r2Var = new r2(activity2, false, false, false, false);
            h1Var.f30214f = r2Var;
            r2Var.setAlpha(0.0f);
            h1Var.f30214f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            r2 r2Var2 = h1Var.f30214f;
            r2Var2.f30421a0 = 0;
            r2Var2.d.setRotateTextureWithScreen(true);
            h1Var.f30214f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(h1Var));
            h1Var.e.addView(h1Var.f30214f, a6.d(-1.0f, -1));
            ab abVar = new ab(h1Var, activity2, 27);
            h1Var.f30217s = abVar;
            h1Var.e.addView(abVar, a6.d(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            h1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            h1Var.h.addView(view, a6.d(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i10 = g6.f19980hg;
            imageView.setColorFilter(g6.x0(null, i10, false));
            int i11 = g6.f19990i6;
            imageView.setBackground(g6.g0(g6.x0(null, i11, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ah.f(14));
            float f7 = 38;
            float f10 = 4;
            h1Var.h.addView(imageView, a6.a(f7, 0.0f, f10, f10, 0.0f, 38, 5));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(g6.x0(null, i10, false));
            imageView2.setBackground(g6.g0(g6.x0(null, i11, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o4(activity2, 4));
            h1Var.h.addView(imageView2, a6.a(f7, 0.0f, f10, 48, 0.0f, 38, 5));
            h1Var.e.addView(h1Var.h, a6.d(-1.0f, -1));
            h1Var.f30212b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = uf.b.b(activity2, false);
            h1Var.f30213c = b10;
            int i12 = h1Var.M;
            b10.width = i12;
            b10.height = h1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i12) - AndroidUtilities.dp(16.0f);
            h1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = h1Var.f30213c;
            float dp3 = (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f);
            h1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = h1Var.f30213c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            h1Var.d.setAlpha(0.0f);
            h1Var.d.setScaleX(0.1f);
            h1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f30212b, h1Var.d, h1Var.f30213c);
            h1Var.f30212b.addView(h1Var.d, h1Var.f30213c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(es.f24771f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(h1Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new c1(h1Var, 0));
            animatorSet.start();
            h1Var.i(false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            rf.d dVar = h1Var.O;
            if (dVar != null) {
                dVar.c();
                h1Var.O = null;
            }
            if (activity != null && uf.b.a(activity) == 1) {
                rf.c cVar = new rf.c(activity, h1Var);
                cVar.f44166c = "pip-rtmp-video";
                cVar.e = 1;
                cVar.d = AndroidUtilities.dp(10.0f);
                cVar.f44170j = h1Var.d;
                cVar.f44171k = h1Var.f30214f.getPlaceholderView();
                h1Var.O = cVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        r2 r2Var = this.f30214f;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        i(true);
        this.f30211a0 = true;
        this.f30212b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        rf.d dVar = this.O;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f30213c;
            int width = ((Rect) this.O.h.f13952a).width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f30213c;
            int height = ((Rect) this.O.h.f13952a).height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f30211a0 = false;
        this.f30212b.addView(this.d, this.f30213c);
        this.d.invalidate();
        r2 r2Var = this.Z;
        if (r2Var != null) {
            r2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override
    public final Bitmap c() {
        r2 r2Var = this.Z;
        if (r2Var != null && r2Var.d.isAvailable()) {
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
        r2 r2Var = this.f30214f;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f30214f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        r2 r2Var = new r2(this.f30214f.getContext(), false, false, false, false);
        this.Z = r2Var;
        r2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = this.Z;
        r2Var2.f30421a0 = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d1(this));
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f30220y);
                }
                r2 r2Var = this.Z;
                if (r2Var == null) {
                    r2Var = this.f30214f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f30220y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(r2Var.d, this.f30220y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f30220y, r2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = k9.d(user.f19363id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f30216r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = k9.d(chat.f19216id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f30216r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f30219x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f30218w != z12) {
            this.f30217s.animate().cancel();
            ViewPropertyAnimator animate = this.f30217s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            es esVar = es.f24771f;
            duration.setInterpolator(esVar).start();
            this.f30216r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f30216r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(esVar).start();
            this.f30214f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f30214f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(esVar).start();
            this.f30218w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f30213c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f30213c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f30212b, this.d, this.f30213c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f16459b = f13;
        kVar.f16460c = true;
        o1.l lVar = kVar.f16468u;
        float B = a1.g.B(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (B >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f16474i = dp;
        this.S.h();
        o1.k kVar2 = this.T;
        kVar2.f16459b = this.R;
        kVar2.f16460c = true;
        kVar2.f16468u.f16474i = w7.s.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
                    this.f30210a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f30210a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(es.f24771f);
        this.L.addUpdateListener(new ki.a(this, 3));
        this.L.addListener(new c1(this, 1));
        this.L.start();
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }
}

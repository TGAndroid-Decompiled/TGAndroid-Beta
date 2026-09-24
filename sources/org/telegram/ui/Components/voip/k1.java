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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.w9;
import org.webrtc.RendererCommon;
import w7.y5;
public final class k1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final tv0 f29409b0 = new tv0(new fa0(28), new fa0(29));
    public static final tv0 f29410c0 = new tv0(new e1(0), new e1(1));
    public static final k1 f29411d0;
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
    public i2.h0 X;
    public com.google.android.gms.internal.cast.p Y;
    public t2 Z;
    public float f29412a;
    public boolean f29413a0;
    public WindowManager f29414b;
    public WindowManager.LayoutParams f29415c;
    public org.telegram.ui.f d;
    public m6 e;
    public t2 f29416f;
    public FrameLayout h;
    public h f29417n;
    public w9 f29418r;
    public bb f29419s;
    public TLRPC.GroupCallParticipant v;
    public boolean f29420w;
    public boolean f29421x;
    public boolean f29422y;

    static {
        ?? obj = new Object();
        obj.f29412a = 1.4f;
        obj.f29417n = new h();
        obj.f29420w = true;
        obj.P = 1.0f;
        obj.X = new i2.h0((Object) obj, 20);
        f29411d0 = obj;
    }

    public static void j() {
        k1 k1Var = f29411d0;
        if (k1Var.V) {
            k1Var.V = false;
            AndroidUtilities.runOnUIThread(new th(15), 100L);
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
            animatorSet.setInterpolator(rr.f28022f);
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
        k1 k1Var = f29411d0;
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
            o1.k kVar = new o1.k(k1Var, f29409b0);
            o1.l lVar = new o1.l();
            lVar.a(0.75f);
            lVar.b(650.0f);
            kVar.f15518u = lVar;
            k1Var.S = kVar;
            o1.k kVar2 = new o1.k(k1Var, f29410c0);
            o1.l lVar2 = new o1.l();
            lVar2.a(0.75f);
            lVar2.b(650.0f);
            kVar2.f15518u = lVar2;
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
            k1Var.G = new n2.e(activity2, new i1(k1Var, scaledTouchSlop));
            k1Var.e = new m6(k1Var, activity2);
            org.telegram.ui.f fVar = new org.telegram.ui.f(k1Var, activity2, 2);
            k1Var.d = fVar;
            fVar.addView(k1Var.e, y5.c(-1.0f, -1));
            k1Var.e.setOutlineProvider(new ai.k2(17));
            k1Var.e.setClipToOutline(true);
            k1Var.e.setBackgroundColor(h6.w0(null, h6.f19107gg, false));
            w9 w9Var = new w9(activity2);
            k1Var.f29418r = w9Var;
            k1Var.e.addView(w9Var, y5.c(-1.0f, -1));
            t2 t2Var = new t2(activity2, false, false, false, false);
            k1Var.f29416f = t2Var;
            t2Var.setAlpha(0.0f);
            k1Var.f29416f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            t2 t2Var2 = k1Var.f29416f;
            t2Var2.f29618a0 = 0;
            t2Var2.d.setRotateTextureWithScreen(true);
            k1Var.f29416f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j1(k1Var));
            k1Var.e.addView(k1Var.f29416f, y5.c(-1.0f, -1));
            bb bbVar = new bb(k1Var, activity2, 27);
            k1Var.f29419s = bbVar;
            k1Var.e.addView(bbVar, y5.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            k1Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            k1Var.h.addView(view, y5.c(-1.0f, -1));
            int dp = AndroidUtilities.dp(8.0f);
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(R.drawable.pip_video_close);
            int i11 = h6.f19124hg;
            imageView.setColorFilter(h6.w0(null, i11, false));
            int i12 = h6.f19134i6;
            imageView.setBackground(h6.f0(h6.w0(null, i12, false), 1, -1));
            imageView.setPadding(dp, dp, dp, dp);
            imageView.setOnClickListener(new ai.e2(13));
            float f7 = 38;
            float f10 = 4;
            k1Var.h.addView(imageView, y5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(R.drawable.pip_video_expand);
            imageView2.setColorFilter(h6.w0(null, i11, false));
            imageView2.setBackground(h6.f0(h6.w0(null, i12, false), 1, -1));
            imageView2.setPadding(dp, dp, dp, dp);
            imageView2.setOnClickListener(new o(activity2, 3));
            k1Var.h.addView(imageView2, y5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            k1Var.e.addView(k1Var.h, y5.c(-1.0f, -1));
            k1Var.f29414b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
            k1Var.f29415c = b10;
            int i13 = k1Var.M;
            b10.width = i13;
            b10.height = k1Var.N;
            float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
            k1Var.Q = dp2;
            b10.x = (int) dp2;
            WindowManager.LayoutParams layoutParams = k1Var.f29415c;
            float dp3 = (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f);
            k1Var.R = dp3;
            layoutParams.y = (int) dp3;
            WindowManager.LayoutParams layoutParams2 = k1Var.f29415c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            k1Var.d.setAlpha(0.0f);
            k1Var.d.setScaleX(0.1f);
            k1Var.d.setScaleY(0.1f);
            AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f29414b, k1Var.d, k1Var.f29415c);
            k1Var.f29414b.addView(k1Var.d, k1Var.f29415c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(rr.f28022f);
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
                dVar.f41038c = "pip-rtmp-video";
                dVar.e = 1;
                dVar.d = AndroidUtilities.dp(10.0f);
                dVar.f41042j = k1Var.d;
                dVar.f41043k = k1Var.f29416f.getPlaceholderView();
                k1Var.O = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        t2 t2Var = this.f29416f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.f29413a0 = true;
        this.f29414b.removeView(this.d);
        this.d.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.f29415c;
            int width = this.O.h.f43178a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f29415c;
            int height = this.O.h.f43178a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f29413a0 = false;
        this.f29414b.addView(this.d, this.f29415c);
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
        t2 t2Var = this.f29416f;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f29416f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        t2 t2Var = new t2(this.f29416f.getContext(), false, false, false, false);
        this.Z = t2Var;
        t2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.Z;
        t2Var2.f29618a0 = 0;
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
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.f29422y);
                }
                t2 t2Var = this.Z;
                if (t2Var == null) {
                    t2Var = this.f29416f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29422y = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.f29422y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.f29422y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    if (user != null) {
                        d10 = h9.d(user.f18468id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29418r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    if (chat != null) {
                        d = h9.d(chat.f18321id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    this.f29418r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.f29421x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f29420w != z12) {
            this.f29419s.animate().cancel();
            ViewPropertyAnimator animate = this.f29419s.animate();
            float f12 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            rr rrVar = rr.f28022f;
            duration.setInterpolator(rrVar).start();
            this.f29418r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f29418r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(rrVar).start();
            this.f29416f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f29416f.animate();
            if (!z12) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).setDuration(150L).setInterpolator(rrVar).start();
            this.f29420w = z12;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f29415c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.f29415c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.f29414b, this.d, this.f29415c);
        o1.k kVar = this.S;
        float f13 = this.Q;
        kVar.f15509b = f13;
        kVar.f15510c = true;
        o1.l lVar = kVar.f15518u;
        float B = a4.a.B(m(), this.P, 2.0f, f13);
        float f14 = AndroidUtilities.displaySize.x;
        if (B >= f14 / 2.0f) {
            dp = (f14 - (m() * this.P)) - AndroidUtilities.dp(16.0f);
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        lVar.f15524i = dp;
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.f15509b = this.R;
        kVar2.f15510c = true;
        kVar2.f15518u.f15524i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
                    this.f29412a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.f29412a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
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
        duration.setInterpolator(rr.f28022f);
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

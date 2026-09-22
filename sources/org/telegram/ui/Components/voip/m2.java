package org.telegram.ui.Components.voip;

import ai.z9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import ci.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sh;
import org.webrtc.RendererCommon;
import w7.x5;
public final class m2 implements VoIPService.StateListener, rf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean T = false;
    public static m2 U;
    public static m2 V;
    public static int W;
    public final int E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public boolean J;
    public long K;
    public int L;
    public AnimatorSet N;
    public s2 Q;
    public com.google.android.gms.internal.cast.p R;
    public final n6 f29088a;
    public final l2 f29089b;
    public WindowManager f29090c;
    public WindowManager.LayoutParams d;
    public pf.e e;
    public final int f29091f;
    public final int h;
    public final s2 f29092n;
    public final s2 f29093r;
    public float f29094s;
    public ValueAnimator v;
    public final int f29097y;
    public final r0 f29095w = new r0(this, 4);
    public final float[] f29096x = new float[2];
    public final z9 M = new z9(6);
    public final i2 O = new i2(this, 0);
    public final i2 P = new i2(this, 1);
    public final k2 S = new k2(this);

    public m2(Context context, int i10, int i11, boolean z10) {
        this.f29091f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.E = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.f29097y = i13;
        n6 n6Var = new n6(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 15);
        this.f29088a = n6Var;
        n6Var.setWillNotDraw(false);
        n6Var.setPadding(i13, i12, i13, i12);
        l2 l2Var = new l2(this, context);
        this.f29089b = l2Var;
        s2 s2Var = new s2(context, false, true);
        this.f29093r = s2Var;
        s2Var.f29201a0 = 3;
        s2 s2Var2 = new s2(context, false, true);
        this.f29092n = s2Var2;
        s2Var2.d.setMirror(true);
        l2Var.addView(s2Var);
        l2Var.addView(s2Var2);
        l2Var.setBackgroundColor(-7829368);
        n6Var.addView(l2Var);
        n6Var.setClipChildren(false);
        n6Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            l2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            l2Var.addView(imageView, x5.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            l2Var.addView(imageView2, x5.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new ai.e2(15));
            imageView2.setOnClickListener(new dt(26, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (T) {
            return;
        }
        m2 m2Var = V;
        if (m2Var != null) {
            m2Var.j();
        }
        m2 m2Var2 = U;
        if (m2Var2 != null) {
            m2Var2.j();
        }
        V = null;
        U = null;
    }

    public static m2 k() {
        m2 m2Var = V;
        if (m2Var != null) {
            return m2Var;
        }
        return U;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (U == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f7 = i12;
            float f10 = f7 * 0.4f;
            float f11 = i11;
            float f12 = 0.4f * f11;
            layoutParams.height = (int) ((f7 * 0.25f) + ((((int) ((f10 * 1.05f) - f10)) / 2) * 2));
            layoutParams.width = (int) ((f11 * 0.25f) + ((((int) ((1.05f * f12) - f12)) / 2) * 2));
            layoutParams.gravity = 51;
            layoutParams.format = -3;
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 99;
            }
            layoutParams.flags = 16778120;
            U = new m2(activity, i11, i12, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            m2 m2Var = U;
            m2Var.L = i10;
            m2Var.f29090c = windowManager;
            m2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
            m2 m2Var2 = U;
            m2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f15 = point.x;
            float f16 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f17 = m2Var2.f29091f * 0.25f;
            float f18 = m2Var2.h * 0.25f;
            l2 l2Var = m2Var2.f29089b;
            if (l2Var.getMeasuredWidth() != 0) {
                f17 = l2Var.getMeasuredWidth();
            }
            if (l2Var.getMeasuredWidth() != 0) {
                f18 = l2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = m2Var2.d;
            layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (m2Var2.f29097y - dp));
            layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (m2Var2.E - dp3));
            AndroidUtilities.updateViewLayout(m2Var2.f29090c, m2Var2.f29088a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(U, NotificationCenter.didEndCall);
            windowManager.addView(U.f29088a, layoutParams);
            U.f29092n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            U.f29093r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
            if (i13 == 0) {
                U.f29088a.setScaleX(0.5f);
                U.f29088a.setScaleY(0.5f);
                U.f29088a.setAlpha(0.0f);
                U.f29088a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    m2 m2Var3 = U;
                    sharedInstance.setSinks(m2Var3.f29092n.d, m2Var3.f29093r.d);
                }
            } else if (i13 == 1) {
                U.f29088a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    m2 m2Var4 = U;
                    sharedInstance2.setBackgroundSinks(m2Var4.f29092n.d, m2Var4.f29093r.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
                m2 m2Var5 = U;
                pf.d dVar = new pf.d(activity, m2Var5);
                dVar.f40781c = "voip-pip";
                dVar.e = 1;
                s2 s2Var = m2Var5.f29093r;
                dVar.f40785j = s2Var.d;
                dVar.f40786k = s2Var.getPlaceholderView();
                m2Var5.e = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        s2 s2Var = this.f29093r;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f29092n.d, this.Q.d);
        }
        WindowManager windowManager = this.f29090c;
        n6 n6Var = this.f29088a;
        windowManager.removeView(n6Var);
        n6Var.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        WindowManager windowManager = this.f29090c;
        WindowManager.LayoutParams layoutParams = this.d;
        n6 n6Var = this.f29088a;
        windowManager.addView(n6Var, layoutParams);
        s2 s2Var = this.Q;
        if (s2Var != null) {
            s2Var.d.release();
            this.Q = null;
        }
        n6Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f29092n.d, this.f29093r.d);
        }
    }

    @Override
    public final Bitmap c() {
        s2 s2Var = this.Q;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.Q.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override
    public final Bitmap e() {
        s2 s2Var = this.f29093r;
        if (s2Var != null) {
            r2 r2Var = s2Var.d;
            if (r2Var.isAvailable()) {
                return r2Var.getBitmap();
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        s2 s2Var = new s2(this.f29093r.getContext(), false, true, false, false);
        this.Q = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.Q.d.setEnableHardwareScaler(true);
        this.Q.d.setRotateTextureWithScreen(true);
        s2 s2Var2 = this.Q;
        s2Var2.f29201a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j2(this));
        View view = this.Q.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Q;
    }

    public final void j() {
        this.f29092n.d.release();
        this.f29093r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f29088a.setVisibility(8);
        if (this.f29088a.getParent() != null) {
            l2 l2Var = this.f29089b;
            float[] fArr = this.f29096x;
            int i10 = l2.h;
            l2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            m2 m2Var = l2Var.f29050f;
            int i11 = m2Var.d.x;
            l2 l2Var2 = m2Var.f29089b;
            float left = l2Var2.getLeft() + i11;
            float f7 = l2Var.f29048b;
            fArr[0] = (left - f7) / (((point.x - f7) - l2Var.f29049c) - l2Var2.getMeasuredWidth());
            float top = l2Var2.getTop() + m2Var.d.y;
            float f10 = l2Var.d;
            fArr[1] = (top - f10) / (((point.y - f10) - l2Var.e) - l2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f29096x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f29096x[1]))).apply();
            try {
                this.f29090c.removeView(this.f29088a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        pf.e eVar = this.e;
        if (eVar != null) {
            eVar.c();
            this.e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f29089b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.G;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f7 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.G = z11;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.F = z12;
            s2 s2Var = this.f29092n;
            s2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            s2Var.setIsScreencast(sharedInstance.isScreencast());
            s2Var.d(1.0f, false);
        }
        if (!z10) {
            if (!this.G) {
                f7 = 0.0f;
            }
            this.f29094s = f7;
        } else if (z13 != this.G) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f29094s;
            if (!this.G) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.f29095w);
            this.v.setDuration(300L).setInterpolator(qr.f27420f);
            this.v.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = U.f29088a.getContext();
            if (this.e == null && sf.c.a(context) == 1 && (context instanceof Activity)) {
                pf.d dVar = new pf.d((Activity) context, this);
                dVar.f40781c = "voip-pip";
                dVar.e = 1;
                s2 s2Var = this.f29093r;
                dVar.f40785j = s2Var.d;
                dVar.f40786k = s2Var.getPlaceholderView();
                this.e = dVar.a();
            }
        } else {
            pf.e eVar = this.e;
            if (eVar != null) {
                eVar.c();
                this.e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z10 && this.F) {
                sharedInstance.setVideoState(false, 1);
            } else if (z10 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new sh(14), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            i();
        } else if (i10 == 3 && !sharedInstance.isVideoAvailable()) {
            i();
        } else {
            m();
        }
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
    }
}

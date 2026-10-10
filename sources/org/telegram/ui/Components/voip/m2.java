package org.telegram.ui.Components.voip;

import ai.aa;
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
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vt;
import org.webrtc.RendererCommon;
import w7.x5;
public final class m2 implements VoIPService.StateListener, sf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean U = false;
    public static m2 V;
    public static m2 W;
    public static int X;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public long L;
    public int M;
    public AnimatorSet O;
    public s2 R;
    public com.google.android.gms.internal.cast.p S;
    public final m6 f32154a;
    public final l2 f32155b;
    public WindowManager f32156c;
    public WindowManager.LayoutParams d;
    public qf.e f32157e;
    public final int f32158f;
    public final int h;
    public final View f32159n;
    public final s2 f32160r;
    public final s2 f32161s;
    public float v;
    public ValueAnimator f32162w;
    public final r0 f32163x = new r0(this, 4);
    public final float[] f32164y = new float[2];
    public final aa N = new aa(6);
    public final i2 P = new i2(this, 0);
    public final i2 Q = new i2(this, 1);
    public final k2 T = new k2(this);

    public m2(int i10, int i11, Context context, boolean z10) {
        this.f32158f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        m6 m6Var = new m6(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 15);
        this.f32154a = m6Var;
        m6Var.setWillNotDraw(false);
        m6Var.setPadding(i13, i12, i13, i12);
        l2 l2Var = new l2(this, context);
        this.f32155b = l2Var;
        s2 s2Var = new s2(context, false, true);
        this.f32161s = s2Var;
        s2Var.f32276a0 = 3;
        s2 s2Var2 = new s2(context, false, true);
        this.f32160r = s2Var2;
        s2Var2.d.setMirror(true);
        l2Var.addView(s2Var);
        l2Var.addView(s2Var2);
        l2Var.setBackgroundColor(-7829368);
        m6Var.addView(l2Var);
        m6Var.setClipChildren(false);
        m6Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.f32159n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            l2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            l2Var.addView(imageView, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 53));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            l2Var.addView(imageView2, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 51));
            imageView.setOnClickListener(new ai.e2(15));
            imageView2.setOnClickListener(new vt(26, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (U) {
            return;
        }
        m2 m2Var = W;
        if (m2Var != null) {
            m2Var.j();
        }
        m2 m2Var2 = V;
        if (m2Var2 != null) {
            m2Var2.j();
        }
        W = null;
        V = null;
    }

    public static m2 k() {
        m2 m2Var = W;
        if (m2Var != null) {
            return m2Var;
        }
        return V;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (V == null && VideoCapturerDevice.eglBase != null) {
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
            V = new m2(i11, i12, activity, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            m2 m2Var = V;
            m2Var.M = i10;
            m2Var.f32156c = windowManager;
            m2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
            m2 m2Var2 = V;
            m2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f15 = point.x;
            float f16 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f17 = m2Var2.f32158f * 0.25f;
            float f18 = m2Var2.h * 0.25f;
            l2 l2Var = m2Var2.f32155b;
            if (l2Var.getMeasuredWidth() != 0) {
                f17 = l2Var.getMeasuredWidth();
            }
            if (l2Var.getMeasuredWidth() != 0) {
                f18 = l2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = m2Var2.d;
            layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (m2Var2.E - dp));
            layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (m2Var2.F - dp3));
            AndroidUtilities.updateViewLayout(m2Var2.f32156c, m2Var2.f32154a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(V, NotificationCenter.didEndCall);
            windowManager.addView(V.f32154a, layoutParams);
            V.f32160r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            V.f32161s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), V.T);
            if (i13 == 0) {
                V.f32154a.setScaleX(0.5f);
                V.f32154a.setScaleY(0.5f);
                V.f32154a.setAlpha(0.0f);
                V.f32154a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    m2 m2Var3 = V;
                    sharedInstance.setSinks(m2Var3.f32160r.d, m2Var3.f32161s.d);
                }
            } else if (i13 == 1) {
                V.f32154a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    m2 m2Var4 = V;
                    sharedInstance2.setBackgroundSinks(m2Var4.f32160r.d, m2Var4.f32161s.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
                m2 m2Var5 = V;
                qf.d dVar = new qf.d(activity, m2Var5);
                dVar.f46197c = "voip-pip";
                dVar.f46198e = 1;
                s2 s2Var = m2Var5.f32161s;
                dVar.f46202j = s2Var.d;
                dVar.f46203k = s2Var.getPlaceholderView();
                m2Var5.f32157e = dVar.a();
            }
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        s2 s2Var = this.f32161s;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32160r.d, this.R.d);
        }
        WindowManager windowManager = this.f32156c;
        m6 m6Var = this.f32154a;
        windowManager.removeView(m6Var);
        m6Var.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        WindowManager windowManager = this.f32156c;
        WindowManager.LayoutParams layoutParams = this.d;
        m6 m6Var = this.f32154a;
        windowManager.addView(m6Var, layoutParams);
        s2 s2Var = this.R;
        if (s2Var != null) {
            s2Var.d.release();
            this.R = null;
        }
        m6Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f32160r.d, this.f32161s.d);
        }
    }

    @Override
    public final Bitmap c() {
        s2 s2Var = this.R;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.R.d.getBitmap();
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
        s2 s2Var = this.f32161s;
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
        s2 s2Var = new s2(this.f32161s.getContext(), false, true, false, false);
        this.R = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        s2 s2Var2 = this.R;
        s2Var2.f32276a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j2(this));
        View view = this.R.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.R;
    }

    public final void j() {
        this.f32160r.d.release();
        this.f32161s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f32154a.setVisibility(8);
        if (this.f32154a.getParent() != null) {
            l2 l2Var = this.f32155b;
            float[] fArr = this.f32164y;
            int i10 = l2.h;
            l2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            m2 m2Var = l2Var.f32115f;
            int i11 = m2Var.d.x;
            l2 l2Var2 = m2Var.f32155b;
            float left = l2Var2.getLeft() + i11;
            float f7 = l2Var.f32112b;
            fArr[0] = (left - f7) / (((point.x - f7) - l2Var.f32113c) - l2Var2.getMeasuredWidth());
            float top = l2Var2.getTop() + m2Var.d.y;
            float f10 = l2Var.d;
            fArr[1] = (top - f10) / (((point.y - f10) - l2Var.f32114e) - l2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f32164y[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f32164y[1]))).apply();
            try {
                this.f32156c.removeView(this.f32154a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        qf.e eVar = this.f32157e;
        if (eVar != null) {
            eVar.c();
            this.f32157e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f32155b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f7 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.H = z11;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.G = z12;
            s2 s2Var = this.f32160r;
            s2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            s2Var.setIsScreencast(sharedInstance.isScreencast());
            s2Var.d(1.0f, false);
        }
        if (!z10) {
            if (!this.H) {
                f7 = 0.0f;
            }
            this.v = f7;
        } else if (z13 != this.H) {
            ValueAnimator valueAnimator = this.f32162w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.v;
            if (!this.H) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32162w = ofFloat;
            ofFloat.addUpdateListener(this.f32163x);
            this.f32162w.setDuration(300L).setInterpolator(is.f27443f);
            this.f32162w.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = V.f32154a.getContext();
            if (this.f32157e == null && tf.c.a(context) == 1 && (context instanceof Activity)) {
                qf.d dVar = new qf.d((Activity) context, this);
                dVar.f46197c = "voip-pip";
                dVar.f46198e = 1;
                s2 s2Var = this.f32161s;
                dVar.f46202j = s2Var.d;
                dVar.f46203k = s2Var.getPlaceholderView();
                this.f32157e = dVar.a();
            }
        } else {
            qf.e eVar = this.f32157e;
            if (eVar != null) {
                eVar.c();
                this.f32157e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z10 && this.G) {
                sharedInstance.setVideoState(false, 1);
            } else if (z10 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new vh(16), 200L);
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
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
    }
}

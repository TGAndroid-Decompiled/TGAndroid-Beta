package org.telegram.ui.Components.voip;

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
import k7.b6;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rx0;
import org.webrtc.RendererCommon;
public final class m2 implements VoIPService.StateListener, ef.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean Q = false;
    public static m2 R;
    public static m2 S;
    public static int T;
    public final int B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public long H;
    public int I;
    public AnimatorSet K;
    public s2 N;
    public c2.p O;
    public final ah.d f29772a;
    public final l2 f29773b;
    public WindowManager f29774c;
    public WindowManager.LayoutParams d;
    public cf.f e;
    public final int f29775f;
    public final int h;
    public final s2 f29776n;
    public final s2 f29777r;
    public float f29778s;
    public ValueAnimator v;
    public final int f29781y;
    public final e5 f29779w = new e5(this, 8);
    public final float[] f29780x = new float[2];
    public final androidx.emoji2.text.n J = new androidx.emoji2.text.n(6);
    public final i2 L = new i2(this, 0);
    public final i2 M = new i2(this, 1);
    public final k2 P = new k2(this);

    public m2(Context context, int i10, int i11, boolean z4) {
        this.f29775f = i10;
        this.h = i11;
        float f10 = i11 * 0.4f;
        int i12 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.B = i12;
        float f11 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f11) - f11)) / 2;
        this.f29781y = i13;
        ah.d dVar = new ah.d(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 18);
        this.f29772a = dVar;
        dVar.setWillNotDraw(false);
        dVar.setPadding(i13, i12, i13, i12);
        l2 l2Var = new l2(this, context);
        this.f29773b = l2Var;
        s2 s2Var = new s2(context, false, true);
        this.f29777r = s2Var;
        s2Var.U = 3;
        s2 s2Var2 = new s2(context, false, true);
        this.f29776n = s2Var2;
        s2Var2.d.setMirror(true);
        l2Var.addView(s2Var);
        l2Var.addView(s2Var2);
        l2Var.setBackgroundColor(-7829368);
        dVar.addView(l2Var);
        dVar.setClipChildren(false);
        dVar.setClipToPadding(false);
        if (z4) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            l2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            l2Var.addView(imageView, b6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            l2Var.addView(imageView2, b6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new dg.m(17));
            imageView2.setOnClickListener(new rx0(11, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (Q) {
            return;
        }
        m2 m2Var = S;
        if (m2Var != null) {
            m2Var.j();
        }
        m2 m2Var2 = R;
        if (m2Var2 != null) {
            m2Var2.j();
        }
        S = null;
        R = null;
    }

    public static m2 k() {
        m2 m2Var = S;
        if (m2Var != null) {
            return m2Var;
        }
        return R;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (R == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f10 = i12;
            float f11 = f10 * 0.4f;
            float f12 = i11;
            float f13 = 0.4f * f12;
            layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
            layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
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
            R = new m2(activity, i11, i12, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            m2 m2Var = R;
            m2Var.I = i10;
            m2Var.f29774c = windowManager;
            m2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            m2 m2Var2 = R;
            m2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f16 = point.x;
            float f17 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f18 = m2Var2.f29775f * 0.25f;
            float f19 = m2Var2.h * 0.25f;
            l2 l2Var = m2Var2.f29773b;
            if (l2Var.getMeasuredWidth() != 0) {
                f18 = l2Var.getMeasuredWidth();
            }
            if (l2Var.getMeasuredWidth() != 0) {
                f19 = l2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = m2Var2.d;
            layoutParams2.x = (int) (((((f16 - dp) - dp2) - f18) * f14) - (m2Var2.f29781y - dp));
            layoutParams2.y = (int) (((((f17 - dp3) - dp4) - f19) * f15) - (m2Var2.B - dp3));
            AndroidUtilities.updateViewLayout(m2Var2.f29774c, m2Var2.f29772a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(R, NotificationCenter.didEndCall);
            windowManager.addView(R.f29772a, layoutParams);
            R.f29776n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            R.f29777r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), R.P);
            if (i13 == 0) {
                R.f29772a.setScaleX(0.5f);
                R.f29772a.setScaleY(0.5f);
                R.f29772a.setAlpha(0.0f);
                R.f29772a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    m2 m2Var3 = R;
                    sharedInstance.setSinks(m2Var3.f29776n.d, m2Var3.f29777r.d);
                }
            } else if (i13 == 1) {
                R.f29772a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    m2 m2Var4 = R;
                    sharedInstance2.setBackgroundSinks(m2Var4.f29776n.d, m2Var4.f29777r.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ff.d.a(activity) == 1) {
                m2 m2Var5 = R;
                cf.e eVar = new cf.e(activity, m2Var5);
                eVar.f2287c = "voip-pip";
                eVar.e = 1;
                s2 s2Var = m2Var5.f29777r;
                eVar.f2291j = s2Var.d;
                eVar.f2292k = s2Var.getPlaceholderView();
                m2Var5.e = eVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.O = pVar;
        WindowManager windowManager = this.f29774c;
        WindowManager.LayoutParams layoutParams = this.d;
        ah.d dVar = this.f29772a;
        windowManager.addView(dVar, layoutParams);
        s2 s2Var = this.N;
        if (s2Var != null) {
            s2Var.d.release();
            this.N = null;
        }
        dVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f29776n.d, this.f29777r.d);
        }
    }

    @Override
    public final Bitmap b() {
        s2 s2Var = this.N;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.N.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        s2 s2Var = this.f29777r;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override
    public final void e(c2.p pVar) {
        this.O = pVar;
        s2 s2Var = this.f29777r;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f29776n.d, this.N.d);
        }
        WindowManager windowManager = this.f29774c;
        ah.d dVar = this.f29772a;
        windowManager.removeView(dVar);
        dVar.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        s2 s2Var = new s2(this.f29777r.getContext(), false, true, false, false);
        this.N = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.N.d.setEnableHardwareScaler(true);
        this.N.d.setRotateTextureWithScreen(true);
        s2 s2Var2 = this.N;
        s2Var2.U = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j2(this));
        View view = this.N.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.N;
    }

    public final void j() {
        this.f29776n.d.release();
        this.f29777r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f29772a.setVisibility(8);
        if (this.f29772a.getParent() != null) {
            l2 l2Var = this.f29773b;
            float[] fArr = this.f29780x;
            int i10 = l2.h;
            l2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            m2 m2Var = l2Var.f29767f;
            int i11 = m2Var.d.x;
            l2 l2Var2 = m2Var.f29773b;
            float left = l2Var2.getLeft() + i11;
            float f10 = l2Var.f29765b;
            fArr[0] = (left - f10) / (((point.x - f10) - l2Var.f29766c) - l2Var2.getMeasuredWidth());
            float top = l2Var2.getTop() + m2Var.d.y;
            float f11 = l2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - l2Var.e) - l2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f29780x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f29780x[1]))).apply();
            try {
                this.f29774c.removeView(this.f29772a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        cf.f fVar = this.e;
        if (fVar != null) {
            fVar.c();
            this.e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z4;
        boolean z10;
        boolean z11;
        if (this.f29773b.getMeasuredWidth() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z12 = this.D;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f10 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.C = z11;
            s2 s2Var = this.f29776n;
            s2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            s2Var.setIsScreencast(sharedInstance.isScreencast());
            s2Var.d(1.0f, false);
        }
        if (!z4) {
            if (!this.D) {
                f10 = 0.0f;
            }
            this.f29778s = f10;
        } else if (z12 != this.D) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f29778s;
            if (!this.D) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.f29779w);
            this.v.setDuration(300L).setInterpolator(nr.f27346f);
            this.v.start();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        m();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = R.f29772a.getContext();
            if (this.e == null && ff.d.a(context) == 1 && (context instanceof Activity)) {
                cf.e eVar = new cf.e((Activity) context, this);
                eVar.f2287c = "voip-pip";
                eVar.e = 1;
                s2 s2Var = this.f29777r;
                eVar.f2291j = s2Var.d;
                eVar.f2292k = s2Var.getPlaceholderView();
                this.e = eVar.a();
            }
        } else {
            cf.f fVar = this.e;
            if (fVar != null) {
                fVar.c();
                this.e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z4 && this.C) {
                sharedInstance.setVideoState(false, 1);
            } else if (z4 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new mc(17), 200L);
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
    public final void c(Canvas canvas) {
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
    }
}

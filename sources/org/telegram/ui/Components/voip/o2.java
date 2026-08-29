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
import i7.f6;
import lh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.jr;
import org.webrtc.RendererCommon;
public final class o2 implements VoIPService.StateListener, cf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean P = false;
    public static o2 Q;
    public static o2 R;
    public static int S;
    public final int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public boolean F;
    public long G;
    public int H;
    public AnimatorSet J;
    public u2 M;
    public c2.p N;
    public final bg.d1 f33894a;
    public final n2 f33895b;
    public WindowManager f33896c;
    public WindowManager.LayoutParams d;
    public af.g f33897e;
    public final int f33898f;
    public final int h;
    public final u2 f33899n;
    public final u2 f33900r;
    public float f33901s;
    public ValueAnimator v;
    public final int f33904y;
    public final d5 f33902w = new d5(this, 20);
    public final float[] f33903x = new float[2];
    public final ab.n I = new ab.n(6);
    public final k2 K = new k2(this, 0);
    public final k2 L = new k2(this, 1);
    public final m2 O = new m2(this);

    public o2(Context context, int i10, int i11, boolean z10) {
        this.f33898f = i10;
        this.h = i11;
        float f9 = i11 * 0.4f;
        int i12 = ((int) ((f9 * 1.05f) - f9)) / 2;
        this.A = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.f33904y = i13;
        bg.d1 d1Var = new bg.d1(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 18);
        this.f33894a = d1Var;
        d1Var.setWillNotDraw(false);
        d1Var.setPadding(i13, i12, i13, i12);
        n2 n2Var = new n2(this, context);
        this.f33895b = n2Var;
        u2 u2Var = new u2(context, false, true);
        this.f33900r = u2Var;
        u2Var.T = 3;
        u2 u2Var2 = new u2(context, false, true);
        this.f33899n = u2Var2;
        u2Var2.d.setMirror(true);
        n2Var.addView(u2Var);
        n2Var.addView(u2Var2);
        n2Var.setBackgroundColor(-7829368);
        d1Var.addView(n2Var);
        d1Var.setClipChildren(false);
        d1Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            n2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            n2Var.addView(imageView, f6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            n2Var.addView(imageView2, f6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bg.n(19));
            imageView2.setOnClickListener(new fi0(14, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (P) {
            return;
        }
        o2 o2Var = R;
        if (o2Var != null) {
            o2Var.j();
        }
        o2 o2Var2 = Q;
        if (o2Var2 != null) {
            o2Var2.j();
        }
        R = null;
        Q = null;
    }

    public static o2 k() {
        o2 o2Var = R;
        if (o2Var != null) {
            return o2Var;
        }
        return Q;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        WindowManager windowManager;
        if (Q == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f9 = i12;
            float f10 = f9 * 0.4f;
            float f11 = i11;
            float f12 = 0.4f * f11;
            layoutParams.height = (int) ((f9 * 0.25f) + ((((int) ((f10 * 1.05f) - f10)) / 2) * 2));
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
            Q = new o2(activity, i11, i12, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            o2 o2Var = Q;
            o2Var.H = i10;
            o2Var.f33896c = windowManager;
            o2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
            o2 o2Var2 = Q;
            o2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f15 = point.x;
            float f16 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f17 = o2Var2.f33898f * 0.25f;
            float f18 = o2Var2.h * 0.25f;
            n2 n2Var = o2Var2.f33895b;
            if (n2Var.getMeasuredWidth() != 0) {
                f17 = n2Var.getMeasuredWidth();
            }
            if (n2Var.getMeasuredWidth() != 0) {
                f18 = n2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = o2Var2.d;
            layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (o2Var2.f33904y - dp));
            layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (o2Var2.A - dp3));
            AndroidUtilities.updateViewLayout(o2Var2.f33896c, o2Var2.f33894a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(Q, NotificationCenter.didEndCall);
            windowManager.addView(Q.f33894a, layoutParams);
            Q.f33899n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            Q.f33900r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), Q.O);
            if (i13 == 0) {
                Q.f33894a.setScaleX(0.5f);
                Q.f33894a.setScaleY(0.5f);
                Q.f33894a.setAlpha(0.0f);
                Q.f33894a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    o2 o2Var3 = Q;
                    sharedInstance.setSinks(o2Var3.f33899n.d, o2Var3.f33900r.d);
                }
            } else if (i13 == 1) {
                Q.f33894a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    o2 o2Var4 = Q;
                    sharedInstance2.setBackgroundSinks(o2Var4.f33899n.d, o2Var4.f33900r.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && df.d.a(activity) == 1) {
                o2 o2Var5 = Q;
                af.f fVar = new af.f(activity, o2Var5);
                fVar.f388c = "voip-pip";
                fVar.f389e = 1;
                u2 u2Var = o2Var5.f33900r;
                fVar.f393j = u2Var.d;
                fVar.f394k = u2Var.getPlaceholderView();
                o2Var5.f33897e = fVar.a();
            }
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.N = pVar;
        WindowManager windowManager = this.f33896c;
        WindowManager.LayoutParams layoutParams = this.d;
        bg.d1 d1Var = this.f33894a;
        windowManager.addView(d1Var, layoutParams);
        u2 u2Var = this.M;
        if (u2Var != null) {
            u2Var.d.release();
            this.M = null;
        }
        d1Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f33899n.d, this.f33900r.d);
        }
    }

    @Override
    public final Bitmap b() {
        u2 u2Var = this.M;
        if (u2Var != null && u2Var.d.isAvailable()) {
            return this.M.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap d() {
        u2 u2Var = this.f33900r;
        if (u2Var != null) {
            t2 t2Var = u2Var.d;
            if (t2Var.isAvailable()) {
                return t2Var.getBitmap();
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
        this.N = pVar;
        u2 u2Var = this.f33900r;
        if (u2Var != null) {
            u2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f33899n.d, this.M.d);
        }
        WindowManager windowManager = this.f33896c;
        bg.d1 d1Var = this.f33894a;
        windowManager.removeView(d1Var);
        d1Var.invalidate();
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        u2 u2Var = new u2(this.f33900r.getContext(), false, true, false, false);
        this.M = u2Var;
        u2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.M.d.setEnableHardwareScaler(true);
        this.M.d.setRotateTextureWithScreen(true);
        u2 u2Var2 = this.M;
        u2Var2.T = 1;
        u2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new l2(this));
        View view = this.M.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.M;
    }

    public final void j() {
        this.f33899n.d.release();
        this.f33900r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f33894a.setVisibility(8);
        if (this.f33894a.getParent() != null) {
            n2 n2Var = this.f33895b;
            float[] fArr = this.f33903x;
            int i10 = n2.h;
            n2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            o2 o2Var = n2Var.f33868f;
            int i11 = o2Var.d.x;
            n2 n2Var2 = o2Var.f33895b;
            float left = n2Var2.getLeft() + i11;
            float f9 = n2Var.f33865b;
            fArr[0] = (left - f9) / (((point.x - f9) - n2Var.f33866c) - n2Var2.getMeasuredWidth());
            float top = n2Var2.getTop() + o2Var.d.y;
            float f10 = n2Var.d;
            fArr[1] = (top - f10) / (((point.y - f10) - n2Var.f33867e) - n2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f33903x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f33903x[1]))).apply();
            try {
                this.f33896c.removeView(this.f33894a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        af.g gVar = this.f33897e;
        if (gVar != null) {
            gVar.c();
            this.f33897e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f33895b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.C;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f9 = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.C = z11;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.B = z12;
            u2 u2Var = this.f33899n;
            u2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            u2Var.setIsScreencast(sharedInstance.isScreencast());
            u2Var.d(1.0f, false);
        }
        if (!z10) {
            if (!this.C) {
                f9 = 0.0f;
            }
            this.f33901s = f9;
        } else if (z13 != this.C) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33901s;
            if (!this.C) {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.f33902w);
            this.v.setDuration(300L).setInterpolator(jr.f29800f);
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
            Context context = Q.f33894a.getContext();
            if (this.f33897e == null && df.d.a(context) == 1 && (context instanceof Activity)) {
                af.f fVar = new af.f((Activity) context, this);
                fVar.f388c = "voip-pip";
                fVar.f389e = 1;
                u2 u2Var = this.f33900r;
                fVar.f393j = u2Var.d;
                fVar.f394k = u2Var.getPlaceholderView();
                this.f33897e = fVar.a();
            }
        } else {
            af.g gVar = this.f33897e;
            if (gVar != null) {
                gVar.c();
                this.f33897e = null;
            }
        }
        m();
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z10 && this.B) {
                sharedInstance.setVideoState(false, 1);
            } else if (z10 && sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new g5(21), 200L);
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
    public final void onVideoAvailableChange(boolean z10) {
    }
}

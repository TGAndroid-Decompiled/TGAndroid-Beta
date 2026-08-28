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
import g7.e6;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.vh0;
import org.webrtc.RendererCommon;
public final class l2 implements VoIPService.StateListener, ze.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean P = false;
    public static l2 Q;
    public static l2 R;
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
    public r2 M;
    public af.f N;
    public final fh.v f33652a;
    public final k2 f33653b;
    public WindowManager f33654c;
    public WindowManager.LayoutParams d;
    public xe.d f33655e;
    public final int f33656f;
    public final int h;
    public final r2 f33657n;
    public final r2 f33658r;
    public float f33659s;
    public ValueAnimator v;
    public final int f33662y;
    public final g4 f33660w = new g4(this, 11);
    public final float[] f33661x = new float[2];
    public final androidx.emoji2.text.m I = new androidx.emoji2.text.m(5);
    public final h2 K = new h2(this, 0);
    public final h2 L = new h2(this, 1);
    public final j2 O = new j2(this);

    public l2(Context context, int i9, int i10, boolean z10) {
        this.f33656f = i9;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.A = i11;
        float f11 = i9 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.f33662y = i12;
        fh.v vVar = new fh.v(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 17);
        this.f33652a = vVar;
        vVar.setWillNotDraw(false);
        vVar.setPadding(i12, i11, i12, i11);
        k2 k2Var = new k2(this, context);
        this.f33653b = k2Var;
        r2 r2Var = new r2(context, false, true);
        this.f33658r = r2Var;
        r2Var.T = 3;
        r2 r2Var2 = new r2(context, false, true);
        this.f33657n = r2Var2;
        r2Var2.d.setMirror(true);
        k2Var.addView(r2Var);
        k2Var.addView(r2Var2);
        k2Var.setBackgroundColor(-7829368);
        vVar.addView(k2Var);
        vVar.setClipChildren(false);
        vVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            k2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            k2Var.addView(imageView, e6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            k2Var.addView(imageView2, e6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new fh.n(18));
            imageView2.setOnClickListener(new vh0(13, this, context));
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
        l2 l2Var = R;
        if (l2Var != null) {
            l2Var.j();
        }
        l2 l2Var2 = Q;
        if (l2Var2 != null) {
            l2Var2.j();
        }
        R = null;
        Q = null;
    }

    public static l2 k() {
        l2 l2Var = R;
        if (l2Var != null) {
            return l2Var;
        }
        return Q;
    }

    public static void l(Activity activity, int i9, int i10, int i11, int i12) {
        WindowManager windowManager;
        if (Q == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f10 = i11;
            float f11 = f10 * 0.4f;
            float f12 = i10;
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
            Q = new l2(activity, i10, i11, false);
            if (AndroidUtilities.checkInlinePermissions(activity)) {
                windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            l2 l2Var = Q;
            l2Var.H = i9;
            l2Var.f33654c = windowManager;
            l2Var.d = layoutParams;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
            float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
            l2 l2Var2 = Q;
            l2Var2.getClass();
            Point point = AndroidUtilities.displaySize;
            float f16 = point.x;
            float f17 = point.y;
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            float dp3 = AndroidUtilities.dp(60.0f);
            float dp4 = AndroidUtilities.dp(16.0f);
            float f18 = l2Var2.f33656f * 0.25f;
            float f19 = l2Var2.h * 0.25f;
            k2 k2Var = l2Var2.f33653b;
            if (k2Var.getMeasuredWidth() != 0) {
                f18 = k2Var.getMeasuredWidth();
            }
            if (k2Var.getMeasuredWidth() != 0) {
                f19 = k2Var.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = l2Var2.d;
            layoutParams2.x = (int) (((((f16 - dp) - dp2) - f18) * f14) - (l2Var2.f33662y - dp));
            layoutParams2.y = (int) (((((f17 - dp3) - dp4) - f19) * f15) - (l2Var2.A - dp3));
            AndroidUtilities.updateViewLayout(l2Var2.f33654c, l2Var2.f33652a, layoutParams2);
            NotificationCenter.getGlobalInstance().addObserver(Q, NotificationCenter.didEndCall);
            windowManager.addView(Q.f33652a, layoutParams);
            Q.f33657n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            Q.f33658r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), Q.O);
            if (i12 == 0) {
                Q.f33652a.setScaleX(0.5f);
                Q.f33652a.setScaleY(0.5f);
                Q.f33652a.setAlpha(0.0f);
                Q.f33652a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    l2 l2Var3 = Q;
                    sharedInstance.setSinks(l2Var3.f33657n.d, l2Var3.f33658r.d);
                }
            } else if (i12 == 1) {
                Q.f33652a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    l2 l2Var4 = Q;
                    sharedInstance2.setBackgroundSinks(l2Var4.f33657n.d, l2Var4.f33658r.d);
                }
            }
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && af.d.a(activity) == 1) {
                l2 l2Var5 = Q;
                xe.c cVar = new xe.c(activity, l2Var5);
                cVar.f49135c = "voip-pip";
                cVar.f49136e = 1;
                r2 r2Var = l2Var5.f33658r;
                cVar.f49140j = r2Var.d;
                cVar.f49141k = r2Var.getPlaceholderView();
                l2Var5.f33655e = cVar.a();
            }
        }
    }

    @Override
    public final Bitmap a() {
        r2 r2Var = this.M;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.M.d.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap c() {
        r2 r2Var = this.f33658r;
        if (r2Var != null) {
            q2 q2Var = r2Var.d;
            if (q2Var.isAvailable()) {
                return q2Var.getBitmap();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override
    public final void e(af.f fVar) {
        this.N = fVar;
        WindowManager windowManager = this.f33654c;
        WindowManager.LayoutParams layoutParams = this.d;
        fh.v vVar = this.f33652a;
        windowManager.addView(vVar, layoutParams);
        r2 r2Var = this.M;
        if (r2Var != null) {
            r2Var.d.release();
            this.M = null;
        }
        vVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f33657n.d, this.f33658r.d);
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(af.f fVar) {
        this.N = fVar;
        r2 r2Var = this.f33658r;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.f33657n.d, this.M.d);
        }
        WindowManager windowManager = this.f33654c;
        fh.v vVar = this.f33652a;
        windowManager.removeView(vVar);
        vVar.invalidate();
    }

    @Override
    public final View h() {
        r2 r2Var = new r2(this.f33658r.getContext(), false, true, false, false);
        this.M = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.M.d.setEnableHardwareScaler(true);
        this.M.d.setRotateTextureWithScreen(true);
        r2 r2Var2 = this.M;
        r2Var2.T = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new i2(this));
        View view = this.M.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.M;
    }

    public final void j() {
        this.f33657n.d.release();
        this.f33658r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.f33652a.setVisibility(8);
        if (this.f33652a.getParent() != null) {
            k2 k2Var = this.f33653b;
            float[] fArr = this.f33661x;
            int i9 = k2.h;
            k2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            l2 l2Var = k2Var.f33641f;
            int i10 = l2Var.d.x;
            k2 k2Var2 = l2Var.f33653b;
            float left = k2Var2.getLeft() + i10;
            float f10 = k2Var.f33638b;
            fArr[0] = (left - f10) / (((point.x - f10) - k2Var.f33639c) - k2Var2.getMeasuredWidth());
            float top = k2Var2.getTop() + l2Var.d.y;
            float f11 = k2Var.d;
            fArr[1] = (top - f11) / (((point.y - f11) - k2Var.f33640e) - k2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.f33661x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.f33661x[1]))).apply();
            try {
                this.f33654c.removeView(this.f33652a);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        xe.d dVar = this.f33655e;
        if (dVar != null) {
            dVar.c();
            this.f33655e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f33653b.getMeasuredWidth() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = this.C;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f10 = 1.0f;
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
            r2 r2Var = this.f33657n;
            r2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            r2Var.setIsScreencast(sharedInstance.isScreencast());
            r2Var.d(1.0f, false);
        }
        if (!z10) {
            if (!this.C) {
                f10 = 0.0f;
            }
            this.f33659s = f10;
        } else if (z13 != this.C) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f33659s;
            if (!this.C) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.f33660w);
            this.v.setDuration(300L).setInterpolator(gr.f28844f);
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
    public final void onMediaStateUpdated(int i9, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            Context context = Q.f33652a.getContext();
            if (this.f33655e == null && af.d.a(context) == 1 && (context instanceof Activity)) {
                xe.c cVar = new xe.c((Activity) context, this);
                cVar.f49135c = "voip-pip";
                cVar.f49136e = 1;
                r2 r2Var = this.f33658r;
                cVar.f49140j = r2Var.d;
                cVar.f49141k = r2Var.getPlaceholderView();
                this.f33655e = cVar.a();
            }
        } else {
            xe.d dVar = this.f33655e;
            if (dVar != null) {
                dVar.c();
                this.f33655e = null;
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
    public final void onStateChanged(int i9) {
        if (i9 == 11 || i9 == 17 || i9 == 4 || i9 == 10) {
            AndroidUtilities.runOnUIThread(new hc(19), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            i();
        } else if (i9 == 3 && !sharedInstance.isVideoAvailable()) {
            i();
        } else {
            m();
        }
    }

    @Override
    public final void b(Canvas canvas) {
    }

    @Override
    public final void d(Canvas canvas) {
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
    }
}

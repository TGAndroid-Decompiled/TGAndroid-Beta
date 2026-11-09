package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;
public final class k extends ViewGroup {
    public final j D;
    public final FrameLayout f39369a;
    public final k2 f39370b;
    public final int f39371c;
    public final int d;
    public boolean f39372e;
    public boolean f39373f;
    public boolean h;
    public float f39374n;
    public volatile long f39375r;
    public volatile int f39376s;
    public volatile int f39377w;
    public volatile boolean f39378x;
    public final i f39379y;

    public k(Context context) {
        super(context);
        this.f39371c = org.telegram.messenger.g0.L(6.0f);
        this.d = org.telegram.messenger.g0.L(6.0f);
        this.h = true;
        this.f39379y = new i(this, 0);
        this.D = new j(this, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39369a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new fh.a(this, 6));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(org.telegram.messenger.g0.L(2.0f));
        k2 k2Var = new k2(context, false, true, false, false);
        this.f39370b = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setMirror(true);
        k2Var.f39420a0 = 0;
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        frameLayout.addView(k2Var);
        frameLayout.setAlpha(0.0f);
        frameLayout.setScaleX(0.6f);
        frameLayout.setScaleY(0.6f);
        frameLayout.setVisibility(4);
        addView(frameLayout);
    }

    public final void a() {
        if (this.f39372e) {
            return;
        }
        this.f39372e = true;
        this.f39370b.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.D);
        }
        c();
    }

    public final void b() {
        if (!this.f39372e) {
            return;
        }
        this.f39372e = false;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.removeExtraLocalSink(this.D);
        }
        org.telegram.messenger.g0.r(this.f39379y);
        this.f39378x = false;
        this.f39370b.d.release();
    }

    public final void c() {
        boolean z9;
        boolean z10;
        float f10;
        if (this.f39372e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            boolean z11 = true;
            if (sharedInstance != null && sharedInstance.getVideoState(false) == 2 && !sharedInstance.isScreencast()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (SystemClock.elapsedRealtime() - this.f39375r < 1000) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.f39370b.d.setMirror(isFrontFaceCamera);
            }
            int i7 = this.f39376s;
            int i10 = this.f39377w;
            if (i7 > 0 && i10 > 0) {
                f10 = i7 / i10;
            } else {
                f10 = 0.0f;
            }
            if (f10 > 0.0f && Math.abs(f10 - this.f39374n) > 0.01f) {
                this.f39374n = f10;
                requestLayout();
            }
            if (!z9 || !z10) {
                z11 = false;
            }
            FrameLayout frameLayout = this.f39369a;
            if (this.f39373f == z11) {
                return;
            }
            this.f39373f = z11;
            frameLayout.animate().cancel();
            if (z11) {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(xq.h).withEndAction(null).start();
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(xq.f40459g).withEndAction(new i(this, 1)).start();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f39371c;
        int i14 = (i11 - i7) - i13;
        FrameLayout frameLayout = this.f39369a;
        frameLayout.layout(i14 - frameLayout.getMeasuredWidth(), i13, i14, frameLayout.getMeasuredHeight() + i13);
        frameLayout.setPivotX(frameLayout.getMeasuredWidth());
        frameLayout.setPivotY(0.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f12 = this.f39374n;
        if (f12 <= 0.0f) {
            f12 = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * f10) * f11) / f12);
        float f13 = f12 * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f13), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.f39369a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f13 * min)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), 1073741824));
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.nr;
import org.webrtc.RendererCommon;
public final class k extends ViewGroup {
    public final j E;
    public final FrameLayout f41097a;
    public final n2 f41098b;
    public final int f41099c;
    public final int d;
    public boolean f41100e;
    public boolean f41101f;
    public boolean h;
    public float f41102n;
    public volatile long f41103r;
    public volatile int f41104s;
    public volatile int f41105w;
    public volatile boolean f41106x;
    public final i f41107y;

    public k(Context context) {
        super(context);
        this.f41099c = org.telegram.messenger.g0.L(6.0f);
        this.d = org.telegram.messenger.g0.L(6.0f);
        this.h = true;
        this.f41107y = new i(this, 0);
        this.E = new j(this, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41097a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new fh.a(this, 6));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(org.telegram.messenger.g0.L(2.0f));
        n2 n2Var = new n2(context, false, true, false, false);
        this.f41098b = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        m2Var.setEnableHardwareScaler(true);
        m2Var.setMirror(true);
        n2Var.f41214b0 = 0;
        View view = n2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        frameLayout.addView(n2Var);
        frameLayout.setAlpha(0.0f);
        frameLayout.setScaleX(0.6f);
        frameLayout.setScaleY(0.6f);
        frameLayout.setVisibility(4);
        addView(frameLayout);
    }

    public final void a() {
        if (this.f41100e) {
            return;
        }
        this.f41100e = true;
        this.f41098b.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.E);
        }
        c();
    }

    public final void b() {
        if (!this.f41100e) {
            return;
        }
        this.f41100e = false;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.removeExtraLocalSink(this.E);
        }
        org.telegram.messenger.g0.r(this.f41107y);
        this.f41106x = false;
        this.f41098b.d.release();
    }

    public final void c() {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f41100e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            boolean z12 = true;
            if (sharedInstance != null && sharedInstance.getVideoState(false) == 2 && !sharedInstance.isScreencast()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (SystemClock.elapsedRealtime() - this.f41103r < 1000) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.f41098b.d.setMirror(isFrontFaceCamera);
            }
            int i7 = this.f41104s;
            int i10 = this.f41105w;
            if (i7 > 0 && i10 > 0) {
                f10 = i7 / i10;
            } else {
                f10 = 0.0f;
            }
            if (f10 > 0.0f && Math.abs(f10 - this.f41102n) > 0.01f) {
                this.f41102n = f10;
                requestLayout();
            }
            if (!z10 || !z11) {
                z12 = false;
            }
            FrameLayout frameLayout = this.f41097a;
            if (this.f41101f == z12) {
                return;
            }
            this.f41101f = z12;
            frameLayout.animate().cancel();
            if (z12) {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(nr.h).withEndAction(null).start();
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(nr.f37962g).withEndAction(new i(this, 1)).start();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f41099c;
        int i14 = (i11 - i7) - i13;
        FrameLayout frameLayout = this.f41097a;
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
        float f12 = this.f41102n;
        if (f12 <= 0.0f) {
            f12 = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * f10) * f11) / f12);
        float f13 = f12 * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f13), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.f41097a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f13 * min)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), 1073741824));
    }
}

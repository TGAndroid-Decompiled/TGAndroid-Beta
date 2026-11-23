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
    public final FrameLayout f41096a;
    public final n2 f41097b;
    public final int f41098c;
    public final int d;
    public boolean f41099e;
    public boolean f41100f;
    public boolean h;
    public float f41101n;
    public volatile long f41102r;
    public volatile int f41103s;
    public volatile int f41104w;
    public volatile boolean f41105x;
    public final i f41106y;

    public k(Context context) {
        super(context);
        this.f41098c = org.telegram.messenger.g0.L(6.0f);
        this.d = org.telegram.messenger.g0.L(6.0f);
        this.h = true;
        this.f41106y = new i(this, 0);
        this.E = new j(this, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41096a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new fh.a(this, 6));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(org.telegram.messenger.g0.L(2.0f));
        n2 n2Var = new n2(context, false, true, false, false);
        this.f41097b = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        m2Var.setEnableHardwareScaler(true);
        m2Var.setMirror(true);
        n2Var.f41213b0 = 0;
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
        if (this.f41099e) {
            return;
        }
        this.f41099e = true;
        this.f41097b.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.E);
        }
        c();
    }

    public final void b() {
        if (!this.f41099e) {
            return;
        }
        this.f41099e = false;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.removeExtraLocalSink(this.E);
        }
        org.telegram.messenger.g0.r(this.f41106y);
        this.f41105x = false;
        this.f41097b.d.release();
    }

    public final void c() {
        boolean z10;
        boolean z11;
        float f10;
        if (this.f41099e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            boolean z12 = true;
            if (sharedInstance != null && sharedInstance.getVideoState(false) == 2 && !sharedInstance.isScreencast()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (SystemClock.elapsedRealtime() - this.f41102r < 1000) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.f41097b.d.setMirror(isFrontFaceCamera);
            }
            int i7 = this.f41103s;
            int i10 = this.f41104w;
            if (i7 > 0 && i10 > 0) {
                f10 = i7 / i10;
            } else {
                f10 = 0.0f;
            }
            if (f10 > 0.0f && Math.abs(f10 - this.f41101n) > 0.01f) {
                this.f41101n = f10;
                requestLayout();
            }
            if (!z10 || !z11) {
                z12 = false;
            }
            FrameLayout frameLayout = this.f41096a;
            if (this.f41100f == z12) {
                return;
            }
            this.f41100f = z12;
            frameLayout.animate().cancel();
            if (z12) {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(nr.h).withEndAction(null).start();
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(nr.f37961g).withEndAction(new i(this, 1)).start();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f41098c;
        int i14 = (i11 - i7) - i13;
        FrameLayout frameLayout = this.f41096a;
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
        float f12 = this.f41101n;
        if (f12 <= 0.0f) {
            f12 = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * f10) * f11) / f12);
        float f13 = f12 * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f13), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.f41096a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f13 * min)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), 1073741824));
    }
}

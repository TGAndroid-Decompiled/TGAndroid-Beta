package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.webrtc.RendererCommon;
public final class d0 extends ViewGroup {
    public final long D;
    public boolean E;
    public long F;
    public boolean G;
    public float H;
    public long I;
    public float J;
    public float K;
    public boolean L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public float P;
    public float Q;
    public int R;
    public int S;
    public final j T;
    public final e0 U;
    public final String f39218a;
    public s3 f39219b;
    public final k2 f39220c;
    public final h d;
    public final TextView f39221e;
    public final Paint f39222f;
    public final RectF h;
    public TLRPC.GroupCallParticipant f39223n;
    public boolean f39224r;
    public volatile long f39225s;
    public volatile int f39226w;
    public volatile int f39227x;
    public long f39228y;

    public d0(e0 e0Var, Context context, String str, s3 s3Var) {
        super(context);
        Context context2;
        this.U = e0Var;
        Paint paint = new Paint(1);
        this.f39222f = paint;
        this.h = new RectF();
        this.D = SystemClock.elapsedRealtime();
        this.E = false;
        this.J = 0.0f;
        this.K = 0.0f;
        this.M = new float[4];
        this.N = new float[4];
        this.O = new float[4];
        this.T = new j(this, 1);
        this.f39218a = str;
        this.f39219b = s3Var;
        setBackgroundColor(-14999773);
        setOutlineProvider(new bg.q0(17));
        setClipToOutline(true);
        if (s3Var != null) {
            context2 = context;
            k2 k2Var = new k2(context2, false, false, false, false);
            this.f39220c = k2Var;
            RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            j2 j2Var = k2Var.d;
            j2Var.setScalingType(scalingType);
            j2Var.setEnableHardwareScaler(true);
            k2Var.f39420a0 = 1;
            j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new c0(this));
            View view = k2Var.h;
            if (view != null) {
                view.setVisibility(8);
            }
            addView(k2Var);
        } else {
            context2 = context;
            this.f39220c = null;
        }
        h hVar = new h(context2);
        this.d = hVar;
        addView(hVar);
        TextView textView = new TextView(context2);
        this.f39221e = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(l6.x0(null, l6.f27894eh, false));
        setWillNotDraw(false);
        c();
    }

    public static void a(d0 d0Var) {
        e0 e0Var = d0Var.U;
        a0 a0Var = e0Var.f39256b;
        if (a0Var != null) {
            if (a0Var.f39165a.contains(d0Var) || e0Var.f39256b.f39167c.contains(d0Var)) {
                e0Var.f39256b.j(false);
            }
        }
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant = this.f39223n;
        if (groupCallParticipant != null && sharedInstance != null) {
            sharedInstance.removeExtraRemoteSink(groupCallParticipant, this.f39224r, this.T);
        }
        this.f39223n = null;
        k2 k2Var = this.f39220c;
        if (k2Var != null) {
            k2Var.d.release();
        }
    }

    public final void c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s3 s3Var = this.f39219b;
        if (s3Var != null && this.f39220c != null && this.f39223n == null && sharedInstance != null && sharedInstance.addExtraRemoteSink(s3Var.f25409a, s3Var.f25410b, this.T)) {
            s3 s3Var2 = this.f39219b;
            this.f39223n = s3Var2.f25409a;
            this.f39224r = s3Var2.f25410b;
        }
    }

    public final void d(boolean z9) {
        s3 s3Var;
        j2 j2Var;
        int i7;
        int i10;
        int i11 = this.f39226w;
        int i12 = this.f39227x;
        if (i11 > 0 && i12 > 0) {
            this.J = i11 / i12;
            return;
        }
        k2 k2Var = this.f39220c;
        if (k2Var != null && k2Var.d.isFirstFrameRendered() && (i7 = (j2Var = this.f39220c.d).rotatedFrameWidth) > 0 && (i10 = j2Var.rotatedFrameHeight) > 0) {
            this.J = i7 / i10;
        } else if (z9 && this.J <= 0.0f && (s3Var = this.f39219b) != null) {
            float f10 = s3Var.f25411c;
            if (f10 > 0.0f) {
                this.J = f10;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        long min;
        float f10;
        super.dispatchDraw(canvas);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.I;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.I = uptimeMillis;
        if (this.G && this.E) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.H;
        float min2 = (Math.min(1.0f, ((float) min) / 150.0f) * (f10 - f11)) + f11;
        this.H = min2;
        if (min2 > 0.01f) {
            Paint paint = this.f39222f;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            RectF rectF = this.h;
            rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
            paint.setAlpha((int) (this.H * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        }
        if (Math.abs(f10 - this.H) > 0.01f) {
            invalidate();
            return;
        }
        this.H = f10;
        this.I = 0L;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int i15 = 0;
        this.d.layout(0, 0, i13, i14);
        k2 k2Var = this.f39220c;
        if (k2Var != null) {
            int measuredWidth = k2Var.getMeasuredWidth();
            int measuredHeight = k2Var.getMeasuredHeight();
            int i16 = (i13 - measuredWidth) / 2;
            int i17 = (i14 - measuredHeight) / 2;
            k2Var.layout(i16, i17, i16 + measuredWidth, i17 + measuredHeight);
            float max = Math.max(i13 / measuredWidth, i14 / measuredHeight);
            k2Var.setScaleX(max);
            k2Var.setScaleY(max);
        }
        if (i13 >= org.telegram.messenger.g0.L(72.0f) && i14 >= org.telegram.messenger.g0.L(48.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i15 = 8;
        }
        TextView textView = this.f39221e;
        textView.setVisibility(i15);
        int L = (i14 - org.telegram.messenger.g0.L(6.0f)) - textView.getMeasuredHeight();
        textView.layout(org.telegram.messenger.g0.L(6.0f), L, textView.getMeasuredWidth() + org.telegram.messenger.g0.L(6.0f), textView.getMeasuredHeight() + L);
        invalidateOutline();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        this.f39221e.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(12.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        k2 k2Var = this.f39220c;
        if (k2Var != null) {
            int i11 = this.R;
            if (i11 > 0) {
                size = i11;
            }
            int i12 = this.S;
            if (i12 > 0) {
                size2 = i12;
            }
            if (k2Var.getMeasuredWidth() != size || k2Var.getMeasuredHeight() != size2 || k2Var.isLayoutRequested()) {
                k2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }
}

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
import org.telegram.ui.ActionBar.j6;
import org.webrtc.RendererCommon;
public final class e0 extends ViewGroup {
    public final long E;
    public boolean F;
    public long G;
    public boolean H;
    public float I;
    public long J;
    public float K;
    public float L;
    public boolean M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public final j U;
    public final f0 V;
    public final String f40571a;
    public s3 f40572b;
    public final o2 f40573c;
    public final h d;
    public final TextView f40574e;
    public final Paint f40575f;
    public final RectF h;
    public TLRPC.GroupCallParticipant f40576n;
    public boolean f40577r;
    public volatile long f40578s;
    public volatile int f40579w;
    public volatile int f40580x;
    public long f40581y;

    public e0(f0 f0Var, Context context, String str, s3 s3Var) {
        super(context);
        Context context2;
        this.V = f0Var;
        Paint paint = new Paint(1);
        this.f40575f = paint;
        this.h = new RectF();
        this.E = SystemClock.elapsedRealtime();
        this.F = false;
        this.K = 0.0f;
        this.L = 0.0f;
        this.N = new float[4];
        this.O = new float[4];
        this.P = new float[4];
        this.U = new j(this, 1);
        this.f40571a = str;
        this.f40572b = s3Var;
        setBackgroundColor(-14999773);
        setOutlineProvider(new bg.p0(17));
        setClipToOutline(true);
        if (s3Var != null) {
            context2 = context;
            o2 o2Var = new o2(context2, false, false, false, false);
            this.f40573c = o2Var;
            RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            n2 n2Var = o2Var.d;
            n2Var.setScalingType(scalingType);
            n2Var.setEnableHardwareScaler(true);
            o2Var.f40832b0 = 1;
            n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d0(this));
            View view = o2Var.h;
            if (view != null) {
                view.setVisibility(8);
            }
            addView(o2Var);
        } else {
            context2 = context;
            this.f40573c = null;
        }
        h hVar = new h(context2);
        this.d = hVar;
        addView(hVar);
        TextView textView = new TextView(context2);
        this.f40574e = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(j6.x0(null, j6.f28932hh, false));
        setWillNotDraw(false);
        c();
    }

    public static void a(e0 e0Var) {
        f0 f0Var = e0Var.V;
        b0 b0Var = f0Var.f40608b;
        if (b0Var != null) {
            if (b0Var.f40505a.contains(e0Var) || f0Var.f40608b.f40507c.contains(e0Var)) {
                f0Var.f40608b.j(false);
            }
        }
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant = this.f40576n;
        if (groupCallParticipant != null && sharedInstance != null) {
            sharedInstance.removeExtraRemoteSink(groupCallParticipant, this.f40577r, this.U);
        }
        this.f40576n = null;
        o2 o2Var = this.f40573c;
        if (o2Var != null) {
            o2Var.d.release();
        }
    }

    public final void c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s3 s3Var = this.f40572b;
        if (s3Var != null && this.f40573c != null && this.f40576n == null && sharedInstance != null && sharedInstance.addExtraRemoteSink(s3Var.f26403a, s3Var.f26404b, this.U)) {
            s3 s3Var2 = this.f40572b;
            this.f40576n = s3Var2.f26403a;
            this.f40577r = s3Var2.f26404b;
        }
    }

    public final void d(boolean z10) {
        s3 s3Var;
        n2 n2Var;
        int i7;
        int i10;
        int i11 = this.f40579w;
        int i12 = this.f40580x;
        if (i11 > 0 && i12 > 0) {
            this.K = i11 / i12;
            return;
        }
        o2 o2Var = this.f40573c;
        if (o2Var != null && o2Var.d.isFirstFrameRendered() && (i7 = (n2Var = this.f40573c.d).rotatedFrameWidth) > 0 && (i10 = n2Var.rotatedFrameHeight) > 0) {
            this.K = i7 / i10;
        } else if (z10 && this.K <= 0.0f && (s3Var = this.f40572b) != null) {
            float f10 = s3Var.f26405c;
            if (f10 > 0.0f) {
                this.K = f10;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        long min;
        float f10;
        super.dispatchDraw(canvas);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.J;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.J = uptimeMillis;
        if (this.H && this.F) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.I;
        float min2 = (Math.min(1.0f, ((float) min) / 150.0f) * (f10 - f11)) + f11;
        this.I = min2;
        if (min2 > 0.01f) {
            Paint paint = this.f40575f;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            RectF rectF = this.h;
            rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
            paint.setAlpha((int) (this.I * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        }
        if (Math.abs(f10 - this.I) > 0.01f) {
            invalidate();
            return;
        }
        this.I = f10;
        this.J = 0L;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int i15 = 0;
        this.d.layout(0, 0, i13, i14);
        o2 o2Var = this.f40573c;
        if (o2Var != null) {
            int measuredWidth = o2Var.getMeasuredWidth();
            int measuredHeight = o2Var.getMeasuredHeight();
            int i16 = (i13 - measuredWidth) / 2;
            int i17 = (i14 - measuredHeight) / 2;
            o2Var.layout(i16, i17, i16 + measuredWidth, i17 + measuredHeight);
            float max = Math.max(i13 / measuredWidth, i14 / measuredHeight);
            o2Var.setScaleX(max);
            o2Var.setScaleY(max);
        }
        if (i13 >= org.telegram.messenger.g0.L(72.0f) && i14 >= org.telegram.messenger.g0.L(48.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i15 = 8;
        }
        TextView textView = this.f40574e;
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
        this.f40574e.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(12.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        o2 o2Var = this.f40573c;
        if (o2Var != null) {
            int i11 = this.S;
            if (i11 > 0) {
                size = i11;
            }
            int i12 = this.T;
            if (i12 > 0) {
                size2 = i12;
            }
            if (o2Var.getMeasuredWidth() != size || o2Var.getMeasuredHeight() != size2 || o2Var.isLayoutRequested()) {
                o2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }
}

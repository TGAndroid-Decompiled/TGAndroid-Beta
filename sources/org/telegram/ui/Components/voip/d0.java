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
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.webrtc.RendererCommon;
public final class d0 extends ViewGroup {
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
    public final e0 V;
    public final String f40939a;
    public u3 f40940b;
    public final n2 f40941c;
    public final h d;
    public final TextView f40942e;
    public final Paint f40943f;
    public final RectF h;
    public TLRPC.GroupCallParticipant f40944n;
    public boolean f40945r;
    public volatile long f40946s;
    public volatile int f40947w;
    public volatile int f40948x;
    public long f40949y;

    public d0(e0 e0Var, Context context, String str, u3 u3Var) {
        super(context);
        Context context2;
        this.V = e0Var;
        Paint paint = new Paint(1);
        this.f40943f = paint;
        this.h = new RectF();
        this.E = SystemClock.elapsedRealtime();
        this.F = false;
        this.K = 0.0f;
        this.L = 0.0f;
        this.N = new float[4];
        this.O = new float[4];
        this.P = new float[4];
        this.U = new j(this, 1);
        this.f40939a = str;
        this.f40940b = u3Var;
        setBackgroundColor(-14999773);
        setOutlineProvider(new bg.q0(17));
        setClipToOutline(true);
        if (u3Var != null) {
            context2 = context;
            n2 n2Var = new n2(context2, false, false, false, false);
            this.f40941c = n2Var;
            RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            m2 m2Var = n2Var.d;
            m2Var.setScalingType(scalingType);
            m2Var.setEnableHardwareScaler(true);
            n2Var.f41212b0 = 1;
            m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new c0(this));
            View view = n2Var.h;
            if (view != null) {
                view.setVisibility(8);
            }
            addView(n2Var);
        } else {
            context2 = context;
            this.f40941c = null;
        }
        h hVar = new h(context2);
        this.d = hVar;
        addView(hVar);
        TextView textView = new TextView(context2);
        this.f40942e = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(m6.x0(null, m6.f29461hh, false));
        setWillNotDraw(false);
        c();
    }

    public static void a(d0 d0Var) {
        e0 e0Var = d0Var.V;
        a0 a0Var = e0Var.f40987b;
        if (a0Var != null) {
            if (a0Var.f40885a.contains(d0Var) || e0Var.f40987b.f40887c.contains(d0Var)) {
                e0Var.f40987b.j(false);
            }
        }
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        TLRPC.GroupCallParticipant groupCallParticipant = this.f40944n;
        if (groupCallParticipant != null && sharedInstance != null) {
            sharedInstance.removeExtraRemoteSink(groupCallParticipant, this.f40945r, this.U);
        }
        this.f40944n = null;
        n2 n2Var = this.f40941c;
        if (n2Var != null) {
            n2Var.d.release();
        }
    }

    public final void c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        u3 u3Var = this.f40940b;
        if (u3Var != null && this.f40941c != null && this.f40944n == null && sharedInstance != null && sharedInstance.addExtraRemoteSink(u3Var.f27145a, u3Var.f27146b, this.U)) {
            u3 u3Var2 = this.f40940b;
            this.f40944n = u3Var2.f27145a;
            this.f40945r = u3Var2.f27146b;
        }
    }

    public final void d(boolean z10) {
        u3 u3Var;
        m2 m2Var;
        int i7;
        int i10;
        int i11 = this.f40947w;
        int i12 = this.f40948x;
        if (i11 > 0 && i12 > 0) {
            this.K = i11 / i12;
            return;
        }
        n2 n2Var = this.f40941c;
        if (n2Var != null && n2Var.d.isFirstFrameRendered() && (i7 = (m2Var = this.f40941c.d).rotatedFrameWidth) > 0 && (i10 = m2Var.rotatedFrameHeight) > 0) {
            this.K = i7 / i10;
        } else if (z10 && this.K <= 0.0f && (u3Var = this.f40940b) != null) {
            float f10 = u3Var.f27147c;
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
            Paint paint = this.f40943f;
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
        n2 n2Var = this.f40941c;
        if (n2Var != null) {
            int measuredWidth = n2Var.getMeasuredWidth();
            int measuredHeight = n2Var.getMeasuredHeight();
            int i16 = (i13 - measuredWidth) / 2;
            int i17 = (i14 - measuredHeight) / 2;
            n2Var.layout(i16, i17, i16 + measuredWidth, i17 + measuredHeight);
            float max = Math.max(i13 / measuredWidth, i14 / measuredHeight);
            n2Var.setScaleX(max);
            n2Var.setScaleY(max);
        }
        if (i13 >= org.telegram.messenger.g0.L(72.0f) && i14 >= org.telegram.messenger.g0.L(48.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i15 = 8;
        }
        TextView textView = this.f40942e;
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
        this.f40942e.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(12.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        n2 n2Var = this.f40941c;
        if (n2Var != null) {
            int i11 = this.S;
            if (i11 > 0) {
                size = i11;
            }
            int i12 = this.T;
            if (i12 > 0) {
                size2 = i12;
            }
            if (n2Var.getMeasuredWidth() != size || n2Var.getMeasuredHeight() != size2 || n2Var.isLayoutRequested()) {
                n2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }
}

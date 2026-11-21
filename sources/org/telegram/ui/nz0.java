package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nz0 extends FrameLayout {
    public final Paint f50362a;
    public final Paint f50363b;
    public final RectF f50364c;
    public final org.telegram.ui.Components.o01 d;
    public boolean f50365e;
    public long f50366f;
    public long h;
    public final org.telegram.ui.Components.oh0 f50367n;
    public final TextPaint f50368r;
    public StaticLayout f50369s;
    public float f50370w;
    public float f50371x;
    public final SecretMediaViewer f50372y;

    public nz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f50372y = secretMediaViewer;
        this.f50364c = new RectF();
        this.d = new org.telegram.ui.Components.o01();
        this.f50368r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f50363b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f50362a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624021, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f50367n = oh0Var;
        oh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oh0Var.R(this);
        oh0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.fj fjVar = this.f50372y.f43772g0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f23993k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f50366f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f50366f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f43755a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f50365e;
                Paint paint = this.f50363b;
                Paint paint2 = this.f50362a;
                RectF rectF = this.f50364c;
                if (z10) {
                    canvas.save();
                    org.telegram.messenger.n10.k(this.f50371x, 2.0f, rectF.centerY(), rectF.centerX() - (this.f50370w / 2.0f), canvas);
                    this.f50369s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f10 = 19.285715f;
                    for (int i7 = 0; i7 < 5; i7++) {
                        canvas.drawArc(rectF, f10 + 270.0f, 12.857143f, false, paint2);
                        f10 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - org.telegram.messenger.g0.L(1.0f);
                    float L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.Components.oh0 oh0Var = this.f50367n;
                    oh0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    oh0Var.draw(canvas);
                    float f11 = max * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f11, false, paint2);
                    this.d.a(f11, 1.0f, canvas, paint, rectF);
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = org.telegram.messenger.g0.N(10.5f);
        this.f50364c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

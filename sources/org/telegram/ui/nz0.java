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
    public final Paint f50366a;
    public final Paint f50367b;
    public final RectF f50368c;
    public final org.telegram.ui.Components.n01 d;
    public boolean f50369e;
    public long f50370f;
    public long h;
    public final org.telegram.ui.Components.oh0 f50371n;
    public final TextPaint f50372r;
    public StaticLayout f50373s;
    public float f50374w;
    public float f50375x;
    public final SecretMediaViewer f50376y;

    public nz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f50376y = secretMediaViewer;
        this.f50368c = new RectF();
        this.d = new org.telegram.ui.Components.n01();
        this.f50372r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f50367b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f50366a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624021, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f50371n = oh0Var;
        oh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oh0Var.R(this);
        oh0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.gj gjVar = this.f50376y.f43776g0;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f24213k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f50370f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f50370f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f43759a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f50369e;
                Paint paint = this.f50367b;
                Paint paint2 = this.f50366a;
                RectF rectF = this.f50368c;
                if (z10) {
                    canvas.save();
                    org.telegram.messenger.o10.k(this.f50375x, 2.0f, rectF.centerY(), rectF.centerX() - (this.f50374w / 2.0f), canvas);
                    this.f50373s.draw(canvas);
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
                    org.telegram.ui.Components.oh0 oh0Var = this.f50371n;
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
        this.f50368c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

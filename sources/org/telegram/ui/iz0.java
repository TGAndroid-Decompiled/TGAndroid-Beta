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
public final class iz0 extends FrameLayout {
    public final Paint f48149a;
    public final Paint f48150b;
    public final RectF f48151c;
    public final org.telegram.ui.Components.e01 d;
    public boolean f48152e;
    public long f48153f;
    public long h;
    public final org.telegram.ui.Components.ch0 f48154n;
    public final TextPaint f48155r;
    public StaticLayout f48156s;
    public float f48157w;
    public float f48158x;
    public final SecretMediaViewer f48159y;

    public iz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f48159y = secretMediaViewer;
        this.f48151c = new RectF();
        this.d = new org.telegram.ui.Components.e01();
        this.f48155r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f48150b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f48149a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624021, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f48154n = ch0Var;
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ch0Var.R(this);
        ch0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.gj gjVar = this.f48159y.f43285g0;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23819k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f48153f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f48153f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f43268a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f48152e;
                Paint paint = this.f48150b;
                Paint paint2 = this.f48149a;
                RectF rectF = this.f48151c;
                if (z10) {
                    canvas.save();
                    org.telegram.messenger.i20.j(this.f48158x, 2.0f, rectF.centerY(), rectF.centerX() - (this.f48157w / 2.0f), canvas);
                    this.f48156s.draw(canvas);
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
                    org.telegram.ui.Components.ch0 ch0Var = this.f48154n;
                    ch0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    ch0Var.draw(canvas);
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
        this.f48151c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

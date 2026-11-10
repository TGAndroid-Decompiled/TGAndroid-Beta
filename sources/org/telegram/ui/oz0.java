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
public final class oz0 extends FrameLayout {
    public final Paint f48597a;
    public final Paint f48598b;
    public final RectF f48599c;
    public final org.telegram.ui.Components.c01 d;
    public boolean f48600e;
    public long f48601f;
    public long h;
    public final org.telegram.ui.Components.zg0 f48602n;
    public final TextPaint f48603r;
    public StaticLayout f48604s;
    public float f48605w;
    public float f48606x;
    public final SecretMediaViewer f48607y;

    public oz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f48607y = secretMediaViewer;
        this.f48599c = new RectF();
        this.d = new org.telegram.ui.Components.c01();
        this.f48603r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f48598b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f48597a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624020, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f48602n = zg0Var;
        zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        zg0Var.R(this);
        zg0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.ij ijVar = this.f48607y.f41910f0;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23266k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f48601f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f48601f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f41895a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z9 = this.f48600e;
                Paint paint = this.f48598b;
                Paint paint2 = this.f48597a;
                RectF rectF = this.f48599c;
                if (z9) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.f48605w / 2.0f), rectF.centerY() - (this.f48606x / 2.0f));
                    this.f48604s.draw(canvas);
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
                    org.telegram.ui.Components.zg0 zg0Var = this.f48602n;
                    zg0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    zg0Var.draw(canvas);
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
        this.f48599c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

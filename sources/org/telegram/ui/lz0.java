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
public final class lz0 extends FrameLayout {
    public final Paint f49901a;
    public final Paint f49902b;
    public final RectF f49903c;
    public final org.telegram.ui.Components.m01 d;
    public boolean f49904e;
    public long f49905f;
    public long h;
    public final org.telegram.ui.Components.nh0 f49906n;
    public final TextPaint f49907r;
    public StaticLayout f49908s;
    public float f49909w;
    public float f49910x;
    public final SecretMediaViewer f49911y;

    public lz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f49911y = secretMediaViewer;
        this.f49903c = new RectF();
        this.d = new org.telegram.ui.Components.m01();
        this.f49907r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f49902b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f49901a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624021, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f49906n = nh0Var;
        nh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        nh0Var.R(this);
        nh0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.fj fjVar = this.f49911y.f43857g0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f49905f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f49905f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f43840a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f49904e;
                Paint paint = this.f49902b;
                Paint paint2 = this.f49901a;
                RectF rectF = this.f49903c;
                if (z10) {
                    canvas.save();
                    org.telegram.messenger.m10.k(this.f49910x, 2.0f, rectF.centerY(), rectF.centerX() - (this.f49909w / 2.0f), canvas);
                    this.f49908s.draw(canvas);
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
                    org.telegram.ui.Components.nh0 nh0Var = this.f49906n;
                    nh0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    nh0Var.draw(canvas);
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
        this.f49903c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

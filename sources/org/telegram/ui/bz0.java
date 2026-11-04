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
public final class bz0 extends FrameLayout {
    public final Paint f44168a;
    public final Paint f44169b;
    public final RectF f44170c;
    public final org.telegram.ui.Components.b01 d;
    public boolean f44171e;
    public long f44172f;
    public long h;
    public final org.telegram.ui.Components.ch0 f44173n;
    public final TextPaint f44174r;
    public StaticLayout f44175s;
    public float f44176w;
    public float f44177x;
    public final SecretMediaViewer f44178y;

    public bz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f44178y = secretMediaViewer;
        this.f44170c = new RectF();
        this.d = new org.telegram.ui.Components.b01();
        this.f44174r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f44169b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f44168a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624020, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f44173n = ch0Var;
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ch0Var.R(this);
        ch0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.zi ziVar = this.f44178y.f41942g0;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f44172f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f44172f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f41925a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f44171e;
                Paint paint = this.f44169b;
                Paint paint2 = this.f44168a;
                RectF rectF = this.f44170c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.f44176w / 2.0f), rectF.centerY() - (this.f44177x / 2.0f));
                    this.f44175s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f10 = 19.285715f;
                    for (int i3 = 0; i3 < 5; i3++) {
                        canvas.drawArc(rectF, f10 + 270.0f, 12.857143f, false, paint2);
                        f10 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - org.telegram.messenger.g0.L(1.0f);
                    float L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.Components.ch0 ch0Var = this.f44173n;
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = org.telegram.messenger.g0.N(10.5f);
        this.f44170c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

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
public final class mz0 extends FrameLayout {
    public final Paint f50033a;
    public final Paint f50034b;
    public final RectF f50035c;
    public final org.telegram.ui.Components.m01 d;
    public boolean f50036e;
    public long f50037f;
    public long h;
    public final org.telegram.ui.Components.mh0 f50038n;
    public final TextPaint f50039r;
    public StaticLayout f50040s;
    public float f50041w;
    public float f50042x;
    public final SecretMediaViewer f50043y;

    public mz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f50043y = secretMediaViewer;
        this.f50035c = new RectF();
        this.d = new org.telegram.ui.Components.m01();
        this.f50039r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f50034b = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f50033a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624021, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        this.f50038n = mh0Var;
        mh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mh0Var.R(this);
        mh0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.fj fjVar = this.f50043y.f43731g0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f23968k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f50037f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f50037f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f43714a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f50036e;
                Paint paint = this.f50034b;
                Paint paint2 = this.f50033a;
                RectF rectF = this.f50035c;
                if (z10) {
                    canvas.save();
                    org.telegram.messenger.n10.k(this.f50042x, 2.0f, rectF.centerY(), rectF.centerX() - (this.f50041w / 2.0f), canvas);
                    this.f50040s.draw(canvas);
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
                    org.telegram.ui.Components.mh0 mh0Var = this.f50038n;
                    mh0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    mh0Var.draw(canvas);
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
        this.f50035c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

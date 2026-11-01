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
public final class a11 extends FrameLayout {
    public final Paint f35526a;
    public final Paint f35527b;
    public final RectF f35528c;
    public final org.telegram.ui.Components.i11 d;
    public boolean e;
    public long f35529f;
    public long h;
    public final org.telegram.ui.Components.ci0 f35530n;
    public final TextPaint f35531r;
    public StaticLayout f35532s;
    public float f35533w;
    public float f35534x;
    public final SecretMediaViewer f35535y;

    public a11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35535y = secretMediaViewer;
        this.f35528c = new RectF();
        this.d = new org.telegram.ui.Components.i11();
        this.f35531r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f35527b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f35526a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624020, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        this.f35530n = ci0Var;
        ci0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ci0Var.R(this);
        ci0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.kj kjVar = this.f35535y.f33997f0;
        if (kjVar != null) {
            TLRPC.Message message = kjVar.f16690k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f35529f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f35529f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f33983a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.e;
                Paint paint = this.f35527b;
                Paint paint2 = this.f35526a;
                RectF rectF = this.f35528c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.f35533w / 2.0f), rectF.centerY() - (this.f35534x / 2.0f));
                    this.f35532s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f7 = 19.285715f;
                    for (int i10 = 0; i10 < 5; i10++) {
                        canvas.drawArc(rectF, f7 + 270.0f, 12.857143f, false, paint2);
                        f7 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - org.telegram.messenger.i0.L(1.0f);
                    float L = org.telegram.messenger.i0.L(8.0f);
                    org.telegram.ui.Components.ci0 ci0Var = this.f35530n;
                    ci0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    ci0Var.draw(canvas);
                    float f10 = max * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f10, false, paint2);
                    this.d.a(f10, 1.0f, canvas, paint, rectF);
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = org.telegram.messenger.i0.N(10.5f);
        this.f35528c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

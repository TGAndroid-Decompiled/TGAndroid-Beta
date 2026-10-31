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
    public final Paint f35511a;
    public final Paint f35512b;
    public final RectF f35513c;
    public final org.telegram.ui.Components.h11 d;
    public boolean e;
    public long f35514f;
    public long h;
    public final org.telegram.ui.Components.bi0 f35515n;
    public final TextPaint f35516r;
    public StaticLayout f35517s;
    public float f35518w;
    public float f35519x;
    public final SecretMediaViewer f35520y;

    public a11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35520y = secretMediaViewer;
        this.f35513c = new RectF();
        this.d = new org.telegram.ui.Components.h11();
        this.f35516r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f35512b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f35511a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624020, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        this.f35515n = bi0Var;
        bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bi0Var.R(this);
        bi0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        org.telegram.messenger.jj jjVar = this.f35520y.f33990f0;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f35514f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f35514f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f33976a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.e;
                Paint paint = this.f35512b;
                Paint paint2 = this.f35511a;
                RectF rectF = this.f35513c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.f35518w / 2.0f), rectF.centerY() - (this.f35519x / 2.0f));
                    this.f35517s.draw(canvas);
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
                    org.telegram.ui.Components.bi0 bi0Var = this.f35515n;
                    bi0Var.setBounds((int) (centerX - L), (int) (centerY - L), (int) (centerX + L), (int) (centerY + L));
                    bi0Var.draw(canvas);
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
        this.f35513c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

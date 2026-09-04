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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d51 extends FrameLayout {
    public final Paint f35662a;
    public final Paint f35663b;
    public final RectF f35664c;
    public final org.telegram.ui.Components.w11 d;
    public boolean f35665e;
    public long f35666f;
    public long h;
    public final org.telegram.ui.Components.xi0 f35667n;
    public final TextPaint f35668r;
    public StaticLayout f35669s;
    public float v;
    public float f35670w;
    public final SecretMediaViewer f35671x;

    public d51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f35671x = secretMediaViewer;
        this.f35664c = new RectF();
        this.d = new org.telegram.ui.Components.w11();
        this.f35668r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f35663b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f35662a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.fire_on, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.f35667n = xi0Var;
        xi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        xi0Var.f32578v0 = this;
        xi0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        MessageObject messageObject = this.f35671x.f34076h0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f35666f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f35666f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f34057a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.f35665e;
                Paint paint = this.f35663b;
                Paint paint2 = this.f35662a;
                float f7 = max;
                RectF rectF = this.f35664c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.v / 2.0f), rectF.centerY() - (this.f35670w / 2.0f));
                    this.f35669s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f10 = 19.285715f;
                    for (int i10 = 0; i10 < 5; i10++) {
                        canvas.drawArc(rectF, f10 + 270.0f, 12.857143f, false, paint2);
                        f10 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - AndroidUtilities.dp(1.0f);
                    float dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.Components.xi0 xi0Var = this.f35667n;
                    xi0Var.setBounds((int) (centerX - dp), (int) (centerY - dp), (int) (centerX + dp), (int) (centerY + dp));
                    xi0Var.draw(canvas);
                    float f11 = f7 * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f11, false, paint2);
                    this.d.a(f11, 1.0f, canvas, paint, rectF);
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = AndroidUtilities.dpf2(10.5f);
        this.f35664c.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

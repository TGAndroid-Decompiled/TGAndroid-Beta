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
public final class p41 extends FrameLayout {
    public final Paint f39882a;
    public final Paint f39883b;
    public final RectF f39884c;
    public final org.telegram.ui.Components.z11 d;
    public boolean f39885e;
    public long f39886f;
    public long h;
    public final org.telegram.ui.Components.hj0 f39887n;
    public final TextPaint f39888r;
    public StaticLayout f39889s;
    public float v;
    public float f39890w;
    public final SecretMediaViewer f39891x;

    public p41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f39891x = secretMediaViewer;
        this.f39884c = new RectF();
        this.d = new org.telegram.ui.Components.z11();
        this.f39888r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f39883b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f39882a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.fire_on, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.f39887n = hj0Var;
        hj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        hj0Var.f27542s0 = this;
        hj0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        MessageObject messageObject = this.f39891x.f34771e0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f39886f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f39886f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f34759a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z4 = this.f39885e;
                Paint paint = this.f39883b;
                Paint paint2 = this.f39882a;
                float f10 = max;
                RectF rectF = this.f39884c;
                if (z4) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.v / 2.0f), rectF.centerY() - (this.f39890w / 2.0f));
                    this.f39889s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f11 = 19.285715f;
                    for (int i10 = 0; i10 < 5; i10++) {
                        canvas.drawArc(rectF, f11 + 270.0f, 12.857143f, false, paint2);
                        f11 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - AndroidUtilities.dp(1.0f);
                    float dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.Components.hj0 hj0Var = this.f39887n;
                    hj0Var.setBounds((int) (centerX - dp), (int) (centerY - dp), (int) (centerX + dp), (int) (centerY + dp));
                    hj0Var.draw(canvas);
                    float f12 = f10 * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f12, false, paint2);
                    this.d.a(f12, 1.0f, canvas, paint, rectF);
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
        this.f39884c.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

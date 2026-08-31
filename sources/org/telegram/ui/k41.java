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
public final class k41 extends FrameLayout {
    public final Paint f38269a;
    public final Paint f38270b;
    public final RectF f38271c;
    public final org.telegram.ui.Components.a21 d;
    public boolean f38272e;
    public long f38273f;
    public long h;
    public final org.telegram.ui.Components.ij0 f38274n;
    public final TextPaint f38275r;
    public StaticLayout f38276s;
    public float v;
    public float f38277w;
    public final SecretMediaViewer f38278x;

    public k41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f38278x = secretMediaViewer;
        this.f38271c = new RectF();
        this.d = new org.telegram.ui.Components.a21();
        this.f38275r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f38270b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f38269a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        int i10 = R.raw.fire_on;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(i10, AndroidUtilities.dp(16.0f), "" + R.raw.fire_on, AndroidUtilities.dp(16.0f));
        this.f38274n = ij0Var;
        ij0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ij0Var.f27835s0 = this;
        ij0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        MessageObject messageObject = this.f38278x.f34771e0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f38273f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f38273f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f34759a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z4 = this.f38272e;
                Paint paint = this.f38270b;
                Paint paint2 = this.f38269a;
                float f10 = max;
                RectF rectF = this.f38271c;
                if (z4) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.v / 2.0f), rectF.centerY() - (this.f38277w / 2.0f));
                    this.f38276s.draw(canvas);
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
                    org.telegram.ui.Components.ij0 ij0Var = this.f38274n;
                    ij0Var.setBounds((int) (centerX - dp), (int) (centerY - dp), (int) (centerX + dp), (int) (centerY + dp));
                    ij0Var.draw(canvas);
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
        this.f38271c.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}

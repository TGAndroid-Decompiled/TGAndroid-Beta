package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q6 extends View {
    public final int f39739a = 0;
    public Paint f39740b;
    public Paint f39741c;
    public float d;
    public Object f39742e;

    public q6(Context context) {
        super(context);
    }

    public void a() {
        this.f39740b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((qg.x) this.f39742e).f44619f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f7) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = w7.p.a(((f7 - dp) + (AndroidUtilities.dp(13.0f) - (this.f39741c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        qg.x xVar = (qg.x) this.f39742e;
        xVar.m(i0.a.k(xVar.f44619f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f39739a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f39741c);
                rectF.set(0.0f, 0.0f, ((org.telegram.ui.Components.e6) this.f39742e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f39740b);
                return;
            default:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f7 = height - dp;
                float f10 = height + dp;
                rectF2.set(dp, f7, getWidth() - dp, f10);
                canvas.save();
                qg.x xVar = (qg.x) this.f39742e;
                xVar.f44618e.rewind();
                xVar.f44618e.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(xVar.f44618e);
                rg.k1.v1(canvas, rectF2, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF2.set(dp, f7, getWidth() - dp, f10);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f39740b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f39741c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                rg.k1.w1(max, height, strokeWidth, i0.a.k(xVar.f44619f, (int) (this.d * 255.0f)), canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39739a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39739a) {
            case 1:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    } else {
                        b(motionEvent.getX());
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    return true;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                b(motionEvent.getX());
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public q6(qg.x xVar, Context context) {
        super(context);
        this.f39742e = xVar;
        this.f39740b = new Paint(1);
        Paint paint = new Paint(1);
        this.f39741c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}

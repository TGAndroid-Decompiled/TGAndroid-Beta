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
public final class p6 extends View {
    public final int f41342a = 0;
    public Paint f41343b;
    public Paint f41344c;
    public float d;
    public Object f41345e;

    public p6(Context context) {
        super(context);
    }

    public void a() {
        this.f41343b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((xf.x) this.f41345e).f49411f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f10) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = g7.n.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.f41344c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        xf.x xVar = (xf.x) this.f41345e;
        xVar.m(i0.a.k(xVar.f49411f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f41342a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41344c);
                rectF.set(0.0f, 0.0f, ((org.telegram.ui.Components.y5) this.f41345e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41343b);
                return;
            default:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f10 = height - dp;
                float f11 = height + dp;
                rectF2.set(dp, f10, getWidth() - dp, f11);
                canvas.save();
                xf.x xVar = (xf.x) this.f41345e;
                xVar.f49410e.rewind();
                xVar.f49410e.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(xVar.f49410e);
                yf.i1.w1(canvas, rectF2, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF2.set(dp, f10, getWidth() - dp, f11);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f41343b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f41344c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                yf.i1.x1(max, height, strokeWidth, i0.a.k(xVar.f49411f, (int) (this.d * 255.0f)), canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f41342a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                a();
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41342a) {
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

    public p6(xf.x xVar, Context context) {
        super(context);
        this.f41345e = xVar;
        this.f41343b = new Paint(1);
        Paint paint = new Paint(1);
        this.f41344c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}

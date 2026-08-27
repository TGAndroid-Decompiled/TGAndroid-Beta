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

    public final int f41527a = 0;

    public Paint f41528b;

    public Paint f41529c;
    public float d;

    public Object f41530e;

    public q6(Context context) {
        super(context);
    }

    public void a() {
        this.f41528b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((yf.x) this.f41530e).f50115f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f10) {
        float fDp = AndroidUtilities.dp(6.0f);
        float fA = h7.n.a(((f10 - fDp) + (AndroidUtilities.dp(13.0f) - (this.f41529c.getStrokeWidth() / 2.0f))) / (getWidth() - (fDp * 2.0f)), 0.0f, 1.0f);
        this.d = fA;
        yf.x xVar = (yf.x) this.f41530e;
        xVar.m(i0.b.k(xVar.f50115f, (int) (fA * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f41527a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41529c);
                rectF.set(0.0f, 0.0f, ((org.telegram.ui.Components.y5) this.f41530e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f41528b);
                break;
            default:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float fDp = AndroidUtilities.dp(6.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f10 = height - fDp;
                float f11 = height + fDp;
                rectF2.set(fDp, f10, getWidth() - fDp, f11);
                canvas.save();
                yf.x xVar = (yf.x) this.f41530e;
                xVar.f50114e.rewind();
                xVar.f50114e.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(xVar.f50114e);
                zf.i1.w1(canvas, rectF2, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF2.set(fDp, f10, getWidth() - fDp, f11);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f41528b);
                float fDp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f41529c;
                float strokeWidth = fDp2 - (paint.getStrokeWidth() / 2.0f);
                float fMax = Math.max(fDp + strokeWidth, (((getWidth() - (2.0f * fDp)) * this.d) + fDp) - strokeWidth);
                canvas.drawCircle(fMax, height, fDp2, paint);
                zf.i1.x1(fMax, height, strokeWidth, i0.b.k(xVar.f50115f, (int) (this.d * 255.0f)), canvas);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f41527a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41527a) {
            case 1:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        b(motionEvent.getX());
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
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

    public q6(yf.x xVar, Context context) {
        super(context);
        this.f41530e = xVar;
        this.f41528b = new Paint(1);
        Paint paint = new Paint(1);
        this.f41529c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}

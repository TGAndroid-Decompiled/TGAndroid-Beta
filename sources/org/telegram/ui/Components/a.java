package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class a extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final vnb c;
    public final ChatActivityEnterView d;

    public a(ChatActivityEnterView chatActivityEnterView, Activity activity, vnb vnbVar) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = vnbVar;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.b1 && !chatActivityEnterView.T7) {
            vw1 vw1Var = chatActivityEnterView.T0;
            float f = 1.0f;
            if (vw1Var != null && vw1Var.getVisibility() == 0) {
                f = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = hl.N(19.0f);
            int J0 = chatActivityEnterView.J0(aob.Pe);
            Paint paint = this.a;
            paint.setColor(J0);
            float N2 = hl.N(3.0f);
            float N3 = hl.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - hl.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f, f, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.T7) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

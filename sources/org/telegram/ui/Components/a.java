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
    public final wjb c;
    public final ChatActivityEnterView d;

    public a(ChatActivityEnterView chatActivityEnterView, Activity activity, wjb wjbVar) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = wjbVar;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.b1 && !chatActivityEnterView.o7) {
            gw1 gw1Var = chatActivityEnterView.T0;
            float f = 1.0f;
            if (gw1Var != null && gw1Var.getVisibility() == 0) {
                f = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = gl.N(19.0f);
            int F0 = chatActivityEnterView.F0(bkb.Oe);
            Paint paint = this.a;
            paint.setColor(F0);
            float N2 = gl.N(3.0f);
            float N3 = gl.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - gl.N(38.0f)) - N2;
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
        if (this.d.o7) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

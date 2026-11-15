package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class ee extends FrameLayout {
    public final Paint f34278a;
    public final RectF f34279b;
    public final org.telegram.ui.ActionBar.e6 f34280c;
    public final ChatActivityEnterView d;

    public ee(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f34280c = e6Var;
        this.f34278a = new Paint(1);
        this.f34279b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f32163b1) {
            zd zdVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (zdVar != null && zdVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Pe);
            Paint paint = this.f34278a;
            paint.setColor(u02);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f34279b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, N, N, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d.K6) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ee.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

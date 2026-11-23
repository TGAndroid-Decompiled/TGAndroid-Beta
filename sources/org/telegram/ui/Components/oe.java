package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class oe extends FrameLayout {
    public final Paint f38138a;
    public final RectF f38139b;
    public final org.telegram.ui.ActionBar.h6 f38140c;
    public final ChatActivityEnterView d;

    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f38140c = h6Var;
        this.f38138a = new Paint(1);
        this.f38139b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f32547b1) {
            ie ieVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (ieVar != null && ieVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Pe);
            Paint paint = this.f38138a;
            paint.setColor(G0);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f38139b;
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
        if (this.d.f32661p7) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oe.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

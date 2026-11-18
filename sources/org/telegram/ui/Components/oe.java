package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class oe extends FrameLayout {
    public final Paint f38070a;
    public final RectF f38071b;
    public final org.telegram.ui.ActionBar.i6 f38072c;
    public final ChatActivityEnterView d;

    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f38072c = i6Var;
        this.f38070a = new Paint(1);
        this.f38071b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f32550b1) {
            ie ieVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (ieVar != null && ieVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Pe);
            Paint paint = this.f38070a;
            paint.setColor(C0);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f38071b;
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
        if (this.d.f32627k7) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oe.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

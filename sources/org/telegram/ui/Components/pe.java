package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class pe extends FrameLayout {
    public final Paint f38453a;
    public final RectF f38454b;
    public final org.telegram.ui.ActionBar.i6 f38455c;
    public final ChatActivityEnterView d;

    public pe(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.f38455c = i6Var;
        this.f38453a = new Paint(1);
        this.f38454b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f32645b1) {
            je jeVar = chatActivityEnterView.T0;
            float f10 = 1.0f;
            if (jeVar != null && jeVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.T0.getAlpha();
            }
            float N = org.telegram.messenger.g0.N(19.0f);
            int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Pe);
            Paint paint = this.f38453a;
            paint.setColor(G0);
            float N2 = org.telegram.messenger.g0.N(3.0f);
            float N3 = org.telegram.messenger.g0.N(38.0f);
            float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.N(38.0f)) - N2;
            float measuredHeight = (getMeasuredHeight() - N3) - N2;
            float measuredWidth2 = getMeasuredWidth() - N2;
            float measuredHeight2 = getMeasuredHeight() - N2;
            RectF rectF = this.f38454b;
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
        if (this.d.f32759p7) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pe.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

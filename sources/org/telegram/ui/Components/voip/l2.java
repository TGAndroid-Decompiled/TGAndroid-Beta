package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29050a;
    public float f29051b;
    public float f29052c;
    public float d;
    public float e;
    public final m2 f29053f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29053f = m2Var;
        this.f29050a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29053f;
        m2Var.f29095n.setPivotX(m2Var.f29096r.getMeasuredWidth());
        m2Var.f29095n.setPivotY(m2Var.f29096r.getMeasuredHeight());
        m2Var.f29095n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29097s);
        m2Var.f29095n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29097s);
        m2Var.f29095n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29097s);
        m2Var.f29095n.setScaleX(((1.0f - m2Var.f29097s) * 0.6f) + 0.4f);
        m2Var.f29095n.setScaleY(((1.0f - m2Var.f29097s) * 0.6f) + 0.4f);
        m2Var.f29095n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29097s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29051b = AndroidUtilities.dp(16.0f);
        this.f29052c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

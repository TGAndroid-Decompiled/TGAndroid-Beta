package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f32111a;
    public float f32112b;
    public float f32113c;
    public float d;
    public float f32114e;
    public final m2 f32115f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f32115f = m2Var;
        this.f32111a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f32115f;
        m2Var.f32160r.setPivotX(m2Var.f32161s.getMeasuredWidth());
        m2Var.f32160r.setPivotY(m2Var.f32161s.getMeasuredHeight());
        m2Var.f32160r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.v);
        m2Var.f32160r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.v);
        m2Var.f32160r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.v);
        m2Var.f32160r.setScaleX(((1.0f - m2Var.v) * 0.6f) + 0.4f);
        m2Var.f32160r.setScaleY(((1.0f - m2Var.v) * 0.6f) + 0.4f);
        m2Var.f32160r.setAlpha(Math.min(1.0f, 1.0f - m2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32112b = AndroidUtilities.dp(16.0f);
        this.f32113c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32114e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29047a;
    public float f29048b;
    public float f29049c;
    public float d;
    public float e;
    public final m2 f29050f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29050f = m2Var;
        this.f29047a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29050f;
        m2Var.f29092n.setPivotX(m2Var.f29093r.getMeasuredWidth());
        m2Var.f29092n.setPivotY(m2Var.f29093r.getMeasuredHeight());
        m2Var.f29092n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29094s);
        m2Var.f29092n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29094s);
        m2Var.f29092n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29094s);
        m2Var.f29092n.setScaleX(((1.0f - m2Var.f29094s) * 0.6f) + 0.4f);
        m2Var.f29092n.setScaleY(((1.0f - m2Var.f29094s) * 0.6f) + 0.4f);
        m2Var.f29092n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29094s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29048b = AndroidUtilities.dp(16.0f);
        this.f29049c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

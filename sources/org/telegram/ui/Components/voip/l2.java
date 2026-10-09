package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f32046a;
    public float f32047b;
    public float f32048c;
    public float d;
    public float f32049e;
    public final m2 f32050f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f32050f = m2Var;
        this.f32046a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f32050f;
        m2Var.f32095r.setPivotX(m2Var.f32096s.getMeasuredWidth());
        m2Var.f32095r.setPivotY(m2Var.f32096s.getMeasuredHeight());
        m2Var.f32095r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.v);
        m2Var.f32095r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.v);
        m2Var.f32095r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.v);
        m2Var.f32095r.setScaleX(((1.0f - m2Var.v) * 0.6f) + 0.4f);
        m2Var.f32095r.setScaleY(((1.0f - m2Var.v) * 0.6f) + 0.4f);
        m2Var.f32095r.setAlpha(Math.min(1.0f, 1.0f - m2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32047b = AndroidUtilities.dp(16.0f);
        this.f32048c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32049e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29027a;
    public float f29028b;
    public float f29029c;
    public float d;
    public float e;
    public final m2 f29030f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29030f = m2Var;
        this.f29027a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29030f;
        m2Var.f29072n.setPivotX(m2Var.f29073r.getMeasuredWidth());
        m2Var.f29072n.setPivotY(m2Var.f29073r.getMeasuredHeight());
        m2Var.f29072n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29074s);
        m2Var.f29072n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29074s);
        m2Var.f29072n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29074s);
        m2Var.f29072n.setScaleX(((1.0f - m2Var.f29074s) * 0.6f) + 0.4f);
        m2Var.f29072n.setScaleY(((1.0f - m2Var.f29074s) * 0.6f) + 0.4f);
        m2Var.f29072n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29074s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29028b = AndroidUtilities.dp(16.0f);
        this.f29029c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

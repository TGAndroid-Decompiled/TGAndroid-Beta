package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29021a;
    public float f29022b;
    public float f29023c;
    public float d;
    public float e;
    public final m2 f29024f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29024f = m2Var;
        this.f29021a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29024f;
        m2Var.f29066n.setPivotX(m2Var.f29067r.getMeasuredWidth());
        m2Var.f29066n.setPivotY(m2Var.f29067r.getMeasuredHeight());
        m2Var.f29066n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29068s);
        m2Var.f29066n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29068s);
        m2Var.f29066n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29068s);
        m2Var.f29066n.setScaleX(((1.0f - m2Var.f29068s) * 0.6f) + 0.4f);
        m2Var.f29066n.setScaleY(((1.0f - m2Var.f29068s) * 0.6f) + 0.4f);
        m2Var.f29066n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29068s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29022b = AndroidUtilities.dp(16.0f);
        this.f29023c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

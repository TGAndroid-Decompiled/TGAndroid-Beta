package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29764a;
    public float f29765b;
    public float f29766c;
    public float d;
    public float e;
    public final m2 f29767f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29767f = m2Var;
        this.f29764a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new gg.j1(14));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29767f;
        m2Var.f29776n.setPivotX(m2Var.f29777r.getMeasuredWidth());
        m2Var.f29776n.setPivotY(m2Var.f29777r.getMeasuredHeight());
        m2Var.f29776n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29778s);
        m2Var.f29776n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29778s);
        m2Var.f29776n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29778s);
        m2Var.f29776n.setScaleX(((1.0f - m2Var.f29778s) * 0.6f) + 0.4f);
        m2Var.f29776n.setScaleY(((1.0f - m2Var.f29778s) * 0.6f) + 0.4f);
        m2Var.f29776n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29778s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29765b = AndroidUtilities.dp(16.0f);
        this.f29766c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends FrameLayout {
    public static final int h = 0;
    public final float f29346a;
    public float f29347b;
    public float f29348c;
    public float d;
    public float e;
    public final m2 f29349f;

    public l2(m2 m2Var, Context context) {
        super(context);
        this.f29349f = m2Var;
        this.f29346a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f29349f;
        m2Var.f29391n.setPivotX(m2Var.f29392r.getMeasuredWidth());
        m2Var.f29391n.setPivotY(m2Var.f29392r.getMeasuredHeight());
        m2Var.f29391n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29393s);
        m2Var.f29391n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.f29393s);
        m2Var.f29391n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.f29393s);
        m2Var.f29391n.setScaleX(((1.0f - m2Var.f29393s) * 0.6f) + 0.4f);
        m2Var.f29391n.setScaleY(((1.0f - m2Var.f29393s) * 0.6f) + 0.4f);
        m2Var.f29391n.setAlpha(Math.min(1.0f, 1.0f - m2Var.f29393s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29347b = AndroidUtilities.dp(16.0f);
        this.f29348c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.l2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

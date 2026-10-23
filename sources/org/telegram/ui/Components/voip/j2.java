package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public static final int h = 0;
    public final float f31673a;
    public float f31674b;
    public float f31675c;
    public float d;
    public float e;
    public final k2 f31676f;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f31676f = k2Var;
        this.f31673a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ci.n1(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f31676f;
        k2Var.f31687r.setPivotX(k2Var.f31688s.getMeasuredWidth());
        k2Var.f31687r.setPivotY(k2Var.f31688s.getMeasuredHeight());
        k2Var.f31687r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f31687r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f31687r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.v);
        k2Var.f31687r.setScaleX(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f31687r.setScaleY(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f31687r.setAlpha(Math.min(1.0f, 1.0f - k2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31674b = AndroidUtilities.dp(16.0f);
        this.f31675c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

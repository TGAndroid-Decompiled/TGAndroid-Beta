package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f31790a;
    public float f31791b;
    public float f31792c;
    public float d;
    public float f31793e;
    public final n2 f31794f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f31794f = n2Var;
        this.f31790a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f31794f;
        n2Var.f31839r.setPivotX(n2Var.f31840s.getMeasuredWidth());
        n2Var.f31839r.setPivotY(n2Var.f31840s.getMeasuredHeight());
        n2Var.f31839r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f31839r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f31839r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f31839r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f31839r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f31839r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31791b = AndroidUtilities.dp(16.0f);
        this.f31792c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f31793e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

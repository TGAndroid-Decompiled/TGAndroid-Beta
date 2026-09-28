package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f29418a;
    public float f29419b;
    public float f29420c;
    public float d;
    public float e;
    public final n2 f29421f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f29421f = n2Var;
        this.f29418a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f29421f;
        n2Var.f29430n.setPivotX(n2Var.f29431r.getMeasuredWidth());
        n2Var.f29430n.setPivotY(n2Var.f29431r.getMeasuredHeight());
        n2Var.f29430n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f29432s);
        n2Var.f29430n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f29432s);
        n2Var.f29430n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.f29432s);
        n2Var.f29430n.setScaleX(((1.0f - n2Var.f29432s) * 0.6f) + 0.4f);
        n2Var.f29430n.setScaleY(((1.0f - n2Var.f29432s) * 0.6f) + 0.4f);
        n2Var.f29430n.setAlpha(Math.min(1.0f, 1.0f - n2Var.f29432s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29419b = AndroidUtilities.dp(16.0f);
        this.f29420c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

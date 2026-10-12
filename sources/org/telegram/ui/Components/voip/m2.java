package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f31805a;
    public float f31806b;
    public float f31807c;
    public float d;
    public float f31808e;
    public final n2 f31809f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f31809f = n2Var;
        this.f31805a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f31809f;
        n2Var.f31854r.setPivotX(n2Var.f31855s.getMeasuredWidth());
        n2Var.f31854r.setPivotY(n2Var.f31855s.getMeasuredHeight());
        n2Var.f31854r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f31854r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f31854r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f31854r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f31854r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f31854r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31806b = AndroidUtilities.dp(16.0f);
        this.f31807c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f31808e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f29414a;
    public float f29415b;
    public float f29416c;
    public float d;
    public float e;
    public final n2 f29417f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f29417f = n2Var;
        this.f29414a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f29417f;
        n2Var.f29426n.setPivotX(n2Var.f29427r.getMeasuredWidth());
        n2Var.f29426n.setPivotY(n2Var.f29427r.getMeasuredHeight());
        n2Var.f29426n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f29428s);
        n2Var.f29426n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f29428s);
        n2Var.f29426n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.f29428s);
        n2Var.f29426n.setScaleX(((1.0f - n2Var.f29428s) * 0.6f) + 0.4f);
        n2Var.f29426n.setScaleY(((1.0f - n2Var.f29428s) * 0.6f) + 0.4f);
        n2Var.f29426n.setAlpha(Math.min(1.0f, 1.0f - n2Var.f29428s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29415b = AndroidUtilities.dp(16.0f);
        this.f29416c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

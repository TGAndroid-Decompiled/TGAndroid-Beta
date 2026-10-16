package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public static final int h = 0;
    public final float f29921a;
    public float f29922b;
    public float f29923c;
    public float d;
    public float e;
    public final k2 f29924f;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f29924f = k2Var;
        this.f29921a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.a2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f29924f;
        k2Var.f29939r.setPivotX(k2Var.f29940s.getMeasuredWidth());
        k2Var.f29939r.setPivotY(k2Var.f29940s.getMeasuredHeight());
        k2Var.f29939r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f29939r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f29939r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.v);
        k2Var.f29939r.setScaleX(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f29939r.setScaleY(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f29939r.setAlpha(Math.min(1.0f, 1.0f - k2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29922b = AndroidUtilities.dp(16.0f);
        this.f29923c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

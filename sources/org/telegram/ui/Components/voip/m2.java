package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f32169a;
    public float f32170b;
    public float f32171c;
    public float d;
    public float f32172e;
    public final n2 f32173f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f32173f = n2Var;
        this.f32169a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f32173f;
        n2Var.f32218r.setPivotX(n2Var.f32219s.getMeasuredWidth());
        n2Var.f32218r.setPivotY(n2Var.f32219s.getMeasuredHeight());
        n2Var.f32218r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f32218r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f32218r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f32218r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f32218r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f32218r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32170b = AndroidUtilities.dp(16.0f);
        this.f32171c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32172e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

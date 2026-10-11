package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f32105a;
    public float f32106b;
    public float f32107c;
    public float d;
    public float f32108e;
    public final n2 f32109f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f32109f = n2Var;
        this.f32105a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.l2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f32109f;
        n2Var.f32154r.setPivotX(n2Var.f32155s.getMeasuredWidth());
        n2Var.f32154r.setPivotY(n2Var.f32155s.getMeasuredHeight());
        n2Var.f32154r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f32154r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f32154r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f32154r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f32154r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f32154r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32106b = AndroidUtilities.dp(16.0f);
        this.f32107c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32108e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

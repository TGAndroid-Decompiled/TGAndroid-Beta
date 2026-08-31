package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f32192a;
    public float f32193b;
    public float f32194c;
    public float d;
    public float f32195e;
    public final n2 f32196f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f32196f = n2Var;
        this.f32192a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new hg.j1(14));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f32196f;
        n2Var.f32206n.setPivotX(n2Var.f32207r.getMeasuredWidth());
        n2Var.f32206n.setPivotY(n2Var.f32207r.getMeasuredHeight());
        n2Var.f32206n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32208s);
        n2Var.f32206n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32208s);
        n2Var.f32206n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.f32208s);
        n2Var.f32206n.setScaleX(((1.0f - n2Var.f32208s) * 0.6f) + 0.4f);
        n2Var.f32206n.setScaleY(((1.0f - n2Var.f32208s) * 0.6f) + 0.4f);
        n2Var.f32206n.setAlpha(Math.min(1.0f, 1.0f - n2Var.f32208s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32193b = AndroidUtilities.dp(16.0f);
        this.f32194c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32195e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

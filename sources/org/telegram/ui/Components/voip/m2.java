package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f32011a;
    public float f32012b;
    public float f32013c;
    public float d;
    public float f32014e;
    public final n2 f32015f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f32015f = n2Var;
        this.f32011a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f32015f;
        n2Var.f32025n.setPivotX(n2Var.f32026r.getMeasuredWidth());
        n2Var.f32025n.setPivotY(n2Var.f32026r.getMeasuredHeight());
        n2Var.f32025n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32027s);
        n2Var.f32025n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32027s);
        n2Var.f32025n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.f32027s);
        n2Var.f32025n.setScaleX(((1.0f - n2Var.f32027s) * 0.6f) + 0.4f);
        n2Var.f32025n.setScaleY(((1.0f - n2Var.f32027s) * 0.6f) + 0.4f);
        n2Var.f32025n.setAlpha(Math.min(1.0f, 1.0f - n2Var.f32027s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32012b = AndroidUtilities.dp(16.0f);
        this.f32013c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32014e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

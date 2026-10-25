package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f33947a;
    public float f33948b;
    public float f33949c;
    public float d;
    public float e;
    public final n2 f33950f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f33950f = n2Var;
        this.f33947a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ag.v0(20));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f33950f;
        n2Var.f33958r.setPivotX(n2Var.f33959s.getMeasuredWidth());
        n2Var.f33958r.setPivotY(n2Var.f33959s.getMeasuredHeight());
        n2Var.f33958r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f33958r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f33958r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f33958r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f33958r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f33958r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33948b = AndroidUtilities.dp(16.0f);
        this.f33949c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class k2 extends FrameLayout {
    public static final int h = 0;

    public final float f33687a;

    public float f33688b;

    public float f33689c;
    public float d;

    public float f33690e;

    public final l2 f33691f;

    public k2(l2 l2Var, Context context) {
        super(context);
        this.f33691f = l2Var;
        this.f33687a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new cg.l1(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l2 l2Var = this.f33691f;
        l2Var.f33707n.setPivotX(l2Var.f33708r.getMeasuredWidth());
        l2Var.f33707n.setPivotY(l2Var.f33708r.getMeasuredHeight());
        l2Var.f33707n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f33709s);
        l2Var.f33707n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f33709s);
        l2Var.f33707n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * l2Var.f33709s);
        l2Var.f33707n.setScaleX(((1.0f - l2Var.f33709s) * 0.6f) + 0.4f);
        l2Var.f33707n.setScaleY(((1.0f - l2Var.f33709s) * 0.6f) + 0.4f);
        l2Var.f33707n.setAlpha(Math.min(1.0f, 1.0f - l2Var.f33709s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33688b = AndroidUtilities.dp(16.0f);
        this.f33689c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f33690e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

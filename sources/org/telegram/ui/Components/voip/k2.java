package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k2 extends FrameLayout {
    public static final int h = 0;
    public final float f28213a;
    public float f28214b;
    public float f28215c;
    public float d;
    public float e;
    public final l2 f28216f;

    public k2(l2 l2Var, Context context) {
        super(context);
        this.f28216f = l2Var;
        this.f28213a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.g(15));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l2 l2Var = this.f28216f;
        l2Var.f28231n.setPivotX(l2Var.f28232r.getMeasuredWidth());
        l2Var.f28231n.setPivotY(l2Var.f28232r.getMeasuredHeight());
        l2Var.f28231n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f28233s);
        l2Var.f28231n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f28233s);
        l2Var.f28231n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * l2Var.f28233s);
        l2Var.f28231n.setScaleX(((1.0f - l2Var.f28233s) * 0.6f) + 0.4f);
        l2Var.f28231n.setScaleY(((1.0f - l2Var.f28233s) * 0.6f) + 0.4f);
        l2Var.f28231n.setAlpha(Math.min(1.0f, 1.0f - l2Var.f28233s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28214b = AndroidUtilities.dp(16.0f);
        this.f28215c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

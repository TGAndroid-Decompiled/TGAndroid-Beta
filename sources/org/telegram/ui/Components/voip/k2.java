package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k2 extends FrameLayout {
    public static final int h = 0;
    public final float f33637a;
    public float f33638b;
    public float f33639c;
    public float d;
    public float f33640e;
    public final l2 f33641f;

    public k2(l2 l2Var, Context context) {
        super(context);
        this.f33641f = l2Var;
        this.f33637a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q1(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l2 l2Var = this.f33641f;
        l2Var.f33657n.setPivotX(l2Var.f33658r.getMeasuredWidth());
        l2Var.f33657n.setPivotY(l2Var.f33658r.getMeasuredHeight());
        l2Var.f33657n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f33659s);
        l2Var.f33657n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * l2Var.f33659s);
        l2Var.f33657n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * l2Var.f33659s);
        l2Var.f33657n.setScaleX(((1.0f - l2Var.f33659s) * 0.6f) + 0.4f);
        l2Var.f33657n.setScaleY(((1.0f - l2Var.f33659s) * 0.6f) + 0.4f);
        l2Var.f33657n.setAlpha(Math.min(1.0f, 1.0f - l2Var.f33659s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f33638b = AndroidUtilities.dp(16.0f);
        this.f33639c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f33640e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n2 extends FrameLayout {
    public static final int h = 0;
    public final float f33864a;
    public float f33865b;
    public float f33866c;
    public float d;
    public float f33867e;
    public final o2 f33868f;

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f33868f = o2Var;
        this.f33864a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new eg.k1(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o2 o2Var = this.f33868f;
        o2Var.f33899n.setPivotX(o2Var.f33900r.getMeasuredWidth());
        o2Var.f33899n.setPivotY(o2Var.f33900r.getMeasuredHeight());
        o2Var.f33899n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * o2Var.f33901s);
        o2Var.f33899n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * o2Var.f33901s);
        o2Var.f33899n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * o2Var.f33901s);
        o2Var.f33899n.setScaleX(((1.0f - o2Var.f33901s) * 0.6f) + 0.4f);
        o2Var.f33899n.setScaleY(((1.0f - o2Var.f33901s) * 0.6f) + 0.4f);
        o2Var.f33899n.setAlpha(Math.min(1.0f, 1.0f - o2Var.f33901s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33865b = AndroidUtilities.dp(16.0f);
        this.f33866c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f33867e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

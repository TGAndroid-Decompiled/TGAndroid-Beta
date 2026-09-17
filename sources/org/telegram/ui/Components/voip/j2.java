package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public static final int h = 0;
    public final float f31595a;
    public float f31596b;
    public float f31597c;
    public float d;
    public float f31598e;
    public final k2 f31599f;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f31599f = k2Var;
        this.f31595a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.z1(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f31599f;
        k2Var.f31610n.setPivotX(k2Var.f31611r.getMeasuredWidth());
        k2Var.f31610n.setPivotY(k2Var.f31611r.getMeasuredHeight());
        k2Var.f31610n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.f31612s);
        k2Var.f31610n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.f31612s);
        k2Var.f31610n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.f31612s);
        k2Var.f31610n.setScaleX(((1.0f - k2Var.f31612s) * 0.6f) + 0.4f);
        k2Var.f31610n.setScaleY(((1.0f - k2Var.f31612s) * 0.6f) + 0.4f);
        k2Var.f31610n.setAlpha(Math.min(1.0f, 1.0f - k2Var.f31612s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31596b = AndroidUtilities.dp(16.0f);
        this.f31597c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f31598e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

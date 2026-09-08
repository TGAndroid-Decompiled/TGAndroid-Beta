package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public static final int h = 0;
    public final float f31594a;
    public float f31595b;
    public float f31596c;
    public float d;
    public float f31597e;
    public final k2 f31598f;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f31598f = k2Var;
        this.f31594a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.z1(16));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f31598f;
        k2Var.f31609n.setPivotX(k2Var.f31610r.getMeasuredWidth());
        k2Var.f31609n.setPivotY(k2Var.f31610r.getMeasuredHeight());
        k2Var.f31609n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.f31611s);
        k2Var.f31609n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.f31611s);
        k2Var.f31609n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.f31611s);
        k2Var.f31609n.setScaleX(((1.0f - k2Var.f31611s) * 0.6f) + 0.4f);
        k2Var.f31609n.setScaleY(((1.0f - k2Var.f31611s) * 0.6f) + 0.4f);
        k2Var.f31609n.setAlpha(Math.min(1.0f, 1.0f - k2Var.f31611s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31595b = AndroidUtilities.dp(16.0f);
        this.f31596c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f31597e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

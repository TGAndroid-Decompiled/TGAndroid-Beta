package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends FrameLayout {
    public static final int h = 0;
    public final float f30252a;
    public float f30253b;
    public float f30254c;
    public float d;
    public float e;
    public final k2 f30255f;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f30255f = k2Var;
        this.f30252a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.a2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f30255f;
        k2Var.f30270r.setPivotX(k2Var.f30271s.getMeasuredWidth());
        k2Var.f30270r.setPivotY(k2Var.f30271s.getMeasuredHeight());
        k2Var.f30270r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f30270r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.f30270r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.v);
        k2Var.f30270r.setScaleX(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f30270r.setScaleY(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.f30270r.setAlpha(Math.min(1.0f, 1.0f - k2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30253b = AndroidUtilities.dp(16.0f);
        this.f30254c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

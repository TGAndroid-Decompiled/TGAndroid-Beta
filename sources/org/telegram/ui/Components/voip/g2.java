package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout {
    public static final int h = 0;
    public final float f41015a;
    public float f41016b;
    public float f41017c;
    public float d;
    public float f41018e;
    public final h2 f41019f;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f41019f = h2Var;
        this.f41015a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f41019f;
        h2Var.f41044r.setPivotX(h2Var.f41045s.getMeasuredWidth());
        h2Var.f41044r.setPivotY(h2Var.f41045s.getMeasuredHeight());
        h2Var.f41044r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41046w);
        h2Var.f41044r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41046w);
        h2Var.f41044r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.f41046w);
        h2Var.f41044r.setScaleX(((1.0f - h2Var.f41046w) * 0.6f) + 0.4f);
        h2Var.f41044r.setScaleY(((1.0f - h2Var.f41046w) * 0.6f) + 0.4f);
        h2Var.f41044r.setAlpha(Math.min(1.0f, 1.0f - h2Var.f41046w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f41016b = org.telegram.messenger.g0.L(16.0f);
        this.f41017c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f41018e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

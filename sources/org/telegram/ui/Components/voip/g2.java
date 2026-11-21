package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout {
    public static final int h = 0;
    public final float f41014a;
    public float f41015b;
    public float f41016c;
    public float d;
    public float f41017e;
    public final h2 f41018f;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f41018f = h2Var;
        this.f41014a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f41018f;
        h2Var.f41043r.setPivotX(h2Var.f41044s.getMeasuredWidth());
        h2Var.f41043r.setPivotY(h2Var.f41044s.getMeasuredHeight());
        h2Var.f41043r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41045w);
        h2Var.f41043r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f41045w);
        h2Var.f41043r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.f41045w);
        h2Var.f41043r.setScaleX(((1.0f - h2Var.f41045w) * 0.6f) + 0.4f);
        h2Var.f41043r.setScaleY(((1.0f - h2Var.f41045w) * 0.6f) + 0.4f);
        h2Var.f41043r.setAlpha(Math.min(1.0f, 1.0f - h2Var.f41045w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f41015b = org.telegram.messenger.g0.L(16.0f);
        this.f41016c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f41017e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

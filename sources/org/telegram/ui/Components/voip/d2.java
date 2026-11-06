package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class d2 extends FrameLayout {
    public static final int h = 0;
    public final float f39110a;
    public float f39111b;
    public float f39112c;
    public float d;
    public float f39113e;
    public final e2 f39114f;

    public d2(e2 e2Var, Context context) {
        super(context);
        this.f39114f = e2Var;
        this.f39110a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f39114f;
        e2Var.f39142r.setPivotX(e2Var.f39143s.getMeasuredWidth());
        e2Var.f39142r.setPivotY(e2Var.f39143s.getMeasuredHeight());
        e2Var.f39142r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39144w);
        e2Var.f39142r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.f39144w);
        e2Var.f39142r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.f39144w);
        e2Var.f39142r.setScaleX(((1.0f - e2Var.f39144w) * 0.6f) + 0.4f);
        e2Var.f39142r.setScaleY(((1.0f - e2Var.f39144w) * 0.6f) + 0.4f);
        e2Var.f39142r.setAlpha(Math.min(1.0f, 1.0f - e2Var.f39144w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39111b = org.telegram.messenger.g0.L(16.0f);
        this.f39112c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f39113e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

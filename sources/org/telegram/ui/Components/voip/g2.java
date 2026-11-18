package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class g2 extends FrameLayout {
    public static final int h = 0;
    public final float f40879a;
    public float f40880b;
    public float f40881c;
    public float d;
    public float f40882e;
    public final h2 f40883f;

    public g2(h2 h2Var, Context context) {
        super(context);
        this.f40883f = h2Var;
        this.f40879a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f40883f;
        h2Var.f40908r.setPivotX(h2Var.f40909s.getMeasuredWidth());
        h2Var.f40908r.setPivotY(h2Var.f40909s.getMeasuredHeight());
        h2Var.f40908r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f40910w);
        h2Var.f40908r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.f40910w);
        h2Var.f40908r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.f40910w);
        h2Var.f40908r.setScaleX(((1.0f - h2Var.f40910w) * 0.6f) + 0.4f);
        h2Var.f40908r.setScaleY(((1.0f - h2Var.f40910w) * 0.6f) + 0.4f);
        h2Var.f40908r.setAlpha(Math.min(1.0f, 1.0f - h2Var.f40910w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f40880b = org.telegram.messenger.g0.L(16.0f);
        this.f40881c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f40882e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

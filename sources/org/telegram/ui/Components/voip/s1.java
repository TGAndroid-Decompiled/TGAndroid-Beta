package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class s1 extends FrameLayout {
    public static final int h = 0;
    public final float f31657a;
    public float f31658b;
    public float f31659c;
    public float d;
    public float e;
    public final t1 f31660f;

    public s1(t1 t1Var, Context context) {
        super(context);
        this.f31660f = t1Var;
        this.f31657a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.d2(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t1 t1Var = this.f31660f;
        t1Var.f31671r.setPivotX(t1Var.f31672s.getMeasuredWidth());
        t1Var.f31671r.setPivotY(t1Var.f31672s.getMeasuredHeight());
        t1Var.f31671r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.i0.L(4.0f)) * t1Var.f31673w);
        t1Var.f31671r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.i0.L(4.0f)) * t1Var.f31673w);
        t1Var.f31671r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.i0.L(8.0f) * t1Var.f31673w);
        t1Var.f31671r.setScaleX(((1.0f - t1Var.f31673w) * 0.6f) + 0.4f);
        t1Var.f31671r.setScaleY(((1.0f - t1Var.f31673w) * 0.6f) + 0.4f);
        t1Var.f31671r.setAlpha(Math.min(1.0f, 1.0f - t1Var.f31673w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31658b = org.telegram.messenger.i0.L(16.0f);
        this.f31659c = org.telegram.messenger.i0.L(16.0f);
        this.d = org.telegram.messenger.i0.L(60.0f);
        this.e = org.telegram.messenger.i0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

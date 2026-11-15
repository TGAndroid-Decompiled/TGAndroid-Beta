package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class h2 extends FrameLayout {
    public static final int h = 0;
    public final float f40642a;
    public float f40643b;
    public float f40644c;
    public float d;
    public float f40645e;
    public final i2 f40646f;

    public h2(i2 i2Var, Context context) {
        super(context);
        this.f40646f = i2Var;
        this.f40642a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.p0(18));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i2 i2Var = this.f40646f;
        i2Var.f40663r.setPivotX(i2Var.f40664s.getMeasuredWidth());
        i2Var.f40663r.setPivotY(i2Var.f40664s.getMeasuredHeight());
        i2Var.f40663r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * i2Var.f40665w);
        i2Var.f40663r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * i2Var.f40665w);
        i2Var.f40663r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * i2Var.f40665w);
        i2Var.f40663r.setScaleX(((1.0f - i2Var.f40665w) * 0.6f) + 0.4f);
        i2Var.f40663r.setScaleY(((1.0f - i2Var.f40665w) * 0.6f) + 0.4f);
        i2Var.f40663r.setAlpha(Math.min(1.0f, 1.0f - i2Var.f40665w));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f40643b = org.telegram.messenger.g0.L(16.0f);
        this.f40644c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.f40645e = org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.h2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

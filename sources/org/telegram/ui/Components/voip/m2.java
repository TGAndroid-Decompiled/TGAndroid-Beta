package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f34055a;
    public float f34056b;
    public float f34057c;
    public float d;
    public float e;
    public final n2 f34058f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f34058f = n2Var;
        this.f34055a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ag.v0(20));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f34058f;
        n2Var.f34066r.setPivotX(n2Var.f34067s.getMeasuredWidth());
        n2Var.f34066r.setPivotY(n2Var.f34067s.getMeasuredHeight());
        n2Var.f34066r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f34066r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.v);
        n2Var.f34066r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.v);
        n2Var.f34066r.setScaleX(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f34066r.setScaleY(((1.0f - n2Var.v) * 0.6f) + 0.4f);
        n2Var.f34066r.setAlpha(Math.min(1.0f, 1.0f - n2Var.v));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f34056b = AndroidUtilities.dp(16.0f);
        this.f34057c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends FrameLayout {
    public static final int h = 0;
    public final float f32197a;
    public float f32198b;
    public float f32199c;
    public float d;
    public float f32200e;
    public final n2 f32201f;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.f32201f = n2Var;
        this.f32197a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new hg.j1(14));
        setClipToOutline(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f32201f;
        n2Var.f32211n.setPivotX(n2Var.f32212r.getMeasuredWidth());
        n2Var.f32211n.setPivotY(n2Var.f32212r.getMeasuredHeight());
        n2Var.f32211n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32213s);
        n2Var.f32211n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.f32213s);
        n2Var.f32211n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.f32213s);
        n2Var.f32211n.setScaleX(((1.0f - n2Var.f32213s) * 0.6f) + 0.4f);
        n2Var.f32211n.setScaleY(((1.0f - n2Var.f32213s) * 0.6f) + 0.4f);
        n2Var.f32211n.setAlpha(Math.min(1.0f, 1.0f - n2Var.f32213s));
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32198b = AndroidUtilities.dp(16.0f);
        this.f32199c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.f32200e = AndroidUtilities.dp(16.0f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.m2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

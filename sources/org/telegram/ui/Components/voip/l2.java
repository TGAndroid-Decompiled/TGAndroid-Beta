package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends TextView {
    public final RectF f31737a;
    public final o1 f31738b;
    public final n2 f31739c;

    public l2(n2 n2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.f31739c = n2Var;
        this.f31738b = o1Var;
        this.f31737a = new RectF();
        o1Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f31737a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        n2 n2Var = this.f31739c;
        float x11 = ((View) n2Var.getParent()).getX() + n2Var.getX() + x10;
        float y3 = ((View) getParent()).getY() + getY();
        float y10 = ((View) n2Var.getParent()).getY() + n2Var.getY() + y3;
        o1 o1Var = this.f31738b;
        o1Var.d(x11, y10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
        super.onDraw(canvas);
    }
}

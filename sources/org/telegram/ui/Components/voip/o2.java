package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o2 extends TextView {
    public final RectF f33991a;
    public final r1 f33992b;
    public final q2 f33993c;

    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.f33993c = q2Var;
        this.f33992b = r1Var;
        this.f33991a = new RectF();
        r1Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f33991a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x9 = ((View) getParent()).getX() + getX();
        q2 q2Var = this.f33993c;
        float x10 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x9;
        float y3 = ((View) getParent()).getY() + getY();
        float y10 = ((View) q2Var.getParent()).getY() + q2Var.getY() + y3;
        r1 r1Var = this.f33992b;
        r1Var.d(x10, y10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
        super.onDraw(canvas);
    }
}

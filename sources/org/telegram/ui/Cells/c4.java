package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o31;
import org.telegram.ui.zu0;
public final class c4 extends RadialProgressView {
    public final int O = 0;
    public final Paint P;
    public final Object Q;

    public c4(g4 g4Var, Context context) {
        super(context, null);
        this.Q = g4Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.O) {
            case 0:
                g4 g4Var = (g4) this.Q;
                org.telegram.ui.Components.q9 q9Var = g4Var.f30680b;
                if (q9Var.getImageReceiver().L() && q9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (q9Var.getAlpha() * q9Var.getImageReceiver().f22669i1 * 85.0f);
                    Paint paint = this.P;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                g4Var.f30695y.setProgressColor(i0.a.o(-1, (int) (q9Var.getAlpha() * q9Var.getImageReceiver().f22669i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.Q;
                zu0 zu0Var = profileActivity.f43588f0;
                if (zu0Var != null && zu0Var.getImageReceiver().L()) {
                    Paint paint2 = this.P;
                    paint2.setAlpha((int) (profileActivity.f43588f0.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                o31 o31Var = (o31) this.Q;
                org.telegram.ui.Components.q9 q9Var2 = o31Var.H;
                if (q9Var2 != null && q9Var2.getImageReceiver().L()) {
                    Paint paint3 = this.P;
                    paint3.setAlpha((int) (o31Var.H.getImageReceiver().f22669i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public c4(o31 o31Var, Context context) {
        super(context, null);
        this.Q = o31Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    public c4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n31;
import org.telegram.ui.yu0;
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
                org.telegram.ui.Components.p9 p9Var = g4Var.f30738b;
                if (p9Var.getImageReceiver().M() && p9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (p9Var.getAlpha() * p9Var.getImageReceiver().f22739i1 * 85.0f);
                    Paint paint = this.P;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                g4Var.f30753y.setProgressColor(i0.a.o(-1, (int) (p9Var.getAlpha() * p9Var.getImageReceiver().f22739i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.Q;
                yu0 yu0Var = profileActivity.f43673f0;
                if (yu0Var != null && yu0Var.getImageReceiver().M()) {
                    Paint paint2 = this.P;
                    paint2.setAlpha((int) (profileActivity.f43673f0.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                n31 n31Var = (n31) this.Q;
                org.telegram.ui.Components.p9 p9Var2 = n31Var.H;
                if (p9Var2 != null && p9Var2.getImageReceiver().M()) {
                    Paint paint3 = this.P;
                    paint3.setAlpha((int) (n31Var.H.getImageReceiver().f22739i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public c4(n31 n31Var, Context context) {
        super(context, null);
        this.Q = n31Var;
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

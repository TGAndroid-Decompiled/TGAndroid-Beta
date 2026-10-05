package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.iz0;
import org.telegram.ui.y81;
public final class z3 extends RadialProgressView {
    public final int K = 0;
    public final Paint L;
    public final Object M;

    public z3(e4 e4Var, Context context) {
        super(context, null);
        this.M = e4Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.K) {
            case 0:
                e4 e4Var = (e4) this.M;
                org.telegram.ui.Components.w9 w9Var = e4Var.f22026b;
                if (w9Var.getImageReceiver().hasNotThumb() && w9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.f22038x.setProgressColor(i0.a.k(-1, (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                iz0 iz0Var = profileActivity.f34252e0;
                if (iz0Var != null && iz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f34252e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                y81 y81Var = (y81) this.M;
                org.telegram.ui.Components.w9 w9Var2 = y81Var.E;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (y81Var.E.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public z3(y81 y81Var, Context context) {
        super(context, null);
        this.M = y81Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    public z3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.M = profileActivity;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }
}

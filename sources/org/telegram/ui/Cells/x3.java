package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.w81;
public final class x3 extends RadialProgressView {
    public final int H = 0;
    public final Paint I;
    public final Object J;

    public x3(d4 d4Var, Context context) {
        super(context, null);
        this.J = d4Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                d4 d4Var = (d4) this.J;
                org.telegram.ui.Components.p9 p9Var = d4Var.f20920b;
                if (p9Var.getImageReceiver().hasNotThumb() && p9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.I;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.f20928x.setProgressColor(i0.a.k(-1, (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.J;
                cz0 cz0Var = profileActivity.f32010b0;
                if (cz0Var != null && cz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.I;
                    paint2.setAlpha((int) (profileActivity.f32010b0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                w81 w81Var = (w81) this.J;
                org.telegram.ui.Components.p9 p9Var2 = w81Var.C;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.I;
                    paint3.setAlpha((int) (w81Var.C.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public x3(w81 w81Var, Context context) {
        super(context, null);
        this.J = w81Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    public x3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.J = profileActivity;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }
}

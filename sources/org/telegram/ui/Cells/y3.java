package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o81;
import org.telegram.ui.wy0;
public final class y3 extends RadialProgressView {
    public final int H = 0;
    public final Paint I;
    public final Object J;

    public y3(e4 e4Var, Context context) {
        super(context, null);
        this.J = e4Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                e4 e4Var = (e4) this.J;
                org.telegram.ui.Components.p9 p9Var = e4Var.f21003b;
                if (p9Var.getImageReceiver().hasNotThumb() && p9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.I;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.f21011x.setProgressColor(i0.a.k(-1, (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.J;
                wy0 wy0Var = profileActivity.f32036b0;
                if (wy0Var != null && wy0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.I;
                    paint2.setAlpha((int) (profileActivity.f32036b0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                o81 o81Var = (o81) this.J;
                org.telegram.ui.Components.p9 p9Var2 = o81Var.C;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.I;
                    paint3.setAlpha((int) (o81Var.C.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public y3(o81 o81Var, Context context) {
        super(context, null);
        this.J = o81Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    public y3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.J = profileActivity;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }
}

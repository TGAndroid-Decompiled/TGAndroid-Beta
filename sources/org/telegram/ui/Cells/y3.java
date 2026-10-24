package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.uy0;
public final class y3 extends RadialProgressView {
    public final int N = 0;
    public final Paint O;
    public final Object P;

    public y3(d4 d4Var, Context context) {
        super(context, null);
        this.P = d4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                d4 d4Var = (d4) this.P;
                org.telegram.ui.Components.u9 u9Var = d4Var.f22261b;
                if (u9Var.getImageReceiver().hasNotThumb() && u9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (u9Var.getAlpha() * u9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.f22273x.setProgressColor(i0.a.o(-1, (int) (u9Var.getAlpha() * u9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                uy0 uy0Var = profileActivity.f33922f0;
                if (uy0Var != null && uy0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.O;
                    paint2.setAlpha((int) (profileActivity.f33922f0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                b81 b81Var = (b81) this.P;
                org.telegram.ui.Components.u9 u9Var2 = b81Var.F;
                if (u9Var2 != null && u9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.O;
                    paint3.setAlpha((int) (b81Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public y3(b81 b81Var, Context context) {
        super(context, null);
        this.P = b81Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    public y3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}

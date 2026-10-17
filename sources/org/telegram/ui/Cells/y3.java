package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ty0;
import org.telegram.ui.z71;
public final class y3 extends RadialProgressView {
    public final int K = 0;
    public final Paint L;
    public final Object M;

    public y3(d4 d4Var, Context context) {
        super(context, null);
        this.M = d4Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.K) {
            case 0:
                d4 d4Var = (d4) this.M;
                org.telegram.ui.Components.w9 w9Var = d4Var.f22122b;
                if (w9Var.getImageReceiver().hasNotThumb() && w9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.f22133x.setProgressColor(i0.b.o(-1, (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                ty0 ty0Var = profileActivity.f33606f0;
                if (ty0Var != null && ty0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f33606f0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                z71 z71Var = (z71) this.M;
                org.telegram.ui.Components.w9 w9Var2 = z71Var.F;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (z71Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public y3(z71 z71Var, Context context) {
        super(context, null);
        this.M = z71Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    public y3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.M = profileActivity;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i91;
import org.telegram.ui.pz0;
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
                org.telegram.ui.Components.x9 x9Var = d4Var.f21730b;
                if (x9Var.getImageReceiver().hasNotThumb() && x9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (x9Var.getAlpha() * x9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.f21742x.setProgressColor(i0.a.k(-1, (int) (x9Var.getAlpha() * x9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                pz0 pz0Var = profileActivity.f33887e0;
                if (pz0Var != null && pz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f33887e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                i91 i91Var = (i91) this.M;
                org.telegram.ui.Components.x9 x9Var2 = i91Var.F;
                if (x9Var2 != null && x9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (i91Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public y3(i91 i91Var, Context context) {
        super(context, null);
        this.M = i91Var;
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

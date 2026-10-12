package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o91;
import org.telegram.ui.vz0;
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
                org.telegram.ui.Components.z9 z9Var = e4Var.f21099b;
                if (z9Var.getImageReceiver().hasNotThumb() && z9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (z9Var.getAlpha() * z9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.f21110x.setProgressColor(i0.a.k(-1, (int) (z9Var.getAlpha() * z9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                vz0 vz0Var = profileActivity.f32558e0;
                if (vz0Var != null && vz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f32558e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                o91 o91Var = (o91) this.M;
                org.telegram.ui.Components.z9 z9Var2 = o91Var.F;
                if (z9Var2 != null && z9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (o91Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public z3(o91 o91Var, Context context) {
        super(context, null);
        this.M = o91Var;
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

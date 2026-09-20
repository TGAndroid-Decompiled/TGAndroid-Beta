package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i91;
import org.telegram.ui.oz0;
public final class a4 extends RadialProgressView {
    public final int K = 0;
    public final Paint L;
    public final Object M;

    public a4(f4 f4Var, Context context) {
        super(context, null);
        this.M = f4Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.K) {
            case 0:
                f4 f4Var = (f4) this.M;
                org.telegram.ui.Components.v9 v9Var = f4Var.f20273b;
                if (v9Var.getImageReceiver().hasNotThumb() && v9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (v9Var.getAlpha() * v9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.f20284x.setProgressColor(i0.a.k(-1, (int) (v9Var.getAlpha() * v9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                oz0 oz0Var = profileActivity.f31552e0;
                if (oz0Var != null && oz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f31552e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                i91 i91Var = (i91) this.M;
                org.telegram.ui.Components.v9 v9Var2 = i91Var.F;
                if (v9Var2 != null && v9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (i91Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public a4(i91 i91Var, Context context) {
        super(context, null);
        this.M = i91Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    public a4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.M = profileActivity;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }
}

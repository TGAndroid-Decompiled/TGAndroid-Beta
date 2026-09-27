package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.hz0;
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
                org.telegram.ui.Components.w9 w9Var = e4Var.f20229b;
                if (w9Var.getImageReceiver().hasNotThumb() && w9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.f20240x.setProgressColor(i0.a.k(-1, (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                hz0 hz0Var = profileActivity.f31556e0;
                if (hz0Var != null && hz0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.L;
                    paint2.setAlpha((int) (profileActivity.f31556e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                a91 a91Var = (a91) this.M;
                org.telegram.ui.Components.w9 w9Var2 = a91Var.F;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.L;
                    paint3.setAlpha((int) (a91Var.F.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public z3(a91 a91Var, Context context) {
        super(context, null);
        this.M = a91Var;
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

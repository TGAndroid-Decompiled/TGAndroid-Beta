package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d81;
import org.telegram.ui.yy0;
public final class d4 extends RadialProgressView {
    public final int N = 0;
    public final Paint O;
    public final Object P;

    public d4(i4 i4Var, Context context) {
        super(context, null);
        this.P = i4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                i4 i4Var = (i4) this.P;
                org.telegram.ui.Components.y9 y9Var = i4Var.f24221b;
                if (y9Var.getImageReceiver().hasNotThumb() && y9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (y9Var.getAlpha() * y9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                i4Var.f24233x.setProgressColor(i0.a.o(-1, (int) (y9Var.getAlpha() * y9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                yy0 yy0Var = profileActivity.f35975e0;
                if (yy0Var != null && yy0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.O;
                    paint2.setAlpha((int) (profileActivity.f35975e0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                d81 d81Var = (d81) this.P;
                org.telegram.ui.Components.y9 y9Var2 = d81Var.G;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.O;
                    paint3.setAlpha((int) (d81Var.G.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public d4(d81 d81Var, Context context) {
        super(context, null);
        this.P = d81Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    public d4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}

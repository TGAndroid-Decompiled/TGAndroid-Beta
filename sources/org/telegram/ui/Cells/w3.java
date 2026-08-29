package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.ly0;
public final class w3 extends RadialProgressView {
    public final int G = 0;
    public final Paint H;
    public final Object I;

    public w3(c4 c4Var, Context context) {
        super(context, null);
        this.I = c4Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                c4 c4Var = (c4) this.I;
                org.telegram.ui.Components.t9 t9Var = c4Var.f24154b;
                if (t9Var.getImageReceiver().hasNotThumb() && t9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (t9Var.getAlpha() * t9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.H;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                c4Var.f24162x.setProgressColor(i0.a.k(-1, (int) (t9Var.getAlpha() * t9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.I;
                ly0 ly0Var = profileActivity.f35985a0;
                if (ly0Var != null && ly0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.H;
                    paint2.setAlpha((int) (profileActivity.f35985a0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                b81 b81Var = (b81) this.I;
                org.telegram.ui.Components.t9 t9Var2 = b81Var.B;
                if (t9Var2 != null && t9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.H;
                    paint3.setAlpha((int) (b81Var.B.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public w3(b81 b81Var, Context context) {
        super(context, null);
        this.I = b81Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    public w3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.I = profileActivity;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }
}

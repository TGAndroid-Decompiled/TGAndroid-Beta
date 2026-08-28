package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ly0;
import org.telegram.ui.z71;
public final class z3 extends RadialProgressView {
    public final int G = 0;
    public final Paint H;
    public final Object I;

    public z3(e4 e4Var, Context context) {
        super(context, null);
        this.I = e4Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                e4 e4Var = (e4) this.I;
                org.telegram.ui.Components.o9 o9Var = e4Var.f24290b;
                if (o9Var.getImageReceiver().hasNotThumb() && o9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (o9Var.getAlpha() * o9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.H;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.f24298x.setProgressColor(i0.a.k(-1, (int) (o9Var.getAlpha() * o9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.I;
                ly0 ly0Var = profileActivity.f35919a0;
                if (ly0Var != null && ly0Var.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.H;
                    paint2.setAlpha((int) (profileActivity.f35919a0.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                z71 z71Var = (z71) this.I;
                org.telegram.ui.Components.o9 o9Var2 = z71Var.B;
                if (o9Var2 != null && o9Var2.getImageReceiver().hasNotThumb()) {
                    Paint paint3 = this.H;
                    paint3.setAlpha((int) (z71Var.B.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public z3(z71 z71Var, Context context) {
        super(context, null);
        this.I = z71Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    public z3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.I = profileActivity;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }
}

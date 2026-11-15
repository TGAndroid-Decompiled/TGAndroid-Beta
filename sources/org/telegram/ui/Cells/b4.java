package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k31;
import org.telegram.ui.xu0;
public final class b4 extends RadialProgressView {
    public final int O = 0;
    public final Paint P;
    public final Object Q;

    public b4(f4 f4Var, Context context) {
        super(context, null);
        this.Q = f4Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.O) {
            case 0:
                f4 f4Var = (f4) this.Q;
                org.telegram.ui.Components.i9 i9Var = f4Var.f30217b;
                if (i9Var.getImageReceiver().L() && i9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (i9Var.getAlpha() * i9Var.getImageReceiver().f22278i1 * 85.0f);
                    Paint paint = this.P;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.f30232y.setProgressColor(i0.a.o(-1, (int) (i9Var.getAlpha() * i9Var.getImageReceiver().f22278i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.Q;
                xu0 xu0Var = profileActivity.f43101f0;
                if (xu0Var != null && xu0Var.getImageReceiver().L()) {
                    Paint paint2 = this.P;
                    paint2.setAlpha((int) (profileActivity.f43101f0.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                k31 k31Var = (k31) this.Q;
                org.telegram.ui.Components.i9 i9Var2 = k31Var.H;
                if (i9Var2 != null && i9Var2.getImageReceiver().L()) {
                    Paint paint3 = this.P;
                    paint3.setAlpha((int) (k31Var.H.getImageReceiver().f22278i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public b4(k31 k31Var, Context context) {
        super(context, null);
        this.Q = k31Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    public b4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}

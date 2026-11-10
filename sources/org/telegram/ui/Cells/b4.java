package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.o31;
public final class b4 extends RadialProgressView {
    public final int N = 0;
    public final Paint O;
    public final Object P;

    public b4(f4 f4Var, Context context) {
        super(context, null);
        this.P = f4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                f4 f4Var = (f4) this.P;
                org.telegram.ui.Components.k9 k9Var = f4Var.f29118b;
                if (k9Var.getImageReceiver().L() && k9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (k9Var.getAlpha() * k9Var.getImageReceiver().f21202h1 * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.f29132y.setProgressColor(i0.a.o(-1, (int) (k9Var.getAlpha() * k9Var.getImageReceiver().f21202h1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                cv0 cv0Var = profileActivity.f41720e0;
                if (cv0Var != null && cv0Var.getImageReceiver().L()) {
                    Paint paint2 = this.O;
                    paint2.setAlpha((int) (profileActivity.f41720e0.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                o31 o31Var = (o31) this.P;
                org.telegram.ui.Components.k9 k9Var2 = o31Var.G;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    Paint paint3 = this.O;
                    paint3.setAlpha((int) (o31Var.G.getImageReceiver().f21202h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public b4(o31 o31Var, Context context) {
        super(context, null);
        this.P = o31Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    public b4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}

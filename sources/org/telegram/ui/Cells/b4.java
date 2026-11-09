package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bv0;
import org.telegram.ui.n31;
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
                org.telegram.ui.Components.l9 l9Var = f4Var.f29107b;
                if (l9Var.getImageReceiver().L() && l9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (l9Var.getAlpha() * l9Var.getImageReceiver().f21197h1 * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.f29121y.setProgressColor(i0.a.o(-1, (int) (l9Var.getAlpha() * l9Var.getImageReceiver().f21197h1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                bv0 bv0Var = profileActivity.f41729e0;
                if (bv0Var != null && bv0Var.getImageReceiver().L()) {
                    Paint paint2 = this.O;
                    paint2.setAlpha((int) (profileActivity.f41729e0.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                n31 n31Var = (n31) this.P;
                org.telegram.ui.Components.l9 l9Var2 = n31Var.G;
                if (l9Var2 != null && l9Var2.getImageReceiver().L()) {
                    Paint paint3 = this.O;
                    paint3.setAlpha((int) (n31Var.G.getImageReceiver().f21197h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public b4(n31 n31Var, Context context) {
        super(context, null);
        this.P = n31Var;
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

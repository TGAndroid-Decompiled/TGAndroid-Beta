package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e51;
import org.telegram.ui.jw0;
public final class d4 extends RadialProgressView {
    public final int N = 0;
    public final Paint O;
    public final Object P;

    public d4(h4 h4Var, Context context) {
        super(context, null);
        this.P = h4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                h4 h4Var = (h4) this.P;
                org.telegram.ui.Components.g9 g9Var = h4Var.f21974b;
                if (g9Var.getImageReceiver().L() && g9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (g9Var.getAlpha() * g9Var.getImageReceiver().f14384h1 * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                h4Var.f21987y.setProgressColor(i0.b.o(-1, (int) (g9Var.getAlpha() * g9Var.getImageReceiver().f14384h1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                jw0 jw0Var = profileActivity.f33802e0;
                if (jw0Var != null && jw0Var.getImageReceiver().L()) {
                    Paint paint2 = this.O;
                    paint2.setAlpha((int) (profileActivity.f33802e0.getImageReceiver().f14384h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                return;
            default:
                e51 e51Var = (e51) this.P;
                org.telegram.ui.Components.g9 g9Var2 = e51Var.G;
                if (g9Var2 != null && g9Var2.getImageReceiver().L()) {
                    Paint paint3 = this.O;
                    paint3.setAlpha((int) (e51Var.G.getImageReceiver().f14384h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public d4(e51 e51Var, Context context) {
        super(context, null);
        this.P = e51Var;
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

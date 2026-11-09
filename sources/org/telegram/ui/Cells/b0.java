package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ny0;
public final class b0 extends Drawable {
    public final RectF f28916a = new RectF();
    public final int f28917b;
    public final org.telegram.ui.ActionBar.g6 f28918c;
    public final ny0 d;
    public final ny0 f28919e;
    public final Drawable f28920f;
    public final Drawable f28921g;
    public int h;
    public int f28922i;
    public final Paint f28923j;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.f28923j = paint;
        this.f28917b = i7;
        this.f28918c = g6Var;
        ny0 ny0Var = new ny0(id.M0(2131753068, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = ny0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ny0Var.a();
        ny0 ny0Var2 = new ny0("", 13.0f, null);
        this.f28919e = ny0Var2;
        ny0Var2.m(4);
        ny0Var2.a();
        Drawable mutate = context.getResources().getDrawable(2131231177).mutate();
        this.f28920f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(2131230871).mutate();
        this.f28921g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean d12;
        org.telegram.ui.ActionBar.g6 g6Var = this.f28918c;
        Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintChatActionBackground", g6Var);
        RectF rectF = this.f28916a;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), W0);
        if (g6Var != null) {
            d12 = g6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.l6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.l6.W0("paintChatActionBackgroundDarken", g6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.f28923j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L = org.telegram.messenger.g0.L(15.0f);
        Drawable drawable = this.f28920f;
        drawable.setBounds(centerX, L, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        ny0 ny0Var = this.d;
        this.d.c(centerX2 - (ny0Var.k() / 2.0f), ny0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ny0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        ny0 ny0Var2 = this.f28919e;
        this.f28919e.c(centerX3 - (ny0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ny0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f));
        int L2 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable2 = this.f28921g;
        drawable2.setBounds((int) (rectF.centerX() - org.telegram.messenger.g0.L(10.0f)), 0, centerX4, L2);
        drawable2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f28916a.set(rect);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
public final class l extends FrameLayout {
    public final org.telegram.ui.Components.g6 f29517a;
    public final Paint f29518b;
    public final cg.p f29519c;
    public final Drawable d;
    public final int f29520e;
    public int f29521f;

    public l(Context context, int i3) {
        super(context);
        Paint paint = new Paint(1);
        this.f29518b = paint;
        this.f29519c = new cg.p(new ca(this, 1));
        this.f29520e = i3;
        this.d = k2.p1.g(context, 2131231117);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f29517a = g6Var;
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.u(-1);
        g6Var.f33983b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i3) {
        this.f29521f = i3;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i3 - ConnectionsManager.getInstance(this.f29520e).getCurrentTime());
            this.f29519c.a(max);
            b(max);
        }
    }

    public final void b(long j10) {
        String h02;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.g6 g6Var = this.f29517a;
        if (i3 == 0) {
            g6Var.t(bd.M0(2131750344, null), true, true);
            return;
        }
        if (j10 > 3600) {
            h02 = org.telegram.messenger.g0.g0((int) j10, false, false);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j10, false);
        }
        g6Var.t(h02, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f);
        org.telegram.ui.Components.g6 g6Var = this.f29517a;
        int c2 = measuredWidth - ((int) g6Var.c());
        int L = c2 - org.telegram.messenger.g0.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f29518b);
        canvas.restore();
        g6Var.setBounds(c2, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        g6Var.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(-22.0f) + c2;
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int L4 = org.telegram.messenger.g0.L(-4.0f) + c2;
        int L5 = org.telegram.messenger.g0.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f29521f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29519c.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29517a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

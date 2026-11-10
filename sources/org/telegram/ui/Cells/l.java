package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
import org.telegram.tgnet.ConnectionsManager;
public final class l extends FrameLayout {
    public final org.telegram.ui.Components.h6 f29475a;
    public final Paint f29476b;
    public final bg.q f29477c;
    public final Drawable d;
    public final int f29478e;
    public int f29479f;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.f29476b = paint;
        this.f29477c = new bg.q(new ca(this, 1));
        this.f29478e = i7;
        this.d = jg.g.h(context, 2131231117);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, false, false);
        this.f29475a = h6Var;
        h6Var.M = org.telegram.messenger.g0.f22567q.x;
        h6Var.setCallback(this);
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.u(-1);
        h6Var.f34187b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i7) {
        this.f29479f = i7;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.f29478e).getCurrentTime());
            this.f29477c.a(max);
            b(max);
        }
    }

    public final void b(long j3) {
        String h02;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.h6 h6Var = this.f29475a;
        if (i7 == 0) {
            h6Var.t(id.M0(2131750336, null), true, true);
            return;
        }
        if (j3 > 3600) {
            h02 = org.telegram.messenger.g0.g0((int) j3, false, false);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j3, false);
        }
        h6Var.t(h02, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f);
        org.telegram.ui.Components.h6 h6Var = this.f29475a;
        int c10 = measuredWidth - ((int) h6Var.c());
        int L = c10 - org.telegram.messenger.g0.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f29476b);
        canvas.restore();
        h6Var.setBounds(c10, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        h6Var.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(-22.0f) + c10;
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int L4 = org.telegram.messenger.g0.L(-4.0f) + c10;
        int L5 = org.telegram.messenger.g0.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f29479f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29477c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29475a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.tgnet.ConnectionsManager;
public final class k extends FrameLayout {
    public final org.telegram.ui.Components.e6 f22099a;
    public final Paint f22100b;
    public final rf.m f22101c;
    public final Drawable d;
    public final int e;
    public int f22102f;

    public k(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f22100b = paint;
        this.f22101c = new rf.m(new ca(this, 1));
        this.e = i10;
        this.d = i0.a.f(context, 2131231117);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.f22099a = e6Var;
        e6Var.M = org.telegram.messenger.i0.f16026q.x;
        e6Var.setCallback(this);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.u(-1);
        e6Var.f25695b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f22102f = i10;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.f22101c.a(max);
            b(max);
        }
    }

    public final void b(long j10) {
        String h02;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.e6 e6Var = this.f22099a;
        if (i10 == 0) {
            e6Var.t(cd.L0(2131750345, null), true, true);
            return;
        }
        if (j10 > 3600) {
            h02 = org.telegram.messenger.i0.g0((int) j10, false, false);
        } else {
            h02 = org.telegram.messenger.i0.h0((int) j10, false);
        }
        e6Var.t(h02, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(14.0f);
        org.telegram.ui.Components.e6 e6Var = this.f22099a;
        int c10 = measuredWidth - ((int) e6Var.c());
        int L = c10 - org.telegram.messenger.i0.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.f22100b);
        canvas.restore();
        e6Var.setBounds(c10, 0, getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f));
        e6Var.draw(canvas);
        int L2 = org.telegram.messenger.i0.L(-22.0f) + c10;
        int L3 = org.telegram.messenger.i0.L(5.0f);
        int L4 = org.telegram.messenger.i0.L(-4.0f) + c10;
        int L5 = org.telegram.messenger.i0.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f22102f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22101c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(172), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22099a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

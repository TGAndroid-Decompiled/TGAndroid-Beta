package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o70 extends q71 {
    public float f29107f;
    public float h;
    public final Paint f29108n;
    public float f29109r;
    public m.g3 f29110s;
    public final x70 v;

    public o70(x70 x70Var, Context context) {
        super(x70Var, context);
        this.v = x70Var;
        this.f29108n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        x70 x70Var = this.v;
        int i11 = x70Var.f30410y;
        i10 = ((org.telegram.ui.ActionBar.h3) x70Var).backgroundPaddingTop;
        x70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = x70Var.f32464o0 + x70Var.f32470u0;
        wx0 wx0Var = x70Var.f30407s;
        if (wx0Var.getVisibility() != 0) {
            this.f29107f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f29109r = (f7 - this.f29107f) * 0.10666667f;
        }
        float f10 = this.f29107f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f29109r;
            float f13 = f10 + f12;
            this.f29107f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f29107f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f29107f = f11;
            } else {
                invalidate();
            }
        }
        wx0Var.setTranslationY(x70Var.f30410y + this.f29107f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x70 x70Var = this.v;
        if (view == x70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + x70Var.f32461k0 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false), (int) (x70Var.f32458h0 * 255.0f)));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d7, false), (int) (x70Var.f32458h0 * 255.0f));
            Paint paint = this.f29108n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + x70Var.f32461k0, getMeasuredWidth(), view.getY() + x70Var.f32461k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.g3 g3Var = this.f29110s;
        if (g3Var != null) {
            ((v71) g3Var.f16265b).f31378b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f32469t0 && this.f29110s == null) {
            this.f29110s = new m.g3(view);
        }
    }
}

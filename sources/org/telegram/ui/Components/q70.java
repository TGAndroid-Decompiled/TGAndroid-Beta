package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q70 extends a81 {
    public float f31816f;
    public float h;
    public final Paint f31817n;
    public float f31818r;
    public k6.c f31819s;
    public final z70 v;

    public q70(z70 z70Var, Context context) {
        super(z70Var, context);
        this.v = z70Var;
        this.f31817n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        z70 z70Var = this.v;
        int i11 = z70Var.f27099y;
        i10 = ((org.telegram.ui.ActionBar.k3) z70Var).backgroundPaddingTop;
        z70Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = z70Var.f35274o0 + z70Var.f35280u0;
        fy0 fy0Var = z70Var.f27096s;
        if (fy0Var.getVisibility() != 0) {
            this.f31816f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f31818r = (f7 - this.f31816f) * 0.10666667f;
        }
        float f10 = this.f31816f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f31818r;
            float f13 = f10 + f12;
            this.f31816f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f31816f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f31816f = f11;
            } else {
                invalidate();
            }
        }
        fy0Var.setTranslationY(z70Var.f27099y + this.f31816f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z70 z70Var = this.v;
        if (view == z70Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + z70Var.f35271k0 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false), (int) (z70Var.f35268h0 * 255.0f)));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23358d7, false), (int) (z70Var.f35268h0 * 255.0f));
            Paint paint = this.f31817n;
            paint.setColor(o10);
            canvas.drawRect(0.0f, view.getY() + z70Var.f35271k0, getMeasuredWidth(), view.getY() + z70Var.f35271k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k6.c cVar = this.f31819s;
        if (cVar != null) {
            ((f81) cVar.f16405b).f28048b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f35279t0 && this.f31819s == null) {
            this.f31819s = new k6.c(view);
        }
    }
}

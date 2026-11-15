package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tv extends FrameLayout {
    public final boolean f39812a;
    public final ly f39813b;

    public tv(ly lyVar, Context context, boolean z10) {
        super(context);
        this.f39813b = lyVar;
        this.f39812a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.f39813b;
        zv zvVar = lyVar.C0;
        vv vvVar = lyVar.E0;
        yv yvVar = lyVar.H0;
        if (!this.f39812a && (view == vvVar || view == yvVar)) {
            canvas.save();
            float y10 = zvVar.getY() + zvVar.getMeasuredHeight() + 1.0f;
            if (view == vvVar) {
                y10 = Math.max(y10, yvVar.getY() + yvVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * lyVar.f36928a.f57085e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ly lyVar = this.f39813b;
        lyVar.L0 = true;
        lyVar.Z();
        jg.d1 d1Var = lyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ly lyVar = this.f39813b;
        lyVar.L0 = false;
        lyVar.Z();
        jg.d1 d1Var = lyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}

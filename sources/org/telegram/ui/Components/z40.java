package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class z40 extends e50 {
    public ImageReceiver f42677a;
    public float f42678b;
    public final b50 f42679c;

    public z40(b50 b50Var, Context context) {
        super(context);
        this.f42679c = b50Var;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b50 b50Var = this.f42679c;
        FrameLayout frameLayout = b50Var.f33764x;
        uk0 uk0Var = b50Var.f33762w;
        y40 y40Var = b50Var.f33766y;
        super.dispatchDraw(canvas);
        if (this.f42677a == null) {
            return;
        }
        float f10 = this.f42678b;
        if (f10 < 1.0f) {
            this.f42678b = Math.min(1.0f, f10 + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(y40Var.getLeft() + frameLayout.getLeft() + uk0Var.getLeft(), y40Var.getTop() + frameLayout.getTop() + uk0Var.getTop());
        if (this.f42677a.N0 != y40Var.getWidth()) {
            float width = y40Var.getWidth() / this.f42677a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.f42677a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.f42677a.getAlpha();
        this.f42677a.setAlpha(this.f42678b);
        this.f42677a.h(canvas, null);
        this.f42677a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.f42677a == null) {
            this.f42678b = 0.0f;
        }
        this.f42677a = imageReceiver;
        invalidate();
    }
}

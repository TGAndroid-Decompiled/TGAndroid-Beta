package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class pg extends fh0 {
    public final u5 E;
    public final mg F;
    public ng f38296r;
    public og f38297s;
    public final int f38298w;
    public boolean f38299x;
    public Drawable f38300y;

    public pg(Context context, int i7) {
        super(context);
        this.E = new u5(this, 0L, 320L, er.h);
        this.F = new mg(this, 0);
        this.f38298w = i7;
    }

    public ng getCurrentState() {
        return this.f38296r;
    }

    public final void j(org.telegram.ui.Components.ng r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg.j(org.telegram.ui.Components.ng, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.f38299x);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (d < 1.0f) {
            if (d > 0.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(z10, z10, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            if (this.f38300y == null) {
                this.f38300y = getContext().getResources().getDrawable(2131232117).mutate();
            }
            int intrinsicWidth = this.f38300y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f38300y.getIntrinsicHeight() / 2;
            int i7 = (int) width;
            int i10 = (int) height;
            this.f38300y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.f38300y.setColorFilter(getColorFilter());
            this.f38300y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f38300y.draw(canvas2);
            canvas2.restore();
        }
    }

    public pg(Context context) {
        this(context, 32);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class ah extends rh0 {
    public final d6 E;
    public final xg F;
    public yg f33517r;
    public zg f33518s;
    public final int f33519w;
    public boolean f33520x;
    public Drawable f33521y;

    public ah(Context context, int i7) {
        super(context);
        this.E = new d6(this, 0L, 320L, nr.h);
        this.F = new xg(this, 0);
        this.f33519w = i7;
    }

    public yg getCurrentState() {
        return this.f33517r;
    }

    public final void j(org.telegram.ui.Components.yg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ah.j(org.telegram.ui.Components.yg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.f33520x);
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
            if (this.f33521y == null) {
                this.f33521y = getContext().getResources().getDrawable(2131232118).mutate();
            }
            int intrinsicWidth = this.f33521y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f33521y.getIntrinsicHeight() / 2;
            int i7 = (int) width;
            int i10 = (int) height;
            this.f33521y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.f33521y.setColorFilter(getColorFilter());
            this.f33521y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f33521y.draw(canvas2);
            canvas2.restore();
        }
    }

    public ah(Context context) {
        this(context, 32);
    }
}

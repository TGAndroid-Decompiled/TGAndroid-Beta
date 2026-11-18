package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class yg extends ph0 {
    public final c6 E;
    public final vg F;
    public wg f42485r;
    public xg f42486s;
    public final int f42487w;
    public boolean f42488x;
    public Drawable f42489y;

    public yg(Context context, int i7) {
        super(context);
        this.E = new c6(this, 0L, 320L, lr.h);
        this.F = new vg(this, 0);
        this.f42487w = i7;
    }

    public wg getCurrentState() {
        return this.f42485r;
    }

    public final void j(org.telegram.ui.Components.wg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yg.j(org.telegram.ui.Components.wg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.f42488x);
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
            if (this.f42489y == null) {
                this.f42489y = getContext().getResources().getDrawable(2131232118).mutate();
            }
            int intrinsicWidth = this.f42489y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f42489y.getIntrinsicHeight() / 2;
            int i7 = (int) width;
            int i10 = (int) height;
            this.f42489y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.f42489y.setColorFilter(getColorFilter());
            this.f42489y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f42489y.draw(canvas2);
            canvas2.restore();
        }
    }

    public yg(Context context) {
        this(context, 32);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class zg extends qh0 {
    public final c6 E;
    public final wg F;
    public xg f42847r;
    public yg f42848s;
    public final int f42849w;
    public boolean f42850x;
    public Drawable f42851y;

    public zg(Context context, int i7) {
        super(context);
        this.E = new c6(this, 0L, 320L, kr.h);
        this.F = new wg(this, 0);
        this.f42849w = i7;
    }

    public xg getCurrentState() {
        return this.f42847r;
    }

    public final void j(org.telegram.ui.Components.xg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg.j(org.telegram.ui.Components.xg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.f42850x);
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
            if (this.f42851y == null) {
                this.f42851y = getContext().getResources().getDrawable(2131232121).mutate();
            }
            int intrinsicWidth = this.f42851y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f42851y.getIntrinsicHeight() / 2;
            int i7 = (int) width;
            int i10 = (int) height;
            this.f42851y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.f42851y.setColorFilter(getColorFilter());
            this.f42851y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f42851y.draw(canvas2);
            canvas2.restore();
        }
    }

    public zg(Context context) {
        this(context, 32);
    }
}

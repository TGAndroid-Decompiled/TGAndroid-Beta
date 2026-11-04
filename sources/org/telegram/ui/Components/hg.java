package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class hg extends fh0 {
    public final u5 E;
    public final eg F;
    public fg f34381r;
    public gg f34382s;
    public final int f34383w;
    public boolean f34384x;
    public Drawable f34385y;

    public hg(Context context, int i3) {
        super(context);
        this.E = new u5(this, 0L, 320L, xq.h);
        this.F = new eg(this, 0);
        this.f34383w = i3;
    }

    public fg getCurrentState() {
        return this.f34381r;
    }

    public final void j(org.telegram.ui.Components.fg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg.j(org.telegram.ui.Components.fg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.f34384x);
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
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(y9, y9, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            if (this.f34385y == null) {
                this.f34385y = getContext().getResources().getDrawable(2131232116).mutate();
            }
            int intrinsicWidth = this.f34385y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f34385y.getIntrinsicHeight() / 2;
            int i3 = (int) width;
            int i10 = (int) height;
            this.f34385y.setBounds(i3 - intrinsicWidth, i10 - intrinsicHeight, i3 + intrinsicWidth, i10 + intrinsicHeight);
            this.f34385y.setColorFilter(getColorFilter());
            this.f34385y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f34385y.draw(canvas2);
            canvas2.restore();
        }
    }

    public hg(Context context) {
        this(context, 32);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class ig extends ch0 {
    public final v5 D;
    public final fg E;
    public gg f34615r;
    public hg f34616s;
    public final int f34617w;
    public boolean f34618x;
    public Drawable f34619y;

    public ig(Context context, int i7) {
        super(context);
        this.D = new v5(this, 0L, 320L, wq.h);
        this.E = new fg(this, 0);
        this.f34617w = i7;
    }

    public gg getCurrentState() {
        return this.f34615r;
    }

    public final void j(org.telegram.ui.Components.gg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig.j(org.telegram.ui.Components.gg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.D.d(this.f34618x);
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
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(z9, z9, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            if (this.f34619y == null) {
                this.f34619y = getContext().getResources().getDrawable(2131232116).mutate();
            }
            int intrinsicWidth = this.f34619y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f34619y.getIntrinsicHeight() / 2;
            int i7 = (int) width;
            int i10 = (int) height;
            this.f34619y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.f34619y.setColorFilter(getColorFilter());
            this.f34619y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.f34619y.draw(canvas2);
            canvas2.restore();
        }
    }

    public ig(Context context) {
        this(context, 32);
    }
}

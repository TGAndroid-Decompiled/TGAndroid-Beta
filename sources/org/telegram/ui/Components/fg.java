package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public class fg extends fi0 {
    public final t5 D;
    public final cg E;
    public dg f26153r;
    public eg f26154s;
    public final int f26155w;
    public boolean f26156x;
    public Drawable f26157y;

    public fg(Context context, int i10) {
        super(context);
        this.D = new t5(this, 0L, 320L, gr.h);
        this.E = new cg(this, 0);
        this.f26155w = i10;
    }

    public dg getCurrentState() {
        return this.f26153r;
    }

    public final void j(org.telegram.ui.Components.dg r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg.j(org.telegram.ui.Components.dg, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.D.d(this.f26156x);
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
            float z10 = c3.i0.z(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(z10, z10, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            if (this.f26157y == null) {
                this.f26157y = getContext().getResources().getDrawable(2131232115).mutate();
            }
            int intrinsicWidth = this.f26157y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f26157y.getIntrinsicHeight() / 2;
            int i10 = (int) width;
            int i11 = (int) height;
            this.f26157y.setBounds(i10 - intrinsicWidth, i11 - intrinsicHeight, i10 + intrinsicWidth, i11 + intrinsicHeight);
            this.f26157y.setColorFilter(getColorFilter());
            this.f26157y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f7 = (d * 0.6f) + 0.4f;
            canvas2.scale(f7, f7, width, height);
            this.f26157y.draw(canvas2);
            canvas2.restore();
        }
    }

    public fg(Context context) {
        this(context, 32);
    }
}

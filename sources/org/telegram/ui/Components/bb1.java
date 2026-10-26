package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class bb1 extends cb1 {
    public final Picture e;
    public boolean f26819f;

    public bb1(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f26819f = true;
        return this.e.beginRecording(Math.max(1, this.f27112c - this.f27110a), Math.max(1, this.d - this.f27111b));
    }

    @Override
    public final boolean b(Canvas canvas) {
        return true;
    }

    @Override
    public final void c() {
        if (this.f26819f) {
            e();
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        Canvas canvas2;
        int save;
        if (!this.f26819f && f7 > 0.0f) {
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            int i11 = this.f27111b;
            int i12 = this.f27110a;
            if (i10 < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i12, i11, this.f27112c, this.d, Math.round(f7 * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i12, i11);
            canvas2.drawPicture(this.e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void e() {
        this.e.endRecording();
        this.f26819f = false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}

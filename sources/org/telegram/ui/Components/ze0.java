package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class ze0 extends Path {
    public int f29653a;
    public int f29654b;
    public int f29655c;

    public final void a(int i10, int i11, int i12) {
        if (this.f29653a == i10 && this.f29654b == i11 && this.f29655c == i12) {
            return;
        }
        rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = i10 - i12;
        float f10 = i11 + i12;
        rectF.set(f7, i11 - i12, i10 + i12, f10);
        arcTo(rectF, -180.0f, 270.0f, false);
        float f11 = i12 / 81.0f;
        float f12 = i10;
        float f13 = f10 - (3.0f * f11);
        cubicTo(f12 - (13.0f * f11), f10, f12 - (25.0f * f11), f13, f12 - (36.0f * f11), f10 - (8.42f * f11));
        float f14 = f10 - f11;
        cubicTo(f12 - (52.0f * f11), f14, f12 - (56.5f * f11), f14, f12 - (78.02f * f11), f14);
        cubicTo(f12 - (80.0f * f11), f14, f12 - (81.0f * f11), f13, f12 - (79.52f * f11), f10 - (4.5f * f11));
        float f15 = f12 - (63.73f * f11);
        cubicTo(f12 - (78.0f * f11), f10 - (6.0f * f11), f15, f10 - (15.0f * f11), f15, f10 - (31.0f * f11));
        float f16 = i11;
        cubicTo(f12 - (74.5f * f11), f10 - (44.75f * f11), f7, (f11 * 18.87f) + f16, f7, f16);
        close();
        this.f29653a = i10;
        this.f29654b = i11;
        this.f29655c = i12;
    }
}

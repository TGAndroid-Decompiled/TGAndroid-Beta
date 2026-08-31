package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class ve0 extends Path {
    public int f31894a;
    public int f31895b;
    public int f31896c;

    public final void a(int i10, int i11, int i12) {
        if (this.f31894a == i10 && this.f31895b == i11 && this.f31896c == i12) {
            return;
        }
        rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = i10 - i12;
        float f11 = i11 + i12;
        rectF.set(f10, i11 - i12, i10 + i12, f11);
        arcTo(rectF, -180.0f, 270.0f, false);
        float f12 = i12 / 81.0f;
        float f13 = i10;
        float f14 = f11 - (3.0f * f12);
        cubicTo(f13 - (13.0f * f12), f11, f13 - (25.0f * f12), f14, f13 - (36.0f * f12), f11 - (8.42f * f12));
        float f15 = f11 - f12;
        cubicTo(f13 - (52.0f * f12), f15, f13 - (56.5f * f12), f15, f13 - (78.02f * f12), f15);
        cubicTo(f13 - (80.0f * f12), f15, f13 - (81.0f * f12), f14, f13 - (79.52f * f12), f11 - (4.5f * f12));
        float f16 = f13 - (63.73f * f12);
        cubicTo(f13 - (78.0f * f12), f11 - (6.0f * f12), f16, f11 - (15.0f * f12), f16, f11 - (31.0f * f12));
        float f17 = i11;
        cubicTo(f13 - (74.5f * f12), f11 - (44.75f * f12), f10, (f12 * 18.87f) + f17, f10, f17);
        close();
        this.f31894a = i10;
        this.f31895b = i11;
        this.f31896c = i12;
    }
}

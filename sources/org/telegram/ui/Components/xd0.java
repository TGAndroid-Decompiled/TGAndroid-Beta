package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class xd0 extends Path {
    public int f34662a;
    public int f34663b;
    public int f34664c;

    public final void a(int i9, int i10, int i11) {
        if (this.f34662a == i9 && this.f34663b == i10 && this.f34664c == i11) {
            return;
        }
        rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = i9 - i11;
        float f11 = i10 + i11;
        rectF.set(f10, i10 - i11, i9 + i11, f11);
        arcTo(rectF, -180.0f, 270.0f, false);
        float f12 = i11 / 81.0f;
        float f13 = i9;
        float f14 = f11 - (3.0f * f12);
        cubicTo(f13 - (13.0f * f12), f11, f13 - (25.0f * f12), f14, f13 - (36.0f * f12), f11 - (8.42f * f12));
        float f15 = f11 - f12;
        cubicTo(f13 - (52.0f * f12), f15, f13 - (56.5f * f12), f15, f13 - (78.02f * f12), f15);
        cubicTo(f13 - (80.0f * f12), f15, f13 - (81.0f * f12), f14, f13 - (79.52f * f12), f11 - (4.5f * f12));
        float f16 = f13 - (63.73f * f12);
        cubicTo(f13 - (78.0f * f12), f11 - (6.0f * f12), f16, f11 - (15.0f * f12), f16, f11 - (31.0f * f12));
        float f17 = i10;
        cubicTo(f13 - (74.5f * f12), f11 - (44.75f * f12), f10, (f12 * 18.87f) + f17, f10, f17);
        close();
        this.f34662a = i9;
        this.f34663b = i10;
        this.f34664c = i11;
    }
}

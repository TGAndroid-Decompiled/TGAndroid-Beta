package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

public final class q9 extends Path {
    public static ArrayList d;

    public float f25084a;

    public ArrayList f25085b;

    public int f25086c;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        ArrayList arrayList = d;
        RectF rectF = (arrayList == null || arrayList.size() <= 0) ? new RectF() : (RectF) d.remove(0);
        rectF.set(f10, f11, f12, f13);
        this.f25085b.add(rectF);
        this.f25086c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f25084a) {
            this.f25084a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f25085b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f25086c = 0;
        this.f25084a = 0.0f;
    }
}

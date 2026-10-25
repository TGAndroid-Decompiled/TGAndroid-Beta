package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class z9 extends Path {
    public static ArrayList d;
    public float f25813a;
    public ArrayList f25814b;
    public int f25815c;

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f7, f10, f11, f12);
        this.f25814b.add(rectF);
        this.f25815c++;
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f25813a) {
            this.f25813a = f12;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f25814b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f25815c = 0;
        this.f25813a = 0.0f;
    }
}

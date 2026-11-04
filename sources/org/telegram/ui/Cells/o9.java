package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class o9 extends Path {
    public static ArrayList d;
    public float f29761a;
    public ArrayList f29762b;
    public int f29763c;

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        RectF rectF;
        ArrayList arrayList = d;
        if (arrayList != null && arrayList.size() > 0) {
            rectF = (RectF) d.remove(0);
        } else {
            rectF = new RectF();
        }
        rectF.set(f10, f11, f12, f13);
        this.f29762b.add(rectF);
        this.f29763c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f29761a) {
            this.f29761a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f29762b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f29763c = 0;
        this.f29761a = 0.0f;
    }
}

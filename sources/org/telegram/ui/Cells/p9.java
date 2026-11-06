package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class p9 extends Path {
    public static ArrayList d;
    public float f29744a;
    public ArrayList f29745b;
    public int f29746c;

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
        this.f29745b.add(rectF);
        this.f29746c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f29744a) {
            this.f29744a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f29745b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f29746c = 0;
        this.f29744a = 0.0f;
    }
}

package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class x9 extends Path {
    public static ArrayList d;
    public float f23744a;
    public ArrayList f23745b;
    public int f23746c;

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
        this.f23745b.add(rectF);
        this.f23746c++;
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f23744a) {
            this.f23744a = f12;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f23745b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f23746c = 0;
        this.f23744a = 0.0f;
    }
}

package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class o9 extends Path {
    public static ArrayList d;
    public float f30822a;
    public ArrayList f30823b;
    public int f30824c;

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
        this.f30823b.add(rectF);
        this.f30824c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f30822a) {
            this.f30822a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f30823b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f30824c = 0;
        this.f30822a = 0.0f;
    }
}

package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class x9 extends Path {
    public static ArrayList d;
    public float f23737a;
    public ArrayList f23738b;
    public int f23739c;

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
        this.f23738b.add(rectF);
        this.f23739c++;
        super.addRect(f7, f10, f11, f12, direction);
        if (f12 > this.f23737a) {
            this.f23737a = f12;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f23738b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f23739c = 0;
        this.f23737a = 0.0f;
    }
}

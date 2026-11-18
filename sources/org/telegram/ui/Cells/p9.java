package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class p9 extends Path {
    public static ArrayList d;
    public float f31252a;
    public ArrayList f31253b;
    public int f31254c;

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
        this.f31253b.add(rectF);
        this.f31254c++;
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.f31252a) {
            this.f31252a = f13;
        }
    }

    @Override
    public final void reset() {
        ArrayList arrayList = this.f31253b;
        super.reset();
        if (d == null) {
            d = new ArrayList(arrayList.size());
        }
        d.addAll(arrayList);
        arrayList.clear();
        this.f31254c = 0;
        this.f31252a = 0.0f;
    }
}
